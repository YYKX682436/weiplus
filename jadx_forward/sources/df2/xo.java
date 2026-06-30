package df2;

/* loaded from: classes3.dex */
public final class xo implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zo f313324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f313325e;

    public xo(df2.zo zoVar, android.widget.ImageView imageView) {
        this.f313324d = zoVar;
        this.f313325e = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f313325e;
        imageView.setVisibility(8);
        zl2.r4.f555483a.Q2(imageView);
        df2.zo zoVar = this.f313324d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = zoVar.f313515p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        zoVar.f313515p = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(zoVar, null, null, new df2.vo(zoVar, null), 3, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        df2.zo zoVar = this.f313324d;
        android.widget.FrameLayout Z6 = zoVar.Z6();
        if (Z6 != null) {
            Z6.setVisibility(0);
        }
        this.f313325e.setVisibility(0);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = zoVar.f313515p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
