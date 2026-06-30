package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes4.dex */
public class o implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI f98381d;

    public o(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI emojiStoreV2RewardDetailUI) {
        this.f98381d = emojiStoreV2RewardDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f98381d.finish();
        return false;
    }
}
