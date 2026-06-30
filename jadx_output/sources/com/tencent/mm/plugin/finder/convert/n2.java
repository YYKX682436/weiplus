package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes15.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ri0 f104067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q2 f104068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104069g;

    public n2(in5.s0 s0Var, r45.ri0 ri0Var, com.tencent.mm.plugin.finder.convert.q2 q2Var, java.lang.String str) {
        this.f104066d = s0Var;
        this.f104067e = ri0Var;
        this.f104068f = q2Var;
        this.f104069g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderEmojiForAllConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).ij(this.f104066d.f293121e, this.f104067e, this.f104068f.f104308f, 56, this.f104069g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderEmojiForAllConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
