package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes9.dex */
public class q implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0 f223255d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0 activityC15937xc5eea8d0) {
        this.f223255d = activityC15937xc5eea8d0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m53.k1 k1Var = (m53.k1) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0 activityC15937xc5eea8d0 = this.f223255d;
        if (i17 == 0 && i18 == 0) {
            java.lang.String str2 = k1Var.f405368d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateOrJoinChatroomUI", "Join Url: %s", str2);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0.f222178q;
            activityC15937xc5eea8d0.P6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0.O6(activityC15937xc5eea8d0, str2);
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateOrJoinChatroomUI", "CGI return is not OK. (%d, %d)(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 4) {
            int i27 = k1Var.f405369e;
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0.f222178q;
            activityC15937xc5eea8d0.Q6(i27);
        } else {
            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0.f222178q;
            activityC15937xc5eea8d0.Q6(-1);
        }
        activityC15937xc5eea8d0.P6();
        activityC15937xc5eea8d0.finish();
        return 0;
    }
}
