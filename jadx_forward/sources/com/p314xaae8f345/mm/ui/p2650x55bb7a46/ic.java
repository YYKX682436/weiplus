package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class ic {
    public static void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        long o17 = c01.w9.o(f9Var.Q0());
        if (o17 == f9Var.mo78012x3fdd41df()) {
            o17++;
        }
        f9Var.e1(o17);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(f9Var.m124847x74d37ac6(), f9Var.Q0());
        if (J0 == null || J0.f68106x315a5445 != f9Var.m124847x74d37ac6()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().b(f9Var.Q0(), f9Var.m124847x74d37ac6());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(true);
        sb6.append(", stack = ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        J0.f68112x10a0fed7 = 101;
        J0.f68109x90a9378 = 0L;
        J0.f68103x4a777c2 = java.lang.System.currentTimeMillis() / 1000;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(J0, new java.lang.String[0]);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().d();
    }

    public static void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendCardMsg, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        g(f9Var);
    }

    public static void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendEmoji, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6212x319a155e c6212x319a155e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6212x319a155e();
        c6212x319a155e.f136463g.f88524a = f9Var;
        c6212x319a155e.e();
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendLocation, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        try {
            y80.p0 p0Var = (y80.p0) ((z80.h0) i95.n0.c(z80.h0.class));
            p0Var.getClass();
            if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20534xd6ef6481()) != 0)) {
                g(f9Var);
                return;
            }
            p0Var.aj(f9Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "new resend location dispatched, msgId=" + f9Var.m124847x74d37ac6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResendMsgLogic", e17, "new resend location failed", new java.lang.Object[0]);
        }
    }

    public static void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5989x2fac034c c5989x2fac034c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5989x2fac034c();
        long o17 = c01.w9.o(f9Var.Q0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendMsgImage, msgId:%d, time[%d - > %d]", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()), java.lang.Long.valueOf(o17));
        if (o17 == f9Var.mo78012x3fdd41df()) {
            o17++;
        }
        f9Var.e1(o17);
        j15.d dVar = new j15.d();
        dVar.m126728xdc93280d(f9Var.j());
        r15.b l17 = dVar.l();
        if (l17 != null) {
            l17.o(null);
        }
        dVar.x(l17);
        f9Var.d1(dVar.m126747x696739c());
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        c5989x2fac034c.f136284g.f88805a = f9Var;
        c5989x2fac034c.e();
    }

    public static void f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendVoiceMsg, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.I4(f9Var.Q0())) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5937x8a9a0535 c5937x8a9a0535 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5937x8a9a0535();
            c5937x8a9a0535.f136241g.f89932a = f9Var;
            c5937x8a9a0535.e();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5936xb513ba50 c5936xb513ba50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5936xb513ba50();
            c5936xb513ba50.f136240g.f89851a = f9Var;
            c5936xb513ba50.e();
        }
    }

    public static void g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        if (m124847x74d37ac6 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResendMsgLogic", "sendMsgInternal failed msgId " + m124847x74d37ac6);
            return;
        }
        if (f9Var.Q0().equals("medianote") && (c01.z1.p() & 16384) == 0) {
            return;
        }
        if (w11.t1.a(f9Var.Q0())) {
            w11.p1 p1Var = w11.p1.f523635d;
            w11.r1 r1Var = new w11.r1();
            r1Var.f523670l = p1Var;
            r1Var.f523665g = m124847x74d37ac6;
            r1Var.e(f9Var.j());
            r1Var.g(f9Var.Q0());
            java.lang.String Q0 = f9Var.Q0();
            r1Var.f523659a = Q0 != null ? Q0 : "";
            r1Var.b();
            return;
        }
        w11.p1 p1Var2 = w11.p1.f523635d;
        w11.r1 r1Var2 = new w11.r1();
        r1Var2.f523670l = p1Var2;
        r1Var2.f523665g = m124847x74d37ac6;
        r1Var2.e(f9Var.j());
        r1Var2.g(f9Var.Q0());
        java.lang.String Q02 = f9Var.Q0();
        r1Var2.f523659a = Q02 != null ? Q02 : "";
        r1Var2.f523663e = f9Var.mo78013xfb85f7b0();
        r1Var2.f523664f = 0;
        r1Var2.f523667i = 2;
        if (r1Var2.a().a()) {
            long o17 = c01.w9.o(f9Var.Q0());
            if (o17 == f9Var.mo78012x3fdd41df()) {
                o17++;
            }
            f9Var.e1(o17);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResendMsgLogic", "sendMsgInternal, doScene return false, directly mark msg to failed");
        f9Var.r1(5);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363();
        c5991xa0d42363.f136286g.f88994a = f9Var;
        c5991xa0d42363.e();
    }
}
