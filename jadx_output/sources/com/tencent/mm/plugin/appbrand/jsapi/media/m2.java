package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class m2 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.e3 f81935c;

    public m2(com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81935c = e3Var;
        this.f81933a = lVar;
        this.f81934b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String jSONArray;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult) appBrandProxyUIProcessTask$ProcessResult;
        if (this.f81933a.getAppId() != null) {
            com.tencent.mm.plugin.appbrand.m6.a(this.f81933a.getAppId()).f85713f = false;
        }
        if (jsApiChooseImage$ChooseResult == null) {
            this.f81933a.a(this.f81934b, this.f81935c.o("fail"));
            return;
        }
        int i17 = jsApiChooseImage$ChooseResult.f81632d;
        if (i17 != -1) {
            if (i17 != 0) {
                this.f81933a.a(this.f81934b, this.f81935c.o("fail"));
                return;
            } else {
                this.f81933a.a(this.f81934b, this.f81935c.o("cancel"));
                return;
            }
        }
        java.util.ArrayList arrayList = jsApiChooseImage$ChooseResult.f81633e;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "onActivityResult, result list is null or nil");
            this.f81933a.a(this.f81934b, this.f81935c.o("fail"));
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject appBrandLocalMediaObject = (com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject) it.next();
            if (appBrandLocalMediaObject != null && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandLocalMediaObject.f76102d)) {
                arrayList2.add(appBrandLocalMediaObject.f76102d);
                arrayList3.add(java.lang.Long.valueOf(appBrandLocalMediaObject.f76107i));
                arrayList4.add(appBrandLocalMediaObject.f76103e);
            }
        }
        if (arrayList2.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "data is null");
            jSONArray = null;
        } else {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                jSONArray2.put(arrayList2.get(i18));
            }
            jSONArray = jSONArray2.toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "onActivityResult, localIds json list string = %s", jSONArray);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("tempFilePaths", com.tencent.mm.plugin.appbrand.jsapi.media.e3.C(arrayList2));
        hashMap.put("tempFileSizes", com.tencent.mm.plugin.appbrand.jsapi.media.e3.C(arrayList3));
        if (z65.c.a()) {
            hashMap.put("__realPaths", com.tencent.mm.plugin.appbrand.jsapi.media.e3.C(arrayList4));
        }
        this.f81933a.a(this.f81934b, this.f81935c.p("ok", hashMap));
    }
}
