package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class v3 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final boolean[] f53849a = {false};

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        boolean[] zArr = this.f53849a;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            boolean[] zArr2 = this.f53849a;
            if (zArr2[0]) {
                return;
            }
            zArr2[0] = true;
            try {
                com.tencent.mm.app.j3.c(th6);
                com.tencent.mm.app.j3.b();
            } catch (java.lang.Throwable unused) {
            }
            java.lang.String H = com.tencent.mm.sdk.platformtools.t8.H(th6, false);
            if (H != null) {
                com.tencent.mm.app.i4.d(H, 3000L);
                try {
                    com.tencent.mm.app.a4.j(H, th6, false);
                } catch (java.lang.Throwable unused2) {
                }
            }
            try {
                com.tencent.mm.app.i4.b(thread, H, th6);
            } catch (java.lang.Throwable unused3) {
            }
            try {
                com.tencent.mars.xlog.Log.appenderClose();
            } catch (java.lang.Throwable unused4) {
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/app/MMCrashANRMonitor$1", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/app/MMCrashANRMonitor$1", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    }
}
