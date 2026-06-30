package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98178d;

    public r1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98178d = emojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98178d;
        emojiEditorActivity.B.f55971l++;
        emojiEditorActivity.n7(l12.a.f314982g);
        emojiEditorActivity.Z6().setAlpha(0.0f);
        emojiEditorActivity.Z6().animate().setStartDelay(300L).alpha(1.0f).setDuration(300L).start();
        emojiEditorActivity.b7().setVideoClipBounds(null);
        emojiEditorActivity.a7().d();
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = emojiEditorActivity.a7();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "store states");
        a76.f97459n.set(a76.f97457i);
        a76.f97458m.set(a76.f97456h);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
