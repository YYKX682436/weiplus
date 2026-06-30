package a54;

/* loaded from: classes3.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a54.e f83124e;

    public c(a54.e eVar, java.lang.String str) {
        this.f83124e = eVar;
        this.f83123d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        a54.e eVar = this.f83124e;
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        if (eVar.f83127b == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) eVar.f83126a.findViewById(com.p314xaae8f345.mm.R.id.imh);
            if (viewStub != null) {
                eVar.f83127b = viewStub.inflate();
            }
            android.view.View view = eVar.f83127b;
            if (view != null) {
                eVar.f83128c = (android.widget.TextView) eVar.f83127b.findViewById(com.p314xaae8f345.mm.R.id.f564195kk);
                eVar.f83127b.setOnClickListener(new a54.b(eVar));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        if (a54.e.a(eVar) != null) {
            java.lang.String str = this.f83123d;
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                android.widget.TextView textView = eVar.f83128c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView.setVisibility(8);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                android.widget.TextView textView2 = eVar.f83128c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView2.setText(str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                android.widget.TextView textView3 = eVar.f83128c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView3.setVisibility(0);
            }
            android.view.View a17 = a54.e.a(eVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$2");
    }
}
