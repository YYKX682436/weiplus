package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class d extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public long f144849b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f144850c = new java.lang.Runnable() { // from class: com.tencent.mm.booter.d$$a
        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.mm.p642xad8b531f.d dVar = com.p314xaae8f345.mm.p642xad8b531f.d.this;
            dVar.getClass();
            dVar.c(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8());
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f144851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6 f144852e;

    public d(com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6 serviceC10285xbf7f55f6, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f144852e = serviceC10285xbf7f55f6;
        this.f144851d = n3Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "bg");
        mm.k kVar = mm.k.X;
        kVar.getClass();
        long l17 = mm.k.l(kVar, null, 1, null);
        if (l17 > 0) {
            this.f144851d.mo50297x7c4d7ca2(this.f144850c, l17 * 60000);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "fg");
        this.f144851d.mo50300x3fa464aa(this.f144850c);
        c(false);
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "LightPush ".concat(z17 ? "on" : "off"));
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g;
        a25.q qVar = (a25.q) i95.n0.c(a25.q.class);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        boolean Ri = ((aq1.q0) qVar).Ri(str);
        if (!z18 && Ri) {
            a25.q qVar2 = (a25.q) i95.n0.c(a25.q.class);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p642xad8b531f.e eVar = new com.p314xaae8f345.mm.p642xad8b531f.e(this, z17);
            ((aq1.q0) qVar2).getClass();
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(currentTimeMillis), aq1.f0.class, new aq1.j0(eVar));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "on Success: standby=" + z18 + ", alive=" + Ri);
        d(z17);
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "LightPush, switchingImp ".concat(z17 ? "on" : "off"));
        this.f144852e.f144772g = z17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify_power_light_push_");
        sb6.append(z17 ? "on" : "off");
        sb6.append("_ms");
        L.putLong(sb6.toString(), java.lang.System.currentTimeMillis());
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (z17) {
            this.f144849b = uptimeMillis;
            return;
        }
        long j17 = this.f144849b;
        if (j17 > 0 && j17 < uptimeMillis) {
            long j18 = uptimeMillis - j17;
            boolean z18 = mm.w.f410075a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "noteLightPushTime: " + j18);
            mm.w.f410094t.mo3938xab27b508(java.lang.Long.valueOf(j18));
        }
        this.f144849b = 0L;
    }
}
