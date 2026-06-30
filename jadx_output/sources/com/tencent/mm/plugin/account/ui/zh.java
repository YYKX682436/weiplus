package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class zh implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ai f74368d;

    public zh(com.tencent.mm.plugin.account.ui.ai aiVar) {
        this.f74368d = aiVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.ui.ai aiVar = this.f74368d;
        aiVar.f73730b.f73659i.dismiss();
        aiVar.f73730b.finish();
    }
}
