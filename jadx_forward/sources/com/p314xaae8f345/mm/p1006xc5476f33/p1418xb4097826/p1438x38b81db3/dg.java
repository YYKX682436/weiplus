package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class dg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg f184686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184687e;

    public dg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar, in5.s0 s0Var) {
        this.f184686d = qgVar;
        this.f184687e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handleFeedBackBubble$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar = this.f184686d;
        qgVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15296xf9ed3206 c15296xf9ed3206 = qgVar.f185922q;
        if (c15296xf9ed3206 != null) {
            c15296xf9ed3206.a("bubble_click");
        }
        in5.s0 s0Var = this.f184687e;
        if (s0Var != null) {
            qgVar.r(s0Var, true, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handleFeedBackBubble$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
