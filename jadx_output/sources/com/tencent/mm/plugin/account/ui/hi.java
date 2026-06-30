package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class hi implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f73916d;

    public hi(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f73916d = simpleLoginUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f73916d.f73666m = null;
    }
}
