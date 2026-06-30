package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class mh implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh f216706d;

    public mh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh qhVar) {
        this.f216706d = qhVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void l(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh qhVar = this.f216706d;
        android.view.View O6 = qhVar.O6();
        if (O6 != null && O6.getVisibility() == 0 && qhVar.f217245g) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$onCreate$1", "onFragmentChange", "(IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$onCreate$1", "onFragmentChange", "(IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qhVar.P6();
            int i28 = qhVar.f217244f;
            if (i27 == i28 && qhVar.f217247i) {
                ey2.o0 N6 = ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).N6(i28);
                N6.a(ey2.q0.f339007g);
                N6.f338981h = java.lang.System.currentTimeMillis();
                qhVar.f217247i = false;
                zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
                nk6.q0("finder_tl_hot_tab", "onLeftSlide");
                nk6.N("finder_tl_hot_tab");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    /* renamed from: onPageScrolled */
    public void mo55649xf210c75a(int i17, float f17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void z(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
