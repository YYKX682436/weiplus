package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class d7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f103131g;

    public d7(in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, com.tencent.mm.plugin.finder.convert.s7 s7Var) {
        this.f103128d = s0Var;
        this.f103129e = str;
        this.f103130f = y0Var;
        this.f103131g = s7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        in5.s0 s0Var = this.f103128d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String str = this.f103129e;
        so2.y0 y0Var = this.f103130f;
        com.tencent.mm.plugin.finder.convert.s7 s7Var = this.f103131g;
        i0Var.ql(context, str, y0Var, s7Var.f104528e.a0(), s7Var.f104528e.k0());
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Gk(context2, this.f103130f.f410703d.field_feedId, (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 2, (r18 & 32) != 0 ? false : true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
