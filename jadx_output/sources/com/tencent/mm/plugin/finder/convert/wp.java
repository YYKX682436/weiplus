package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class wp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.pd f104894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.xp f104895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104897g;

    public wp(dm.pd pdVar, com.tencent.mm.plugin.finder.convert.xp xpVar, android.widget.TextView textView, in5.s0 s0Var) {
        this.f104894d = pdVar;
        this.f104895e = xpVar;
        this.f104896f = textView;
        this.f104897g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgFollowApplyConvert$setAccept$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        dm.pd mention = this.f104894d;
        java.lang.String field_username = mention.field_username;
        kotlin.jvm.internal.o.f(field_username, "field_username");
        o3Var.xk(field_username, 1, c01.id.e());
        com.tencent.mm.plugin.finder.convert.xp xpVar = this.f104895e;
        android.widget.TextView textView = this.f104896f;
        in5.s0 s0Var = this.f104897g;
        xpVar.C(textView, s0Var);
        java.util.Vector vector = cu2.c0.f222378a;
        kotlin.jvm.internal.o.g(mention, "mention");
        cu2.c0.f222378a.add(java.lang.Long.valueOf(mention.field_id));
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.convert.up upVar = new com.tencent.mm.plugin.finder.convert.up(mention, xpVar);
        com.tencent.mm.plugin.finder.convert.vp vpVar = new com.tencent.mm.plugin.finder.convert.vp(mention, xpVar);
        kotlin.jvm.internal.o.g(mention, "mention");
        new bq.z(mention, 1, V6).l().q(new cq.c0(upVar, vpVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowApplyConvert$setAccept$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
