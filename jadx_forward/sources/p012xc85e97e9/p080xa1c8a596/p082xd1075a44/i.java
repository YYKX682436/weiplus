package p012xc85e97e9.p080xa1c8a596.p082xd1075a44;

/* loaded from: classes8.dex */
public final class i implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18 = f17 - 1.0f;
        return (f18 * f18 * f18 * f18 * f18) + 1.0f;
    }
}
