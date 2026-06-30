package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes8.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.u4 f98171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gr.a0 f98172e;

    public q4(com.tencent.mm.plugin.emoji.ui.u4 u4Var, gr.a0 a0Var) {
        this.f98171d = u4Var;
        this.f98172e = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f98171d.f98216n.invoke(this.f98172e);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
