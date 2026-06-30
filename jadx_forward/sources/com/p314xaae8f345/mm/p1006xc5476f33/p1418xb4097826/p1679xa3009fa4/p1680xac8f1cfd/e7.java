package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f215734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f215735f;

    public e7(in5.s0 s0Var, so2.j0 j0Var, java.util.Map map) {
        this.f215733d = s0Var;
        this.f215734e = j0Var;
        this.f215735f = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = this.f215733d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i0Var.jl(context, this.f215734e);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("continue_watch_collection_card", "view_clk", this.f215735f, 25496);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
