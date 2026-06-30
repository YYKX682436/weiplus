package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.b0 f52823d = new com.tencent.matrix.lifecycle.supervisor.b0();

    public b0() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i != false) goto L21;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            com.tencent.matrix.lifecycle.supervisor.d0 r0 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k
            r0.getClass()
            android.app.Application r0 = com.tencent.matrix.lifecycle.supervisor.d0.f52826c
            if (r0 == 0) goto L70
            r0 = 0
            r1 = 0
            android.app.Application r2 = com.tencent.matrix.lifecycle.supervisor.d0.f52826c     // Catch: java.lang.Throwable -> L41
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Throwable -> L41
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L41
            android.app.Application r3 = com.tencent.matrix.lifecycle.supervisor.d0.f52826c     // Catch: java.lang.Throwable -> L41
            kotlin.jvm.internal.o.d(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L41
            r4 = 4
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: java.lang.Throwable -> L41
            android.content.pm.ServiceInfo[] r2 = r2.services     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "application!!.packageMan…ES\n            ).services"
            kotlin.jvm.internal.o.f(r2, r3)     // Catch: java.lang.Throwable -> L41
            int r3 = r2.length     // Catch: java.lang.Throwable -> L41
            r4 = r1
        L2b:
            if (r4 >= r3) goto L4b
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = r5.name     // Catch: java.lang.Throwable -> L41
            java.lang.Class<com.tencent.matrix.lifecycle.supervisor.SupervisorService> r7 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.class
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L41
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L3e
            goto L4c
        L3e:
            int r4 = r4 + 1
            goto L2b
        L41:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Matrix.ProcessSupervisor"
            java.lang.String r5 = ""
            oj.j.d(r4, r2, r5, r3)
        L4b:
            r5 = r0
        L4c:
            com.tencent.matrix.lifecycle.supervisor.d0 r2 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k
            r2.getClass()
            android.app.Application r2 = com.tencent.matrix.lifecycle.supervisor.d0.f52826c
            kotlin.jvm.internal.o.d(r2)
            java.lang.String r2 = oj.m.b(r2)
            if (r5 == 0) goto L5e
            java.lang.String r0 = r5.processName
        L5e:
            boolean r0 = kotlin.jvm.internal.o.b(r2, r0)
            if (r0 != 0) goto L6a
            boolean r0 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i
            boolean r0 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i
            if (r0 == 0) goto L6b
        L6a:
            r1 = 1
        L6b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Supervisor NOT initialized yet or Supervisor is disabled!!!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.supervisor.b0.invoke():java.lang.Object");
    }
}
