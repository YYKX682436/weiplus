package ub3;

/* loaded from: classes14.dex */
public class j implements c01.zc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 f507646d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404) {
        this.f507646d = activityC16330x45b4a404;
    }

    @Override // c01.zc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(x51.j1.g(p0Var.f152259a.f459094h), "sysmsg", null);
        if (d17 != null) {
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.sendId");
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.username");
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.amount");
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.receiveId");
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.islucky"), 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = this.f507646d;
            if (P > 0) {
                activityC16330x45b4a404.L = str2;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2, str3)) {
                return;
            }
            activityC16330x45b4a404.runOnUiThread(new ub3.b(this, str4, str2, str3));
        }
    }

    @Override // c01.zc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
