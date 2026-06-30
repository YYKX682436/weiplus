package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98356d;

    public d0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98356d = emojiStoreV2SingleProductUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98356d;
        com.tencent.mm.ui.contact.LabelContainerView labelContainerView = emojiStoreV2SingleProductUI.I;
        if (labelContainerView != null) {
            labelContainerView.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(emojiStoreV2SingleProductUI.H);
            emojiStoreV2SingleProductUI.f98280J.r(arrayList, emojiStoreV2SingleProductUI.L);
            emojiStoreV2SingleProductUI.setMMTitle(com.tencent.mm.R.string.bzm);
            emojiStoreV2SingleProductUI.showOptionMenu(1001, false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(12788, "1");
        }
        return false;
    }
}
