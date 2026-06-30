package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.g f77649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f77650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77651f;

    public c(com.tencent.mm.plugin.appbrand.debugger.console.g gVar, int i17, java.lang.String str) {
        this.f77649d = gVar;
        this.f77650e = i17;
        this.f77651f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.debugger.console.b bVar = this.f77649d.f77669c;
        com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo consoleDebugLogImpl$LogInfo = new com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo(this.f77650e, this.f77651f);
        bVar.getClass();
        int i17 = (bVar.f77646b + 1) % 100;
        int i18 = bVar.f77647c + consoleDebugLogImpl$LogInfo.f77643f;
        bVar.f77645a[i17] = consoleDebugLogImpl$LogInfo;
        bVar.f77646b = i17;
        bVar.f77647c = i18;
        if (true == (99 <= i17 || 524288 <= i18)) {
            com.tencent.mm.plugin.appbrand.debugger.console.g.a(this.f77649d);
        }
        this.f77649d.f77670d = android.os.SystemClock.elapsedRealtime() + 200;
        com.tencent.mm.plugin.appbrand.debugger.console.g gVar = this.f77649d;
        if (gVar.f77671e == null) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.appbrand.debugger.console.f fVar = this.f77649d.f77672f;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(fVar);
            gVar.f77671e = t0Var.t(fVar, 200L, null);
        }
    }
}
