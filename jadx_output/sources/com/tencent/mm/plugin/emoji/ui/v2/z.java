package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98409d;

    public z(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98409d = emojiStoreV2SingleProductUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98409d;
        com.tencent.mm.ui.contact.LabelContainerView labelContainerView = emojiStoreV2SingleProductUI.I;
        if (labelContainerView == null || labelContainerView.getVisibility() != 0) {
            emojiStoreV2SingleProductUI.finish();
            return false;
        }
        emojiStoreV2SingleProductUI.I.setVisibility(8);
        emojiStoreV2SingleProductUI.showOptionMenu(1001, emojiStoreV2SingleProductUI.B);
        emojiStoreV2SingleProductUI.setMMTitle(com.tencent.mm.R.string.f491113bz4);
        return false;
    }
}
