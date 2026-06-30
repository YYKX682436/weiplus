package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class d3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var;
        long optLong;
        long j17;
        java.lang.String optString = jSONObject.optString("encoding");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UnitReadFile", "call, path %s, encoding %s", str, optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            a0Var = null;
        } else {
            a0Var = (com.tencent.mm.plugin.appbrand.jsapi.file.a0) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.file.z.f81145a).get(optString.toLowerCase());
            if (a0Var == null) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail invalid encoding", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.a0 a0Var2 = a0Var;
        if (jSONObject.has("position") || jSONObject.has("length")) {
            long optLong2 = jSONObject.optLong("position", 0L);
            optLong = jSONObject.optLong("length", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
            j17 = optLong2;
        } else {
            j17 = Long.MIN_VALUE;
            optLong = Long.MIN_VALUE;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = (j17 == Long.MIN_VALUE || optLong == Long.MIN_VALUE) ? lVar.getFileSystem().readFile(str, b0Var) : lVar.getFileSystem().readFile(str, j17, optLong, b0Var);
        if (readFile == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            java.lang.Object obj = b0Var.f291824a;
            if (a0Var2 != null) {
                obj = a0Var2.a((java.nio.ByteBuffer) obj);
            }
            if (!(obj instanceof java.nio.ByteBuffer)) {
                nf.a.a((java.nio.ByteBuffer) b0Var.f291824a);
            }
            com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var2 = new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
            ((java.util.HashMap) b0Var2.f81319a).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, obj);
            return b0Var2;
        }
        int ordinal = readFile.ordinal();
        if (ordinal == 4) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
        }
        if (ordinal == 6) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file \"%s\"", str);
        }
        switch (ordinal) {
            case 10:
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail \"%s\" is not a regular file", str);
            case 11:
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail the value of \"position\" is out of range", new java.lang.Object[0]);
            case 12:
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail the value of \"length\" is out of range", new java.lang.Object[0]);
            default:
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + readFile.name(), new java.lang.Object[0]);
        }
    }
}
