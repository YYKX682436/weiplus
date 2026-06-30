package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f97923d;

    public d0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f97923d = emojiCustomUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f97923d;
        if (emojiCustomUI.f97710r.ordinal() == 0) {
            db5.e1.A(emojiCustomUI.getContext(), emojiCustomUI.getResources().getString(com.tencent.mm.R.string.c08), "", emojiCustomUI.getResources().getString(com.tencent.mm.R.string.f491120c06), emojiCustomUI.getResources().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.emoji.ui.b0(emojiCustomUI), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
