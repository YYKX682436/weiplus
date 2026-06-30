package ry4;

/* loaded from: classes3.dex */
public final class h0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.j0 f483166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f483167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry4.a f483168f;

    public h0(ry4.j0 j0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, ry4.a aVar) {
        this.f483166d = j0Var;
        this.f483167e = k3Var;
        this.f483168f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        ry4.j0 j0Var = this.f483166d;
        java.util.Map map = j0Var.f483186t;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f483167e;
        map.remove(k3Var);
        this.f483168f.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.v59, null);
        j0Var.h(k3Var);
    }
}
