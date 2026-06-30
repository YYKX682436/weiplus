package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 f280453d;

    public d2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var) {
        this.f280453d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = this.f280453d;
        if (q2Var.f280113d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "[getChatroomMemberDetail] mChattingContext is null!");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(q2Var.f280113d.x());
        if (z07 == null || !z07.Q0()) {
            return;
        }
        java.lang.String x17 = q2Var.f280113d.x();
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a g17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(q2Var.f280113d.x()).g(q2Var.f280113d.x(), z07.D0());
        g17.f273779b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c2(this, x17);
        g17.b();
    }
}
