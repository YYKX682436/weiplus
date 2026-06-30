package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class tc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186138d;

    public tc(in5.s0 s0Var) {
        this.f186138d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshManagerFav$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f186138d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        boolean z17 = !nv2.o.f422091e.c(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        android.content.Context context = s0Var.f374654e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 c15282xfe3c9a46 = activity != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46) activity.findViewById(com.p314xaae8f345.mm.R.id.edy) : null;
        if (c15282xfe3c9a46 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj = abstractC14490x69736cb5.getFeedObject();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
            if (!c15282xfe3c9a46.q()) {
                c15282xfe3c9a46.feedObj = feedObj;
                c15282xfe3c9a46.r(true, true, 0);
            }
        }
        view.setTag(com.p314xaae8f345.mm.R.id.rku, java.lang.Boolean.valueOf(z17));
        d92.s sVar = d92.k0.f309019e;
        view.announceForAccessibility(sVar.d(view, true));
        view.setContentDescription(sVar.d(view, false));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshManagerFav$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
