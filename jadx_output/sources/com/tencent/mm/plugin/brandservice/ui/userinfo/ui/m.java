package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI f94576d;

    public m(com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI brandServiceUserInfoManageUI) {
        this.f94576d = brandServiceUserInfoManageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f94576d.finish();
        return true;
    }
}
