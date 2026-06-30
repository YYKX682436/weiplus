package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        super(0);
        this.f97892d = emojiEditorActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f97892d;
        if (emojiEditorActivity.f97759g != l12.a.f314982g) {
            return emojiEditorActivity.b7().getVisibleBounds();
        }
        android.graphics.Rect fitBoundsRect = emojiEditorActivity.b7().getFitBoundsRect();
        return fitBoundsRect == null ? emojiEditorActivity.b7().getInvisibleBounds() : fitBoundsRect;
    }
}
