package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class p0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89913d;

    public p0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89913d = appBrandAuthorizeUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Message.obtain(this.f89913d.R, 1, (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) obj).sendToTarget();
        return null;
    }
}
