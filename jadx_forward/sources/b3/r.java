package b3;

/* loaded from: classes13.dex */
public abstract class r {
    public static int a(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2) {
        int c17;
        if (context.checkPermission(str, i17, i18) == -1) {
            return -1;
        }
        java.lang.String d17 = z2.p.d(str);
        if (d17 == null) {
            return 0;
        }
        if (str2 == null) {
            java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i18);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (!(android.os.Process.myUid() == i18 && m3.c.a(context.getPackageName(), str2))) {
            c17 = z2.p.c((android.app.AppOpsManager) z2.p.a(context, android.app.AppOpsManager.class), d17, str2);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.app.AppOpsManager c18 = z2.q.c(context);
            c17 = z2.q.a(c18, d17, android.os.Binder.getCallingUid(), str2);
            if (c17 == 0) {
                c17 = z2.q.a(c18, d17, i18, z2.q.b(context));
            }
        } else {
            c17 = z2.p.c((android.app.AppOpsManager) z2.p.a(context, android.app.AppOpsManager.class), d17, str2);
        }
        return c17 == 0 ? 0 : -2;
    }

    public static int b(android.content.Context context, java.lang.String str) {
        return a(context, str, android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName());
    }
}
