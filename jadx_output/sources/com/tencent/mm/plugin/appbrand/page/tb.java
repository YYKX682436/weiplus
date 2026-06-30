package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class tb implements ni1.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f87126a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f87127b;

    public tb(com.tencent.mm.plugin.appbrand.page.v5 page) {
        kotlin.jvm.internal.o.g(page, "page");
        this.f87126a = page;
    }

    public final void a(al1.b bVar) {
        android.content.Context context = bVar.getContext();
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView = bVar.getCapsuleView();
        if (capsuleView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.LayoutParams layoutParams = capsuleView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            xi1.g windowAndroid = this.f87126a.getWindowAndroid();
            kotlin.jvm.internal.o.d(windowAndroid);
            int dimensionPixelSize = windowAndroid.getOrientationHandler().a() == xi1.o.PORTRAIT ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480020lt) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480021lu);
            if (marginLayoutParams.rightMargin != dimensionPixelSize || marginLayoutParams.getMarginEnd() != dimensionPixelSize) {
                marginLayoutParams.rightMargin = dimensionPixelSize;
                marginLayoutParams.setMarginEnd(dimensionPixelSize);
                com.tencent.mars.xlog.Log.i("MPPageViewActionBarExtensionImpl", "[applyActionBarSizeProperty] reset capsule rightMargin:" + dimensionPixelSize);
                capsuleView.requestLayout();
            }
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        al1.e navResetStyleListener = bVar.getNavResetStyleListener();
        int c17 = navResetStyleListener != null ? navResetStyleListener.c() : com.tencent.mm.R.dimen.f480027m0;
        bVar.i();
        bVar.setNavContainerMinimumWidth(context.getResources().getDimensionPixelOffset(c17));
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480022lv);
        bVar.setActionBarHeight(dimensionPixelOffset);
        com.tencent.mars.xlog.Log.i("MPPageViewActionBarExtensionImpl", "[applyActionBarSizeProperty] ActionBar height=" + dimensionPixelOffset + "  density=" + context.getResources().getDisplayMetrics().density);
    }

    @Override // ni1.c
    public void b() {
        this.f87127b = true;
        al1.b r17 = this.f87126a.r1();
        kotlin.jvm.internal.o.f(r17, "getActionBar(...)");
        a(r17);
    }

    @Override // ni1.c
    public void c() {
        this.f87127b = false;
    }

    @Override // ni1.c
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        if (this.f87127b) {
            al1.b r17 = this.f87126a.r1();
            kotlin.jvm.internal.o.f(r17, "getActionBar(...)");
            a(r17);
        }
    }

    @Override // ni1.c
    public void onDestroy() {
        this.f87127b = false;
    }
}
