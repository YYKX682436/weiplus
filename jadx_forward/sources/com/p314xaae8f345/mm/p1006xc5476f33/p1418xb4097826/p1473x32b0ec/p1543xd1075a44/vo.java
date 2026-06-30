package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp f201610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f201611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f201612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f201613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, int i17, r45.xn1 xn1Var) {
        super(1);
        this.f201610d = hpVar;
        this.f201611e = c0Var;
        this.f201612f = i17;
        this.f201613g = xn1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = this.f201610d;
        android.view.View view = hpVar.H1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$handleWxFinderDetail$1", "invoke", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$handleWxFinderDetail$1", "invoke", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17 c14412x91d09c17 = hpVar.J1;
        if (c14412x91d09c17 != null) {
            c14412x91d09c17.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17 c14412x91d09c172 = hpVar.J1;
        r45.xn1 xn1Var = this.f201613g;
        int i17 = this.f201612f;
        if (c14412x91d09c172 != null) {
            c14412x91d09c172.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uo(hpVar, str, i17, xn1Var));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f201611e;
        if (!c0Var.f391645d) {
            hpVar.u0(hpVar.j0(i17), java.lang.Integer.valueOf(xn1Var.m75939xb282bd08(7)), 1);
            hpVar.t0(1, hpVar.j0(i17), java.lang.Integer.valueOf(xn1Var.m75939xb282bd08(7)), null);
            c0Var.f391645d = true;
        }
        return jz5.f0.f384359a;
    }
}
