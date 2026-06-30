package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class d7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f184663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 f184664g;

    public d7(in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var) {
        this.f184661d = s0Var;
        this.f184662e = str;
        this.f184663f = y0Var;
        this.f184664g = s7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        in5.s0 s0Var = this.f184661d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String str = this.f184662e;
        so2.y0 y0Var = this.f184663f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var = this.f184664g;
        i0Var.ql(context, str, y0Var, s7Var.f186061e.a0(), s7Var.f186061e.k0());
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).Gk(context2, this.f184663f.f492236d.f68959xf9a02e3e, (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 2, (r18 & 32) != 0 ? false : true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
