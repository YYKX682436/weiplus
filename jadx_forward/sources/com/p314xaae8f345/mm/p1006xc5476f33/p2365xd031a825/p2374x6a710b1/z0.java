package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0 f262541a = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z0();

    public final boolean a() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_show_pay_entrance_switch", "0").equals("0")) {
            return false;
        }
        return !(r26.i0.p(c01.e2.s(), "CN", true) || r26.i0.p(c01.e2.s(), "HK", true));
    }

    public final boolean b() {
        return !a() || (c01.z1.i() & 2199023255552L) == 0;
    }

    public final void c(android.content.Context context, yz5.l onSwitch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSwitch, "onSwitch");
        boolean b17 = b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0, true);
        z2Var.m(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getResources().getString(b17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571889so : com.p314xaae8f345.mm.R.C30867xcad56011.mnw));
        z2Var.o(b17 ? 2 : 0);
        z2Var.v(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x0(z2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y0(b17, onSwitch, z2Var);
        z2Var.D = x0Var;
        z2Var.E = y0Var;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3n, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sze);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.szc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.b(textView);
        if (b17) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nb_);
            textView2.setVisibility(8);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nbb);
            textView2.setVisibility(0);
        }
        z2Var.j(inflate);
        z2Var.C();
    }
}
