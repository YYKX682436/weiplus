package n44;

/* loaded from: classes8.dex */
public final class i extends n44.f1 {

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f416482q;

    /* renamed from: r, reason: collision with root package name */
    public final k54.a f416483r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1 f416484s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f416485t;

    public i(android.view.View view, i64.z zVar) {
        super(view, zVar);
        this.f416482q = jz5.h.b(new n44.f(view));
        this.f416483r = new k54.a(j());
        this.f416485t = jz5.h.b(new n44.g(view));
    }

    @Override // n44.f1
    public void a(y54.b contentSizeAttr, android.content.Intent intent) {
        android.content.Context context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (g() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        contentSizeAttr.f541059g = (int) java.lang.Math.ceil((contentSizeAttr.d() - contentSizeAttr.g()) + contentSizeAttr.b());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeLoadingLayoutParams", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        android.widget.ProgressBar j17 = j();
        if (j17 != null) {
            j17.setVisibility(0);
        }
        android.widget.ProgressBar j18 = j();
        android.view.ViewGroup.LayoutParams layoutParams = j18 != null ? j18.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int c17 = contentSizeAttr.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoadingSize", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            int intValue = ((java.lang.Number) ((jz5.n) this.f416485t).mo141623x754a37bb()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoadingSize", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            marginLayoutParams.topMargin = (c17 - intValue) / 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeLoadingLayoutParams", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        int a17 = contentSizeAttr.a(g().a());
        android.widget.FrameLayout c18 = c();
        android.view.ViewGroup.LayoutParams layoutParams2 = c18 != null ? c18.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = a17;
        }
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = 0;
        }
        android.widget.FrameLayout e17 = e();
        android.view.ViewGroup.LayoutParams layoutParams3 = e17 != null ? e17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.height = a17;
        }
        android.view.View h17 = h();
        if (h17 != null && (context = h17.getContext()) != null && (f17 = f()) != null) {
            f17.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560136ae0));
        }
        super.a(contentSizeAttr, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if ((r5.b() == 5) != false) goto L24;
     */
    @Override // n44.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Intent r35) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n44.i.b(android.content.Intent):void");
    }

    @Override // n44.f1
    public int i(y54.b contentSizeAttr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
        if (g() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            return 0;
        }
        int d17 = contentSizeAttr.d();
        i64.z g17 = g();
        g17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenMinHeightPercent", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int i17 = g17.f370911p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenMinHeightPercent", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int i18 = (d17 * (100 - i17)) / 100;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        return i18;
    }

    public final android.widget.ProgressBar j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoading", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) this.f416482q.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoading", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        return progressBar;
    }
}
