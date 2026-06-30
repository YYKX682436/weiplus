package be1;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f19521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f19522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ be1.w0 f19524g;

    public v0(be1.w0 w0Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f19524g = w0Var;
        this.f19521d = jSONObject;
        this.f19522e = lVar;
        this.f19523f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        float optDouble = (float) this.f19521d.optDouble("value");
        be1.w0 w0Var = this.f19524g;
        w0Var.f19527h = optDouble;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Float.valueOf(w0Var.f19527h);
        objArr[1] = java.lang.Float.valueOf(java.lang.Float.isNaN(w0Var.f19526g) ? -100.0f : w0Var.f19526g);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetScreenBrightness", "set brightness: %f, system brightness: %f", objArr);
        boolean isNaN = java.lang.Float.isNaN(w0Var.f19527h);
        int i17 = this.f19523f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f19522e;
        if (!isNaN) {
            float f17 = w0Var.f19527h;
            if ((f17 >= 0.0f || ((int) f17) == -1) && f17 <= 1.0f) {
                android.content.Context context = lVar.getContext();
                if (context == null) {
                    lVar.a(i17, w0Var.o("fail"));
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetScreenBrightness", "context is null, invoke fail!");
                    return;
                }
                if (!(lVar.getContext() instanceof android.app.Activity)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
                    lVar.a(i17, w0Var.o("fail:context is not activity"));
                    return;
                }
                android.app.Activity activity = (android.app.Activity) context;
                android.view.WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                if (java.lang.Float.isNaN(w0Var.f19526g)) {
                    w0Var.f19526g = attributes.screenBrightness;
                    com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), new be1.u0(this, attributes, activity));
                }
                float f18 = w0Var.f19527h;
                if (((int) f18) == -1) {
                    attributes.screenBrightness = -1.0f;
                } else {
                    attributes.screenBrightness = java.lang.Math.max(f18, 0.01f);
                }
                activity.getWindow().setAttributes(attributes);
                lVar.a(i17, w0Var.o("ok"));
                return;
            }
        }
        lVar.a(i17, w0Var.o("fail:value invalid"));
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetScreenBrightness", "value invalid");
    }
}
