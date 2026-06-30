package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class nb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb f283573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f283574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f283573d = tbVar;
        this.f283574e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar = this.f283573d;
        em.i1 i1Var = tbVar.f284244d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        i1Var.a().removeCallbacks(tbVar.f284249i);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = tbVar.f284245e;
        if (c22094xdaed490b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 m80120x9909cadb = c22094xdaed490b.m80120x9909cadb();
        boolean z17 = m80120x9909cadb.f286202p && m80120x9909cadb.f286193d.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f283574e;
        c0Var.f391645d = z17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b2 = tbVar.f284245e;
        if (c22094xdaed490b2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmView");
            throw null;
        }
        c22094xdaed490b2.f286187r = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownNativeMvvmView", "[PREVIEW_TAP] resetPreviewTapConsumption");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownPreviewUIC", "[PREVIEW_TAP] onDown inChild=%b hadSelectionOnDown=%b", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(c0Var.f391645d));
        return jz5.f0.f384359a;
    }
}
