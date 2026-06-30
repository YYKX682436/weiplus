package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class v3 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final boolean[] f135382a = {false};

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        boolean[] zArr = this.f135382a;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            boolean[] zArr2 = this.f135382a;
            if (zArr2[0]) {
                return;
            }
            zArr2[0] = true;
            try {
                com.p314xaae8f345.mm.app.j3.c(th6);
                com.p314xaae8f345.mm.app.j3.b();
            } catch (java.lang.Throwable unused) {
            }
            java.lang.String H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(th6, false);
            if (H != null) {
                com.p314xaae8f345.mm.app.i4.d(H, 3000L);
                try {
                    com.p314xaae8f345.mm.app.a4.j(H, th6, false);
                } catch (java.lang.Throwable unused2) {
                }
            }
            try {
                com.p314xaae8f345.mm.app.i4.b(thread, H, th6);
            } catch (java.lang.Throwable unused3) {
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1();
            } catch (java.lang.Throwable unused4) {
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/app/MMCrashANRMonitor$1", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/app/MMCrashANRMonitor$1", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    }
}
