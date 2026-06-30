package um4;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback f510657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f510658e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback, int i17) {
        this.f510657d = iLiteAppUICallback;
        this.f510658e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final android.view.View findViewById;
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        final android.view.View view = (android.view.View) this.f510657d;
        final lf0.h0 h0Var = (lf0.h0) g0Var;
        h0Var.getClass();
        if (view.getRootView() == null || (findViewById = view.getRootView().findViewById(com.p314xaae8f345.mm.R.id.og_)) == null) {
            return;
        }
        findViewById.setBackgroundColor(this.f510658e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/feature/topstory/TopStoryUIService", "showNavBarShadow", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/feature/topstory/TopStoryUIService", "showNavBarShadow", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: lf0.h0$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                android.view.View view3 = findViewById;
                lf0.h0 h0Var2 = lf0.h0.this;
                h0Var2.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view3);
                android.view.View view4 = view;
                arrayList2.add(view4);
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/feature/topstory/TopStoryUIService", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", h0Var2, array);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/feature/topstory/TopStoryUIService", "lambda$showNavBarShadow$0", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/feature/topstory/TopStoryUIService", "lambda$showNavBarShadow$0", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (view4 instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
                    h0Var2.Ri(((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view4).mo28563xe7b2546(), "onNavBarShadowManuallyHidden", null);
                }
                yj0.a.h(h0Var2, "com/tencent/mm/feature/topstory/TopStoryUIService", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }
}
