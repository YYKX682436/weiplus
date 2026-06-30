package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289597g;

    public s2(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f289594d = str;
        this.f289595e = i17;
        this.f289596f = i18;
        this.f289597g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5("notifymessage");
        int mo78012x3fdd41df = (int) (q57.mo78012x3fdd41df() / 1000);
        int i17 = !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true) ? 1 : 0;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2 f2Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2.f289197a;
        f2Var.a(2, mo78012x3fdd41df, this.f289594d, i17, this.f289595e, q57, this.f289596f);
        f2Var.b(2, mo78012x3fdd41df, this.f289594d, this.f289595e, q57, this.f289596f, this.f289597g);
    }
}
