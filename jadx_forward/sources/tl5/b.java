package tl5;

/* loaded from: classes8.dex */
public final class b implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18 = 1.0f - f17;
        return 1.0f - ((f18 * f18) * f18);
    }
}
