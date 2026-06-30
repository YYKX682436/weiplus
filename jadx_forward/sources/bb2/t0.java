package bb2;

/* loaded from: classes5.dex */
public final class t0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f100530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f100532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb2.s0 f100533g;

    public t0(double d17, int i17, bb2.q0 q0Var, bb2.s0 s0Var) {
        this.f100530d = d17;
        this.f100531e = i17;
        this.f100532f = q0Var;
        this.f100533g = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(it.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        int min = java.lang.Math.min(((int) (this.f100530d * ((java.lang.Integer) r5).intValue())) + 1, this.f100531e);
        this.f100532f.f100486f.setText(" x" + min + ' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixedCenterDanmakuRender", min + ", yikezhai");
        this.f100533g.f100522b = min;
    }
}
