package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class in implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f185209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f185210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn f185211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185212g;

    public in(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, so2.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar, in5.s0 s0Var) {
        this.f185209d = c15196x85976f5f;
        this.f185210e = u1Var;
        this.f185211f = ynVar;
        this.f185212g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f185209d.isSelectedToPlay;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoConvert", "setOnClickListener onMediaClick  " + this.f185210e + ", isViewSelected=" + z17);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn.Q1(this.f185211f, this.f185212g, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
