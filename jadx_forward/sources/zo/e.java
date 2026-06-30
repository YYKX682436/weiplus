package zo;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f556063a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r7 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r7, android.content.Intent r8, java.lang.String r9, android.net.Uri r10) {
        /*
            boolean r7 = android.text.TextUtils.isEmpty(r9)
            r8 = 0
            r10 = 0
            if (r7 != 0) goto L8b
            com.tencent.mm.vfs.z7 r7 = com.p314xaae8f345.mm.vfs.z7.a(r9)
            java.lang.String r0 = r7.f294812f
            if (r0 == 0) goto L29
            java.lang.String r4 = com.p314xaae8f345.mm.vfs.e8.l(r0, r10, r10)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L29
            com.tencent.mm.vfs.z7 r0 = new com.tencent.mm.vfs.z7
            java.lang.String r2 = r7.f294810d
            java.lang.String r3 = r7.f294811e
            java.lang.String r5 = r7.f294813g
            java.lang.String r6 = r7.f294814h
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7 = r0
        L29:
            com.tencent.mm.vfs.b3 r0 = com.p314xaae8f345.mm.vfs.a3.f294314a
            com.tencent.mm.vfs.z2 r7 = r0.m(r7, r8)
            boolean r0 = r7.a()
            if (r0 != 0) goto L37
            r7 = r10
            goto L3f
        L37:
            com.tencent.mm.vfs.q2 r0 = r7.f294799a
            java.lang.String r7 = r7.f294800b
            boolean r7 = r0.F(r7)
        L3f:
            if (r7 == 0) goto L8a
            com.tencent.mm.vfs.z7 r7 = com.p314xaae8f345.mm.vfs.z7.a(r9)
            java.lang.String r0 = r7.f294812f
            if (r0 == 0) goto L62
            java.lang.String r4 = com.p314xaae8f345.mm.vfs.e8.l(r0, r10, r10)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L62
            com.tencent.mm.vfs.z7 r0 = new com.tencent.mm.vfs.z7
            java.lang.String r2 = r7.f294810d
            java.lang.String r3 = r7.f294811e
            java.lang.String r5 = r7.f294813g
            java.lang.String r6 = r7.f294814h
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7 = r0
        L62:
            com.tencent.mm.vfs.b3 r0 = com.p314xaae8f345.mm.vfs.a3.f294314a
            com.tencent.mm.vfs.z2 r7 = r0.m(r7, r8)
            boolean r0 = r7.a()
            if (r0 != 0) goto L70
            r7 = r10
            goto L88
        L70:
            com.tencent.mm.vfs.q2 r0 = r7.f294799a
            java.lang.String r7 = r7.f294800b
            java.lang.String r1 = r0.D(r7, r10)
            if (r1 == 0) goto L84
            java.io.File r7 = new java.io.File
            r7.<init>(r1)
            boolean r7 = r7.canRead()
            goto L88
        L84:
            boolean r7 = r0.F(r7)
        L88:
            if (r7 != 0) goto L8b
        L8a:
            return r10
        L8b:
            r7 = 1
            if (r9 == 0) goto L9b
            java.io.InputStream r8 = com.p314xaae8f345.mm.vfs.w6.E(r9)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L98
            r10 = r7
            goto L9b
        L94:
            r7 = move-exception
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            throw r7
        L98:
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            goto L9e
        L9b:
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r8)
        L9e:
            if (r10 == 0) goto Lad
            j62.e r8 = j62.e.g()
            java.lang.String r9 = "clicfg_check_media_only_part_permission"
            int r8 = r8.i(r9, r7, r7, r7)
            if (r8 == r7) goto Lad
            return r7
        Lad:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.e.a(android.content.Context, android.content.Intent, java.lang.String, android.net.Uri):boolean");
    }

    public static boolean b(android.content.Context context) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (android.os.Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            return false;
        }
        if (fp.e0.h()) {
            return b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0 && b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_IMAGES") != 0;
        }
        if (b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            return (b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_IMAGES") == 0 && b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int r10) {
        /*
            r0 = 1
            if (r10 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r2 = "appops"
            java.lang.Object r1 = r1.getSystemService(r2)
            r2 = 2
            r3 = 3
            r4 = 0
            java.lang.String r5 = "MicroMsg.PermissionUtil"
            if (r1 == 0) goto L4a
            java.lang.String r6 = "android.app.AppOpsManager"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L3b
            java.lang.String r7 = "checkOpNoThrow"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L3b
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L3b
            r8[r4] = r9     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L3b
            r8[r0] = r9     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L3b
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L3b
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L3b
            goto L4b
        L2c:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "ClassNotFoundException class:android.app.AppOpsManager! Error:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7, r6)
            goto L4a
        L3b:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "onVoiceRcdStartRequest meizu NoSuchMethodException method:checkOpNoThrow! Error:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7, r6)
        L4a:
            r6 = 0
        L4b:
            if (r6 == 0) goto L92
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L72
            r3[r4] = r10     // Catch: java.lang.Exception -> L72
            android.content.Context r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Exception -> L72
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()     // Catch: java.lang.Exception -> L72
            int r10 = r10.uid     // Catch: java.lang.Exception -> L72
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L72
            r3[r0] = r10     // Catch: java.lang.Exception -> L72
            java.lang.String r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b     // Catch: java.lang.Exception -> L72
            r3[r2] = r10     // Catch: java.lang.Exception -> L72
            java.lang.Object r10 = r6.invoke(r1, r3)     // Catch: java.lang.Exception -> L72
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Exception -> L72
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> L72
            goto L81
        L72:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r1 = "invoke checkOpNoThrow Exception! Error:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r1, r10)
            r10 = -1
        L81:
            if (r10 == 0) goto L92
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "ret:%d showAlert to ask for record permission for wechat!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r0, r10)
            return r4
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.e.c(int):boolean");
    }

    public static boolean d() {
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            return c(26);
        }
        return true;
    }

    public static boolean e(android.content.Context context) {
        if (f556063a == null) {
            if (context != null) {
                try {
                    context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return f556063a.booleanValue();
    }

    public static boolean f(android.content.Context context) {
        try {
            boolean booleanValue = ((java.lang.Boolean) android.provider.Settings.class.getDeclaredMethod("canDrawOverlays", android.content.Context.class).invoke(null, context)).booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionUtil", "isFloatWindowOpAllowed allowed: " + booleanValue);
            return booleanValue;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionUtil", "getDeclaredMethod:canDrawOverlays! Error:%s, etype:%s", e17.getMessage(), e17.getClass().getCanonicalName());
            return true;
        }
    }

    public static void g(android.content.Context context) {
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName("com.android.settings", "com.android.settings.applications.AppsCheckReadPermission");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionUtil", "unable start activity AppsCheckReadPermission");
                try {
                    android.content.Intent intent2 = new android.content.Intent("android.settings.APP_OPS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionUtil", "unable start activity APP_OPS_SETTINGS");
                    try {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.setClassName("com.android.settings", "com.android.settings.Settings$AppControlSettingsActivity");
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(context, "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (java.lang.Exception unused3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionUtil", "unable start activity AppControlSettingsActivity");
                    }
                }
            }
        }
    }
}
