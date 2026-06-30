package ay2;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay2.i f15236d;

    public f(ay2.i iVar) {
        this.f15236d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ay2.a[] aVarArr = ay2.a.f15231d;
        this.f15236d.b(1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
