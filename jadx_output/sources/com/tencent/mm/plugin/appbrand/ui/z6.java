package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class z6 extends android.content.MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public boolean f90365a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ContextThemeWrapper f90366b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.ia f90367c;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z6(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r3.<init>(r4)
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            if (r0 == r1) goto L18
            android.util.SparseArray r1 = com.tencent.mm.plugin.appbrand.ui.y6.f90348b
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L12
            goto L18
        L12:
            com.tencent.mm.plugin.appbrand.ui.y6 r1 = new com.tencent.mm.plugin.appbrand.ui.y6
            r1.<init>(r0, r5)
            goto L2b
        L18:
            android.util.SparseArray r1 = com.tencent.mm.plugin.appbrand.ui.y6.f90348b
            java.lang.Object r2 = r1.get(r5)
            com.tencent.mm.plugin.appbrand.ui.y6 r2 = (com.tencent.mm.plugin.appbrand.ui.y6) r2
            if (r2 != 0) goto L2a
            com.tencent.mm.plugin.appbrand.ui.y6 r2 = new com.tencent.mm.plugin.appbrand.ui.y6
            r2.<init>(r0, r5)
            r1.put(r5, r2)
        L2a:
            r1 = r2
        L2b:
            r3.f90366b = r1
            boolean r0 = r4 instanceof android.view.ContextThemeWrapper
            if (r0 != 0) goto L35
            super.setBaseContext(r1)
            goto L38
        L35:
            r4.setTheme(r5)
        L38:
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L5c
            boolean r5 = r4 instanceof com.tencent.mm.ui.vas.VASActivity
            if (r5 == 0) goto L48
            r5 = r4
            com.tencent.mm.ui.vas.VASActivity r5 = (com.tencent.mm.ui.vas.VASActivity) r5     // Catch: java.lang.Exception -> L48
            android.app.Activity r5 = r5._activity     // Catch: java.lang.Exception -> L48
            if (r5 == 0) goto L48
            r4 = r5
        L48:
            super.setBaseContext(r4)
            r5 = 1
            r3.f90365a = r5
            android.content.Context r5 = r3.getApplicationContext()
            android.app.Application r5 = (android.app.Application) r5
            com.tencent.mm.plugin.appbrand.ui.x6 r0 = new com.tencent.mm.plugin.appbrand.ui.x6
            r0.<init>(r3, r4)
            r5.registerActivityLifecycleCallbacks(r0)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.z6.<init>(android.content.Context, int):void");
    }

    public static com.tencent.mm.plugin.appbrand.ui.z6 b(android.content.Context context) {
        return new com.tencent.mm.plugin.appbrand.ui.z6(context, com.tencent.mm.plugin.appbrand.ui.ja.a(false));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        return "layout_inflater".equals(str) ? this.f90366b.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        if (context == getBaseContext()) {
            return;
        }
        if (this.f90365a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimePersistentContextWrapper", "setBaseContext hash:%d, new:%s, old:%s, stack:%s", java.lang.Integer.valueOf(hashCode()), context, getBaseContext(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        if (context instanceof android.app.Activity) {
            if (context instanceof com.tencent.mm.ui.vas.VASActivity) {
                try {
                    android.app.Activity activity = ((com.tencent.mm.ui.vas.VASActivity) context)._activity;
                    if (activity != null) {
                        context = activity;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            super.setBaseContext(context);
            this.f90365a = true;
            ((android.app.Application) getApplicationContext()).registerActivityLifecycleCallbacks(new com.tencent.mm.plugin.appbrand.ui.x6(this, context));
        } else {
            super.setBaseContext(this.f90366b);
        }
        this.f90367c = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(android.content.ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandRuntimePersistentContextWrapper", e17, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(android.content.BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimePersistentContextWrapper", "unregisterReceiver IllegalArgumentException %s", e17);
        }
    }
}
