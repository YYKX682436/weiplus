package i16;

/* loaded from: classes16.dex */
public final class f extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f368950e;

    /* renamed from: g, reason: collision with root package name */
    public long f368952g;

    /* renamed from: h, reason: collision with root package name */
    public float f368953h;

    /* renamed from: i, reason: collision with root package name */
    public double f368954i;

    /* renamed from: m, reason: collision with root package name */
    public int f368955m;

    /* renamed from: n, reason: collision with root package name */
    public int f368956n;

    /* renamed from: o, reason: collision with root package name */
    public int f368957o;

    /* renamed from: r, reason: collision with root package name */
    public int f368960r;

    /* renamed from: s, reason: collision with root package name */
    public int f368961s;

    /* renamed from: f, reason: collision with root package name */
    public i16.g f368951f = i16.g.BYTE;

    /* renamed from: p, reason: collision with root package name */
    public i16.k f368958p = i16.k.f369086m;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f368959q = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.h.f369004w     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.e r0 = (i16.e) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.h r2 = (i16.h) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.h r3 = (i16.h) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.d(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.f.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.h) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.h c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.h c() {
        i16.h hVar = new i16.h(this, null);
        int i17 = this.f368950e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        hVar.f369007f = this.f368951f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        hVar.f369008g = this.f368952g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        hVar.f369009h = this.f368953h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        hVar.f369010i = this.f368954i;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        hVar.f369011m = this.f368955m;
        if ((i17 & 32) == 32) {
            i18 |= 32;
        }
        hVar.f369012n = this.f368956n;
        if ((i17 & 64) == 64) {
            i18 |= 64;
        }
        hVar.f369013o = this.f368957o;
        if ((i17 & 128) == 128) {
            i18 |= 128;
        }
        hVar.f369014p = this.f368958p;
        if ((i17 & 256) == 256) {
            this.f368959q = java.util.Collections.unmodifiableList(this.f368959q);
            this.f368950e &= -257;
        }
        hVar.f369015q = this.f368959q;
        if ((i17 & 512) == 512) {
            i18 |= 256;
        }
        hVar.f369016r = this.f368960r;
        if ((i17 & 1024) == 1024) {
            i18 |= 512;
        }
        hVar.f369017s = this.f368961s;
        hVar.f369006e = i18;
        return hVar;
    }

    /* renamed from: clone */
    public java.lang.Object m134584x5a5dd5d() {
        i16.f fVar = new i16.f();
        fVar.d(c());
        return fVar;
    }

    public i16.f d(i16.h hVar) {
        i16.k kVar;
        if (hVar == i16.h.f369003v) {
            return this;
        }
        if ((hVar.f369006e & 1) == 1) {
            i16.g gVar = hVar.f369007f;
            gVar.getClass();
            this.f368950e |= 1;
            this.f368951f = gVar;
        }
        int i17 = hVar.f369006e;
        if ((i17 & 2) == 2) {
            long j17 = hVar.f369008g;
            this.f368950e |= 2;
            this.f368952g = j17;
        }
        if ((i17 & 4) == 4) {
            float f17 = hVar.f369009h;
            this.f368950e = 4 | this.f368950e;
            this.f368953h = f17;
        }
        if ((i17 & 8) == 8) {
            double d17 = hVar.f369010i;
            this.f368950e |= 8;
            this.f368954i = d17;
        }
        if ((i17 & 16) == 16) {
            int i18 = hVar.f369011m;
            this.f368950e = 16 | this.f368950e;
            this.f368955m = i18;
        }
        if ((i17 & 32) == 32) {
            int i19 = hVar.f369012n;
            this.f368950e = 32 | this.f368950e;
            this.f368956n = i19;
        }
        if ((i17 & 64) == 64) {
            int i27 = hVar.f369013o;
            this.f368950e = 64 | this.f368950e;
            this.f368957o = i27;
        }
        if ((i17 & 128) == 128) {
            i16.k kVar2 = hVar.f369014p;
            if ((this.f368950e & 128) != 128 || (kVar = this.f368958p) == i16.k.f369086m) {
                this.f368958p = kVar2;
            } else {
                i16.j jVar = new i16.j();
                jVar.d(kVar);
                jVar.d(kVar2);
                this.f368958p = jVar.c();
            }
            this.f368950e |= 128;
        }
        if (!hVar.f369015q.isEmpty()) {
            if (this.f368959q.isEmpty()) {
                this.f368959q = hVar.f369015q;
                this.f368950e &= -257;
            } else {
                if ((this.f368950e & 256) != 256) {
                    this.f368959q = new java.util.ArrayList(this.f368959q);
                    this.f368950e |= 256;
                }
                this.f368959q.addAll(hVar.f369015q);
            }
        }
        int i28 = hVar.f369006e;
        if ((i28 & 256) == 256) {
            int i29 = hVar.f369016r;
            this.f368950e |= 512;
            this.f368960r = i29;
        }
        if ((i28 & 512) == 512) {
            int i37 = hVar.f369017s;
            this.f368950e |= 1024;
            this.f368961s = i37;
        }
        this.f432870d = this.f432870d.e(hVar.f369005d);
        return this;
    }
}
