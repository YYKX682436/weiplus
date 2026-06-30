package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class l5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98087d;

    public l5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        this.f98087d = multiEmojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.graphics.Rect rect;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98087d;
        multiEmojiEditorActivity.B.f55971l++;
        multiEmojiEditorActivity.n7(l12.a.f314982g);
        multiEmojiEditorActivity.Z6().setAlpha(0.0f);
        multiEmojiEditorActivity.Z6().animate().setStartDelay(300L).alpha(1.0f).setDuration(300L).start();
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(multiEmojiEditorActivity.f97883J, multiEmojiEditorActivity.K);
        multiEmojiEditorActivity.b7().setVideoClipBounds(null);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = multiEmojiEditorActivity.a7();
        a76.f97456h.setEmpty();
        a76.invalidate();
        if ((g2Var != null && g2Var.f98034f) && g2Var.f98031c == null) {
            com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a77 = multiEmojiEditorActivity.a7();
            android.graphics.Rect rect2 = a77.f97456h;
            boolean isEmpty = rect2.isEmpty();
            android.graphics.Rect rect3 = a77.f97457i;
            if (isEmpty) {
                a77.e();
                rect2.set(rect3.centerX() - (rect3.width() / 2), rect3.centerY() - (rect3.height() / 2), rect3.centerX() + (rect3.width() / 2), rect3.centerY() + (rect3.height() / 2));
                a77.c();
            } else {
                a77.c();
            }
            a77.invalidate();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "resetToFullSize, viewport: " + rect2 + ", surface: " + rect3);
        } else {
            multiEmojiEditorActivity.a7().d();
        }
        if (g2Var != null) {
            g2Var.f98034f = true;
        }
        if (g2Var != null && (rect = g2Var.f98031c) != null) {
            multiEmojiEditorActivity.a7().setViewportBoundsFromClip(rect);
        }
        multiEmojiEditorActivity.a7().setSquared(kotlin.jvm.internal.o.b(g2Var != null ? java.lang.Boolean.valueOf(g2Var.f98033e) : null, java.lang.Boolean.TRUE));
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a78 = multiEmojiEditorActivity.a7();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "store states");
        a78.f97459n.set(a78.f97457i);
        a78.f97458m.set(a78.f97456h);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
