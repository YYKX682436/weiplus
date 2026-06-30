package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 f134419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea f134420e;

    public w0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 z0Var, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea) {
        this.f134419d = z0Var;
        this.f134420e = c4689x7ffeacea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged: ");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = this.f134420e;
        sb6.append(c4689x7ffeacea.f134327g);
        sb6.append(' ');
        boolean z17 = c4689x7ffeacea.f134328h;
        sb6.append(z17);
        sb6.append(' ');
        java.lang.String str = c4689x7ffeacea.f134326f;
        sb6.append(str);
        oj.j.c("Matrix.ProcessSupervisor.Service", sb6.toString(), new java.lang.Object[0]);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19987x233c02ec.a(c4689x7ffeacea).m41107xaba1ac62(z17);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 z0Var = this.f134419d;
        z0Var.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onProcessStateChanged: supervisor was disabled", new java.lang.Object[0]);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ExplicitBackgroundOwner", c4689x7ffeacea.f134327g)) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d = z0Var.f134431e;
            int i17 = c4689x7ffeacea.f134325e;
            if (!z17) {
                boolean z18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i;
                serviceC4692xa1b1260d.b().remove(c4689x7ffeacea);
                oj.j.c("Matrix.ProcessSupervisor.Service", "FOREGROUND: [" + i17 + '-' + str + "] <- [" + serviceC4692xa1b1260d.b().size() + ']' + com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.a(serviceC4692xa1b1260d, serviceC4692xa1b1260d.b()), new java.lang.Object[0]);
                return;
            }
            boolean z19 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i;
            java.util.concurrent.ConcurrentLinkedQueue b17 = serviceC4692xa1b1260d.b();
            b17.remove(c4689x7ffeacea);
            b17.add(c4689x7ffeacea);
            oj.j.c("Matrix.ProcessSupervisor.Service", "BACKGROUND: [" + i17 + '-' + str + "] -> [" + serviceC4692xa1b1260d.b().size() + ']' + com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.a(serviceC4692xa1b1260d, serviceC4692xa1b1260d.b()), new java.lang.Object[0]);
        }
    }
}
