package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class ab extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI f89508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
        super(0);
        this.f89508d = appBrandUserInfoAuthorizeUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f89508d.f89453i;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("mainSwitch");
        throw null;
    }
}
