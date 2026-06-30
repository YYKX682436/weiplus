package fj1;

/* loaded from: classes7.dex */
public final class p extends lc3.d0 implements fj1.q {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f344664d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f344665e;

    public p(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        this.f344664d = clazz;
        this.f344665e = jz5.h.b(new fj1.o(this));
    }

    @Override // lc3.c0
    public java.lang.String f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f344665e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (java.lang.String) mo141623x754a37bb;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        lc3.a0 a0Var;
        lc3.a0 a0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String str = this.f399425c;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("privateData");
            throw null;
        }
        java.lang.String b17 = fj1.q.b(str);
        if (!(b17 == null || b17.length() == 0)) {
            lc3.e eVar = this.f399423a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            fj1.y d17 = ((fh1.z) ((fh1.x0) eVar).f344155x).d(b17);
            if (d17 != null) {
                ej1.c cVar = d17.f344682i;
                if (cVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsapiPool");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) ((java.util.HashMap) ((jz5.n) ((fj1.j) cVar).f344654b).mo141623x754a37bb()).get(f());
                if (k0Var == null) {
                    try {
                        a0Var = (lc3.a0) new lc3.a0().put("errno", 100).put("errMsg", "fail:jsapi not supported");
                    } catch (java.lang.Exception unused) {
                        a0Var = new lc3.a0();
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a0Var, "errorsInfoToJson(...)");
                    return a0Var;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) k0Var;
                fj1.b0 b0Var = d17.f344684k;
                if (b0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsapiInvokePermissionController");
                    throw null;
                }
                if (!b0Var.f344639b.a(b0Var.f344638a.d(), a1Var.getClass())) {
                    try {
                        a0Var2 = (lc3.a0) new lc3.a0().put("errno", 102).put("errMsg", "fail:jsapi has no permission");
                    } catch (java.lang.Exception unused2) {
                        a0Var2 = new lc3.a0();
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var2);
                    return a0Var2;
                }
                java.lang.String A = k0Var instanceof yc1.b ? a1Var.A(d17.d(), data, d17.d().mo50357xcd94f799()) : a1Var.z(d17.d(), data);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(A);
                lc3.a0 a0Var3 = new lc3.a0(A);
                if (!a0Var3.has("errCode")) {
                    a0Var3.put("errCode", 0);
                }
                return a0Var3;
            }
        }
        return new lc3.a0();
    }
}
