package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi.h1 f67576e;

    public g(java.lang.String str, gi.h1 h1Var) {
        this.f67575d = str;
        this.f67576e = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryMonitorService", "traceEnd: " + this.f67575d);
        final gi.h1 h1Var = this.f67576e;
        final java.lang.String str = this.f67575d;
        synchronized (h1Var.f272038b) {
            if (((java.util.HashMap) h1Var.f272038b).containsKey(str)) {
                h1Var.f395294a.f363337f.post(new java.lang.Runnable() { // from class: gi.h1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        gi.h1 h1Var2 = gi.h1.this;
                        java.lang.String str2 = str;
                        synchronized (h1Var2.f272038b) {
                            gi.l1 l1Var = (gi.l1) ((java.util.HashMap) h1Var2.f272038b).remove(str2);
                            if (l1Var != null) {
                                h1Var2.k(l1Var, false);
                                final rh.c1 c1Var = l1Var.f272068c;
                                c1Var.q(new wh.t0() { // from class: gi.h1$$d
                                    @Override // wh.t0
                                    public final void accept(java.lang.Object obj) {
                                        rh.c1 c1Var2 = rh.c1.this;
                                        gi.w0 w0Var = (gi.w0) c1Var2;
                                        if (w0Var.P()) {
                                            qh.u uVar = new qh.u();
                                            uVar.i();
                                            java.lang.StringBuilder sb6 = uVar.f363387a;
                                            sb6.append((java.lang.Object) "| ModuleTest: '");
                                            sb6.append((java.lang.Object) w0Var.z());
                                            uVar.a("'\n");
                                            new ri.m().a(c1Var2, uVar);
                                            uVar.f();
                                            uVar.d();
                                            new ri.n("module").a(c1Var2);
                                        }
                                    }
                                });
                            }
                        }
                    }
                });
            }
        }
    }
}
