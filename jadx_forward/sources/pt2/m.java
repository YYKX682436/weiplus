package pt2;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 f439786d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 abstractActivityC14960x21b59453) {
        this.f439786d = abstractActivityC14960x21b59453;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f439786d.mo56568x81ab18cc(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
