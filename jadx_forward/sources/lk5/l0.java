package lk5;

/* loaded from: classes14.dex */
public final class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f400575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f400576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f400577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f400578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f400579h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f400580i;

    public l0(int i17, com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, long j17, android.animation.Animator animator) {
        this.f400575d = i17;
        this.f400576e = c22584xf7d97e83;
        this.f400577f = i18;
        this.f400578g = f0Var;
        this.f400579h = j17;
        this.f400580i = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f400578g;
        int i17 = this.f400577f;
        float max = i17 > 0 ? java.lang.Math.max(1 - (f0Var.f391649d / i17), 0.0f) : 0.0f;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400576e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c22584xf7d97e83.getF292653o(), "onAnimationEnd() called with duration:" + this.f400579h + " expectFrames:" + i17 + " realFrames:" + f0Var.f391649d + " dropFrameRate:" + max + " animation = " + animation);
        int i18 = this.f400575d;
        if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7) {
            c22584xf7d97e83.mo68958x17bc8340();
        } else if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559453f8) {
            c22584xf7d97e83.mo81222x460c801e();
        } else if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f_) {
            c22584xf7d97e83.mo81226x15bd8ba9();
        } else if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9) {
            c22584xf7d97e83.mo81224x3e2ce915();
        }
        ((android.animation.ValueAnimator) this.f400580i).removeListener(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400576e;
        int i17 = this.f400575d;
        if (i17 == com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7) {
            c22584xf7d97e83.mo81220x1a7a6dce();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c22584xf7d97e83.getF292653o(), "onAnimationStart() called");
        } else if (i17 == com.p314xaae8f345.mm.R.C30854x2dc211.f559453f8) {
            c22584xf7d97e83.mo81221xf4beab2c();
        } else if (i17 == com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9) {
            c22584xf7d97e83.mo81223x6668b263();
        } else if (i17 == com.p314xaae8f345.mm.R.C30854x2dc211.f_) {
            c22584xf7d97e83.mo81225x9c5afff7();
        }
    }
}
