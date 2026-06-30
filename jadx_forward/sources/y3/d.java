package y3;

/* loaded from: classes14.dex */
public abstract class d implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f540661a;

    /* renamed from: b, reason: collision with root package name */
    public final float f540662b;

    public d(float[] fArr) {
        this.f540661a = fArr;
        this.f540662b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        if (f17 >= 1.0f) {
            return 1.0f;
        }
        if (f17 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f540661a;
        int min = java.lang.Math.min((int) ((fArr.length - 1) * f17), fArr.length - 2);
        float f18 = this.f540662b;
        float f19 = (f17 - (min * f18)) / f18;
        float f27 = fArr[min];
        return f27 + (f19 * (fArr[min + 1] - f27));
    }
}
