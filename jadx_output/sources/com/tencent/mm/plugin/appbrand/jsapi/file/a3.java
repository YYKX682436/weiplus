package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class a3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir = lVar.getFileSystem().mkdir(str, jSONObject.optBoolean("recursive", false));
        int ordinal = mkdir.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal == 3) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory \"%s\"", str);
        }
        if (ordinal == 4) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
        }
        if (ordinal == 5) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail file already exists \"%s\"", str);
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + mkdir.name(), new java.lang.Object[0]);
    }
}
