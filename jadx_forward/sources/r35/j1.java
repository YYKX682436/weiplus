package r35;

/* loaded from: classes9.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f450677a = {com.p314xaae8f345.mm.R.id.ocd, com.p314xaae8f345.mm.R.id.oce, com.p314xaae8f345.mm.R.id.ocf, com.p314xaae8f345.mm.R.id.ocg, com.p314xaae8f345.mm.R.id.och, com.p314xaae8f345.mm.R.id.oci, com.p314xaae8f345.mm.R.id.ocj, com.p314xaae8f345.mm.R.id.ock, com.p314xaae8f345.mm.R.id.ocl};

    public static java.lang.String a(android.view.View view) {
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.c_l);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    public static int b(android.view.View view) {
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.c_l);
        if (editText instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) {
            return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) editText).mo70737xc8d30aa0();
        }
        return 0;
    }

    public static void c(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, db5.d5 d5Var) {
        ((android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.c_6)).setOnClickListener(new r35.s0(jVar, view, d5Var));
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.c_7);
        if (button != null) {
            button.setOnClickListener(new r35.t0(jVar, d5Var));
        }
    }

    public static void d(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() == 0) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572474bb3);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || str2.length() == 0) {
            str2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        }
        j0Var.A(str, true, new r35.d1(j0Var, jVar));
        j0Var.w(str2, true, new r35.e1(j0Var, jVar2));
    }

    public static void e(com.p314xaae8f345.mm.ui.ga gaVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, android.view.View view, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() == 0) {
            str = gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572474bb3);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.f293265v = str;
        aVar.E = new r35.o0(jVar, view);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        i0Var.f293354b.F = new r35.p0(jVar);
    }

    public static void f(android.view.View view, int i17, java.lang.String str, boolean z17, int i18) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(i17);
        iz5.a.g(null, textView != null);
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(i18);
        } else {
            textView.setText(str);
        }
    }

    public static void g(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var, java.lang.Object obj) {
        if (obj != null) {
            java.util.List<java.lang.String> P1 = obj instanceof java.lang.String ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) obj).split(",")) : obj instanceof java.util.List ? (java.util.List) obj : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(P1)) {
                return;
            }
            if (P1.size() != 1) {
                android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a09, null);
                int i17 = 0;
                for (java.lang.String str : P1) {
                    if (i17 <= 8 && inflate != null) {
                        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(f450677a[i17]);
                        if (str != null) {
                            imageView.setVisibility(0);
                            ng5.a.a(imageView, str);
                            i17++;
                        }
                    }
                }
                i0Var.f293354b.M = inflate;
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0p);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
                aVar.f293242a = string;
                aVar.S = 3;
                return;
            }
            java.lang.String str2 = (java.lang.String) P1.get(0);
            i65.a.b(context, (int) (i65.a.q(context) * 20.0f));
            android.text.SpannableString Ai = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i27).toString());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = i0Var.f293354b;
            aVar2.f293242a = Ai;
            aVar2.S = 3;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str2);
            i65.a.b(context, (int) (i65.a.q(context) * 14.0f));
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar3 = i0Var.f293354b;
            if (!R4) {
                i0Var.c(str2, ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, e17.toString()), java.lang.Boolean.FALSE, null, new r35.b1());
                aVar3.f293255l = new r35.c1(str2, context);
                return;
            }
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            android.text.SpannableString Ai2 = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, (e17 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifo, java.lang.Integer.valueOf(c01.v1.o(str2)))).toString());
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a48, (android.view.ViewGroup) null);
            android.widget.GridView gridView = (android.widget.GridView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.bgk);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            java.util.List m17 = c01.v1.m(str2);
            i0Var.c(str2, Ai2, java.lang.Boolean.TRUE, new r35.u0(inflate2, arrayList, str2, m17), new r35.y0());
            aVar3.f293256m = new r35.a1(i0Var, context, str2);
            gridView.setAdapter((android.widget.ListAdapter) new r35.n2(context, m17, arrayList));
            gridView.setSelector(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e)));
            if (m17 != null) {
                if (((java.util.LinkedList) m17).size() > 16) {
                    gridView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561168ba)));
                    gridView.setPadding(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561165b7), 0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561165b7), 0);
                } else {
                    gridView.setPadding(0, 0, 0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561162b4));
                }
            }
            aVar3.N = inflate2;
        }
    }

    public static void h(com.p314xaae8f345.mm.ui.ga gaVar, db5.d5 d5Var) {
        try {
            if (gaVar.x().isFinishing()) {
                return;
            }
            d5Var.setInputMethodMode(1);
            d5Var.setSoftInputMode(16);
            d5Var.setFocusable(true);
            d5Var.setTouchable(true);
            d5Var.showAtLocation(gaVar.x().getWindow().getDecorView(), 17, 0, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "show dialog fail: %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMConfirmDialog", e17, "", new java.lang.Object[0]);
        }
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 i(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, android.view.View view, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k kVar) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x17 = gaVar.x();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.A = false;
        aVar.B = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x18 = gaVar.x();
        aVar.f293242a = str;
        aVar.O = x18.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        aVar.P = 2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || str2.length() == 0) {
            str2 = gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572474bb3);
        }
        aVar.f293265v = str2;
        aVar.E = new r35.q0(kVar);
        aVar.f293266w = of5.b.a(x17).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = new r35.r0(kVar);
        aVar.L = view;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(x17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.B(gaVar.x().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
        j0Var.show();
        return j0Var;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        android.widget.EditText editText;
        if ((str == null || str.length() == 0) && (str3 == null || str3.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        android.view.View inflate = android.view.View.inflate(gaVar.x(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570207a03, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(gaVar.x());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.A = false;
        aVar.B = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x17 = gaVar.x();
        aVar.f293242a = str;
        aVar.O = x17.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        aVar.P = 2;
        if (inflate != null && (editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_l)) != null) {
            editText.setVisibility(z17 ? 0 : 8);
        }
        e(gaVar, i0Var, jVar, inflate, str5);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_k);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x18 = gaVar.x();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(x18, str3, textSize));
        if (str4 == null || str4.length() == 0) {
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.c_f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_f)).setText(str4);
        }
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(gaVar.x(), 120.0f);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_m);
        if (c19659x677e0913 != null) {
            c19659x677e0913.b(str2, d17, d17, -1);
        }
        aVar.L = inflate;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        a17.show();
        return a17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 k(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        java.lang.String string = gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za);
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(gaVar.x());
        java.lang.String string2 = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string2 != null) {
            g(gaVar.x(), i0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(string2.split(",")));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.C = true;
        aVar.f293263t = string + str;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f293249f = true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str4, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 l(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem2 fail, message is empty");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(string.split(",")));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.C = true;
        aVar.f293263t = str;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f293249f = true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str3, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 m(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        if (str == null || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, img does not exist");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(string.split(",")));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.C = true;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f293249f = true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.graphics.Bitmap i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str);
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
            if (i07 != null) {
                if (a17 != 0) {
                    i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(i07, a17);
                }
                aVar.f293260q = i07;
                aVar.D = true;
                aVar.T = 3;
                aVar.H = new r35.w0(i07);
                aVar.C = false;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a18 = i0Var.a();
        d(gaVar.x(), a18, str3, null, jVar, jVar);
        a18.show();
        return a18;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 n(com.p314xaae8f345.mm.ui.ga gaVar, byte[] bArr, java.lang.String str, boolean z17, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, imgData is null");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(string.split(",")));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.C = true;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f293249f = true;
        }
        if (bArr.length > 0) {
            int length = bArr.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem3", "(Lcom/tencent/mm/ui/MMActivityController;[BLjava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem3", "(Lcom/tencent/mm/ui/MMActivityController;[BLjava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 c10401x212d30 = new com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30();
            c10401x212d30.m43595x92b714fd(bArr);
            int m43592x7a249f0b = c10401x212d30.m43592x7a249f0b();
            if (decodeByteArray != null) {
                if (m43592x7a249f0b != 0) {
                    decodeByteArray = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(decodeByteArray, m43592x7a249f0b);
                }
                aVar.f293260q = decodeByteArray;
                aVar.D = true;
                aVar.T = 3;
                aVar.H = new r35.w0(decodeByteArray);
                aVar.C = false;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str2, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 o(com.p314xaae8f345.mm.ui.ga gaVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        return p(gaVar, i17, str, str2, str3, z17, "", jVar);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 p(com.p314xaae8f345.mm.ui.ga gaVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(string.split(",")));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.C = true;
        aVar.f293263t = (i17 == com.p314xaae8f345.mm.R.raw.f78420x7116241b ? gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv) : i17 == com.p314xaae8f345.mm.R.raw.f80683x65f07627 ? gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572027wn) : i17 == com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc ? gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi) : gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571542ic)) + str;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f293249f = true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str4, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 q(com.p314xaae8f345.mm.ui.ga gaVar, byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        return r(gaVar, bArr, str, str2, str3, z17, i17, "", jVar);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 r(com.p314xaae8f345.mm.ui.ga gaVar, byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, java.lang.String str4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        g(gaVar.x(), i0Var, string != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(string.split(",")) : null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.C = true;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i17 != 1 ? i17 != 2 ? gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571542ic) : gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572027wn) : gaVar.x().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi));
        stringBuffer.append(str);
        aVar.f293263t = stringBuffer.toString();
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f293249f = true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str4, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static db5.d5 s(com.p314xaae8f345.mm.ui.ga gaVar, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        android.view.View inflate = ((android.view.LayoutInflater) gaVar.x().getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570209a06, (android.view.ViewGroup) null);
        db5.d5 d5Var = new db5.d5(inflate, -1, -1);
        c(inflate, jVar, d5Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
            return null;
        }
        f(inflate, com.p314xaae8f345.mm.R.id.c_o, str, false, 0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_k);
        c21526xca364659.m79266x3b2de958(true);
        c21526xca364659.i(0, gaVar.x().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k) * i65.a.q(gaVar.x()));
        c21526xca364659.m79272x1c5c5ff4(i65.a.e(gaVar.x(), com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        ((c01.y) ((qk.l6) i95.n0.c(qk.l6.class))).getClass();
        s01.h z07 = r01.q3.Ui().z0(j17);
        if (z07.y0()) {
            str5 = z07.f69171x736d1fa8;
            str6 = z07.f69175x35be6339;
            str7 = z07.f69170x75756b18;
        } else {
            qk.m6 m6Var = (qk.m6) i95.n0.c(qk.m6.class);
            java.lang.String str8 = z07.f69169xf75e5c37;
            ((c01.d0) m6Var).getClass();
            s01.a0 y07 = r01.q3.Vi().y0(str8);
            if (y07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMConfirmDialog", "showDialogItem8 userInfo is null");
                return null;
            }
            str5 = y07.f65841xdde069b;
            str6 = y07.f65837x35be6339;
            str7 = y07.f65836x75756b18;
        }
        if (str5 == null) {
            str5 = str2;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x17 = gaVar.x();
            float m79234x40077844 = c21526xca364659.m79234x40077844();
            ((ke0.e) xVar).getClass();
            c21526xca364659.m79270x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(x17, str2, m79234x40077844));
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x18 = gaVar.x();
            float m79234x400778442 = c21526xca364659.m79234x40077844();
            ((ke0.e) xVar2).getClass();
            c21526xca364659.m79270x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(x18, str5, m79234x400778442));
        }
        f(inflate, com.p314xaae8f345.mm.R.id.c_g, str3, true, 8);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_6);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            button.setText(str4);
        }
        button.setOnClickListener(new r35.g1(jVar, inflate, d5Var));
        o11.f fVar = new o11.f();
        fVar.f423616g = qk.b.a(str7);
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        o11.g a17 = fVar.a();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            n11.a.b().h(str6, (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_m), a17);
        }
        h(gaVar, d5Var);
        return d5Var;
    }
}
