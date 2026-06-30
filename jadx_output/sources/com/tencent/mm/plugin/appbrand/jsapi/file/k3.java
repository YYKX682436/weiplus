package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class k3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        java.io.InputStream byteArrayInputStream;
        com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var;
        boolean optBoolean = jSONObject.optBoolean("append", false);
        java.lang.String optString = jSONObject.optString("encoding");
        com.tencent.mm.plugin.appbrand.utils.v3.c(lVar.getJsRuntime(), null, jSONObject, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
        java.lang.Object opt = jSONObject.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (opt instanceof java.lang.String) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                a0Var = (com.tencent.mm.plugin.appbrand.jsapi.file.a0) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.file.z.f81145a).get("utf8");
            } else {
                a0Var = (com.tencent.mm.plugin.appbrand.jsapi.file.a0) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.file.z.f81145a).get(optString.toLowerCase());
                if (a0Var == null) {
                    return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail invalid encoding", new java.lang.Object[0]);
                }
            }
            try {
                byteArrayInputStream = new nf.a(a0Var.decode((java.lang.String) opt));
            } catch (java.lang.Exception e17) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + e17.getMessage(), new java.lang.Object[0]);
            }
        } else if (opt instanceof java.nio.ByteBuffer) {
            byteArrayInputStream = new nf.a((java.nio.ByteBuffer) opt);
        } else {
            if (opt != null) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail invalid data", new java.lang.Object[0]);
            }
            if (optBoolean) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
            }
            byteArrayInputStream = new java.io.ByteArrayInputStream(new byte[0]);
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 writeFile = lVar.getFileSystem().writeFile(str, byteArrayInputStream, optBoolean);
        int ordinal = writeFile.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal == 10) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail \"%s\" is not a regular file", str);
        }
        if (ordinal == 15) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail the maximum size of the file storage limit is exceeded", new java.lang.Object[0]);
        }
        if (ordinal == 3) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory, open \"%s\"", str);
        }
        if (ordinal == 4) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
        }
        if (ordinal == 5) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail illegal operation on a directory, open \"%s\"", str);
        }
        if (ordinal == 6) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file \"%s\"", str);
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + writeFile.name(), new java.lang.Object[0]);
    }
}
