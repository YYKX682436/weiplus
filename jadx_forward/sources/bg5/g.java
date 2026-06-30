package bg5;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f102282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6726x364c5847 f102284g;

    public g(java.lang.String str, long j17, int i17, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6726x364c5847 c6726x364c5847) {
        this.f102281d = str;
        this.f102282e = j17;
        this.f102283f = i17;
        this.f102284g = c6726x364c5847;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int s96 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().s9(this.f102281d, this.f102282e);
        int i17 = this.f102283f;
        int min = java.lang.Math.min(s96, i17);
        int i18 = i17 - min;
        long j17 = min;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6726x364c5847 c6726x364c5847 = this.f102284g;
        c6726x364c5847.f140650v = j17;
        c6726x364c5847.f140651w = i18;
        c6726x364c5847.k();
    }
}
