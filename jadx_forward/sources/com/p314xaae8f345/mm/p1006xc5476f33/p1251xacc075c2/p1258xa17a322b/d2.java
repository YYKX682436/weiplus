package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class d2 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "Notify affroam app enter foreground");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().b(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.atomic.AtomicLong atomicLong = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174181e;
        long j17 = atomicLong.get();
        long j18 = currentTimeMillis - j17;
        if (j18 < 600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "Skip frequent foreground trigger, interval: " + j18 + "ms");
            return;
        }
        if (atomicLong.compareAndSet(j17, currentTimeMillis)) {
            ((ku5.t0) ku5.t0.f394148d).q(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.c2.f174112d);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "Notify affroam app exit foreground");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().b(false);
    }
}
