package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f290307a = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyv) + "/wework_admin/commdownload?from=conv%s";

    public static int a(android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        r01.m y07 = r01.q3.bj().y0(str);
        if ((y07 == null || (y07.f66042xdda8b7c & 2) == 0) ? false : true) {
            return (y07.f66047xed01805d < y07.f66048x2e6e2183 || com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(context, "com.tencent.wework")) ? 2 : 1;
        }
        return 0;
    }

    public static void b(android.content.Context context, java.lang.String str, int i17) {
        android.content.Intent launchIntentForPackage;
        f(str, 1, i17);
        e(str, 2, i17);
        r01.m J0 = r01.q3.bj().J0(str);
        java.lang.String str2 = null;
        if (4 == i17 || 3 == i17) {
            r01.q3.bj().getClass();
            if (r01.q.f449719g == null) {
                r01.q.f449719g = new r45.ud();
            }
            java.lang.String str3 = r01.q.f449719g.f468785h;
            if (str3 != null && str3.length() > 0 && str3.toLowerCase().startsWith("http")) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str3);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            str2 = str3;
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(context, "com.tencent.wework")) {
            f(str, 2, i17);
            android.content.pm.PackageInfo a17 = ik1.b.a(context, "com.tencent.wework");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.versionName) || a17.versionName.compareTo("1.3.3") < 0) {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.wework");
            } else {
                launchIntentForPackage = new android.content.Intent();
                launchIntentForPackage.setAction("android.intent.action.VIEW");
                if ((i17 == 4 || 3 == i17) && str2 != null && str2.length() > 0) {
                    launchIntentForPackage.setData(android.net.Uri.parse(str2));
                } else {
                    launchIntentForPackage.setData(android.net.Uri.parse((i17 == 2 || i17 == 4 || i17 == 6) ? "wxwork://createconversation" : "wxwork://conversationlist"));
                }
            }
            p95.a.a(new com.p314xaae8f345.mm.ui.g4(context, launchIntentForPackage));
            return;
        }
        if (J0.f66041xa74c45a8) {
            db5.e1.j(context, com.p314xaae8f345.mm.R.C30867xcad56011.c1q, 0, com.p314xaae8f345.mm.R.C30867xcad56011.c1p, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new com.p314xaae8f345.mm.ui.d4(context, str, i17), null);
            return;
        }
        if (!J0.f66040x9ac9caa3) {
            c(context, str, i17);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.c1p);
        r01.q bj6 = r01.q3.bj();
        r01.q3.bj();
        java.lang.String z07 = bj6.z0(1);
        if (z07 == null) {
            u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1q));
        } else {
            u1Var.g(z07);
        }
        u1Var.c(new com.p314xaae8f345.mm.ui.e4(), new com.p314xaae8f345.mm.ui.f4(context, str, i17));
        u1Var.q(false);
    }

    public static void c(android.content.Context context, java.lang.String str, int i17) {
        f(str, 3, i17);
        e(str, 3, i17);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r01.q3.cj().d1(str)) ? "off" : "on";
        java.lang.String format = java.lang.String.format(f290307a, objArr);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 r17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().r(format);
        if (r17 != null && r17.f178496f == 3 && com.p314xaae8f345.mm.vfs.w6.j(r17.f178497g)) {
            com.p314xaae8f345.mm.vfs.w6.h(r17.f178497g);
        }
        gw4.f fVar = new gw4.f(context);
        fVar.f357690b = "mmdownloadapp_P1JsSxoAvEuC7tny5Q";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
    }

    public static void d(android.content.Context context, java.lang.String str) {
        r01.q bj6;
        r01.m J0;
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(context, "com.tencent.wework") || (i17 = (J0 = (bj6 = r01.q3.bj()).J0(str)).f66047xed01805d) >= J0.f66048x2e6e2183) {
            return;
        }
        J0.f66047xed01805d = i17 + 1;
        bj6.P0(J0);
    }

    public static void e(java.lang.String str, int i17, int i18) {
        qk.o b17 = r01.q3.cj().b1(str);
        if (i18 == 3) {
            i18 = 2;
        }
        int i19 = i18 != 4 ? i18 : 3;
        if (b17.G0()) {
            str = b17.y0();
        }
        r01.m y07 = r01.q3.bj().y0(str);
        gm0.j1.n().f354821b.g(new r01.h3(y07, 1, i17, i19, 0, new java.lang.Object()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15162, java.lang.Long.valueOf(y07.f66046x771ad30a), java.lang.Long.valueOf(y07.f66050x2a8d0441), java.lang.Integer.valueOf(y07.f66034x736dcb67 ? 1 : 0), java.lang.Integer.valueOf(y07.f66049x4e116875), java.lang.Integer.valueOf(y07.f66040x9ac9caa3 ? 1 : 0), java.lang.Integer.valueOf(y07.f66044xde11b4a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
    }

    public static int f(java.lang.String str, int i17, int i18) {
        qk.o b17 = r01.q3.cj().b1(str);
        if (b17.G0()) {
            str = b17.y0();
        }
        r01.m y07 = r01.q3.bj().y0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13656, java.lang.Integer.valueOf(y07 != null ? y07.f66038x29b98d8d : 0), java.lang.Integer.valueOf(y07 != null ? y07.f66045x6bcd764a : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(y07 != null ? y07.f66046x771ad30a : 0L), java.lang.Long.valueOf(y07 != null ? y07.f66050x2a8d0441 : 0L));
        return i18;
    }
}
