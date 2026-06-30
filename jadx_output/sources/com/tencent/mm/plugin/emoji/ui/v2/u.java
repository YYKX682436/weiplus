package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes9.dex */
public class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98405d;

    public u(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98405d = emojiStoreV2SingleProductUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98405d;
        if (itemId == 1000) {
            y12.k.a(emojiStoreV2SingleProductUI.getContext(), emojiStoreV2SingleProductUI.f98287m, emojiStoreV2SingleProductUI.f98289o, emojiStoreV2SingleProductUI.f98288n, ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().R(), com.tencent.mm.plugin.emoji.model.EmojiLogic.c(emojiStoreV2SingleProductUI.f98286i, emojiStoreV2SingleProductUI.f98287m, emojiStoreV2SingleProductUI.f98289o, emojiStoreV2SingleProductUI.f98288n, emojiStoreV2SingleProductUI.f98290p, emojiStoreV2SingleProductUI.f98292r, null), 12);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 2, 1, "", java.lang.Integer.valueOf(emojiStoreV2SingleProductUI.f98286i));
            return;
        }
        if (itemId != 1001) {
            return;
        }
        new i15.a();
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f334140a.a(emojiStoreV2SingleProductUI.f98287m, emojiStoreV2SingleProductUI.f98289o, emojiStoreV2SingleProductUI.f98286i, emojiStoreV2SingleProductUI.f98288n, emojiStoreV2SingleProductUI.f98290p, emojiStoreV2SingleProductUI.f98292r, null));
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334120d.f334139a = 5;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(emojiStoreV2SingleProductUI.getContext(), aVar, rVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 2, 2, "", java.lang.Integer.valueOf(emojiStoreV2SingleProductUI.f98286i));
    }
}
