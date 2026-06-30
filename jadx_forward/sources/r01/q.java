package r01;

/* loaded from: classes11.dex */
public class q extends l75.n0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f449718f = {l75.n0.m145250x3fdc6f77(r01.m.U, "BizEnterprise")};

    /* renamed from: g, reason: collision with root package name */
    public static r45.ud f449719g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f449720d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f449721e;

    public q(l75.k0 k0Var) {
        super(k0Var, r01.m.U, "BizEnterprise", null);
        this.f449721e = new r01.n(this);
        this.f449720d = k0Var;
        k0Var.A("BizEnterprise", "CREATE INDEX IF NOT EXISTS BizEnterpriseUserNameIndex ON BizEnterprise ( userName )");
        gm0.j1.n().f354821b.a(1343, this);
        gm0.j1.n().f354821b.a(1228, this);
    }

    public int D0() {
        if (f449719g == null) {
            f449719g = new r45.ud();
        }
        try {
            return java.lang.Integer.parseInt(f449719g.f468787m);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public r01.m J0(java.lang.String str) {
        r01.m y07 = y0(str);
        if (y07 != null) {
            return y07;
        }
        r01.m mVar = new r01.m();
        mVar.f66043xdde069b = str;
        mVar.f66038x29b98d8d = 0;
        mVar.f66045x6bcd764a = 0;
        mVar.f66042xdda8b7c = 0;
        mVar.f66047xed01805d = 0;
        mVar.f66048x2e6e2183 = 0;
        mVar.f66050x2a8d0441 = 0L;
        mVar.f66046x771ad30a = 0L;
        mVar.f66034x736dcb67 = false;
        mVar.f66049x4e116875 = 0;
        return mVar;
    }

    public boolean L0(r45.hk hkVar) {
        int i17;
        r01.m J0 = J0(hkVar.f457754d);
        J0.f66043xdde069b = hkVar.f457754d;
        J0.f66038x29b98d8d = hkVar.f457755e;
        J0.f66045x6bcd764a = hkVar.f457756f;
        J0.f66048x2e6e2183 = hkVar.f457758h;
        J0.f66050x2a8d0441 = hkVar.f457759i;
        J0.f66046x771ad30a = hkVar.f457760m;
        J0.f66044xde11b4a = hkVar.f457761n;
        J0.f66034x736dcb67 = hkVar.f457762o;
        J0.f66049x4e116875 = hkVar.f457763p;
        J0.f66040x9ac9caa3 = hkVar.f457764q;
        J0.f66041xa74c45a8 = hkVar.f457766s;
        r45.ry ryVar = hkVar.f457767t;
        if (ryVar != null) {
            J0.f66036x32d3e5e3 = ryVar.f466813d;
            J0.f66037x57d5bccc = ryVar.f466814e;
        }
        J0.f66035x86411b2a = hkVar.f457769v;
        try {
            r45.ik ikVar = new r45.ik();
            ikVar.f458635d = hkVar.f457768u;
            ikVar.f458636e = hkVar.f457770w;
            ikVar.f458637f = hkVar.f457771x;
            ikVar.f458638g = hkVar.f457772y;
            J0.f66039x3c18ecc6 = ikVar.mo14344x5f01b1f6();
        } catch (java.lang.Throwable unused) {
        }
        f449719g = hkVar.f457765r;
        if (hkVar.f457759i == 0 && hkVar.f457760m == 0 && (i17 = hkVar.f457755e) != 0) {
            J0.f66050x2a8d0441 = hkVar.f457756f;
            J0.f66046x771ad30a = i17;
        }
        int i18 = hkVar.f457757g & (-9);
        hkVar.f457757g = i18;
        J0.f66042xdda8b7c = (J0.f66042xdda8b7c & 8) | i18;
        return P0(J0);
    }

    public boolean P0(r01.m mVar) {
        if (mVar == null) {
            return false;
        }
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(mVar);
        if (!mo880xb970c2b9) {
            mo880xb970c2b9 = super.mo11260x413cb2b4(mVar);
        }
        if (mo880xb970c2b9) {
            r01.o oVar = new r01.o();
            oVar.f449701a = mVar.f66043xdde069b;
            l75.v0 v0Var = this.f449721e;
            v0Var.d(oVar);
            v0Var.c();
        }
        return mo880xb970c2b9;
    }

    public boolean W0(java.lang.String str) {
        r01.m y07 = y0(str);
        if (y07 != null) {
            int i17 = y07.f66042xdda8b7c;
            if ((i17 & 1) != 0 && (i17 & 16) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b1(java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (r01.z.j(str)) {
            i17 = 1;
        } else {
            if (!r01.z.h(str)) {
                return false;
            }
            i17 = 2;
        }
        return gm0.j1.n().f354821b.h(new r01.i3(str, i17, u0Var), 0);
    }

    public boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        r01.m mVar = new r01.m();
        mVar.f66043xdde069b = str;
        boolean mo9951xb06685ab = super.mo9951xb06685ab(mVar, "userName");
        if (mo9951xb06685ab) {
            r01.o oVar = new r01.o();
            oVar.f449701a = str;
            l75.v0 v0Var = this.f449721e;
            v0Var.d(oVar);
            v0Var.c();
        }
        return mo9951xb06685ab;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gi5 gi5Var;
        r45.hk hkVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        r45.gi5 gi5Var2;
        r45.hk hkVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        if (i17 == 0 && i18 == 0) {
            r45.q16 q16Var = null;
            if (m1Var instanceof r01.i3) {
                r01.i3 i3Var = (r01.i3) m1Var;
                com.p314xaae8f345.mm.p944x882e457a.o oVar = i3Var.f449650e;
                r45.gb3 gb3Var = (oVar == null || (fVar2 = oVar.f152244b.f152233a) == null) ? null : (r45.gb3) fVar2;
                if (gb3Var == null || (gi5Var2 = gb3Var.f456603d) == null || gi5Var2.f456821d != 0 || (hkVar2 = gb3Var.f456604e) == null) {
                    return;
                }
                if (!L0(hkVar2)) {
                    i18 = -1;
                }
                com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = (com.p314xaae8f345.mm.p944x882e457a.u0) i3Var.f449651f;
                if (u0Var != null) {
                    u0Var.mo815x76e0bfae(i17, i18, str, m1Var);
                }
            }
            if (m1Var instanceof r01.o3) {
                r01.o3 o3Var = (r01.o3) m1Var;
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = o3Var.f449706e;
                if (oVar2 != null && (fVar = oVar2.f152244b.f152233a) != null) {
                    q16Var = (r45.q16) fVar;
                }
                if (q16Var == null || (gi5Var = q16Var.f465104d) == null || gi5Var.f456821d != 0 || (hkVar = q16Var.f465105e) == null) {
                    return;
                }
                int i19 = L0(hkVar) ? i18 : -1;
                com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = (com.p314xaae8f345.mm.p944x882e457a.u0) o3Var.f449707f;
                if (u0Var2 != null) {
                    u0Var2.mo815x76e0bfae(i17, i19, str, m1Var);
                }
            }
        }
    }

    public r01.m y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        r01.m mVar = new r01.m();
        mVar.f66043xdde069b = str;
        if (super.get(mVar, new java.lang.String[0])) {
            return mVar;
        }
        b1(str, null);
        return null;
    }

    public java.lang.String z0(int i17) {
        if (f449719g == null) {
            f449719g = new r45.ud();
        }
        if (i17 == 0) {
            return f449719g.f468781d;
        }
        if (i17 == 1) {
            return f449719g.f468782e;
        }
        if (i17 != 2) {
            return null;
        }
        return f449719g.f468783f;
    }
}
