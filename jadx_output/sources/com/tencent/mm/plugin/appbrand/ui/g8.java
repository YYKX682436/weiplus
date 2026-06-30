package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f89734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUI f89735e;

    public g8(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, android.os.Bundle bundle) {
        this.f89735e = appBrandUI;
        this.f89734d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = this.f89735e;
        sj1.l.e(appBrandUI.S, "public:prepare", "系统组件和UI初始化");
        super/*com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity*/.onCreate(this.f89734d);
        sj1.l.g(appBrandUI.S);
    }
}
