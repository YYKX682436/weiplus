package com.tencent.mm.app;

/* loaded from: classes7.dex */
public abstract class d7 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f53395a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Object f53396b;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r8 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if ((r8.values().toArray()[0] instanceof com.tencent.mm.ipcinvoker.BaseIPCService) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r8) {
        /*
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 != 0) goto L15
            return r1
        L15:
            r2 = 100
            int[] r2 = new int[]{r2}
            r3 = 300(0x12c, float:4.2E-43)
            r4 = 125(0x7d, float:1.75E-43)
            int[] r3 = new int[]{r3, r4}
            r4 = 1
            r5 = 2
            int[] r5 = new int[]{r4, r5}
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lce
            java.lang.Object r6 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6
            java.lang.String r7 = r6.processName
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L2d
            int r8 = r6.importance
            boolean r8 = yo.a.a(r2, r8)
            java.lang.String r0 = "MicroMsg.ToolsProcessLocker"
            if (r8 != 0) goto Lb1
            int r8 = r6.importance
            boolean r8 = yo.a.a(r3, r8)
            if (r8 == 0) goto La6
            java.lang.Object r8 = com.tencent.mm.app.d7.f53396b     // Catch: java.lang.Throwable -> L98
            if (r8 != 0) goto La3
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L98
            java.lang.Object r8 = c(r8)     // Catch: java.lang.Throwable -> L98
            com.tencent.mm.app.d7.f53396b = r8     // Catch: java.lang.Throwable -> L98
            d56.b r8 = d56.b.h(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "mServices"
            java.lang.reflect.Field r2 = r8.e(r2)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L98
            r2.getType()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L98
            java.lang.Object r8 = r8.f226632b     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L98
            java.lang.Object r8 = r2.get(r8)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L98
            android.util.ArrayMap r8 = (android.util.ArrayMap) r8     // Catch: java.lang.Throwable -> L98
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L98
            if (r2 > 0) goto L7b
            goto L8f
        L7b:
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L98
            if (r2 != r4) goto La3
            java.util.Collection r8 = r8.values()     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r8 = r8.toArray()     // Catch: java.lang.Throwable -> L98
            r8 = r8[r1]     // Catch: java.lang.Throwable -> L98
            boolean r8 = r8 instanceof com.tencent.mm.ipcinvoker.BaseIPCService     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto La3
        L8f:
            r8 = r4
            goto La4
        L91:
            r8 = move-exception
            d56.c r2 = new d56.c     // Catch: java.lang.Throwable -> L98
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L98
            throw r2     // Catch: java.lang.Throwable -> L98
        L98:
            r8 = move-exception
            java.lang.String r2 = "skipServiceConditionIfOnlyIPCServiceAlive, hack ActivityThread_mServices e=%s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.tencent.mars.xlog.Log.e(r0, r2, r8)
        La3:
            r8 = r1
        La4:
            if (r8 == 0) goto Lb1
        La6:
            int r8 = r6.importanceReasonCode
            boolean r8 = yo.a.a(r5, r8)
            if (r8 == 0) goto Laf
            goto Lb1
        Laf:
            r8 = r1
            goto Lb2
        Lb1:
            r8 = r4
        Lb2:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            int r3 = r6.importance
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r6.importanceReasonCode
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r5}
            java.lang.String r3 = "hasRunningServicesOrProviders:%b %d %d"
            com.tencent.mars.xlog.Log.i(r0, r3, r2)
            if (r8 == 0) goto Lce
            return r4
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.d7.a(java.lang.String):boolean");
    }

    public static boolean b() {
        return f53395a.get() > 0 || a(((km0.c) gm0.j1.p().a()).f308987a);
    }

    public static java.lang.Object c(android.content.Context context) {
        java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
        if (invoke != null) {
            return invoke;
        }
        java.lang.reflect.Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        java.lang.Object obj = field.get(context);
        java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
