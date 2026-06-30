package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class w1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98531d;

    public w1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98531d = emojiEditorActivity;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.util.Size size = (android.util.Size) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "size changed: " + size);
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98531d;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = emojiEditorActivity.a7();
        int width = size.getWidth();
        int height = size.getHeight();
        a76.f97454f = width;
        a76.f97455g = height;
        a76.invalidate();
        emojiEditorActivity.b7().a(size.getWidth(), size.getHeight());
        return jz5.f0.f302826a;
    }
}
