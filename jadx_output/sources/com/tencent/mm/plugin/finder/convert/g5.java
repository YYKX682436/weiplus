package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f103456g;

    public g5(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.q6 q6Var, android.view.View view, com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f103453d = s0Var;
        this.f103454e = q6Var;
        this.f103455f = view;
        this.f103456g = finderCollapsibleTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f103453d;
        so2.z0 z0Var = (so2.z0) s0Var.f293125i;
        if (z0Var != null && z0Var.F) {
            com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f103454e;
            if (q6Var.f104342g) {
                q6Var.C(s0Var, z0Var);
                android.view.View commentHeaderLayout = this.f103455f;
                kotlin.jvm.internal.o.f(commentHeaderLayout, "$commentHeaderLayout");
                long j17 = z0Var.E.field_id;
                q6Var.getClass();
                com.tencent.mm.plugin.finder.report.d2.k(com.tencent.mm.plugin.finder.report.d2.f124994a, commentHeaderLayout, "desc_expand_collapse", "view_clk", false, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(j17)), new jz5.l("is_expand", 0)), null, 40, null);
            } else {
                this.f103456g.i();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
