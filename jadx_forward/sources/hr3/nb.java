package hr3;

/* loaded from: classes11.dex */
public abstract class nb extends hr3.eb {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 f365365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668) {
        super(c16861xdcf09668);
        this.f365365g = c16861xdcf09668;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        c01.d9.e().q(30, this);
        c01.d9.e().q(ma1.a.f72799x366c91de, this);
        c01.d9.e().q(td1.h.f76804x366c91de, this);
    }

    @Override // hr3.eb, hr3.va
    public void f() {
        i();
        o();
        c01.d9.e().a(30, this);
        c01.d9.e().a(ma1.a.f72799x366c91de, this);
        c01.d9.e().a(td1.h.f76804x366c91de, this);
        super.f();
    }

    @Override // hr3.eb, hr3.va
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365365g;
        android.view.View view = c16861xdcf09668.f235267x0;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = c16861xdcf09668.f235271z1;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.Button button = c16861xdcf09668.D1;
        if (button != null) {
            button.setVisibility(8);
        }
        android.widget.Button button2 = c16861xdcf09668.G1;
        if (button2 != null) {
            button2.setVisibility(8);
        }
        android.widget.Button button3 = c16861xdcf09668.E1;
        if (button3 != null) {
            button3.setVisibility(8);
        }
        android.widget.Button button4 = c16861xdcf09668.C1;
        if (button4 != null) {
            button4.setVisibility(8);
        }
        android.widget.TextView textView = c16861xdcf09668.H1;
        if (textView != null) {
            textView.setVisibility(8);
        }
        o();
    }

    @Override // hr3.va, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.List list;
        if (m1Var.mo808xfb85f7b0() == 30 || m1Var.mo808xfb85f7b0() == 667 || m1Var.mo808xfb85f7b0() == 853) {
            o();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365365g;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(c16861xdcf09668.f279303d)) {
                if (i17 == 0 && i18 == 0) {
                    if (m1Var.mo808xfb85f7b0() == 30) {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VerifyBaseHandler onSceneEnd, opCode = ");
                        int i19 = m3Var.f270913g;
                        sb6.append(i19);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", sb6.toString());
                        if ((i19 == 1 || i19 == 3) && (list = m3Var.f270912f) != null && list.contains(c16861xdcf09668.L.d1())) {
                            c16861xdcf09668.I1 = true;
                            p();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096682 = ((hr3.rb) this).f365365g;
                            hr3.va vaVar = c16861xdcf096682.f235265p0;
                            if (vaVar != null) {
                                vaVar.i();
                            }
                            hr3.eb ebVar = new hr3.eb(c16861xdcf096682);
                            c16861xdcf096682.f235265p0 = ebVar;
                            ebVar.h();
                            java.util.Iterator it = list.iterator();
                            while (it.hasNext()) {
                                y35.r.l((java.lang.String) it.next(), c16861xdcf09668.N, "NormalUserFooterPreference verify onsceneEnd opCode: " + i19);
                            }
                            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).g();
                            return;
                        }
                        return;
                    }
                    if (m1Var.mo808xfb85f7b0() == 667 || m1Var.mo808xfb85f7b0() == 853) {
                        c16861xdcf09668.I1 = true;
                        p();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096683 = ((hr3.rb) this).f365365g;
                        hr3.va vaVar2 = c16861xdcf096683.f235265p0;
                        if (vaVar2 != null) {
                            vaVar2.i();
                        }
                        hr3.eb ebVar2 = new hr3.eb(c16861xdcf096683);
                        c16861xdcf096683.f235265p0 = ebVar2;
                        ebVar2.h();
                        y35.r.l(c16861xdcf09668.L.d1(), c16861xdcf09668.N, "NormalUserFooterPreference verify onsceneEnd openIm");
                        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).g();
                        return;
                    }
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c16861xdcf09668.K1;
                if (i17 == 4 && i18 == -302) {
                    int i27 = m1Var.mo808xfb85f7b0() == 30 ? ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).f270913g : 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", java.lang.Integer.valueOf(i27));
                    if (i27 == 3 || m1Var.mo808xfb85f7b0() == 853) {
                        db5.e1.A(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bja), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571537i6), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.mb(this), null);
                        return;
                    }
                    return;
                }
                if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
                    return;
                }
                android.content.Context context = c16861xdcf09668.f279303d;
                if (i17 == 1) {
                    if (c01.d9.e().m()) {
                        c01.d9.e().l();
                        return;
                    } else {
                        if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(context)) {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l5.a(context);
                            return;
                        }
                        return;
                    }
                }
                if (i17 == 2) {
                    dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 0).show();
                    return;
                }
                if (i17 != 4) {
                    return;
                }
                if (i18 == -100 || i18 == -2023) {
                    gm0.j1.i();
                    gm0.j1.b();
                    db5.e1.M(context, gm0.m.f354768x, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new hr3.kb(this), new hr3.lb(this));
                    return;
                }
                if (i17 == 4 && i18 == -34) {
                    str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbm);
                } else if (i17 == 4 && i18 == -94) {
                    str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbp);
                } else if (i17 != 4 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iil);
                }
                dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf, str, 1).show();
            }
        }
    }

    public final void p() {
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365365g;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).n(c16861xdcf09668.L.d1(), true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16861xdcf09668.L;
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).l0(z3Var)) {
                n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(c16861xdcf09668.L.d1(), true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormalUserFooterPreference", "insert contact failed, username = " + z3Var.d1());
                n17 = null;
            }
        }
        c16861xdcf09668.L = n17;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = c16861xdcf09668.L;
        if (z3Var2 != null) {
            c01.e2.m0(z3Var2);
        }
    }
}
