package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class nb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI f89888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI) {
        super(0);
        this.f89888d = appBrandUserProfileAuthorizeUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f89888d.f89464i;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("mainSwitch");
        throw null;
    }
}
