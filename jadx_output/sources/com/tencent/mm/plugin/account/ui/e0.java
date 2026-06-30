package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f73815d;

    public e0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f73815d = baseLoginVoiceUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.T6(this.f73815d, menuItem.getItemId());
    }
}
