package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class n4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f74056d;

    public n4(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI, h11.e eVar) {
        this.f74056d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74056d);
    }
}
