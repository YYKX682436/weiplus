package d9;

/* loaded from: classes15.dex */
public final class k implements d9.x, d9.w {

    /* renamed from: d, reason: collision with root package name */
    public final d9.x f308897d;

    /* renamed from: e, reason: collision with root package name */
    public d9.w f308898e;

    /* renamed from: f, reason: collision with root package name */
    public long f308899f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f308900g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public d9.j[] f308901h = new d9.j[0];

    /* renamed from: i, reason: collision with root package name */
    public boolean f308902i;

    public k(d9.x xVar, boolean z17) {
        this.f308897d = xVar;
        this.f308902i = z17;
    }

    @Override // d9.w
    public void a(d9.x xVar) {
        t9.a.d((this.f308899f == -9223372036854775807L || this.f308900g == -9223372036854775807L) ? false : true);
        this.f308898e.a(this);
    }

    @Override // d9.h0
    public void b(d9.i0 i0Var) {
        this.f308898e.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // d9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(long r6) {
        /*
            r5 = this;
            d9.j[] r0 = r5.f308901h
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L10
            r4 = r0[r3]
            if (r4 == 0) goto Ld
            r4.f308889f = r2
        Ld:
            int r3 = r3 + 1
            goto L5
        L10:
            long r0 = r5.f308899f
            long r0 = r0 + r6
            d9.x r3 = r5.f308897d
            long r0 = r3.c(r0)
            long r3 = r5.f308899f
            long r6 = r6 + r3
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L30
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 < 0) goto L31
            long r6 = r5.f308900g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L30
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L31
        L30:
            r2 = 1
        L31:
            t9.a.d(r2)
            long r6 = r5.f308899f
            long r0 = r0 - r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.k.c(long):long");
    }

    @Override // d9.x
    public long d() {
        if (!this.f308902i) {
            long d17 = this.f308897d.d();
            if (d17 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            t9.a.d(d17 >= this.f308899f);
            long j17 = this.f308900g;
            t9.a.d(j17 == Long.MIN_VALUE || d17 <= j17);
            return d17 - this.f308899f;
        }
        for (d9.j jVar : this.f308901h) {
            if (jVar != null) {
                jVar.f308888e = false;
            }
        }
        this.f308902i = false;
        long d18 = d();
        if (d18 != -9223372036854775807L) {
            return d18;
        }
        return 0L;
    }

    @Override // d9.i0
    public boolean h(long j17) {
        return this.f308897d.h(j17 + this.f308899f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r13 > r2) goto L35;
     */
    @Override // d9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i(q9.m[] r18, boolean[] r19, d9.g0[] r20, boolean[] r21, long r22) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.k.i(q9.m[], boolean[], d9.g0[], boolean[], long):long");
    }

    @Override // d9.x
    public d9.l0 k() {
        return this.f308897d.k();
    }

    @Override // d9.i0
    public long m() {
        long m17 = this.f308897d.m();
        if (m17 != Long.MIN_VALUE) {
            long j17 = this.f308900g;
            if (j17 == Long.MIN_VALUE || m17 < j17) {
                return java.lang.Math.max(0L, m17 - this.f308899f);
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // d9.i0
    public long n() {
        long n17 = this.f308897d.n();
        if (n17 != Long.MIN_VALUE) {
            long j17 = this.f308900g;
            if (j17 == Long.MIN_VALUE || n17 < j17) {
                return n17 - this.f308899f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // d9.x
    public void o() {
        this.f308897d.o();
    }

    @Override // d9.x
    public void p(long j17) {
        this.f308897d.p(j17 + this.f308899f);
    }

    @Override // d9.x
    public void r(d9.w wVar, long j17) {
        this.f308898e = wVar;
        this.f308897d.r(this, this.f308899f + j17);
    }
}
