package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class y implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f90342d;

    public y(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f90342d = appBrandAuthorizeUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Message.obtain(this.f90342d.R, 2, (com.tencent.mm.msgsubscription.SubscribeMsgRequestResult) obj).sendToTarget();
        return null;
    }
}
