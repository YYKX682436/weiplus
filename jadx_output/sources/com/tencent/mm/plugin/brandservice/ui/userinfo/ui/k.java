package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI f94574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI brandServiceUserInfoManageUI) {
        super(0);
        this.f94574d = brandServiceUserInfoManageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI.f94554h;
        final com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI brandServiceUserInfoManageUI = this.f94574d;
        return new xm3.t0((com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) brandServiceUserInfoManageUI.f94556e).getValue(), new in5.s() { // from class: com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != 1) {
                    return new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.e();
                }
                com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI brandServiceUserInfoManageUI2 = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI.this;
                int i18 = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BrandServiceUserInfoManageUI.f94554h;
                return new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.d(brandServiceUserInfoManageUI2.f94555d == 1);
            }
        }, false, 4, null);
    }
}
