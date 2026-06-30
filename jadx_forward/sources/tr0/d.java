package tr0;

/* loaded from: classes14.dex */
public final class d extends sr0.g {

    /* renamed from: e, reason: collision with root package name */
    public wo.h f502822e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f502823f;

    /* renamed from: g, reason: collision with root package name */
    public tr0.a f502824g;

    /* renamed from: h, reason: collision with root package name */
    public xr0.b f502825h;

    /* renamed from: i, reason: collision with root package name */
    public final android.hardware.Camera.AutoFocusCallback f502826i;

    public d() {
        int i17 = gt0.d.L0;
        this.f502823f = "auto";
        this.f502826i = new tr0.c(this);
    }

    @Override // sr0.g
    public void a(boolean z17, int i17, int i18, int i19, int i27, int i28) {
        if (i28 > 0 && i27 > 0) {
            super.a(z17, i17, i18, i19, i27, i28);
            this.f502824g = new tr0.a(z17, i17, this.f492979d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1FocusHelper", "updateTransformer fail viewWidth:" + i27 + " viewHeight:" + i28);
    }

    public final android.graphics.Rect b(float f17, float f18, float f19, int i17, int i18) {
        android.graphics.RectF rectF;
        float f27 = 80 * f19;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.set(java.lang.Math.max(f17 - f27, 0.0f), java.lang.Math.max(f18 - f27, 0.0f), java.lang.Math.min(f17 + f27, i17), java.lang.Math.min(f18 + f27, i18));
        tr0.a aVar = this.f502824g;
        if (aVar != null) {
            rectF = new android.graphics.RectF();
            aVar.f502812a.mapRect(rectF, rectF2);
        } else {
            rectF = null;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (rectF != null) {
            rectF.round(rect);
        }
        return rect;
    }
}
