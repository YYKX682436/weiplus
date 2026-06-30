package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class pe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.he f291037d;

    public pe(com.p314xaae8f345.mm.ui.he heVar) {
        this.f291037d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int q17;
        if (gm0.j1.a()) {
            q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c01.d9.b().p().l(143618, null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UnreadCountHelper", "getAddrTabUnreadCount, but mmcore not ready");
            q17 = 0;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.oe(this, q17));
    }
}
