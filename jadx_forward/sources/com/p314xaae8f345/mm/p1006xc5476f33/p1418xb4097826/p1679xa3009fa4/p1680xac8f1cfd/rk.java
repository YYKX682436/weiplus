package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class rk implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f217334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f217337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217338i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f217339m;

    public rk(android.view.View view, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar, android.view.View view2, android.widget.FrameLayout frameLayout, android.view.View view3, boolean z18) {
        this.f217333d = view;
        this.f217334e = z17;
        this.f217335f = blVar;
        this.f217336g = view2;
        this.f217337h = frameLayout;
        this.f217338i = view3;
        this.f217339m = z18;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f217333d;
        float width = view2.getWidth() - (view2.getContext().getResources().getDisplayMetrics().widthPixels / 4.0f);
        boolean z17 = this.f217334e;
        android.view.View view3 = this.f217338i;
        android.view.View view4 = this.f217336g;
        android.widget.FrameLayout frameLayout = this.f217337h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f217335f;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 c15275x4b820d74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
            if (c15275x4b820d74 != null) {
                c15275x4b820d74.m62008x68ad0fc7(2 * width);
                c15275x4b820d74.m62009xae17c85(width > 0.0f);
            }
            view4.animate().alpha(0.0f).setDuration(300L).setStartDelay(400L).start();
            frameLayout.animate().alpha(0.0f).setDuration(300L).setStartDelay(400L).start();
            view3.animate().alpha(0.0f).setDuration(300L).setStartDelay(400L).start();
            android.view.View view5 = this.f217333d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setTranslationX(view2.getWidth() + view2.getPaddingStart() + view2.getPaddingEnd());
            view2.animate().translationX(0.0f).setDuration(400L).setStartDelay(460L).start();
            view2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sk(blVar), 15000L);
            return;
        }
        if (view2.getVisibility() == 0) {
            if (this.f217339m) {
                view4.animate().alpha(1.0f).setDuration(300L).start();
                frameLayout.animate().alpha(1.0f).setDuration(300L).start();
                view3.animate().alpha(1.0f).setDuration(300L).start();
                view2.animate().translationX(view2.getWidth() + view2.getPaddingStart() + view2.getPaddingEnd()).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tk(view2, blVar)).start();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 c15275x4b820d742 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
            if (c15275x4b820d742 != null) {
                c15275x4b820d742.m62009xae17c85(false);
            }
            android.view.View view6 = this.f217336g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            frameLayout.setAlpha(1.0f);
            android.view.View view7 = this.f217338i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view8 = this.f217333d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view8, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showRedDotBubble$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
