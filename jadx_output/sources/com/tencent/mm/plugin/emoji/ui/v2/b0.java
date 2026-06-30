package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class b0 implements com.tencent.mm.ui.contact.m4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98352a;

    public b0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98352a = emojiStoreV2SingleProductUI;
    }

    @Override // com.tencent.mm.ui.contact.m4
    public void a() {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98352a;
        com.tencent.mm.ui.contact.LabelContainerView labelContainerView = emojiStoreV2SingleProductUI.I;
        if (labelContainerView != null) {
            labelContainerView.clearFocus();
        }
        emojiStoreV2SingleProductUI.I.requestFocus();
        emojiStoreV2SingleProductUI.I.setVisibility(8);
        emojiStoreV2SingleProductUI.showOptionMenu(1001, emojiStoreV2SingleProductUI.B);
        emojiStoreV2SingleProductUI.setMMTitle(com.tencent.mm.R.string.f491113bz4);
    }

    @Override // com.tencent.mm.ui.contact.m4
    public void b() {
        this.f98352a.hideVKB();
    }
}
