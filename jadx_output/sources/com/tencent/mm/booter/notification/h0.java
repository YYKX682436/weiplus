package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f63485a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f63486b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f63487c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f63488d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f63489e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f63490f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f63491g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final android.net.Uri f63492h = android.net.Uri.parse("content://com.meizu.flyme.launcher.app_extras/badge_extras");

    /* renamed from: i, reason: collision with root package name */
    public static final android.net.Uri f63493i = android.net.Uri.parse("content://com.zte.mifavor.launcher.unreadbadge");

    /* renamed from: j, reason: collision with root package name */
    public static final android.content.ComponentName f63494j = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.ui.LauncherUI.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static boolean f63495k = true;

    /* renamed from: l, reason: collision with root package name */
    public static final android.net.Uri f63496l = android.net.Uri.parse("content://com.android.badge/badge");

    public static int a(android.app.Notification notification, qm.z zVar) {
        if (notification == null || !f63485a) {
            return 0;
        }
        int c17 = zVar == null ? 0 : zVar.c() - pm.f.f356752a.e();
        try {
            java.lang.Object newInstance = java.lang.Class.forName("android.app.MiuiNotification").newInstance();
            java.lang.reflect.Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, java.lang.Integer.valueOf(c17));
            notification.getClass().getField("extraNotification").set(notification, newInstance);
            com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "miuiNotification: %d", java.lang.Integer.valueOf(c17));
        } catch (java.lang.ClassNotFoundException unused) {
            f63485a = false;
        } catch (java.lang.IllegalAccessException unused2) {
            f63485a = false;
        } catch (java.lang.IllegalArgumentException unused3) {
            f63485a = false;
        } catch (java.lang.InstantiationException unused4) {
            f63485a = false;
        } catch (java.lang.NoSuchFieldException unused5) {
            f63485a = false;
        } catch (java.lang.Exception unused6) {
            f63485a = false;
        }
        return c17;
    }

    public static void b(java.lang.String str, int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusinessNotification", null, "normal badge context is null", new java.lang.Object[0]);
            return;
        }
        if (i17 < 0) {
            i17 = ip.l.b();
        }
        s75.d.f404635a.a(new com.tencent.mm.booter.notification.g0(context, str, i17), "normalNotification", false);
    }

    public static void c(boolean z17) {
        android.content.Context context;
        android.content.ContentResolver contentResolver;
        if (!f63495k || (context = com.tencent.mm.sdk.platformtools.x2.f193071a) == null || (contentResolver = context.getContentResolver()) == null) {
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "sync all user badge");
            android.os.Bundle call = contentResolver.call(f63496l, "getShortcutList", (java.lang.String) null, (android.os.Bundle) null);
            if (call == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "getShortcutList return null");
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusinessNotification", e17, "sync all user badge: no support getShortcutList", new java.lang.Object[0]);
        }
    }

    public static void d(int i17) {
        boolean z17;
        boolean z18;
        boolean z19;
        if (com.tencent.mm.sdk.platformtools.x2.f193071a != null) {
            if (f63490f) {
                z18 = f63489e;
            } else {
                f63490f = true;
                if (android.os.Build.BRAND.equals("samsung")) {
                    f63489e = true;
                    z18 = true;
                } else {
                    f63489e = false;
                    z18 = false;
                }
            }
            if (z18) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                int b17 = i17 == -1 ? ip.l.b() : i17;
                if (context != null) {
                    if (f63490f) {
                        z19 = f63489e;
                    } else {
                        f63490f = true;
                        if (android.os.Build.BRAND.equals("samsung")) {
                            f63489e = true;
                            z19 = true;
                        } else {
                            f63489e = false;
                            z19 = false;
                        }
                    }
                    if (z19 && f63491g != b17) {
                        f63491g = b17;
                        android.content.Intent intent = new android.content.Intent("android.intent.action.BADGE_COUNT_UPDATE");
                        intent.putExtra("badge_count", b17);
                        intent.putExtra("badge_count_package_name", com.tencent.mm.sdk.platformtools.x2.f193072b);
                        intent.putExtra("badge_count_class_name", com.tencent.mm.ui.LauncherUI.class.getName());
                        com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "samsungNotification: %d, %s", java.lang.Integer.valueOf(b17), android.os.Build.BRAND);
                        context.sendBroadcast(intent);
                    }
                }
            }
        }
        if (f63488d && -1 != i17) {
            s75.d.b(new com.tencent.mm.booter.notification.f0(i17), "huaweiNotification");
        }
        if (f63487c) {
            z17 = f63486b;
        } else {
            f63487c = true;
            java.lang.String str = android.os.Build.BRAND;
            if (str.equals("vivo") || str.equals("iQOO") || str.equals("JOVI")) {
                f63486b = true;
                z17 = true;
            } else {
                f63486b = false;
                z17 = false;
            }
        }
        if (z17 && -1 != i17) {
            try {
                android.content.Intent intent2 = new android.content.Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent2.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, com.tencent.mm.sdk.platformtools.x2.f193072b);
                intent2.putExtra("className", com.tencent.mm.ui.LauncherUI.class.getName());
                intent2.putExtra("notificationNum", i17);
                com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent2);
                com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "vivo badge: %d", java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e17) {
                f63486b = false;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusinessNotification", e17, "", new java.lang.Object[0]);
            }
        }
        if (com.tencent.mm.ui.bk.W()) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("package", com.tencent.mm.sdk.platformtools.x2.f193072b);
                bundle.putString("class", com.tencent.mm.ui.LauncherUI.class.getName());
                bundle.putInt("badge_number", i17);
                com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(f63492h, "change_badge", (java.lang.String) null, bundle);
                com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "meizuNotification %s , totalUnreadMsg:%s", java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.W()), java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BusinessNotification", "meizu executeBadge exception: " + e18);
            }
        }
        if (fp.e0.j() && android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("app_badge_pkg_name", com.tencent.mm.sdk.platformtools.x2.f193072b);
                android.content.ComponentName componentName = f63494j;
                bundle2.putString("app_badge_component_name", componentName.flattenToString());
                bundle2.putInt("app_badge_count", i17);
                bundle2.putInt("uid", android.os.Process.myUid());
                com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(f63493i, "setAppUnreadCount", (java.lang.String) null, bundle2);
                com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "zteNotification , totalUnreadMsg:%s", componentName.flattenToString(), java.lang.Integer.valueOf(i17));
                f63495k = false;
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BusinessNotification", "zte executeBadge exception: " + e19);
            }
        }
        b(null, i17);
    }

    public static void e(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusinessNotification", null, "syncUserBadge username is null", new java.lang.Object[0]);
            return;
        }
        java.lang.String e17 = xp1.c.e(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            return;
        }
        b(e17, i17);
    }
}
