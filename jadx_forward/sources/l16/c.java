package l16;

/* loaded from: classes16.dex */
public final class c extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f396549e;

    /* renamed from: f, reason: collision with root package name */
    public int f396550f;

    /* renamed from: g, reason: collision with root package name */
    public int f396551g;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = l16.d.f396553n     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.b r0 = (l16.b) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.d r2 = (l16.d) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            l16.d r3 = (l16.d) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: l16.c.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((l16.d) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        l16.d c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public l16.d c() {
        l16.d dVar = new l16.d(this, null);
        int i17 = this.f396549e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        dVar.f396556f = this.f396550f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        dVar.f396557g = this.f396551g;
        dVar.f396555e = i18;
        return dVar;
    }

    /* renamed from: clone */
    public java.lang.Object m144876x5a5dd5d() {
        l16.c cVar = new l16.c();
        cVar.d(c());
        return cVar;
    }

    public l16.c d(l16.d dVar) {
        if (dVar == l16.d.f396552m) {
            return this;
        }
        int i17 = dVar.f396555e;
        if ((i17 & 1) == 1) {
            int i18 = dVar.f396556f;
            this.f396549e |= 1;
            this.f396550f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = dVar.f396557g;
            this.f396549e = 2 | this.f396549e;
            this.f396551g = i19;
        }
        this.f432870d = this.f432870d.e(dVar.f396554d);
        return this;
    }
}
