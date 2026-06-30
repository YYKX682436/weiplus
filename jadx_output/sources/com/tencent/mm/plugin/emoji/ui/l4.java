package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.p4 f98085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ri0 f98086e;

    public l4(com.tencent.mm.plugin.emoji.ui.p4 p4Var, r45.ri0 ri0Var) {
        this.f98085d = p4Var;
        this.f98086e = ri0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder$bind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
        com.tencent.mm.plugin.emoji.ui.p4 p4Var = this.f98085d;
        ((com.tencent.mm.feature.emoji.b0) s5Var).ij(p4Var.f98122e, this.f98086e, "", p4Var.f98124g, p4Var.f98129o);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder$bind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
