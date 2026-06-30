package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ds implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs f184706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.t4 f184708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f184710h;

    public ds(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs gsVar, in5.s0 s0Var, so2.t4 t4Var, android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f184706d = gsVar;
        this.f184707e = s0Var;
        this.f184708f = t4Var;
        this.f184709g = view;
        this.f184710h = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs gsVar = this.f184706d;
        in5.s0 s0Var = this.f184707e;
        int n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs.n(gsVar, s0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("想拍按钮点击: topicId=");
        so2.t4 t4Var = this.f184708f;
        sb6.append(t4Var.f492142f);
        sb6.append(", favStatus=");
        sb6.append(n17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlaySquareContainerConvert", sb6.toString());
        if (n17 == 1) {
            gsVar.o(s0Var, 2);
            t4Var.f492143g = 2;
            new db2.i0(t4Var.f492142f, 1).l();
        } else if (n17 != 2) {
            android.view.View view2 = this.f184709g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            gsVar.o(s0Var, 1);
            t4Var.f492143g = 1;
            new db2.i0(t4Var.f492142f, 2).l();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        d2Var.h(context, "cluster_profile_shoot", "view_clk", false, kz5.c1.m((java.util.Map) this.f184710h.f391656d, kz5.b1.e(new jz5.l("shoot_status", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs.n(gsVar, s0Var))))));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
