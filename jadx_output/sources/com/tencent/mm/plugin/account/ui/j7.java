package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class j7 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f73951d;

    public j7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f73951d = loginUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f73951d.f73410n = null;
    }
}
