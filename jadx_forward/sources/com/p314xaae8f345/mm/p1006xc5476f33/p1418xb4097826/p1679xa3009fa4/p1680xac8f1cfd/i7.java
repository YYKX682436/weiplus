package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class i7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f216239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 f216240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f216242g;

    public i7(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 o7Var, in5.s0 s0Var, so2.j0 j0Var) {
        this.f216239d = map;
        this.f216240e = o7Var;
        this.f216241f = s0Var;
        this.f216242g = j0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("continue_watch_collection_card", "view_long_press", this.f216239d, 25496);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 o7Var = this.f216240e;
        rl5.r rVar = o7Var.f216965h;
        if (rVar != null) {
            rVar.a();
        }
        rl5.r rVar2 = o7Var.f216965h;
        if (rVar2 != null) {
            in5.s0 s0Var = this.f216241f;
            android.view.View view2 = s0Var.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f7 f7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f7(s0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h7 h7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h7(this.f216242g, o7Var);
            int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
            rVar2.h(view2, f7Var, h7Var, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
