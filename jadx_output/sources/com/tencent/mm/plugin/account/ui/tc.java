package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class tc implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg f74225d;

    public tc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg) {
        this.f74225d = mobileLoginOrForceReg;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f74225d.B = null;
    }
}
