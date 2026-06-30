package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class lm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm f185467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f185469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185470g;

    public lm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm wmVar, in5.s0 s0Var, r45.c32 c32Var, java.lang.String str) {
        this.f185467d = wmVar;
        this.f185468e = s0Var;
        this.f185469f = c32Var;
        this.f185470g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.fw4 fw4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNextLiveContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f185470g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm wmVar = this.f185467d;
        wmVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        r45.c32 c32Var = this.f185469f;
        h0Var.f391656d = c32Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        boolean m75933x41a8a7f2 = (c32Var == null || (fw4Var = (r45.fw4) c32Var.m75936x14adae67(1)) == null) ? false : fw4Var.m75933x41a8a7f2(2);
        c0Var.f391645d = m75933x41a8a7f2;
        in5.s0 s0Var = this.f185468e;
        if (m75933x41a8a7f2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(s0Var.f374654e, 1, true);
            k0Var.X1 = true;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tm(s0Var);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.um(c0Var, str, s0Var, h0Var, wmVar);
            k0Var.v();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm.o(c0Var, str, s0Var, h0Var, wmVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNextLiveContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
