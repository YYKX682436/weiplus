package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f238204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f238205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 f238206f;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94, android.widget.Toast toast, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f238206f = activityC17121x70367c94;
        this.f238204d = toast;
        this.f238205e = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f238204d.cancel();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mobile_remit_verify_name_success dialog dismiss");
        if (((sw3.b) this.f238205e).f494995u == 2) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94.f238145y0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = this.f238206f;
            activityC17121x70367c94.X6(true, true);
            activityC17121x70367c94.Y6(2, "");
        }
    }
}
