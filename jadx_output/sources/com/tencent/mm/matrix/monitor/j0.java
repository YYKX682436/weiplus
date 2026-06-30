package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.matrix.monitor.j0 f68771d = new com.tencent.mm.matrix.monitor.j0();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.util.MemInfo[] a17 = com.tencent.matrix.util.MemInfo.f53095p.a();
        com.tencent.mm.matrix.monitor.k0 k0Var = com.tencent.mm.matrix.monitor.k0.f68773a;
        int i17 = 0;
        for (com.tencent.matrix.util.MemInfo memInfo : a17) {
            com.tencent.matrix.util.PssInfo pssInfo = memInfo.f53102m;
            kotlin.jvm.internal.o.d(pssInfo);
            i17 += pssInfo.f53114d;
        }
        com.tencent.mm.matrix.monitor.k0.a(k0Var, a17, 2001, i17, 0L);
        com.tencent.mm.matrix.monitor.k0 k0Var2 = com.tencent.mm.matrix.monitor.k0.f68773a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        for (com.tencent.matrix.util.MemInfo memInfo2 : a17) {
            if (!z17) {
                sb6.append("\n|> SystemInfo: " + memInfo2.f53101i + '\n');
                z17 = true;
            }
            sb6.append("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemInfo <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("|> Process   : ");
            com.tencent.matrix.util.ProcessInfo processInfo = memInfo2.f53097e;
            kotlin.jvm.internal.o.d(processInfo);
            sb7.append(processInfo.f53109e);
            sb7.append('\n');
            sb6.append(sb7.toString());
            sb6.append("|> AMS-Pss   : " + memInfo2.f53102m + '\n');
            sb6.append("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        }
        kotlin.jvm.internal.o.f(sb6.toString(), "toString(...)");
        com.tencent.mm.matrix.monitor.k0 k0Var3 = com.tencent.mm.matrix.monitor.k0.f68773a;
        java.lang.String.valueOf(k0Var3.l(a17));
        k0Var3.j().f299886f.C(1, 1, a17, a17);
        k0Var3.g().f299886f.C(1, 1, a17, a17);
        k0Var3.f().f299886f.C(1, 1, a17, a17);
        k0Var3.e().f299886f.C(1, 1, a17, a17);
        k0Var3.d().f299886f.C(1, 1, a17, a17);
        k0Var3.c().f299886f.C(1, 1, a17, a17);
        k0Var3.b().f299886f.C(1, 1, a17, a17);
        k0Var3.i().f299886f.C(1, 1, a17, a17);
        k0Var3.h().f299886f.C(1, 1, a17, a17);
        com.tencent.mm.matrix.monitor.k0 k0Var4 = com.tencent.mm.matrix.monitor.k0.f68773a;
        java.lang.Object bgStatefulOwner = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE;
        yz5.r mVar = new com.tencent.mm.matrix.monitor.m((long) (1024 * 500.0d));
        if ((32 & 2) != 0) {
            bgStatefulOwner = com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner.INSTANCE;
        }
        if ((32 & 4) != 0) {
            java.util.concurrent.TimeUnit.MINUTES.toMillis(3L);
        }
        if ((32 & 64) != 0) {
            mVar = ji.f.f299879d;
        }
        kotlin.jvm.internal.o.g(bgStatefulOwner, "bgStatefulOwner");
        java.util.concurrent.TimeUnit.MINUTES.toMillis(5L);
        mVar.C(1, 1, a17, a17);
    }
}
