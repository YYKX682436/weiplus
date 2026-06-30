package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes8.dex */
public class v2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiPaidUI f98226d;

    public v2(com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI) {
        this.f98226d = emojiPaidUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.K;
        com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI = this.f98226d;
        db5.e1.h(emojiPaidUI.getContext(), null, null, emojiPaidUI.getResources().getString(com.tencent.mm.R.string.bxo), false, new com.tencent.mm.plugin.emoji.ui.w2(emojiPaidUI));
        return true;
    }
}
