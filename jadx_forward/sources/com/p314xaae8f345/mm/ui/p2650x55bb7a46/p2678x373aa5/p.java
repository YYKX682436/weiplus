package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f284572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r f284573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f284574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f284575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f284576h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f284577i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f284578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f284579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f284580o;

    public p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, int i17, int i18, android.graphics.Rect rect, float f17, int i19) {
        this.f284573e = rVar;
        this.f284574f = k3Var;
        this.f284575g = c22624x85d69039;
        this.f284576h = i17;
        this.f284577i = i18;
        this.f284578m = rect;
        this.f284579n = f17;
        this.f284580o = i19;
    }

    public final void a() {
        if (this.f284572d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChattingTextChangeItemAnimator", "animateChange(self): finish called repeatedly, ignore");
            return;
        }
        this.f284572d = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar = this.f284573e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f284574f;
        rVar.G(k3Var, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f284575g;
        rVar.I(c22624x85d69039, this.f284576h, this.f284577i);
        c22624x85d69039.setClipBounds(this.f284578m);
        c22624x85d69039.setAlpha(this.f284579n);
        rVar.J(c22624x85d69039, this.f284580o, 1.0f);
        rVar.L(c22624x85d69039);
        rVar.h(k3Var);
        rVar.F();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        a();
    }
}
