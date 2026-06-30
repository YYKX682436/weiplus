package l16;

/* loaded from: classes16.dex */
public final class i extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f396571e;

    /* renamed from: f, reason: collision with root package name */
    public l16.d f396572f = l16.d.f396552m;

    /* renamed from: g, reason: collision with root package name */
    public l16.g f396573g;

    /* renamed from: h, reason: collision with root package name */
    public l16.g f396574h;

    /* renamed from: i, reason: collision with root package name */
    public l16.g f396575i;

    /* renamed from: m, reason: collision with root package name */
    public l16.g f396576m;

    public i() {
        l16.g gVar = l16.g.f396563m;
        this.f396573g = gVar;
        this.f396574h = gVar;
        this.f396575i = gVar;
        this.f396576m = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = l16.j.f396578q     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.h r0 = (l16.h) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.j r2 = (l16.j) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            l16.j r3 = (l16.j) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: l16.i.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((l16.j) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        l16.j c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public l16.j c() {
        l16.j jVar = new l16.j(this, null);
        int i17 = this.f396571e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        jVar.f396581f = this.f396572f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        jVar.f396582g = this.f396573g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        jVar.f396583h = this.f396574h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        jVar.f396584i = this.f396575i;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        jVar.f396585m = this.f396576m;
        jVar.f396580e = i18;
        return jVar;
    }

    /* renamed from: clone */
    public java.lang.Object m144880x5a5dd5d() {
        l16.i iVar = new l16.i();
        iVar.d(c());
        return iVar;
    }

    public l16.i d(l16.j jVar) {
        l16.g gVar;
        l16.g gVar2;
        l16.g gVar3;
        l16.g gVar4;
        l16.d dVar;
        if (jVar == l16.j.f396577p) {
            return this;
        }
        if ((jVar.f396580e & 1) == 1) {
            l16.d dVar2 = jVar.f396581f;
            if ((this.f396571e & 1) != 1 || (dVar = this.f396572f) == l16.d.f396552m) {
                this.f396572f = dVar2;
            } else {
                l16.c cVar = new l16.c();
                cVar.d(dVar);
                cVar.d(dVar2);
                this.f396572f = cVar.c();
            }
            this.f396571e |= 1;
        }
        if ((jVar.f396580e & 2) == 2) {
            l16.g gVar5 = jVar.f396582g;
            if ((this.f396571e & 2) != 2 || (gVar4 = this.f396573g) == l16.g.f396563m) {
                this.f396573g = gVar5;
            } else {
                l16.f d17 = l16.g.d(gVar4);
                d17.d(gVar5);
                this.f396573g = d17.c();
            }
            this.f396571e |= 2;
        }
        if ((jVar.f396580e & 4) == 4) {
            l16.g gVar6 = jVar.f396583h;
            if ((this.f396571e & 4) != 4 || (gVar3 = this.f396574h) == l16.g.f396563m) {
                this.f396574h = gVar6;
            } else {
                l16.f d18 = l16.g.d(gVar3);
                d18.d(gVar6);
                this.f396574h = d18.c();
            }
            this.f396571e |= 4;
        }
        if ((jVar.f396580e & 8) == 8) {
            l16.g gVar7 = jVar.f396584i;
            if ((this.f396571e & 8) != 8 || (gVar2 = this.f396575i) == l16.g.f396563m) {
                this.f396575i = gVar7;
            } else {
                l16.f d19 = l16.g.d(gVar2);
                d19.d(gVar7);
                this.f396575i = d19.c();
            }
            this.f396571e |= 8;
        }
        if ((jVar.f396580e & 16) == 16) {
            l16.g gVar8 = jVar.f396585m;
            if ((this.f396571e & 16) != 16 || (gVar = this.f396576m) == l16.g.f396563m) {
                this.f396576m = gVar8;
            } else {
                l16.f d27 = l16.g.d(gVar);
                d27.d(gVar8);
                this.f396576m = d27.c();
            }
            this.f396571e |= 16;
        }
        this.f432870d = this.f432870d.e(jVar.f396579d);
        return this;
    }
}
