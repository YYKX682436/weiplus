package gi4;

/* loaded from: classes11.dex */
public final class e extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1Var);
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(r1Var.f523660b) || o(r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // et1.a, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof k12.q) {
            java.lang.String str = r1Var.f523660b;
            r1Var.f523660b = t(str);
            r1Var.f523661c = s(str);
            java.lang.String str2 = r1Var.f523661c;
            java.lang.String str3 = r1Var.f523660b;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = ((h12.a) ((k12.q) r1Var)).f359610q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c21053xdbf1e5f4, "getEmojiInfo(...)");
            m1Var.f523621a = new dt1.b(4, str, str2, str3, c21053xdbf1e5f4, r1Var.f523665g, r1Var.f523659a);
        }
        return m1Var;
    }

    @Override // et1.a
    public boolean o(w11.r1 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (!(params instanceof m11.m1)) {
            return false;
        }
        java.lang.String str = params.f523674p;
        java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        return str != null && str.endsWith("statussquaremsg");
    }

    @Override // et1.a
    public int r() {
        return 4;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).getClass();
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        return a17;
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).wi(sessionId);
    }
}
