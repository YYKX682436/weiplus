package i16;

/* loaded from: classes16.dex */
public final class j extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f369055e;

    /* renamed from: f, reason: collision with root package name */
    public int f369056f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f369057g = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.k.f369087n     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.b r0 = (i16.b) r0     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.k r2 = (i16.k) r2     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            if (r2 == 0) goto Lf
            r1.d(r2)
        Lf:
            return r1
        L10:
            r2 = move-exception
            goto L1a
        L12:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> L10
            i16.k r3 = (i16.k) r3     // Catch: java.lang.Throwable -> L10
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.d(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.j.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.k) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.k c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.k c() {
        i16.k kVar = new i16.k(this, null);
        int i17 = this.f369055e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        kVar.f369090f = this.f369056f;
        if ((i17 & 2) == 2) {
            this.f369057g = java.util.Collections.unmodifiableList(this.f369057g);
            this.f369055e &= -3;
        }
        kVar.f369091g = this.f369057g;
        kVar.f369089e = i18;
        return kVar;
    }

    /* renamed from: clone */
    public java.lang.Object m134604x5a5dd5d() {
        i16.j jVar = new i16.j();
        jVar.d(c());
        return jVar;
    }

    public i16.j d(i16.k kVar) {
        if (kVar == i16.k.f369086m) {
            return this;
        }
        if ((kVar.f369089e & 1) == 1) {
            int i17 = kVar.f369090f;
            this.f369055e = 1 | this.f369055e;
            this.f369056f = i17;
        }
        if (!kVar.f369091g.isEmpty()) {
            if (this.f369057g.isEmpty()) {
                this.f369057g = kVar.f369091g;
                this.f369055e &= -3;
            } else {
                if ((this.f369055e & 2) != 2) {
                    this.f369057g = new java.util.ArrayList(this.f369057g);
                    this.f369055e |= 2;
                }
                this.f369057g.addAll(kVar.f369091g);
            }
        }
        this.f432870d = this.f432870d.e(kVar.f369088d);
        return this;
    }
}
