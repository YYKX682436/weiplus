package zv1;

/* loaded from: classes10.dex */
public final class g implements zv1.d {
    @Override // zv1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 a() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35408x7b9c6c26;
    }

    @Override // zv1.d
    public java.util.Map b() {
        boolean z17;
        boolean z18;
        c50.o0 o0Var = (c50.o0) i95.n0.c(c50.o0.class);
        kz5.q0 q0Var = kz5.q0.f395534d;
        if (o0Var == null) {
            return q0Var;
        }
        c61.z1 z1Var = (c61.z1) o0Var;
        if (!z1Var.wi() || !z1Var.wi()) {
            return q0Var;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
                z18 = false;
            }
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCacheCleanerService", "getTaggedCachePaths skipped: on main thread");
                return q0Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184148a;
        if (!(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184151d > 0)) {
            return kz5.c1.k(new jz5.l("video", kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183673i)), new jz5.l("image", kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183672h)), new jz5.l("avatar", kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183674j)), new jz5.l("tmp", kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l)), new jz5.l("posting", kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183679o)), new jz5.l("live", kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183668d)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCacheCleanerService", "getTaggedCachePaths skipped: finder UI is on screen");
        return q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zv1.d
    public long c(long j17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        if (z17) {
            return j17;
        }
        c50.o0 o0Var = (c50.o0) i95.n0.c(c50.o0.class);
        if (o0Var != null) {
            c61.z1 z1Var = (c61.z1) o0Var;
            if (z1Var.wi()) {
                if (!z1Var.wi()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner skipped: switch off");
                } else {
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner dryRun expect=" + j17);
                        return j17;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                            objArr = true;
                        } else {
                            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            objArr = false;
                        }
                        if (objArr == true || z65.c.a()) {
                            objArr2 = true;
                        } else {
                            kb2.b bVar = kb2.b.f387758a;
                            objArr2 = false;
                        }
                        if (objArr2 == false) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner skipped: on main thread, refuse to do IO here");
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184148a;
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184151d > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner skipped: finder UI is on screen, defer to next trigger");
                    } else {
                        long c17 = v2Var.c(c26987xeef691ab);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "runOnceForGlobalCleaner begin");
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (c26987xeef691ab != null) {
                            c26987xeef691ab.m108011xf4ed245c();
                        }
                        v2Var.a();
                        if (c26987xeef691ab != null) {
                            c26987xeef691ab.m108011xf4ed245c();
                        }
                        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
                        if (eVar != null) {
                            ((qs2.q) eVar).Bi();
                        }
                        if (c26987xeef691ab != null) {
                            c26987xeef691ab.m108011xf4ed245c();
                        }
                        v2Var.d();
                        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r2 r2Var : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183684t) {
                            com.p314xaae8f345.mm.vfs.w6.u(r2Var.f184029a);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "runOnceForGlobalCleaner end cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                        long c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184148a.c(c26987xeef691ab);
                        long j18 = c17 - c18;
                        r3 = j18 >= 0 ? j18 : 0L;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner expect=" + j17 + " before=" + c17 + " after=" + c18 + " cleaned=" + r3);
                    }
                }
                return r3;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCleanForSize skipped: service=");
        sb6.append(o0Var != null);
        sb6.append(", switch off");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanCache.FinderCacheCleaner", sb6.toString());
        return 0L;
    }

    @Override // zv1.d
    public java.util.List e() {
        return super.e();
    }
}
