package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class x0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.y0 f134423d;

    public x0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.y0 y0Var) {
        this.f134423d = y0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.y0 y0Var = this.f134423d;
        try {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea b17 = y0Var.f134425d.f134431e.f134345e.b(y0Var.f134428g);
            boolean remove = y0Var.f134425d.f134431e.b().remove(b17);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v vVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p c17 = vVar.c();
            c17.getClass();
            boolean b18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19987x233c02ec.b(b17);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p c18 = vVar.c();
            boolean z17 = true;
            c18.b(c18.c(), new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.k(y0Var.f134425d.F3(), b17.f134326f, b17.f134325e, (remove || b18) ? false : true));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(y0Var.f134428g);
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
