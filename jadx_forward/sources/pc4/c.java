package pc4;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final pc4.c f434942d = new pc4.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_support_hdr_video, true)) {
            ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
            yr2.e eVar = yr2.e.f546197a;
            boolean b17 = eVar.b();
            ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
            boolean c17 = eVar.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "codecHdr10Support:" + b17 + " codecHdrHlgSupport:" + c17);
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.Display.HdrCapabilities hdrCapabilities = ((android.view.WindowManager) systemService).getDefaultDisplay().getHdrCapabilities();
            if (hdrCapabilities == null) {
                valueOf = java.lang.Boolean.FALSE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
            } else {
                int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(supportedHdrTypes, "getSupportedHdrTypes(...)");
                boolean F = kz5.z.F(supportedHdrTypes, 2);
                int[] supportedHdrTypes2 = hdrCapabilities.getSupportedHdrTypes();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(supportedHdrTypes2, "getSupportedHdrTypes(...)");
                boolean F2 = kz5.z.F(supportedHdrTypes2, 3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "screenHdr10Support:" + F + " screenHdrHlgSupport:" + F2);
                valueOf = java.lang.Boolean.valueOf(b17 && c17 && F && F2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "supportHdr config false");
            valueOf = java.lang.Boolean.FALSE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        return valueOf;
    }
}
