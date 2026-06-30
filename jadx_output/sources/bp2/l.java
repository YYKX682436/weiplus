package bp2;

/* loaded from: classes2.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.m f23071d;

    public l(bp2.m mVar) {
        this.f23071d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.view.View view;
        bp2.m mVar = this.f23071d;
        mVar.getClass();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FIRST_SHOW_NEARBY_LIVE_SQUARE_SCROLL_GUIDE_CNT_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, true);
        com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "onAnimationStart scrollGuideCnt:" + r17 + " isNeverScroll:" + o17);
        if (!o17) {
            com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "onAnimationStart return for isNeverScroll:" + o17);
            return;
        }
        if (r17 > mVar.f23072a) {
            com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "onAnimationStart return for scrollGuideCnt:" + r17);
            return;
        }
        android.view.View view2 = mVar.f23074c;
        kotlin.jvm.internal.o.d(view2);
        android.view.View view3 = new android.view.View(view2.getContext());
        com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "attachFloatView floatView:" + view3);
        view3.setTag("FinderLivePageScrollGuideHelper");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        view3.setOnTouchListener(new bp2.j(mVar));
        android.view.View view4 = mVar.f23074c;
        kotlin.jvm.internal.o.e(view4, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        ((androidx.coordinatorlayout.widget.CoordinatorLayout) view4).addView(view3, layoutParams);
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = mVar.f23077f;
        android.view.View findViewById = (nearbyLiveSquareTabFragment == null || (view = nearbyLiveSquareTabFragment.getView()) == null) ? null : view.findViewById(com.tencent.mm.R.id.mcb);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view5 = findViewById;
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper", "showNextPageFragmentGuide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper", "showNextPageFragmentGuide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment2 = mVar.f23077f;
        if (nearbyLiveSquareTabFragment2 != null) {
            androidx.fragment.app.Fragment parentFragment = nearbyLiveSquareTabFragment2.getParentFragment();
            kotlin.jvm.internal.o.d(parentFragment);
            pf5.z zVar = pf5.z.f353948a;
            int size = ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) zVar.b(parentFragment).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).f121501o.size();
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment3 = mVar.f23077f;
            kotlin.jvm.internal.o.d(nearbyLiveSquareTabFragment3);
            androidx.fragment.app.Fragment parentFragment2 = nearbyLiveSquareTabFragment3.getParentFragment();
            kotlin.jvm.internal.o.d(parentFragment2);
            int Q6 = ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) zVar.b(parentFragment2).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).Q6();
            if (size != Q6 + 1) {
                android.view.View view6 = mVar.f23075d;
                int width = (view6 != null ? view6.getWidth() : 0) * Q6;
                android.view.View view7 = mVar.f23075d;
                kotlin.jvm.internal.o.d(view7);
                i17 = width + ((int) view7.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn));
                com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "getSmoothScrollDistance distance:" + i17);
                mVar.f(i17, 0, 0);
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                mVar.f23078g = true;
            }
            com.tencent.mars.xlog.Log.w("FinderLivePageScrollGuideHelper", "getSmoothScrollDistance return 0 for size:" + size + " index:" + Q6);
        }
        i17 = 0;
        mVar.f(i17, 0, 0);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        mVar.f23078g = true;
    }
}
