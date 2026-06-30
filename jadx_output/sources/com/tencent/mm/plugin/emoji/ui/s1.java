package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98184d;

    public s1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98184d = emojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity.D;
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98184d;
        emojiEditorActivity.b7().setFitBounds(null);
        emojiEditorActivity.n7(l12.a.f314981f);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = emojiEditorActivity.a7();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "restore states");
        a76.f97457i.set(a76.f97459n);
        a76.f97456h.set(a76.f97458m);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
