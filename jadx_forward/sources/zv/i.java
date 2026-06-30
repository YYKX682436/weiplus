package zv;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f557519e;

    public i(java.lang.String str, boolean z17) {
        this.f557518d = str;
        this.f557519e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f557518d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        if (n17 == null || !n17.r2() || !n17.m2() || !n17.l2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: contact not biz service contact!");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if (this.f557519e) {
            Di.Q((java.lang.String[]) kz5.b0.c(str).toArray(new java.lang.String[0]), "service_officialaccounts", true, true);
        }
    }
}
