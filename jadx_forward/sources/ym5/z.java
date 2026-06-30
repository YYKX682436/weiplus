package ym5;

/* loaded from: classes15.dex */
public final class z implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public static final ym5.z f545117a = new ym5.z();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f17) {
        float f18 = f17 - 1.0f;
        return (f18 * f18 * f18 * f18 * f18) + 1.0f;
    }
}
