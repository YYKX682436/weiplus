package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class g3 implements vl5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiSortFragment f98039a;

    public g3(com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment) {
        this.f98039a = emojiSortFragment;
    }

    @Override // vl5.o
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment = this.f98039a;
        m22.i iVar = (m22.i) emojiSortFragment.f97829d.getItem(i17);
        emojiSortFragment.f97831f.onMove(i17, i18);
        emojiSortFragment.f97829d.remove(iVar);
        emojiSortFragment.f97829d.insert(iVar, i18);
        emojiSortFragment.f97834i = -1;
    }
}
