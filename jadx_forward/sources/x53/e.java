package x53;

/* loaded from: classes11.dex */
public final class e extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(r1Var != null ? r1Var.f523669k : null)) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1Var);
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(r1Var.f523660b) || o(r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // et1.a, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof k12.q) {
            java.lang.String str = r1Var.f523660b;
            r1Var.f523660b = t(str);
            r1Var.f523661c = s(str);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.String str2 = r1Var.f523661c;
            java.lang.String str3 = r1Var.f523660b;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = ((h12.a) ((k12.q) r1Var)).f359610q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c21053xdbf1e5f4, "getEmojiInfo(...)");
            m1Var.f523621a = ((px.c) e0Var).wi(3, str, str2, str3, c21053xdbf1e5f4, r1Var.f523665g, r1Var.f523659a);
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
        return str != null && str.endsWith("gamelifesess");
    }

    @Override // et1.a
    public int r() {
        return 3;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(sessionId)).t0();
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(sessionId)).v0();
    }
}
