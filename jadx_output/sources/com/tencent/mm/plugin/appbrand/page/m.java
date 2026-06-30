package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m implements al1.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f86864a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86865b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f86866c;

    public m(com.tencent.mm.plugin.appbrand.page.v5 pageView) {
        kotlin.jvm.internal.o.g(pageView, "pageView");
        this.f86864a = pageView;
    }

    @Override // al1.e
    public boolean a(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandActionBarHomeButtonStyle", "pageView click close button");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86864a;
        if (v5Var.r1().f5745v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandActionBarHomeButtonStyle", "pageView click close button, but nav area is hidden");
            return false;
        }
        com.tencent.mm.plugin.appbrand.page.i3 x07 = v5Var.getRuntime().x0();
        if (x07 == null) {
            return false;
        }
        x07.c0(new com.tencent.mm.plugin.appbrand.page.l4(x07, x07.f86702e.m0().b(), true, null));
        return false;
    }

    @Override // al1.e
    public int c() {
        return com.tencent.mm.R.dimen.f480024lx;
    }

    @Override // al1.e
    public void d(al1.b actionBarThis, bm5.x0 navButtonGetter, bm5.x0 homeBtnGetter, android.view.View view) {
        kotlin.jvm.internal.o.g(actionBarThis, "actionBarThis");
        kotlin.jvm.internal.o.g(navButtonGetter, "navButtonGetter");
        kotlin.jvm.internal.o.g(homeBtnGetter, "homeBtnGetter");
        this.f86866c = true;
        if (actionBarThis.f5746w || actionBarThis.f5745v) {
            return;
        }
        android.content.Context context = actionBarThis.getContext();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86864a;
        if (v5Var.getRuntime().x0().getPageCount() != 1) {
            android.widget.ImageView imageView = (android.widget.ImageView) navButtonGetter.b();
            if (imageView != null) {
                imageView.setVisibility(0);
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams");
                com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams layoutParams2 = (com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams) layoutParams;
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).leftMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480024lx);
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).rightMargin = imageView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479573p);
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).gravity = 17;
                imageView.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) navButtonGetter.d();
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) homeBtnGetter.b();
        if (imageView3 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams");
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams layoutParams4 = (com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams) layoutParams3;
            int dimensionPixelOffset = imageView3.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480026lz);
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).height = dimensionPixelOffset;
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).width = dimensionPixelOffset;
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).gravity = 17;
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).leftMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480024lx);
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).rightMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480025ly);
            imageView3.setLayoutParams(layoutParams4);
            imageView3.clearColorFilter();
            imageView3.setImageDrawable(b3.l.getDrawable(imageView3.getContext(), com.tencent.mm.R.drawable.bd9));
            imageView3.setColorFilter(v5Var.r1().getForegroundColor(), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }
}
