package jr4;

/* loaded from: classes11.dex */
public final class i extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1Var);
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(r1Var.f523660b) || o(r1Var);
    }

    @Override // et1.a, et1.l
    public w11.m1 m(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1Var);
        java.lang.String str = r1Var.f523660b;
        java.lang.String z07 = ((fr4.g0) i95.n0.c(fr4.g0.class)).Vi().z0(str);
        r1Var.f523661c = ((fr4.g0) i95.n0.c(fr4.g0.class)).Di();
        m1Var.f523621a = ((px.c) ((qx.e0) i95.n0.c(qx.e0.class))).Ai(20, str, r1Var.f523661c, z07, r1Var.f523662d, r1Var.f523665g);
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
        return str != null && str.endsWith("zhugemsg");
    }

    @Override // et1.a
    public int r() {
        return 20;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.lang.String str = ((fr4.g0) i95.n0.c(fr4.g0.class)).Vi().y0(sessionId).f69157x5568d387;
        return str == null ? "" : str;
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((fr4.g0) i95.n0.c(fr4.g0.class)).Vi().z0(sessionId);
    }

    @Override // et1.a
    public void u(java.lang.String str, int i17, int i18, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.MsgInterceptor", "w1wpersonalmsg cgi callback, errCode: " + i18 + ", errMsg: " + str2);
    }
}
