package xj1;

/* loaded from: classes7.dex */
public final class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 f536316d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732) {
        this.f536316d = c12708x81c12732;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$onActivityCreated$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732.f171171t;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732 = this.f536316d;
            if (c12708x81c12732.mo7438x76847179() != null) {
                db5.e1.N(c12708x81c12732.mo7438x76847179(), "!TEST!\n输入小程序username添加到「我的小程序」", "", "", Integer.MAX_VALUE, new xj1.m(c12708x81c12732));
            }
            z17 = true;
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$onActivityCreated$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
