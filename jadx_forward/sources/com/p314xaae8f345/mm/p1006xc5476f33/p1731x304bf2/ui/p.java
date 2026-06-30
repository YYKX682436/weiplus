package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes9.dex */
public class p implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0 f223234d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0 activityC15937xc5eea8d0) {
        this.f223234d = activityC15937xc5eea8d0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m53.t0 t0Var = (m53.t0) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0 activityC15937xc5eea8d0 = this.f223234d;
        if (i17 == 0 && i18 == 0) {
            java.lang.String str2 = t0Var.f405600d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateOrJoinChatroomUI", "Create Url: %s", str2);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0.f222178q;
            activityC15937xc5eea8d0.P6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15937xc5eea8d0.O6(activityC15937xc5eea8d0, str2);
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateOrJoinChatroomUI", "CGI return is not OK. (%d, %d)(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 4) {
            int i27 = t0Var.f405601e;
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
