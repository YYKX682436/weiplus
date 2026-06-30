package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1656x35ce78.C15210x60aafb55 f186078h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f186079i;

    public sd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1656x35ce78.C15210x60aafb55 c15210x60aafb55, android.widget.LinearLayout linearLayout) {
        this.f186074d = qeVar;
        this.f186075e = s0Var;
        this.f186076f = abstractC14490x69736cb5;
        this.f186077g = i17;
        this.f186078h = c15210x60aafb55;
        this.f186079i = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186074d;
        in5.s0 s0Var = this.f186075e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f186076f;
        qeVar.I1(s0Var, abstractC14490x69736cb5, this.f186077g, false);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.g99);
        if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1656x35ce78.C15210x60aafb55 c15210x60aafb55 = this.f186078h;
        if (c15210x60aafb55 != null) {
            c15210x60aafb55.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.f186079i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        abstractC14490x69736cb5.B1(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshSeekBarAnchor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
