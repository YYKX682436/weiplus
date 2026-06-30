package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class y7 extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15273x7affa9e8 f214912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f214913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f214916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f214917f;

    public y7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15273x7affa9e8 c15273x7affa9e8, float f17, android.view.View view, android.view.View view2, float f18, float f19) {
        this.f214912a = c15273x7affa9e8;
        this.f214913b = f17;
        this.f214914c = view;
        this.f214915d = view2;
        this.f214916e = f18;
        this.f214917f = f19;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        float f19 = 0.0f;
        if (java.lang.Float.isNaN(f17)) {
            f18 = 0.0f;
        } else {
            float max = java.lang.Math.max(java.lang.Math.min(java.lang.Math.abs(view.getHeight() * f17) / this.f214913b, 1.0f), 0.0f);
            f19 = max;
            f18 = java.lang.Math.max(java.lang.Math.min((max - 0.5f) * 2.0f, 1.0f), 0.0f);
        }
        android.view.View view2 = this.f214914c;
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15273x7affa9e8.f212512i;
            float f27 = this.f214917f;
            float f28 = this.f214916e;
            layoutParams.height = (int) (f28 + (f19 * (f27 - f28)));
        } else {
            layoutParams = null;
        }
        view2.setLayoutParams(layoutParams);
        android.view.View view3 = this.f214915d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderDraggableIndicator$connectToBottomSheetBehavior$1$2", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderDraggableIndicator$connectToBottomSheetBehavior$1$2", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        yz5.a onBottomSheetDismiss;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if ((i17 == 4 || i17 == 5) && (onBottomSheetDismiss = this.f214912a.getOnBottomSheetDismiss()) != null) {
            onBottomSheetDismiss.mo152xb9724478();
        }
    }
}
