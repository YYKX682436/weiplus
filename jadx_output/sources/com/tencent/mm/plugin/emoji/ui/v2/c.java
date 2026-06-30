package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes14.dex */
public class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment f98353d;

    public c(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment) {
        this.f98353d = emojiStoreV2BaseFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f98353d.thisActivity().finish();
        return false;
    }
}
