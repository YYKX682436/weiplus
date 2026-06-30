package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98065d;

    public i5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        this.f98065d = multiEmojiEditorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98065d;
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(multiEmojiEditorActivity.f97883J, multiEmojiEditorActivity.K);
        if (g2Var == null) {
            return;
        }
        multiEmojiEditorActivity.u7();
        if (!g2Var.f98032d.isEmpty()) {
            multiEmojiEditorActivity.d7().d();
            for (o12.u uVar : g2Var.f98032d) {
                if (uVar.f342188f.isEmpty()) {
                    uVar.f342188f.set(multiEmojiEditorActivity.b7().getInvisibleBounds());
                }
                multiEmojiEditorActivity.d7().a(uVar);
            }
            android.graphics.Rect rect = g2Var.f98031c;
            int width = rect != null ? rect.width() : ((android.graphics.Rect) multiEmojiEditorActivity.d7().getGetRenderingBounds().invoke()).width();
            android.graphics.Rect rect2 = g2Var.f98031c;
            bitmap = com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer.c(multiEmojiEditorActivity.d7(), width, rect2 != null ? rect2.height() : ((android.graphics.Rect) multiEmojiEditorActivity.d7().getGetRenderingBounds().invoke()).height(), null, 4, null);
            multiEmojiEditorActivity.d7().d();
            multiEmojiEditorActivity.t7();
        } else {
            bitmap = null;
        }
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity2 = this.f98065d;
        kotlinx.coroutines.l.d(multiEmojiEditorActivity2.E, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.emoji.ui.h5(multiEmojiEditorActivity2, g2Var, bitmap, multiEmojiEditorActivity2.K, null), 2, null);
        multiEmojiEditorActivity.N = false;
    }
}
