package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class wc implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.xc f146158d;

    public wc(com.p314xaae8f345.mm.p648x55baa833.ui.xc xcVar) {
        this.f146158d = xcVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        java.lang.String str;
        if (this.f146158d.f146204e.c7()) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = this.f146158d.f146204e;
            activityC10372xd653ffea.f145509i.w(activityC10372xd653ffea.f145505e.getText().toString());
            return false;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea2 = this.f146158d.f146204e;
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = activityC10372xd653ffea2.f145510m;
        java.lang.String obj = activityC10372xd653ffea2.f145505e.getText().toString();
        kdVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectMemberAdapter", "search:%s isLoading:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(obj), java.lang.Boolean.valueOf(kdVar.f145823m));
        if (kdVar.f145823m) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectMemberAdapter", "[setMemberListBySearch]");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            kdVar.f145822i = kdVar.f145821h;
        } else {
            for (com.p314xaae8f345.mm.p648x55baa833.ui.bd bdVar : kdVar.f145821h) {
                if (bdVar != null && (z3Var = bdVar.f145592a) != null) {
                    if (z3Var.w0() == null || !z3Var.w0().contains(obj)) {
                        java.lang.String d17 = z3Var.d1();
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = kdVar.f145818e;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c.U6(a3Var, d17)) && com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c.U6(a3Var, z3Var.d1()).contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.f2() != null && z3Var.f2().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.T0() != null && z3Var.T0().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.t0() != null && z3Var.t0().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.d1() != null && z3Var.d1().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (!z3Var.r2()) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                            if (z07 != null && (str = z07.f66692x4854b29d) != null && str.contains(obj)) {
                                arrayList.add(bdVar);
                            }
                        }
                    } else {
                        arrayList.add(bdVar);
                    }
                }
            }
            kdVar.f145822i = arrayList;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p648x55baa833.ui.ed(kdVar));
        return false;
    }
}
