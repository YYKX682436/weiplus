package com.tencent.mm.plugin.appbrand.backgroundrunning;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public class b1 extends i95.w implements com.tencent.mm.plugin.appbrand.backgroundrunning.x0 {

    /* renamed from: i, reason: collision with root package name */
    public static android.app.NotificationManager f76954i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedHashMap f76955d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f76957f;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f76959h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f76956e = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.h5 f76958g = new com.tencent.mm.plugin.appbrand.backgroundrunning.z0(this);

    public b1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f76959h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningManagerService$2
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent2 = voipEvent;
                if (voipEvent2 == null) {
                    return false;
                }
                am.y00 y00Var = voipEvent2.f54945g;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "receive VoipEvent:[%s, %s]", java.lang.Integer.valueOf(y00Var.f8419f), java.lang.Integer.valueOf(y00Var.f8415b));
                int i17 = y00Var.f8415b;
                if (i17 != 7 && i17 != 3) {
                    return false;
                }
                com.tencent.mm.plugin.appbrand.backgroundrunning.b1.this.wi();
                return false;
            }
        };
    }

    public void Ai() {
        java.util.Iterator it = ((java.util.ArrayList) Bi()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp appBrandBackgroundRunningApp = (com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next();
            com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel();
            java.lang.String str = appBrandBackgroundRunningApp.f76921d;
            mMBackgroundRunningOperationParcel.f76945d = str;
            mMBackgroundRunningOperationParcel.f76946e = 20;
            mMBackgroundRunningOperationParcel.f76947f = 2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "sendOperation from MM process, operation:%s", mMBackgroundRunningOperationParcel);
                com.tencent.mm.plugin.appbrand.ipc.m0.b(mMBackgroundRunningOperationParcel.f76945d, mMBackgroundRunningOperationParcel);
            }
        }
    }

    public java.util.List Bi() {
        java.util.LinkedHashMap linkedHashMap = this.f76955d;
        return linkedHashMap == null ? new java.util.ArrayList() : new java.util.ArrayList(linkedHashMap.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel r9) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.backgroundrunning.b1.Di(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel):void");
    }

    public final void Ni(java.util.List list) {
        java.lang.String str;
        if (list == null || list.isEmpty()) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.String.valueOf(list.size()));
            sb6.append("|");
            java.util.Iterator it = list.iterator();
            sb6.append(((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next()).f76921d);
            while (it.hasNext()) {
                sb6.append("#");
                sb6.append(((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next()).f76921d);
            }
            str = sb6.toString();
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "report background running app list changed, note:%s", str2);
        com.tencent.mm.plugin.appbrand.backgroundrunning.v.a(null, 0, java.lang.System.currentTimeMillis(), 6, str2, 0);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "onRegister MMBackgroundRunningManagerService");
        ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(this.f76958g);
        this.f76955d = new java.util.LinkedHashMap();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "startListening");
        if (com.tencent.mm.plugin.appbrand.backgroundrunning.c0.f76961a == null) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.c0.f76961a = new com.tencent.mm.plugin.appbrand.backgroundrunning.b0();
        }
        if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.x0 x0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class);
            com.tencent.mm.plugin.appbrand.backgroundrunning.w0 w0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.c0.f76961a;
            com.tencent.mm.plugin.appbrand.backgroundrunning.b1 b1Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.b1) x0Var;
            if (w0Var == null) {
                b1Var.getClass();
            } else {
                synchronized (b1Var.f76956e) {
                    b1Var.f76956e.add(w0Var);
                }
            }
        }
        if (this.f76957f == null) {
            this.f76957f = new java.util.ArrayList();
            for (java.lang.String str : com.tencent.mm.plugin.appbrand.task.u0.f89199h.b()) {
                ((java.util.ArrayList) this.f76957f).add(new com.tencent.mm.plugin.appbrand.backgroundrunning.a1(this, str));
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f76957f).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.a1 a1Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.a1) it.next();
            com.tencent.mm.ipcinvoker.d0.b(a1Var.f76949d, a1Var);
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        if (H0 != null) {
            synchronized (this.f76956e) {
                this.f76956e.add(H0);
            }
        }
        this.f76959h.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "onUnregister MMBackgroundRunningManagerService");
        Ai();
        ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).Di(this.f76958g);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "stopListening");
        if (com.tencent.mm.plugin.appbrand.backgroundrunning.c0.f76961a != null) {
            if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
                com.tencent.mm.plugin.appbrand.backgroundrunning.x0 x0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class);
                com.tencent.mm.plugin.appbrand.backgroundrunning.w0 w0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.c0.f76961a;
                com.tencent.mm.plugin.appbrand.backgroundrunning.b1 b1Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.b1) x0Var;
                if (w0Var == null) {
                    b1Var.getClass();
                } else {
                    synchronized (b1Var.f76956e) {
                        b1Var.f76956e.remove(w0Var);
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.backgroundrunning.c0.f76961a = null;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f76957f).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ipcinvoker.d0.j(com.tencent.mm.sdk.platformtools.x2.f193072b, (com.tencent.mm.plugin.appbrand.backgroundrunning.a1) it.next());
        }
        this.f76957f = null;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        if (H0 != null) {
            synchronized (this.f76956e) {
                this.f76956e.remove(H0);
            }
        }
        this.f76959h.dead();
        this.f76956e.clear();
        try {
            this.f76955d.clear();
        } catch (java.util.ConcurrentModificationException unused) {
        }
        this.f76955d = null;
    }

    public void wi() {
        java.util.Iterator it = ((java.util.ArrayList) Bi()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp appBrandBackgroundRunningApp = (com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next();
            com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel();
            java.lang.String str = appBrandBackgroundRunningApp.f76921d;
            mMBackgroundRunningOperationParcel.f76945d = str;
            mMBackgroundRunningOperationParcel.f76946e = 72;
            mMBackgroundRunningOperationParcel.f76947f = 2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "sendOperation from MM process, operation:%s", mMBackgroundRunningOperationParcel);
                com.tencent.mm.plugin.appbrand.ipc.m0.b(mMBackgroundRunningOperationParcel.f76945d, mMBackgroundRunningOperationParcel);
            }
        }
    }
}
