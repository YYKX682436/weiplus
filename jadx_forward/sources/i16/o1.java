package i16;

/* loaded from: classes16.dex */
public final class o1 extends p16.s {

    /* renamed from: u, reason: collision with root package name */
    public static final i16.o1 f369203u;

    /* renamed from: v, reason: collision with root package name */
    public static final p16.j0 f369204v = new i16.m1();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f369205e;

    /* renamed from: f, reason: collision with root package name */
    public int f369206f;

    /* renamed from: g, reason: collision with root package name */
    public int f369207g;

    /* renamed from: h, reason: collision with root package name */
    public int f369208h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f369209i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f369210m;

    /* renamed from: n, reason: collision with root package name */
    public int f369211n;

    /* renamed from: o, reason: collision with root package name */
    public i16.l1 f369212o;

    /* renamed from: p, reason: collision with root package name */
    public int f369213p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f369214q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f369215r;

    /* renamed from: s, reason: collision with root package name */
    public byte f369216s;

    /* renamed from: t, reason: collision with root package name */
    public int f369217t;

    static {
        i16.o1 o1Var = new i16.o1(true);
        f369203u = o1Var;
        o1Var.l();
    }

    public o1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f369216s = (byte) -1;
        this.f369217t = -1;
        this.f369205e = qVar.f432870d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        mo134562x9d9c349b();
        p16.r i17 = i();
        if ((this.f369206f & 1) == 1) {
            jVar.m(1, this.f369207g);
        }
        if ((this.f369206f & 2) == 2) {
            jVar.m(2, this.f369208h);
        }
        for (int i18 = 0; i18 < this.f369209i.size(); i18++) {
            jVar.o(3, (p16.h0) this.f369209i.get(i18));
        }
        if ((this.f369206f & 4) == 4) {
            jVar.o(4, this.f369210m);
        }
        if ((this.f369206f & 8) == 8) {
            jVar.m(5, this.f369211n);
        }
        if ((this.f369206f & 16) == 16) {
            jVar.o(6, this.f369212o);
        }
        if ((this.f369206f & 32) == 32) {
            jVar.m(7, this.f369213p);
        }
        for (int i19 = 0; i19 < this.f369214q.size(); i19++) {
            jVar.o(8, (p16.h0) this.f369214q.get(i19));
        }
        for (int i27 = 0; i27 < this.f369215r.size(); i27++) {
            jVar.m(31, ((java.lang.Integer) this.f369215r.get(i27)).intValue());
        }
        i17.a(200, jVar);
        jVar.r(this.f369205e);
    }

    @Override // p16.i0
    /* renamed from: getDefaultInstanceForType */
    public p16.h0 mo134575x786693c3() {
        return f369203u;
    }

    @Override // p16.h0
    /* renamed from: getSerializedSize */
    public int mo134562x9d9c349b() {
        int i17 = this.f369217t;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f369206f & 1) == 1 ? p16.j.b(1, this.f369207g) + 0 : 0;
        if ((this.f369206f & 2) == 2) {
            b17 += p16.j.b(2, this.f369208h);
        }
        for (int i18 = 0; i18 < this.f369209i.size(); i18++) {
            b17 += p16.j.d(3, (p16.h0) this.f369209i.get(i18));
        }
        if ((this.f369206f & 4) == 4) {
            b17 += p16.j.d(4, this.f369210m);
        }
        if ((this.f369206f & 8) == 8) {
            b17 += p16.j.b(5, this.f369211n);
        }
        if ((this.f369206f & 16) == 16) {
            b17 += p16.j.d(6, this.f369212o);
        }
        if ((this.f369206f & 32) == 32) {
            b17 += p16.j.b(7, this.f369213p);
        }
        for (int i19 = 0; i19 < this.f369214q.size(); i19++) {
            b17 += p16.j.d(8, (p16.h0) this.f369214q.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f369215r.size(); i28++) {
            i27 += p16.j.c(((java.lang.Integer) this.f369215r.get(i28)).intValue());
        }
        int size = b17 + i27 + (this.f369215r.size() * 2) + e() + this.f369205e.mo157707x35e001();
        this.f369217t = size;
        return size;
    }

    @Override // p16.i0
    /* renamed from: isInitialized */
    public final boolean mo134563xf582434a() {
        byte b17 = this.f369216s;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!((this.f369206f & 2) == 2)) {
            this.f369216s = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f369209i.size(); i17++) {
            if (!((i16.s1) this.f369209i.get(i17)).mo134563xf582434a()) {
                this.f369216s = (byte) 0;
                return false;
            }
        }
        if (((this.f369206f & 4) == 4) && !this.f369210m.mo134563xf582434a()) {
            this.f369216s = (byte) 0;
            return false;
        }
        if (((this.f369206f & 16) == 16) && !this.f369212o.mo134563xf582434a()) {
            this.f369216s = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f369214q.size(); i18++) {
            if (!((i16.k) this.f369214q.get(i18)).mo134563xf582434a()) {
                this.f369216s = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f369216s = (byte) 1;
            return true;
        }
        this.f369216s = (byte) 0;
        return false;
    }

    public final void l() {
        this.f369207g = 6;
        this.f369208h = 0;
        this.f369209i = java.util.Collections.emptyList();
        i16.l1 l1Var = i16.l1.f369113z;
        this.f369210m = l1Var;
        this.f369211n = 0;
        this.f369212o = l1Var;
        this.f369213p = 0;
        this.f369214q = java.util.Collections.emptyList();
        this.f369215r = java.util.Collections.emptyList();
    }

    @Override // p16.h0
    /* renamed from: newBuilderForType */
    public p16.g0 mo134564xab31548() {
        return new i16.n1();
    }

    @Override // p16.h0
    /* renamed from: toBuilder */
    public p16.g0 mo134565xaaa148a0() {
        i16.n1 n1Var = new i16.n1();
        n1Var.e(this);
        return n1Var;
    }

    public o1(boolean z17) {
        this.f369216s = (byte) -1;
        this.f369217t = -1;
        this.f369205e = p16.g.f432816d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0022. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public o1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f369216s = (byte) -1;
        this.f369217t = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            ?? r47 = 4;
            if (!z17) {
                try {
                    try {
                        int n17 = hVar.n();
                        i16.k1 k1Var = null;
                        switch (n17) {
                            case 0:
                                z17 = true;
                            case 8:
                                this.f369206f |= 1;
                                this.f369207g = hVar.k();
                            case 16:
                                this.f369206f |= 2;
                                this.f369208h = hVar.k();
                            case 26:
                                if ((i17 & 4) != 4) {
                                    this.f369209i = new java.util.ArrayList();
                                    i17 |= 4;
                                }
                                this.f369209i.add(hVar.g(i16.s1.f369259t, lVar));
                            case 34:
                                if ((this.f369206f & 4) == 4) {
                                    i16.l1 l1Var = this.f369210m;
                                    l1Var.getClass();
                                    k1Var = i16.l1.m(l1Var);
                                }
                                i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f369210m = l1Var2;
                                if (k1Var != null) {
                                    k1Var.b(l1Var2);
                                    this.f369210m = k1Var.d();
                                }
                                this.f369206f |= 4;
                            case 40:
                                this.f369206f |= 8;
                                this.f369211n = hVar.k();
                            case 50:
                                if ((this.f369206f & 16) == 16) {
                                    i16.l1 l1Var3 = this.f369212o;
                                    l1Var3.getClass();
                                    k1Var = i16.l1.m(l1Var3);
                                }
                                i16.l1 l1Var4 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f369212o = l1Var4;
                                if (k1Var != null) {
                                    k1Var.b(l1Var4);
                                    this.f369212o = k1Var.d();
                                }
                                this.f369206f |= 16;
                            case 56:
                                this.f369206f |= 32;
                                this.f369213p = hVar.k();
                            case 66:
                                if ((i17 & 128) != 128) {
                                    this.f369214q = new java.util.ArrayList();
                                    i17 |= 128;
                                }
                                this.f369214q.add(hVar.g(i16.k.f369087n, lVar));
                            case 248:
                                if ((i17 & 256) != 256) {
                                    this.f369215r = new java.util.ArrayList();
                                    i17 |= 256;
                                }
                                this.f369215r.add(java.lang.Integer.valueOf(hVar.k()));
                            case 250:
                                int d17 = hVar.d(hVar.k());
                                if ((i17 & 256) != 256 && hVar.b() > 0) {
                                    this.f369215r = new java.util.ArrayList();
                                    i17 |= 256;
                                }
                                while (hVar.b() > 0) {
                                    this.f369215r.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d17);
                                break;
                            default:
                                r47 = j(hVar, j17, lVar, n17);
                                if (r47 == 0) {
                                    z17 = true;
                                }
                        }
                    } catch (java.lang.Throwable th6) {
                        if ((i17 & 4) == r47) {
                            this.f369209i = java.util.Collections.unmodifiableList(this.f369209i);
                        }
                        if ((i17 & 128) == 128) {
                            this.f369214q = java.util.Collections.unmodifiableList(this.f369214q);
                        }
                        if ((i17 & 256) == 256) {
                            this.f369215r = java.util.Collections.unmodifiableList(this.f369215r);
                        }
                        try {
                            j17.i();
                        } catch (java.io.IOException unused) {
                            this.f369205e = m17.c();
                            h();
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            this.f369205e = m17.c();
                            throw th7;
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
            } else {
                if ((i17 & 4) == 4) {
                    this.f369209i = java.util.Collections.unmodifiableList(this.f369209i);
                }
                if ((i17 & 128) == 128) {
                    this.f369214q = java.util.Collections.unmodifiableList(this.f369214q);
                }
                if ((i17 & 256) == 256) {
                    this.f369215r = java.util.Collections.unmodifiableList(this.f369215r);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused2) {
                    this.f369205e = m17.c();
                    h();
                    return;
                } catch (java.lang.Throwable th8) {
                    this.f369205e = m17.c();
                    throw th8;
                }
            }
        }
    }
}
