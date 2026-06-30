package db5;

/* loaded from: classes8.dex */
public abstract class e1 {
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 A(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = str3;
        aVar.E = onClickListener;
        aVar.f293266w = str4;
        aVar.F = onClickListener2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 B(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, int i17) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = str3;
        aVar.E = onClickListener;
        aVar.f293266w = str4;
        aVar.F = onClickListener2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.B(context.getResources().getColor(i17));
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 C(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        return D(context, str, str2, str3, str4, z17, onClickListener, onClickListener2, -1);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 D(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, int i17) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = str3;
        aVar.E = onClickListener;
        aVar.f293266w = str4;
        aVar.F = onClickListener2;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        if (i17 > 0) {
            j0Var.B(context.getResources().getColor(i17));
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 E(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = str3;
        aVar.E = onClickListener;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 F(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.A = z17;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = new db5.o0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 G(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = onClickListener;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 H(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = onClickListener;
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = onClickListener2;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 I(android.content.Context context, boolean z17, java.lang.String str, android.view.View view, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        return J(context, z17, str, view, str2, str3, onClickListener, onClickListener2, -1);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 J(android.content.Context context, boolean z17, java.lang.String str, android.view.View view, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, int i17) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str;
        aVar.L = view;
        aVar.f293265v = str2;
        aVar.E = onClickListener;
        aVar.f293266w = str3;
        aVar.F = onClickListener2;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        if (i17 > 0) {
            j0Var.B(context.getResources().getColor(i17));
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 K(android.content.Context context, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = str3;
        aVar.E = onClickListener;
        aVar.f293266w = str4;
        aVar.F = onClickListener2;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 L(android.content.Context context, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, int i17, int i18) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = str3;
        aVar.E = onClickListener;
        aVar.f293266w = str4;
        aVar.F = onClickListener2;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        if (i17 > 0) {
            j0Var.B(context.getResources().getColor(i17));
        }
        if (i18 > 0) {
            j0Var.x(context.getResources().getColor(i18));
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 M(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = onClickListener;
        aVar.G = onCancelListener;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 N(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, db5.a1 a1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
        if (!(context instanceof android.app.Activity) || !((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.A = false;
            aVar.B = true;
            aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            aVar.F = null;
            aVar.f293242a = str;
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxw, null);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) inflate.findViewById(com.p314xaae8f345.mm.R.id.d98);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                c22621x7603e017.n(str2);
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str3);
            }
            aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
            aVar.E = new db5.v0(a1Var, c22621x7603e017, context);
            aVar.Z = false;
            if (i17 > 0) {
                ck5.f b17 = ck5.f.b(c22621x7603e017);
                b17.f124094f = 0;
                b17.f124093e = i17;
                b17.d(null);
            }
            aVar.L = inflate;
            j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            a(context, j0Var);
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                inflate.post(new db5.w0(context));
            }
        }
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 O(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        db5.m9.a(true, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 e17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.e(context, str2, z18, i17, i18, new db5.j0(new java.lang.ref.WeakReference(onCancelListener)));
        a(context, e17);
        return e17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 P(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return O(context, str, i17, -1, str2, z17, z18, onCancelListener);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return P(context, str, 0, str2, z17, z18, onCancelListener);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 R(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return P(context, str, 2, str2, z17, z18, onCancelListener);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 S(android.content.Context context, java.lang.String str, java.util.List list, int i17, java.lang.String str2, db5.z0 z0Var) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAlert", "show switch alert fail");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.A = false;
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.f293242a = str;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxx, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.nua);
        for (int size = list.size() - 1; size >= 0; size--) {
            android.widget.TextView textView = (android.widget.TextView) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cbx, null);
            textView.setText((java.lang.CharSequence) list.get(size));
            if (size == i17) {
                textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
            }
            if (size == list.size() - 1) {
                context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b4h);
            }
            textView.setTag(java.lang.Integer.valueOf(size));
            linearLayout.addView(textView, 0);
            textView.setOnClickListener(new db5.y0(linearLayout, z0Var));
        }
        aVar.L = inflate;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        linearLayout.setTag(j0Var);
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static android.widget.Toast T(android.content.Context context, java.lang.String str) {
        return V(context, str, 0, null);
    }

    public static android.widget.Toast U(android.content.Context context, java.lang.String str, int i17) {
        return V(context, str, i17, null);
    }

    public static android.widget.Toast V(android.content.Context context, java.lang.String str, int i17, android.content.DialogInterface.OnDismissListener onDismissListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(context, str, 0);
        m125854x26a183b.show();
        return m125854x26a183b;
    }

    public static void W(android.content.Context context, java.lang.String str) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        dp.a.m125854x26a183b(context, str, 0).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.content.Context context, android.app.Dialog dialog) {
        if (context instanceof db5.b1) {
            ((db5.b1) context).mo53058xe5d1a549(dialog);
            if (context instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l) {
                if (dialog instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) {
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) dialog).M = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l) context;
                } else if (dialog instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2) {
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2) dialog).m81955xb46ce10((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l) context);
                }
            }
        }
    }

    public static android.app.Dialog b(android.content.Context context, java.lang.String str, java.util.List list, java.util.List list2, java.lang.String str2, db5.d1 d1Var) {
        c(context, str, list, list2, str2, "", true, d1Var, null);
        return null;
    }

    public static android.app.Dialog c(android.content.Context context, java.lang.String str, java.util.List list, java.util.List list2, java.lang.String str2, java.lang.String str3, boolean z17, db5.d1 d1Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if ((list == null || list.size() == 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        if (list == null) {
            list = new java.util.ArrayList();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = new db5.k0(str, list, list2, str2);
        k0Var.f293414s = new db5.l0(d1Var);
        k0Var.v();
        return null;
    }

    public static android.app.Dialog d(android.content.Context context, java.lang.String str, java.util.List list, java.util.List list2, java.lang.String str2, boolean z17, db5.d1 d1Var) {
        c(context, str, list, list2, str2, "", z17, d1Var, null);
        return null;
    }

    public static android.app.Dialog e(android.content.Context context, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, db5.c1 c1Var) {
        g(context, str, strArr, str2, "", true, c1Var, null);
        return null;
    }

    public static android.app.Dialog f(android.content.Context context, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, db5.c1 c1Var) {
        g(context, str, strArr, str2, str3, true, c1Var, null);
        return null;
    }

    public static android.app.Dialog g(android.content.Context context, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, boolean z17, db5.c1 c1Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        if ((strArr == null || strArr.length == 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (strArr != null && strArr.length > 0) {
            java.util.Collections.addAll(arrayList, strArr);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            arrayList.add(str2);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = new db5.m0(str, arrayList);
        k0Var.f293414s = new db5.n0(c1Var);
        k0Var.v();
        return null;
    }

    public static android.app.Dialog h(android.content.Context context, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, boolean z17, db5.c1 c1Var) {
        g(context, str, strArr, str2, "", z17, c1Var, null);
        return null;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 i(android.content.Context context, int i17, int i18) {
        return F(context, i17 > 0 ? j65.q.b(context, i17) : "", i18 > 0 ? j65.q.b(context, i18) : "", true);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j(android.content.Context context, int i17, int i18, int i19, int i27, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        if (i18 != 0) {
            i0Var.g(i18);
        }
        i0Var.d(i17);
        i0Var.f(i19);
        i0Var.f293354b.E = onClickListener;
        i0Var.e(i27);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.F = onClickListener2;
        aVar.G = new db5.q0(onClickListener2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        a17.show();
        a(context, a17);
        return a17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 k(android.content.Context context, int i17, int i18, int i19, int i27, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        return C(context, i17 > 0 ? j65.q.b(context, i17) : "", i18 > 0 ? j65.q.b(context, i18) : "", j65.q.b(context, i19), j65.q.b(context, i27), z17, onClickListener, onClickListener2);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 l(android.content.Context context, int i17, int i18, int i19, int i27, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, int i28) {
        return D(context, i17 > 0 ? j65.q.b(context, i17) : "", i18 > 0 ? j65.q.b(context, i18) : "", j65.q.b(context, i19), j65.q.b(context, i27), z17, onClickListener, onClickListener2, i28);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 m(android.content.Context context, int i17, int i18, android.content.DialogInterface.OnClickListener onClickListener) {
        return o(context, i17, i18, true, onClickListener);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 n(android.content.Context context, int i17, int i18, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        return v(context, i17 > 0 ? j65.q.b(context, i17) : "", i18 > 0 ? j65.q.b(context, i18) : "", onClickListener, onClickListener2, -1);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 o(android.content.Context context, int i17, int i18, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        if (i18 > 0) {
            aVar.f293242a = j65.q.a(context).getString(i18);
        }
        aVar.f293262s = j65.q.a(context).getString(i17);
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = onClickListener;
        aVar.A = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 p(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        if (i17 != 0) {
            aVar.f293242a = of5.b.a(context).getString(i17);
        }
        aVar.f293262s = str;
        aVar.f293265v = str2;
        aVar.E = onClickListener;
        aVar.f293266w = str3;
        aVar.F = onClickListener2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 q(android.content.Context context, java.lang.String str, android.view.View view, android.content.DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str;
        aVar.L = view;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = onClickListener;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 r(android.content.Context context, java.lang.String str, android.view.View view, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        return I(context, true, str, view, str2, str3, onClickListener, onClickListener2);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 s(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return F(context, str, str2, true);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 t(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener) {
        return G(context, str, str2, true, onClickListener);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 u(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        return v(context, str, str2, onClickListener, onClickListener2, -1);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 v(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, int i17) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = onClickListener;
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = onClickListener2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        if (i17 > 0) {
            j0Var.B(context.getResources().getColor(i17));
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 w(android.content.Context context, java.lang.String str, java.lang.String str2, android.view.View view, android.content.DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str;
        aVar.L = view;
        aVar.f293265v = str2;
        aVar.E = onClickListener;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 x(android.content.Context context, java.lang.String str, java.lang.String str2, android.view.View view, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str;
        aVar.f293262s = str2;
        aVar.L = view;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = onClickListener;
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = onClickListener2;
        aVar.G = new db5.s0(onClickListener2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 y(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener) {
        return E(context, str, str2, str3, true, onClickListener);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 z(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.view.View view, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str;
        aVar.f293262s = str2;
        aVar.L = view;
        aVar.f293265v = str3;
        aVar.E = onClickListener;
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = onClickListener2;
        aVar.G = new db5.r0(onClickListener2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        a(context, j0Var);
        return j0Var;
    }
}
