package hq5;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.k0 f364756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hq5.k0 k0Var) {
        super(1);
        this.f364756d = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 a17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b19;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b27;
        em.i4 U6;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22712xbbb01d43 d17;
        eq5.h state = (eq5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        eq5.e eVar = (eq5.e) state.a(eq5.e.class);
        hq5.k0 k0Var = this.f364756d;
        if (eVar != null && (U6 = k0Var.U6()) != null && (d17 = U6.d()) != null) {
            d17.m82110x3ae760af(eVar.f337444b);
        }
        eq5.i iVar = (eq5.i) state.a(eq5.i.class);
        if (iVar != null) {
            int i17 = iVar.f337455b;
            k0Var.f364773e = i17;
            em.i4 U62 = k0Var.U6();
            android.widget.TextView textView2 = null;
            android.view.View view = U62 != null ? U62.f335970a : null;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            em.i4 U63 = k0Var.U6();
            android.widget.TextView c17 = U63 != null ? U63.c() : null;
            if (c17 != null) {
                c17.setVisibility(0);
            }
            em.i4 U64 = k0Var.U6();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22712xbbb01d43 d18 = U64 != null ? U64.d() : null;
            if (d18 != null) {
                d18.setVisibility(8);
            }
            em.i4 U65 = k0Var.U6();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b28 = U65 != null ? U65.b() : null;
            if (b28 != null) {
                b28.setVisibility(8);
            }
            em.i4 U66 = k0Var.U6();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 a18 = U66 != null ? U66.a() : null;
            if (a18 != null) {
                a18.setVisibility(8);
            }
            em.i4 U67 = k0Var.U6();
            if (U67 != null) {
                if (U67.f335971b == null) {
                    U67.f335971b = (android.widget.TextView) U67.f335970a.findViewById(com.p314xaae8f345.mm.R.id.f568004uv4);
                }
                textView = U67.f335971b;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            switch (i17) {
                case 1:
                case 2:
                case 6:
                    em.i4 U68 = k0Var.U6();
                    android.view.View view2 = U68 != null ? U68.f335970a : null;
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U69 = k0Var.U6();
                    android.widget.TextView c18 = U69 != null ? U69.c() : null;
                    if (c18 != null) {
                        c18.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nys));
                        break;
                    }
                    break;
                case 3:
                case 4:
                case 11:
                case 12:
                    em.i4 U610 = k0Var.U6();
                    android.view.View view3 = U610 != null ? U610.f335970a : null;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        android.view.View view4 = view3;
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U611 = k0Var.U6();
                    android.widget.TextView c19 = U611 != null ? U611.c() : null;
                    if (c19 != null) {
                        c19.setVisibility(4);
                    }
                    em.i4 U612 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b29 = U612 != null ? U612.b() : null;
                    if (b29 != null) {
                        b29.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nr8));
                    }
                    em.i4 U613 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b37 = U613 != null ? U613.b() : null;
                    if (b37 != null) {
                        b37.setVisibility(0);
                    }
                    em.i4 U614 = k0Var.U6();
                    if (U614 != null && (b17 = U614.b()) != null) {
                        b17.setOnClickListener(new hq5.g0(k0Var));
                        break;
                    }
                    break;
                case 5:
                    em.i4 U615 = k0Var.U6();
                    android.view.View view5 = U615 != null ? U615.f335970a : null;
                    if (view5 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U616 = k0Var.U6();
                    android.widget.TextView c27 = U616 != null ? U616.c() : null;
                    if (c27 != null) {
                        c27.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nys));
                        break;
                    }
                    break;
                case 7:
                case 8:
                    em.i4 U617 = k0Var.U6();
                    android.view.View view6 = U617 != null ? U617.f335970a : null;
                    if (view6 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        android.view.View view7 = view6;
                        yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view7, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U618 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22712xbbb01d43 d19 = U618 != null ? U618.d() : null;
                    if (d19 != null) {
                        d19.setVisibility(0);
                        break;
                    }
                    break;
                case 9:
                case 10:
                    em.i4 U619 = k0Var.U6();
                    android.view.View view8 = U619 != null ? U619.f335970a : null;
                    if (view8 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                        arrayList6.add(0);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view8, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U620 = k0Var.U6();
                    android.widget.TextView c28 = U620 != null ? U620.c() : null;
                    if (c28 != null) {
                        c28.setVisibility(4);
                    }
                    em.i4 U621 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b38 = U621 != null ? U621.b() : null;
                    if (b38 != null) {
                        b38.setVisibility(0);
                    }
                    em.i4 U622 = k0Var.U6();
                    if (U622 != null && (b18 = U622.b()) != null) {
                        b18.setOnClickListener(new hq5.i0(k0Var));
                    }
                    em.i4 U623 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b39 = U623 != null ? U623.b() : null;
                    if (b39 != null) {
                        b39.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsl));
                        break;
                    }
                    break;
                case 13:
                    em.i4 U624 = k0Var.U6();
                    android.view.View view9 = U624 != null ? U624.f335970a : null;
                    if (view9 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        android.view.View view10 = view9;
                        yj0.a.d(view10, arrayList7.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(view10, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U625 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 a19 = U625 != null ? U625.a() : null;
                    if (a19 != null) {
                        a19.setVisibility(0);
                    }
                    em.i4 U626 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 a27 = U626 != null ? U626.a() : null;
                    if (a27 != null) {
                        a27.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntv));
                    }
                    em.i4 U627 = k0Var.U6();
                    if (U627 != null && (a17 = U627.a()) != null) {
                        a17.setOnClickListener(new hq5.f0(k0Var));
                    }
                    em.i4 U628 = k0Var.U6();
                    android.widget.TextView c29 = U628 != null ? U628.c() : null;
                    if (c29 != null) {
                        c29.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7));
                        break;
                    }
                    break;
                case 14:
                    em.i4 U629 = k0Var.U6();
                    android.view.View view11 = U629 != null ? U629.f335970a : null;
                    if (view11 != null) {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                        arrayList8.add(0);
                        java.util.Collections.reverse(arrayList8);
                        android.view.View view12 = view11;
                        yj0.a.d(view12, arrayList8.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view11.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(view12, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U630 = k0Var.U6();
                    android.widget.TextView c37 = U630 != null ? U630.c() : null;
                    if (c37 != null) {
                        c37.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nr8));
                        break;
                    }
                    break;
                case 15:
                    em.i4 U631 = k0Var.U6();
                    android.view.View view13 = U631 != null ? U631.f335970a : null;
                    if (view13 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                        arrayList9.add(0);
                        java.util.Collections.reverse(arrayList9);
                        android.view.View view14 = view13;
                        yj0.a.d(view14, arrayList9.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(view14, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U632 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22712xbbb01d43 d27 = U632 != null ? U632.d() : null;
                    if (d27 != null) {
                        d27.setVisibility(8);
                    }
                    em.i4 U633 = k0Var.U6();
                    android.widget.TextView c38 = U633 != null ? U633.c() : null;
                    if (c38 != null) {
                        c38.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nys));
                    }
                    em.i4 U634 = k0Var.U6();
                    if (U634 != null) {
                        if (U634.f335971b == null) {
                            U634.f335971b = (android.widget.TextView) U634.f335970a.findViewById(com.p314xaae8f345.mm.R.id.f568004uv4);
                        }
                        textView2 = U634.f335971b;
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        break;
                    }
                    break;
                case 16:
                    em.i4 U635 = k0Var.U6();
                    android.view.View view15 = U635 != null ? U635.f335970a : null;
                    if (view15 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                        arrayList10.add(0);
                        java.util.Collections.reverse(arrayList10);
                        android.view.View view16 = view15;
                        yj0.a.d(view16, arrayList10.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view15.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(view16, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U636 = k0Var.U6();
                    android.widget.TextView c39 = U636 != null ? U636.c() : null;
                    if (c39 != null) {
                        c39.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nr8));
                    }
                    em.i4 U637 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b47 = U637 != null ? U637.b() : null;
                    if (b47 != null) {
                        b47.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxx));
                    }
                    em.i4 U638 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b48 = U638 != null ? U638.b() : null;
                    if (b48 != null) {
                        b48.setVisibility(0);
                    }
                    em.i4 U639 = k0Var.U6();
                    if (U639 != null && (b19 = U639.b()) != null) {
                        b19.setOnClickListener(new hq5.h0(k0Var));
                        break;
                    }
                    break;
                case 17:
                    em.i4 U640 = k0Var.U6();
                    android.view.View view17 = U640 != null ? U640.f335970a : null;
                    if (view17 != null) {
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
                        arrayList11.add(0);
                        java.util.Collections.reverse(arrayList11);
                        android.view.View view18 = view17;
                        yj0.a.d(view18, arrayList11.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view17.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                        yj0.a.f(view18, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC", "onStateChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    em.i4 U641 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b49 = U641 != null ? U641.b() : null;
                    if (b49 != null) {
                        b49.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nmr));
                    }
                    em.i4 U642 = k0Var.U6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 b57 = U642 != null ? U642.b() : null;
                    if (b57 != null) {
                        b57.setVisibility(0);
                    }
                    em.i4 U643 = k0Var.U6();
                    if (U643 != null && (b27 = U643.b()) != null) {
                        b27.setOnClickListener(new hq5.j0(k0Var));
                    }
                    em.i4 U644 = k0Var.U6();
                    android.widget.TextView c47 = U644 != null ? U644.c() : null;
                    if (c47 != null) {
                        c47.setText(k0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nr8));
                        break;
                    }
                    break;
            }
        }
        return jz5.f0.f384359a;
    }
}
