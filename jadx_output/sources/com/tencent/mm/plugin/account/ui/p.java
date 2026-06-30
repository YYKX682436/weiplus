package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74102d;

    public p(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f74102d = baseLoginVoiceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f74102d;
        com.tencent.mm.plugin.account.ui.l3 l3Var = new com.tencent.mm.plugin.account.ui.l3(baseLoginVoiceUI.f73259t);
        l3Var.f73999c = baseLoginVoiceUI.f73261v;
        com.tencent.mm.plugin.account.ui.q3.c(baseLoginVoiceUI, l3Var);
    }
}
