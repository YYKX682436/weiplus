package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class u0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f87131d;

    public u0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader) {
        this.f87131d = appBrandMenuHeader;
    }

    @Override // l01.u
    public void b() {
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f87131d;
        appBrandMenuHeader.a(true);
        appBrandMenuHeader.f86350g.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a2e));
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return null;
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f87131d;
        appBrandMenuHeader.a(false);
        appBrandMenuHeader.f86351h.setImageBitmap(bitmap);
    }
}
