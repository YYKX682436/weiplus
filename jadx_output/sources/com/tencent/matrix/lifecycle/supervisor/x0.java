package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class x0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.y0 f52890d;

    public x0(com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken, com.tencent.matrix.lifecycle.supervisor.y0 y0Var) {
        this.f52890d = y0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        com.tencent.matrix.lifecycle.supervisor.y0 y0Var = this.f52890d;
        try {
            com.tencent.matrix.lifecycle.supervisor.ProcessToken b17 = y0Var.f52892d.f52898e.f52812e.b(y0Var.f52895g);
            boolean remove = y0Var.f52892d.f52898e.b().remove(b17);
            com.tencent.matrix.lifecycle.supervisor.v vVar = com.tencent.matrix.lifecycle.supervisor.v.f52883f;
            com.tencent.matrix.lifecycle.supervisor.p c17 = vVar.c();
            c17.getClass();
            boolean b18 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.Companion.b(b17);
            com.tencent.matrix.lifecycle.supervisor.p c18 = vVar.c();
            boolean z17 = true;
            c18.b(c18.c(), new com.tencent.matrix.lifecycle.supervisor.k(y0Var.f52892d.F3(), b17.f52793f, b17.f52792e, (remove || b18) ? false : true));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(y0Var.f52895g);
            sb6.append('-');
            sb6.append(b17);
            sb6.append(" was dead. is LRU kill? ");
            if (remove || b18) {
                z17 = false;
            }
            sb6.append(z17);
            oj.j.c("Matrix.ProcessSupervisor.Service", sb6.toString(), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ProcessSupervisor.Service", th6, "", new java.lang.Object[0]);
        }
    }
}
