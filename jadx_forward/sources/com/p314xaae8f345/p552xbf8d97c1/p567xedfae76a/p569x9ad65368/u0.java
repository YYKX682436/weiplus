package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 f134409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea f134410e;

    public u0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 z0Var, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea) {
        this.f134409d = z0Var;
        this.f134410e = c4689x7ffeacea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = this.f134410e;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 z0Var = this.f134409d;
        try {
            yz5.q qVar = z0Var.f134431e.f134347g;
            if (qVar != null) {
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ProcessSupervisor.Service", th6, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d = z0Var.f134431e;
        boolean z17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i;
        serviceC4692xa1b1260d.b().remove(c4689x7ffeacea);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19987x233c02ec.b(c4689x7ffeacea);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KILL: [");
        sb6.append(c4689x7ffeacea.f134325e);
        sb6.append('-');
        sb6.append(c4689x7ffeacea.f134326f);
        sb6.append("] X [");
        sb6.append(z0Var.f134431e.b().size());
        sb6.append(']');
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d2 = z0Var.f134431e;
        sb6.append(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.a(serviceC4692xa1b1260d2, serviceC4692xa1b1260d2.b()));
        oj.j.c("Matrix.ProcessSupervisor.Service", sb6.toString(), new java.lang.Object[0]);
    }
}
