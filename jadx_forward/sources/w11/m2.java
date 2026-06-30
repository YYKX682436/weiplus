package w11;

/* loaded from: classes9.dex */
public final class m2 {
    public m2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e a(p15.x xVar) {
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

    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        p15.x xVar = new p15.x();
        xVar.m126728xdc93280d(str);
        return a(xVar);
    }
}
