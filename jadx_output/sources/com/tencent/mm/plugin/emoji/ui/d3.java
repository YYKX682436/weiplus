package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes11.dex */
public class d3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiSortFragment f97929d;

    public d3(com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment) {
        this.f97929d = emojiSortFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment = this.f97929d;
        if (emojiSortFragment.getActivity() != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sortRet", -1);
            emojiSortFragment.getActivity().setResult(0, intent);
        }
        emojiSortFragment.finish();
        return true;
    }
}
