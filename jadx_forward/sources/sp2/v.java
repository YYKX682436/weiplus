package sp2;

/* loaded from: classes2.dex */
public final class v extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f492770d;

    public v(sp2.b0 b0Var) {
        this.f492770d = b0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        int w17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", "onDoubleTap");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sp2.b0 b0Var = this.f492770d;
        if (currentTimeMillis - b0Var.f492516i > 1000) {
            b0Var.f492516i = java.lang.System.currentTimeMillis();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = b0Var.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb activityC14524xdd91c7bb = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb) m158354x19263085 : null;
            if (activityC14524xdd91c7bb != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.C14528x2198c52 fragment = activityC14524xdd91c7bb.f203078w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(fragment).a(sp2.r.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                sp2.o2 o2Var = ((sp2.r) a17).f492725d;
                if (o2Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
                if (c14595xffb7e034 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c14595xffb7e034.getLayoutManager();
                if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
                    int[] iArr = new int[2];
                    ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager).u(iArr);
                    w17 = iArr[0];
                } else {
                    w17 = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w() : 0;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e0342 = o2Var.f492672j;
                if (c14595xffb7e0342 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "[onActionbarClick] position=" + w17 + " childRecyclerView: " + c14595xffb7e0342.g1());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e0343 = o2Var.f492672j;
                if (c14595xffb7e0343 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                c14595xffb7e0343.m58541xc7d4965e(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e0344 = o2Var.f492672j;
                if (c14595xffb7e0344 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                boolean z17 = w17 <= 12;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderParentRecyclerView", "scrollToTop isNeedSmooth: " + z17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a g17 = c14595xffb7e0344.g1();
                if (g17 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                    g17.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(g17, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (z17) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(c14595xffb7e0344, arrayList3.toArray(), "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c14595xffb7e0344.c1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(c14595xffb7e0344, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                if (w17 <= 12) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = o2Var.f492688r;
                    if (c22851x22587864 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                        throw null;
                    }
                    c22851x22587864.postDelayed(new sp2.f0(o2Var), 20L);
                } else {
                    com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = o2Var.f492688r;
                    if (c22851x225878642 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                        throw null;
                    }
                    c22851x225878642.postDelayed(new sp2.f0(o2Var), 100L);
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", "onSingleTapConfirmed");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", "onSingleTapUp");
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
