package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class jb implements fl1.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI f89810a;

    public jb(com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI) {
        this.f89810a = appBrandUserProfileAuthorizeUI;
    }

    @Override // fl1.i1
    public void a(fl1.h1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI = this.f89810a;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = appBrandUserProfileAuthorizeUI.f89466n;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("wxaUserInfoListOperationController");
            throw null;
        }
        m0Var.a(item);
        appBrandUserProfileAuthorizeUI.f89463h = item.f263786h;
    }
}
