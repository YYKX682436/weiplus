package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98118d;

    public p1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98118d = emojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l12.a aVar = l12.a.f314981f;
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98118d;
        emojiEditorActivity.n7(aVar);
        ((android.widget.Button) emojiEditorActivity.findViewById(com.tencent.mm.R.id.ojn)).setText(emojiEditorActivity.getString(com.tencent.mm.R.string.f490441v5));
        emojiEditorActivity.f97772w = true;
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
