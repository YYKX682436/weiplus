package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes16.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Looper f294206a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Looper f294207b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f294208c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f294209d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f294210e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.x f294211f;

    public y(android.os.Looper looper, android.os.Looper looper2) {
        this.f294206a = looper;
        this.f294207b = looper2;
        this.f294208c = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.v(this, looper);
        this.f294209d = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.w(this, looper2);
    }

    public final void a(int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.r rVar;
        fm5.d dVar;
        fm5.d dVar2;
        if (android.os.Looper.myLooper() != this.f294206a) {
            if (android.os.Looper.myLooper() == this.f294207b) {
                android.os.Handler handler = this.f294208c;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(i17, obj));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.x xVar = this.f294211f;
        if (xVar == null) {
            jm5.b.c("Vending.VendingSync", "This call is pointless.", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd = ((com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.e) xVar).f294178a;
        jm5.b.b("Vending", "%s beforeSynchronize", abstractC22733x77ee84fd);
        rVar = abstractC22733x77ee84fd.f39773xe0156e0;
        rVar.a();
        synchronized (this.f294210e) {
            android.os.Handler handler2 = this.f294209d;
            handler2.sendMessageAtFrontOfQueue(handler2.obtainMessage(i17, obj));
            try {
                this.f294210e.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.e eVar = (com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.e) this.f294211f;
        jm5.b.b("Vending", "%s afterSynchronize", eVar.f294178a);
        dVar = eVar.f294178a.f39768xe37f4062;
        if (dVar != null) {
            dVar2 = eVar.f294178a.f39768xe37f4062;
            synchronized (dVar2) {
                dVar2.v(null);
            }
        }
    }
}
