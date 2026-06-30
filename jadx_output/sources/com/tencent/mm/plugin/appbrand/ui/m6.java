package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI f89864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI) {
        super(0);
        this.f89864d = appBrandPreLoadingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xg1.j jVar;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC;
        f06.v[] vVarArr = com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.A;
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI = this.f89864d;
        if (appBrandPreLoadingUI.e7() != 4) {
            return new com.tencent.mm.plugin.appbrand.ui.c9(appBrandPreLoadingUI);
        }
        xg1.h hVar = xg1.h.f454370a;
        int i17 = appBrandPreLoadingUI.f89384n;
        synchronized (hVar) {
            jVar = (xg1.j) xg1.h.f454371b.get(i17);
        }
        if (jVar == null || (appBrandInitConfigWC = jVar.f454377c) == null) {
            return new com.tencent.mm.plugin.appbrand.ui.la(appBrandPreLoadingUI);
        }
        com.tencent.mm.plugin.appbrand.ui.uc c17 = com.tencent.mm.plugin.appbrand.ui.s5.c(appBrandPreLoadingUI, appBrandInitConfigWC);
        return c17 == null ? new com.tencent.mm.plugin.appbrand.ui.f6(appBrandPreLoadingUI, appBrandInitConfigWC, appBrandPreLoadingUI.f89393w) : c17;
    }
}
