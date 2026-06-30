package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.z0 f52886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.ProcessToken f52887e;

    public w0(com.tencent.matrix.lifecycle.supervisor.z0 z0Var, com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        this.f52886d = z0Var;
        this.f52887e = processToken;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged: ");
        com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = this.f52887e;
        sb6.append(processToken.f52794g);
        sb6.append(' ');
        boolean z17 = processToken.f52795h;
        sb6.append(z17);
        sb6.append(' ');
        java.lang.String str = processToken.f52793f;
        sb6.append(str);
        oj.j.c("Matrix.ProcessSupervisor.Service", sb6.toString(), new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.Companion.a(processToken).onStateChanged(z17);
        com.tencent.matrix.lifecycle.supervisor.z0 z0Var = this.f52886d;
        z0Var.getClass();
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessStateChanged: supervisor was disabled", new java.lang.Object[0]);
            return;
        }
        if (kotlin.jvm.internal.o.b("ExplicitBackgroundOwner", processToken.f52794g)) {
            com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService = z0Var.f52898e;
            int i17 = processToken.f52792e;
            if (!z17) {
                boolean z18 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
                supervisorService.b().remove(processToken);
                oj.j.c("Matrix.ProcessSupervisor.Service", "FOREGROUND: [" + i17 + '-' + str + "] <- [" + supervisorService.b().size() + ']' + com.tencent.matrix.lifecycle.supervisor.SupervisorService.a(supervisorService, supervisorService.b()), new java.lang.Object[0]);
                return;
            }
            boolean z19 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
            java.util.concurrent.ConcurrentLinkedQueue b17 = supervisorService.b();
            b17.remove(processToken);
            b17.add(processToken);
            oj.j.c("Matrix.ProcessSupervisor.Service", "BACKGROUND: [" + i17 + '-' + str + "] -> [" + supervisorService.b().size() + ']' + com.tencent.matrix.lifecycle.supervisor.SupervisorService.a(supervisorService, supervisorService.b()), new java.lang.Object[0]);
        }
    }
}
