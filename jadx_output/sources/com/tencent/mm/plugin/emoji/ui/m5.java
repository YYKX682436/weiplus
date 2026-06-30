package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98095d;

    public m5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        this.f98095d = multiEmojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98095d;
        multiEmojiEditorActivity.b7().setFitBounds(null);
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(multiEmojiEditorActivity.f97883J, multiEmojiEditorActivity.K);
        multiEmojiEditorActivity.b7().setVideoClipBounds(g2Var != null ? g2Var.f98031c : null);
        multiEmojiEditorActivity.n7(l12.a.f314981f);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = multiEmojiEditorActivity.a7();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "restore states");
        a76.f97457i.set(a76.f97459n);
        a76.f97456h.set(a76.f97458m);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
