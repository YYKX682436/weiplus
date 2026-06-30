package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class z6 extends android.content.MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public boolean f171898a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ContextThemeWrapper f171899b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ia f171900c;

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
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            if (r0 == r1) goto L18
            android.util.SparseArray r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y6.f171881b
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L12
            goto L18
        L12:
            com.tencent.mm.plugin.appbrand.ui.y6 r1 = new com.tencent.mm.plugin.appbrand.ui.y6
            r1.<init>(r0, r5)
            goto L2b
        L18:
            android.util.SparseArray r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y6.f171881b
            java.lang.Object r2 = r1.get(r5)
            com.tencent.mm.plugin.appbrand.ui.y6 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y6) r2
            if (r2 != 0) goto L2a
            com.tencent.mm.plugin.appbrand.ui.y6 r2 = new com.tencent.mm.plugin.appbrand.ui.y6
            r2.<init>(r0, r5)
            r1.put(r5, r2)
        L2a:
            r1 = r2
        L2b:
            r3.f171899b = r1
            boolean r0 = r4 instanceof android.view.ContextThemeWrapper
            if (r0 != 0) goto L35
            super.setBaseContext(r1)
            goto L38
        L35:
            r4.setTheme(r5)
        L38:
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L5c
            boolean r5 = r4 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
            if (r5 == 0) goto L48
            r5 = r4
            com.tencent.mm.ui.vas.VASActivity r5 = (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) r5     // Catch: java.lang.Exception -> L48
            android.app.Activity r5 = r5._activity     // Catch: java.lang.Exception -> L48
            if (r5 == 0) goto L48
            r4 = r5
        L48:
            super.setBaseContext(r4)
            r5 = 1
            r3.f171898a = r5
            android.content.Context r5 = r3.getApplicationContext()
            android.app.Application r5 = (android.app.Application) r5
            com.tencent.mm.plugin.appbrand.ui.x6 r0 = new com.tencent.mm.plugin.appbrand.ui.x6
            r0.<init>(r3, r4)
            r5.registerActivityLifecycleCallbacks(r0)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.<init>(android.content.Context, int):void");
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 b(android.content.Context context) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ja.a(false));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        return "layout_inflater".equals(str) ? this.f171899b.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        if (context == getBaseContext()) {
            return;
        }
        if (this.f171898a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimePersistentContextWrapper", "setBaseContext hash:%d, new:%s, old:%s, stack:%s", java.lang.Integer.valueOf(hashCode()), context, getBaseContext(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        if (context instanceof android.app.Activity) {
            if (context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) {
                try {
                    android.app.Activity activity = ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context)._activity;
                    if (activity != null) {
                        context = activity;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            super.setBaseContext(context);
            this.f171898a = true;
            ((android.app.Application) getApplicationContext()).registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x6(this, context));
        } else {
            super.setBaseContext(this.f171899b);
        }
        this.f171900c = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(android.content.ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandRuntimePersistentContextWrapper", e17, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(android.content.BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimePersistentContextWrapper", "unregisterReceiver IllegalArgumentException %s", e17);
        }
    }
}
