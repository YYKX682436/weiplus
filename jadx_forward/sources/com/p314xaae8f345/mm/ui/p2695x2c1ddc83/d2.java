package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289161f;

    public d2(java.lang.String str, int i17, int i18) {
        this.f289159d = str;
        this.f289160e = i17;
        this.f289161f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5("notifymessage");
        if (q57 == null) {
            return;
        }
        int mo78012x3fdd41df = (int) (q57.mo78012x3fdd41df() / 1000);
        int i17 = !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true) ? 1 : 0;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2 f2Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2.f289197a;
        f2Var.a(1, mo78012x3fdd41df, this.f289159d, i17, this.f289160e, q57, this.f289161f);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2.f289199c != q57.I0() || currentTimeMillis - com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2.f289202f > 1000) {
            f2Var.b(1, mo78012x3fdd41df, this.f289159d, this.f289160e, q57, this.f289161f, null);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2.f289202f = currentTimeMillis;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2.f289199c = q57.I0();
    }
}
