package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class m0 {
    public m0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2 > 10) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.matrix.lifecycle.supervisor.m0 a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "Matrix.ProcessSupervisor.Service"
            r1 = 0
            com.tencent.matrix.lifecycle.supervisor.SupervisorService r2 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52809p     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L34
            java.lang.String r2 = "duplicated start"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5f
            oj.j.b(r0, r2, r3)     // Catch: java.lang.Throwable -> L5f
            boolean r2 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52806m     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L21
            int r2 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52808o     // Catch: java.lang.Throwable -> L5f
            int r3 = r2 + 1
            com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52808o = r3     // Catch: java.lang.Throwable -> L5f
            r3 = 10
            if (r2 <= r3) goto L67
        L21:
            com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52808o = r1     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "Self Disconnected, try to restart service"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5f
            oj.j.b(r0, r2, r3)     // Catch: java.lang.Throwable -> L5f
            com.tencent.matrix.lifecycle.supervisor.SupervisorService r2 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52809p     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L31
            r2.stopSelf()     // Catch: java.lang.Throwable -> L5f
        L31:
            r2 = 0
            com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52809p = r2     // Catch: java.lang.Throwable -> L5f
        L34:
            com.tencent.matrix.lifecycle.supervisor.d0 r2 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k     // Catch: java.lang.Throwable -> L5f
            r2.getClass()     // Catch: java.lang.Throwable -> L5f
            com.tencent.matrix.lifecycle.supervisor.j0 r2 = com.tencent.matrix.lifecycle.supervisor.d0.f52827d     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L56
            boolean r2 = r2.f52844a     // Catch: java.lang.Throwable -> L5f
            r3 = 1
            if (r3 == r2) goto L43
            goto L56
        L43:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L5f
            java.lang.Class<com.tencent.matrix.lifecycle.supervisor.SupervisorService> r3 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.class
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5f
            r5.startService(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = "start service"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5f
            oj.j.c(r0, r5, r2)     // Catch: java.lang.Throwable -> L5f
            goto L67
        L56:
            java.lang.String r5 = "start: supervisor was disabled"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5f
            oj.j.b(r0, r5, r2)     // Catch: java.lang.Throwable -> L5f
            goto L67
        L5f:
            r5 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            oj.j.d(r0, r5, r2, r1)
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.supervisor.m0.a(android.content.Context):com.tencent.matrix.lifecycle.supervisor.m0");
    }
}
