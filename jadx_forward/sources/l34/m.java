package l34;

/* loaded from: classes12.dex */
public final class m implements l34.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l34.m f396974a = new l34.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f396975b;

    static {
        java.lang.reflect.Method method;
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            method = android.app.AppOpsManager.class.getMethod("noteOpNoThrow", cls, cls, java.lang.String.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XiaomiShortcutInstallAdapter", e17, "reflect noteOpNoThrowMethod fail", new java.lang.Object[0]);
            method = null;
        }
        f396975b = method;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    @Override // l34.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.XiaomiShortcutInstallAdapter"
            java.lang.String r1 = "checkPermissionStatus, mode: "
            r2 = -1
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.reflect.Method r6 = l34.m.f396975b     // Catch: java.lang.Exception -> L74
            if (r6 != 0) goto L12
            java.lang.String r1 = "checkPermissionStatus, noteOpNoThrowMethod is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Exception -> L74
            return r2
        L12:
            android.content.Context r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Exception -> L74
            java.lang.String r8 = "appops"
            java.lang.Object r8 = r7.getSystemService(r8)     // Catch: java.lang.Exception -> L74
            boolean r9 = r8 instanceof android.app.AppOpsManager     // Catch: java.lang.Exception -> L74
            if (r9 == 0) goto L21
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8     // Catch: java.lang.Exception -> L74
            goto L22
        L21:
            r8 = r4
        L22:
            if (r8 != 0) goto L2a
            java.lang.String r1 = "checkPermissionStatus, appOpsManager is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Exception -> L74
            return r2
        L2a:
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L74
            r10 = 10017(0x2721, float:1.4037E-41)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L74
            r9[r5] = r10     // Catch: java.lang.Exception -> L74
            android.content.pm.ApplicationInfo r10 = r7.getApplicationInfo()     // Catch: java.lang.Exception -> L74
            int r10 = r10.uid     // Catch: java.lang.Exception -> L74
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L74
            r9[r3] = r10     // Catch: java.lang.Exception -> L74
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Exception -> L74
            r10 = 2
            r9[r10] = r7     // Catch: java.lang.Exception -> L74
            java.lang.Object r6 = r6.invoke(r8, r9)     // Catch: java.lang.Exception -> L74
            boolean r7 = r6 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L74
            if (r7 == 0) goto L53
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L74
            goto L54
        L53:
            r6 = r4
        L54:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
            r7.<init>(r1)     // Catch: java.lang.Exception -> L74
            r7.append(r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L74
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L74
            if (r6 != 0) goto L66
            goto L6e
        L66:
            int r1 = r6.intValue()     // Catch: java.lang.Exception -> L74
            if (r1 != 0) goto L6e
            r1 = r3
            goto L6f
        L6e:
            r1 = r5
        L6f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L74
            goto L7d
        L74:
            r1 = move-exception
            java.lang.String r6 = "reflect call noteOpNoThrow fail"
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r6, r7)
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "checkPermissionStatus, isAllowed: "
            r1.<init>(r6)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            if (r0 == 0) goto L98
            r2 = r5
            goto La4
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            if (r0 == 0) goto La2
            r2 = r3
            goto La4
        La2:
            if (r4 != 0) goto La5
        La4:
            return r2
        La5:
            jz5.j r0 = new jz5.j
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l34.m.a():int");
    }

    @Override // l34.b
    public boolean b() {
        android.content.pm.PackageManager packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager();
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return !nf.c.a(queryIntentActivities) && queryIntentActivities.get(0).activityInfo.exported;
    }

    @Override // l34.b
    public void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        l34.l.f396973a.b(context);
    }
}
