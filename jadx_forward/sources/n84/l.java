package n84;

/* loaded from: classes4.dex */
public class l implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 f417216d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261) {
        this.f417216d = c17785x8a47a261;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$3");
        n84.w.b("AdAlphaPlayerView", "onError() called with: player = [" + interfaceC26164x73fc6bc6 + "], errorType = [" + i17 + "], errorCode = [" + i18 + "], arg1 = [" + j17 + "], arg2 = [" + j18 + "]");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1913, 3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("arg1=");
        sb6.append(j17);
        sb6.append("|arg2=");
        sb6.append(j18);
        sb6.append("|");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261 = this.f417216d;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261.f245010u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        java.lang.String str = c17785x8a47a261.f245021q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        sb6.append(str);
        ca4.e0.b("break_video_error_info", "1", i17, i18, sb6.toString());
        ((ku5.t0) ku5.t0.f394148d).B(new n84.k(this));
        this.f417216d.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a2612 = this.f417216d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.v vVar = c17785x8a47a2612.f245011d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (vVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a2613 = this.f417216d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.v vVar2 = c17785x8a47a2613.f245011d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            vVar2.d();
        }
        try {
            kk4.c cVar = this.f417216d.f245012e;
            if (cVar != null) {
                ((kk4.f0) cVar).mo100977x5f82bb9a();
                ((kk4.f0) this.f417216d.f245012e).mo100933x41012807();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$3");
    }
}
