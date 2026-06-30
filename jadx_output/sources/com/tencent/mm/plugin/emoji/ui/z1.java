package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        super(0);
        this.f98571d = emojiEditorActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98571d;
        float fitBoundsScaleX = emojiEditorActivity.b7().getFitBoundsScaleX();
        float fitBoundsScaleY = emojiEditorActivity.b7().getFitBoundsScaleY();
        android.graphics.Rect fitBoundsRect = emojiEditorActivity.b7().getFitBoundsRect();
        boolean z17 = true;
        if (fitBoundsScaleX == 1.0f) {
            if (fitBoundsScaleY == 1.0f) {
                z17 = false;
            }
        }
        if (!z17 || fitBoundsRect == null) {
            emojiEditorActivity.d7().setScaleX(1.0f);
            emojiEditorActivity.d7().setScaleY(1.0f);
            emojiEditorActivity.d7().setPivotX(emojiEditorActivity.d7().getWidth() / 2.0f);
            emojiEditorActivity.d7().setPivotY(emojiEditorActivity.d7().getHeight() / 2.0f);
        } else {
            emojiEditorActivity.d7().setScaleX(fitBoundsScaleX);
            emojiEditorActivity.d7().setScaleY(fitBoundsScaleY);
            emojiEditorActivity.d7().setPivotX(fitBoundsRect.centerX());
            emojiEditorActivity.d7().setPivotY(fitBoundsRect.centerY());
        }
        return jz5.f0.f302826a;
    }
}
