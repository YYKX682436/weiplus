package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f262454a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f262455b;

    public l0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f262455b = abstractActivityC21394xb3d2c0cf;
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 l0Var, r45.n34 n34Var) {
        l0Var.getClass();
        if (n34Var == null) {
            return;
        }
        int i17 = n34Var.f462582e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = l0Var.f262455b;
        if (i17 == 3) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", n34Var.f462583f);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(abstractActivityC21394xb3d2c0cf, intent);
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            java.lang.String str = n34Var.f462584g;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            nxVar.f89000b = n34Var.f462585h;
            nxVar.f89002d = 1034;
            nxVar.f89001c = 0;
            c6113xa3727625.e();
        }
        if (l0Var.f262454a) {
            abstractActivityC21394xb3d2c0cf.finish();
        }
    }

    public static boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n nVar) {
        return (nVar == null || nVar.f262468d == 0) ? false : true;
    }

    public static boolean e(r45.g04 g04Var) {
        return (g04Var == null || g04Var.f456313g == 0) ? false : true;
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0 k0Var) {
        int i17 = nVar.f262469e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f262455b;
        if (i17 != 2) {
            int i18 = nVar.f262468d;
            if (i18 != 1) {
                if (i18 == 2) {
                    db5.e1.C(this.f262455b, nVar.f262465a, "", nVar.f262467c.f462581d, nVar.f262466b.f462581d, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.d0(this, k0Var, nVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.e0(this, k0Var, nVar));
                    return;
                }
                return;
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f262466b.f462581d) && abstractActivityC21394xb3d2c0cf != null) {
                    nVar.f262466b.f462581d = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1);
                }
                db5.e1.E(this.f262455b, nVar.f262465a, "", nVar.f262466b.f462581d, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.c0(this, k0Var, nVar));
                return;
            }
        }
        int i19 = nVar.f262471g;
        boolean z17 = (i19 == 2 || i19 == 3) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f262470f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = z17 ? new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(abstractActivityC21394xb3d2c0cf, 1, 3, false) : new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(abstractActivityC21394xb3d2c0cf, 1, 0, false);
        int i27 = nVar.f262468d;
        if (i27 == 1) {
            z2Var.y(nVar.f262466b.f462581d);
            z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.f0(this, k0Var, nVar, z2Var);
            com.p314xaae8f345.mm.ui.bk.s0(z2Var.f293605x.getPaint());
        } else if (i27 == 2) {
            z2Var.m(nVar.f262466b.f462581d, nVar.f262467c.f462581d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.g0(this, k0Var, nVar, z2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.h0(this, k0Var, nVar, z2Var);
            z2Var.D = g0Var;
            z2Var.E = h0Var;
            com.p314xaae8f345.mm.ui.bk.s0(z2Var.f293601t.getPaint());
            com.p314xaae8f345.mm.ui.bk.s0(z2Var.f293602u.getPaint());
        }
        android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.cec, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gwd);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(nVar.f262470f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.gw7);
        c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i0(this, z2Var));
        int i28 = nVar.f262471g;
        if (i28 == 2) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        } else if (i28 == 3) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80016xebd25a3f);
        } else {
            c22699x3dcdb352.setVisibility(8);
        }
        android.view.View inflate2 = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.ceb, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.gw8);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        textView2.setText(nVar.f262465a);
        if (z17) {
            z2Var.s(inflate);
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams.topMargin = i65.a.b(abstractActivityC21394xb3d2c0cf, 40);
            textView.setLayoutParams(layoutParams);
        }
        z2Var.j(inflate2);
        z2Var.C();
    }

    public void c(r45.g04 g04Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0 k0Var) {
        b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n.b(g04Var), k0Var);
    }
}
