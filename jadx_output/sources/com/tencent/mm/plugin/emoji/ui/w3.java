package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView f98533d;

    public w3(com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView emoticonCustomCreateResultView) {
        this.f98533d = emoticonCustomCreateResultView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateResultView$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView emoticonCustomCreateResultView = this.f98533d;
        if (emoticonCustomCreateResultView.f97867o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateResultView", "failed to send emojiInfo since it's null");
        } else {
            new lb5.a().n(emoticonCustomCreateResultView.f97859d);
            com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
            androidx.appcompat.app.AppCompatActivity context = emoticonCustomCreateResultView.getContext();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = emoticonCustomCreateResultView.f97867o;
            ((com.tencent.mm.feature.emoji.b0) s5Var).hj(context, emojiInfo != null ? emojiInfo.getMd5() : null, emoticonCustomCreateResultView.f97867o);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateResultView$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
