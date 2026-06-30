package ay2;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay2.v f15273d;

    public u(ay2.v vVar) {
        this.f15273d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/teens/FinderTeensRestDialog$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ay2.r rVar = ay2.r.f15268g;
        ay2.v vVar = this.f15273d;
        vVar.f15280m = rVar;
        vVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/teens/FinderTeensRestDialog$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
