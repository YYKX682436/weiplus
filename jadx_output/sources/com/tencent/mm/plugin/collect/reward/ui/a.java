package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI f96286d;

    public a(com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI qrRewardBaseUI) {
        this.f96286d = qrRewardBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI qrRewardBaseUI = this.f96286d;
        qrRewardBaseUI.hideVKB();
        qrRewardBaseUI.hideTenpayKB();
        qrRewardBaseUI.finish();
        return false;
    }
}
