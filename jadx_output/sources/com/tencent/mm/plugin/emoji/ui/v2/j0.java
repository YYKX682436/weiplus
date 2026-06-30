package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes11.dex */
public class j0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f98367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI f98368e;

    public j0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI, boolean z17) {
        this.f98368e = emojiStoreV2UI;
        this.f98367d = z17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17 = this.f98367d;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI = this.f98368e;
        if (z17) {
            d22.w wVar = new d22.w();
            wVar.f225877j = 0;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var != null) {
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(emojiStoreV2UI, wVar);
                return false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStoreV2UI", "emoticon liteapp service not found");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(java.lang.String.valueOf(10931), 1);
        intent.setClass(emojiStoreV2UI, com.tencent.mm.plugin.emoji.ui.EmojiMineUI.class);
        intent.putExtra("from_store", true);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI2 = this.f98368e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(emojiStoreV2UI2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreV2UI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(emojiStoreV2UI2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
        Di.a(44);
        Di.q("stickernavright");
        return false;
    }
}
