package i16;

/* loaded from: classes16.dex */
public final class h extends p16.v implements p16.i0 {

    /* renamed from: v, reason: collision with root package name */
    public static final i16.h f369003v;

    /* renamed from: w, reason: collision with root package name */
    public static final p16.j0 f369004w = new i16.e();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f369005d;

    /* renamed from: e, reason: collision with root package name */
    public int f369006e;

    /* renamed from: f, reason: collision with root package name */
    public i16.g f369007f;

    /* renamed from: g, reason: collision with root package name */
    public long f369008g;

    /* renamed from: h, reason: collision with root package name */
    public float f369009h;

    /* renamed from: i, reason: collision with root package name */
    public double f369010i;

    /* renamed from: m, reason: collision with root package name */
    public int f369011m;

    /* renamed from: n, reason: collision with root package name */
    public int f369012n;

    /* renamed from: o, reason: collision with root package name */
    public int f369013o;

    /* renamed from: p, reason: collision with root package name */
    public i16.k f369014p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f369015q;

    /* renamed from: r, reason: collision with root package name */
    public int f369016r;

    /* renamed from: s, reason: collision with root package name */
    public int f369017s;

    /* renamed from: t, reason: collision with root package name */
    public byte f369018t;

    /* renamed from: u, reason: collision with root package name */
    public int f369019u;

    static {
        i16.h hVar = new i16.h(true);
        f369003v = hVar;
        hVar.d();
    }

    public h(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f369018t = (byte) -1;
        this.f369019u = -1;
        this.f369005d = pVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        if ((this.f369006e & 1) == 1) {
            jVar.l(1, this.f369007f.f368983d);
        }
        if ((this.f369006e & 2) == 2) {
            long j17 = this.f369008g;
            jVar.x(2, 0);
            jVar.w((j17 >> 63) ^ (j17 << 1));
        }
        if ((this.f369006e & 4) == 4) {
            float f17 = this.f369009h;
            jVar.x(3, 5);
            jVar.t(java.lang.Float.floatToRawIntBits(f17));
        }
        if ((this.f369006e & 8) == 8) {
            double d17 = this.f369010i;
            jVar.x(4, 1);
            jVar.u(java.lang.Double.doubleToRawLongBits(d17));
        }
        if ((this.f369006e & 16) == 16) {
            jVar.m(5, this.f369011m);
        }
        if ((this.f369006e & 32) == 32) {
            jVar.m(6, this.f369012n);
        }
        if ((this.f369006e & 64) == 64) {
            jVar.m(7, this.f369013o);
        }
        if ((this.f369006e & 128) == 128) {
            jVar.o(8, this.f369014p);
        }
        for (int i17 = 0; i17 < this.f369015q.size(); i17++) {
            jVar.o(9, (p16.h0) this.f369015q.get(i17));
        }
        if ((this.f369006e & 512) == 512) {
            jVar.m(10, this.f369017s);
        }
        if ((this.f369006e & 256) == 256) {
            jVar.m(11, this.f369016r);
        }
        jVar.r(this.f369005d);
    }

    public final void d() {
        this.f369007f = i16.g.BYTE;
        this.f369008g = 0L;
        this.f369009h = 0.0f;
        this.f369010i = 0.0d;
        this.f369011m = 0;
        this.f369012n = 0;
        this.f369013o = 0;
        this.f369014p = i16.k.f369086m;
        this.f369015q = java.util.Collections.emptyList();
        this.f369016r = 0;
        this.f369017s = 0;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369019u;
        if (i17 != -1) {
            return i17;
        }
        int a17 = (this.f369006e & 1) == 1 ? p16.j.a(1, this.f369007f.f368983d) + 0 : 0;
        if ((this.f369006e & 2) == 2) {
            long j17 = this.f369008g;
            a17 += p16.j.h(2) + p16.j.g((j17 >> 63) ^ (j17 << 1));
        }
        if ((this.f369006e & 4) == 4) {
            a17 += p16.j.h(3) + 4;
        }
        if ((this.f369006e & 8) == 8) {
            a17 += p16.j.h(4) + 8;
        }
        if ((this.f369006e & 16) == 16) {
            a17 += p16.j.b(5, this.f369011m);
        }
        if ((this.f369006e & 32) == 32) {
            a17 += p16.j.b(6, this.f369012n);
        }
        if ((this.f369006e & 64) == 64) {
            a17 += p16.j.b(7, this.f369013o);
        }
        if ((this.f369006e & 128) == 128) {
            a17 += p16.j.d(8, this.f369014p);
        }
        for (int i18 = 0; i18 < this.f369015q.size(); i18++) {
            a17 += p16.j.d(9, (p16.h0) this.f369015q.get(i18));
        }
        if ((this.f369006e & 512) == 512) {
            a17 += p16.j.b(10, this.f369017s);
        }
        if ((this.f369006e & 256) == 256) {
            a17 += p16.j.b(11, this.f369016r);
        }
        int mo157707x35e001 = a17 + this.f369005d.mo157707x35e001();
        this.f369019u = mo157707x35e001;
        return mo157707x35e001;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369018t;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (((this.f369006e & 128) == 128) && !this.f369014p.mo134563xf582434a()) {
            this.f369018t = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f369015q.size(); i17++) {
            if (!((i16.h) this.f369015q.get(i17)).mo134563xf582434a()) {
                this.f369018t = (byte) 0;
                return false;
            }
        }
        this.f369018t = (byte) 1;
        return true;
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.f();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.f fVar = new i16.f();
        fVar.d(this);
        return fVar;
    }

    public h(boolean z17) {
        this.f369018t = (byte) -1;
        this.f369019u = -1;
        this.f369005d = p16.g.f432816d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001e. Please report as an issue. */
    public h(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.j jVar;
        this.f369018t = (byte) -1;
        this.f369019u = -1;
        d();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    switch (n17) {
                        case 0:
                            z17 = true;
                        case 8:
                            int k17 = hVar.k();
                            i16.g a17 = i16.g.a(k17);
                            if (a17 == null) {
                                j17.v(n17);
                                j17.v(k17);
                            } else {
                                this.f369006e |= 1;
                                this.f369007f = a17;
                            }
                        case 16:
                            this.f369006e |= 2;
                            long l17 = hVar.l();
                            this.f369008g = (-(l17 & 1)) ^ (l17 >>> 1);
                        case 29:
                            this.f369006e |= 4;
                            this.f369009h = java.lang.Float.intBitsToFloat(hVar.i());
                        case 33:
                            this.f369006e |= 8;
                            this.f369010i = java.lang.Double.longBitsToDouble(hVar.j());
                        case 40:
                            this.f369006e |= 16;
                            this.f369011m = hVar.k();
                        case 48:
                            this.f369006e |= 32;
                            this.f369012n = hVar.k();
                        case 56:
                            this.f369006e |= 64;
                            this.f369013o = hVar.k();
                        case 66:
                            if ((this.f369006e & 128) == 128) {
                                i16.k kVar = this.f369014p;
                                kVar.getClass();
                                jVar = new i16.j();
                                jVar.d(kVar);
                            } else {
                                jVar = null;
                            }
                            i16.k kVar2 = (i16.k) hVar.g(i16.k.f369087n, lVar);
                            this.f369014p = kVar2;
                            if (jVar != null) {
                                jVar.d(kVar2);
                                this.f369014p = jVar.c();
                            }
                            this.f369006e |= 128;
                        case 74:
                            if ((i17 & 256) != 256) {
                                this.f369015q = new java.util.ArrayList();
                                i17 |= 256;
                            }
                            this.f369015q.add(hVar.g(f369004w, lVar));
                        case 80:
                            this.f369006e |= 512;
                            this.f369017s = hVar.k();
                        case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                            this.f369006e |= 256;
                            this.f369016r = hVar.k();
                        default:
                            if (!hVar.q(n17, j17)) {
                                z17 = true;
                            }
                    }
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 256) == 256) {
                        this.f369015q = java.util.Collections.unmodifiableList(this.f369015q);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        throw th6;
                    } finally {
                    }
                }
            } catch (p16.z e17) {
                e17.f432904d = this;
                throw e17;
            } catch (java.io.IOException e18) {
                p16.z zVar = new p16.z(e18.getMessage());
                zVar.f432904d = this;
                throw zVar;
            }
        }
        if ((i17 & 256) == 256) {
            this.f369015q = java.util.Collections.unmodifiableList(this.f369015q);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
