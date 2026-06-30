package ta4;

/* loaded from: classes15.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f498358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f498360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f498362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3, boolean z18) {
        super(0);
        this.f498357d = str;
        this.f498358e = i17;
        this.f498359f = str2;
        this.f498360g = z17;
        this.f498361h = str3;
        this.f498362i = z18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
        java.lang.Object d17 = ta4.u0.d();
        java.lang.String str = this.f498357d;
        int i17 = this.f498358e;
        java.lang.String str2 = this.f498359f;
        boolean z17 = this.f498360g;
        java.lang.String str3 = this.f498361h;
        boolean z18 = this.f498362i;
        synchronized (d17) {
            try {
                ta4.u0 u0Var = ta4.u0.f498371a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                boolean i18 = u0Var.i();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                if (i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    ta4.a l17 = u0Var.l(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    if (l17 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                    } else {
                        ta4.a aVar = new ta4.a(str, i17, str2, z17, ta4.j.f498302d, str3);
                        if (ta4.u0.e().contains(l17)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Image.SnsImageLoadReporter", "startLoad already contain snsid:" + str3 + " mediaId:" + str);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAd", "com.tencent.mm.plugin.sns.report.Data");
                            aVar.f498244i = z18;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAd", "com.tencent.mm.plugin.sns.report.Data");
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
                            aVar.f498250o = elapsedRealtime;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            java.lang.String str4 = ta4.u0.f498377g;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSession", "com.tencent.mm.plugin.sns.report.Data");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                            aVar.f498251p = str4;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSession", "com.tencent.mm.plugin.sns.report.Data");
                            ta4.u0.e().add(aVar);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "startLoad snsId:" + str3 + ", mediaId:" + str + ", requestType:" + i17 + ", fromScene:" + str2 + ", isBatchDownload:" + z17 + ", isAd:" + z18 + ", reportDataList.size:" + ta4.u0.e().size());
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                        }
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
            }
        }
        return jz5.f0.f384359a;
    }
}
