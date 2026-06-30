package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes8.dex */
public final class z0 implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18 = f17 - 1.0f;
        return (f18 * f18 * f18 * f18 * f18) + 1.0f;
    }
}
