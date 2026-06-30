package o24;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f423990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17635x14f80d0b f423991e;

    public e(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17635x14f80d0b c17635x14f80d0b) {
        this.f423990d = bitmap;
        this.f423991e = c17635x14f80d0b;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.a();
        c01.z1.r();
        if (gm0.j1.a()) {
            android.graphics.Bitmap bitmap = this.f423990d;
            if (bitmap != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f.T6(bitmap, com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r() + ".last", true, false));
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            c01.b9.f118602c.b(com.p314xaae8f345.mm.p943x351df9c2.g.c(r17, false, true));
        }
        if (this.f423991e.f243510p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 4, 4);
        }
    }
}
