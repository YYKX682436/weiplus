package androidx.customview.widget;

/* loaded from: classes8.dex */
public final class i implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18 = f17 - 1.0f;
        return (f18 * f18 * f18 * f18 * f18) + 1.0f;
    }
}
