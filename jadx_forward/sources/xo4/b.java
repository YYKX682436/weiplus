package xo4;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xo4.b f537301a = new xo4.b();

    public static void a(xo4.b bVar, int i17, int i18, long j17, int i19, org.json.JSONObject jSONObject, java.lang.String str, r45.qt2 qt2Var, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            j17 = 0;
        }
        if ((i27 & 8) != 0) {
            i19 = -1;
        }
        if ((i27 & 16) != 0) {
            jSONObject = null;
        }
        if ((i27 & 32) != 0) {
            str = null;
        }
        if ((i27 & 64) != 0) {
            qt2Var = null;
        }
        bVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e c6549xf3595d4e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e();
        c6549xf3595d4e.w(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        c6549xf3595d4e.q(java.lang.String.valueOf(i17));
        c6549xf3595d4e.f138998g = i18;
        c6549xf3595d4e.r(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        c6549xf3595d4e.t(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).aj());
        c6549xf3595d4e.f139004m = j17;
        c6549xf3595d4e.u(str != null ? r26.i0.t(str, ",", ";", false) : "");
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (i19 != -1 && i18 == 1) {
            jSONObject.put("nextstep", i19);
        }
        if (qt2Var != null) {
            c6549xf3595d4e.s(qt2Var.m75945x2fec8307(1));
            c6549xf3595d4e.p(qt2Var.m75945x2fec8307(2));
            c6549xf3595d4e.v(java.lang.String.valueOf(qt2Var.m75939xb282bd08(7)));
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6549xf3595d4e.x(r26.i0.t(jSONObject2, ",", ";", false));
        c6549xf3595d4e.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderReport21874", "FinderReport21874 report scene:" + i17 + " eventCode:" + i18);
    }
}
