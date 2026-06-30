package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public abstract class i extends com.p314xaae8f345.mm.p2829xfa87f9de.j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f296372a;

    /* renamed from: b, reason: collision with root package name */
    public static uh0.q f296373b;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String b17 = b(str2);
        com.p314xaae8f345.mm.p2829xfa87f9de.q.a(str, b17);
        com.p314xaae8f345.p3210x3857dc.r1.a(str, b17);
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "getSafeRealPath filePath is empty");
            return str;
        }
        try {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "getSafeRealPath real path is empty, use old path %s", str);
                return str;
            }
            if (i17.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesReaderLogic", "getSafeRealPath real path is the same %s", i17);
                return i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesReaderLogic", "getSafeRealPath from %s to %s", str, i17);
            return i17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "getSafeRealPath error: %s", e17.getMessage());
            return str;
        }
    }

    public static android.view.ViewGroup c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, android.webkit.ValueCallback valueCallback, boolean z17, boolean z18) {
        uh0.q qVar;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571178da2, (android.view.ViewGroup) new android.widget.LinearLayout(abstractActivityC21394xb3d2c0cf.mo55332x76847179()), false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569309pt3);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569310pt5);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.pt6);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) inflate.findViewById(com.p314xaae8f345.mm.R.id.pt7);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569307pt1);
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569306pt0);
        if (textView == null || linearLayout == null || linearLayout2 == null || imageButton == null || linearLayout3 == null || imageButton2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "initView can not find view");
            return null;
        }
        linearLayout2.setVisibility(0);
        imageButton.setVisibility(0);
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p2829xfa87f9de.e(valueCallback));
        linearLayout3.setVisibility(0);
        if (z17) {
            imageButton2.setVisibility(0);
            imageButton2.setOnClickListener(new com.p314xaae8f345.mm.p2829xfa87f9de.f(valueCallback));
        } else {
            imageButton2.setVisibility(8);
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        textView.setText(str);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(abstractActivityC21394xb3d2c0cf);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(abstractActivityC21394xb3d2c0cf);
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setTag("view_tag_relative_layout");
        frameLayout.addView(relativeLayout);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b(abstractActivityC21394xb3d2c0cf, null);
        c0102x1f44235b.setLayoutParams(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams(-1, -2));
        if (c0102x1f44235b.f91030z == null) {
            c0102x1f44235b.f91030z = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = c0102x1f44235b.f91030z;
        q1Var.f91224h = false;
        q1Var.f91221e = 0;
        q1Var.f91217a = 0;
        q1Var.f91222f = 0;
        q1Var.f91218b = 0;
        c0102x1f44235b.setTag("view_tag_toolbar");
        frameLayout.addView(c0102x1f44235b);
        int color = abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
        if (z18) {
            linearLayout.setVisibility(8);
            textView.setVisibility(8);
            frameLayout.setBackgroundColor(-13421773);
            c0102x1f44235b.setBackgroundColor(3355443);
            h(abstractActivityC21394xb3d2c0cf, -13421773);
            imageButton.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bub);
            imageButton2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bud);
        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
            frameLayout.setBackgroundColor(-15132391);
            c0102x1f44235b.setBackgroundColor(color);
            h(abstractActivityC21394xb3d2c0cf, color);
            imageButton.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bub);
            imageButton2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bud);
        } else {
            frameLayout.setBackgroundColor(-3355444);
            c0102x1f44235b.setBackgroundColor(color);
            imageButton.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bu7);
            imageButton2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bu_);
        }
        if (!z18 && (qVar = f296373b) != null && (weakReference = qVar.f509268a) != null && (view = (android.view.View) weakReference.get()) != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 81;
            view.setLayoutParams(layoutParams);
            view.setTag("view_tag_bottom_bar");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xwebutil/FileReaderLogic", "initView", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Landroid/webkit/ValueCallback;ZZ)Landroid/view/ViewGroup;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/xwebutil/FileReaderLogic", "initView", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Landroid/webkit/ValueCallback;ZZ)Landroid/view/ViewGroup;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.addView(view);
        }
        try {
            abstractActivityC21394xb3d2c0cf.m2542xb4674770(c0102x1f44235b);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("XFilesReaderLogic", e17, "setSupportActionBar", new java.lang.Object[0]);
        }
        abstractActivityC21394xb3d2c0cf.setContentView(frameLayout);
        p012xc85e97e9.p016x746ad0e3.app.b N = al5.p0.N(abstractActivityC21394xb3d2c0cf.mo2533x106ab264());
        if (N == null) {
            return null;
        }
        N.F(false);
        N.B(false);
        N.E(false);
        N.D(true);
        N.y(inflate);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, boolean r38, java.util.HashMap r39, android.webkit.ValueCallback r40, android.webkit.ValueCallback r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2829xfa87f9de.i.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.HashMap, android.webkit.ValueCallback, android.webkit.ValueCallback, boolean):void");
    }

    public static void e(int i17, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, java.util.HashMap hashMap, android.webkit.ValueCallback valueCallback, android.webkit.ValueCallback valueCallback2, boolean z19) {
        by5.c4.f("FileReaderX5", "readFile by x5, fileExt: ".concat(str3 != null ? str3 : "null"));
        long m17 = com.p314xaae8f345.p3210x3857dc.n.m(str, str3);
        com.p314xaae8f345.p3210x3857dc.n.q(str3, "X5");
        if (str3 == null || str3.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportReadByX5Scene param is null");
        } else {
            java.lang.String lowerCase = str3.toLowerCase();
            com.p314xaae8f345.p3210x3857dc.l i18 = com.p314xaae8f345.p3210x3857dc.n.i(lowerCase);
            if (i18 == null) {
                by5.c4.b("XFilesReaderHelper", "reportReadByX5Scene idkey skip " + lowerCase);
            } else {
                java.lang.String str5 = lowerCase + "," + i17;
                by5.c4.b("XFilesReaderHelper", "reportReadByX5Scene kv key:17563, val:" + str5);
                by5.s0.t(17563, str5);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportReadByX5Scene idkey id:");
                int i19 = i18.f301859a;
                sb6.append(i19);
                sb6.append(", key:");
                sb6.append(i17);
                by5.c4.b("XFilesReaderHelper", sb6.toString());
                by5.s0.e(i19, i17, 1L);
            }
        }
        com.p314xaae8f345.p3210x3857dc.j jVar = new com.p314xaae8f345.p3210x3857dc.j(com.p314xaae8f345.p3210x3857dc.n.f(hashMap), str3, m17, "miniqb", -1, com.p314xaae8f345.p3210x3857dc.n.b(i17));
        long d17 = com.p314xaae8f345.p3210x3857dc.n.d(context);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jVar.f301842h = d17;
        jVar.f301849o = currentTimeMillis;
        com.p314xaae8f345.p3210x3857dc.n.o(jVar);
        by5.c4.f("FileReaderX5", "readFile by x5, disable x5, fileExt: ".concat(str3 != null ? str3 : "null"));
        jVar.a(com.p314xaae8f345.p3210x3857dc.n.d(context), java.lang.System.currentTimeMillis(), -100005, "miniqb_init_error_disable");
        com.p314xaae8f345.p3210x3857dc.n.p(jVar);
        if (str3 == null || str3.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportX5ErrorCode param is null");
        } else {
            java.lang.String lowerCase2 = str3.toLowerCase();
            com.p314xaae8f345.p3210x3857dc.l i27 = com.p314xaae8f345.p3210x3857dc.n.i(lowerCase2);
            if (i27 == null) {
                by5.c4.b("XFilesReaderHelper", "reportX5ErrorCode skip " + lowerCase2);
            } else {
                java.lang.String str6 = "-1," + lowerCase2 + ",-100005,x5init";
                by5.c4.b("XFilesReaderHelper", "reportX5ErrorCode kv key:17566, val:" + str6);
                by5.s0.t(17566, str6);
                boolean z27 = i27.f301860b;
                int i28 = z27 ? 15 : 14;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportX5ErrorCode idkey id:");
                int i29 = i27.f301859a;
                sb7.append(i29);
                sb7.append(", key:");
                sb7.append(i28);
                by5.c4.b("XFilesReaderHelper", sb7.toString());
                long j17 = i29;
                by5.s0.e(j17, i28, 1L);
                if (i17 == 49) {
                    int i37 = z27 ? 39 : 38;
                    by5.c4.b("XFilesReaderHelper", "reportX5ErrorCode XWeb and X5 All failed id:" + i29 + ", key:" + i37);
                    by5.s0.e(j17, (long) i37, 1L);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesReaderLogic", "readFileByX5 onReceiveValue: " + ((java.lang.Object) (-102)));
        valueCallback2.onReceiveValue(-102);
    }

    public static void f(android.app.Activity activity, java.lang.String filePath, java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17) {
        long k17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesReaderLogic", "sendFileToFriend, start filePath: " + filePath);
        com.p314xaae8f345.mm.p2829xfa87f9de.h hVar = new com.p314xaae8f345.mm.p2829xfa87f9de.h(j17, str3, filePath, str, str2, activity);
        ec5.a aVar = new ec5.a();
        aVar.l(filePath);
        int i17 = aVar.f125235d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(j17));
        aVar.set(i17 + 1, str3 != null ? str3 : "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = pt0.f0.f439742b1.k(str3, j17);
            v05.b bVar = new v05.b();
            java.lang.String j18 = k18 != null ? k18.j() : null;
            bVar.m126728xdc93280d(j18 != null ? j18 : "");
            k17 = com.p314xaae8f345.mm.vfs.w6.k(filePath);
            if (k17 <= 0) {
                v05.a aVar2 = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
                k17 = aVar2 != null ? aVar2.m75942xfb822ef2(aVar2.f449897d + 0) : 0L;
            }
        } else {
            k17 = com.p314xaae8f345.mm.vfs.w6.k(filePath);
        }
        aVar.k(n13.v.f415673a.b(str, str2, k17));
        n13.r a17 = n13.r.a(1);
        a17.f415652c = hVar;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, aVar, a17);
    }

    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        if (context == null || str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "sendResult wrong param");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("MINIQB_OPEN_RET");
        intent.putExtra("op_type", "NOTIFY_RET");
        intent.putExtra("file_path", str);
        intent.putExtra("file_ext", str2);
        intent.putExtra("MINIQB_OPEN_RET_VAL", i17);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        context.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
    }

    public static void h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        try {
            android.view.Window window = abstractActivityC21394xb3d2c0cf.getWindow();
            if (window == null) {
                return;
            }
            window.clearFlags(201326592);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i17);
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "updateStatusBarToDarkMode error ", e17);
        }
    }
}
