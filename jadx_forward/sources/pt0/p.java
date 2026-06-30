package pt0;

/* loaded from: classes12.dex */
public interface p extends i95.m {

    /* renamed from: a1, reason: collision with root package name */
    public static final pt0.o f439751a1 = pt0.o.f439749a;

    static boolean B3(java.lang.String str) {
        return f439751a1.a(str);
    }

    static void G6(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        f439751a1.getClass();
        if (j17 > 0) {
            pt0.e0 e0Var = pt0.f0.f439742b1;
            if (e0Var.d()) {
                java.lang.String E0 = r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000);
                try {
                    f9Var = e0Var.o(str, j17, true);
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBDataClean.IDataCleanService", "checkMsgTalker error, msgLocalId: " + j17 + ", msgTalker: " + str);
                    f9Var = null;
                }
                if (f9Var == null || f9Var.m124847x74d37ac6() <= 0 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f9Var.Q0(), str)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DBDataClean.IDataCleanService", "found different msgId:" + f9Var.m124847x74d37ac6() + ", createTime: " + f9Var.mo78012x3fdd41df() + ", talker[" + f9Var.Q0() + " -> " + str + "], stack: " + E0);
                if (c01.id.c() - f9Var.mo78012x3fdd41df() > 1209600000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataClean.IDataCleanService", "ignore report, createTime:" + f9Var.mo78012x3fdd41df() + " msgId:" + f9Var.m124847x74d37ac6());
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                c6754x4f2fd58c.p("msg_check_talker");
                c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                c6754x4f2fd58c.u(E0);
                c6754x4f2fd58c.f140812h = c6754x4f2fd58c.b("msgTalker", f9Var.Q0(), true);
                c6754x4f2fd58c.f140813i = f9Var.m124847x74d37ac6();
                c6754x4f2fd58c.f140814j = f9Var.I0();
                c6754x4f2fd58c.f140811g = f9Var.mo78013xfb85f7b0();
                c6754x4f2fd58c.r(str);
                c6754x4f2fd58c.s(bm5.w.a(f9Var).name());
                c6754x4f2fd58c.t(java.lang.String.valueOf(f9Var.mo78012x3fdd41df()));
                c6754x4f2fd58c.k();
            }
        }
    }
}
