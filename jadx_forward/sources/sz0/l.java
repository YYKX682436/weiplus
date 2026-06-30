package sz0;

/* loaded from: classes14.dex */
public final class l extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f495463i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f495464m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f495465n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f495466o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f495467p;

    /* renamed from: q, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f495468q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f495469r;

    public l(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f495463i = url;
        this.f495464m = n0.s4.c(null, null, 2, null);
        this.f495465n = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        this.f495466o = n0.s4.c(java.lang.Float.valueOf(1.0f), null, 2, null);
        this.f495467p = n0.s4.c(null, null, 2, null);
        this.f495468q = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    @Override // h1.c
    public boolean a(float f17) {
        ((n0.q4) this.f495466o).mo148714x53d8522f(java.lang.Float.valueOf(f17));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // n0.e4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onRemembered: "
            r0.<init>(r1)
            java.lang.String r1 = r14.f495463i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.ImageLoaderPainter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            kotlinx.coroutines.r2 r0 = r14.f495469r
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L1e
            p3325xe03a0797.p3326xc267989b.p2.a(r0, r4, r3, r4)
        L1e:
            vo0.a r0 = vo0.e.f520001b
            wo0.c r0 = r0.a(r1)
            yo0.f r5 = new yo0.f
            r5.<init>()
            r5.f545611b = r3
            yo0.i r5 = r5.a()
            r0.f529405c = r5
            java.lang.Object r5 = r0.e()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L70
            boolean r6 = r5.isRecycled()
            r3 = r3 ^ r6
            if (r3 == 0) goto L41
            goto L42
        L41:
            r5 = r4
        L42:
            if (r5 == 0) goto L70
            h1.a r3 = new h1.a
            e1.g0 r7 = e1.e.b(r5)
            r8 = 0
            r10 = 0
            r12 = 6
            r13 = 0
            r6 = r3
            r6.<init>(r7, r8, r10, r12, r13)
            n0.v2 r5 = r14.f495464m
            n0.q4 r5 = (n0.q4) r5
            r5.mo148714x53d8522f(r3)
            n0.v2 r3 = r14.f495465n
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            n0.q4 r3 = (n0.q4) r3
            r3.mo148714x53d8522f(r5)
            java.lang.String r3 = "get img from cache "
            java.lang.String r1 = r3.concat(r1)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            jz5.f0 r1 = jz5.f0.f384359a
            goto L71
        L70:
            r1 = r4
        L71:
            if (r1 != 0) goto L84
            kotlinx.coroutines.y0 r5 = r14.f495468q
            r6 = 0
            r7 = 0
            sz0.k r8 = new sz0.k
            r8.<init>(r0, r14, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.r2 r0 = p3325xe03a0797.p3326xc267989b.l.d(r5, r6, r7, r8, r9, r10)
            r14.f495469r = r0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sz0.l.b():void");
    }

    @Override // n0.e4
    public void c() {
        d();
    }

    @Override // n0.e4
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageLoaderPainter", "onForgotten: " + this.f495463i);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f495469r;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f495469r = null;
        p3325xe03a0797.p3326xc267989b.z0.e(this.f495468q, null, 1, null);
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        ((n0.q4) this.f495467p).mo148714x53d8522f(zVar);
        return true;
    }

    @Override // h1.c
    public long h() {
        h1.c cVar = (h1.c) ((n0.q4) this.f495464m).mo128745x754a37bb();
        return cVar != null ? cVar.h() : d1.k.f307175c;
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        h1.c cVar = (h1.c) ((n0.q4) this.f495464m).mo128745x754a37bb();
        if (cVar != null) {
            cVar.g(iVar, iVar.a(), ((java.lang.Number) ((n0.q4) this.f495466o).mo128745x754a37bb()).floatValue(), (e1.z) ((n0.q4) this.f495467p).mo128745x754a37bb());
        }
    }
}
