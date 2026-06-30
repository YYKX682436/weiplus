package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes11.dex */
public class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiMineUI f98179d;

    public r2(com.tencent.mm.plugin.emoji.ui.EmojiMineUI emojiMineUI) {
        this.f98179d = emojiMineUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        int size = com.tencent.mm.storage.n5.f().b().k1().size();
        com.tencent.mm.plugin.emoji.ui.EmojiMineUI emojiMineUI = this.f98179d;
        if (size <= 1) {
            db5.e1.i(emojiMineUI.getContext(), com.tencent.mm.R.string.buu, com.tencent.mm.R.string.f490573yv);
            return true;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            int i17 = com.tencent.mm.plugin.emoji.ui.EmojiMineUI.f97793y;
            db5.e1.y(emojiMineUI, emojiMineUI.getString(com.tencent.mm.R.string.bya), "", emojiMineUI.getString(com.tencent.mm.R.string.by_), new com.tencent.mm.plugin.emoji.ui.t2(emojiMineUI));
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(emojiMineUI, com.tencent.mm.plugin.emoji.ui.EmojiSortUI.class);
        com.tencent.mm.plugin.emoji.ui.EmojiMineUI emojiMineUI2 = this.f98179d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(emojiMineUI2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiMineUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(emojiMineUI2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
