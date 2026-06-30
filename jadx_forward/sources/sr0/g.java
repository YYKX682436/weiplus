package sr0;

/* loaded from: classes14.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public int f492976a;

    /* renamed from: b, reason: collision with root package name */
    public int f492977b;

    /* renamed from: c, reason: collision with root package name */
    public int f492978c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f492979d = new android.graphics.RectF();

    public void a(boolean z17, int i17, int i18, int i19, int i27, int i28) {
        float f17;
        float f18;
        android.graphics.RectF rectF;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitFocusHelper", "updateFocusParam mirrorX:" + z17 + " rotate:" + i17 + " textureWidth:" + i18 + " textureHeight:" + i19 + " viewWidth:" + i27 + " viewHeight:" + i28);
        if (i28 <= 0 || i27 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.CameraKitFocusHelper", "ignore updateTransformer,for width:" + i27 + " height:" + i28);
            return;
        }
        this.f492978c = i17;
        this.f492976a = i27;
        this.f492977b = i28;
        float f19 = i28;
        float f27 = i27;
        float f28 = (f19 * 1.0f) / f27;
        if (i17 == -270 || i17 == -90 || i17 == 90 || i17 == 270) {
            f17 = i18 * 1.0f;
            f18 = i19;
        } else {
            f17 = i19 * 1.0f;
            f18 = i18;
        }
        float f29 = f17 / f18;
        if (f28 > f29) {
            float f37 = ((f28 - f29) * f27) / 2;
            rectF = new android.graphics.RectF(0 - f37, 0.0f, f27 + f37, f19);
        } else {
            float f38 = ((f29 - f28) * f19) / 2;
            rectF = new android.graphics.RectF(0.0f, 0 - f38, f27, f19 + f38);
        }
        this.f492979d = rectF;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitFocusHelper", "calculate real preview rect:" + this.f492979d);
    }
}
