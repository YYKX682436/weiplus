package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ds implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.gs f103173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.t4 f103175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f103177h;

    public ds(com.tencent.mm.plugin.finder.convert.gs gsVar, in5.s0 s0Var, so2.t4 t4Var, android.view.View view, kotlin.jvm.internal.h0 h0Var) {
        this.f103173d = gsVar;
        this.f103174e = s0Var;
        this.f103175f = t4Var;
        this.f103176g = view;
        this.f103177h = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.gs gsVar = this.f103173d;
        in5.s0 s0Var = this.f103174e;
        int n17 = com.tencent.mm.plugin.finder.convert.gs.n(gsVar, s0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("想拍按钮点击: topicId=");
        so2.t4 t4Var = this.f103175f;
        sb6.append(t4Var.f410609f);
        sb6.append(", favStatus=");
        sb6.append(n17);
        com.tencent.mars.xlog.Log.i("FinderPostPlaySquareContainerConvert", sb6.toString());
        if (n17 == 1) {
            gsVar.o(s0Var, 2);
            t4Var.f410610g = 2;
            new db2.i0(t4Var.f410609f, 1).l();
        } else if (n17 != 2) {
            android.view.View view2 = this.f103176g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            gsVar.o(s0Var, 1);
            t4Var.f410610g = 1;
            new db2.i0(t4Var.f410609f, 2).l();
        }
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d2Var.h(context, "cluster_profile_shoot", "view_clk", false, kz5.c1.m((java.util.Map) this.f103177h.f310123d, kz5.b1.e(new jz5.l("shoot_status", java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.convert.gs.n(gsVar, s0Var))))));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
