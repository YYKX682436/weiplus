package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class q5 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity f262118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f262119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity) {
        super(false);
        this.f262119e = activityC19116x82bf90f1;
        this.f262118d = commodity;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f262119e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "click tiny app, userName: %s, path: %s, version: %s", activityC19116x82bf90f1.f261568q, activityC19116x82bf90f1.f261569r, java.lang.Integer.valueOf(activityC19116x82bf90f1.f261570s));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        java.lang.String str = activityC19116x82bf90f1.f261568q;
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        java.lang.String str2 = activityC19116x82bf90f1.f261569r;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f89000b = str2;
        nxVar.f89002d = 1034;
        boolean z18 = false;
        nxVar.f89001c = 0;
        int i17 = activityC19116x82bf90f1.f261570s;
        if (i17 > 0) {
            nxVar.f89007i = i17;
        }
        nxVar.f89004f = activityC19116x82bf90f1;
        c6113xa3727625.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = this.f262118d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(commodity.D.f261329i) && commodity.D.f261330m > 0) {
            z18 = true;
        }
        activityC19116x82bf90f1.K1 = z18;
        if (activityC19116x82bf90f1.K1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14118, activityC19116x82bf90f1.f261562m, activityC19116x82bf90f1.m83107xcc3330f3(), 3);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14118, activityC19116x82bf90f1.f261562m, activityC19116x82bf90f1.m83107xcc3330f3(), 1);
        }
    }
}
