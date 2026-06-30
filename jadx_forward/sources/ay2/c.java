package ay2;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay2.i f96766d;

    public c(ay2.i iVar) {
        this.f96766d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ay2.a[] aVarArr = ay2.a.f96764d;
        this.f96766d.b(0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
