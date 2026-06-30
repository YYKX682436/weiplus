package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class wy implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz f217906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f217908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f217909g;

    public wy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar, in5.s0 s0Var, so2.j0 j0Var, java.util.Map map) {
        this.f217906d = izVar;
        this.f217907e = s0Var;
        this.f217908f = j0Var;
        this.f217909g = map;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = this.f217907e.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar = this.f217906d;
        izVar.getClass();
        so2.j0 item = this.f217908f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dz.f215707d;
        k0Var.f293425z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ez(izVar, item);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hz(item, izVar, context);
        k0Var.v();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("continue_watch_collection_card", "view_long_press", this.f217909g, 25496);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
