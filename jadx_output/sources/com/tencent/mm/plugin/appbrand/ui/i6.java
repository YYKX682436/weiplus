package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI f89777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI) {
        super(0);
        this.f89777d = appBrandPreLoadingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI = this.f89777d;
        appBrandPreLoadingUI.f89386p = true;
        appBrandPreLoadingUI.f7();
        appBrandPreLoadingUI.finish();
        return jz5.f0.f302826a;
    }
}
