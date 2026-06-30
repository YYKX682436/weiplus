package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.v1 f184606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f184607g;

    public cl(android.view.View view, in5.s0 s0Var, so2.v1 v1Var, ya2.b2 b2Var) {
        this.f184604d = view;
        this.f184605e = s0Var;
        this.f184606f = v1Var;
        this.f184607g = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFollowConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f184604d.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107 c14637xcb061107 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.f204132a;
            in5.s0 s0Var = this.f184605e;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            c14637xcb061107.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, this.f184606f.f492178d, false);
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            zy2.cc.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er(context2, this.f184607g.D0(), s0Var.m8183xf806b362(), false, 0L, 16, null), false, true, null, 0, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
