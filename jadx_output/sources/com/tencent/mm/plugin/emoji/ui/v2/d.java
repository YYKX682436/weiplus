package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment f98355d;

    public d(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment) {
        this.f98355d = emojiStoreV2BaseFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = this.f98355d;
        if (!emojiStoreV2BaseFragment.isScreenEnable()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = emojiStoreV2BaseFragment.P;
        if (onMenuItemClickListener != null) {
            emojiStoreV2BaseFragment.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0);
            ((com.tencent.mm.plugin.emoji.ui.v2.c) onMenuItemClickListener).f98353d.thisActivity().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
