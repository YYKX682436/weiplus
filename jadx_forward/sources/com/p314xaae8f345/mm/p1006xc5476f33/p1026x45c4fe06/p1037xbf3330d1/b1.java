package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public class b1 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0 {

    /* renamed from: i, reason: collision with root package name */
    public static android.app.NotificationManager f158487i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedHashMap f158488d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f158490f;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f158492h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f158489e = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 f158491g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.z0(this);

    public b1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f158492h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningManagerService$2
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba2 = c6231x4f3054ba;
                if (c6231x4f3054ba2 == null) {
                    return false;
                }
                am.y00 y00Var = c6231x4f3054ba2.f136478g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBackgroundRunningManagerService", "receive VoipEvent:[%s, %s]", java.lang.Integer.valueOf(y00Var.f89952f), java.lang.Integer.valueOf(y00Var.f89948b));
                int i17 = y00Var.f89948b;
                if (i17 != 7 && i17 != 3) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1.this.wi();
                return false;
            }
        };
    }

    public void Ai() {
        java.util.Iterator it = ((java.util.ArrayList) Bi()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6 c11735xd37b16d6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f();
            java.lang.String str = c11735xd37b16d6.f158454d;
            c11741xcdfabd1f.f158478d = str;
            c11741xcdfabd1f.f158479e = 20;
            c11741xcdfabd1f.f158480f = 2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBackgroundRunningManagerService", "sendOperation from MM process, operation:%s", c11741xcdfabd1f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(c11741xcdfabd1f.f158478d, c11741xcdfabd1f);
            }
        }
    }

    public java.util.List Bi() {
        java.util.LinkedHashMap linkedHashMap = this.f158488d;
        return linkedHashMap == null ? new java.util.ArrayList() : new java.util.ArrayList(linkedHashMap.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 r9) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1.Di(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel):void");
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
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next()).f158454d);
            while (it.hasNext()) {
                sb6.append("#");
                sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next()).f158454d);
            }
            str = sb6.toString();
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBackgroundRunningManagerService", "report background running app list changed, note:%s", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v.a(null, 0, java.lang.System.currentTimeMillis(), 6, str2, 0);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBackgroundRunningManagerService", "onRegister MMBackgroundRunningManagerService");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).wi(this.f158491g);
        this.f158488d = new java.util.LinkedHashMap();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "startListening");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.c0.f158494a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.c0.f158494a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b0();
        }
        if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.c0.f158494a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1) x0Var;
            if (w0Var == null) {
                b1Var.getClass();
            } else {
                synchronized (b1Var.f158489e) {
                    b1Var.f158489e.add(w0Var);
                }
            }
        }
        if (this.f158490f == null) {
            this.f158490f = new java.util.ArrayList();
            for (java.lang.String str : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.b()) {
                ((java.util.ArrayList) this.f158490f).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.a1(this, str));
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f158490f).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.a1) it.next();
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.b(a1Var.f158482d, a1Var);
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        if (H0 != null) {
            synchronized (this.f158489e) {
                this.f158489e.add(H0);
            }
        }
        this.f158492h.mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBackgroundRunningManagerService", "onUnregister MMBackgroundRunningManagerService");
        Ai();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).Di(this.f158491g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "stopListening");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.c0.f158494a != null) {
            if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.c0.f158494a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1) x0Var;
                if (w0Var == null) {
                    b1Var.getClass();
                } else {
                    synchronized (b1Var.f158489e) {
                        b1Var.f158489e.remove(w0Var);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.c0.f158494a = null;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f158490f).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.a1) it.next());
        }
        this.f158490f = null;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        if (H0 != null) {
            synchronized (this.f158489e) {
                this.f158489e.remove(H0);
            }
        }
        this.f158492h.mo48814x2efc64();
        this.f158489e.clear();
        try {
            this.f158488d.clear();
        } catch (java.util.ConcurrentModificationException unused) {
        }
        this.f158488d = null;
    }

    public void wi() {
        java.util.Iterator it = ((java.util.ArrayList) Bi()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6 c11735xd37b16d6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f();
            java.lang.String str = c11735xd37b16d6.f158454d;
            c11741xcdfabd1f.f158478d = str;
            c11741xcdfabd1f.f158479e = 72;
            c11741xcdfabd1f.f158480f = 2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBackgroundRunningManagerService", "sendOperation from MM process, operation:%s", c11741xcdfabd1f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(c11741xcdfabd1f.f158478d, c11741xcdfabd1f);
            }
        }
    }
}
