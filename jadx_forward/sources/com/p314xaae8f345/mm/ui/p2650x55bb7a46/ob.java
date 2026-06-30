package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class ob extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb f283604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f283605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f283604d = tbVar;
        this.f283605e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar = this.f283604d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = tbVar.f284245e;
        if (c22094xdaed490b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmView");
            throw null;
        }
        boolean z17 = c22094xdaed490b.f286187r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownNativeMvvmView", "[PREVIEW_TAP] consumePreviewTapConsumed=%b", java.lang.Boolean.valueOf(z17));
        c22094xdaed490b.f286187r = false;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f283605e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownPreviewUIC", "[PREVIEW_TAP] onTap inChild=%b hadSelectionOnDown=%b isScrolling=%b tapConsumedByChild=%b", valueOf, java.lang.Boolean.valueOf(c0Var.f391645d), java.lang.Boolean.valueOf(tbVar.f284247g), java.lang.Boolean.valueOf(z17));
        if (c0Var.f391645d) {
            c0Var.f391645d = false;
        } else if (tbVar.f284247g) {
            tbVar.f284247g = false;
            em.i1 i1Var = tbVar.f284244d;
            if (i1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            i1Var.b().removeCallbacks(tbVar.f284248h);
        } else if (z17) {
            c0Var.f391645d = false;
        } else {
            c0Var.f391645d = false;
            em.i1 i1Var2 = tbVar.f284244d;
            if (i1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21641x70f8c40b a17 = i1Var2.a();
            java.lang.Runnable runnable = tbVar.f284249i;
            a17.removeCallbacks(runnable);
            em.i1 i1Var3 = tbVar.f284244d;
            if (i1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            i1Var3.a().postDelayed(runnable, 50L);
        }
        return java.lang.Boolean.TRUE;
    }
}
