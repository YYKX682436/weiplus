package bp2;

/* loaded from: classes2.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.m f104604d;

    public l(bp2.m mVar) {
        this.f104604d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.view.View m7474xfb86a31b;
        bp2.m mVar = this.f104604d;
        mVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FIRST_SHOW_NEARBY_LIVE_SQUARE_SCROLL_GUIDE_CNT_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "onAnimationStart scrollGuideCnt:" + r17 + " isNeverScroll:" + o17);
        if (!o17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "onAnimationStart return for isNeverScroll:" + o17);
            return;
        }
        if (r17 > mVar.f104605a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "onAnimationStart return for scrollGuideCnt:" + r17);
            return;
        }
        android.view.View view = mVar.f104607c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.View view2 = new android.view.View(view.getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "attachFloatView floatView:" + view2);
        view2.setTag("FinderLivePageScrollGuideHelper");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        view2.setOnTouchListener(new bp2.j(mVar));
        android.view.View view3 = mVar.f104607c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        ((p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) view3).addView(view2, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = mVar.f104610f;
        android.view.View findViewById = (c14521x246f2bd == null || (m7474xfb86a31b = c14521x246f2bd.m7474xfb86a31b()) == null) ? null : m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.mcb);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view4 = findViewById;
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper", "showNextPageFragmentGuide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper", "showNextPageFragmentGuide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd2 = mVar.f104610f;
        if (c14521x246f2bd2 != null) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = c14521x246f2bd2.m7453x12a9d210();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7453x12a9d210);
            pf5.z zVar = pf5.z.f435481a;
            int size = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) zVar.b(m7453x12a9d210).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).f203034o.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd3 = mVar.f104610f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14521x246f2bd3);
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d2102 = c14521x246f2bd3.m7453x12a9d210();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7453x12a9d2102);
            int Q6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) zVar.b(m7453x12a9d2102).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).Q6();
            if (size != Q6 + 1) {
                android.view.View view5 = mVar.f104608d;
                int width = (view5 != null ? view5.getWidth() : 0) * Q6;
                android.view.View view6 = mVar.f104608d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view6);
                i17 = width + ((int) view6.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "getSmoothScrollDistance distance:" + i17);
                mVar.f(i17, 0, 0);
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                mVar.f104611g = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLivePageScrollGuideHelper", "getSmoothScrollDistance return 0 for size:" + size + " index:" + Q6);
        }
        i17 = 0;
        mVar.f(i17, 0, 0);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        mVar.f104611g = true;
    }
}
