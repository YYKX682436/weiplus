package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes3.dex */
public final class w4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v4 f98534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.x4 f98535e;

    public w4(com.tencent.mm.plugin.emoji.ui.v4 v4Var, com.tencent.mm.plugin.emoji.ui.x4 x4Var) {
        this.f98534d = v4Var;
        this.f98535e = x4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f98534d.getAdapterPosition();
        com.tencent.mm.plugin.emoji.ui.x4 x4Var = this.f98535e;
        if (adapterPosition == ((java.lang.Number) x4Var.f98557d.invoke()).intValue()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            x4Var.f98558e.invoke(java.lang.Integer.valueOf(adapterPosition));
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
