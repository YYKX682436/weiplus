package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.s f67461d;

    public p(com.tencent.mm.feature.performance.adpf.s sVar) {
        this.f67461d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph.u e17;
        com.tencent.matrix.batterycanary.monitor.feature.c cVar;
        android.os.Handler handler;
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner processUIStartedStateOwner = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE;
        if (!processUIStartedStateOwner.isForeground() || (e17 = gi.d.e()) == null || (cVar = (com.tencent.matrix.batterycanary.monitor.feature.c) e17.f354296h.i(com.tencent.matrix.batterycanary.monitor.feature.c.class)) == null) {
            return;
        }
        com.tencent.mm.feature.performance.adpf.s sVar = this.f67461d;
        boolean z17 = true;
        boolean z18 = !e17.f354296h.f363335d.f363297p;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot k17 = cVar.k(z18);
        synchronized (sVar.f67477d) {
            jz5.l lVar = sVar.f67478e;
            if (lVar != null) {
                long longValue = currentTimeMillis - ((java.lang.Number) lVar.f302833d).longValue();
                jz5.l lVar2 = sVar.f67478e;
                kotlin.jvm.internal.o.d(lVar2);
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) k17.c((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) lVar2.f302834e).f395486c;
                if (!jiffiesMonitorFeature$JiffiesSnapshot.f395364b) {
                    throw new java.lang.IllegalStateException("figureCpuLoad must be called on delta snapshot");
                }
                float longValue2 = (((float) (((java.lang.Long) jiffiesMonitorFeature$JiffiesSnapshot.f52561g.f395552a).longValue() * 10)) * 100.0f) / ((float) longValue);
                java.lang.Integer num = wh.m.f445830a;
                int b17 = a06.d.b(new java.math.BigDecimal(java.lang.String.valueOf(longValue2)).setScale(2, java.math.RoundingMode.HALF_EVEN).floatValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "on collect fg cpuLoad: " + b17 + "%, durationMs=" + longValue + "ms");
                if (b17 >= 0 && b17 < 10001) {
                    com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState iMutableAdpfState = (com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) sVar.f67475b).getValue();
                    iMutableAdpfState.toggle(b17 > 150, new com.tencent.mm.feature.performance.adpf.n(b17));
                    if (iMutableAdpfState.active()) {
                        ((com.tencent.mm.feature.performance.adpf.b2) ((jz5.n) com.tencent.mm.feature.performance.adpf.s0.f67483e).getValue()).a(u04.d.f423477c, 1800000L);
                    }
                    com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState iMutableAdpfState2 = (com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) sVar.f67476c).getValue();
                    if (b17 <= 200) {
                        z17 = false;
                    }
                    iMutableAdpfState2.toggle(z17, new com.tencent.mm.feature.performance.adpf.o(b17));
                    if (iMutableAdpfState2.active()) {
                        ((com.tencent.mm.feature.performance.adpf.b2) ((jz5.n) com.tencent.mm.feature.performance.adpf.s0.f67484f).getValue()).a(u04.d.f423477c, 1800000L);
                    }
                }
            }
            sVar.f67478e = new jz5.l(java.lang.Long.valueOf(currentTimeMillis), k17);
        }
        if (!processUIStartedStateOwner.isForeground() || (handler = sVar.f67479f) == null) {
            return;
        }
        handler.postDelayed(this, 60000L);
    }
}
