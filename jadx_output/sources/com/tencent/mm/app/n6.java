package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class n6 extends com.tencent.mm.app.r6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f53541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f53542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.u6 f53543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(com.tencent.mm.app.u6 u6Var, java.lang.String str, boolean z17, boolean z18) {
        super(u6Var, null);
        this.f53543g = u6Var;
        this.f53540d = str;
        this.f53541e = z17;
        this.f53542f = z18;
    }

    public final void b(android.view.View view) {
        long j17;
        boolean z17;
        boolean z18;
        if (this.f53540d.equals("com.tencent.mm.ui.LauncherUI")) {
            this.f53543g.h(com.tencent.mm.app.t6.UNTIL_LAUNCHER_UI_FIRST_FRAME_END);
        }
        this.f53543g.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z19 = this.f53541e;
        com.tencent.mm.app.u6 u6Var = this.f53543g;
        long j18 = z19 ? u6Var.f53831h : u6Var.f53833m;
        if (z19) {
            com.tencent.mm.app.u6 u6Var2 = this.f53543g;
            j17 = u6Var2.f53831h - u6Var2.f53830g;
        } else {
            j17 = 0;
        }
        long j19 = elapsedRealtime - j18;
        com.tencent.mm.app.s6 s6Var = this.f53543g.F;
        if (s6Var != null) {
            ((com.tencent.mm.app.b3) s6Var).getClass();
            gm0.g2 g2Var = gm0.g2.INSTANCE;
            synchronized (g2Var.f273195d) {
                z18 = g2Var.f273195d[0];
            }
            if (z18) {
                z17 = true;
                this.f53543g.f53841u = true;
                com.tencent.mm.app.u6 u6Var3 = this.f53543g;
                u6Var3.f53840t = true;
                u6Var3.f53839s = false;
                if (this.f53541e || j19 - (uptimeMillis - u6Var3.f53832i) <= 1000) {
                    ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.app.m6(this, z17, j17, j19), java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
                } else {
                    com.tencent.mm.app.p5.f("MicroMsg.StartupCostReporter", "[tomys] Hibernate happened during startup, ignore report this time.", new java.lang.Object[0]);
                    return;
                }
            }
        }
        z17 = false;
        this.f53543g.f53841u = true;
        com.tencent.mm.app.u6 u6Var32 = this.f53543g;
        u6Var32.f53840t = true;
        u6Var32.f53839s = false;
        if (this.f53541e) {
        }
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.app.m6(this, z17, j17, j19), java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
    }
}
