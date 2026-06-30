package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class es implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.t4 f103286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.gs f103287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103288f;

    public es(so2.t4 t4Var, com.tencent.mm.plugin.finder.convert.gs gsVar, in5.s0 s0Var) {
        this.f103286d = t4Var;
        this.f103287e = gsVar;
        this.f103288f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("titleContianer click: title=");
        so2.t4 t4Var = this.f103286d;
        sb6.append(t4Var.f410607d);
        sb6.append(", topicId=");
        sb6.append(t4Var.f410609f);
        com.tencent.mars.xlog.Log.i("FinderPostPlaySquareContainerConvert", sb6.toString());
        in5.s0 s0Var = this.f103288f;
        this.f103287e.getClass();
        try {
            android.content.Context context = s0Var.itemView.getContext();
            if (context instanceof android.app.Activity) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI.class);
                java.lang.String str = t4Var.f410607d;
                long j17 = t4Var.f410609f;
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
                intent.putExtra("sub_title", t4Var.f410608e);
                intent.putExtra("topic_id", j17);
                java.lang.String str2 = t4Var.f410612i;
                if (str2 == null) {
                    str2 = "";
                }
                intent.putExtra("by_pass", str2);
                intent.putExtra("double_comment_scene", 382);
                intent.putExtra("single_comment_scene", 383);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mars.xlog.Log.i("FinderPostPlaySquareContainerConvert", "title=" + t4Var.f410607d + ", topicId=" + j17);
            } else {
                com.tencent.mars.xlog.Log.e("FinderPostPlaySquareContainerConvert", "Context is not Activity, cannot start activity");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderPostPlaySquareContainerConvert", java.lang.String.valueOf(e17.getMessage()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
