package bk1;

/* loaded from: classes4.dex */
public final class f extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f21298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage f21299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21300f;

    public f(com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage, int i17) {
        this.f21299e = appBrandPrivacyManagePage;
        this.f21300f = i17;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i19 = this.f21298d + i18;
        this.f21298d = i19;
        bk1.a aVar = i19 <= this.f21300f ? bk1.a.f21284d : bk1.a.f21285e;
        bk1.d dVar = com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.f89928e;
        this.f21299e.n0(aVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
