package ur0;

/* loaded from: classes14.dex */
public final class b extends sr0.g {

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.camera2.CameraCharacteristics f511815e;

    /* renamed from: f, reason: collision with root package name */
    public ur0.a f511816f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f511817g;

    @Override // sr0.g
    public void a(boolean z17, int i17, int i18, int i19, int i27, int i28) {
        super.a(z17, i17, i18, i19, i27, i28);
        this.f511817g = z17;
    }

    public final android.graphics.Rect b(float f17, float f18, float f19, int i17, int i18) {
        android.graphics.RectF rectF;
        float f27 = 80 * f19;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.set(java.lang.Math.max(f17 - f27, 0.0f), java.lang.Math.max(f18 - f27, 0.0f), java.lang.Math.min(f17 + f27, i17), java.lang.Math.min(f18 + f27, i18));
        ur0.a aVar = this.f511816f;
        if (aVar != null) {
            rectF = new android.graphics.RectF();
            aVar.f511814a.mapRect(rectF, rectF2);
        } else {
            rectF = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2FocusHelper", "calculateTapArea src:" + rectF2 + " dst:" + rectF);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (rectF != null) {
            rectF.round(rect);
        }
        return rect;
    }

    public final boolean c(boolean z17) {
        java.lang.Integer num;
        if (z17) {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.f511815e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cameraCharacteristics);
            java.lang.Object obj = cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            num = (java.lang.Integer) obj;
        } else {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics2 = this.f511815e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cameraCharacteristics2);
            java.lang.Object obj2 = cameraCharacteristics2.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            num = (java.lang.Integer) obj2;
        }
        return num.intValue() > 0;
    }
}
