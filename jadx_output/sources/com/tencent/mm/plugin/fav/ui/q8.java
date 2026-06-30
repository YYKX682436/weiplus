package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class q8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.a f101357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101359g;

    public q8(com.tencent.mm.plugin.fav.ui.y8 y8Var, t72.a aVar, int i17, int i18) {
        this.f101356d = y8Var;
        this.f101357e = aVar;
        this.f101358f = i17;
        this.f101359g = i18;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.fav.ui.d8 d8Var = this.f101356d.f101630i;
        if (d8Var != null) {
            int i17 = this.f101358f;
            int i18 = this.f101359g;
            kotlin.jvm.internal.o.d(view);
            com.tencent.mm.plugin.fav.ui.m7 m7Var = (com.tencent.mm.plugin.fav.ui.m7) d8Var;
            t72.a tagInfo = this.f101357e;
            kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
            if (!o72.x1.G()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavTopFilter", "[onLongClick] use new tag = false");
            } else if (tagInfo.field_id != -1) {
                java.lang.String str = tagInfo.field_name;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[onLongClick] long click tag content, content = " + str);
                    rl5.r rVar = new rl5.r(m7Var.f101274a.f101655a, view);
                    rVar.C = true;
                    com.tencent.mm.plugin.fav.ui.z7 z7Var = m7Var.f101274a;
                    rVar.f397355y = new com.tencent.mm.plugin.fav.ui.i7(1, z7Var, 2);
                    rVar.f397354x = new com.tencent.mm.plugin.fav.ui.l7(1, z7Var, str, rVar, 2, i17, i18);
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
