package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class x implements db5.l5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98408d;

    public x(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98408d = emojiStoreV2SingleProductUI;
    }

    @Override // db5.l5
    public boolean J6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "onBottom");
        int i17 = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.U;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98408d;
        if (!emojiStoreV2SingleProductUI.G) {
            emojiStoreV2SingleProductUI.U6(emojiStoreV2SingleProductUI.E);
            emojiStoreV2SingleProductUI.G = true;
            emojiStoreV2SingleProductUI.Q.sendEmptyMessageDelayed(1002, 200L);
        }
        return true;
    }
}
