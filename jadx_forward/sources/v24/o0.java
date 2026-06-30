package v24;

/* loaded from: classes15.dex */
public abstract class o0 {
    public static void a(android.content.Context context, int i17, int i18, long j17, long j18, k14.u uVar, boolean z17) {
        k14.k kVar = z17 ? new k14.k(context, i17, i18, j17, j18, uVar, true) : new k14.k(context, i17, i18, j17, j18, uVar);
        kVar.f384879g = true;
        if (kVar.f384877e instanceof android.app.Activity) {
            k14.j jVar = new k14.j(kVar);
            kVar.f384882m = jVar;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(jVar, 200L);
        }
        k14.h hVar = new k14.h(kVar);
        kVar.f384881i = hVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(hVar, 60000L);
        gm0.j1.n().f354821b.a(4071, kVar);
        gm0.j1.n().f354821b.g(kVar.f384889t ? new k14.x(kVar.f384880h, kVar.f384884o, kVar.f384888s, kVar.f384887r, true) : new k14.x(kVar.f384880h, kVar.f384884o, kVar.f384886q, kVar.f384885p, false));
    }

    public static void b(android.content.Context context, long j17, boolean z17, wd0.p1 p1Var) {
        if (z17) {
            k(context, context.getString(e(j17)), new v24.a0(context, j17 | 0, j17, p1Var), true);
            return;
        }
        long j18 = j17 | 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SafeSwitchTipDialog", "doSave. switchValue = 0, WhichExtFunctionSwitch= " + j18);
        a(context, 3, 2, j18, 0L, new v24.b0(p1Var), true);
    }

    public static java.util.List c(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ("zh_CN".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context))) {
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iog));
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iob));
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iod));
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.io9));
        } else {
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iof));
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ioa));
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ioc));
            arrayList.add(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.io8));
        }
        return arrayList;
    }

    public static java.util.List d(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f(context)) {
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ioe));
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.io_));
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijn));
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijm));
        } else {
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n18));
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n17));
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574515n10));
            arrayList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0z));
        }
        return arrayList;
    }

    public static int e(long j17) {
        return j17 == 34359738368L ? com.p314xaae8f345.mm.R.C30867xcad56011.ijj : j17 == 67108864 ? com.p314xaae8f345.mm.R.C30867xcad56011.iji : j17 == 2097152 ? com.p314xaae8f345.mm.R.C30867xcad56011.ijk : j17 == 16777216 ? com.p314xaae8f345.mm.R.C30867xcad56011.ijg : j17 == 8 ? com.p314xaae8f345.mm.R.C30867xcad56011.ijl : j17 == 256 ? com.p314xaae8f345.mm.R.C30867xcad56011.ijh : j17 == 8388608 ? com.p314xaae8f345.mm.R.C30867xcad56011.lxp : j17 == 9007199254740992L ? com.p314xaae8f345.mm.R.C30867xcad56011.phf : com.p314xaae8f345.mm.R.C30867xcad56011.ijp;
    }

    public static boolean f(android.content.Context context) {
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context);
        return "zh_TW".equals(f17) || "zh_HK".equals(f17) || "zh_CN".equals(f17) || "en".equals(f17);
    }

    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, wd0.o1 o1Var) {
        v24.w wVar = new v24.w(o1Var);
        v24.q qVar = new v24.q(context);
        android.widget.TextView textView = qVar.L;
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = qVar.M;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        v24.i0 i0Var = new v24.i0(qVar);
        android.widget.Button button = qVar.N;
        if (button != null) {
            button.setOnClickListener(i0Var);
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(context, c(context), str2, d(context), qVar.M);
        v24.j0 j0Var = new v24.j0(qVar);
        android.widget.Button button2 = qVar.P;
        if (button2 != null) {
            button2.setOnClickListener(j0Var);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijc);
            if (button != null) {
                button.setText(string);
            }
        } else if (button != null) {
            button.setText(str3);
        }
        qVar.l(new v24.k0(wVar, qVar));
        if (button2 != null) {
            button2.setTextColor(button2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        if (button != null) {
            button.setBackground(button.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562600jw));
        }
        if (button != null) {
            button.setTextColor(button.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560296gj));
        }
        if (textView2 != null) {
            textView2.setTextSize(1, 14.0f);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561262dl);
        android.widget.LinearLayout linearLayout = qVar.S;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)) {
            ((android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = dimensionPixelSize;
        }
        v24.l0 l0Var = new v24.l0(qVar);
        qVar.K = l0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = qVar.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293346j = l0Var;
        }
        android.view.View view = qVar.T;
        if (view != null) {
            qVar.j(view);
        }
        qVar.C();
    }

    public static void h(android.content.Context context, long j17, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe, wd0.p1 p1Var, int i17) {
        j(context, j17, new v24.m0(c21541x1c1b08fe), p1Var, i17, false);
    }

    public static void i(android.content.Context context, long j17, v24.n0 n0Var, wd0.p1 p1Var, int i17) {
        j(context, j17, n0Var, p1Var, i17, false);
    }

    public static void j(android.content.Context context, long j17, v24.n0 n0Var, wd0.p1 p1Var, int i17, boolean z17) {
        k(context, context.getString(e(j17)), new v24.y(context, i17, j17 | 0, n0Var, p1Var, z17), i17 == 3);
    }

    public static void k(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tg tgVar, boolean z17) {
        java.lang.String string = f(context) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijo) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574516n11);
        v24.q qVar = new v24.q(context);
        android.widget.TextView textView = qVar.L;
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = qVar.M;
        if (textView2 != null) {
            textView2.setText(string);
        }
        v24.e0 e0Var = new v24.e0(qVar);
        android.widget.Button button = qVar.N;
        if (button != null) {
            button.setOnClickListener(e0Var);
        }
        android.widget.TextView textView3 = qVar.Q;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(context, c(context), string, d(context), qVar.M);
        v24.f0 f0Var = new v24.f0(qVar);
        android.widget.Button button2 = qVar.P;
        if (button2 != null) {
            button2.setOnClickListener(f0Var);
        }
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijd);
        if (button != null) {
            button.setText(string2);
        }
        qVar.l(new v24.g0(tgVar, qVar));
        v24.h0 h0Var = new v24.h0(qVar);
        qVar.K = h0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = qVar.f293589e;
        if (o3Var != null) {
            o3Var.f293472b.f293346j = h0Var;
        }
        android.view.View view = qVar.T;
        if (view != null) {
            qVar.j(view);
        }
        qVar.C();
    }

    public static void l(android.content.Context context) {
        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ije), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
    }

    public static void m(android.content.Context context) {
        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijf), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
    }
}
