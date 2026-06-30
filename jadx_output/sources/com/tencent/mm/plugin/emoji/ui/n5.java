package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98102d;

    public n5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        this.f98102d = multiEmojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98102d;
        multiEmojiEditorActivity.b7().setFitBounds(null);
        multiEmojiEditorActivity.n7(l12.a.f314981f);
        android.graphics.Rect b17 = multiEmojiEditorActivity.a7().b();
        multiEmojiEditorActivity.b7().setVideoClipBounds(b17);
        multiEmojiEditorActivity.d7().e(multiEmojiEditorActivity.b7().getInvisibleBounds());
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) kz5.n0.a0(multiEmojiEditorActivity.f97883J, multiEmojiEditorActivity.K);
        if (g2Var != null) {
            g2Var.f98031c = b17;
            new android.graphics.Rect(multiEmojiEditorActivity.a7().getF97456h());
        }
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity.o7(multiEmojiEditorActivity);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
