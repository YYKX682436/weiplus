package pc4;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final pc4.d f434943a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f434944b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f434945c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f434946d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f434947e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f434948f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f434949g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f434950h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f434951i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f434952j;

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f434953k;

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f434954l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Integer f434955m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f434956n;

    /* renamed from: o, reason: collision with root package name */
    public static r45.ga6 f434957o;

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f434958p;

    static {
        pc4.d dVar = new pc4.d();
        f434943a = dVar;
        f434944b = c01.z1.r();
        f434945c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_redownload_fix, false);
        f434946d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_biz_tail, true);
        f434947e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_use_avatar_crop, false);
        f434948f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_comment_is_support_ime_emoji, true);
        f434953k = jz5.h.b(pc4.b.f434941d);
        f434954l = jz5.h.b(pc4.c.f434942d);
        try {
            dVar.G();
            dVar.g();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Improve.SnsConfig", e17, "init sns config error:", new java.lang.Object[0]);
        }
        f434955m = 0;
        pc4.d dVar2 = f434943a;
        dVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableUseFlutterGroupWithLastGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17849xf26fd260()) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableUseFlutterGroupWithLastGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        f434958p = z17 || dVar2.n();
    }

    public static boolean e(pc4.d dVar, boolean z17, int i17, java.lang.Object obj) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableHDRPlay$default", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableHDRPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCheckHlgSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) f434953k).mo141623x754a37bb()).booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCheckHlgSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            if (booleanValue) {
                z18 = f434952j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                boolean booleanValue2 = ((java.lang.Boolean) ((jz5.n) f434954l).mo141623x754a37bb()).booleanValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                boolean z19 = !booleanValue2 && z18 && dVar.c();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableHDRPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableHDRPlay$default", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                return z19;
            }
        }
        z18 = f434951i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean booleanValue22 = ((java.lang.Boolean) ((jz5.n) f434954l).mo141623x754a37bb()).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (booleanValue22) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableHDRPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableHDRPlay$default", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z19;
    }

    public final boolean A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsPostPicWithAigcData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_pic_post_with_aigc_data, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsPostPicWithAigcData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsPublishUseMultiPicWidget", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = true;
        if (!pc4.e.f434959a.a() && j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17840x6e81b81()) != 1) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsPublishUseMultiPicWidget", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsTimelineShareToBizBtnEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        wa4.l lVar = wa4.l.f525788a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPoiPostBizExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        boolean z17 = wa4.l.f525789b || wa4.l.f525790c != -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPoiPostBizExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsTimelineShareToBizBtnEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTimelineExpandNewStyleEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17844x74cf29b3()) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "isTimelineExpandNewStyleEnable >> " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTimelineExpandNewStyleEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseStableFinderShareBtn", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        if (C()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_timeline_share_to_finder_stablize, false)) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseStableFinderShareBtn", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean F() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWsVersion3Open", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_WS_VERSION_INT_SYNC, -1);
        if (r17 > 0) {
            z17 = r17 == 3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWsVersion3Open", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return z17;
        }
        u();
        z17 = u() == 3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWsVersion3Open", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        f434944b = c01.z1.r();
        f434945c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_redownload_fix, false);
        f434949g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_try_fix_loadmore_bug, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "enableSnsImageUrlExpAppend:" + h() + " tryFixLoadMoreBug:" + f434949g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
    }

    public final void H(r45.cu5 cu5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (cu5Var == null || cu5Var.f453372d <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.SnsConfig", "setWsBuffer null buffer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "setWsBuffer length:" + cu5Var.f453372d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_config", gm0.j1.b().h(), 1).H("KVWsBufferKey", cu5Var.mo14344x5f01b1f6());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
    }

    public final void I(r45.ga6 ga6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (ga6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return;
        }
        f434957o = ga6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "updateServerConfig:" + ga6Var.mo12245xcc313de3() + " value:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_config", gm0.j1.b().h(), 1).H("SnsServerConfig", ga6Var.mo14344x5f01b1f6()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableBizCardStyle", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_biz_card_style, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableBizCardStyle", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableDescTextSelection", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (z17) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_ad_desc_text_selection, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableDescTextSelection", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return fj6;
        }
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_desc_text_selection, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableDescTextSelection", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj7;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlexibleVideo", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlexibleVideoViewConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17839x967d1929 c17839x967d1929 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17839x967d1929();
        int h17 = bm5.o1.f104252a.h(c17839x967d1929);
        boolean z17 = false;
        int nj6 = h17 != 2 ? h17 != 3 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(c17839x967d1929) : 0 : 1;
        java.lang.Integer num = f434955m;
        if (num == null || nj6 != num.intValue()) {
            f434955m = java.lang.Integer.valueOf(nj6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "checkConfigEnableFlexibleVideoView:" + nj6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlexibleVideoViewConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (nj6 == 1) {
            z17 = f434950h;
        } else if (nj6 == 2 ? !(!f434950h || !f434952j) : !(nj6 != 3 || !f434950h || !f434952j || !f434951i)) {
            z17 = true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f434956n, java.lang.Boolean.valueOf(z17))) {
            f434956n = java.lang.Boolean.valueOf(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "enableFlexibleVideo:" + z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlexibleVideo", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 timeLineObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlexibleWithHdrCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeLineObject, "timeLineObject");
        java.util.List a17 = qa4.f.a(timeLineObject);
        boolean z17 = false;
        if (c() && e(this, false, 1, null) && (!a17.isEmpty())) {
            ka4.n nVar = ka4.n.f387680a;
            r45.jj4 media = (r45.jj4) kz5.n0.X(a17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHDRMedia", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
            boolean z18 = nVar.b(media) >= 4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHDRMedia", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            if (z18) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlexibleWithHdrCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableLocalThumbSizeChange", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_image_thumb_size_change, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableLocalThumbSizeChange", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.SnsConfig", "eglGetDisplay EGL_NO_DISPLAY");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.SnsConfig", "eglInitialize failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(eglGetDisplay, 12373);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eglQueryString);
        f434951i = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_pq", false);
        f434952j = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_hlg", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "supportPQExt:" + f434951i + " supportHlgExt:" + f434952j);
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12344}, 0, null, 0, 0, iArr2, 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.SnsConfig", "eglChooseConfig error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "eglChooseConfig result:" + iArr2[0]);
        if (!android.opengl.EGL14.eglTerminate(eglGetDisplay)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.SnsConfig", "eglTerminate error");
        }
        f434950h = iArr2[0] > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "supportColor10Bit:" + f434950h);
        if (f434951i && f434952j && f434950h) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableSnsImageUrlExpAppend", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_image_url_exp_append, false);
        r45.ga6 p17 = p();
        int i17 = p17 != null ? p17.f456592u : 0;
        if (fj6 && i17 == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableSnsImageUrlExpAppend", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableSnsMultiSpecUpload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_image_publish_definition_enable, false);
        r45.ga6 p17 = p();
        int i17 = p17 != null ? p17.f456592u : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "enableSnsMultiSpecUpload:" + fj6);
        if (fj6 && i17 == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableSnsMultiSpecUpload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableToReportSnsPostMediaMetaData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_media_metadata_report_android, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableToReportSnsPostMediaMetaData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnableReDownload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = f434945c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnableReDownload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnableSnsAvatarCrop", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnableSnsAvatarCrop", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return f434947e;
    }

    public final boolean m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnableUseFlutterGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnableUseFlutterGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return f434958p;
    }

    public final int n(android.content.Context context) {
        int f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRVOffsetAbs", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (y()) {
            f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aqc);
        } else {
            f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aax);
        }
        int abs = java.lang.Math.abs(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay) + com.p314xaae8f345.mm.ui.bl.h(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int i17 = h17 + abs;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRVOffsetAbs", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return i17;
    }

    public final java.lang.String o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfUserName", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        java.lang.String str = f434944b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfUserName", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return str;
    }

    public final r45.ga6 p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (f434957o == null) {
            byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_config", gm0.j1.b().h(), 1).j("SnsServerConfig");
            if (j17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                return null;
            }
            r45.ga6 ga6Var = new r45.ga6();
            ga6Var.mo11468x92b714fd(j17);
            f434957o = ga6Var;
        }
        r45.ga6 ga6Var2 = f434957o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return ga6Var2;
    }

    public final int q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsCommentFoldThreshold", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_comment_fold_line_threshold_t4_1, 5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "getSnsCommentFoldThreshold xConfig >> " + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsCommentFoldThreshold", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return Ni;
    }

    public final int r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsImageLoadImageType", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        r45.ga6 p17 = p();
        if ((p17 != null ? p17.f456592u : 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "getSnsImageLoadImageType hardcode big by server");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsImageLoadImageType", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return 0;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_load_type, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "getSnsImageLoadImageType:" + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsImageLoadImageType", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return Ni;
    }

    public final int s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUploadImageSizeLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_size_limit, 1920);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "getSnsUploadImageSizeLimit:" + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUploadImageSizeLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return Ni;
    }

    public final r45.cu5 t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_config", gm0.j1.b().h(), 1).j("KVWsBufferKey");
        r45.cu5 cu5Var = new r45.cu5();
        if (j17 != null) {
            if (true ^ (j17.length == 0)) {
                try {
                    cu5Var.b(j17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Improve.SnsConfig", e17, "getWsBuffer parse error", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return cu5Var;
    }

    public final int u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWsVersion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_config", gm0.j1.b().h(), 1).o("KVWsVersionKey", 2) == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsVersion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return 3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsVersion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return 2;
    }

    public final boolean v(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_PUBLISH_VIDEO_DURATION_INT_SYNC, 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "is5minVideoOpen true with local config");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_5min_video_enable, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "is5minVideoOpen:" + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableExpandableVideoSeekBar", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_VIDEO_PLAYER_OPT_INT_SYNC, 0);
        if (r17 == 1) {
            z17 = true;
        } else if (r17 != 2) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_use_expandable_video_seek_bar, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableExpandableVideoSeekBar", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return fj6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableExpandableVideoSeekBar", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean x() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsCardStyleOptimization", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_card_style_optimization, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "isSnsCardStyleOptimization:" + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsCardStyleOptimization", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsCoverBlurOptimizationEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_cover_blur_optimization, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "sns_cover_blur_optimization:" + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsCoverBlurOptimizationEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsOperateButtonSVG", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_operate_button_svg, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "isSnsOperateButtonSVG:" + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsOperateButtonSVG", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableUseFlutterGroupWithComplexVisibility", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17848xa9b0ff58()) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableUseFlutterGroupWithComplexVisibility", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }
}
