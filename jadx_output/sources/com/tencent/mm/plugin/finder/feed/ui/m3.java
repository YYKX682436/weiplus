package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class m3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI f110292d;

    public m3(com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        this.f110292d = finderFriendLikeTimelineUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI = this.f110292d;
            j45.l.j(finderFriendLikeTimelineUI, "setting", ".ui.setting.SettingsPrivacyUI", finderFriendLikeTimelineUI.getIntent(), null);
        }
    }
}
