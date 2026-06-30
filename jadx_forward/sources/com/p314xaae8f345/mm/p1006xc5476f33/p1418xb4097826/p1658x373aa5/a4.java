package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class a4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f213150d;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176) {
        this.f213150d = c15258xcd50c176;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f213150d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            rl5.r rVar = new rl5.r(c15258xcd50c176.getContext());
            rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w3(c15258xcd50c176);
            rVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x3(c15258xcd50c176);
            c15258xcd50c176.m61722x390676d5().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560846vt);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15220xab944c78 m61722x390676d5 = c15258xcd50c176.m61722x390676d5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y3 y3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y3(c15258xcd50c176);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z3 z3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z3(c15258xcd50c176);
            int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
            rVar.h(m61722x390676d5, y3Var, z3Var, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CollapsibleTextView", "[enableContentTextViewClick] errMsg:" + e17.getMessage());
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
