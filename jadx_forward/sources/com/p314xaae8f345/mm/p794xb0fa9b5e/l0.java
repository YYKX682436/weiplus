package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes12.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f149899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.m0 f149900e;

    public l0(com.p314xaae8f345.mm.p794xb0fa9b5e.m0 m0Var, java.lang.Runnable runnable) {
        this.f149900e = m0Var;
        this.f149899d = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            qk0.a r0 = new qk0.a
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.String r2 = "sThreadLocal"
            r0.<init>(r1, r2)
            monitor-enter(r0)
            r1 = 1
            java.lang.Object r1 = r0.a(r1)     // Catch: java.lang.Throwable -> L11 java.lang.IllegalArgumentException -> L13 java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L2d
            goto L3a
        L11:
            r1 = move-exception
            goto L6e
        L13:
            r1 = move-exception
            java.lang.String r2 = "SDK.ReflectStaticFieldSmith"
            java.lang.String r3 = "getWithoutThrow, exception occur :%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L11
            rk0.c.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L11
            goto L39
        L20:
            r1 = move-exception
            java.lang.String r2 = "SDK.ReflectStaticFieldSmith"
            java.lang.String r3 = "getWithoutThrow, exception occur :%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L11
            rk0.c.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L11
            goto L39
        L2d:
            r1 = move-exception
            java.lang.String r2 = "SDK.ReflectStaticFieldSmith"
            java.lang.String r3 = "getWithoutThrow, exception occur :%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L11
            rk0.c.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L11
        L39:
            r1 = 0
        L3a:
            monitor-exit(r0)
            java.lang.ThreadLocal r1 = (java.lang.ThreadLocal) r1
            if (r1 == 0) goto L5d
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L5d
            java.lang.String r0 = "IPC.ExecutorServiceCreatorImpl"
            java.lang.String r2 = "create a new Looper ThreadLocal variable."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            rk0.c.a(r0, r2, r3)
            com.tencent.mm.ipcinvoker.m0 r0 = r4.f149900e
            com.tencent.mm.ipcinvoker.q0 r0 = r0.f149906e
            android.os.HandlerThread r0 = r0.f149927a
            android.os.Looper r0 = r0.getLooper()
            r1.set(r0)
            goto L68
        L5d:
            java.lang.String r0 = "IPC.ExecutorServiceCreatorImpl"
            java.lang.String r2 = "ThreadLocal Looper variable is null or has set.(%s)"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            rk0.c.a(r0, r2, r1)
        L68:
            java.lang.Runnable r0 = r4.f149899d
            r0.run()
            return
        L6e:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p794xb0fa9b5e.l0.run():void");
    }
}
