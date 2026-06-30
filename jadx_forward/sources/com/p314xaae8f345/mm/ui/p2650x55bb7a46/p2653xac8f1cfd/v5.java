package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public class v5 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f281650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 f281651f;

    public v5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.HashSet hashSet) {
        this.f281651f = c6Var;
        this.f281649d = f9Var;
        this.f281650e = hashSet;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281649d;
        java.lang.String z07 = f9Var.z0();
        if (z07 == null || !z07.equals(r1Var.f527062a)) {
            return;
        }
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        java.lang.String str = r1Var.f527062a;
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null || !h17.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "downloadVideoAndFav failed, msgId: %d, fileName: %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "downloadVideoAndFav succeed, msgId: %d, fileName: %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
        java.util.HashSet hashSet = this.f281650e;
        hashSet.remove(valueOf);
        this.f281651f.a(hashSet);
    }
}
