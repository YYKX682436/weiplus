package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class am extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f215317b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f215318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d f215319d;

    public am(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d) {
        this.f215319d = c15460x89aca30d;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
    }

    @Override // hx2.i
    public void c(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d = this.f215319d;
        c15460x89aca30d.f215122f = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c15460x89aca30d.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn.class)).T6().requestLayout();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerExpand:");
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerPeek:");
        this.f215319d.f215122f = true;
        this.f215318c = false;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215317b;
        if (aVar != null) {
            aVar.c(false, false, 0);
        }
        this.f215317b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        float m62616x9c78005c = ((f17 - layout.m62616x9c78005c()) * 1.0f) / ((layout.m62615x4ea7bf6() - layout.m62616x9c78005c()) - layout.getF213467f());
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (m62616x9c78005c < 0.0f) {
            m62616x9c78005c = 0.0f;
        }
        if (m62616x9c78005c > 1.0f) {
            m62616x9c78005c = 1.0f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", "onTranslationChange: source=" + source + ", translation: " + f17 + ", percent: " + m62616x9c78005c + ", borderExpand=" + layout.m62616x9c78005c() + ", borderClose=" + layout.m62615x4ea7bf6() + ", peekHeight=" + layout.getF213467f());
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "onScroll");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d = this.f215319d;
        if (b17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c15460x89aca30d.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn.class)).f216713e = 2;
        }
        if (!this.f215318c && m62616x9c78005c > 0.0f) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c15460x89aca30d.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            in5.s0 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn.class)).R6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pm pmVar = null;
            pmVar = null;
            pmVar = null;
            if (R6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderHorizontalVideoDrawerUIC", "startVideoAnim: holder is null");
                c15460x89aca30d.W6();
            } else {
                c15460x89aca30d.f215125i = R6;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15357x7481f361 c15357x7481f361 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15357x7481f361) R6.p(com.p314xaae8f345.mm.R.id.f566402fs3);
                cw2.da videoView = c15357x7481f361.m61652x7f02fdf3().getVideoView();
                c15357x7481f361.clearAnimation();
                if (videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) {
                    mk4.b m61394x356ded51 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView).m61394x356ded51();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m61394x356ded51, "null cannot be cast to non-null type android.view.View");
                    android.graphics.Rect rect = c15460x89aca30d.f215127n;
                    ((android.view.View) m61394x356ded51).getGlobalVisibleRect(rect);
                    c15357x7481f361.getGlobalVisibleRect(new android.graphics.Rect());
                    if (rect.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderHorizontalVideoDrawerUIC", "startVideoAnim: is empty, sourceRect=" + rect);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) R6.p(com.p314xaae8f345.mm.R.id.ghd);
                        if (c15178x4303ff90 != null) {
                            wu5.c hideSeekbarTask = c15178x4303ff90.getHideSeekbarTask();
                            if (hideSeekbarTask != null) {
                                hideSeekbarTask.cancel(false);
                            }
                            cw2.ca.d(c15178x4303ff90, "horizontalVideoAnimOpen", false, 2, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.v(c15178x4303ff90, false, 0L, true, 2, null);
                            c15178x4303ff90.m61287xedc18d82(false);
                        }
                        c15460x89aca30d.V6(R6);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d.P6(c15460x89aca30d, R6);
                        c15460x89aca30d.U6(R6);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d.O6(c15460x89aca30d, R6);
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c15460x89aca30d.S6().getParent(), c15357x7481f361)) {
                            android.view.ViewParent parent = c15460x89aca30d.S6().getParent();
                            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(c15460x89aca30d.S6());
                            }
                            c15357x7481f361.addView(c15460x89aca30d.S6(), -1, -1);
                        }
                        jz5.g gVar = c15460x89aca30d.f215129p;
                        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.om(c15460x89aca30d));
                        android.view.View view = (android.view.View) ((jz5.n) c15460x89aca30d.f215128o).mo141623x754a37bb();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        c15460x89aca30d.S6().setVisibility(0);
                        c15460x89aca30d.S6().setAlpha(0.0f);
                        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(valueOf);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View R62 = c15460x89aca30d.R6();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(valueOf);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(R62, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        R62.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                        yj0.a.f(R62, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View view3 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                        android.graphics.Rect rect2 = c15460x89aca30d.f215126m;
                        view3.getGlobalVisibleRect(rect2);
                        pmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pm(R6, c15460x89aca30d, c15357x7481f361, rect.width() / 2.0f, rect.height() / 2.0f, (rect2.width() * 1.0f) / rect.width(), (rect2.height() * 1.0f) / rect.height(), rect2.centerX() - rect.centerX(), ((rect2.top + rect2.bottom) / 2.0f) - ((rect.top + rect.bottom) / 2.0f), c15357x7481f361.getTranslationX(), c15357x7481f361.getTranslationY());
                    }
                } else {
                    c15460x89aca30d.W6();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderHorizontalVideoDrawerUIC", "startVideoAnim: finderPlayView=" + videoView);
                }
            }
            this.f215317b = pmVar;
            if (pmVar != null) {
                this.f215318c = true;
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215317b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pm) aVar).a(m62616x9c78005c);
        }
    }
}
