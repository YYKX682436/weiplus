package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class a0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f73703d;

    public a0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f73703d = baseLoginVoiceUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f73703d.f73254o = null;
    }
}
