package m54;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.a0 f405776a = new m54.a0();

    public final void a(java.lang.String uxInfo, int i17, java.lang.String adExtInfo, java.lang.String canvasDynamicInfo, long j17, yz5.a aVar, yz5.a aVar2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAntiCheating", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghAntiCheatingUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adExtInfo, "adExtInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasDynamicInfo, "canvasDynamicInfo");
        ib4.a aVar3 = new ib4.a("", "", uxInfo, i17, adExtInfo, canvasDynamicInfo, j17);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        if (d17 != null) {
            d17.a(4679, new m54.z(aVar, aVar2));
            d17.g(aVar3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghAntiAbuseUtil", "the scene queue is null!!!!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAntiCheating", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghAntiCheatingUtil");
    }
}
