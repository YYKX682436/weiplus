package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class us implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et f201529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rr f201530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f201531f;

    public us(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rr rrVar, r45.dz1 dz1Var) {
        this.f201529d = etVar;
        this.f201530e = rrVar;
        this.f201531f = dz1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshLotteryItemView$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar = this.f201529d;
        int[] iArr = etVar.P;
        int i17 = iArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rr rrVar = this.f201530e;
        if (i17 == 0 || iArr[1] == 0) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            r4Var.M2(etVar.f199813J, "onItemLongClickCallback before change x:" + etVar.P[0] + ", original y:" + etVar.P[1]);
            rrVar.f3639x46306858.getLocationOnScreen(etVar.P);
            r4Var.M2(etVar.f199813J, "onItemLongClickCallback after change x:" + etVar.P[0] + ", original y:" + etVar.P[1]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et.h0(etVar).a();
        rl5.r h07 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et.h0(etVar);
        android.view.View view2 = rrVar.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rs rsVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rs(etVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ts tsVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ts(etVar, this.f201531f);
        int[] iArr2 = etVar.P;
        h07.h(view2, rsVar, tsVar, iArr2[0], iArr2[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshLotteryItemView$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
