package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class n implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI f94577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f94578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f94579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f94580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f94581h;

    public n(com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI brandServiceUserInfoManageUI, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.view.View view2, android.widget.ProgressBar progressBar) {
        this.f94577d = brandServiceUserInfoManageUI;
        this.f94578e = recyclerView;
        this.f94579f = view;
        this.f94580g = view2;
        this.f94581h = progressBar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ym3.p pVar = ((ym3.o) obj).f463177a;
        int i17 = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI.f94554h;
        java.util.ArrayList arrayList = ((com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) this.f94577d.f94556e).getValue()).f152065o;
        ym3.p pVar2 = ym3.p.f463181f;
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.j jVar = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.h.f94572a;
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.j jVar2 = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.g.f94571a;
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.j jVar3 = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.i.f94573a;
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.j jVar4 = (pVar == pVar2 && arrayList.isEmpty()) ? jVar3 : ((pVar == ym3.p.f463180e || pVar == ym3.p.f463179d) && arrayList.isEmpty()) ? jVar : jVar2;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f94578e;
        kotlin.jvm.internal.o.f(recyclerView, "$recyclerView");
        int i18 = kotlin.jvm.internal.o.b(jVar4, jVar2) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View recyclerViewHeader = this.f94579f;
        kotlin.jvm.internal.o.f(recyclerViewHeader, "$recyclerViewHeader");
        int i19 = kotlin.jvm.internal.o.b(jVar4, jVar2) ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(recyclerViewHeader, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerViewHeader.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(recyclerViewHeader, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View noDataTvContainer = this.f94580g;
        kotlin.jvm.internal.o.f(noDataTvContainer, "$noDataTvContainer");
        int i27 = kotlin.jvm.internal.o.b(jVar4, jVar3) ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(noDataTvContainer, arrayList4.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        noDataTvContainer.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(noDataTvContainer, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ProgressBar initialLoading = this.f94581h;
        kotlin.jvm.internal.o.f(initialLoading, "$initialLoading");
        int i28 = kotlin.jvm.internal.o.b(jVar4, jVar) ? 0 : 8;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(i28));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(initialLoading, arrayList5.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        initialLoading.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(initialLoading, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
