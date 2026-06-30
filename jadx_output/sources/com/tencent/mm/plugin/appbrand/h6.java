package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class h6 {
    public h6(kotlin.jvm.internal.i iVar) {
    }

    public final void a(boolean z17) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            pm0.v.X(new com.tencent.mm.plugin.appbrand.d6(z17));
            return;
        }
        long j17 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74859i;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74858h) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74859i = android.os.SystemClock.elapsedRealtime();
        final com.tencent.mm.plugin.appbrand.g6 g6Var = new com.tencent.mm.plugin.appbrand.g6(z17);
        if (!kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            g6Var.invoke();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable(g6Var) { // from class: com.tencent.mm.plugin.appbrand.i6

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f78334d;

            {
                kotlin.jvm.internal.o.g(g6Var, "function");
                this.f78334d = g6Var;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f78334d.invoke();
            }
        }, "AppBrandRuntimeSuspendingMMGuardCheckSuspendedEvent");
    }
}
