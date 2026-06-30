package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI */
/* loaded from: classes9.dex */
public class ViewOnClickListenerC19201x9aa113d6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a, android.view.View.OnClickListener, com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.a {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f262841y = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f262844f;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f262858w;

    /* renamed from: d, reason: collision with root package name */
    public int f262842d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f262843e = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f262845g = 0;

    /* renamed from: h, reason: collision with root package name */
    public iu4.d0[] f262846h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f262847i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f262848m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f262849n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f262850o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f262851p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f262852q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ViewFlipper f262853r = null;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f262854s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public android.app.Dialog f262855t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f262856u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f262857v = false;

    /* renamed from: x, reason: collision with root package name */
    public int f262859x = -1;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6) {
        viewOnClickListenerC19201x9aa113d6.getClass();
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String r17 = c01.z1.r();
        ((ce0.e) jVar).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.K(r17, 9, "PatternLockUpdate", "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11473, new java.lang.Object[0]);
    }

    public final void U6() {
        android.app.Dialog dialog = this.f262855t;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f262855t.dismiss();
    }

    public final boolean V6() {
        int i17 = this.f262844f;
        if (i17 == 20 || i17 == 0 || i17 == 2 || i17 == 1) {
            W6();
            return false;
        }
        if (this.f262856u) {
            java.lang.String stringExtra = getIntent().getStringExtra("next_action");
            java.lang.String string = "next_action.modify_pattern".equals(stringExtra) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fr9) : "next_action.switch_on_pattern".equals(stringExtra) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fr_) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.fr9);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            aVar.A = false;
            aVar.f293262s = string;
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.fr7);
            aVar.E = new iu4.s(this);
            i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f573775fr5);
            aVar.F = new iu4.r(this);
            i0Var.h();
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = i0Var2.f293354b;
            aVar2.A = true;
            i0Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.fra);
            i0Var2.f(com.p314xaae8f345.mm.R.C30867xcad56011.fr6);
            aVar2.E = new iu4.q(this);
            i0Var2.h();
        }
        return true;
    }

    public final void W6() {
        java.lang.String stringExtra = getIntent().getStringExtra("next_action");
        if (this.f262844f == 20 || "next_action.goto_protected_page".equals(stringExtra)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.h();
        }
    }

    public final void X6() {
        android.content.Intent intent = (android.content.Intent) getIntent().getParcelableExtra("page_intent");
        if (intent != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE;
            nVar.j(true);
            nVar.k(true);
            intent.addFlags(131072);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "doGotoProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "doGotoProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", "Protected page's intent not found, finish myself only.");
        }
        finish();
    }

    public final void Y6() {
        iu4.d0[] d0VarArr = this.f262846h;
        if (d0VarArr == null) {
            return;
        }
        iu4.d0 d0Var = d0VarArr[this.f262845g];
        int i17 = this.f262844f;
        if (i17 == 0) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frr));
            this.f262850o = false;
            d0Var.f376556c.m74005x19d8f645(true);
            d0Var.f376556c.m74006xdf056843(this);
            if (!"next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
                d0Var.f376555b.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frm));
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262858w)) {
                d0Var.f376555b.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frn));
            } else {
                d0Var.f376555b.setText(this.f262858w);
            }
            d0Var.f376555b.setTextColor(this.f262842d);
            if (d0Var.f376557d.getVisibility() != 0) {
                d0Var.f376557d.setVisibility(0);
                return;
            }
            return;
        }
        if (i17 == 1) {
            java.lang.String stringExtra = getIntent().getStringExtra("next_action");
            if ("next_action.modify_pattern".equals(stringExtra)) {
                d0Var.f376556c.b();
                b7(1, true);
                this.f262844f = 16;
                Y6();
                return;
            }
            if (!"next_action.switch_off_pattern".equals(stringExtra)) {
                if ("next_action.goto_protected_page".equals(stringExtra)) {
                    hu4.i.f366763a = android.os.SystemClock.elapsedRealtime();
                    X6();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.c(this.f262859x, 1, 0);
                    return;
                }
                return;
            }
            java.util.List list = this.f262849n;
            iu4.a0 a0Var = new iu4.a0(this);
            d7(new iu4.i(this));
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.fz4();
            lVar.f152198b = new r45.gz4();
            lVar.f152200d = 689;
            lVar.f152199c = "/cgi-bin/micromsg-bin/oppatternlock";
            lVar.f152211o = 2;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.fz4 fz4Var = (r45.fz4) a17.f152243a.f152217a;
            fz4Var.f456280d = 3;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(hu4.j.c(list));
            fz4Var.f456281e = cu5Var;
            com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new iu4.j(this, a0Var), false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Wrong;
        if (i17 == 2) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            hu4.i.i(elapsedRealtime, 0L);
            int i18 = this.f262851p;
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            if (c17 != null) {
                c17.w(339972, java.lang.Integer.valueOf(i18));
                c17.i(true);
            }
            hu4.i.f366763a = -1L;
            if (this.f262851p == 5) {
                this.f262850o = true;
                hu4.i.h(elapsedRealtime, 0L);
                d0Var.f376556c.b();
                d0Var.f376556c.m74005x19d8f645(false);
                this.f262844f = 20;
                Y6();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar.A = false;
                aVar.f293262s = java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fr8), 10L);
                aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573774fr4);
                aVar.E = new iu4.o(this);
                aVar.f293266w = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573773fr3);
                aVar.F = new iu4.p(this);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar.f293256m;
                if (d0Var2 != null) {
                    d0Var2.a(j0Var.f293370r);
                }
                j0Var.show();
            } else {
                d0Var.f376556c.m74005x19d8f645(false);
                d0Var.f376556c.m74003xd6674fc3(bVar);
                c7(java.lang.String.format(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fre), java.lang.Integer.valueOf(5 - this.f262851p)), new iu4.b0(this, d0Var));
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("next_action");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", "nextAction: %s", stringExtra2);
            if ("next_action.goto_protected_page".equals(stringExtra2)) {
                if (this.f262851p == 5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.c(this.f262859x, 1, 2);
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.c(this.f262859x, 1, 1);
                    return;
                }
            }
            return;
        }
        switch (i17) {
            case 16:
                java.lang.String stringExtra3 = getIntent().getStringExtra("next_action");
                if ("next_action.modify_pattern".equals(stringExtra3)) {
                    mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frp));
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca9650.f143649d = 5L;
                    c7053xf3ca9650.f143650e = 1L;
                    c7053xf3ca9650.k();
                } else if ("next_action.switch_on_pattern".equals(stringExtra3)) {
                    mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frq));
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96502 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96502.f143649d = 4L;
                    c7053xf3ca96502.f143650e = 1L;
                    c7053xf3ca96502.k();
                } else {
                    mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frp));
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96503.f143649d = 5L;
                    c7053xf3ca96503.f143650e = 1L;
                    c7053xf3ca96503.k();
                }
                this.f262850o = false;
                d0Var.f376556c.m74005x19d8f645(true);
                d0Var.f376556c.m74006xdf056843(this);
                d0Var.f376555b.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frl));
                d0Var.f376555b.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                if (d0Var.f376557d.getVisibility() != 8) {
                    d0Var.f376557d.setVisibility(8);
                    return;
                }
                return;
            case 17:
                d0Var.f376555b.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.frj));
                d0Var.f376555b.setTextColor(this.f262842d);
                d0Var.f376556c.b();
                d0Var.f376556c.m74005x19d8f645(true);
                if (d0Var.f376557d.getVisibility() != 8) {
                    d0Var.f376557d.setVisibility(8);
                    return;
                }
                return;
            case 18:
                java.lang.String stringExtra4 = getIntent().getStringExtra("next_action");
                if (!"next_action.modify_pattern".equals(stringExtra4)) {
                    if ("next_action.switch_on_pattern".equals(stringExtra4)) {
                        Z6(this.f262852q, this.f262848m, new iu4.w(this));
                        return;
                    } else {
                        if ("next_action.goto_protected_page".equals(stringExtra4)) {
                            Z6(this.f262852q, this.f262848m, new iu4.x(this));
                            return;
                        }
                        return;
                    }
                }
                if (this.f262857v) {
                    this.f262857v = false;
                    Z6(this.f262852q, this.f262848m, new iu4.u(this));
                    return;
                }
                java.util.List list2 = this.f262849n;
                java.util.List list3 = this.f262848m;
                iu4.v vVar = new iu4.v(this);
                com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
                d7(new iu4.g(this));
                lVar2.f152197a = new r45.fz4();
                lVar2.f152198b = new r45.gz4();
                lVar2.f152200d = 689;
                lVar2.f152199c = "/cgi-bin/micromsg-bin/oppatternlock";
                lVar2.f152211o = 2;
                com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar2.a();
                r45.fz4 fz4Var2 = (r45.fz4) a18.f152243a.f152217a;
                fz4Var2.f456280d = 1;
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(hu4.j.c(list2));
                fz4Var2.f456281e = cu5Var2;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(hu4.j.c(list3));
                fz4Var2.f456282f = cu5Var3;
                com.p314xaae8f345.mm.p944x882e457a.z2.d(a18, new iu4.h(this, vVar), false);
                return;
            case 19:
                d0Var.f376556c.m74005x19d8f645(false);
                d0Var.f376556c.m74003xd6674fc3(bVar);
                c7(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.frk), new iu4.z(this, d0Var));
                return;
            case 20:
                mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fro));
                mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frp));
                int i19 = this.f262859x;
                if (i19 == 1) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96504 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96504.f143649d = 8L;
                    c7053xf3ca96504.f143650e = 1L;
                    c7053xf3ca96504.k();
                } else if (i19 == 2) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96505 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                    c7053xf3ca96505.f143649d = 10L;
                    c7053xf3ca96505.f143650e = 1L;
                    c7053xf3ca96505.k();
                }
                this.f262850o = true;
                d0Var.f376556c.m74005x19d8f645(false);
                d0Var.f376556c.m74006xdf056843(null);
                d0Var.f376555b.setText(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frh), java.lang.Long.valueOf((long) java.lang.Math.ceil((600 - (hu4.i.a().f366768b / 1000)) / 60.0d))));
                d0Var.f376555b.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
                return;
            default:
                return;
        }
    }

    public final void Z6(java.lang.String str, java.util.List list, com.p314xaae8f345.mm.p944x882e457a.e3 e3Var) {
        d7(new iu4.c(this));
        if (str == null) {
            U6();
            if (e3Var != null) {
                e3Var.mo1034xf5bc2045(3, -6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.frd), null, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nn5();
        lVar.f152198b = new r45.on5();
        lVar.f152200d = na1.e.f72905x366c91de;
        lVar.f152199c = "/cgi-bin/micromsg-bin/registernewpatternlock";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.nn5 nn5Var = (r45.nn5) a17.f152243a.f152217a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(str.getBytes());
        nn5Var.f463084d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(hu4.j.c(list));
        nn5Var.f463085e = cu5Var2;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new iu4.d(this, e3Var), false);
    }

    public final void a7(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", "gesture finishWithResult");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        intent.putExtra("key_err_msg", str);
        setResult(i17, intent);
        finish();
        if (i18 == 4 || i18 == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f();
            int i19 = i18 == 4 ? 5 : 6;
            am.n10 n10Var = c6244x161a780f.f136493g;
            n10Var.f88925a = i19;
            n10Var.f88926b = this;
            c6244x161a780f.e();
        }
    }

    public final void b7(int i17, boolean z17) {
        int i18 = i17 - this.f262845g;
        if (i18 == 0) {
            return;
        }
        this.f262845g = i17;
        if (!z17) {
            this.f262853r.setInAnimation(null);
            this.f262853r.setOutAnimation(null);
        } else if (i18 > 0) {
            this.f262853r.setInAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);
            this.f262853r.setOutAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        } else {
            this.f262853r.setInAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4);
            this.f262853r.setOutAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        }
        if (i18 <= 0) {
            while (i18 < 0) {
                this.f262853r.showPrevious();
                i18++;
            }
        } else {
            for (int i19 = 0; i19 < i18; i19++) {
                this.f262853r.showNext();
            }
        }
    }

    public final void c7(java.lang.String str, iu4.c0 c0Var) {
        android.widget.TextView textView = this.f262846h[this.f262845g].f376555b;
        textView.getText().toString();
        textView.setText(str);
        textView.setTextColor(this.f262843e);
        textView.startAnimation(this.f262847i);
        this.f262847i.setAnimationListener(new iu4.n(this, c0Var));
    }

    public final void d7(android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialog = this.f262855t;
        if (dialog == null) {
            this.f262855t = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.frg), false, false, onCancelListener);
        } else {
            dialog.show();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bl8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo48674x36654fab();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f262847i = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559403du);
        this.f262842d = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        this.f262843e = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("action");
        intent.getStringExtra("next_action");
        if ("action.switch_on_pattern".equals(stringExtra)) {
            this.f262844f = 16;
            b7(1, false);
        } else if ("action.verify_pattern".equals(stringExtra)) {
            if (hu4.j.f()) {
                this.f262850o = true;
                this.f262844f = 20;
            } else {
                this.f262850o = false;
                this.f262844f = 0;
            }
            b7(0, false);
        }
        mo54448x9c8c0d33(new iu4.k(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("GuestureGuardLogicUI, initView done, before doRestBehavior. mStatus=%d", java.lang.Integer.valueOf(this.f262844f)));
        Y6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GestureGuardLogicUI", "hy: Intent data is null.");
                return;
            }
            int intExtra = intent.getIntExtra("key_err_code", 0);
            if (intExtra != 0) {
                if (intExtra == -1) {
                    dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.frb), 0).show();
                    return;
                }
                return;
            }
            this.f262852q = intent.getStringExtra("key_token");
            intent.getStringExtra("key_type");
            java.lang.String stringExtra = getIntent().getStringExtra("next_action");
            if ("next_action.goto_protected_page".equals(stringExtra) || "next_action.modify_pattern".equals(stringExtra)) {
                if ("next_action.modify_pattern".equals(stringExtra)) {
                    this.f262857v = true;
                }
                this.f262856u = false;
                mo54448x9c8c0d33(null);
                m78560xe21cbbf(false);
                this.f262844f = 16;
                b7(1, false);
            } else if ("next_action.switch_off_pattern".equals(stringExtra)) {
                java.lang.String str = this.f262852q;
                iu4.t tVar = new iu4.t(this);
                d7(new iu4.l(this));
                if (str == null) {
                    U6();
                    tVar.mo1034xf5bc2045(3, -6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.frd), null, null);
                } else {
                    com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                    lVar.f152197a = new r45.nn5();
                    lVar.f152198b = new r45.on5();
                    lVar.f152200d = na1.e.f72905x366c91de;
                    lVar.f152199c = "/cgi-bin/micromsg-bin/registernewpatternlock";
                    lVar.f152211o = 2;
                    com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                    r45.nn5 nn5Var = (r45.nn5) a17.f152243a.f152217a;
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.d(str.getBytes());
                    nn5Var.f463084d = cu5Var;
                    nn5Var.f463086f = 3;
                    com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new iu4.m(this, tVar), false);
                }
            } else {
                this.f262844f = 1;
            }
            Y6();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.omq) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("action", "action.verify_paypwd");
            intent.putExtra("key_wallet_lock_type", 1);
            j45.l.n(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, 1001);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        android.content.Intent intent = getIntent();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b.equals(intent.getPackage()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("action")) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("next_action"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GestureGuardLogicUI", "Intent started this activity has no valid action desc.");
            finish();
            return;
        }
        this.f262853r = new android.widget.ViewFlipper(this);
        iu4.d0[] d0VarArr = {new iu4.d0(this), new iu4.d0(this), new iu4.d0(this)};
        this.f262846h = d0VarArr;
        for (int i17 = 0; i17 < 3; i17++) {
            iu4.d0 d0Var = d0VarArr[i17];
            this.f262853r.addView(d0Var.f376554a);
            d0Var.f376556c.m74006xdf056843(this);
            d0Var.f376557d.setOnClickListener(this);
        }
        setContentView(this.f262853r);
        this.f262852q = getIntent().getStringExtra("token");
        getIntent().getStringExtra("type");
        this.f262858w = getIntent().getStringExtra("verify_title");
        this.f262859x = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
        if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.f262906a = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockReportManager", "wallet lock report create session: %d", java.lang.Long.valueOf(currentTimeMillis));
        }
        mo43517x10010bd5();
        getWindow().addFlags(8192);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        try {
            if (b3.l.m9698x3fed0563(mo55332x76847179(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                getWindow().setHideOverlayWindows(true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", "no permission");
                jx3.f.INSTANCE.mo68478xbd3cda5f(28867, "100");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureGuardLogicUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.Dialog dialog = this.f262855t;
        if (dialog != null && dialog.isShowing()) {
            this.f262855t.dismiss();
        }
        android.widget.ViewFlipper viewFlipper = this.f262853r;
        if (viewFlipper != null) {
            viewFlipper.removeAllViews();
            this.f262853r = null;
        }
        int i17 = 0;
        while (true) {
            iu4.d0[] d0VarArr = this.f262846h;
            if (i17 >= d0VarArr.length) {
                this.f262846h = null;
                return;
            }
            iu4.d0 d0Var = d0VarArr[i17];
            d0Var.f376556c.setOnClickListener(null);
            d0Var.f376557d.setOnClickListener(null);
            d0Var.f376554a = null;
            d0Var.f376555b = null;
            d0Var.f376556c = null;
            d0Var.f376557d = null;
            this.f262846h[i17] = null;
            i17++;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (V6()) {
            return false;
        }
        a7(0, 4, "user cancel when setting gesture");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a
    /* renamed from: onPatternCleared */
    public void mo26519xf41995bb(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00 c19202xeb785e00) {
        c19202xeb785e00.m74003xd6674fc3(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Correct);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a
    /* renamed from: onPatternCompleted */
    public void mo26520x4c24e09a(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00 c19202xeb785e00, java.util.List list) {
        int i17 = this.f262844f;
        boolean z17 = true;
        if (i17 == 16) {
            if (list.size() < 4) {
                c19202xeb785e00.m74005x19d8f645(false);
                c19202xeb785e00.m74003xd6674fc3(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Wrong);
                c7(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.frf), 4), new iu4.a(this, c19202xeb785e00));
                return;
            } else {
                this.f262848m = list;
                c19202xeb785e00.b();
                this.f262844f = 17;
                b7(2, true);
                Y6();
                return;
            }
        }
        if (i17 != 0) {
            if (i17 == 17) {
                if (this.f262848m.equals(list)) {
                    c19202xeb785e00.b();
                    this.f262850o = false;
                    this.f262851p = 0;
                    hu4.i.g();
                    hu4.i.e();
                    hu4.i.f();
                    hu4.i.f366763a = -1L;
                    this.f262844f = 18;
                } else {
                    this.f262844f = 19;
                }
                Y6();
                return;
            }
            return;
        }
        iu4.b bVar = new iu4.b(this, list);
        r45.q55 c17 = hu4.i.c();
        r45.p55 b17 = hu4.i.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11453, new java.lang.Object[0]);
        d7(new iu4.e(this));
        boolean j17 = hu4.j.j(c17);
        boolean i18 = hu4.j.i(b17);
        boolean z18 = !i18 || (j17 && b17.f464304e < c17.f465228d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("isInfoValid:%b, isBuffValid:%b, verify by server:%b", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(i18), java.lang.Boolean.valueOf(z18)));
        if (!z18) {
            U6();
            r45.p55 b18 = hu4.i.b();
            if (b18 != null) {
                z17 = new java.lang.String(b18.f464305f.f453374f.f273689a).equals(kk.k.g((new kk.v(gm0.j1.b().h()).longValue() + '_' + new java.lang.String(hu4.j.c(list))).getBytes()));
            }
            if (z17) {
                bVar.mo1034xf5bc2045(3, 0, null, null, null);
                return;
            } else {
                bVar.mo1034xf5bc2045(3, -3, null, null, null);
                return;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fz4();
        lVar.f152198b = new r45.gz4();
        lVar.f152200d = 689;
        lVar.f152199c = "/cgi-bin/micromsg-bin/oppatternlock";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.fz4 fz4Var = (r45.fz4) a17.f152243a.f152217a;
        fz4Var.f456280d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(hu4.j.c(list));
        fz4Var.f456281e = cu5Var;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new iu4.f(this, bVar), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a
    /* renamed from: onPatternGestureNodeJoin */
    public void mo26521xc6dc49c4(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00 c19202xeb785e00, java.util.List list) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a
    /* renamed from: onPatternStart */
    public void mo26522x68c62e31(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00 c19202xeb785e00) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f262844f == 0) {
            if (!hu4.j.e()) {
                this.f262851p = 0;
                return;
            }
            int d17 = hu4.i.d();
            this.f262851p = d17;
            if (d17 == -1) {
                this.f262851p = 0;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00 c19202xeb785e00 = this.f262846h[this.f262845g].f376556c;
        if (c19202xeb785e00 != null) {
            c19202xeb785e00.m74005x19d8f645(z17 && !this.f262850o);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(hu4.e.class);
    }
}
