package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiSortUI f98084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.emoji.ui.EmojiSortUI emojiSortUI) {
        super(0);
        this.f98084d = emojiSortUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emoji.ui.EmojiSortUI emojiSortUI = this.f98084d;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(emojiSortUI);
        frameLayout.setId(emojiSortUI.f97840d);
        return frameLayout;
    }
}
