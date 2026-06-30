package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class z0 extends com.tencent.matrix.lifecycle.supervisor.i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.SupervisorService f52898e;

    public z0(com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService) {
        this.f52898e = supervisorService;
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public java.lang.String F3() {
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "getRecentScene: supervisor was disabled", new java.lang.Object[0]);
            return "";
        }
        boolean z17 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
        return com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52807n;
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void Ka(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) {
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessKillCanceled: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f52898e.f52811d.post(new com.tencent.matrix.lifecycle.supervisor.t0(this, token));
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void a3(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onSceneChanged: supervisor was disabled", new java.lang.Object[0]);
        } else {
            boolean z17 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
            com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52807n = scene;
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void a7(com.tencent.matrix.lifecycle.supervisor.ProcessToken[] tokens, com.tencent.matrix.lifecycle.supervisor.g subordinateProxy) {
        kotlin.jvm.internal.o.g(tokens, "tokens");
        kotlin.jvm.internal.o.g(subordinateProxy, "subordinateProxy");
        int callingPid = android.os.Binder.getCallingPid();
        oj.j.c("Matrix.ProcessSupervisor.Service", "registerSubordinate: tokens(" + tokens.length + ") pid(" + callingPid + ')', new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var != null && true == j0Var.f52844a) {
            this.f52898e.f52811d.post(new com.tencent.matrix.lifecycle.supervisor.y0(this, tokens, subordinateProxy, callingPid));
            return;
        }
        oj.j.b("Matrix.ProcessSupervisor.Service", "registerSubordinate[" + callingPid + "]: supervisor was disabled", new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void fg(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) {
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onStateChanged: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f52898e.f52811d.post(new com.tencent.matrix.lifecycle.supervisor.w0(this, token));
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void g4(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) {
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessRescuedFromKill: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f52898e.f52811d.post(new com.tencent.matrix.lifecycle.supervisor.v0(this, token));
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void lf(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) {
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessKilled: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f52898e.f52811d.post(new com.tencent.matrix.lifecycle.supervisor.u0(this, token));
        }
    }
}
