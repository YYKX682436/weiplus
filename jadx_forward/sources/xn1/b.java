package xn1;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xn1.b f536987a = new xn1.b();

    public static void c(xn1.b bVar, int i17, int i18, java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num, java.lang.Long l19, java.lang.Long l27, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            str = null;
        }
        if ((i19 & 8) != 0) {
            l17 = null;
        }
        if ((i19 & 16) != 0) {
            l18 = null;
        }
        if ((i19 & 32) != 0) {
            num = null;
        }
        if ((i19 & 64) != 0) {
            l19 = null;
        }
        if ((i19 & 128) != 0) {
            l27 = null;
        }
        bVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6332xddae7a23 c6332xddae7a23 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6332xddae7a23();
        c6332xddae7a23.f136892d = i17;
        c6332xddae7a23.f136893e = i18;
        c6332xddae7a23.f136894f = num != null ? num.intValue() : 0;
        c6332xddae7a23.f136895g = l17 != null ? l17.longValue() : 0L;
        if (str == null) {
            str = "";
        }
        c6332xddae7a23.f136897i = c6332xddae7a23.b("SessionID", str, true);
        c6332xddae7a23.f136896h = l18 != null ? l18.longValue() : 0L;
        c6332xddae7a23.f136898j = l19 != null ? l19.longValue() : 0L;
        c6332xddae7a23.f136899k = l27 != null ? l27.longValue() : 0L;
        c6332xddae7a23.k();
        java.lang.String n17 = c6332xddae7a23.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackUpReportHelper", "report%s %s", 26824, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }

    public final void a(int i17, int i18, java.lang.String str) {
        c(this, i17, i18, str, null, null, null, null, null, 248, null);
    }

    public final void b(int i17, int i18, java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num) {
        c(this, i17, i18, str, l17, l18, num, null, null, 192, null);
    }
}
