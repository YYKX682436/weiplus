package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class i3 implements vl5.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiSortFragment f98062a;

    public i3(com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment) {
        this.f98062a = emojiSortFragment;
    }

    @Override // vl5.s
    public void remove(int i17) {
        i12.k kVar = this.f98062a.f97829d;
        kVar.remove((m22.i) kVar.getItem(i17));
    }
}
