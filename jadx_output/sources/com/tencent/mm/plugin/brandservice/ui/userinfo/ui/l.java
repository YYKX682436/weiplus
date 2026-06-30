package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI f94575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI brandServiceUserInfoManageUI) {
        super(0);
        this.f94575d = brandServiceUserInfoManageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.c cVar = new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.c(this.f94575d.f94555d);
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f455357b = true;
        return new com.tencent.mm.plugin.mvvmlist.MvvmList(cVar, n0Var, this.f94575d, null, null, 24, null);
    }
}
