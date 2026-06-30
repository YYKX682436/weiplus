package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class yc implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ad f74343d;

    public yc(com.tencent.mm.plugin.account.ui.ad adVar) {
        this.f74343d = adVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f74343d.f73722g = null;
    }
}
