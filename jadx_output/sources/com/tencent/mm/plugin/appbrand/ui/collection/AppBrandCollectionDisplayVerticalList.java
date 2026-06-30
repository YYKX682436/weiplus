package com.tencent.mm.plugin.appbrand.ui.collection;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "Lxj1/d0;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandCollectionDisplayVerticalList extends com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment implements xj1.d0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f89638t = 0;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f89639h;

    /* renamed from: i, reason: collision with root package name */
    public xj1.b0 f89640i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f89641m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f89642n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f89643o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f89644p = jz5.h.b(new xj1.j(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f89645q = jz5.h.b(new xj1.k(this));

    /* renamed from: r, reason: collision with root package name */
    public final l75.q0 f89646r = new xj1.a(this);

    /* renamed from: s, reason: collision with root package name */
    public final l75.q0 f89647s = new xj1.b(this);

    public static final void p0(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        java.util.ArrayList arrayList;
        xj1.b0 b0Var = appBrandCollectionDisplayVerticalList.f89640i;
        if (b0Var == null) {
            return;
        }
        synchronized (b0Var.f454780d) {
            arrayList = new java.util.ArrayList(b0Var.f454780d.size());
            arrayList.addAll(b0Var.f454780d);
        }
        java.util.List q07 = appBrandCollectionDisplayVerticalList.q0();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) q07;
        if (arrayList2.isEmpty()) {
            appBrandCollectionDisplayVerticalList.n0(new xj1.n(appBrandCollectionDisplayVerticalList));
            return;
        }
        try {
            appBrandCollectionDisplayVerticalList.n0(new xj1.o(appBrandCollectionDisplayVerticalList, q07, androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.appbrand.appusage.o3(arrayList, q07), true)));
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandCollectionDisplayVerticalList", e17, "calculateDiff, oldList.size=" + arrayList.size() + ", newList.size=" + arrayList2.size(), new java.lang.Object[0]);
            if (z65.c.a()) {
                throw e17;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void initView() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(activity, null);
        final androidx.fragment.app.FragmentActivity activity2 = getActivity();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(activity2) { // from class: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$initView$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        xj1.b0 b0Var = new xj1.b0(new java.util.ArrayList(), this);
        this.f89640i = b0Var;
        recyclerView.setAdapter(b0Var);
        recyclerView.setBackgroundColor(recyclerView.getContext().getResources().getColor(com.tencent.mm.R.color.f478869jf));
        recyclerView.N(new xj1.c0());
        recyclerView.setItemAnimator(null);
        this.f89639h = recyclerView;
        android.view.View view = this.f89369g;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f89639h;
        kotlin.jvm.internal.o.d(recyclerView2);
        ((android.widget.FrameLayout) view).addView(recyclerView2, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void l0() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f89639h;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490299r4), new xj1.c(this), new xj1.d(this), com.tencent.mm.ui.fb.BLACK);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).remove(this.f89646r);
        com.tencent.mm.plugin.appbrand.app.r9.ij().remove(this.f89647s);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f89642n;
        if (n3Var != null) {
            n3Var.quit();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f89641m) {
            r0(true, xj1.g.f454788d);
            this.f89641m = false;
        }
        if (this.f89643o) {
            com.tencent.mm.plugin.appbrand.report.v0.h(2, "");
            this.f89643o = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f89642n = new com.tencent.mm.sdk.platformtools.n3("AppBrandLauncherCollectionList");
        r0(false, new xj1.f(this));
    }

    public final java.util.List q0() {
        java.util.List xi6 = ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).xi(Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.appusage.y5.DESC);
        if (xi6 == null) {
            xi6 = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : xi6) {
            if (((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) obj) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void r0(boolean z17, yz5.a aVar) {
        xj1.i iVar = new xj1.i(this, z17, aVar);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f89642n;
        kotlin.jvm.internal.o.d(n3Var);
        if (kotlin.jvm.internal.o.b(n3Var.getSerialTag(), xu5.b.e())) {
            iVar.run();
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f89642n;
        kotlin.jvm.internal.o.d(n3Var2);
        n3Var2.postToWorker(iVar);
    }
}
