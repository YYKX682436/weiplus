package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.z f52891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.matrix.lifecycle.supervisor.z zVar) {
        super(0);
        this.f52891d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.matrix.lifecycle.supervisor.z zVar = this.f52891d;
        com.tencent.matrix.lifecycle.supervisor.a0 a0Var = zVar.f52896d;
        com.tencent.matrix.lifecycle.supervisor.a0 a0Var2 = zVar.f52896d;
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        java.lang.String b17 = d0Var.b();
        try {
            a0Var2.f52818d.bindService(a0Var2.f52819e, a0Var, 32);
            com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52800e.a(a0Var2.f52818d);
            oj.j.c(d0Var.b(), "subordinate pacemaker rebound supervisor", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d(b17, th6, "", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
