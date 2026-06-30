package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class p4 implements in5.x, in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f236043d;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var) {
        this.f236043d = s4Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vr3.b0 b0Var = (vr3.b0) holder.f374658i;
        r45.mm mmVar = b0Var.f521156d;
        int i18 = mmVar.f462169e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var = this.f236043d;
        if (i18 == 0) {
            s4Var.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) s4Var.f236086e, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f3(b0Var);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.g3(s4Var, b0Var, i17);
            k0Var.v();
        } else if (i18 == 1 || i18 == 2 || i18 == 5 || i18 == 6) {
            s4Var.v(mmVar, i17, -1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactWidgetTabBizHeaderView", "illegal service type(" + b0Var.f521156d.f462169e + "), ignore.");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = s4Var.f236088f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z3Var);
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = s4Var.f236084d;
        gr3.e.d(d17, 1100, m0Var.D, s4Var.f236086e.getIntent(), m0Var.L, m0Var.f236000v, 0, null, null, null, 0, 0, 4032, null);
    }
}
