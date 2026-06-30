package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class n6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI f89882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI) {
        super(0);
        this.f89882d = appBrandPreLoadingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f89882d.getIntent().getIntExtra("MicroMsg.AppBrandPreLoadingLogic.splashFlavor", 5));
    }
}
