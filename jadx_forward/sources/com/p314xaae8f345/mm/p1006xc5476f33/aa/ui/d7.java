package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154150d;

    public d7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154150d = activityC11355x7bcfecda;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f154150d.isFinishing() || this.f154150d.isDestroyed()) {
            return;
        }
        java.lang.String string = this.f154150d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571292aw);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154150d;
        if (activityC11355x7bcfecda.B == null) {
            activityC11355x7bcfecda.B = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06(activityC11355x7bcfecda, 20);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda2 = this.f154150d;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06 = activityC11355x7bcfecda2.B;
        c11354x3aa9ae06.f154073i = string;
        java.lang.String str = activityC11355x7bcfecda2.f154094z;
        java.lang.String string2 = activityC11355x7bcfecda2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyh);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c7 c7Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c7(this);
        c11354x3aa9ae06.a();
        boolean z17 = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(c11354x3aa9ae06.f154068d, 1, 2, false);
        c11354x3aa9ae06.f154070f = z2Var;
        int i17 = (!com.p314xaae8f345.mm.ui.b4.c(c11354x3aa9ae06.f154068d) && fp.h.c(36)) ? 16 : 48;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[showDialog] softInputMode=" + i17);
        z2Var.A(i17);
        android.view.View view = z2Var.f293591g;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showDialog: dialog rootView is not a ViewGroup, abort. type=");
            android.view.View view2 = z2Var.f293591g;
            sb6.append(view2 != null ? view2.getClass() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PaylistAARemarkInputHalfPage", sb6.toString());
            c11354x3aa9ae06.a();
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(c11354x3aa9ae06.f154068d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.elq, viewGroup, false);
        android.view.ViewGroup viewGroup2 = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PaylistAARemarkInputHalfPage", "showDialog: inflated root is not a ViewGroup, abort. layout=paylist_aa_remark_input_half_page");
            c11354x3aa9ae06.a();
            return;
        }
        android.view.View findViewById = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.upf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            c22621x7603e017.setHint(string2);
        }
        z2Var.f293588d.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g6(z2Var, c11354x3aa9ae06, c22621x7603e017));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c22621x7603e017.setText(str);
            c22621x7603e017.mo81549xf579a34a(str != null ? str.length() : 0);
            z2Var.b(!(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(str) > c11354x3aa9ae06.f154069e * 2));
        }
        c22621x7603e017.mo81583x7e4f2d39(new android.text.InputFilter[]{new com.p314xaae8f345.mm.ui.p2740x696c9db.v4(c11354x3aa9ae06.f154069e, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2)});
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.h6(z2Var, c11354x3aa9ae06));
        c22621x7603e017.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i6(z2Var, c7Var, c22621x7603e017, c11354x3aa9ae06));
        z2Var.j(viewGroup2);
        java.lang.String str2 = c11354x3aa9ae06.f154073i;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            z2Var.q(c11354x3aa9ae06.f154068d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571292aw));
        } else {
            z2Var.q(c11354x3aa9ae06.f154073i);
        }
        z2Var.m(c11354x3aa9ae06.f154068d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), c11354x3aa9ae06.f154068d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j6 j6Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j6(c7Var, c11354x3aa9ae06, c22621x7603e017);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k6 k6Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k6(c7Var, c22621x7603e017, c11354x3aa9ae06);
        z2Var.D = j6Var;
        z2Var.E = k6Var;
        c11354x3aa9ae06.f154071g.f();
        if (c11354x3aa9ae06.f154076o && android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.View view3 = z2Var.f293591g;
            if (view3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PaylistAARemarkInputHalfPage", "[registerImeInsetsAnimation] rootView is null, skip");
            } else {
                n3.l1.o(view3, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f6(c11354x3aa9ae06, z2Var, view3));
            }
        }
        z2Var.C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[showDialog] tryShow() called, dialogIsShowing=" + z2Var.h());
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l6 l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l6(c11354x3aa9ae06, z2Var, c22621x7603e017);
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(l6Var, 50L, false);
    }
}
