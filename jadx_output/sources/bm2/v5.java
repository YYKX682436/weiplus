package bm2;

/* loaded from: classes3.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.x5 f22385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f22386e;

    public v5(bm2.x5 x5Var, r45.h32 h32Var) {
        this.f22385d = x5Var;
        this.f22386e = h32Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f22385d.f22430d;
        if (lVar != null) {
            lVar.invoke(this.f22386e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
