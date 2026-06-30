package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class w2 extends com.tencent.mm.plugin.appbrand.jsapi.file.n {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(lVar.getFileSystem().access(str) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK ? "ok" : java.lang.String.format("fail no such file or directory \"%s\"", str), new java.lang.Object[0]);
    }
}
