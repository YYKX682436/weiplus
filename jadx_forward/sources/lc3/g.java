package lc3;

/* loaded from: classes7.dex */
public final class g implements lc3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 f399428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.o f399429b;

    public g(lc3.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 pkg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkg, "pkg");
        this.f399429b = oVar;
        this.f399428a = pkg;
    }

    @Override // lc3.f
    public int a() {
        lc3.a k17;
        long j17;
        if (!(this.f399428a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r)) {
            return Integer.MAX_VALUE;
        }
        lc3.o oVar = this.f399429b;
        if (oVar.j()) {
            lc3.a k18 = oVar.k();
            if (k18 == null) {
                return 0;
            }
            j17 = k18.f399414d;
        } else {
            if (!oVar.i() || (k17 = oVar.k()) == null) {
                return 0;
            }
            j17 = k17.f399412b;
        }
        return (int) j17;
    }

    @Override // lc3.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        lc3.n0 m0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var = this.f399428a;
        if (u3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r) {
            m0Var = new lc3.l0(new lc3.i0(u3Var));
        } else {
            java.lang.String b17 = u3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getPkgPath(...)");
            m0Var = new lc3.m0(b17);
        }
        return lc3.o.h(this.f399429b, m0Var);
    }

    @Override // lc3.f
    public lc3.g0 c(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var = this.f399428a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u3Var, "<this>");
        if (u3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r) {
            return new lc3.j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.a(u3Var, path));
        }
        java.lang.String b17 = u3Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getPkgPath(...)");
        return new lc3.k0(b17, path);
    }

    @Override // lc3.f
    public java.lang.String d() {
        java.lang.String concat;
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.f157538a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var = this.f399428a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u3Var, "<this>");
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(u3Var.b());
        if (p17 != null && (concat = "MD5_".concat(p17)) != null) {
            return concat;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REV_");
        byte[] bytes = (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e + u3Var.b()).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        return sb6.toString();
    }
}
