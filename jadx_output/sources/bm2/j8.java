package bm2;

/* loaded from: classes8.dex */
public final class j8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.k8 f22019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f22020e;

    public j8(bm2.k8 k8Var, dk2.yg ygVar) {
        this.f22019d = k8Var;
        this.f22020e = ygVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f22019d.f22051i;
        if (lVar != null) {
            lVar.invoke(this.f22020e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
