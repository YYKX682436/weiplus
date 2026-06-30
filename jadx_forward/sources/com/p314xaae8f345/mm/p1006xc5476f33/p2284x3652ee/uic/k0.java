package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes11.dex */
public final class k0 {
    public k0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, android.content.Context context) {
        bw5.v70 v70Var;
        k0Var.getClass();
        try {
            bw5.zo0 mo11468x92b714fd = new bw5.zo0().mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
            v70Var = mo11468x92b714fd.f117608e[1] ? mo11468x92b714fd.f117607d : new bw5.v70();
        } catch (java.lang.Exception e17) {
            rk4.k5.d("TingMultiTaskRegisterUIC listenItem parseError " + e17.getStackTrace() + ", " + e17.getMessage(), null);
            v70Var = null;
        }
        if (v70Var != null) {
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.j(v70Var);
            lp0Var.g(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            i95.m c17 = i95.n0.c(qk.k6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            qk.k6 k6Var = (qk.k6) c17;
            android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            qk.k6.I1(k6Var, context2, true, lp0Var, new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_StarListen, false, 25165815, null), null, null, null, null, null, null, null, 2032, null);
        }
    }
}
