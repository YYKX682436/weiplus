package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class r5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98181d;

    public r5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        this.f98181d = multiEmojiEditorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preview_deselector_button: currentIndex=");
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98181d;
        sb6.append(multiEmojiEditorActivity.K);
        sb6.append(", mediaList size before=");
        sb6.append(((java.util.ArrayList) multiEmojiEditorActivity.f97883J).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
        boolean z17 = true;
        if (((java.util.ArrayList) multiEmojiEditorActivity.f97883J).size() <= 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = multiEmojiEditorActivity.K;
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity.p7(multiEmojiEditorActivity, i17 >= ((java.util.ArrayList) multiEmojiEditorActivity.f97883J).size() - 1 ? 0 : i17 + 1);
        ((java.util.ArrayList) multiEmojiEditorActivity.f97883J).remove(i17);
        java.util.List list = multiEmojiEditorActivity.L;
        if (list == null) {
            kotlin.jvm.internal.o.o("reportDataList");
            throw null;
        }
        list.remove(i17);
        int i18 = multiEmojiEditorActivity.K;
        if (i18 > i17) {
            multiEmojiEditorActivity.K = i18 - 1;
        }
        com.tencent.mm.plugin.emoji.ui.x4 x4Var = multiEmojiEditorActivity.G;
        if (x4Var != null) {
            x4Var.f98559f = kz5.n0.S0(multiEmojiEditorActivity.f97883J);
            x4Var.notifyItemRemoved(i17);
            if (multiEmojiEditorActivity.K != i17) {
                x4Var.notifyItemChanged(i17);
                x4Var.notifyItemChanged(multiEmojiEditorActivity.K);
            }
        }
        if (((java.util.ArrayList) multiEmojiEditorActivity.f97883J).size() == 1 && (weImageView = multiEmojiEditorActivity.H) != null) {
            weImageView.setVisibility(8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = multiEmojiEditorActivity.F;
        if (recyclerView != null) {
            recyclerView.post(new com.tencent.mm.plugin.emoji.ui.q5(multiEmojiEditorActivity));
        }
        java.lang.String str = multiEmojiEditorActivity.Q;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            or.d.c(str, 6, multiEmojiEditorActivity.s7(), 0, 0, or.c.c("cancel_selection_button", str, java.lang.Integer.valueOf(((java.util.ArrayList) multiEmojiEditorActivity.f97883J).size()), or.c.d(multiEmojiEditorActivity.r7()), null, 16, null), 16, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
