package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class s implements com.tencent.mm.plugin.appbrand.keylogger.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84172a;

    public s(com.tencent.mm.plugin.appbrand.keylogger.v vVar, java.lang.String str) {
        this.f84172a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.keylogger.u
    public void a(kg1.e eVar) {
        com.tencent.mm.plugin.appbrand.report.quality.w1 w1Var = (com.tencent.mm.plugin.appbrand.report.quality.w1) eVar;
        java.lang.String str = this.f84172a;
        if (str == null) {
            w1Var.getClass();
            return;
        }
        long j17 = w1Var.c().getLong(str.concat("_PROCESS_START_TICK"), com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a.c().W(str.concat("_PROCESS_START_TICK"));
        if (j17 < com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProcessEnd id:");
            sb6.append(str);
            sb6.append(", cost:");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", sb6.toString());
        }
        w1Var.c().remove(str);
        w1Var.c().remove(str.concat("_RUNNING_RESOURCE_PREPARING"));
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            com.tencent.mm.plugin.appbrand.report.d.f(false);
        }
    }
}
