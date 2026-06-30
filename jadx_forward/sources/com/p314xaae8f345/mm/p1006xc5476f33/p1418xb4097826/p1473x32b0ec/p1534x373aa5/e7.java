package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 f197807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197809f;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var, android.view.View view, android.view.View view2) {
        this.f197807d = k7Var;
        this.f197808e = view;
        this.f197809f = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var = this.f197807d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = k7Var.f197974J;
        if (c19782x23db1cfa != null) {
            r45.kv0 a17 = db2.t4.f309704a.a(5874);
            android.view.View view2 = this.f197808e;
            android.content.Context context = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ek2.c2 c2Var = new ek2.c2(a17, xy2.c.e(context), null, 0L, 0L, 0, 0L, 2, null, 120, null);
            android.content.Context context2 = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            az2.j.u(c2Var, context2, null, 0L, 6, null);
            pq5.g l17 = c2Var.l();
            android.content.Context context3 = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.d7(k7Var, this.f197809f, c19782x23db1cfa, view2));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
