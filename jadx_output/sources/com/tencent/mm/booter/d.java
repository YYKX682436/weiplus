package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class d extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public long f63316b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f63317c = new java.lang.Runnable() { // from class: com.tencent.mm.booter.d$$a
        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mm.booter.d dVar = com.tencent.mm.booter.d.this;
            dVar.getClass();
            dVar.c(com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground());
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f63318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.CoreService f63319e;

    public d(com.tencent.mm.booter.CoreService coreService, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f63319e = coreService;
        this.f63318d = n3Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "bg");
        mm.k kVar = mm.k.X;
        kVar.getClass();
        long l17 = mm.k.l(kVar, null, 1, null);
        if (l17 > 0) {
            this.f63318d.postDelayed(this.f63317c, l17 * 60000);
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "fg");
        this.f63318d.removeCallbacks(this.f63317c);
        c(false);
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "LightPush ".concat(z17 ? "on" : "off"));
        boolean z18 = com.tencent.mm.sdk.platformtools.x2.f193077g;
        a25.q qVar = (a25.q) i95.n0.c(a25.q.class);
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        boolean Ri = ((aq1.q0) qVar).Ri(str);
        if (!z18 && Ri) {
            a25.q qVar2 = (a25.q) i95.n0.c(a25.q.class);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.booter.e eVar = new com.tencent.mm.booter.e(this, z17);
            ((aq1.q0) qVar2).getClass();
            com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCLong(currentTimeMillis), aq1.f0.class, new aq1.j0(eVar));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "on Success: standby=" + z18 + ", alive=" + Ri);
        d(z17);
    }

    public final void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "LightPush, switchingImp ".concat(z17 ? "on" : "off"));
        this.f63319e.f63239g = z17;
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify_power_light_push_");
        sb6.append(z17 ? "on" : "off");
        sb6.append("_ms");
        L.putLong(sb6.toString(), java.lang.System.currentTimeMillis());
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (z17) {
            this.f63316b = uptimeMillis;
            return;
        }
        long j17 = this.f63316b;
        if (j17 > 0 && j17 < uptimeMillis) {
            long j18 = uptimeMillis - j17;
            boolean z18 = mm.w.f328542a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "noteLightPushTime: " + j18);
            mm.w.f328561t.accept(java.lang.Long.valueOf(j18));
        }
        this.f63316b = 0L;
    }
}
