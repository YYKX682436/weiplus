package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes9.dex */
public class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98404d;

    public t(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98404d = emojiStoreV2SingleProductUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98404d;
        g4Var.g(1001, emojiStoreV2SingleProductUI.getString(com.tencent.mm.R.string.f491108by5), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.g(1000, emojiStoreV2SingleProductUI.getString(com.tencent.mm.R.string.by6), com.tencent.mm.R.raw.bottomsheet_icon_moment);
    }
}
