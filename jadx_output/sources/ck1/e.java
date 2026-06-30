package ck1;

/* loaded from: classes4.dex */
public final class e implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f42316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage f42317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f42319g;

    public e(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, ck1.k0 k0Var, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f42316d = recyclerView;
        this.f42317e = appBrandUserInfoRevokePage;
        this.f42318f = k0Var;
        this.f42319g = linearLayoutManager;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#initContentArea");
        if (!ck1.n0.f42354a.e((r45.uf7) obj)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#initContentArea, rawUsageInfo is null or invalid");
            return;
        }
        this.f42316d.post(new ck1.d(this.f42318f, this.f42319g));
        this.f42317e.l0().f42375f.removeObserver(this);
    }
}
