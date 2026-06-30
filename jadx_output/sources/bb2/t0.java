package bb2;

/* loaded from: classes5.dex */
public final class t0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f18997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f18999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb2.s0 f19000g;

    public t0(double d17, int i17, bb2.q0 q0Var, bb2.s0 s0Var) {
        this.f18997d = d17;
        this.f18998e = i17;
        this.f18999f = q0Var;
        this.f19000g = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        kotlin.jvm.internal.o.e(it.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        int min = java.lang.Math.min(((int) (this.f18997d * ((java.lang.Integer) r5).intValue())) + 1, this.f18998e);
        this.f18999f.f18953f.setText(" x" + min + ' ');
        com.tencent.mars.xlog.Log.i("FixedCenterDanmakuRender", min + ", yikezhai");
        this.f19000g.f18989b = min;
    }
}
