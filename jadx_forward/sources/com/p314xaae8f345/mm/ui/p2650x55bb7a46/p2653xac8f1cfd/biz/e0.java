package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes9.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.u f280308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f280309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.f0 f280310f;

    public e0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.f0 f0Var, r01.u uVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f280310f = f0Var;
        this.f280308d = uVar;
        this.f280309e = z3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.f0 f0Var = this.f280310f;
        f0Var.f280311d.f280113d.b0();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = f0Var.f280311d;
        if (aVar.K) {
            r01.u uVar = this.f280308d;
            if (uVar.f449786b.equals(aVar.f280113d.x())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "try to refresh footer.");
                f0Var.f280311d.f280279h = r01.z.b(uVar.f449786b);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar2 = f0Var.f280311d;
                yb5.d dVar = aVar2.f280113d;
                if (dVar == null || !aVar2.L) {
                    return;
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).n0(this.f280309e);
            }
        }
    }
}
