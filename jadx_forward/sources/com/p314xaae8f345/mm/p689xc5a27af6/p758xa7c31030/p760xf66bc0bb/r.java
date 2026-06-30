package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class r implements com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.n, yz5.l {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f149241g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f149242h;

    /* renamed from: d, reason: collision with root package name */
    public final long f149243d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f149244e;

    /* renamed from: f, reason: collision with root package name */
    public volatile wu5.c f149245f;

    static {
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.q qVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.q(null);
        f149241g = new java.util.ArrayList();
        f149242h = new java.util.HashMap();
        try {
            if (ph.t.f435816k == null) {
                synchronized ("Matrix.battery.LifeCycle") {
                    if (ph.t.f435816k == null) {
                        throw new java.lang.IllegalStateException("Call #init() first!".toString());
                    }
                }
            }
            ph.t tVar = ph.t.f435816k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
            tVar.b(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.o(qVar));
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.BgScheduler", th6, "", new java.lang.Object[0]);
        }
    }

    public r(long j17) {
        this.f149243d = j17;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f149244e = wh.m.w(context);
        f149242h.put(java.lang.Long.valueOf(j17), null);
        f149241g.add(this);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.n
    public boolean R0() {
        return this.f149244e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f149244e = ((java.lang.Boolean) obj).booleanValue();
        return jz5.f0.f384359a;
    }
}
