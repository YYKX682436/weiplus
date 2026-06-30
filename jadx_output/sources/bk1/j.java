package bk1;

/* loaded from: classes4.dex */
public final class j implements vl1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ak1.a f21318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage f21319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f21320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk1.w f21321d;

    public j(ak1.a aVar, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage, kotlin.jvm.internal.h0 h0Var, bk1.w wVar) {
        this.f21318a = aVar;
        this.f21319b = appBrandPrivacyManagePage;
        this.f21320c = h0Var;
        this.f21321d = wVar;
    }

    @Override // vl1.j
    public final void a(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, androidx.recyclerview.widget.f2 f2Var) {
        if (this.f21318a.f5564e) {
            kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this.f21319b), null, null, new bk1.i(this.f21320c, this.f21318a, this.f21321d, this.f21319b, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onLoadMore, loading is not shown");
        }
    }
}
