package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze.n f158306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f158308f;

    public b9(ze.n nVar, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f158306d = nVar;
        this.f158307e = str;
        this.f158308f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y C0 = this.f158306d.C0();
        java.lang.String str = this.f158307e;
        if (C0 != null) {
            org.json.JSONObject jSONObject = this.f158308f;
            C0.e(str, jSONObject != null ? jSONObject.toString() : null, 0);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && kz5.z.G(new java.lang.String[]{"onRequestStatusEmojiPanelDismiss", "onRequestStatusEmojiPanelShow", "onPostTextStatus", "onRequestRecommendIconComplete"}, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWidgetImpl", "dispatchJsEvent(" + str + ')');
        }
    }
}
