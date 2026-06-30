package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class c3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteRecommendChoiceUI f73765d;

    public c3(com.tencent.mm.plugin.account.ui.InviteRecommendChoiceUI inviteRecommendChoiceUI) {
        this.f73765d = inviteRecommendChoiceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.InviteRecommendChoiceUI inviteRecommendChoiceUI = this.f73765d;
        inviteRecommendChoiceUI.hideVKB();
        inviteRecommendChoiceUI.finish();
        return true;
    }
}
