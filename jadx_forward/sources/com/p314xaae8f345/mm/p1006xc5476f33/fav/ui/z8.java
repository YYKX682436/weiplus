package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes.dex */
public final class z8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f183207d;

    public z8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        this.f183207d = daVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopSearchUIC$addTingSkipItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "[addTingSkipItem] ting header view click");
        qk.f9.e(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), this.f183207d.m80379x76847179(), bw5.ar0.TingScene_FavTabTytSquare, null, 0, 2, null, 36, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC$addTingSkipItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
