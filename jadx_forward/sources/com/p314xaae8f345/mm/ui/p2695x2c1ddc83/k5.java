package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class k5 implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f289340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf5.n f289341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f289343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289344f;

    public k5(int i17, android.view.ViewGroup.LayoutParams layoutParams, yf5.n nVar, int i18, float f17, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var) {
        this.f289339a = i17;
        this.f289340b = layoutParams;
        this.f289341c = nVar;
        this.f289342d = i18;
        this.f289343e = f17;
        this.f289344f = o5Var;
    }

    @Override // oa5.a
    public final void a(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        int i17 = this.f289339a;
        android.view.ViewGroup.LayoutParams layoutParams = this.f289340b;
        layoutParams.height = (int) (i17 + ((0 - i17) * f17));
        yf5.n nVar = this.f289341c;
        android.view.View view = nVar.f543464r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f - f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$2", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$2", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f543463q.setLayoutParams(layoutParams);
        nVar.f543462p = layoutParams.height;
        nVar.f543463q.requestLayout();
        int i18 = this.f289342d;
        float f18 = i18 + (f17 * (this.f289343e - i18));
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289344f.f289459f;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) viewOnTouchListenerC22366xcd5c2226.T.getLayoutParams();
            boolean z17 = f18 < 0.0f;
            int i19 = layoutParams2.height;
            android.view.View findViewById = viewOnTouchListenerC22366xcd5c2226.getRootView().findViewById(com.p314xaae8f345.mm.R.id.huj);
            if (findViewById != null) {
                findViewById.getHeight();
            }
            int dimension = (int) viewOnTouchListenerC22366xcd5c2226.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9);
            int height = findViewById != null ? findViewById.getHeight() : 0;
            if (height <= 0) {
                height = viewOnTouchListenerC22366xcd5c2226.f288862w;
            }
            if (z17) {
                layoutParams2.height = height;
            } else {
                float f19 = height;
                if (f18 < f19) {
                    f18 = f19;
                }
                layoutParams2.height = (int) f18;
            }
            if (i19 != layoutParams2.height) {
                viewOnTouchListenerC22366xcd5c2226.r();
                if ((!z17 || java.lang.Math.abs(f18) <= height + dimension) && !viewOnTouchListenerC22366xcd5c2226.r() && (rVar = viewOnTouchListenerC22366xcd5c2226.f288851m) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).d(true);
                }
                viewOnTouchListenerC22366xcd5c2226.T.requestLayout();
            }
        }
    }
}
