package qb2;

/* loaded from: classes11.dex */
public final class s0 extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1Var);
        java.lang.String str = r1Var.f523660b;
        return (str != null ? r26.i0.n(str, "@findermsg", false) : false) || o(r1Var);
    }

    @Override // et1.a
    public boolean o(w11.r1 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (!(params instanceof m11.m1)) {
            return false;
        }
        java.lang.String str = params.f523674p;
        java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        return str != null && str.endsWith("findermsg");
    }

    @Override // et1.a
    public int r() {
        return 1;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.f(sessionId);
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.h(sessionId);
    }
}
