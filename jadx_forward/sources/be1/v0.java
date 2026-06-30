package be1;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f101054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f101055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ be1.w0 f101057g;

    public v0(be1.w0 w0Var, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f101057g = w0Var;
        this.f101054d = jSONObject;
        this.f101055e = lVar;
        this.f101056f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        float optDouble = (float) this.f101054d.optDouble("value");
        be1.w0 w0Var = this.f101057g;
        w0Var.f101060h = optDouble;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Float.valueOf(w0Var.f101060h);
        objArr[1] = java.lang.Float.valueOf(java.lang.Float.isNaN(w0Var.f101059g) ? -100.0f : w0Var.f101059g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetScreenBrightness", "set brightness: %f, system brightness: %f", objArr);
        boolean isNaN = java.lang.Float.isNaN(w0Var.f101060h);
        int i17 = this.f101056f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f101055e;
        if (!isNaN) {
            float f17 = w0Var.f101060h;
            if ((f17 >= 0.0f || ((int) f17) == -1) && f17 <= 1.0f) {
                android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
                if (mo50352x76847179 == null) {
                    lVar.a(i17, w0Var.o("fail"));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetScreenBrightness", "context is null, invoke fail!");
                    return;
                }
                if (!(lVar.mo50352x76847179() instanceof android.app.Activity)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
                    lVar.a(i17, w0Var.o("fail:context is not activity"));
                    return;
                }
                android.app.Activity activity = (android.app.Activity) mo50352x76847179;
                android.view.WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                if (java.lang.Float.isNaN(w0Var.f101059g)) {
                    w0Var.f101059g = attributes.screenBrightness;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), new be1.u0(this, attributes, activity));
                }
                float f18 = w0Var.f101060h;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetScreenBrightness", "value invalid");
    }
}
