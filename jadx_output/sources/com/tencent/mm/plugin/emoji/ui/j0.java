package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class j0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98067c;

    public j0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f98067c = emojiCustomUI;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        return this.f98067c.f97700f.getItemViewType(i17) == 8 ? 5 : 1;
    }
}
