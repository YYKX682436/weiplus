package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class w4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74284d;

    public w4(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f74284d = loginHistoryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f74284d.f73344x0++;
    }
}
