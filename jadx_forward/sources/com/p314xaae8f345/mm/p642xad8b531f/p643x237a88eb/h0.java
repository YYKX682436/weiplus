package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f145018a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f145019b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f145020c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f145021d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f145022e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f145023f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f145024g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final android.net.Uri f145025h = android.net.Uri.parse("content://com.meizu.flyme.launcher.app_extras/badge_extras");

    /* renamed from: i, reason: collision with root package name */
    public static final android.net.Uri f145026i = android.net.Uri.parse("content://com.zte.mifavor.launcher.unreadbadge");

    /* renamed from: j, reason: collision with root package name */
    public static final android.content.ComponentName f145027j = new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static boolean f145028k = true;

    /* renamed from: l, reason: collision with root package name */
    public static final android.net.Uri f145029l = android.net.Uri.parse("content://com.android.badge/badge");

    public static int a(android.app.Notification notification, qm.z zVar) {
        if (notification == null || !f145018a) {
            return 0;
        }
        int c17 = zVar == null ? 0 : zVar.c() - pm.f.f438285a.e();
        try {
            java.lang.Object newInstance = java.lang.Class.forName("android.app.MiuiNotification").newInstance();
            java.lang.reflect.Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, java.lang.Integer.valueOf(c17));
            notification.getClass().getField("extraNotification").set(notification, newInstance);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "miuiNotification: %d", java.lang.Integer.valueOf(c17));
        } catch (java.lang.ClassNotFoundException unused) {
            f145018a = false;
        } catch (java.lang.IllegalAccessException unused2) {
            f145018a = false;
        } catch (java.lang.IllegalArgumentException unused3) {
            f145018a = false;
        } catch (java.lang.InstantiationException unused4) {
            f145018a = false;
        } catch (java.lang.NoSuchFieldException unused5) {
            f145018a = false;
        } catch (java.lang.Exception unused6) {
            f145018a = false;
        }
        return c17;
    }

    public static void b(java.lang.String str, int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusinessNotification", null, "normal badge context is null", new java.lang.Object[0]);
            return;
        }
        if (i17 < 0) {
            i17 = ip.l.b();
        }
        s75.d.f486168a.a(new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.g0(context, str, i17), "normalNotification", false);
    }

    public static void c(boolean z17) {
        android.content.Context context;
        android.content.ContentResolver contentResolver;
        if (!f145028k || (context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == null || (contentResolver = context.getContentResolver()) == null) {
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "sync all user badge");
            android.os.Bundle call = contentResolver.call(f145029l, "getShortcutList", (java.lang.String) null, (android.os.Bundle) null);
            if (call == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "getShortcutList return null");
                return;
            }
            java.lang.String string = call.getString("shortcut_list");
            if (string != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    java.lang.String string2 = ((org.json.JSONObject) jSONArray.get(i17)).getString("app_shortcut_custom_id");
                    if (string2 != null && !string2.equalsIgnoreCase("null")) {
                        java.lang.String g17 = xp1.c.g(string2);
                        e(g17, z17 ? 0 : c01.h2.d(g17, null));
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusinessNotification", e17, "sync all user badge: no support getShortcutList", new java.lang.Object[0]);
        }
    }

    public static void d(int i17) {
        boolean z17;
        boolean z18;
        boolean z19;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a != null) {
            if (f145023f) {
                z18 = f145022e;
            } else {
                f145023f = true;
                if (android.os.Build.BRAND.equals("samsung")) {
                    f145022e = true;
                    z18 = true;
                } else {
                    f145022e = false;
                    z18 = false;
                }
            }
            if (z18) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                int b17 = i17 == -1 ? ip.l.b() : i17;
                if (context != null) {
                    if (f145023f) {
                        z19 = f145022e;
                    } else {
                        f145023f = true;
                        if (android.os.Build.BRAND.equals("samsung")) {
                            f145022e = true;
                            z19 = true;
                        } else {
                            f145022e = false;
                            z19 = false;
                        }
                    }
                    if (z19 && f145024g != b17) {
                        f145024g = b17;
                        android.content.Intent intent = new android.content.Intent("android.intent.action.BADGE_COUNT_UPDATE");
                        intent.putExtra("badge_count", b17);
                        intent.putExtra("badge_count_package_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                        intent.putExtra("badge_count_class_name", com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getName());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "samsungNotification: %d, %s", java.lang.Integer.valueOf(b17), android.os.Build.BRAND);
                        context.sendBroadcast(intent);
                    }
                }
            }
        }
        if (f145021d && -1 != i17) {
            s75.d.b(new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.f0(i17), "huaweiNotification");
        }
        if (f145020c) {
            z17 = f145019b;
        } else {
            f145020c = true;
            java.lang.String str = android.os.Build.BRAND;
            if (str.equals("vivo") || str.equals("iQOO") || str.equals("JOVI")) {
                f145019b = true;
                z17 = true;
            } else {
                f145019b = false;
                z17 = false;
            }
        }
        if (z17 && -1 != i17) {
            try {
                android.content.Intent intent2 = new android.content.Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent2.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                intent2.putExtra("className", com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getName());
                intent2.putExtra("notificationNum", i17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "vivo badge: %d", java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e17) {
                f145019b = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusinessNotification", e17, "", new java.lang.Object[0]);
            }
        }
        if (com.p314xaae8f345.mm.ui.bk.W()) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("package", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                bundle.putString("class", com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getName());
                bundle.putInt("badge_number", i17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().call(f145025h, "change_badge", (java.lang.String) null, bundle);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "meizuNotification %s , totalUnreadMsg:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.W()), java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BusinessNotification", "meizu executeBadge exception: " + e18);
            }
        }
        if (fp.e0.j() && android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("app_badge_pkg_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                android.content.ComponentName componentName = f145027j;
                bundle2.putString("app_badge_component_name", componentName.flattenToString());
                bundle2.putInt("app_badge_count", i17);
                bundle2.putInt("uid", android.os.Process.myUid());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().call(f145026i, "setAppUnreadCount", (java.lang.String) null, bundle2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "zteNotification , totalUnreadMsg:%s", componentName.flattenToString(), java.lang.Integer.valueOf(i17));
                f145028k = false;
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BusinessNotification", "zte executeBadge exception: " + e19);
            }
        }
        b(null, i17);
    }

    public static void e(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusinessNotification", null, "syncUserBadge username is null", new java.lang.Object[0]);
            return;
        }
        java.lang.String e17 = xp1.c.e(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            return;
        }
        b(e17, i17);
    }
}
