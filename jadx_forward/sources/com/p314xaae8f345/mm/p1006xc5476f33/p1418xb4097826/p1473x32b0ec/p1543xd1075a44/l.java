package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class l extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 f200408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f200409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f200410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f200411d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, float f17, float f18, float f19) {
        this.f200408a = e0Var;
        this.f200409b = f17;
        this.f200410c = f18;
        this.f200411d = f19;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        boolean isNaN = java.lang.Float.isNaN(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var = this.f200408a;
        float f19 = 0.0f;
        if (isNaN) {
            f18 = 0.0f;
        } else {
            boolean z17 = e0Var.f199716e.getResources().getConfiguration().orientation == 2;
            float height = view.getHeight();
            float max = java.lang.Math.max(java.lang.Math.min(java.lang.Math.abs(z17 ? height * (1.0f - java.lang.Math.abs(f17)) : height * f17) / this.f200409b, 1.0f), 0.0f);
            f19 = max;
            f18 = java.lang.Math.max(java.lang.Math.min((max - 0.5f) * 2.0f, 1.0f), 0.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBottomSheet", "onSlide " + f17 + ", percent:" + f19 + ", arrowPercent:" + f18);
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) e0Var.f199734z).mo141623x754a37bb()).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutParams, "getLayoutParams(...)");
        float f27 = this.f200411d;
        float f28 = this.f200410c;
        layoutParams.height = (int) (f28 + (f19 * (f27 - f28)));
        ((android.view.View) ((jz5.n) e0Var.f199734z).mo141623x754a37bb()).setLayoutParams(layoutParams);
        android.view.View view2 = (android.view.View) ((jz5.n) e0Var.A).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage$enableScrollHeaderLine$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage$enableScrollHeaderLine$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged ");
        sb6.append(i17);
        sb6.append(", isShowing:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var = this.f200408a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = e0Var.B;
        sb6.append(y1Var != null ? java.lang.Boolean.valueOf(y1Var.f()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBottomSheet", sb6.toString());
        if (i17 == 5) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = e0Var.B;
            if (y1Var2 != null && y1Var2.f()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(e0Var, false, 1, null);
            }
        }
        if (i17 == 4) {
            if (e0Var.f199716e.getResources().getConfiguration().orientation == 2) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3 = e0Var.B;
                if (y1Var3 != null && y1Var3.f()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(e0Var, false, 1, null);
                }
            }
        }
    }
}
