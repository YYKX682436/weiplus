package ck1;

/* loaded from: classes4.dex */
public final class f extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f42321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage f42322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42323f;

    public f(com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, int i17) {
        this.f42322e = appBrandUserInfoRevokePage;
        this.f42323f = i17;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i19 = this.f42321d + i18;
        this.f42321d = i19;
        ck1.a aVar = i19 <= this.f42323f ? ck1.a.f42301d : ck1.a.f42302e;
        int i27 = com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage.f89931g;
        this.f42322e.m0(aVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
