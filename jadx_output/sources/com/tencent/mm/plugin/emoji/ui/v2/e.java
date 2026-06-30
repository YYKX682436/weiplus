package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes4.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment f98357d;

    public e(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment) {
        this.f98357d = emojiStoreV2BaseFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this.f98357d.thisActivity(), com.tencent.mm.plugin.emoji.ui.EmojiMineUI.class);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = this.f98357d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(emojiStoreV2BaseFragment, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiStoreV2BaseFragment.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(emojiStoreV2BaseFragment, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }
}
