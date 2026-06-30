package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class z2 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 isdir = lVar.getFileSystem().isdir(str);
        int ordinal = isdir.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory \"%s\"", str);
            }
            if (ordinal != 8) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + isdir.name(), new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 b0Var = new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        ((java.util.HashMap) b0Var.f81319a).put("result", java.lang.Boolean.valueOf(isdir == com.tencent.mm.plugin.appbrand.appstorage.j1.OK));
        return b0Var;
    }
}
