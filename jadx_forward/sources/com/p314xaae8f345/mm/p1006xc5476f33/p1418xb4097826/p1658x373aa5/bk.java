package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class bk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ck f213259d;

    public bk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ck ckVar) {
        this.f213259d = ckVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderShareProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick data:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ck ckVar = this.f213259d;
        sb6.append(ckVar.f213316b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareProductWxaCoverWidget", sb6.toString());
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(ckVar.f213316b), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wj.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ak(), null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderShareProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
