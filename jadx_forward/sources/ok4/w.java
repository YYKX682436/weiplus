package ok4;

/* loaded from: classes4.dex */
public final class w implements ok4.d, ok4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc f427577a;

    /* renamed from: b, reason: collision with root package name */
    public final long f427578b;

    /* renamed from: c, reason: collision with root package name */
    public final int f427579c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f427580d;

    /* renamed from: e, reason: collision with root package name */
    public long f427581e;

    /* renamed from: f, reason: collision with root package name */
    public long f427582f;

    /* renamed from: g, reason: collision with root package name */
    public long f427583g;

    /* renamed from: h, reason: collision with root package name */
    public long f427584h;

    /* renamed from: i, reason: collision with root package name */
    public long f427585i;

    /* renamed from: j, reason: collision with root package name */
    public int f427586j;

    /* renamed from: k, reason: collision with root package name */
    public int f427587k;

    /* renamed from: l, reason: collision with root package name */
    public long f427588l;

    /* renamed from: m, reason: collision with root package name */
    public long f427589m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f427590n;

    /* renamed from: o, reason: collision with root package name */
    public long f427591o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f427592p;

    /* renamed from: q, reason: collision with root package name */
    public int f427593q;

    /* renamed from: r, reason: collision with root package name */
    public int f427594r;

    /* renamed from: s, reason: collision with root package name */
    public long f427595s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f427596t;

    public w(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc struct, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        this.f427577a = struct;
        this.f427578b = j17;
        this.f427579c = i17;
    }

    @Override // ok4.d
    public void a(int i17) {
    }

    @Override // ok4.a
    public void b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427595s = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void c() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        c6953x6177b4fc.f142599t = 0L;
        long j17 = this.f427595s;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6953x6177b4fc.f142598s = java.lang.System.currentTimeMillis() - j17;
        ok4.u uVar = ok4.u.f427574a;
        java.lang.String str = c6953x6177b4fc.f142586g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMediaId(...)");
        uVar.e(new ok4.j(c6953x6177b4fc.S, str));
    }

    @Override // ok4.a
    public void d(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", "onDownloadProgress");
        ok4.u uVar = ok4.u.f427574a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        java.lang.String str = c6953x6177b4fc.f142586g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMediaId(...)");
        uVar.e(new ok4.m(c6953x6177b4fc.S, str, java.lang.Long.valueOf(j17)));
    }

    @Override // ok4.d
    public void e() {
        jz5.f0 f0Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f427584h = currentTimeMillis;
        boolean z18 = currentTimeMillis - this.f427588l < 300;
        this.f427590n = z18;
        if (!z18) {
            this.f427586j++;
        }
        ok4.u uVar = ok4.u.f427574a;
        java.lang.String str = this.f427577a.f142586g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMediaId(...)");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = uVar.a(str);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setVideoLoading >> " + str + ", " + a17.O);
            a17.O = a17.O + 1;
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setVideoLoadingCount >> " + str + ", but data is no find");
        }
    }

    @Override // ok4.a
    public void f(long j17, long j18) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long max = java.lang.Math.max(java.lang.System.currentTimeMillis() - this.f427595s, 0L);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        c6953x6177b4fc.f142603x = max;
        c6953x6177b4fc.f142604y = j17;
        c6953x6177b4fc.f142605z = j18;
        c6953x6177b4fc.B = 1L;
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f427577a.f142586g + "]onSeek: " + i18);
        this.f427587k = this.f427587k + 1;
        this.f427590n = false;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427588l = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.d
    public void h() {
        long j17 = this.f427584h;
        if (j17 > 0) {
            if (!this.f427590n) {
                long j18 = this.f427585i;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f427585i = j18 + (java.lang.System.currentTimeMillis() - j17);
            }
            this.f427584h = 0L;
        }
        this.f427590n = false;
    }

    @Override // ok4.a
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TPPlayerReporter", "onRequestAllData");
    }

    @Override // ok4.a
    public void j() {
        this.f427577a.f142589j = 5L;
    }

    @Override // ok4.a
    public void k() {
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f427577a.f142586g + "]onPrepare: isOnline=" + z17 + ", path=" + str);
        this.f427592p = str;
        this.f427596t = z17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f427591o = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void m() {
    }

    @Override // ok4.a
    public void n(int i17) {
        long j17 = i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        c6953x6177b4fc.f142599t = j17;
        long j18 = this.f427595s;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6953x6177b4fc.f142598s = java.lang.System.currentTimeMillis() - j18;
    }

    @Override // ok4.a
    public void o() {
        this.f427577a.A = 0;
    }

    @Override // ok4.d
    /* renamed from: onCompleted */
    public void mo123988xaa8b332c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        sb6.append(c6953x6177b4fc.f142586g);
        sb6.append("]onCompleted");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        if (c6953x6177b4fc.V <= 0) {
            long j17 = this.f427582f;
            if (j17 > 0) {
                long j18 = this.f427583g;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f427583g = j18 + (java.lang.System.currentTimeMillis() - j17);
                this.f427582f = 0L;
            }
            x();
        }
    }

    @Override // ok4.d
    /* renamed from: onError */
    public void mo123989xaf8aa769(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        sb6.append(c6953x6177b4fc.f142586g);
        sb6.append("]onError: ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        c6953x6177b4fc.f142591l = i17;
        long j17 = this.f427582f;
        if (j17 > 0) {
            long j18 = this.f427583g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427583g = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f427582f = 0L;
        }
        x();
    }

    @Override // ok4.d
    /* renamed from: onPause */
    public void mo123990xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f427577a.f142586g + "]onPause");
        long j17 = this.f427582f;
        if (j17 > 0) {
            long j18 = this.f427583g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427583g = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f427582f = 0L;
        }
    }

    @Override // ok4.d
    /* renamed from: onStart */
    public void mo123991xb05099c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f427577a.f142586g + "]onStart");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f427582f = currentTimeMillis;
        if (this.f427581e == 0) {
            this.f427581e = currentTimeMillis;
        }
    }

    @Override // ok4.d
    /* renamed from: onStop */
    public void mo123992xc39f8281() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        sb6.append(c6953x6177b4fc.f142586g);
        sb6.append("]onStop");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        long j17 = this.f427582f;
        if (j17 > 0) {
            long j18 = this.f427583g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427583g = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f427582f = 0L;
        }
        if (c6953x6177b4fc.f142589j != 5) {
            if (this.f427595s <= 0) {
                c6953x6177b4fc.f142589j = 3L;
            } else if (this.f427596t) {
                c6953x6177b4fc.f142589j = 1L;
            } else {
                c6953x6177b4fc.f142589j = 2L;
            }
        }
        x();
    }

    @Override // ok4.a
    public void p() {
    }

    @Override // ok4.d
    public void q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f427577a.f142586g + "]onSeekCompleted");
        long j17 = this.f427588l;
        if (j17 >= 0) {
            long j18 = this.f427589m;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f427589m = j18 + (java.lang.System.currentTimeMillis() - j17);
        }
    }

    @Override // ok4.a
    public void r() {
        this.f427577a.A = 2;
    }

    @Override // ok4.d
    public void s() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        if (c6953x6177b4fc.f142593n > 0 || this.f427591o <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", "[" + c6953x6177b4fc.f142586g + "]onFirstVideoFrame");
        long j17 = this.f427591o;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6953x6177b4fc.f142593n = java.lang.System.currentTimeMillis() - j17;
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
        int i18 = 0;
        if (i17 == 203) {
            int i19 = (int) j17;
            if (i19 == 1) {
                i18 = 2;
            } else if (i19 == 2) {
                i18 = 1;
            }
            this.f427593q = i18;
            return;
        }
        if (i17 != 204) {
            return;
        }
        int i27 = (int) j17;
        if (i27 == 101) {
            i18 = 2;
        } else if (i27 == 102) {
            i18 = 1;
        }
        this.f427594r = i18;
    }

    @Override // ok4.a
    public void u() {
    }

    public void v(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markRequestVideoFlag media id:");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        sb6.append(c6953x6177b4fc.f142586g);
        sb6.append(" flag:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TPPlayerReporter", sb6.toString());
        c6953x6177b4fc.T = c6953x6177b4fc.b("ReqVideoFlag", str, true);
    }

    @Override // ok4.a
    public void w(long j17) {
        long m40062x608a19a0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        c6953x6177b4fc.f142596q = m40062x608a19a0;
        c6953x6177b4fc.f142597r = j17 - this.f427595s;
    }

    public final void x() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = this.f427577a;
        sb6.append(c6953x6177b4fc.f142586g);
        sb6.append("]report: enter=");
        long j17 = this.f427578b;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        if (this.f427580d) {
            return;
        }
        boolean z17 = true;
        this.f427580d = true;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6953x6177b4fc.f142580d = java.lang.System.currentTimeMillis() - j17;
        int i17 = this.f427586j;
        if (i17 > 0) {
            c6953x6177b4fc.f142595p = this.f427585i / i17;
            c6953x6177b4fc.f142594o = i17;
        }
        c6953x6177b4fc.f142590k = this.f427583g;
        int i18 = this.f427587k;
        if (i18 > 0) {
            c6953x6177b4fc.N = i18;
            c6953x6177b4fc.O = this.f427589m / i18;
        }
        c6953x6177b4fc.f142592m = java.lang.Math.max(this.f427581e - this.f427591o, 0L);
        c6953x6177b4fc.f142582e = this.f427579c;
        c6953x6177b4fc.I = this.f427594r;
        c6953x6177b4fc.K = this.f427593q;
        c6953x6177b4fc.Y = java.lang.System.currentTimeMillis();
        ok4.f fVar = ok4.f.f427527a;
        java.lang.String str = c6953x6177b4fc.f142586g;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        int i19 = -1;
        if (!z17) {
            java.util.HashMap hashMap = ok4.f.f427528b;
            java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
            if (num == null) {
                num = -1;
            }
            i19 = num.intValue();
            hashMap.remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPredictDataReport", "getPredictStatusToReport >> " + str + ", " + i19);
        }
        c6953x6177b4fc.f142579c0 = i19;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new ok4.v(this, null), 2, null);
    }
}
