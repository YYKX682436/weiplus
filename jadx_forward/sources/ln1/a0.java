package ln1;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401244d;

    /* renamed from: e, reason: collision with root package name */
    public final ln1.b0 f401245e;

    /* renamed from: f, reason: collision with root package name */
    public final long f401246f;

    /* renamed from: g, reason: collision with root package name */
    public final long f401247g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f401248h;

    /* renamed from: i, reason: collision with root package name */
    public final int f401249i;

    /* renamed from: m, reason: collision with root package name */
    public final ln1.s f401250m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f401251n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f401252o;

    public a0(java.lang.String str, ln1.s sVar, java.lang.String str2, int i17, long j17, long j18, java.lang.String str3, java.lang.String str4, ln1.b0 b0Var) {
        this.f401252o = "";
        this.f401244d = str3;
        this.f401245e = b0Var;
        this.f401246f = j17;
        this.f401247g = j18;
        this.f401248h = str4;
        this.f401249i = i17;
        this.f401250m = sVar;
        this.f401251n = str2;
        this.f401252o = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.s sVar = this.f401250m;
        int i17 = sVar.f401336d.e().f391144c - 1;
        final int i18 = this.f401249i;
        final boolean z17 = i18 == i17;
        final com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 b3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b3(!z17);
        sn1.g0 g0Var = new sn1.g0(this.f401251n, this.f401246f, this.f401247g, this.f401244d, this.f401248h, new com.p314xaae8f345.mm.p944x882e457a.u0() { // from class: ln1.a0$$a
            @Override // com.p314xaae8f345.mm.p944x882e457a.u0
            /* renamed from: onSceneEnd */
            public final void mo815x76e0bfae(int i19, int i27, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 b3Var2 = b3Var;
                ln1.a0 a0Var = ln1.a0.this;
                a0Var.getClass();
                int i28 = kn1.f.f391134g;
                if (i28 == 1 || i28 == 21 || i28 == 22) {
                    ln1.s sVar2 = a0Var.f401250m;
                    int i29 = sVar2.f401336d.e().f391143b;
                    int i37 = i18 + 1;
                    if (i29 < i37) {
                        kn1.f fVar = sVar2.f401336d;
                        int i38 = fVar.e().f391144c;
                        kn1.g e17 = fVar.e();
                        if (i37 > i38) {
                            i37 = i38;
                        }
                        e17.f391143b = i37;
                        kn1.g e18 = fVar.e();
                        e18.getClass();
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        sVar2.f401335c.a(e18.f391142a);
                    }
                }
                java.lang.String str2 = ((sn1.g0) m1Var).f491542v.f529046g;
                boolean z19 = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f401252o, "Send Tag finish last:%b  cv:%s [%d,%d,%s] tag[%s,%s]", java.lang.Boolean.valueOf(z19), b3Var2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, a0Var.f401244d, str2);
                if (z19 && a0Var.f401244d.equals(str2)) {
                    b3Var2.c();
                }
                ln1.b0 b0Var = a0Var.f401245e;
                if (b0Var != null) {
                    ((ln1.C29097x5b3bb17) b0Var).f401287a.f401286d.addAndGet(-1);
                }
            }
        });
        g0Var.K();
        java.lang.Object[] objArr = {this.f401251n, this.f401244d, java.lang.Integer.valueOf(g0Var.f491557d)};
        java.lang.String str = this.f401252o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "SendTagRunnable doScene talker:%s, tagTextClientId:%s, seq:%d", objArr);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "sendTag last Session :[%d/%d] wait tag resp callback .", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(sVar.f401336d.e().f391144c - 1));
        }
    }

    /* renamed from: toString */
    public java.lang.String m146095x9616526c() {
        return this.f401252o + ".sendTag";
    }
}
