package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class g80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 f194180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f194181e;

    public g80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var, cm2.f0 f0Var) {
        this.f194180d = i80Var;
        this.f194181e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var = this.f194180d;
        yz5.l lVar = i80Var.f194473g;
        cm2.f0 f0Var = this.f194181e;
        if (lVar != null) {
            lVar.mo146xb9724478(f0Var);
        }
        i80Var.a(f0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
