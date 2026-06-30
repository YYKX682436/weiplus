package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 f207346d;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 q2Var) {
        this.f207346d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 q2Var = this.f207346d;
        q2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HotSearchInfoDialog", "dismissDialog");
        y9.i iVar = q2Var.f207357b;
        if (iVar != null) {
            iVar.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
