package bs1;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static r45.fm6 f105328a;

    public static r45.fm6 a() {
        r45.fm6 fm6Var = f105328a;
        if (fm6Var != null) {
            return fm6Var;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        r45.fm6 fm6Var2 = new r45.fm6();
        try {
            fm6Var2.mo11468x92b714fd(android.util.Base64.decode(str, 0));
            f105328a = fm6Var2;
            return fm6Var2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizTimeLineOftenReadHelper", "getOftenRead exp: %s", e17.getMessage());
            return null;
        }
    }

    public static void b(r45.fm6 fm6Var) {
        f105328a = fm6Var;
        try {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC, android.util.Base64.encodeToString(fm6Var.mo14344x5f01b1f6(), 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizTimeLineOftenReadHelper", "resetOftenRead exp: %s", e17.getMessage());
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC, "");
        }
    }
}
