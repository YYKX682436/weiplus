package bs1;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static r45.fm6 f23795a;

    public static r45.fm6 a() {
        r45.fm6 fm6Var = f23795a;
        if (fm6Var != null) {
            return fm6Var;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        r45.fm6 fm6Var2 = new r45.fm6();
        try {
            fm6Var2.parseFrom(android.util.Base64.decode(str, 0));
            f23795a = fm6Var2;
            return fm6Var2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTimeLineOftenReadHelper", "getOftenRead exp: %s", e17.getMessage());
            return null;
        }
    }

    public static void b(r45.fm6 fm6Var) {
        f23795a = fm6Var;
        try {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC, android.util.Base64.encodeToString(fm6Var.toByteArray(), 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTimeLineOftenReadHelper", "resetOftenRead exp: %s", e17.getMessage());
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC, "");
        }
    }
}
