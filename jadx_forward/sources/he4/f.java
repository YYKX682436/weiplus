package he4;

/* loaded from: classes4.dex */
public final class f extends he4.c {
    @Override // he4.c
    public java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        e("CheckChain doWork start >> threadName: " + java.lang.Thread.currentThread().getName());
        e("doWorkImpl >> mediaId: " + c18437xfbc5d82.g() + " parseFinish: " + c18437xfbc5d82.m() + " duration: " + c18437xfbc5d82.f() + " path: " + c18437xfbc5d82.i());
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(c18437xfbc5d82.i(), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doWorkImpl >> mediaInfo: ");
        sb6.append(d17);
        e(sb6.toString());
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        long c17 = qp.b.f447207a.c();
        int i17 = d17.f243915a;
        if (i17 != 0 && i17 <= c17) {
            java.lang.String h17 = c18437xfbc5d82.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            fe4.d dVar = new fe4.d(h17, 0, "is check finish");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
            return dVar;
        }
        d("duration is invalid");
        int i18 = d17.f243915a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDurationTimeout", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("live_clk_scene", 4);
            hashMap.put("live_duration_ms", java.lang.Integer.valueOf(i18));
            java.lang.String l17 = ca4.z0.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "checkSnsPostSessionId(...)");
            hashMap.put("sns_publish_sessionid", l17);
            hashMap.put("live_abnormal_type", 3);
            java.lang.String e17 = kk.k.e(c18437xfbc5d82.b());
            if (e17 == null) {
                e17 = "";
            }
            hashMap.put("pic_md5", e17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("sns_live_abnormal", null, hashMap, 36244);
            e("reportDurationTimeout success: actual=" + i18 + ", max=" + c17 + ", md5=" + hashMap.get("pic_md5"));
        } catch (java.lang.Exception e18) {
            d("reportDurationTimeout error: " + e18.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDurationTimeout", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        java.lang.String h18 = c18437xfbc5d82.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h18);
        fe4.d dVar2 = new fe4.d(h18, 1, "duration error :" + c18437xfbc5d82.f());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        return dVar2;
    }

    @Override // he4.c
    public java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        return "SnsLivePhotoChain.CheckChain";
    }

    @Override // he4.c
    public long c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        return 1000L;
    }
}
