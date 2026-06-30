package yv1;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f547709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f547710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f547711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yv1.n0 f547712g;

    public v0(java.util.List list, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, long j17, yv1.n0 n0Var) {
        this.f547709d = list;
        this.f547710e = c26987xeef691ab;
        this.f547711f = j17;
        this.f547712g = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete FTS, talker count: ");
        java.util.List<java.lang.String> list = this.f547709d;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", sb6.toString());
        try {
            c01.j8 j8Var = (c01.j8) i95.n0.c(c01.j8.class);
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f547710e;
            long j17 = this.f547711f;
            yv1.n0 n0Var = this.f547712g;
            for (java.lang.String str : list) {
                if (c26987xeef691ab != null) {
                    c26987xeef691ab.m108011xf4ed245c();
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3) j8Var).Ai(str, j17);
                int[] iArr = n0Var.f547651i;
                iArr[3] = iArr[3] + 1;
                n0Var.a();
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Done delete FTS.");
    }
}
