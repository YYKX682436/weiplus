package qy4;

/* loaded from: classes11.dex */
public final class f extends et1.a implements et1.n {
    @Override // et1.a, et1.l
    public w11.m1 b(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var != null) {
            java.lang.String str = r1Var.f523660b;
            java.lang.String s17 = s(str);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(r1Var.f523665g);
            java.lang.String str2 = r1Var.f523662d;
            ((px.c) e0Var).getClass();
            m1Var.f523621a = new dt1.d(valueOf != null ? valueOf.longValue() : 0L, 24, str, s17, str, str2);
        }
        return m1Var;
    }

    @Override // et1.a, et1.l
    public w11.m1 h(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var != null) {
            java.lang.String str = r1Var.f523660b;
            java.lang.String s17 = s(str);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(r1Var.f523665g);
            java.lang.String str2 = r1Var.f523662d;
            int i17 = r1Var.f523663e;
            ((px.c) e0Var).getClass();
            m1Var.f523621a = new dt1.e(valueOf != null ? valueOf.longValue() : 0L, 24, str, s17, str, str2, i17);
        }
        return m1Var;
    }

    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        if (r1Var != null) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(r1Var.f523660b) || o(r1Var);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // et1.a, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof k12.q) {
            java.lang.String sessionId = r1Var.f523660b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            r1Var.f523660b = sessionId;
            r1Var.f523661c = s(sessionId);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.String str = r1Var.f523661c;
            java.lang.String str2 = r1Var.f523660b;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = ((h12.a) ((k12.q) r1Var)).f359610q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c21053xdbf1e5f4, "getEmojiInfo(...)");
            m1Var.f523621a = ((px.c) e0Var).wi(24, sessionId, str, str2, c21053xdbf1e5f4, r1Var.f523665g, r1Var.f523659a);
        }
        return m1Var;
    }

    @Override // et1.a, et1.l
    public w11.m1 m(w11.r1 r1Var) {
        c01.h7 h7Var;
        boolean z17 = true;
        if (r1Var != null && (h7Var = r1Var.f523668j) != null) {
            java.lang.String Ai = ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).Ai(r1Var.f523660b, h7Var.f118762d, h7Var.f118760b);
            if (Ai != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawCreateSendMsgInterceptor", "sendMsg: claw user forwarding unsupported msg type=%d, converting to text summary", java.lang.Integer.valueOf(r1Var.f523663e));
                r1Var.f523662d = Ai;
                r1Var.f523663e = 1;
            }
        }
        java.lang.Integer valueOf = r1Var != null ? java.lang.Integer.valueOf(r1Var.f523663e) : null;
        if (valueOf != null && valueOf.intValue() == 48) {
            return b(r1Var);
        }
        if ((valueOf == null || valueOf.intValue() != 42) && (valueOf == null || valueOf.intValue() != 66)) {
            z17 = false;
        }
        return z17 ? h(r1Var) : super.m(r1Var);
    }

    @Override // et1.a
    public boolean o(w11.r1 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (!(params instanceof m11.m1)) {
            return false;
        }
        java.lang.String str = params.f523674p;
        java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        return str != null && str.endsWith("weclaw");
    }

    @Override // et1.a
    public int r() {
        return 24;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        return r17;
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return sessionId;
    }
}
