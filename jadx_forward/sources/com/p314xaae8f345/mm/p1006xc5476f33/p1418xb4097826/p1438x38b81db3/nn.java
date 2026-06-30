package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class nn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn f185646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185647e;

    public nn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar, in5.s0 s0Var) {
        this.f185646d = ynVar;
        this.f185647e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f185647e;
        java.lang.Object obj = s0Var.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f185646d.n0(s0Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj, view, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
