package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class g3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 rmdir = lVar.getFileSystem().rmdir(str, jSONObject.optBoolean("recursive", false));
        int ordinal = rmdir.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal != 3) {
            if (ordinal == 4) {
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
            }
            if (ordinal != 6) {
                if (ordinal == 7) {
                    return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail directory not empty", new java.lang.Object[0]);
                }
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + rmdir.name(), new java.lang.Object[0]);
            }
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory \"%s\"", str);
    }
}
