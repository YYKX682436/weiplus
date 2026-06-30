package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public class p2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f282793d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.o2(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 f282794e;

    public p2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1) {
        this.f282794e = viewTreeObserverOnPreDrawListenerC21747x53cf88d1;
    }

    public void a(boolean z17) {
        java.lang.Runnable runnable = this.f282793d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1 = this.f282794e;
        if (!z17) {
            viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.removeCallbacks(runnable);
            viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.postDelayed(runnable, 256L);
            return;
        }
        viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.removeCallbacks(runnable);
        if (viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.getVisibility() != 0) {
            viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(viewTreeObserverOnPreDrawListenerC21747x53cf88d1.mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
            viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.setVisibility(0);
            viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.startAnimation(loadAnimation);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.String d17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1 = this.f282794e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282105i.getItem(i17);
        if (f9Var == null) {
            d17 = null;
        } else {
            d17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(f9Var.mo78012x3fdd41df()), viewTreeObserverOnPreDrawListenerC21747x53cf88d1);
        }
        viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282108o.setText(d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (1 == i17) {
            a(true);
        } else if (i17 == 0) {
            a(false);
        }
        n11.a.b().n(i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
