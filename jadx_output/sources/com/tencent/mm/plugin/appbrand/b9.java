package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze.n f76773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f76775f;

    public b9(ze.n nVar, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f76773d = nVar;
        this.f76774e = str;
        this.f76775f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.sdk.jsapi.component.service.y C0 = this.f76773d.C0();
        java.lang.String str = this.f76774e;
        if (C0 != null) {
            org.json.JSONObject jSONObject = this.f76775f;
            C0.e(str, jSONObject != null ? jSONObject.toString() : null, 0);
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && kz5.z.G(new java.lang.String[]{"onRequestStatusEmojiPanelDismiss", "onRequestStatusEmojiPanelShow", "onPostTextStatus", "onRequestRecommendIconComplete"}, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWidgetImpl", "dispatchJsEvent(" + str + ')');
        }
    }
}
