package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f149096g = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final int f149097d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f149098e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f149099f;

    public f(int i17, java.lang.String moduleName, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        this.f149097d = i17;
        this.f149098e = moduleName;
        this.f149099f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph.u e17;
        gi.h1 h1Var;
        if (this.f149099f) {
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d dVar = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q.f149163d;
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar) == null || (e17 = gi.d.e()) == null || (h1Var = (gi.h1) e17.f435829h.i(gi.h1.class)) == null) {
            return;
        }
        android.os.Handler a17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        a17.post(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.e(this, h1Var));
    }
}
