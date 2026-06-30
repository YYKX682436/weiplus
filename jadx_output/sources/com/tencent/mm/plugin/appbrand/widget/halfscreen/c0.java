package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class c0 extends mi1.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar f91159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 f91160b;

    public c0(com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar, com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var) {
        this.f91159a = baseAppBrandSingleCloseCapsuleBar;
        this.f91160b = l0Var;
    }

    @Override // mi1.i0
    public void a(float f17) {
        com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar = this.f91159a;
        int color = baseAppBrandSingleCloseCapsuleBar.getContext().getResources().getColor(baseAppBrandSingleCloseCapsuleBar.h(com.tencent.mm.R.color.aaw));
        mi1.v vVar = this.f91160b.f91195a.f74821z;
        int argb = android.graphics.Color.argb((int) (f17 * 255), android.graphics.Color.red(color), android.graphics.Color.green(color), android.graphics.Color.blue(color));
        if (vVar.f326703b != null) {
            vVar.c().setBackgroundColor(argb);
        }
    }
}
