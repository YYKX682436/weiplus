package bk1;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f21323d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f21324e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f21325f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f21326g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f21327h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f21328i;

    /* renamed from: m, reason: collision with root package name */
    public int f21329m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f21330n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f21331o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ak1.a f21332p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f21333q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ bk1.w f21334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage f21335s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f21336t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.ui.widget.dialog.u3 u3Var, android.view.ViewGroup viewGroup, ak1.a aVar, kotlin.jvm.internal.h0 h0Var, bk1.w wVar, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage, com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21330n = u3Var;
        this.f21331o = viewGroup;
        this.f21332p = aVar;
        this.f21333q = h0Var;
        this.f21334r = wVar;
        this.f21335s = appBrandPrivacyManagePage;
        this.f21336t = loadMoreRecyclerView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bk1.l(this.f21330n, this.f21331o, this.f21332p, this.f21333q, this.f21334r, this.f21335s, this.f21336t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bk1.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewGroup viewGroup;
        ak1.a aVar;
        kotlin.jvm.internal.h0 h0Var;
        bk1.w wVar;
        com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage;
        java.lang.Object a17;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView;
        bk1.y yVar;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f21329m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bk1.e0 e0Var = bk1.e0.f21297a;
            viewGroup = this.f21331o;
            this.f21323d = viewGroup;
            aVar = this.f21332p;
            this.f21324e = aVar;
            h0Var = this.f21333q;
            this.f21325f = h0Var;
            wVar = this.f21334r;
            this.f21326g = wVar;
            appBrandPrivacyManagePage = this.f21335s;
            this.f21327h = appBrandPrivacyManagePage;
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = this.f21336t;
            this.f21328i = loadMoreRecyclerView2;
            this.f21329m = 1;
            a17 = e0Var.a(Integer.MAX_VALUE, this);
            if (a17 == aVar2) {
                return aVar2;
            }
            loadMoreRecyclerView = loadMoreRecyclerView2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loadMoreRecyclerView = (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) this.f21328i;
            com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage2 = (com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage) this.f21327h;
            wVar = (bk1.w) this.f21326g;
            h0Var = (kotlin.jvm.internal.h0) this.f21325f;
            aVar = (ak1.a) this.f21324e;
            viewGroup = (android.view.ViewGroup) this.f21323d;
            kotlin.ResultKt.throwOnFailure(obj);
            appBrandPrivacyManagePage = appBrandPrivacyManagePage2;
            a17 = obj;
        }
        bk1.f0 f0Var = (bk1.f0) a17;
        bk1.d dVar = com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.f89928e;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onFirstTimesFetched, userAuthScopeList is null");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "showEmptyView");
            appBrandPrivacyManagePage.getLayoutInflater().inflate(com.tencent.mm.R.layout.f488071g2, viewGroup);
        } else {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.d1y);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", "initContentArea$onFirstTimesFetched", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/UserAuthorizeScopeListAdapter;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage;Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/WxaAppUserAuthorizeScopeListWithAttrs;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", "initContentArea$onFirstTimesFetched", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/UserAuthorizeScopeListAdapter;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage;Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/WxaAppUserAuthorizeScopeListWithAttrs;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int i18 = f0Var.f21301a;
            aVar.a(1 == i18);
            h0Var.f310123d = (!(1 == i18) || (yVar = (bk1.y) kz5.n0.k0(f0Var.f21302b)) == null) ? null : java.lang.Integer.valueOf(yVar.f21361c);
            wVar.x(appBrandPrivacyManagePage.m0(f0Var));
            loadMoreRecyclerView.post(new bk1.m(loadMoreRecyclerView));
            com.tencent.mm.ui.MMActivity a18 = ak1.f.a(appBrandPrivacyManagePage);
            if (a18 != null) {
                new bk1.c(a18, new bk1.n(wVar, appBrandPrivacyManagePage, f0Var));
            }
        }
        this.f21330n.dismiss();
        return jz5.f0.f302826a;
    }
}
