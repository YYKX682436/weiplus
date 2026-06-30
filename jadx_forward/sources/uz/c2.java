package uz;

@j95.b
/* loaded from: classes8.dex */
public class c2 extends i95.w implements vz.a2 {
    public void wi(android.content.Context context, long j17, boolean z17, boolean z18, vz.z1 z1Var) {
        boolean o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().o(j17);
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68404x28d45f97)) {
            z1Var.a(null, null);
            return;
        }
        if (!z18) {
            if (!o17) {
                z1Var.a("fail", null);
                return;
            } else {
                k02.s.b(context, c17.f68404x28d45f97, 0);
                z1Var.a(null, null);
                return;
            }
        }
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.i(context, c17, z1Var);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
            if (wVar.j() != null && wVar.j().get() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.i((android.content.Context) wVar.j().get(), c17, z1Var);
                return;
            }
        }
        if (!o17) {
            z1Var.a("fail", null);
        } else {
            k02.s.b(context, c17.f68404x28d45f97, 0);
            z1Var.a(null, null);
        }
    }
}
