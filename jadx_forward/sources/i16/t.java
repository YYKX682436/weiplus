package i16;

/* loaded from: classes16.dex */
public final class t extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f369271e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f369272f = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.u.f369289i     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.s r0 = (i16.s) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.u r2 = (i16.u) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f432904d     // Catch: java.lang.Throwable -> Le
            i16.u r3 = (i16.u) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.t.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.u) vVar);
        return this;
    }

    @Override // p16.g0
    /* renamed from: build */
    public p16.h0 mo134566x59bc66e() {
        i16.u c17 = c();
        if (c17.mo134563xf582434a()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.u c() {
        i16.u uVar = new i16.u(this, null);
        if ((this.f369271e & 1) == 1) {
            this.f369272f = java.util.Collections.unmodifiableList(this.f369272f);
            this.f369271e &= -2;
        }
        uVar.f369291e = this.f369272f;
        return uVar;
    }

    /* renamed from: clone */
    public java.lang.Object m134634x5a5dd5d() {
        i16.t tVar = new i16.t();
        tVar.d(c());
        return tVar;
    }

    public i16.t d(i16.u uVar) {
        if (uVar == i16.u.f369288h) {
            return this;
        }
        if (!uVar.f369291e.isEmpty()) {
            if (this.f369272f.isEmpty()) {
                this.f369272f = uVar.f369291e;
                this.f369271e &= -2;
            } else {
                if ((this.f369271e & 1) != 1) {
                    this.f369272f = new java.util.ArrayList(this.f369272f);
                    this.f369271e |= 1;
                }
                this.f369272f.addAll(uVar.f369291e);
            }
        }
        this.f432870d = this.f432870d.e(uVar.f369290d);
        return this;
    }
}
