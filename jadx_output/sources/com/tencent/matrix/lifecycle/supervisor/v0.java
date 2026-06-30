package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.z0 f52884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.ProcessToken f52885e;

    public v0(com.tencent.matrix.lifecycle.supervisor.z0 z0Var, com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        this.f52884d = z0Var;
        this.f52885e = processToken;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            yz5.q qVar = this.f52884d.f52898e.f52814g;
            if (qVar != null) {
                com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = this.f52885e;
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ProcessSupervisor.Service", th6, "", new java.lang.Object[0]);
        }
    }
}
