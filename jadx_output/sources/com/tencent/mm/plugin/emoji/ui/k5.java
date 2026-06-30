package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98079d;

    public k5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        this.f98079d = multiEmojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98079d;
        boolean z17 = true;
        boolean z18 = (multiEmojiEditorActivity.d7().getDecorations().isEmpty() ^ true) || multiEmojiEditorActivity.b7().getVideoClipBounds() != null;
        if (!z18) {
            java.util.Iterator it = ((java.util.ArrayList) multiEmojiEditorActivity.f97883J).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) it.next();
                if ((!g2Var.f98032d.isEmpty()) || g2Var.f98031c != null) {
                    z18 = true;
                    break;
                }
            }
        }
        java.lang.String str = multiEmojiEditorActivity.Q;
        java.lang.String d17 = or.c.d(multiEmojiEditorActivity.r7());
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        if (!(str == null || str.length() == 0)) {
            h0Var.f310123d = or.c.c("clk_edit_exit_button", str, java.lang.Integer.valueOf(((java.util.ArrayList) multiEmojiEditorActivity.f97883J).size()), d17, null, 16, null);
        }
        if (z18) {
            com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity2 = this.f98079d;
            db5.e1.A(multiEmojiEditorActivity2, "", multiEmojiEditorActivity2.getString(com.tencent.mm.R.string.ocu), multiEmojiEditorActivity.getString(com.tencent.mm.R.string.od7), multiEmojiEditorActivity.getString(com.tencent.mm.R.string.od8), new com.tencent.mm.plugin.emoji.ui.o5(str, multiEmojiEditorActivity, h0Var), com.tencent.mm.plugin.emoji.ui.p5.f98141d);
        } else {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                or.d.c(str, 3, multiEmojiEditorActivity.s7(), 0, 0, (java.lang.String) h0Var.f310123d, 16, null);
            }
            multiEmojiEditorActivity.setResult(0);
            multiEmojiEditorActivity.finish();
            multiEmojiEditorActivity.f97774y = 3L;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
