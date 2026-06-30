package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.z0 f52876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.ProcessToken f52877e;

    public u0(com.tencent.matrix.lifecycle.supervisor.z0 z0Var, com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        this.f52876d = z0Var;
        this.f52877e = processToken;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = this.f52877e;
        com.tencent.matrix.lifecycle.supervisor.z0 z0Var = this.f52876d;
        try {
            yz5.q qVar = z0Var.f52898e.f52814g;
            if (qVar != null) {
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ProcessSupervisor.Service", th6, "", new java.lang.Object[0]);
        }
        com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService = z0Var.f52898e;
        boolean z17 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
        supervisorService.b().remove(processToken);
        com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.Companion.b(processToken);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KILL: [");
        sb6.append(processToken.f52792e);
        sb6.append('-');
        sb6.append(processToken.f52793f);
        sb6.append("] X [");
        sb6.append(z0Var.f52898e.b().size());
        sb6.append(']');
        com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService2 = z0Var.f52898e;
        sb6.append(com.tencent.matrix.lifecycle.supervisor.SupervisorService.a(supervisorService2, supervisorService2.b()));
        oj.j.c("Matrix.ProcessSupervisor.Service", sb6.toString(), new java.lang.Object[0]);
    }
}
