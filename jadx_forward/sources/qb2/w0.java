package qb2;

/* loaded from: classes8.dex */
public final class w0 implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f442836d;

    public w0(qb2.r1 r1Var) {
        this.f442836d = r1Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        qb2.r1 r1Var = this.f442836d;
        r1Var.f442818f.mo50300x3fa464aa(r1Var.f442819g);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        qb2.r1 r1Var = this.f442836d;
        if (!r1Var.f442817e.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            r1Var.c(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209150b7).mo141623x754a37bb()).r()).intValue(), qb2.c1.f442715e);
        }
        if (c01.id.c() - gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_APP_PUSH_REPORT_ENABLE_TIME_LONG, 0L) >= 86400000) {
            pm0.v.K(null, new qb2.v0(r1Var));
        }
    }
}
