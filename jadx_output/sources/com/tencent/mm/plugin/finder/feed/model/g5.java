package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class g5 {
    public g5(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader a(r45.f96 f96Var, long j17, zy2.o9 o9Var, java.lang.Integer num, java.lang.Integer num2, r45.qt2 qt2Var, boolean z17, java.lang.String bypassBuffer) {
        boolean z18;
        r45.f96 f96Var2;
        kotlin.jvm.internal.o.g(bypassBuffer, "bypassBuffer");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = null;
        if (f96Var == null) {
            return null;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader.A;
        reentrantLock.lock();
        try {
            java.lang.String a17 = com.tencent.mm.plugin.finder.feed.model.m5.a(f96Var);
            java.util.HashMap hashMap = com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader.f107533z;
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader2 = (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) hashMap.get(a17);
            if (finderPoiFeedLoader2 != null && finderPoiFeedLoader2.f107549v != 0) {
                long currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) - finderPoiFeedLoader2.f107549v;
                com.tencent.mm.repairer.config.location.RepairerConfigPOIDetailPrefetchListExpireSeconds repairerConfigPOIDetailPrefetchListExpireSeconds = new com.tencent.mm.repairer.config.location.RepairerConfigPOIDetailPrefetchListExpireSeconds();
                if (currentTimeMillis > com.tencent.mm.sdk.platformtools.t8.F1(j62.e.g().f(repairerConfigPOIDetailPrefetchListExpireSeconds), repairerConfigPOIDetailPrefetchListExpireSeconds.f192220a)) {
                    finderPoiFeedLoader2 = null;
                }
            }
            if (num2 != null) {
                if (!kotlin.jvm.internal.o.b(finderPoiFeedLoader2 != null ? java.lang.Integer.valueOf(finderPoiFeedLoader2.f107540m) : null, num2)) {
                    finderPoiFeedLoader2 = null;
                }
            }
            if (kotlin.jvm.internal.o.b((finderPoiFeedLoader2 == null || (f96Var2 = finderPoiFeedLoader2.f107535e) == null) ? null : (r45.wo2) f96Var2.getCustom(21), (r45.wo2) f96Var.getCustom(21))) {
                finderPoiFeedLoader = finderPoiFeedLoader2;
                z18 = true;
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderPoiFeedLoader", "fromMpItem mismatch, skipping cache update");
                z18 = false;
            }
            if (finderPoiFeedLoader == null && z17) {
                finderPoiFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader(qt2Var);
                finderPoiFeedLoader.f107550w = true;
                finderPoiFeedLoader.onAlive();
                finderPoiFeedLoader.f107535e = f96Var;
                finderPoiFeedLoader.f107538h = 0;
                finderPoiFeedLoader.f107541n = j17;
                finderPoiFeedLoader.f107536f = o9Var;
                finderPoiFeedLoader.f107537g = num;
                finderPoiFeedLoader.f107540m = num2 != null ? num2.intValue() : 0;
                finderPoiFeedLoader.f107551x = bypassBuffer;
                if (z18) {
                    hashMap.put(a17, finderPoiFeedLoader);
                }
            }
            reentrantLock.unlock();
            return finderPoiFeedLoader;
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader.A.unlock();
            throw th6;
        }
    }
}
