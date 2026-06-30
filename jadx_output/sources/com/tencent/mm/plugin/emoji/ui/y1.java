package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        super(1);
        this.f98563d = emojiEditorActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Rect it = (android.graphics.Rect) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f98563d.b7().setFitBounds(it);
        return jz5.f0.f302826a;
    }
}
