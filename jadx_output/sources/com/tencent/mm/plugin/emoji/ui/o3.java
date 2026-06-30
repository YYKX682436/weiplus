package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public class o3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI f98110d;

    public o3(com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI emojiStoreTopicUI) {
        this.f98110d = emojiStoreTopicUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI emojiStoreTopicUI = this.f98110d;
        g4Var.g(1001, emojiStoreTopicUI.getString(com.tencent.mm.R.string.f491108by5), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.g(1000, emojiStoreTopicUI.getString(com.tencent.mm.R.string.by6), com.tencent.mm.R.raw.bottomsheet_icon_moment);
    }
}
