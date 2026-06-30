package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class v1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98225d;

    public v1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98225d = emojiEditorActivity;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f98225d.d7().g(new android.graphics.Rect(i17, i18, i19, i27));
    }
}
