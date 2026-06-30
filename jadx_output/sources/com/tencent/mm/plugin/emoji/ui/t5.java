package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class t5 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98201d;

    public t5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        this.f98201d = multiEmojiEditorActivity;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.util.Size size = (android.util.Size) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "size changed: " + size);
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98201d;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = multiEmojiEditorActivity.a7();
        int width = size.getWidth();
        int height = size.getHeight();
        a76.f97454f = width;
        a76.f97455g = height;
        a76.invalidate();
        multiEmojiEditorActivity.b7().a(size.getWidth(), size.getHeight());
        return jz5.f0.f302826a;
    }
}
