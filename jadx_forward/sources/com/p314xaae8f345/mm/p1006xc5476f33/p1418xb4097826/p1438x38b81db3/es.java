package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class es implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.t4 f184819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs f184820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184821f;

    public es(so2.t4 t4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs gsVar, in5.s0 s0Var) {
        this.f184819d = t4Var;
        this.f184820e = gsVar;
        this.f184821f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("titleContianer click: title=");
        so2.t4 t4Var = this.f184819d;
        sb6.append(t4Var.f492140d);
        sb6.append(", topicId=");
        sb6.append(t4Var.f492142f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlaySquareContainerConvert", sb6.toString());
        in5.s0 s0Var = this.f184821f;
        this.f184820e.getClass();
        try {
            android.content.Context context = s0Var.f3639x46306858.getContext();
            if (context instanceof android.app.Activity) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e.class);
                java.lang.String str = t4Var.f492140d;
                long j17 = t4Var.f492142f;
                intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str);
                intent.putExtra("sub_title", t4Var.f492141e);
                intent.putExtra("topic_id", j17);
                java.lang.String str2 = t4Var.f492145i;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlaySquareContainerConvert", "title=" + t4Var.f492140d + ", topicId=" + j17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostPlaySquareContainerConvert", "Context is not Activity, cannot start activity");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostPlaySquareContainerConvert", java.lang.String.valueOf(e17.getMessage()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
