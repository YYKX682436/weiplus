package l34;

/* loaded from: classes12.dex */
public final class h implements l34.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l34.h f396968a = new l34.h();

    @Override // l34.b
    public int a() {
        java.lang.Object obj;
        try {
            android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("launcher_shortcut_permission_settings");
            arrayList.add(contentResolver);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            java.lang.String str = (java.lang.String) yj0.a.k(obj2, arrayList.toArray(), "com/tencent/mm/plugin/shortcut/permission/OppoShortcutInstallAdapter", "checkPermissionStatus", "()I", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
            java.util.Iterator it = r26.n0.f0(str.subSequence(1, str.length() - 1).toString(), new java.lang.String[]{"/"}, false, 0, 6, null).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getApplicationId(...)");
                if (r26.i0.A((java.lang.String) next, str2, false, 2, null)) {
                    obj = next;
                    break;
                }
            }
            java.lang.String str3 = (java.lang.String) obj;
            if (str3 != null) {
                return 1 == java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) r26.n0.f0(str3, new java.lang.String[]{","}, false, 0, 6, null).get(1)).toString()) ? 0 : 1;
            }
            return -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OppoShortcutInstallAdapter", e17, "checkPermissionStatus fail", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // l34.b
    public boolean b() {
        android.content.pm.PackageManager packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager();
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity"));
        intent.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return !nf.c.a(queryIntentActivities) && queryIntentActivities.get(0).activityInfo.exported;
    }

    @Override // l34.b
    public void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        l34.g.f396967a.b(context);
    }
}
