package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public final class g implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f81538a;

    public g(android.view.View view) {
        this.f81538a = view;
    }

    @Override // ft.p4
    public final void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            android.view.View view = this.f81538a;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.liteapp.ui.WxaLiteAppBaseView");
            long appUuid = ((com.tencent.liteapp.ui.WxaLiteAppBaseView) view).getAppUuid();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLiteAppView", "johnjh addWeAppDataCallback appuuid:" + appUuid + ", param:" + jSONObject);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(appUuid, "app.postmessage", jSONObject);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLiteAppView", e17.toString());
        }
    }
}
