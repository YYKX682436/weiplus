package su4;

/* loaded from: classes8.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f494445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f494446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f494447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f494448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f494449i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494450m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f494451n;

    public h3(java.lang.String str, long j17, int i17, int i18, int i19, long j18, java.lang.String str2, int i27) {
        this.f494444d = str;
        this.f494445e = j17;
        this.f494446f = i17;
        this.f494447g = i18;
        this.f494448h = i19;
        this.f494449i = j18;
        this.f494450m = str2;
        this.f494451n = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().l(68377, null)) ? 1 : 0;
        int i18 = 0;
        int f17 = ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi()).f() : 0;
        if (f17 > 0) {
            i18 = 2;
        } else {
            f17 = 0;
            if (i17 > 0) {
                i18 = 1;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6977x73beccc c6977x73beccc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6977x73beccc();
        c6977x73beccc.f142858d = c6977x73beccc.b("RedDotId", this.f494444d, true);
        c6977x73beccc.f142858d = c6977x73beccc.b("RedDotId", java.lang.String.valueOf(this.f494445e), true);
        c6977x73beccc.f142859e = c6977x73beccc.b("NetType", com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b(), true);
        c6977x73beccc.f142860f = this.f494446f;
        c6977x73beccc.f142861g = this.f494447g;
        c6977x73beccc.f142862h = this.f494448h;
        c6977x73beccc.f142863i = this.f494449i;
        c6977x73beccc.f142864j = c6977x73beccc.b("NotShowReason", this.f494450m, true);
        c6977x73beccc.f142865k = i18;
        c6977x73beccc.f142866l = f17;
        c6977x73beccc.f142867m = this.f494451n;
        c6977x73beccc.k();
        c6977x73beccc.o();
    }
}
