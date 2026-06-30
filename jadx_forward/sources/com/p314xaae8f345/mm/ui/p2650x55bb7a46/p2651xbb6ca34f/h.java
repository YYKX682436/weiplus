package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes9.dex */
public final class h implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k f279951d;

    public h(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar) {
        this.f279951d = kVar;
    }

    @Override // wf0.u1
    public final void h(wf0.r1 r1Var) {
        int i17;
        int i18;
        int i19;
        boolean z17 = false;
        if (r1Var != null && (i17 = r1Var.f527065d) != 3 && (i17 == 2 || i17 == -1 || i17 == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "updateStatus, notifyInfo: " + r1Var.f527063b);
            android.util.SparseArray sparseArray = ze5.ia.f553540n;
            if (r1Var.f527063b == wf0.s1.UPDATE) {
                java.lang.String str = r1Var.f527062a;
                java.lang.String substring = (str == null || !str.contains(ya.b.f77495x8b74a326)) ? str : str.substring(0, str.indexOf(ya.b.f77495x8b74a326));
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.v2 h17 = t21.d3.h(substring);
                if (h17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoItemHolder", "update status, filename %s, videoInfo not found", str);
                } else {
                    fk4.k a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.a(h17.f496549n);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p pVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a;
                    fk4.k kVar = (fk4.k) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282788b.get(java.lang.Long.valueOf(h17.f496549n));
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String str2 = h17.S;
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h18 = t21.d3.h(str2);
                    if (ze5.ia.b() ? (i18 = h17.f496544i) == 104 || i18 == 103 || i18 == 112 || i18 == 120 || i18 == 121 || i18 == 122 || i18 == 199 || a17 != null : (i19 = h17.f496544i) == 112 || i19 == 104 || i19 == 103 || a17 != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ze5.ba(h17, h18, a17, kVar));
                        z17 = true;
                    }
                }
            }
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f(r1Var, this.f279951d));
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.g(this.f279951d));
    }
}
