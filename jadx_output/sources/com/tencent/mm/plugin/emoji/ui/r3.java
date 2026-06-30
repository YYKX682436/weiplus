package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader f98180d;

    public r3(com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader) {
        this.f98180d = emojiStoreVpHeader;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.f97843q;
        com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader = this.f98180d;
        androidx.viewpager.widget.ViewPager viewPager = emojiStoreVpHeader.f97845e;
        if (viewPager == null) {
            return;
        }
        viewPager.setCurrentItem(emojiStoreVpHeader.f97847g.size() * 30, false);
    }
}
