package vc5;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f516853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 f516854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g f516855f;

    public h(android.view.View view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g gVar) {
        this.f516853d = view;
        this.f516854e = c21816x74d192a3;
        this.f516855f = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f516853d.removeOnAttachStateChangeListener(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3 = this.f516854e;
        em.u1 u1Var = c21816x74d192a3.f283244f;
        if (u1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21833xd4015cd6 a17 = u1Var.a();
        java.lang.String string = c21816x74d192a3.getContext().getResources().getString(this.f516855f.b());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        a17.m79752x1272205(string);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
