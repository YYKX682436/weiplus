package te5;

/* loaded from: classes9.dex */
public abstract class e2 {
    public static final boolean a(java.lang.String str, java.lang.String str2) {
        return b(str, str2) || c(str2);
    }

    public static final boolean b(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null);
        int a17 = k01.d.a(str);
        return (a17 == 3 || a17 == 4) ? kz5.n0.O(f07, str) : kz5.n0.O(f07, str) && f07.contains(c01.z1.r());
    }

    public static final boolean c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || ((k01.q0) i95.n0.c(k01.q0.class)) == null) {
            return false;
        }
        return (!(str != null && str.length() == 0) && str != null) ? r26.n0.B(str, "allPage", false) : false;
    }

    public static final java.lang.String d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        return ((et.k2) ((ft.n4) i95.n0.c(ft.n4.class))).wi(f9Var.G);
    }

    public static final boolean e(ot0.q qVar) {
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e g17;
        return (qVar == null || (g17 = g(qVar)) == null || g17.f152799i != 1) ? false : true;
    }

    public static final com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        w11.m2 m2Var = com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e.f152793n;
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e b17 = m2Var.b(msgInfo.j());
        if (b17 != null) {
            return b17;
        }
        java.lang.String str = msgInfo.G;
        if (str != null) {
            if (str.length() > 0) {
                p15.e eVar = new p15.e();
                eVar.m126728xdc93280d(str);
                return m2Var.a(eVar.t());
            }
        }
        return null;
    }

    public static final com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e g(ot0.q qVar) {
        if (qVar == null) {
            return null;
        }
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        p15.x xVar = aVar != null ? aVar.P : null;
        if (xVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaInfo", "from, msgSrcWxaInfo is null");
            return null;
        }
        java.lang.String m157697x74292566 = xVar.m157697x74292566();
        if (m157697x74292566 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaInfo", "from, appId is null");
            return null;
        }
        java.lang.String m157699x8010e5e4 = xVar.m157699x8010e5e4();
        if (m157699x8010e5e4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaInfo", "from, nickname is null");
            return null;
        }
        java.lang.String m157698x9f7ace00 = xVar.m157698x9f7ace00();
        if (m157698x9f7ace00 == null) {
            m157698x9f7ace00 = "";
        }
        return new com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e(m157697x74292566, m157699x8010e5e4, m157698x9f7ace00, xVar.j(), xVar.l(), xVar.n(), xVar.o());
    }
}
