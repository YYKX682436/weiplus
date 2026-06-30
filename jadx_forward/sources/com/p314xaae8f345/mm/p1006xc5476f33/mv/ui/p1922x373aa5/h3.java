package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class h3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233382d;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6) {
        this.f233382d = c16693xf5eb90b6;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        android.view.View view;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6 = this.f233382d;
        if (i17 == 1) {
            java.util.concurrent.Future future = c16693xf5eb90b6.D;
            if (future != null) {
                future.cancel(false);
            }
            c16693xf5eb90b6.f();
            if (c16693xf5eb90b6.C) {
                c16693xf5eb90b6.C = false;
            }
        }
        if (!c16693xf5eb90b6.f233229v && i17 == 1) {
            c16693xf5eb90b6.f233229v = true;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.z2 eventListener = c16693xf5eb90b6.getEventListener();
            if (eventListener != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j1) eventListener;
                r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(j1Var.f232748b, 7, r45.bt4.class);
                if (bt4Var != null) {
                    bt4Var.f452583u = 1;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = j1Var.f232747a;
                if (currentTimeMillis - s1Var.f232961v > 2000) {
                    s1Var.f232961v = currentTimeMillis;
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.Q6(s1Var, 54);
                }
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c16693xf5eb90b6.f233216f;
        if (c1162x665295de != null) {
            int w17 = c1162x665295de.w();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv = c16693xf5eb90b6.getLyricRv();
            if (lyricRv != null && (p08 = lyricRv.p0(w17)) != null && (view2 = p08.f3639x46306858) != null) {
                view2.getLocationOnScreen(c16693xf5eb90b6.getFirstVisibleItemPos());
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c16693xf5eb90b6.f233216f;
        if (c1162x665295de2 != null) {
            int y17 = c1162x665295de2.y();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv2 = c16693xf5eb90b6.getLyricRv();
            if (lyricRv2 != null && (p07 = lyricRv2.p0(y17)) != null && (view = p07.f3639x46306858) != null) {
                view.getLocationOnScreen(c16693xf5eb90b6.getLastVisibleItemPos());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
