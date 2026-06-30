package vn2;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f519888a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f519889b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f519890c;

    /* renamed from: d, reason: collision with root package name */
    public long f519891d;

    /* renamed from: e, reason: collision with root package name */
    public long f519892e;

    /* renamed from: f, reason: collision with root package name */
    public long f519893f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f519894g;

    /* renamed from: h, reason: collision with root package name */
    public int f519895h;

    public q(java.lang.String finderContextId) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContextId, "finderContextId");
        this.f519888a = finderContextId;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        this.f519889b = z18;
        this.f519894g = "";
    }

    public final void a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        d("onStop " + this.f519894g);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519890c, activity)) {
            this.f519890c = null;
        }
    }

    public final void b() {
        this.f519891d = java.lang.System.currentTimeMillis();
        d("pageIn pageInEnterTimeMs=" + this.f519891d);
    }

    public final void c() {
        d("pageOut pageInEnterTimeMs=" + this.f519891d);
        java.lang.String str = this.f519894g;
        if (this.f519891d > 0) {
            r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f519891d;
            long j18 = currentTimeMillis - j17;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            p52.d[] dVarArr = p52.d.f433540d;
            ((q30.k) pVar).wi(new q52.e(Ri, str, j18, j17, currentTimeMillis2, null, null, 0, false, null, null, this.f519888a, true, 0, false, 0, 0, null, 255840, null));
            this.f519891d = 0L;
        }
    }

    public final void d(java.lang.String str) {
        if (this.f519889b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MegaVideo19943Report_" + this.f519888a, str);
        }
    }

    public final void e() {
        this.f519892e = java.lang.System.currentTimeMillis();
        d("sessionIn sessionInEnterTimeMs=" + this.f519892e);
    }

    public final void f() {
        d("sessionOut sessionInEnterTimeMs=" + this.f519892e + ",activity=" + this.f519894g);
        java.lang.String str = this.f519894g;
        int i17 = this.f519895h;
        if (this.f519892e > 0) {
            this.f519893f = java.lang.System.currentTimeMillis();
            r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            long j17 = this.f519893f;
            long j18 = this.f519892e;
            p52.d[] dVarArr = p52.d.f433540d;
            ((q30.k) pVar).wi(new q52.e(Ri, str, j17 - j18, j18, j17, null, null, 1, false, null, null, this.f519888a, true, 0, false, 0, i17, null, 190304, null));
            this.f519892e = 0L;
            this.f519893f = 0L;
        }
    }
}
