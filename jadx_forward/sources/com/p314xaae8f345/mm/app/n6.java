package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class n6 extends com.p314xaae8f345.mm.app.r6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f135075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.u6 f135076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(com.p314xaae8f345.mm.app.u6 u6Var, java.lang.String str, boolean z17, boolean z18) {
        super(u6Var, null);
        this.f135076g = u6Var;
        this.f135073d = str;
        this.f135074e = z17;
        this.f135075f = z18;
    }

    public final void b(android.view.View view) {
        long j17;
        boolean z17;
        boolean z18;
        if (this.f135073d.equals("com.tencent.mm.ui.LauncherUI")) {
            this.f135076g.h(com.p314xaae8f345.mm.app.t6.UNTIL_LAUNCHER_UI_FIRST_FRAME_END);
        }
        this.f135076g.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z19 = this.f135074e;
        com.p314xaae8f345.mm.app.u6 u6Var = this.f135076g;
        long j18 = z19 ? u6Var.f135364h : u6Var.f135366m;
        if (z19) {
            com.p314xaae8f345.mm.app.u6 u6Var2 = this.f135076g;
            j17 = u6Var2.f135364h - u6Var2.f135363g;
        } else {
            j17 = 0;
        }
        long j19 = elapsedRealtime - j18;
        com.p314xaae8f345.mm.app.s6 s6Var = this.f135076g.F;
        if (s6Var != null) {
            ((com.p314xaae8f345.mm.app.b3) s6Var).getClass();
            gm0.g2 g2Var = gm0.g2.INSTANCE;
            synchronized (g2Var.f354728d) {
                z18 = g2Var.f354728d[0];
            }
            if (z18) {
                z17 = true;
                this.f135076g.f135374u = true;
                com.p314xaae8f345.mm.app.u6 u6Var3 = this.f135076g;
                u6Var3.f135373t = true;
                u6Var3.f135372s = false;
                if (this.f135074e || j19 - (uptimeMillis - u6Var3.f135365i) <= 1000) {
                    ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.app.m6(this, z17, j17, j19), java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
                } else {
                    com.p314xaae8f345.mm.app.p5.f("MicroMsg.StartupCostReporter", "[tomys] Hibernate happened during startup, ignore report this time.", new java.lang.Object[0]);
                    return;
                }
            }
        }
        z17 = false;
        this.f135076g.f135374u = true;
        com.p314xaae8f345.mm.app.u6 u6Var32 = this.f135076g;
        u6Var32.f135373t = true;
        u6Var32.f135372s = false;
        if (this.f135074e) {
        }
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.app.m6(this, z17, j17, j19), java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
    }
}
