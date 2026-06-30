package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes15.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n0 f104583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u2 f104584f;

    public t2(in5.s0 s0Var, so2.n0 n0Var, com.tencent.mm.plugin.finder.convert.u2 u2Var) {
        this.f104582d = s0Var;
        this.f104583e = n0Var;
        this.f104584f = u2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderEmojiSingleConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
        android.content.Context context = this.f104582d.f293121e;
        r45.ri0 ri0Var = this.f104583e.f410489d;
        com.tencent.mm.plugin.finder.convert.u2 u2Var = this.f104584f;
        ((com.tencent.mm.feature.emoji.b0) s5Var).ij(context, ri0Var, u2Var.f104664e, u2Var.f104665f, u2Var.f104666g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderEmojiSingleConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
