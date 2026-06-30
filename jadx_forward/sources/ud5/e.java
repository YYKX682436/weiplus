package ud5;

@j95.b
/* loaded from: classes8.dex */
public final class e extends i95.w implements fb0.i {
    public nm5.b wi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        if (f9Var == null) {
            return null;
        }
        java.lang.String j17 = f9Var.j();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && f9Var.A0() == 0) {
            j17 = c01.w9.u(f9Var.j());
        }
        java.lang.String str2 = j17;
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgCompatService", "getFilePathAndExt fail, msgContent is null");
            return null;
        }
        java.lang.String str3 = v17.f430223o;
        java.lang.String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str3.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d d76 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6.d7(v17.f430199i, f9Var.m124847x74d37ac6(), f9Var.Q0(), v17.f430227p, str2);
        if (d76 != null && (str = d76.f68099xfeae815) != null) {
            str4 = str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lowerCase)) {
            return nm5.j.c(str4, lowerCase);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgCompatService", "filePath:" + str4 + " getFilePathAndExt fail, fileExt is null");
        return null;
    }
}
