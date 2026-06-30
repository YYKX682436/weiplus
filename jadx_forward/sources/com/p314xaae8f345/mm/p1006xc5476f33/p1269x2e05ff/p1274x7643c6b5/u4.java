package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class u4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.f5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 f174790b;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var, int i17) {
        this.f174790b = s4Var;
        this.f174789a = i17;
    }

    public void a() {
        if (!this.f174790b.k()) {
            pv.e0 e0Var = (pv.e0) i95.n0.c(pv.e0.class);
            android.app.Activity mo50327x19263085 = this.f174790b.f174772n.mo50327x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var = this.f174790b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = s4Var.f174665d;
            boolean l17 = s4Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v0 v0Var = this.f174790b.f174670i;
            ((ov.i0) e0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7.U6(mo50327x19263085, 1, c12886x91aa2b6d, l17, v0Var);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var2 = this.f174790b;
        if (s4Var2.f174669h != null) {
            s4Var2.t().f174617d = this.f174789a;
            this.f174790b.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var3 = this.f174790b;
            s4Var3.f174779u = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = s4Var3.f174665d;
            c12886x91aa2b6d2.f174591s = false;
            s4Var3.f174669h.B0(c12886x91aa2b6d2, s4Var3.f174772n.mo50328x12501425());
            this.f174790b.r0();
            if (!this.f174790b.f174772n.r()) {
                this.f174790b.f174772n.q(false);
                return;
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.ball.service.u4$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4.this;
                    u4Var.getClass();
                    u4Var.f174790b.h0(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.v4(u4Var), false);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 200L, false);
        }
    }
}
