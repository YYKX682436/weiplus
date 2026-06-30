package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class wa implements fl1.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI f90316a;

    public wa(com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
        this.f90316a = appBrandUserInfoAuthorizeUI;
    }

    @Override // fl1.i1
    public void a(fl1.h1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI = this.f90316a;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = appBrandUserInfoAuthorizeUI.f89455n;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("wxaUserInfoListOperationController");
            throw null;
        }
        m0Var.a(item);
        appBrandUserInfoAuthorizeUI.f89452h = item.f263786h;
    }
}
