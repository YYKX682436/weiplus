package bk1;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f21304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage f21305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f21306f;

    public g(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage, com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView) {
        this.f21304d = viewGroup;
        this.f21305e = appBrandPrivacyManagePage;
        this.f21306f = loadMoreRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredHeight = this.f21304d.getMeasuredHeight();
        com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage = this.f21305e;
        this.f21306f.i(new bk1.f(appBrandPrivacyManagePage, measuredHeight - i65.a.f(appBrandPrivacyManagePage.getContext(), com.tencent.mm.R.dimen.f479723df)));
    }
}
