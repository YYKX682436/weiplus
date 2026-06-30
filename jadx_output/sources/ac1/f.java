package ac1;

/* loaded from: classes7.dex */
public class f implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PointF f2998a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f2999b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.PointF f3000c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.PointF f3001d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.PointF f3002e;

    public f(ac1.g gVar, float f17, float f18, float f19, float f27) {
        android.graphics.PointF pointF = new android.graphics.PointF(f17, f18);
        android.graphics.PointF pointF2 = new android.graphics.PointF(f19, f27);
        new android.graphics.PointF();
        new android.graphics.PointF();
        this.f3000c = new android.graphics.PointF();
        this.f3001d = new android.graphics.PointF();
        this.f3002e = new android.graphics.PointF();
        float f28 = pointF.x;
        if (f28 < 0.0f || f28 > 1.0f) {
            throw new java.lang.IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f29 = pointF2.x;
        if (f29 < 0.0f || f29 > 1.0f) {
            throw new java.lang.IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        this.f2998a = pointF;
        this.f2999b = pointF2;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        android.graphics.PointF pointF;
        android.graphics.PointF pointF2;
        android.graphics.PointF pointF3;
        android.graphics.PointF pointF4;
        android.graphics.PointF pointF5;
        int i17 = 1;
        float f18 = f17;
        while (true) {
            pointF = this.f3000c;
            pointF2 = this.f2999b;
            pointF3 = this.f3001d;
            pointF4 = this.f2998a;
            pointF5 = this.f3002e;
            if (i17 >= 14) {
                break;
            }
            float f19 = pointF4.x * 3.0f;
            pointF5.x = f19;
            float f27 = ((pointF2.x - pointF4.x) * 3.0f) - f19;
            pointF3.x = f27;
            float f28 = (1.0f - pointF5.x) - f27;
            pointF.x = f28;
            float f29 = ((pointF5.x + ((pointF3.x + (f28 * f18)) * f18)) * f18) - f17;
            if (java.lang.Math.abs(f29) < 0.001d) {
                break;
            }
            f18 -= f29 / (pointF5.x + (((pointF3.x * 2.0f) + ((pointF.x * 3.0f) * f18)) * f18));
            i17++;
        }
        float f37 = pointF4.y * 3.0f;
        pointF5.y = f37;
        float f38 = ((pointF2.y - pointF4.y) * 3.0f) - f37;
        pointF3.y = f38;
        float f39 = (1.0f - pointF5.y) - f38;
        pointF.y = f39;
        return f18 * (pointF5.y + ((pointF3.y + (f39 * f18)) * f18));
    }
}
