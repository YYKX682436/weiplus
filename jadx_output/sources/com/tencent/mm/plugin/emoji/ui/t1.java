package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f98193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f98194e;

    public t1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f98193d = emojiEditorActivity;
        this.f98194e = weImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = this.f98193d.a7();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "clear states");
        a76.setSquared(false);
        a76.e();
        a76.c();
        android.animation.ValueAnimator valueAnimator = a76.f97470y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o12.m mVar = new o12.m(a76);
        a76.f97470y = n22.p.a(a76.f97456h, a76.f97457i, 300L, mVar);
        this.f98194e.setIconColor(-1);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
