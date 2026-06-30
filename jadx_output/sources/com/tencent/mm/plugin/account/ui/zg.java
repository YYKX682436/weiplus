package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class zg implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74367d;

    public zg(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74367d = regSetInfoUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f74367d.f73642t = null;
    }
}
