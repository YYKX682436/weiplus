package cr1;

/* loaded from: classes11.dex */
public final class h implements com.p314xaae8f345.mm.p2470x93e71c27.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public cr1.g f303376d;

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 b() {
        if (this.f303376d == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 c17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c();
            if (c17 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.w) {
                this.f303376d = new cr1.g(c17);
            }
        }
        return this.f303376d;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.m1
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 get(java.lang.String str) {
        if (str != null && r26.i0.n(str, "@bizfansmsg", false)) {
            return b();
        }
        if (str != null && r26.i0.n(str, "@picfansmsg", false)) {
            return b();
        }
        return null;
    }
}
