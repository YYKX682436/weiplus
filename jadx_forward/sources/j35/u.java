package j35;

/* loaded from: classes13.dex */
public abstract class u extends tb0.k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f379054a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f379055b = new java.util.HashMap();

    public static boolean a(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        return b(activity, str, i17, str2, str3, null, java.lang.Boolean.FALSE);
    }

    public static boolean b(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 v1Var, java.lang.Boolean bool) {
        try {
            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE") && android.os.Build.VERSION.SDK_INT > 30) {
                str = "android.permission.READ_EXTERNAL_STORAGE";
            }
            if (((!str.equals("android.permission.READ_EXTERNAL_STORAGE") || android.os.Build.VERSION.SDK_INT < 33 || activity.getApplicationInfo().targetSdkVersion < 33) ? b3.l.m9698x3fed0563(activity, str) : !c(activity) ? -1 : 0) == 0) {
                return true;
            }
            j(activity, i17, new j35.n(activity), new java.lang.String[]{str}, str2, str3);
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e17);
            return true;
        }
    }

    public static boolean c(android.content.Context context) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33 && (b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_IMAGES") == 0 || b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VIDEO") == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "full access on Android 13 (API level 33) or higher");
            return true;
        }
        if (i17 < 34 || b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0) {
            return context.getApplicationInfo().targetSdkVersion < 33 && b3.l.m9698x3fed0563(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "partial access on Android 14 (API level 34) or higher");
        return true;
    }

    public static boolean d(android.content.Context context, java.lang.String str, boolean z17) {
        return e(context, str);
    }

    public static boolean e(android.content.Context context, java.lang.String str) {
        if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str) && android.os.Build.VERSION.SDK_INT > 30) {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        boolean z17 = "android.permission.READ_EXTERNAL_STORAGE".equals(str) && android.os.Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 33;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "check permission: " + str + ", checkMedia: " + z17);
        if (z17) {
            return c(context);
        }
        try {
            return b3.l.m9698x3fed0563(context, str) == 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e17);
            return false;
        }
    }

    public static long f(java.lang.String str, int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("had_request_permission_" + str + "_" + i17, 0L);
    }

    public static void g(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, true, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "gotoSystemAppMgrUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "gotoSystemAppMgrUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MPermissionUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static boolean h(android.content.Context context, java.lang.String... strArr) {
        if (strArr.length == 0) {
            return false;
        }
        for (java.lang.String str : strArr) {
            if (!e(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static void i(android.app.Activity activity, java.lang.String str, int i17) {
        m(str, i17);
        j(activity, i17, new j35.o(activity), new java.lang.String[]{str}, "", "");
    }

    public static void j(android.content.Context context, int i17, j35.b0 b0Var, java.lang.String[] strArr, java.lang.String str, java.lang.String str2) {
        k(context, i17, b0Var, strArr, str, str2, null, null);
    }

    public static void k(android.content.Context context, int i17, j35.b0 b0Var, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i18;
        java.lang.String[] strArr2 = strArr;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "listener is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "requestPermission requestCode:%s", java.lang.Integer.valueOf(i17));
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i19 = 0; i19 < length; i19++) {
            iArr[i19] = 0;
        }
        if (h(context, strArr2)) {
            b0Var.mo2413x953457f1(i17, strArr2, iArr);
            return;
        }
        int i27 = 0;
        while (true) {
            if (i27 >= strArr2.length) {
                break;
            }
            if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(strArr2[i27]) && android.os.Build.VERSION.SDK_INT > 30) {
                strArr2[i27] = "android.permission.READ_EXTERNAL_STORAGE";
            }
            if (!"android.permission.READ_EXTERNAL_STORAGE".equals(strArr2[i27]) || (i18 = android.os.Build.VERSION.SDK_INT) < 33 || context.getApplicationInfo().targetSdkVersion < 33) {
                i27++;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(strArr));
                arrayList.removeAll(java.util.Arrays.asList("android.permission.READ_EXTERNAL_STORAGE"));
                if (i18 >= 34 && context.getApplicationInfo().targetSdkVersion >= 34) {
                    arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                }
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                strArr2 = (java.lang.String[]) arrayList.toArray(strArr2);
            }
        }
        java.lang.String[] strArr3 = strArr2;
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        f379054a.put(valueOf, b0Var);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e.class);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        intent.putExtra("requestCode", i17);
        intent.putExtra("permission", strArr3);
        intent.putExtra("key", valueOf);
        intent.putExtra("reasonTitle", str);
        intent.putExtra("reasonMsg", str2);
        intent.putExtra("forceReasonMsg", str3);
        if (str4 != null) {
            intent.putExtra("forceBusiness", str4);
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "requestPermission", "(Landroid/content/Context;ILcom/tencent/mm/pluginsdk/permission/PermissionListener;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "requestPermission", "(Landroid/content/Context;ILcom/tencent/mm/pluginsdk/permission/PermissionListener;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        for (java.lang.String str5 : strArr3) {
            m(str5, i17);
        }
    }

    public static void l(android.app.Activity activity, java.lang.String[] strArr, int i17) {
        try {
            for (java.lang.String str : strArr) {
                m(str, i17);
            }
            if ((activity instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) && ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) activity).m81207xe463babd(strArr, i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "requestPermissions: VAS finish");
            } else {
                z2.h.a(activity, strArr, i17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MPermissionUtil", th6, "requestPermissions err", new java.lang.Object[0]);
        }
    }

    public static void m(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("had_request_permission_" + str + "_" + i17, java.lang.System.currentTimeMillis());
    }

    public static void n(android.content.Intent intent, java.lang.String str, java.lang.String str2, j35.g0 g0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "startSettings reasonTitle:%s, reasonMsg:%s", str, str2);
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        f379055b.put(valueOf, g0Var);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        if (wVar.i() != null && wVar.i().get() != null) {
            context = (android.content.Context) wVar.i().get();
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e.class);
        intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        intent2.setSelector(intent);
        intent2.putExtra("key", valueOf);
        intent2.putExtra("reasonTitle", str);
        intent2.putExtra("reasonMsg", str2);
        try {
            if (!context.getPackageManager().getActivityInfo(new android.content.ComponentName(context, context.getClass()), 128).taskAffinity.contains("com.tencent.mm.finder")) {
                intent2.addFlags(268435456);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPermissionUtil", "processNameOfComponent: catch e: " + e17.getMessage());
            intent2.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        android.content.Context context2 = context;
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "startSettings", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/permission/SettingsListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "startSettings", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/permission/SettingsListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
