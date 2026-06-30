package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98068d;

    public j1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98068d = emojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98068d;
        emojiEditorActivity.b7().setFitBounds(null);
        emojiEditorActivity.n7(l12.a.f314981f);
        android.graphics.Rect b17 = emojiEditorActivity.a7().b();
        emojiEditorActivity.b7().setVideoClipBounds(b17);
        emojiEditorActivity.d7().e(emojiEditorActivity.b7().getInvisibleBounds());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "video clip bounds: " + b17);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
