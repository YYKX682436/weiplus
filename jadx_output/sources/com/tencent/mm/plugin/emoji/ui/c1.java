package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class c1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f97913b;

    public c1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, android.graphics.Rect rect) {
        this.f97912a = emojiEditorActivity;
        this.f97913b = rect;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiEditorActivity", "openLiteApp fail");
        this.f97912a.setResult(0);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "openLiteApp success");
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f97912a;
        emojiEditorActivity.b7().setVideoClipBounds(this.f97913b);
        emojiEditorActivity.setResult(-1, emojiEditorActivity.getIntent());
    }
}
