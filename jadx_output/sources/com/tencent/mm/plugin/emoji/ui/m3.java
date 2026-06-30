package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public class m3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI f98092d;

    public m3(com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI emojiStoreTopicUI) {
        this.f98092d = emojiStoreTopicUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI emojiStoreTopicUI = this.f98092d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(emojiStoreTopicUI.f97842J) || com.tencent.mm.sdk.platformtools.t8.K0(emojiStoreTopicUI.K)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreTopicUI", "name or url is null.");
        } else {
            emojiStoreTopicUI.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) emojiStoreTopicUI.getContext(), 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.emoji.ui.o3(emojiStoreTopicUI);
            k0Var.f211881s = new com.tencent.mm.plugin.emoji.ui.p3(emojiStoreTopicUI);
            k0Var.v();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 1, 0, "", java.lang.Integer.valueOf(emojiStoreTopicUI.I));
        }
        return true;
    }
}
