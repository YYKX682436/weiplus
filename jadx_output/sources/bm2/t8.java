package bm2;

/* loaded from: classes3.dex */
public final class t8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.r8 f22335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.s8 f22336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.v8 f22337f;

    public t8(bm2.r8 r8Var, bm2.s8 s8Var, bm2.v8 v8Var) {
        this.f22335d = r8Var;
        this.f22336e = s8Var;
        this.f22337f = v8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$bindWhiteListViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.r8 r8Var = this.f22335d;
        if (r8Var != null) {
            r8Var.f22278a = (r8Var == null || r8Var.f22278a) ? false : true;
        }
        this.f22336e.f22294d.setChecked(r8Var != null && r8Var.f22278a);
        yz5.a aVar = this.f22337f.f22391d;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$bindWhiteListViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
