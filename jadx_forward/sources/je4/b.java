package je4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.b f380849a = new je4.b();

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm networkMgr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAutoPlay", "com.tencent.mm.plugin.sns.util.SnsAutoPlayUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkMgr, "networkMgr");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_autoplay, 0) == 1;
        java.lang.String m17 = wo.w0.m();
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = m17.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_video_autoplay_disable_device, "", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            if (r26.n0.B(Zi, lowerCase, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAutoPlayUtil", "model %s is hit, expt:%s", lowerCase, Zi);
                z17 = false;
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            int i17 = networkMgr.f253234b;
            boolean z18 = i17 == 2 || i17 == 3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAutoPlayUtil", "2G/3G autoplay false");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                r5 = networkMgr.f253234b == 5;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                if (r5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAutoPlayUtil", "wifi autoplay true");
                    r5 = true;
                } else {
                    java.lang.Object m18 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m18, "null cannot be cast to non-null type kotlin.Boolean");
                    r5 = ((java.lang.Boolean) m18).booleanValue();
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAutoPlayUtil", "autoPlay DynamicConfig false");
            r5 = z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAutoPlayUtil", "autoPlay:%s", java.lang.Boolean.valueOf(r5));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAutoPlay", "com.tencent.mm.plugin.sns.util.SnsAutoPlayUtil");
        return r5;
    }
}
