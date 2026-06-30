package vg2;

/* loaded from: classes3.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.j0 f518044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f518045e;

    public g0(vg2.j0 j0Var, km2.q qVar) {
        this.f518044d = j0Var;
        this.f518045e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelAnchorListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.j0 j0Var = this.f518044d;
        yz5.l lVar = j0Var.f518057i;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f518045e);
        }
        j0Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelAnchorListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
