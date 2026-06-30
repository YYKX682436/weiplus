package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public abstract class b extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public boolean f81391g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean c17;
        if (C(lVar)) {
            c17 = true;
        } else {
            if (this.f81391g) {
                lVar.a(i17, o("fail:system permission denied"));
            } else {
                android.app.Activity activity = lVar.getContext() instanceof android.app.Activity ? (android.app.Activity) lVar.getContext() : null;
                if (activity == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "operateRecorder, pageContext is null");
                    lVar.a(i17, o("fail:internal error invalid android context"));
                } else {
                    c17 = nf.g.a(activity).c(lVar, "android.permission.ACCESS_FINE_LOCATION", new com.tencent.mm.plugin.appbrand.jsapi.lbs.a(this, lVar, jSONObject, i17));
                }
            }
            c17 = false;
        }
        if (!c17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s requestPermission fail", k());
        } else if (jSONObject != null) {
            D(lVar, jSONObject, i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s invalid data", k());
            lVar.a(i17, o("fail:invalid data"));
        }
    }

    public final boolean C(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        android.content.Context context = lVar.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        return nf.t.b(context, lVar, "android.permission.ACCESS_FINE_LOCATION");
    }

    public abstract void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17);
}
