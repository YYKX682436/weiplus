package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class q8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.a f182890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f182892g;

    public q8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, t72.a aVar, int i17, int i18) {
        this.f182889d = y8Var;
        this.f182890e = aVar;
        this.f182891f = i17;
        this.f182892g = i18;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d8 d8Var = this.f182889d.f183163i;
        if (d8Var != null) {
            int i17 = this.f182891f;
            int i18 = this.f182892g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m7 m7Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m7) d8Var;
            t72.a tagInfo = this.f182890e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
            if (!o72.x1.G()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavTopFilter", "[onLongClick] use new tag = false");
            } else if (tagInfo.f68043xc8a07680 != -1) {
                java.lang.String str = tagInfo.f68044x225f1eb0;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[onLongClick] long click tag content, content = " + str);
                    rl5.r rVar = new rl5.r(m7Var.f182807a.f183188a, view);
                    rVar.C = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = m7Var.f182807a;
                    rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i7(1, z7Var, 2);
                    rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l7(1, z7Var, str, rVar, 2, i17, i18);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    int i19 = iArr[0];
                    int i27 = iArr[1];
                    int measuredHeight = view.getMeasuredHeight();
                    int measuredWidth = view.getMeasuredWidth();
                    if (measuredHeight == 0 || measuredWidth == 0) {
                        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                        view.getMeasuredHeight();
                        measuredWidth = view.getMeasuredWidth();
                    }
                    rVar.n((measuredWidth / 2) + i19, i27);
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
