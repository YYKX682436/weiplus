package w11;

/* loaded from: classes9.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 a(p15.h hVar) {
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizScreenshotMsgInfo", "from, msgSrcWxaInfo is null");
            return null;
        }
        java.lang.String n17 = hVar.n();
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizScreenshotMsgInfo", "from, imageID is null");
            return null;
        }
        java.lang.String j17 = hVar.j();
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizScreenshotMsgInfo", "from, articleUrl is null");
            return null;
        }
        java.lang.Long o17 = hVar.o();
        int longValue = o17 != null ? (int) o17.longValue() : -1;
        java.lang.Long k17 = hVar.k();
        long longValue2 = k17 != null ? k17.longValue() : -1L;
        java.lang.Long p17 = hVar.p();
        long longValue3 = p17 != null ? p17.longValue() : -1L;
        java.lang.Long l17 = hVar.l();
        return new com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6(n17, j17, longValue, longValue2, longValue3, l17 != null ? l17.longValue() : -1L);
    }

    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 c17 = c(msgInfo.j());
        if (c17 != null) {
            return c17;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        p15.h hVar = new p15.h();
        hVar.m126728xdc93280d(str);
        return a(hVar);
    }
}
