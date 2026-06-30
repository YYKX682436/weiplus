package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class od implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.pd f145949d;

    public od(com.p314xaae8f345.mm.p648x55baa833.ui.pd pdVar) {
        this.f145949d = pdVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b = this.f145949d.f145966e;
        com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar = activityC10374x1787784b.f145525h;
        java.lang.String obj = activityC10374x1787784b.f145522e.getText().toString();
        wdVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifyAdapter", "search:%s isLoading:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(obj), java.lang.Boolean.valueOf(wdVar.f146164i));
        if (wdVar.f146164i) {
            return false;
        }
        wdVar.f146160e = obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifyAdapter", "[setMemberListBySearch]");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            wdVar.f146163h = wdVar.f146162g;
        } else {
            for (com.p314xaae8f345.mm.p648x55baa833.ui.xd xdVar : wdVar.f146162g) {
                if (xdVar != null && (z3Var = xdVar.f146205a) != null) {
                    if (z3Var.w0() != null && z3Var.w0().contains(obj)) {
                        arrayList.add(xdVar);
                    } else if (z3Var.f2() != null && z3Var.f2().contains(obj)) {
                        arrayList.add(xdVar);
                    } else if (z3Var.T0() != null && z3Var.T0().contains(obj)) {
                        arrayList.add(xdVar);
                    } else if (!z3Var.r2()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                        if (z07 != null && (str = z07.f66692x4854b29d) != null && str.contains(obj)) {
                            arrayList.add(xdVar);
                        }
                    }
                }
            }
            wdVar.f146163h = arrayList;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p648x55baa833.ui.td(wdVar, obj));
        return false;
    }
}
