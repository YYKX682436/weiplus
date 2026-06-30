package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public final class h9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289256d;

    public h9(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        this.f289256d = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = false;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = this.f289256d;
        int d17 = l4Var != null ? l4Var.d1() : 0;
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        java.lang.String y07 = l4Var != null ? l4Var.y0() : null;
        if (y07 == null) {
            y07 = "";
        }
        java.util.Map a17 = com.p314xaae8f345.mm.ui.p2731xc84c5534.k0.a(h17, y07, d17);
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        java.lang.String h18 = l4Var != null ? l4Var.h1() : null;
        b00.a0 a0Var = (b00.a0) u3Var;
        a0Var.getClass();
        if (h18 == null || h18.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsKfReportService", "reportListCustomEvent invalid params, kfUserName:" + h18 + ", viewId:ecs_kf_list_item");
            return;
        }
        if (!(h18 == null || h18.length() == 0) && k41.h1.c(h18) != 0) {
            z17 = true;
        }
        if (z17) {
            a0Var.bj("ecs_kf_list_item", "view_clk", a0Var.Ri(h18, a17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsKfReportService", "reportListCustomEvent ecs kf session, but type == 0");
        }
    }
}
