package fj1;

/* loaded from: classes7.dex */
public final class n extends lc3.b0 implements fj1.q {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f344661f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f344662g;

    public n(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        this.f344661f = clazz;
        this.f344662g = jz5.h.b(new fj1.l(this));
    }

    @Override // lc3.c0
    public java.lang.String f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f344662g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (java.lang.String) mo141623x754a37bb;
    }

    @Override // lc3.b0
    public lc3.b0 r() {
        return new fj1.n(this.f344661f);
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var;
        lc3.a0 a0Var;
        ej1.c cVar;
        lc3.a0 a0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String str = this.f399425c;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("privateData");
            throw null;
        }
        java.lang.String b17 = fj1.q.b(str);
        if (b17 == null || b17.length() == 0) {
            return;
        }
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        fj1.y d17 = ((fh1.z) ((fh1.x0) eVar).f344155x).d(b17);
        if (d17 == null) {
            yz5.l s17 = s();
            try {
                a0Var2 = (lc3.a0) new lc3.a0().put("errno", 4).put("errMsg", "fail:internal error");
            } catch (java.lang.Exception unused) {
                a0Var2 = new lc3.a0();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a0Var2, "errorsInfoToJson(...)");
            s17.mo146xb9724478(a0Var2);
            return;
        }
        try {
            cVar = d17.f344682i;
        } catch (jz5.e0 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAMagicBrushFrameMBJsApiAsyncWrapper[" + f() + ']', "invoke get exception:" + e17);
            k0Var = null;
        }
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsapiPool");
            throw null;
        }
        k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) ((java.util.HashMap) ((jz5.n) ((fj1.j) cVar).f344654b).mo141623x754a37bb()).get(f());
        if (k0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(d17.f344689p, null, null, new fj1.m(k0Var, d17, this, data, null), 3, null);
            return;
        }
        yz5.l s18 = s();
        try {
            a0Var = (lc3.a0) new lc3.a0().put("errno", 100).put("errMsg", "fail:jsapi not supported");
        } catch (java.lang.Exception unused2) {
            a0Var = new lc3.a0();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a0Var, "errorsInfoToJson(...)");
        s18.mo146xb9724478(a0Var);
    }
}
