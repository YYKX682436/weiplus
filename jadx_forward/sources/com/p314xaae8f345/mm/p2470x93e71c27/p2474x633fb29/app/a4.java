package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class a4 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b4 f270334a;

    public a4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b4 b4Var) {
        this.f270334a = b4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b4 b4Var = this.f270334a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4 c4Var = b4Var.f270352d;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4 c4Var2 = b4Var.f270352d;
        c4Var.f270375t = elapsedRealtime - c4Var2.f270374s;
        c4Var2.H((i17 == 0 && i18 == 0) ? 0 : i18);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4 c4Var3 = b4Var.f270352d;
        c4Var3.f270363e.mo815x76e0bfae(i17, i18, "", c4Var3);
    }
}
