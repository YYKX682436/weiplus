package he4;

/* loaded from: classes4.dex */
public final class e extends he4.c {
    @Override // he4.c
    public java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fe4.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        e("analyzeChain doWork start >> threadName: " + java.lang.Thread.currentThread().getName());
        boolean m17 = c18437xfbc5d82.m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doWorkImpl >> mediaId: ");
        sb6.append(c18437xfbc5d82.g());
        sb6.append(" parseFinish: ");
        sb6.append(m17);
        sb6.append(" parsePath: ");
        java.lang.String i17 = c18437xfbc5d82.i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        sb6.append(i17);
        e(sb6.toString());
        if (m17) {
            e("analyzeChain doWork finish");
            java.lang.String h17 = c18437xfbc5d82.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            fe4.d dVar2 = new fe4.d(h17, 0, "is parsed finish");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
            return dVar2;
        }
        i95.m c17 = i95.n0.c(qk.r7.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        long g17 = c18437xfbc5d82.g();
        java.lang.String i18 = c18437xfbc5d82.i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i18);
        java.lang.String b17 = c18437xfbc5d82.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        aq.u0 ui6 = qk.r7.ui((qk.r7) c17, g17, i18, b17, 0L, 8, null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("parse result >> rsp: ");
        aq.s0 s0Var = ui6.f94508a;
        sb7.append(s0Var.f94493a);
        sb7.append(" errCode: ");
        sb7.append(s0Var.f94494b);
        e(sb7.toString());
        if (s0Var.f94493a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            c18437xfbc5d82.f252750q = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            long j17 = ui6.f94513f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDurationMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            c18437xfbc5d82.f252746m = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDurationMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCoverTimeStampMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            c18437xfbc5d82.f252745i = ui6.f94514g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCoverTimeStampMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            java.lang.String h18 = c18437xfbc5d82.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeOkResult$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            dVar = new fe4.d(h18, 0, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeOkResult$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            c18437xfbc5d82.f252750q = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            java.lang.String h19 = c18437xfbc5d82.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h19);
            dVar = new fe4.d(h19, 2, s0Var.m8802x9616526c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        return dVar;
    }

    @Override // he4.c
    public java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        return "SnsLivePhotoChain.AnalyzeChain";
    }

    @Override // he4.c
    public long c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        return 5000L;
    }
}
