package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203925d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var) {
        this.f203925d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$onBuildDrawerHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203925d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.h(l0Var)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$onBuildDrawerHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = l0Var.w() ? "paid_collection_menu_button" : "collection_list_menu_button";
        v92.g gVar = l0Var.E;
        if (gVar != null) {
            gVar.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.y(this.f203925d, str, true, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$onBuildDrawerHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
