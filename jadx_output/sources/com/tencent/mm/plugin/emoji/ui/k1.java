package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98076d;

    public k1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        this.f98076d = emojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l12.a aVar = l12.a.f314983h;
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98076d;
        emojiEditorActivity.n7(aVar);
        emojiEditorActivity.B.f55969j++;
        emojiEditorActivity.f97767r.a(null);
        emojiEditorActivity.d7().setEnabled(false);
        com.tencent.mm.ui.tools.f5 f5Var = emojiEditorActivity.f97760h;
        if (f5Var == null) {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
        f5Var.f();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
