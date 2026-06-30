package a44;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a44.k f82803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82808i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f82809m;

    public h(a44.k kVar, android.content.Context context, java.lang.String str, int i17, android.view.View view, android.view.View view2, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f82803d = kVar;
        this.f82804e = str;
        this.f82805f = i17;
        this.f82806g = view;
        this.f82807h = view2;
        this.f82808i = i18;
        this.f82809m = c17933xe8d1b226;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
        a44.k kVar = this.f82803d;
        if (kVar.c() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            android.view.ViewStub viewStub = kVar.f82820a;
            if (viewStub != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isImproveItem", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isImproveItem", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3) a84.y0.h(viewStub);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                kVar.f82823d = c17705x7d0622a3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
        }
        if (kVar.d() != null) {
            android.view.View d17 = kVar.d();
            java.lang.Object tag = d17 != null ? d17.getTag(com.p314xaae8f345.mm.R.id.nug) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show complianceManagementView, snsId is ");
            java.lang.String str3 = this.f82804e;
            sb6.append(str3);
            sb6.append(", tagSnsId is ");
            sb6.append(tag);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDownloadHelper", sb6.toString());
            if ((tag instanceof java.lang.String) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str3, tag) && ((java.lang.String) tag).equals(str3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17 = kVar.c();
                if (c17 != null) {
                    c17.m69342xc85a7a4f(this.f82805f);
                }
                a44.a a17 = i64.i.f370716d.i().a(str3);
                if (kVar.c() == null || !a44.k.f82818g.c(a17)) {
                    if (a17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.n())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
                        return;
                    }
                    android.view.View view = this.f82806g;
                    android.view.View view2 = this.f82807h;
                    int i17 = this.f82805f;
                    int i18 = this.f82808i;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f82809m;
                    if (c17933xe8d1b226 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    } else {
                        a44.a aVar = c17933xe8d1b226.m70354x74235b3e().f38161xc4fcf362;
                        if (aVar != null) {
                            java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T, "getSnsStringId(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            java.util.HashMap hashMap = a44.k.f82819h;
                            java.lang.Long l17 = (java.lang.Long) hashMap.get(T);
                            boolean z17 = l17 == null || l17.longValue() == 0 || a84.f0.b() - l17.longValue() >= 5000;
                            if (z17) {
                                str2 = "run";
                                hashMap.put(T, java.lang.Long.valueOf(a84.f0.b()));
                            } else {
                                str2 = "run";
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            if (z17) {
                                p3325xe03a0797.p3326xc267989b.y0 y0Var = kVar.f82822c;
                                if (y0Var != null) {
                                    p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
                                }
                                p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
                                kVar.f82822c = b17;
                                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                                p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(kVar.f82825f), null, new a44.f(aVar, c17933xe8d1b226, kVar, view, view2, i17, i18, null), 2, null);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDownloadHelper", "isIntervalTimeExpired, snsId is " + ca4.z0.T(c17933xe8d1b226));
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            str = str2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    }
                    str2 = "run";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    str = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
                }
                a44.k.a(this.f82803d, this.f82806g, this.f82807h, a17, this.f82805f, this.f82808i);
            }
        }
        str = "run";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
    }
}
