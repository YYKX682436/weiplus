package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiFinderPreviewUI f98061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.emoji.ui.EmojiFinderPreviewUI emojiFinderPreviewUI) {
        super(3);
        this.f98061d = emojiFinderPreviewUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.tencent.mars.xlog.Log.i("EmojiFinderPreviewUI", "onFirstFrameAvailable");
        android.widget.ImageView imageView = this.f98061d.f97778f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
