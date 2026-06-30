package ib2;

/* loaded from: classes2.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f371643d;

    public f(ib2.w wVar) {
        this.f371643d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$initViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f371643d.F.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$initViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
