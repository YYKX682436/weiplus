package y24;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 f540653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f540654e;

    public a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 c6868x3446b505, int i17) {
        this.f540653d = c6868x3446b505;
        this.f540654e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 c6868x3446b505 = this.f540653d;
        if (c6868x3446b505 == null) {
            c6868x3446b505 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505();
        }
        c6868x3446b505.f141857d = this.f540654e;
        c6868x3446b505.f141868o = c6868x3446b505.b("SessionID", y24.b.f540655a, true);
        c6868x3446b505.f141858e = java.lang.System.currentTimeMillis();
        c6868x3446b505.f141866m = y24.b.f540657c;
        c6868x3446b505.f141865l = y24.b.f540656b;
        c6868x3446b505.k();
    }
}
