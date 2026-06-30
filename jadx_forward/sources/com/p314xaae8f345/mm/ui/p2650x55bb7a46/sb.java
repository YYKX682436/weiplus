package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class sb implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb f284203a;

    public sb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar) {
        this.f284203a = tbVar;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 windowInsets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowInsets, "windowInsets");
        e3.d a17 = windowInsets.a(135);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
        em.i1 i1Var = this.f284203a.f284244d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        i1Var.a().setPadding(a17.f328577a, a17.f328578b, a17.f328579c, a17.f328580d);
        return n3.g3.f415870b;
    }
}
