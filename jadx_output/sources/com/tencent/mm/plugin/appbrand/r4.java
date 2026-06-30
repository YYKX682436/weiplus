package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class r4 extends com.tencent.mm.plugin.appbrand.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f87751c;

    public r4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer) {
        this.f87751c = appBrandRuntimeContainer;
    }

    @Override // com.tencent.mm.plugin.appbrand.oc
    public boolean a(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f87751c.f74845x;
        if (h1Var != null) {
            return h1Var.f(keyEvent);
        }
        return false;
    }
}
