package com.tencent.mm.plugin.appbrand.ui.privacy.manage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "bk1/d", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppBrandPrivacyManagePage extends com.tencent.mm.ui.MMFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final bk1.d f89928e = new bk1.d(null);

    /* renamed from: d, reason: collision with root package name */
    public bk1.a f89929d;

    public AppBrandPrivacyManagePage() {
        super(true);
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.f488074g5;
    }

    public final bk1.y l0(bk1.y yVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.Iterator it = yVar.f21360b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b("scope.userLocationBackground", ((r45.xf7) obj2).f390056d)) {
                break;
            }
        }
        r45.xf7 xf7Var = (r45.xf7) obj2;
        if (xf7Var == null) {
            return yVar;
        }
        java.util.List list = yVar.f21360b;
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kotlin.jvm.internal.o.b("scope.userLocation", ((r45.xf7) next).f390056d)) {
                obj = next;
                break;
            }
        }
        if (!(obj != null)) {
            return yVar;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterDuplicateBackgroundScope, both background and backgroundLocation are authorized for ");
        k91.v5 v5Var = yVar.f21359a;
        sb6.append(v5Var.field_username);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.remove(xf7Var);
        return new bk1.y(v5Var, arrayList, yVar.f21361c);
    }

    public final java.util.List m0(bk1.f0 f0Var) {
        java.util.List list = f0Var.f21302b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l0((bk1.y) it.next()));
        }
        return arrayList;
    }

    public final void n0(bk1.a aVar) {
        if (this.f89929d == aVar) {
            return;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "showActionbarDefault");
            setMMTitle("");
            ak1.f.b(this);
            ak1.f.e(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478491c));
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "showActionbarWithTitle");
            setMMTitle(com.tencent.mm.R.string.f490660a46);
            com.tencent.mm.ui.MMActivity a17 = ak1.f.a(this);
            if (a17 != null) {
                a17.showActionbarLine();
            }
            ak1.f.e(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478489a));
        }
        this.f89929d = aVar;
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        setBackBtn(new bk1.e(this));
        n0(bk1.a.f21284d);
        ak1.f.f(this, b3.l.getColor(ak1.f.d(this), com.tencent.mm.R.color.f478491c));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cgs);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = findViewById instanceof com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView ? (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) findViewById : null;
        if (loadMoreRecyclerView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyManagePage", "initContentArea, authInfoContentArea is null");
            finish();
            return;
        }
        int f17 = i65.a.f(ak1.f.d(this), com.tencent.mm.R.dimen.f479704cz);
        loadMoreRecyclerView.setPadding(f17, 0, f17, 0);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.f488073g4, (android.view.ViewGroup) loadMoreRecyclerView, false);
        android.view.ViewGroup viewGroup = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyManagePage", "initContentArea, headerView is null");
            finish();
            return;
        }
        viewGroup.post(new bk1.g(viewGroup, this, loadMoreRecyclerView));
        loadMoreRecyclerView.addHeaderView(viewGroup);
        ak1.a aVar = new ak1.a(loadMoreRecyclerView, com.tencent.mm.R.string.f490658a44);
        loadMoreRecyclerView.setLoadingView(aVar.f5563d);
        loadMoreRecyclerView.m1(false);
        zk1.m.f473414l.a(loadMoreRecyclerView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        bk1.w wVar = new bk1.w();
        loadMoreRecyclerView.setAdapter(wVar);
        loadMoreRecyclerView.setOnItemClickListener(new bk1.h(wVar, this));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new bk1.j(aVar, this, h0Var, wVar));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(ak1.f.d(this), null, null, true, false, null);
        com.tencent.mm.ui.MMActivity a17 = ak1.f.a(this);
        if (a17 != null) {
            a17.keep(new bk1.k(Q));
        }
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new bk1.l(Q, viewGroup, aVar, h0Var, wVar, this, loadMoreRecyclerView, null), 3, null);
    }
}
