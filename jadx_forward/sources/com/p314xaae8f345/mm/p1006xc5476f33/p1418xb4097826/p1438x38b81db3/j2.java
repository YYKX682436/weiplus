package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vd0 f185244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l2 f185245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m2 f185246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185247g;

    public j2(r45.vd0 vd0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m2 m2Var, int i17) {
        this.f185244d = vd0Var;
        this.f185245e = l2Var;
        this.f185246f = m2Var;
        this.f185247g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$3$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk.a0 a0Var = new qk.a0(this.f185244d);
        a0Var.f445688a = 57;
        java.lang.String str = this.f185245e.f185415d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        a0Var.f445665h = str;
        a0Var.f445666i = 60;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m2 m2Var = this.f185246f;
        a0Var.f445664g = m2Var.f185496e;
        java.util.ArrayList arrayList2 = m2Var.f185498g;
        int i17 = this.f185247g;
        java.lang.Object obj = arrayList2.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        m2Var.o((r45.vd0) obj, i17 + 1, "view_clk");
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderEmojiDesignerIPSetListConvert", "unable to get emoticon liteapp feature service");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(view.getContext(), a0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$3$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
