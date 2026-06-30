package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.m0 f238222d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.m0 m0Var) {
        this.f238222d = m0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.m0 m0Var = this.f238222d;
        if (itemId >= m0Var.f238225d.f238119r.f463115i.size() || menuItem.getItemId() < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "menuItem click menuItem.getItemId() illegal");
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.c(m0Var.f238225d.mo55332x76847179(), (r45.n34) m0Var.f238225d.f238119r.f463115i.get(menuItem.getItemId()), null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.k0(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "menuItem click JumpItem:%s", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.e((r45.n34) m0Var.f238225d.f238119r.f463115i.get(menuItem.getItemId())));
        }
    }
}
