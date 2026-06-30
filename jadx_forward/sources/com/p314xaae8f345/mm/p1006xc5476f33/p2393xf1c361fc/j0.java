package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class j0 implements rk4.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 f263078a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var) {
        this.f263078a = q0Var;
    }

    @Override // rk4.o5
    public void a(int i17, bw5.lp0 lp0Var) {
        java.lang.String str;
        int Ni = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ni();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "onPlayerEvent event: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(Ni));
        if (Ni == 2000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var = this.f263078a;
            if (i17 != 1 && i17 != 3) {
                if (i17 != 4 && i17 != 5) {
                    if (i17 != 6) {
                        if (i17 != 11 && i17 != 12) {
                            return;
                        }
                    }
                }
                bw5.lp0 uj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
                java.lang.String b17 = uj6 != null ? uj6.b() : "";
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                str = b17 != null ? b17 : "";
                java.util.Iterator it = q0Var.f263124d.iterator();
                while (it.hasNext()) {
                    ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Di(((java.lang.Integer) it.next()).intValue(), str, 0);
                }
                return;
            }
            bw5.lp0 uj7 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
            java.lang.String b18 = uj7 != null ? uj7.b() : "";
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str = b18 != null ? b18 : "";
            java.util.Iterator it6 = q0Var.f263124d.iterator();
            while (it6.hasNext()) {
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Di(((java.lang.Integer) it6.next()).intValue(), str, 1);
            }
        }
    }
}
