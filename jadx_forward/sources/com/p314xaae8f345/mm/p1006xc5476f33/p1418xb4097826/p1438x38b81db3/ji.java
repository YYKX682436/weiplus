package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ji implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f185291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f185294g;

    public ji(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, int i17, in5.s0 s0Var, so2.n1 n1Var) {
        this.f185291d = ojVar;
        this.f185292e = i17;
        this.f185293f = s0Var;
        this.f185294g = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindEnableRecommend$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f185291d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = ojVar.f185717f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
        if (pzVar != null) {
            hb2.q.f361615e.n(pzVar.f190288g, pzVar.C.m56388xcaeb60d0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yy(pzVar));
            pzVar.f190312z1 = java.lang.Integer.valueOf(this.f185292e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var2 = ojVar.f185717f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = k8Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm) k8Var2 : null;
        if (qmVar != null && (abstractC13919x46aff122 = qmVar.f188103t) != null) {
            hb2.q.f361615e.n(qmVar.f187954d, abstractC13919x46aff122.m56388xcaeb60d0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.nm(qmVar));
        }
        android.content.Context context = this.f185293f.f374654e;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
        e4Var.c();
        this.f185294g.f492023d = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindEnableRecommend$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
