package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes11.dex */
public final class n2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment f98099d;

    public n2(com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment emojiMineListFragment) {
        this.f98099d = emojiMineListFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.emoji.ui.EmojiSortUI.f97839f;
        com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment emojiMineListFragment = this.f98099d;
        android.content.Context requireContext = emojiMineListFragment.requireContext();
        kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
        java.lang.String str = emojiMineListFragment.f97789e;
        if (str == null) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(requireContext, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmojiSortUI.class);
        intent.putExtra("type", "type_sort_ip_set");
        intent.putExtra("ip_set_key", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(requireContext, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpSort", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        requireContext.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(requireContext, "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpSort", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
