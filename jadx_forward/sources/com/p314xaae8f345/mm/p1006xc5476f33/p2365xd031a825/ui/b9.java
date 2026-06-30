package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class b9 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jd f261686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c f261687b;

    public b9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c activityC19123x554b2e1c, r45.jd jdVar) {
        this.f261687b = activityC19123x554b2e1c;
        this.f261686a = jdVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4
    /* renamed from: onClick */
    public void mo73850xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c activityC19123x554b2e1c = this.f261687b;
        r45.jd jdVar = this.f261686a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c.f261635g;
        activityC19123x554b2e1c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
        c19091x9511676c.f69225xed6d60f6 = jdVar.f459246g;
        c19091x9511676c.f69249x61dbf87 = jdVar.f459244e;
        c19091x9511676c.f69223x58802fcb = jdVar.f459245f;
        c19091x9511676c.f69233x225aa2b6 = jdVar.f459247h;
        activityC19123x554b2e1c.m83105x7498fe14().putParcelable("key_bankcard", c19091x9511676c);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.a(c19091x9511676c.f69223x58802fcb) == null) {
            activityC19123x554b2e1c.m83099x5406100e(new ss4.z("", "", null), true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "go to reset directly");
            activityC19123x554b2e1c.U6();
        }
    }
}
