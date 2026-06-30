package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class pb implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb f283623a;

    public pb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar) {
        this.f283623a = tbVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar = this.f283623a;
        tbVar.f284247g = true;
        em.i1 i1Var = tbVar.f284244d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        i1Var.b().removeCallbacks(tbVar.f284248h);
        em.i1 i1Var2 = tbVar.f284244d;
        if (i1Var2 != null) {
            i1Var2.b().postDelayed(tbVar.f284248h, 150L);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }
}
