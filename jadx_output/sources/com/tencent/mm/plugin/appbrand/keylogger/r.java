package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.plugin.appbrand.keylogger.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84171a;

    public r(com.tencent.mm.plugin.appbrand.keylogger.v vVar, java.lang.String str) {
        this.f84171a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.keylogger.u
    public void a(kg1.e eVar) {
        com.tencent.mm.plugin.appbrand.report.quality.w1 w1Var = (com.tencent.mm.plugin.appbrand.report.quality.w1) eVar;
        java.lang.String str = this.f84171a;
        if (str == null) {
            w1Var.getClass();
            return;
        }
        java.lang.String[] b17 = w1Var.c().b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        int length = b17.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String str2 = b17[i17];
            if (r26.i0.y(str2 == null ? "" : str2, str, false)) {
                com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a.c().remove(str2);
            }
        }
        w1Var.c().putBoolean(str, true);
        w1Var.c().putLong(str.concat("_PROCESS_START_TICK"), android.os.SystemClock.elapsedRealtime());
        w1Var.c().remove(str.concat("_RUNNING_RESOURCE_PREPARING"));
    }
}
