package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f73919d;

    public i0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f73919d = baseLoginVoiceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f73919d;
        baseLoginVoiceUI.finish();
        baseLoginVoiceUI.overridePendingTransition(-1, -1);
    }
}
