package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class yk implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f218116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f218118f;

    public yk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar, android.view.View view, android.widget.FrameLayout frameLayout) {
        this.f218116d = blVar;
        this.f218117e = view;
        this.f218118f = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f218116d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nzl);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(-1);
        }
        android.view.View mo144222x4ff8c0f0 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nzm);
        android.view.View view2 = this.f218117e;
        if (mo144222x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.5f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo144222x4ff8c0f0.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo144222x4ff8c0f0.animate().translationX(-(view2.getWidth() + blVar.m158354x19263085().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl))).alpha(0.8f).setDuration(250L).start();
        }
        android.view.View mo144222x4ff8c0f02 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nfb);
        float f17 = 0.0f;
        if (mo144222x4ff8c0f02 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo144222x4ff8c0f02.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 c15275x4b820d74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
        if (c15275x4b820d74 != null) {
            c15275x4b820d74.m62009xae17c85(true);
            f17 = c15275x4b820d74.getWidth() - ((c15275x4b820d74.getX() - view2.getX()) - blVar.m158354x19263085().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        }
        view2.animate().alpha(1.0f).setDuration(250L).setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vk(blVar, f17)).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xk(view2, blVar, this.f218118f)).start();
    }
}
