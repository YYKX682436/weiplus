package tb2;

/* loaded from: classes3.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f498505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f498506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tb2.h f498507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f498508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f498509h;

    public g(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, boolean z17, tb2.h hVar, android.view.ViewPropertyAnimator viewPropertyAnimator, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f498505d = k3Var;
        this.f498506e = z17;
        this.f498507f = hVar;
        this.f498508g = viewPropertyAnimator;
        this.f498509h = h0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel: ");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f498505d;
        sb6.append(k3Var.hashCode());
        sb6.append(' ');
        sb6.append(k3Var.m8183xf806b362());
        sb6.append(" liveFeed: ");
        sb6.append(this.f498506e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerFadeInDownAnimator", sb6.toString());
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        this.f498507f.K(itemView);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f498508g.setListener(null);
        tb2.h hVar = this.f498507f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f498505d;
        hVar.y(k3Var);
        hVar.f480818q.remove(k3Var);
        hVar.G();
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        hVar.K(itemView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove onAnimationEnd recover animate originAnimate: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f498509h;
        sb6.append(h0Var.f391656d);
        sb6.append("  ");
        sb6.append(k3Var.hashCode());
        sb6.append(' ');
        sb6.append(k3Var.m8183xf806b362());
        sb6.append(" liveFeed: ");
        sb6.append(this.f498506e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerFadeInDownAnimator", sb6.toString());
        hVar.f498510t.m7964x8d4ad49c((p012xc85e97e9.p103xe821e364.p104xd1075a44.n2) h0Var.f391656d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationStart: ");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f498505d;
        sb6.append(k3Var.hashCode());
        sb6.append(' ');
        sb6.append(k3Var.m8183xf806b362());
        sb6.append(" liveFeed: ");
        sb6.append(this.f498506e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerFadeInDownAnimator", sb6.toString());
        this.f498507f.C(k3Var);
    }
}
