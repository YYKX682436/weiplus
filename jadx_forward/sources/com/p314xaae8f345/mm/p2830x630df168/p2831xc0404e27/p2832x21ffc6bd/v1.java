package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final zq5.k f296656a;

    /* renamed from: b, reason: collision with root package name */
    public final yq5.k f296657b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v0 f296658c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.w0 f296659d;

    /* renamed from: e, reason: collision with root package name */
    public final yq5.c f296660e;

    /* renamed from: f, reason: collision with root package name */
    public final long f296661f;

    /* renamed from: g, reason: collision with root package name */
    public final long f296662g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f296663h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f296664i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f296665j;

    /* renamed from: k, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f296666k;

    /* renamed from: l, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f296667l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Float f296668m;

    /* renamed from: n, reason: collision with root package name */
    public int f296669n;

    /* renamed from: o, reason: collision with root package name */
    public zq5.e f296670o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f296671p;

    /* renamed from: q, reason: collision with root package name */
    public int f296672q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f296673r;

    /* renamed from: s, reason: collision with root package name */
    public yq5.n f296674s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f296675t;

    /* renamed from: u, reason: collision with root package name */
    public int f296676u;

    /* renamed from: v, reason: collision with root package name */
    public zq5.e f296677v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f296678w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f296679x;

    public v1(zq5.k logger, yq5.k subsamplingImage, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v0 tileDecoder, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.x0 x0Var, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.w0 tileImageCacheHelper, yq5.c imageInfo, long j17, long j18, yz5.l onTileChanged, yz5.l onSampleSizeChanged, yz5.l onImageLoadRectChanged, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long a17;
        long j19 = j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logger, "logger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subsamplingImage, "subsamplingImage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tileDecoder, "tileDecoder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tileImageCacheHelper, "tileImageCacheHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTileChanged, "onTileChanged");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSampleSizeChanged, "onSampleSizeChanged");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onImageLoadRectChanged, "onImageLoadRectChanged");
        this.f296656a = logger;
        this.f296657b = subsamplingImage;
        this.f296658c = tileDecoder;
        this.f296659d = tileImageCacheHelper;
        this.f296660e = imageInfo;
        this.f296661f = j17;
        this.f296662g = j19;
        this.f296663h = onTileChanged;
        this.f296664i = onSampleSizeChanged;
        this.f296665j = onImageLoadRectChanged;
        this.f296666k = p3325xe03a0797.p3326xc267989b.q1.f392103c.J(2);
        this.f296667l = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f296672q = 39;
        this.f296674s = yq5.n.f546147b;
        this.f296677v = zq5.e.f556593e;
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f296678w = p0Var;
        this.f296679x = p0Var;
        long j27 = imageInfo.f546124a;
        int a18 = com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.x1.a(j27, j17, 1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c17 = ' ';
        int i17 = (int) (j27 >> 32);
        if (i17 > zq5.g.b(j27)) {
            int b17 = a06.d.b((zq5.g.b(j27) / i17) * 50);
            a17 = zq5.d.a(50, b17 < 1 ? 1 : b17);
        } else {
            int b18 = a06.d.b((i17 / zq5.g.b(j27)) * 50);
            a17 = zq5.d.a(b18 < 1 ? 1 : b18, 50);
        }
        int i18 = 1;
        while (true) {
            int i19 = zq5.g.f556599c;
            float f17 = i17;
            float f18 = i18;
            long j28 = j27;
            int ceil = (int) java.lang.Math.ceil((f17 / f18) / ((int) (j19 >> c17)));
            int ceil2 = (int) java.lang.Math.ceil((zq5.g.b(j28) / f18) / zq5.g.b(j18));
            long a19 = zq5.d.a(ceil < 1 ? 1 : ceil, ceil2 < 1 ? 1 : ceil2);
            int i27 = (int) (a19 >> c17);
            int i28 = (int) (a17 >> c17);
            i27 = i27 > i28 ? i28 : i27;
            int a27 = zq5.c.a(a19);
            int a28 = zq5.c.a(a17);
            long a29 = zq5.d.a(i27, a27 > a28 ? a28 : a27);
            int i29 = (int) (a29 >> c17);
            int f19 = e06.p.f((int) java.lang.Math.ceil(f17 / i29), 1, i17);
            int f27 = e06.p.f((int) java.lang.Math.ceil(zq5.g.b(j28) / zq5.c.a(a29)), 1, zq5.g.b(j28));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(zq5.c.a(a29) * i29);
            int a37 = zq5.c.a(a29);
            for (int i37 = 0; i37 < a37; i37++) {
                int i38 = 0;
                while (i38 < i29) {
                    long a38 = zq5.d.a(i38, i37);
                    long j29 = a17;
                    int i39 = i38 * f19;
                    int i47 = a37;
                    int i48 = i37 * f27;
                    i38++;
                    int i49 = i38 * f19;
                    i49 = i49 > i17 ? i17 : i49;
                    int i57 = i17;
                    int i58 = (i37 + 1) * f27;
                    int i59 = f27;
                    int b19 = zq5.g.b(j28);
                    if (i58 > b19) {
                        i58 = b19;
                    }
                    arrayList2.add(new yq5.m(a38, new zq5.e(i39, i48, i49, i58), i18, null));
                    a37 = i47;
                    i17 = i57;
                    a17 = j29;
                    f27 = i59;
                }
            }
            int i66 = i17;
            long j37 = a17;
            arrayList.add(new yq5.i(i18, arrayList2));
            i18 *= 2;
            if (i29 * zq5.c.a(a29) <= 1) {
                break;
            }
            j19 = j18;
            i17 = i66;
            a17 = j37;
            c17 = ' ';
            j27 = j28;
        }
        java.util.List F0 = kz5.n0.F0(arrayList, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.w1.f296684d);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : F0) {
            if (((yq5.i) obj).f546130a <= a18) {
                arrayList3.add(obj);
            }
        }
        this.f296675t = arrayList3;
        this.f296656a.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.y0(this, a18));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f296656a.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.a1((yq5.i) it.next(), this));
        }
    }

    public final void a(java.lang.String caller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f296671p;
        zq5.k kVar = this.f296656a;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            kVar.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.b1(caller, this));
            ((p3325xe03a0797.p3326xc267989b.c3) r2Var).b(p3325xe03a0797.p3326xc267989b.e2.a("clean:".concat(caller), null));
            this.f296671p = null;
        }
        if (this.f296676u != 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            java.util.Iterator it = ((java.util.ArrayList) this.f296675t).iterator();
            while (it.hasNext()) {
                f0Var.f391649d += c(((yq5.i) it.next()).f546131b, true);
            }
            kVar.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.c1(caller, f0Var, this));
            if (f0Var.f391649d > 0) {
                d("clean:".concat(caller));
            }
        }
    }

    public final boolean b(yq5.m mVar, boolean z17) {
        if (mVar.f546145g == 0) {
            return false;
        }
        mVar.f546145g = 0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = mVar.f546142d;
        if (r2Var != null && r2Var.a()) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            mVar.f546142d = null;
        }
        if (mVar.f546143e != null) {
            this.f296656a.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d1(mVar, this));
            mVar.a();
        }
        if (!z17) {
            d("freeTile");
        }
        return true;
    }

    public final int c(java.util.List list, boolean z17) {
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (b((yq5.m) it.next(), z17)) {
                i17++;
            }
        }
        if (!z17 && i17 > 0) {
            d("freeTiles");
        }
        return i17;
    }

    public final void d(java.lang.String str) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f296671p;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        zq5.k kVar = this.f296656a;
        if (z17) {
            kVar.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.q1(str, this));
        } else {
            kVar.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.r1(str, this));
            this.f296671p = p3325xe03a0797.p3326xc267989b.l.d(this.f296667l, null, null, new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.u1(this, str, null), 3, null);
        }
    }
}
