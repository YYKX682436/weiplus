package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes15.dex */
public final class g extends com.tencent.mm.plugin.appbrand.debugger.console.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f77667a;

    /* renamed from: b, reason: collision with root package name */
    public int f77668b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.debugger.console.b f77669c;

    /* renamed from: d, reason: collision with root package name */
    public long f77670d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.Future f77671e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.debugger.console.f f77672f;

    public g(java.lang.String simpleProcessName) {
        kotlin.jvm.internal.o.g(simpleProcessName, "simpleProcessName");
        this.f77667a = simpleProcessName;
        this.f77668b = 2;
        this.f77669c = new com.tencent.mm.plugin.appbrand.debugger.console.b();
        this.f77670d = -1L;
        this.f77672f = new com.tencent.mm.plugin.appbrand.debugger.console.f(this);
    }

    public static final void a(com.tencent.mm.plugin.appbrand.debugger.console.g gVar) {
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsoleDebugLogImpl", "flushLogBuffer");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo.class.getClassLoader());
        com.tencent.mm.plugin.appbrand.debugger.console.b bVar = gVar.f77669c;
        int i17 = bVar.f77646b + 1;
        com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo[] consoleDebugLogImpl$LogInfoArr = new com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo consoleDebugLogImpl$LogInfo = bVar.f77645a[i18];
            kotlin.jvm.internal.o.d(consoleDebugLogImpl$LogInfo);
            consoleDebugLogImpl$LogInfoArr[i18] = consoleDebugLogImpl$LogInfo;
        }
        bVar.f77646b = -1;
        bVar.f77647c = 0;
        bundle.putParcelableArray("BatchLogInfo", consoleDebugLogImpl$LogInfoArr);
        uk0.a.d(bundle, com.tencent.mm.plugin.appbrand.debugger.console.e.f77662a);
        gVar.f77671e = null;
    }

    public final void b(int i17, java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.debugger.console.c(this, i17, str), "ConsoleDebugLog");
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logD(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 3 >= this.f77668b) {
            b(3, "[" + this.f77667a + "] " + str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logE(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 6 >= this.f77668b) {
            b(6, "[" + this.f77667a + ']' + str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logI(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 4 >= this.f77668b) {
            b(4, "[" + this.f77667a + "] " + str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logV(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 2 >= this.f77668b) {
            b(2, "[" + this.f77667a + "] " + str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logW(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (str4 != null && 5 >= this.f77668b) {
            b(5, "[" + this.f77667a + "] " + str4);
        }
    }
}
