package com.p314xaae8f345.mm.p959x883644fd;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* loaded from: classes12.dex */
public class t0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final pq5.i f153118d = new pq5.i(new com.p314xaae8f345.mm.p959x883644fd.l0(this));

    /* renamed from: e, reason: collision with root package name */
    public final pq5.i f153119e = new pq5.i(new com.p314xaae8f345.mm.p959x883644fd.m0(this));

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f153120f = new com.p314xaae8f345.mm.p959x883644fd.o0(this);

    public static com.p314xaae8f345.mm.p959x883644fd.a0 Ai() {
        gm0.j1.b().c();
        return (com.p314xaae8f345.mm.p959x883644fd.a0) ((com.p314xaae8f345.mm.p959x883644fd.t0) i95.n0.c(com.p314xaae8f345.mm.p959x883644fd.t0.class)).f153118d.a();
    }

    public static com.p314xaae8f345.mm.p959x883644fd.p wi() {
        gm0.j1.b().c();
        return (com.p314xaae8f345.mm.p959x883644fd.p) ((com.p314xaae8f345.mm.p959x883644fd.t0) i95.n0.c(com.p314xaae8f345.mm.p959x883644fd.t0.class)).f153119e.a();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        gm0.j1.i();
        gm0.b0 u17 = gm0.j1.u();
        u17.f354682b.v(new com.p314xaae8f345.mm.p959x883644fd.q0(this));
        gm0.j1.n().a(this.f153120f);
        c01.n8.f118881a = new com.p314xaae8f345.mm.p959x883644fd.s0(this);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        gm0.j1.n().d(this.f153120f);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        gm0.j1.i();
        gm0.y n17 = gm0.j1.n();
        n17.f354820a.v(new com.p314xaae8f345.mm.p959x883644fd.p0(this));
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p959x883644fd.i0.f153044a;
        try {
            if (context2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "registerReceiver ctx == null");
            } else {
                com.p314xaae8f345.mm.p959x883644fd.h0 h0Var = new com.p314xaae8f345.mm.p959x883644fd.h0(null);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
                context2.registerReceiver(h0Var, intentFilter);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "registerReceiver finish");
            }
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "registerReceiver : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
    }
}
