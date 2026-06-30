package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public class p3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI f98120d;

    public p3(com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI emojiStoreTopicUI) {
        this.f98120d = emojiStoreTopicUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI emojiStoreTopicUI = this.f98120d;
        if (itemId == 1000) {
            y12.k.a(emojiStoreTopicUI.getContext(), emojiStoreTopicUI.f97842J, emojiStoreTopicUI.L, emojiStoreTopicUI.K, ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().R(), com.tencent.mm.plugin.emoji.model.EmojiLogic.c(emojiStoreTopicUI.I, emojiStoreTopicUI.f97842J, emojiStoreTopicUI.L, emojiStoreTopicUI.K, emojiStoreTopicUI.M, 0, null), 13);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 1, 1, "", java.lang.Integer.valueOf(emojiStoreTopicUI.I));
            return;
        }
        if (itemId != 1001) {
            return;
        }
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f334140a.a(emojiStoreTopicUI.f97842J, emojiStoreTopicUI.L, emojiStoreTopicUI.I, emojiStoreTopicUI.K, emojiStoreTopicUI.M, 0, ""));
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334120d.f334139a = 5;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(emojiStoreTopicUI.getContext(), aVar, rVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 1, 2, "", java.lang.Integer.valueOf(emojiStoreTopicUI.I));
    }
}
