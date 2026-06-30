package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

/* loaded from: classes4.dex */
public final class n implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.ActivityC13022xac799e60 f176110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f176111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f176112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f176113g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f176114h;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.ActivityC13022xac799e60 activityC13022xac799e60, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, android.view.View view2, android.widget.ProgressBar progressBar) {
        this.f176110d = activityC13022xac799e60;
        this.f176111e = c1163xf1deaba4;
        this.f176112f = view;
        this.f176113g = view2;
        this.f176114h = progressBar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ym3.p pVar = ((ym3.o) obj).f544710a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.ActivityC13022xac799e60.f176087h;
        java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) ((jz5.n) this.f176110d.f176089e).mo141623x754a37bb()).f233598o;
        ym3.p pVar2 = ym3.p.f544714f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.h.f176105a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.j jVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.g.f176104a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.j jVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.i.f176106a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.j jVar4 = (pVar == pVar2 && arrayList.isEmpty()) ? jVar3 : ((pVar == ym3.p.f544713e || pVar == ym3.p.f544712d) && arrayList.isEmpty()) ? jVar : jVar2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = this.f176111e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerView, "$recyclerView");
        int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar4, jVar2) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View recyclerViewHeader = this.f176112f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerViewHeader, "$recyclerViewHeader");
        int i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar4, jVar2) ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(recyclerViewHeader, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerViewHeader.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(recyclerViewHeader, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View noDataTvContainer = this.f176113g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(noDataTvContainer, "$noDataTvContainer");
        int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar4, jVar3) ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(noDataTvContainer, arrayList4.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        noDataTvContainer.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(noDataTvContainer, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ProgressBar initialLoading = this.f176114h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(initialLoading, "$initialLoading");
        int i28 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar4, jVar) ? 0 : 8;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(i28));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(initialLoading, arrayList5.toArray(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        initialLoading.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(initialLoading, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
