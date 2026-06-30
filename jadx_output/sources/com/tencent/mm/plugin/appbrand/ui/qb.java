package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public final class qb implements oe1.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI f89963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f89964b;

    public qb(com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI, android.view.View view) {
        this.f89963a = appBrandVideoPreviewUI;
        this.f89964b = view;
    }

    @Override // oe1.k1
    public final void a(boolean z17) {
        android.view.View view = this.f89964b;
        com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI = this.f89963a;
        if (z17) {
            ((android.widget.ImageView) appBrandVideoPreviewUI.findViewById(com.tencent.mm.R.id.l3v)).setVisibility(0);
            ((android.widget.ImageView) appBrandVideoPreviewUI.findViewById(com.tencent.mm.R.id.l4q)).setVisibility(0);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).bottomMargin = appBrandVideoPreviewUI.f89484v;
            return;
        }
        ((android.widget.ImageView) appBrandVideoPreviewUI.findViewById(com.tencent.mm.R.id.l3v)).setVisibility(8);
        ((android.widget.ImageView) appBrandVideoPreviewUI.findViewById(com.tencent.mm.R.id.l4q)).setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams2).bottomMargin = appBrandVideoPreviewUI.f89483u;
    }
}
