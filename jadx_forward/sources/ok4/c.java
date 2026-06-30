package ok4;

/* loaded from: classes4.dex */
public final class c implements ok4.d, ok4.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f427510a;

    /* renamed from: b, reason: collision with root package name */
    public long f427511b;

    /* renamed from: c, reason: collision with root package name */
    public long f427512c;

    /* renamed from: d, reason: collision with root package name */
    public long f427513d;

    /* renamed from: e, reason: collision with root package name */
    public int f427514e;

    /* renamed from: f, reason: collision with root package name */
    public long f427515f;

    /* renamed from: g, reason: collision with root package name */
    public long f427516g;

    /* renamed from: h, reason: collision with root package name */
    public long f427517h;

    /* renamed from: i, reason: collision with root package name */
    public int f427518i;

    /* renamed from: j, reason: collision with root package name */
    public long f427519j;

    /* renamed from: k, reason: collision with root package name */
    public long f427520k;

    /* renamed from: l, reason: collision with root package name */
    public long f427521l;

    /* renamed from: m, reason: collision with root package name */
    public int f427522m;

    /* renamed from: n, reason: collision with root package name */
    public int f427523n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f427524o;

    public c(long j17) {
        this.f427510a = j17;
    }

    @Override // ok4.d
    public void a(int i17) {
        this.f427523n = java.lang.Math.max(this.f427523n, i17);
    }

    @Override // ok4.a
    public void b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427521l = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void c() {
    }

    @Override // ok4.a
    public void d(long j17) {
    }

    @Override // ok4.d
    public void e() {
        if (this.f427524o) {
            return;
        }
        this.f427518i++;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427515f = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void f(long j17, long j18) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427520k = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnPlayerReporter", "seek to " + i18);
        if (i18 != 0) {
            if (i18 < i17) {
                this.f427522m |= 2;
            } else if (i18 > i17) {
                this.f427522m |= 1;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 4L, 1L, false);
    }

    @Override // ok4.d
    public void h() {
        if (this.f427524o) {
            return;
        }
        long j17 = this.f427515f;
        if (j17 > 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427516g = java.lang.System.currentTimeMillis() - j17;
            this.f427515f = 0L;
        }
    }

    @Override // ok4.a
    public void i() {
    }

    @Override // ok4.a
    public void j() {
    }

    @Override // ok4.a
    public void k() {
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
    }

    @Override // ok4.a
    public void m() {
    }

    @Override // ok4.a
    public void n(int i17) {
    }

    @Override // ok4.a
    public void o() {
    }

    @Override // ok4.d
    /* renamed from: onCompleted */
    public void mo123988xaa8b332c() {
        long j17 = this.f427512c;
        if (j17 > 0) {
            long j18 = this.f427513d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427513d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f427512c = 0L;
        }
        this.f427524o = true;
    }

    @Override // ok4.d
    /* renamed from: onError */
    public void mo123989xaf8aa769(int i17, int i18) {
        this.f427514e = i17;
        long j17 = this.f427512c;
        if (j17 > 0) {
            long j18 = this.f427513d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427513d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f427512c = 0L;
        }
    }

    @Override // ok4.d
    /* renamed from: onPause */
    public void mo123990xb01dfb57() {
        long j17 = this.f427512c;
        if (j17 > 0) {
            long j18 = this.f427513d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427513d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f427512c = 0L;
        }
    }

    @Override // ok4.d
    /* renamed from: onStart */
    public void mo123991xb05099c3() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f427512c = currentTimeMillis;
        if (this.f427511b == 0) {
            this.f427511b = currentTimeMillis;
        }
    }

    @Override // ok4.d
    /* renamed from: onStop */
    public void mo123992xc39f8281() {
        long j17 = this.f427512c;
        if (j17 > 0) {
            long j18 = this.f427513d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427513d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f427512c = 0L;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427517h = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void p() {
    }

    @Override // ok4.d
    public void q() {
    }

    @Override // ok4.a
    public void r() {
    }

    @Override // ok4.d
    public void s() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427519j = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
    }

    @Override // ok4.a
    public void u() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ok4.b v() {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ok4.c.v():ok4.b");
    }

    @Override // ok4.a
    public void w(long j17) {
    }
}
