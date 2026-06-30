package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211097d;

    public o0(java.lang.String str) {
        this.f211097d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(qc0.e1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) c17)).Ai(this.f211097d, true);
        if (Ai != null && Ai.f442906k == -1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5 c17096x4dad80a5 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a;
        if (kz5.c0.i(0, 12, 35, 54, 55, 69, 70, 71, 72, 72, 95, 96, 101, 102, 107, 108, 129, 130, 133, 134).contains(java.lang.Integer.valueOf(Ai != null ? Ai.f442906k : 0))) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select invalid pixelFormat video:");
        sb6.append(Ai != null ? java.lang.Integer.valueOf(Ai.f442906k) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", sb6.toString());
        uo4.a aVar = uo4.a.f511207a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1371L, 127L, 1L);
    }
}
