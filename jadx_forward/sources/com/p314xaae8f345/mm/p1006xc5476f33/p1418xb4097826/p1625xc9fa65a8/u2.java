package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2 f207408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f207409e;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2 v2Var, ya2.b2 b2Var) {
        this.f207408d = v2Var;
        this.f207409e = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder$onBindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2 v2Var = this.f207408d;
        boolean z17 = v2Var.f207460f;
        ya2.b2 b2Var = this.f207409e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107 c14637xcb061107 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.f204132a;
            android.content.Context context = v2Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            c14637xcb061107.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, b2Var, false);
        }
        android.content.Context context2 = v2Var.f207471t.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        zy2.cc.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er(context2, b2Var != null ? b2Var.D0() : null, v2Var.m8183xf806b362(), false, 0L, 16, null), false, true, null, 0, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder$onBindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
