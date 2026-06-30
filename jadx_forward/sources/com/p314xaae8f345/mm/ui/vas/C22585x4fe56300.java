package com.p314xaae8f345.mm.ui.vas;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity;", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.vas.VASCommonFragmentForCommonActivity */
/* loaded from: classes14.dex */
public final class C22585x4fe56300 extends com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 {
    public boolean R;

    @Override // com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83
    public void B0() {
        super.B0();
        this.R = z0();
        A0();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83, na5.b
    /* renamed from: onPagePopEnterAnimEnd */
    public void mo81224x3e2ce915() {
        super.mo81224x3e2ce915();
        A0();
        s0(this.R);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83, com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        w0(null);
        boolean z17 = false;
        if (!A0()) {
            r0(false);
            return;
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null && abstractActivityC22579xbed01a37.getF147381t()) {
            z17 = true;
        }
        r0(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83
    public java.lang.Class u0() {
        return com.p314xaae8f345.mm.ui.vas.C22585x4fe56300.class;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83
    public void y0() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window;
        android.view.View decorView;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (!((((mo7430x19263085 == null || (window = mo7430x19263085.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility()) & 2) == 0)) {
            android.view.View view = this.f292661w;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f292661w;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/vas/VASCommonFragmentForCommonActivity", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f292661w;
        if (view3 == null || (layoutParams = view3.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = com.p314xaae8f345.mm.ui.bl.c(mo7438x76847179());
        android.view.View view4 = this.f292661w;
        if (view4 == null) {
            return;
        }
        view4.setLayoutParams(layoutParams);
    }
}
