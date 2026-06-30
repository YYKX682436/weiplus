package zw1;

/* loaded from: classes9.dex */
public class r implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 f558301a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85) {
        this.f558301a = activityC13141xbbc9be85;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "update switch: %B", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85 = this.f558301a;
        activityC13141xbbc9be85.f177896m.m81392x52cfa5c6(z17);
        activityC13141xbbc9be85.f177898o.m81392x52cfa5c6(z17);
        if (z17) {
            activityC13141xbbc9be85.A |= 32768;
            activityC13141xbbc9be85.f177895i.setImageResource(com.p314xaae8f345.mm.R.raw.f78881xd6765a84);
            activityC13141xbbc9be85.f177897n.setImageResource(com.p314xaae8f345.mm.R.raw.f78881xd6765a84);
            dp.a.m125853x26a183b(activityC13141xbbc9be85.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.b_d, 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 11);
            i17 = 1;
        } else {
            activityC13141xbbc9be85.A &= -32769;
            activityC13141xbbc9be85.f177895i.setImageResource(com.p314xaae8f345.mm.R.raw.f78880xf854f56a);
            activityC13141xbbc9be85.f177897n.setImageResource(com.p314xaae8f345.mm.R.raw.f78880xf854f56a);
            dp.a.m125853x26a183b(activityC13141xbbc9be85.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.b_2, 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 12);
            i17 = 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(activityC13141xbbc9be85.A));
        r45.no4 no4Var = new r45.no4();
        no4Var.f463092d = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
        if (i17 == 1) {
            tw1.f.Di().Ai();
        } else {
            tw1.f.Di().wi();
        }
    }
}
