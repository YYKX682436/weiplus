package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class e3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiSortFragment f97953d;

    public e3(com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment) {
        this.f97953d = emojiSortFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment = this.f97953d;
        if (!isConnected) {
            int i17 = com.tencent.mm.plugin.emoji.ui.EmojiSortFragment.f97828q;
            db5.e1.y(emojiSortFragment.getContext(), emojiSortFragment.getString(com.tencent.mm.R.string.bya), "", emojiSortFragment.getString(com.tencent.mm.R.string.by_), new com.tencent.mm.plugin.emoji.ui.k3(emojiSortFragment));
            return true;
        }
        emojiSortFragment.f97835m = db5.e1.Q(emojiSortFragment.getContext(), emojiSortFragment.getString(com.tencent.mm.R.string.f490573yv), emojiSortFragment.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.emoji.ui.f3(emojiSortFragment));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = emojiSortFragment.f97831f.e().iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next()).field_productID);
        }
        emojiSortFragment.f97832g = new z12.z(arrayList, 2);
        gm0.j1.n().f273288b.g(emojiSortFragment.f97832g);
        return true;
    }
}
