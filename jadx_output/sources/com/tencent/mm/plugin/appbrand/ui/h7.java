package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public abstract class h7 {
    public static void a(android.view.View view, com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView, android.widget.TextView textView) {
        android.view.ViewGroup.LayoutParams layoutParams = appBrandCircleProgressView.getLayoutParams();
        layoutParams.width = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479731dn);
        layoutParams.height = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479731dn);
        appBrandCircleProgressView.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479723df);
        layoutParams2.height = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479723df);
        view.requestLayout();
        textView.setTextSize(0, i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479559b));
    }
}
