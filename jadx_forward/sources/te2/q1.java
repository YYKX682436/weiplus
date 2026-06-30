package te2;

/* loaded from: classes3.dex */
public final class q1 implements te2.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499878d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499879e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f499880f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.j0 f499881g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f499882h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 f499883i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7 f499884m;

    public q1(android.view.View root, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gk2.e liveData, te2.j0 j0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f499878d = root;
        this.f499879e = activity;
        this.f499880f = liveData;
        this.f499881g = j0Var;
        this.f499882h = "FinderLiveAnchorMusicViewCallback";
    }

    public void a(java.util.List musicData) {
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicData, "musicData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var = this.f499883i;
        if (d7Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(d7Var, null, true, (int) (com.p314xaae8f345.mm.ui.bl.b(d7Var.f199716e).y * 0.75f), 1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d7Var.K, "showMusicView size:" + musicData.size());
            android.view.View view = d7Var.P;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = d7Var.T;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = d7Var.U;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = d7Var.f199617y0;
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.setVisibility(0);
            }
            android.widget.ProgressBar progressBar = d7Var.f199616x0;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            d7Var.e0(false);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = d7Var.f199617y0;
            if (c22849x81a93d252 == null || (viewTreeObserver = c22849x81a93d252.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a7(d7Var));
        }
    }

    public void d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var = this.f499883i;
        if (d7Var != null) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(d7Var, null, true, (int) (com.p314xaae8f345.mm.ui.bl.b(d7Var.f199716e).y * 0.75f), 1, null);
            }
            android.view.View view = d7Var.P;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = d7Var.T;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = d7Var.U;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ProgressBar progressBar = d7Var.f199616x0;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            d7Var.e0(false);
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499879e;
    }
}
