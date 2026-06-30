package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class n extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f284541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r f284542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f284543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f284544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f284545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f284546i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f284547m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f284548n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f284549o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f284550p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284551q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f284552r;

    public n(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, int i17, int i18, android.graphics.Rect rect, float f17, int i19, android.view.View view, float f18) {
        this.f284542e = rVar;
        this.f284543f = k3Var;
        this.f284544g = k3Var2;
        this.f284545h = c22624x85d69039;
        this.f284546i = i17;
        this.f284547m = i18;
        this.f284548n = rect;
        this.f284549o = f17;
        this.f284550p = i19;
        this.f284551q = view;
        this.f284552r = f18;
    }

    public final void a() {
        if (this.f284541d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChattingTextChangeItemAnimator", "animateChange(old,new): finish called repeatedly, ignore");
            return;
        }
        this.f284541d = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar = this.f284542e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f284543f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = this.f284544g;
        rVar.G(k3Var, k3Var2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f284545h;
        rVar.I(c22624x85d69039, this.f284546i, this.f284547m);
        c22624x85d69039.setClipBounds(this.f284548n);
        c22624x85d69039.setAlpha(this.f284549o);
        rVar.J(c22624x85d69039, this.f284550p, 1.0f);
        android.view.View view = this.f284551q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(this.f284552r));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$animateChange$animator$1$2", "finish", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$animateChange$animator$1$2", "finish", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rVar.L(c22624x85d69039);
        rVar.h(k3Var2);
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
