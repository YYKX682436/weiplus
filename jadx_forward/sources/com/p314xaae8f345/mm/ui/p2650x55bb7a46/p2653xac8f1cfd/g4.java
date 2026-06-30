package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.q f280611d;

    public g4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h4 h4Var, yb5.q qVar) {
        this.f280611d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> p66 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p6(java.util.Collections.singletonList("gamelifemessage"));
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : p66) {
            java.util.Set set = dt1.a.f324657h;
            if (!dt1.a.f324657h.contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
                f9Var.r1(5);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(p66.size());
        yb5.q qVar = this.f280611d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ChattingComponent", "sending msg size=%s talker=%s username=%s", valueOf, qVar.f542276b, qVar.f542275a);
    }
}
