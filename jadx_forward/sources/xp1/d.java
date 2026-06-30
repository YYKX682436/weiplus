package xp1;

/* loaded from: classes12.dex */
public abstract class d {
    public static void a(android.content.Context context, boolean z17, int i17, java.lang.String str, ae0.e eVar) {
        android.content.Intent intent = new android.content.Intent();
        int ordinal = eVar.ordinal();
        intent.putExtra("rawUrl", ordinal != 0 ? ordinal != 1 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4q) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oyw) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4y));
        intent.putExtra("showShare", false);
        intent.putExtra("extra_app_id", str);
        intent.putExtra("extra_permission_and_jump_status", i17);
        j45.l.j(context, "appbrand", ".ui.ShortCutPermissionDetailUI", intent, null);
        if (eVar == ae0.e.APP_BRAND) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15785, java.lang.Integer.valueOf(i17), 0, str);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15784, java.lang.Integer.valueOf(i17), 0, str);
            }
        }
    }

    public static void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var, int i17, java.lang.String str, boolean z17) {
        u1Var.f293531c.dismiss();
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15790, java.lang.Integer.valueOf(i17), 0, str);
        }
    }

    public static void c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "offline shorcut walletRegion : %s", java.lang.Integer.valueOf(intValue));
        if (intValue == 0 || intValue == 1 || intValue == 8) {
            arrayList.add(new android.content.pm.ShortcutInfo.Builder(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "launch_type_offline_wallet").setShortLabel(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4i)).setLongLabel(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4i)).setIcon(android.graphics.drawable.Icon.createWithResource(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.cbc)).setIntent(new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_offline_wallet")).build());
        }
        arrayList.add(new android.content.pm.ShortcutInfo.Builder(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "launch_type_scan_qrcode").setShortLabel(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfs)).setLongLabel(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfs)).setIcon(android.graphics.drawable.Icon.createWithResource(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.cbd)).setIntent(new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_scan_qrcode")).build());
        arrayList.add(new android.content.pm.ShortcutInfo.Builder(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "launch_type_my_qrcode").setShortLabel(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4h)).setLongLabel(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4h)).setIcon(android.graphics.drawable.Icon.createWithResource(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.cbb)).setIntent(new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_my_qrcode")).build());
        try {
            android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.content.pm.ShortcutManager.class);
            java.util.List<android.content.pm.ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            if (pinnedShortcuts != null && pinnedShortcuts.size() != 0) {
                java.util.Iterator<android.content.pm.ShortcutInfo> it = pinnedShortcuts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.content.pm.ShortcutInfo next = it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "pinnedShortcut id :" + next.getId());
                    if (next.getId().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfs))) {
                        xp1.c.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true), null, null, false);
                        break;
                    }
                }
            }
            shortcutManager.removeDynamicShortcuts(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{"launch_type_scan_qrcode", "launch_type_offline_wallet", "launch_type_my_qrcode"}));
            shortcutManager.addDynamicShortcuts(arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "remove error : %s", e17.getMessage());
        }
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.String substring;
        if (str == null || str.length() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "process name: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.Process.myPid()));
        return (!str.startsWith("shortcut_") || str.length() <= 9 || (substring = str.substring(9)) == null || substring.length() <= 0) ? str : xp1.c.h(new java.lang.String(xp1.c.n(substring)), str2);
    }

    public static android.content.Intent e(android.content.Context context, boolean z17) {
        android.content.Intent intent = new android.content.Intent(z17 ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfs));
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction");
        intent2.putExtra("LauncherUI.From.Scaner.Shortcut", true);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f78215x55a6ce90));
        intent.putExtra("shortcut_icon_resource_id", com.p314xaae8f345.mm.R.C30861xcebc809e.f78215x55a6ce90);
        return intent;
    }

    public static void f() {
        if (fp.h.c(25)) {
            bm5.o1 o1Var = bm5.o1.f104252a;
            if (!bm5.o1.f104255d.get()) {
                o1Var.n(new xp1.C30732x2e00fd());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "need addShortCuts");
                c();
            }
        }
    }

    public static void g(android.content.Context context, int i17, int i18, boolean z17, java.lang.String str, ae0.e eVar, yz5.a aVar) {
        android.content.res.Resources resources = context.getResources();
        ae0.e eVar2 = ae0.e.APP_BRAND;
        if (i17 == 0) {
            if (eVar == ae0.e.FINDER && aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4r), null, (android.app.Activity) context, null, null);
            if (eVar == eVar2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15787, java.lang.Integer.valueOf(i18), 0, str);
                return;
            }
            return;
        }
        if (z17) {
            if (i18 == 2 || i18 == 4) {
                android.content.res.Resources resources2 = context.getResources();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4r), resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4k), (android.app.Activity) context, new xp1.g(context, i18, str, eVar), null);
                if (eVar == eVar2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15787, java.lang.Integer.valueOf(i18), 0, str);
                }
            }
        }
    }

    public static void h(android.content.Context context, int i17, int i18, boolean z17, java.lang.String str, boolean z18) {
        g(context, i17, i18, z17, str, z18 ? ae0.e.APP_BRAND : ae0.e.OTHER, null);
    }

    public static ae0.g i(android.content.Context context, java.lang.String str, boolean z17, ae0.e eVar, ae0.f fVar) {
        int i17;
        boolean z18 = eVar == ae0.e.APP_BRAND;
        l34.i iVar = l34.i.f396969b;
        int a17 = iVar.a();
        boolean b17 = iVar.b();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6305xcbcd67f4 c6305xcbcd67f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6305xcbcd67f4();
        c6305xcbcd67f4.f136622d = z18 ? 1L : 0L;
        c6305xcbcd67f4.f136623e = c6305xcbcd67f4.b("AppId", str, true);
        c6305xcbcd67f4.f136624f = a17;
        c6305xcbcd67f4.f136625g = b17 ? 1 : 0;
        c6305xcbcd67f4.k();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        android.content.res.Resources resources = context.getResources();
        int i18 = -1;
        if (a17 == -1) {
            u1Var.f293529a.f293354b.f293248e = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4n);
            java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4p);
            java.lang.String string2 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4m);
            u1Var.u(string);
            if (b17) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569516d8, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f564464s5);
                android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.hro);
                textView.setText(string2);
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j4k);
                u1Var.d(linearLayout);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.j4j);
                u1Var.j(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571545ig));
                i17 = 2;
                textView2.setOnClickListener(new xp1.j(context, 2, str, eVar));
                u1Var.v(new xp1.k(iVar, context, z18, 2, str, u1Var, fVar));
            } else {
                i17 = 4;
                u1Var.g(string2);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.j4k);
                u1Var.j(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571545ig));
                u1Var.v(new xp1.l(context, 4, str, eVar, u1Var, z18, fVar));
            }
            i18 = i17;
        } else if (a17 == 1) {
            java.lang.String string3 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4o);
            java.lang.String string4 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4l);
            u1Var.j(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
            u1Var.u(string3);
            if (b17) {
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569516d8, (android.view.ViewGroup) null);
                android.widget.TextView textView3 = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.f564464s5);
                android.widget.TextView textView4 = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.hro);
                textView3.setText(string4);
                textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j4k);
                u1Var.d(linearLayout2);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.j4j);
                i18 = 1;
                textView4.setOnClickListener(new xp1.m(context, 1, str, eVar));
                u1Var.c(new xp1.n(u1Var, 1, str, z18), new xp1.o(iVar, context, z18, 1, str));
            } else {
                u1Var.g(string4);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.j4k);
                u1Var.j(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
                i18 = 3;
                u1Var.c(new xp1.e(u1Var, 3, str, z18), new xp1.f(context, 3, str, eVar));
            }
        }
        if (a17 == 0 || z17) {
            return new ae0.g(a17, i18, u1Var.f293531c);
        }
        u1Var.q(false);
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15788, java.lang.Integer.valueOf(i18), 0, str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "permissionJumpStatus = " + i18);
        return new ae0.g(a17, i18, u1Var.f293531c);
    }

    public static android.util.Pair j(android.content.Context context, java.lang.String str, boolean z17, boolean z18, ae0.f fVar) {
        ae0.g i17 = i(context, str, z17, z18 ? ae0.e.APP_BRAND : ae0.e.OTHER, fVar);
        return new android.util.Pair(java.lang.Integer.valueOf(i17.f84912a), java.lang.Integer.valueOf(i17.f84913b));
    }
}
