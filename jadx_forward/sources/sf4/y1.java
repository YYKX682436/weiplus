package sf4;

/* loaded from: classes4.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b f489152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7060x39f93c0f f489153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f489154f;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7060x39f93c0f c7060x39f93c0f, long j17) {
        this.f489152d = c18499x2fc2446b;
        this.f489153e = c7060x39f93c0f;
        this.f489154f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b.f253643a2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f489152d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18499x2fc2446b.f271272e, "reportStopLocalVideo");
        com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
        java.lang.String str = c18499x2fc2446b.f153178l1;
        ((be0.e) oVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 != null) {
            long j17 = d17.f243915a;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7060x39f93c0f c7060x39f93c0f = this.f489153e;
            c7060x39f93c0f.f143671h = j17;
            nf4.l i18 = ef4.w.f334001t.i();
            long j18 = this.f489154f;
            c7060x39f93c0f.f143669f = (j18 >= 0 ? i18.J0((int) j18) : i18.L0(j18)) != null ? r1.f69408x56b3c014 : 0;
            c7060x39f93c0f.f143681r = d17.f243916b;
            c7060x39f93c0f.k();
        }
    }
}
