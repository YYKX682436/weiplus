package dj0;

/* loaded from: classes14.dex */
public final class h implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public static final dj0.h f314361a = new dj0.h();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f17) {
        float f18 = f17 - 1.0f;
        return (f18 * f18 * f18 * f18 * f18) + 1.0f;
    }
}
