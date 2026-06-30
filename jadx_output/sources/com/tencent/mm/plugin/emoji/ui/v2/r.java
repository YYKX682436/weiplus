package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes9.dex */
public class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98393d;

    public r(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98393d = emojiStoreV2SingleProductUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.U;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98393d;
        emojiStoreV2SingleProductUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) emojiStoreV2SingleProductUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.emoji.ui.v2.t(emojiStoreV2SingleProductUI);
        k0Var.f211881s = new com.tencent.mm.plugin.emoji.ui.v2.u(emojiStoreV2SingleProductUI);
        k0Var.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 2, 0, "", java.lang.Integer.valueOf(emojiStoreV2SingleProductUI.f98286i));
        return true;
    }
}
