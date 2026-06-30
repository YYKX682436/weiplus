package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes8.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98082d;

    public l1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98082d = emojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98082d;
        emojiEditorActivity.setResult(0);
        emojiEditorActivity.finish();
        emojiEditorActivity.f97774y = 3L;
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
