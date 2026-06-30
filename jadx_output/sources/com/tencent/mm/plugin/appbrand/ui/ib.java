package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class ib implements fl1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI f89784a;

    public ib(com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI) {
        this.f89784a = appBrandUserProfileAuthorizeUI;
    }

    @Override // fl1.j1
    public void a(android.view.View v17, fl1.h1 item, int i17) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f89784a.f89466n;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("wxaUserInfoListOperationController");
            throw null;
        }
        int i18 = com.tencent.mm.view.TouchableLayout.f213511d;
        m0Var.b(v17, i17, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
    }
}
