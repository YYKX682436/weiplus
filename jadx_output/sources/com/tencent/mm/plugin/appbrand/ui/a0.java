package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class a0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.IconPreference f89498d;

    public a0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        this.f89498d = iconPreference;
    }

    @Override // l01.u
    public void b() {
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
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.z(this, bitmap));
    }
}
