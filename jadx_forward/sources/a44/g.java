package a44;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a44.k f82800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82802f;

    public g(a44.k kVar, java.lang.String str, android.view.View view) {
        this.f82800d = kVar;
        this.f82801e = str;
        this.f82802f = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$1");
        a44.k kVar = this.f82800d;
        if (kVar.d() != null) {
            android.view.View d17 = kVar.d();
            java.lang.Object tag = d17 != null ? d17.getTag(com.p314xaae8f345.mm.R.id.nug) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetComplianceViewUI, snsId is ");
            java.lang.String str = this.f82801e;
            sb6.append(str);
            sb6.append(", tagSnsId is ");
            sb6.append(tag);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDownloadHelper", sb6.toString());
            if ((tag instanceof java.lang.String) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, tag) && ((java.lang.String) tag).equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                kVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                android.view.View view = this.f82802f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "resetCardAdBottomLabel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "resetCardAdBottomLabel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                kVar.j();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$1");
    }
}
