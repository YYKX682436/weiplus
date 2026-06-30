package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 f264411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy4.a0 f264412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.n54 f264414g;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 h4Var, hy4.a0 a0Var, java.lang.String str, r45.n54 n54Var) {
        this.f264411d = h4Var;
        this.f264412e = a0Var;
        this.f264413f = str;
        this.f264414g = n54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 h4Var = this.f264411d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v3 v3Var = h4Var.f264452d;
            if (v3Var != null) {
                hy4.a0 a0Var = this.f264412e;
                java.lang.String str = this.f264413f;
                r45.n54 n54Var = this.f264414g;
                v3Var.f264674a = a0Var.f367616d;
                v3Var.f264684k = str;
                v3Var.f264681h = n54Var;
                v3Var.f264683j = (int) (java.lang.System.currentTimeMillis() - v3Var.f264682i);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewEventReporter", "reportWebViewEvent eventType: " + a0Var + ", %s", h4Var.f264452d);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v3 v3Var2 = h4Var.f264452d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v3Var2);
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u3(v3Var2).f152179f, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e4.f264394a);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewEventReporter", th6, "reportEvent exception", new java.lang.Object[0]);
        }
    }
}
