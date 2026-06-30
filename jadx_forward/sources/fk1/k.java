package fk1;

/* loaded from: classes8.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344810d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344810d = activityC12732x6baffca6;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344810d;
            m33.k1 k1Var = activityC12732x6baffca6.f171716f;
            fk1.h hVar = new fk1.h(activityC12732x6baffca6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var;
            p0Var.getClass();
            n53.b.b(k1Var.f404836a, 3L, 103, 2, 0, k1Var.f404839d, k1Var.f404843h, k1Var.f404842g);
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.v0(p0Var, k1Var, hVar, activityC12732x6baffca6));
            return;
        }
        if (itemId == 1) {
            m33.l1 l1Var2 = (m33.l1) i95.n0.c(m33.l1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca62 = this.f344810d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var2).Ri(activityC12732x6baffca62, activityC12732x6baffca62.f171716f, 1, new fk1.i(activityC12732x6baffca62));
            return;
        }
        if (itemId != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameRecordShareUI", "bottom sheet,error itemId");
            return;
        }
        m33.l1 l1Var3 = (m33.l1) i95.n0.c(m33.l1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca63 = this.f344810d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var3).Ri(activityC12732x6baffca63, activityC12732x6baffca63.f171716f, 2, new fk1.j(activityC12732x6baffca63));
    }
}
