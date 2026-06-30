package sb0;

@j95.b
/* loaded from: classes13.dex */
public class f extends i95.w implements tb0.j, tb0.i {
    public boolean Ai(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        return j35.u.a(activity, str, i17, str2, str3);
    }

    public boolean Bi(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, j35.b0 b0Var) {
        java.util.HashMap hashMap = j35.u.f379054a;
        try {
            if (b3.l.m9698x3fed0563(context, str) == 0) {
                return true;
            }
            j35.u.j(context, i17, b0Var, new java.lang.String[]{str}, str2, str3);
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e17);
            return true;
        }
    }

    public boolean Di(android.app.Activity activity, java.lang.String[] strArr, int i17, java.lang.String str, java.lang.String str2) {
        return Ni(activity, strArr, i17, str, str2, null, null);
    }

    public boolean Ni(android.app.Activity activity, java.lang.String[] strArr, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, j35.b0 b0Var) {
        int i18;
        boolean b17;
        java.util.HashMap hashMap = j35.u.f379054a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "[checkPermissions]");
        if (strArr == null) {
            return true;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(strArr));
            if ((arrayList.contains("android.permission.READ_EXTERNAL_STORAGE") || arrayList.contains("android.permission.WRITE_EXTERNAL_STORAGE")) && (i18 = android.os.Build.VERSION.SDK_INT) >= 33 && activity.getApplicationInfo().targetSdkVersion >= 33) {
                arrayList.removeAll(java.util.Arrays.asList("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"));
                if (i18 >= 34 && activity.getApplicationInfo().targetSdkVersion >= 34) {
                    arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                }
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                b17 = zo.e.b(activity);
            } else {
                b17 = false;
            }
            char c17 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((java.lang.String) arrayList.get(i19)).equals("android.permission.WRITE_EXTERNAL_STORAGE") && android.os.Build.VERSION.SDK_INT > 30) {
                    arrayList.set(i19, "android.permission.READ_EXTERNAL_STORAGE");
                }
                c17 = !j35.u.e(activity, (java.lang.String) arrayList.get(i19)) ? (char) 65535 : (char) 0;
                if (c17 != 0) {
                    break;
                }
            }
            if (c17 != 0) {
                j35.u.k(activity, i17, new j35.m(activity, b0Var), strArr, str, str2, null, str3);
                return false;
            }
            if (!b17) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "isParticleMediaAccess");
            j35.u.k(activity, i17, new j35.l(activity, b0Var), strArr, str, str2, null, str3);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", e17);
            return true;
        }
    }

    public void Ri(android.app.Activity activity, int i17) {
        java.util.HashMap hashMap = j35.u.f379054a;
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + activity.getPackageName()));
        intent.addFlags(268435456);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(activity, intent, true, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/MPermissionUtil", "gotoSystemAppMgrUI", "(Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MPermissionUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public boolean Ui(android.content.Context context) {
        java.util.HashMap hashMap = j35.u.f379054a;
        return zo.e.f(context);
    }

    public void Vi(j35.a aVar) {
        j35.f0 f0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271058g;
        if (f0Var == null || f0Var.f379039a != aVar) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RequestFloatWindowPermissionDialog", "removeCallback");
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271058g.d();
    }

    public void Zi(int i17, j35.b0 b0Var, java.lang.String str) {
        j35.u.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17, b0Var, new java.lang.String[]{str}, null, null);
    }

    public void aj(android.content.Intent intent, j35.g0 g0Var) {
        j35.u.n(intent, "", "", g0Var);
    }

    public boolean wi(android.content.Context context) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return android.os.Build.VERSION.SDK_INT >= 34 && context.getApplicationInfo().targetSdkVersion >= 34 && b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0 && b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_IMAGES") != 0 && b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VIDEO") != 0;
    }
}
