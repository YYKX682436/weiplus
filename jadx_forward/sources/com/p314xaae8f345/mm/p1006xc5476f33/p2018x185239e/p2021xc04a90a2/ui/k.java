package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ow3 f238216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.l f238217e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.l lVar, r45.ow3 ow3Var) {
        this.f238217e = lVar;
        this.f238216d = ow3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null && menuItem.getItemId() == 0) {
            r45.ow3 ow3Var = this.f238216d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "delete HisRcvr id:%s", ow3Var.f464108d);
            sw3.c cVar = new sw3.c(ow3Var.f464108d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.l lVar = this.f238217e;
            lVar.f238221a.m83099x5406100e(cVar, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17116x472c8308 activityC17116x472c8308 = lVar.f238221a;
            ((java.util.ArrayList) activityC17116x472c8308.f238101i).remove(ow3Var);
            activityC17116x472c8308.f238103n.m8146xced61ae5();
            activityC17116x472c8308.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b c7056xe1fb940b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b();
            c7056xe1fb940b.f143654d = 14;
            c7056xe1fb940b.k();
        }
    }
}
