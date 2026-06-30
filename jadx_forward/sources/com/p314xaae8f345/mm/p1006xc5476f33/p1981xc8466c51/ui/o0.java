package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class o0 implements com.p314xaae8f345.mm.p944x882e457a.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 f236993d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15) {
        this.f236993d = activityC16966x2b279c15;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (j17 == j18) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f236993d.F;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f236993d.F = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15 = this.f236993d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(activityC16966x2b279c15.f236813y, activityC16966x2b279c15.f236812x);
            java.lang.String j19 = Li.j();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Li.Q0())) {
                j19 = c01.w9.u(Li.j());
            }
            ot0.q v17 = ot0.q.v(j19);
            if (v17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c152 = this.f236993d;
                java.lang.String str = v17.f430196h0;
                activityC16966x2b279c152.f236814z = str;
                activityC16966x2b279c152.f236810v = bt3.g2.A(str);
                r45.ul5 ul5Var = this.f236993d.f236810v;
                if (ul5Var != null && !ul5Var.f468998f.isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c153 = this.f236993d;
                    if (activityC16966x2b279c153.j7(activityC16966x2b279c153.f236810v) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c154 = this.f236993d;
                        activityC16966x2b279c154.C = activityC16966x2b279c154.j7(activityC16966x2b279c154.f236810v);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c155 = this.f236993d;
                        activityC16966x2b279c155.C = activityC16966x2b279c155.f236810v.f468996d;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c156 = this.f236993d;
                    activityC16966x2b279c156.D = ((r45.gp0) activityC16966x2b279c156.f236810v.f468998f.getFirst()).M1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c157 = this.f236993d;
                    activityC16966x2b279c157.E = ((r45.gp0) activityC16966x2b279c157.f236810v.f468998f.getLast()).M1;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c158 = this.f236993d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w wVar = activityC16966x2b279c158.I;
                r45.ul5 ul5Var2 = activityC16966x2b279c158.f236810v;
                wVar.getClass();
                new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.v(ul5Var2, false, wVar).mo152xb9724478();
                if (this.f236993d.isFinishing() || this.f236993d.isDestroyed()) {
                    return;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.record.ui.o0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.o0.this.f236993d.k7();
                    }
                });
            }
        }
    }
}
