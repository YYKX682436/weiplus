package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f98207e;

    public u1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f98206d = emojiEditorActivity;
        this.f98207e = weImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f98206d;
        emojiEditorActivity.a7().setSquared(!emojiEditorActivity.a7().f97453e);
        this.f98207e.setIconColor(emojiEditorActivity.a7().f97453e ? emojiEditorActivity.getResources().getColor(com.tencent.mm.R.color.aaq) : -1);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
