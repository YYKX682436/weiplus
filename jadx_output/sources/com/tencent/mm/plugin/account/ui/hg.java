package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class hg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI f73914d;

    public hg(com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI regByMobileVoiceVerifySelectUI) {
        this.f73914d = regByMobileVoiceVerifySelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI regByMobileVoiceVerifySelectUI = this.f73914d;
        regByMobileVoiceVerifySelectUI.hideVKB();
        regByMobileVoiceVerifySelectUI.finish();
        return true;
    }
}
