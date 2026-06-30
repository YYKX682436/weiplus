package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class ig implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI f73937d;

    public ig(com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI regByMobileVoiceVerifyUI) {
        this.f73937d = regByMobileVoiceVerifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI regByMobileVoiceVerifyUI = this.f73937d;
        regByMobileVoiceVerifyUI.hideVKB();
        regByMobileVoiceVerifyUI.finish();
        return true;
    }
}
