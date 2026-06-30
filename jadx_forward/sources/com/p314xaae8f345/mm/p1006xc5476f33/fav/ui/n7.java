package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class n7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f182826e;

    public n7(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var) {
        this.f182825d = str;
        this.f182826e = z7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopFilter$initFlowView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[flow layout] type content click, content = ");
        java.lang.String str = this.f182825d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f182826e;
        z7Var.getClass();
        ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z6(z7Var, str, 1, true));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.c(z7Var, "fav_quick_filter", str, 1);
        z7Var.d();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopFilter$initFlowView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
