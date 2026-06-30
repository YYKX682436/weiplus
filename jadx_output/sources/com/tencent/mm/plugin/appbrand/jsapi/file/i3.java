package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class i3 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 unlink = lVar.getFileSystem().unlink(str);
        int ordinal = unlink.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        }
        if (ordinal == 4) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail permission denied, open \"%s\"", str);
        }
        if (ordinal == 6) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail no such file or directory \"%s\"", str);
        }
        if (ordinal == 9) {
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail operation not permitted, unlink \"%s\"", str);
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail " + unlink.name(), new java.lang.Object[0]);
    }
}
