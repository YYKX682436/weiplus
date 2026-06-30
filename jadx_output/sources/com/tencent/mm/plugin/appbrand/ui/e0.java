package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes4.dex */
public class e0 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89672d;

    public e0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89672d = appBrandAuthorizeUI;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        return com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, i65.a.b(this.f89672d.getContext(), 4), false, null);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "setting_wxa_user_profile_icon";
    }
}
