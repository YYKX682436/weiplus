package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class z0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d f134431e;

    public z0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d) {
        this.f134431e = serviceC4692xa1b1260d;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public java.lang.String F3() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "getRecentScene: supervisor was disabled", new java.lang.Object[0]);
            return "";
        }
        boolean z17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i;
        return com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134340n;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void Ka(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessKillCanceled: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f134431e.f134344d.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.t0(this, token));
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void a3(java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onSceneChanged: supervisor was disabled", new java.lang.Object[0]);
        } else {
            boolean z17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134340n = scene;
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void a7(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[] tokens, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g subordinateProxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokens, "tokens");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subordinateProxy, "subordinateProxy");
        int callingPid = android.os.Binder.getCallingPid();
        oj.j.c("Matrix.ProcessSupervisor.Service", "registerSubordinate: tokens(" + tokens.length + ") pid(" + callingPid + ')', new java.lang.Object[0]);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var != null && true == j0Var.f134377a) {
            this.f134431e.f134344d.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.y0(this, tokens, subordinateProxy, callingPid));
            return;
        }
        oj.j.b("Matrix.ProcessSupervisor.Service", "registerSubordinate[" + callingPid + "]: supervisor was disabled", new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void fg(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onStateChanged: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f134431e.f134344d.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.w0(this, token));
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void g4(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessRescuedFromKill: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f134431e.f134344d.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v0(this, token));
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void lf(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessKilled: supervisor was disabled", new java.lang.Object[0]);
        } else {
            this.f134431e.f134344d.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.u0(this, token));
        }
    }
}
