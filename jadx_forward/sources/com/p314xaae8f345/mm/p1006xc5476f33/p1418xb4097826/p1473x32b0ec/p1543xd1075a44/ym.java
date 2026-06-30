package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ym implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zm f201985d;

    public ym(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zm zmVar) {
        this.f201985d = zmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.cn cnVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLikeRecommendGuidePanel$openPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zm zmVar = this.f201985d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zmVar.H, "cancel click");
        zmVar.P = true;
        zmVar.e0(10);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (cnVar = (df2.cn) c14197x319b1b9e.m56798x25fe639c(df2.cn.class)) != null) {
            cnVar.t7(121, 50, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(zmVar, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLikeRecommendGuidePanel$openPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
