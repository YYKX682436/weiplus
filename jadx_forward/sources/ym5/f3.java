package ym5;

/* loaded from: classes15.dex */
public class f3 implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public android.view.animation.Interpolator f544829a = new android.view.animation.DecelerateInterpolator();

    public f3(com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7, ym5.y2 y2Var) {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        android.view.animation.Interpolator interpolator = this.f544829a;
        return interpolator != null ? interpolator.getInterpolation(f17) : f17;
    }
}
