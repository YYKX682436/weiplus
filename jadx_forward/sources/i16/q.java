package i16;

/* loaded from: classes16.dex */
public final class q extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f369218g;

    /* renamed from: h, reason: collision with root package name */
    public int f369219h = 6;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f369220i = java.util.Collections.emptyList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f369221m = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.r.f369235p     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.p r0 = (i16.p) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.r r2 = (i16.r) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.r r3 = (i16.r) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.e(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.q.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.r) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.r d17 = d();
        if (d17.mo134563xf582434a()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    /* renamed from: clone */
    public java.lang.Object m134625x5a5dd5d() {
        i16.q qVar = new i16.q();
        qVar.e(d());
        return qVar;
    }

    public i16.r d() {
        i16.r rVar = new i16.r(this, null);
        int i17 = this.f369218g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        rVar.f369238g = this.f369219h;
        if ((i17 & 2) == 2) {
            this.f369220i = java.util.Collections.unmodifiableList(this.f369220i);
            this.f369218g &= -3;
        }
        rVar.f369239h = this.f369220i;
        if ((this.f369218g & 4) == 4) {
            this.f369221m = java.util.Collections.unmodifiableList(this.f369221m);
            this.f369218g &= -5;
        }
        rVar.f369240i = this.f369221m;
        rVar.f369237f = i18;
        return rVar;
    }

    public i16.q e(i16.r rVar) {
        if (rVar == i16.r.f369234o) {
            return this;
        }
        if ((rVar.f369237f & 1) == 1) {
            int i17 = rVar.f369238g;
            this.f369218g = 1 | this.f369218g;
            this.f369219h = i17;
        }
        if (!rVar.f369239h.isEmpty()) {
            if (this.f369220i.isEmpty()) {
                this.f369220i = rVar.f369239h;
                this.f369218g &= -3;
            } else {
                if ((this.f369218g & 2) != 2) {
                    this.f369220i = new java.util.ArrayList(this.f369220i);
                    this.f369218g |= 2;
                }
                this.f369220i.addAll(rVar.f369239h);
            }
        }
        if (!rVar.f369240i.isEmpty()) {
            if (this.f369221m.isEmpty()) {
                this.f369221m = rVar.f369240i;
                this.f369218g &= -5;
            } else {
                if ((this.f369218g & 4) != 4) {
                    this.f369221m = new java.util.ArrayList(this.f369221m);
                    this.f369218g |= 4;
                }
                this.f369221m.addAll(rVar.f369240i);
            }
        }
        c(rVar);
        this.f432870d = this.f432870d.e(rVar.f369236e);
        return this;
    }
}
