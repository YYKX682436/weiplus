package ta4;

/* loaded from: classes15.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f498299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f498300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, int i17, int i18) {
        super(0);
        this.f498298d = str;
        this.f498299e = i17;
        this.f498300f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
        java.lang.Object d17 = ta4.u0.d();
        java.lang.String str = this.f498298d;
        int i17 = this.f498299e;
        int i18 = this.f498300f;
        synchronized (d17) {
            try {
                ta4.u0 u0Var = ta4.u0.f498371a;
                ta4.a b17 = ta4.u0.b(u0Var, str);
                if (b17 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
                } else {
                    if (i17 == 0 && i18 == 0) {
                        ta4.u0.g(u0Var, b17, ta4.j.f498317v);
                    } else {
                        ta4.u0.g(u0Var, b17, ta4.j.f498318w);
                        ta4.u0.f(u0Var, b17);
                        kz5.h0.A(ta4.u0.e(), new ta4.h0(b17));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
            }
        }
        return jz5.f0.f384359a;
    }
}
