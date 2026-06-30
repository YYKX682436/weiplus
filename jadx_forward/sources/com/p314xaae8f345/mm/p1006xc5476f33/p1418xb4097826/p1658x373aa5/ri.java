package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class ri implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si f214495d;

    public ri(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar) {
        this.f214495d = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar = this.f214495d;
        yz5.l lVar = siVar.f214578g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(siVar.f214576e));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(siVar.f214582k)) {
            android.content.Context context = siVar.f214573b;
            db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572832cp1));
        } else {
            android.content.Context context2 = siVar.f214573b;
            db5.t7.h(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572834cp3));
        }
        siVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
