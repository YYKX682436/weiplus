package gf;

/* loaded from: classes7.dex */
public final class g2 {
    public g2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final gf.h2 a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        java.util.List e07 = r26.n0.e0(str, new char[]{'.'}, false, 0, 6, null);
        try {
            if (e07.size() == 2 || e07.size() == 3) {
                return new gf.h2(((java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) e07.get(1)).toString()) << 8) + (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) e07.get(0)).toString()) << 16) + java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) (2 <= kz5.c0.h(e07) ? e07.get(2) : "0")).toString())) | 2097152);
            }
            return null;
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaRuntimeSkylineConfig", "toWxClientVersion(), parse " + str + " get exception:" + e17);
            return null;
        }
    }
}
