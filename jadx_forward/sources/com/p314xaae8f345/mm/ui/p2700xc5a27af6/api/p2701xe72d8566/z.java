package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f290118f;

    public z(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var, java.util.HashMap hashMap, android.view.View.OnClickListener onClickListener) {
        this.f290116d = j1Var;
        this.f290117e = hashMap;
        this.f290118f = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        qj5.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService$createShareTongue$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290116d;
        j1Var.f290032e = currentTimeMillis;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_screenshot_btn", "view_clk", this.f290117e, 36458);
        java.lang.ref.WeakReference weakReference = j1Var.f290041q;
        if (weakReference != null && (sVar = (qj5.s) weakReference.get()) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ry) sVar).b();
        }
        j1Var.Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290096e);
        this.f290118f.onClick(view);
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService$createShareTongue$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
