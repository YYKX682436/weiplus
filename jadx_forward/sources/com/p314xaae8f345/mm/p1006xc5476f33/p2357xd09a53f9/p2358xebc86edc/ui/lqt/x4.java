package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class x4 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f259969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 f259970b;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 activityC19017x85a03192, boolean z17) {
        this.f259970b = activityC19017x85a03192;
        this.f259969a = z17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void a(java.lang.Object obj) {
        r45.m85 m85Var = (r45.m85) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "on index cache callback");
        if (m85Var == null || !this.f259969a) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192.f259556s;
        this.f259970b.X6(m85Var);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.m85 m85Var = (r45.m85) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "on index response callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 activityC19017x85a03192 = this.f259970b;
        if (m85Var == null) {
            at4.j0.b(-1, -1).a(activityC19017x85a03192.mo55332x76847179(), true);
            return;
        }
        int i19 = m85Var.f461771d;
        if (i19 != 0) {
            at4.j0.c(i19, m85Var.f461772e).a(activityC19017x85a03192.mo55332x76847179(), true);
        } else {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192.f259556s;
            activityC19017x85a03192.X6(m85Var);
        }
    }
}
