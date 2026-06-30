package ta5;

/* loaded from: classes13.dex */
public class b extends android.view.animation.CycleInterpolator {
    @Override // android.view.animation.CycleInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        return (float) (1.0d - java.lang.Math.pow((f17 * 2.0f) - 1.0f, 2.0d));
    }
}
