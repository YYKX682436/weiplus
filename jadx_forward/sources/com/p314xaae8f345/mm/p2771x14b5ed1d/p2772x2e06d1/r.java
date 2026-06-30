package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes16.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.p f294190b;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f294193e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f294189a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f294191c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f294192d = new byte[0];

    public r(android.os.Looper looper, com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.p pVar) {
        this.f294190b = null;
        this.f294190b = pVar;
        this.f294193e = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.o(this, looper);
    }

    public final void a() {
        this.f294193e.removeCallbacksAndMessages(null);
        jm5.b.b("Vending.Loader", "clear()", new java.lang.Object[0]);
        synchronized (this.f294192d) {
            this.f294189a.clear();
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd = ((com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.h) this.f294190b).f294181a;
        abstractC22733x77ee84fd.m82254x2377a9fa();
        abstractC22733x77ee84fd.m82232x1e04ef8f();
    }
}
