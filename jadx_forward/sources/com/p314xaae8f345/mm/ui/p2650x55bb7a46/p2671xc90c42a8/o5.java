package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 f283944d;

    public o5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var) {
        this.f283944d = b6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f283944d.f283672s.set(false);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var = this.f283944d;
        b6Var.getClass();
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).f1(b6Var.f284075e, new java.lang.String[]{"msgId", "createTime"}, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6.f283670t);
        if (f17 != null) {
            while (f17.moveToNext()) {
                try {
                    arrayList.add(new long[]{f17.getLong(0), f17.getLong(1)});
                } finally {
                    f17.close();
                }
            }
        }
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3), java.lang.Integer.valueOf(arrayList.size())};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "[perf] Phase1a-idOnly:%dms, count:%d", objArr);
        if (arrayList.isEmpty() || b6Var.f283672s.get()) {
            j17 = currentTimeMillis;
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        } else {
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p5(b6Var));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                arrayList2.add(java.lang.Long.valueOf(((long[]) arrayList.get(i18))[0]));
            }
            arrayList.clear();
            long currentTimeMillis4 = java.lang.System.currentTimeMillis();
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            java.lang.String X8 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).X8(b6Var.f284075e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i19 = 0; i19 < 9; i19++) {
                if (i19 > 0) {
                    sb6.append(",");
                }
                sb6.append(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6.f283671u[i19]);
            }
            java.lang.String str = "SELECT " + ((java.lang.Object) sb6) + " FROM " + X8 + " WHERE msgId IN (";
            int size = ((arrayList2.size() + 200) - 1) / 200;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            j17 = currentTimeMillis;
            int i27 = 0;
            while (i27 < arrayList2.size()) {
                int i28 = i27 + 200;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                int i29 = i27;
                for (int min = java.lang.Math.min(i28, arrayList2.size()); i29 < min; min = min) {
                    if (i29 > i27) {
                        sb7.append(",");
                    }
                    sb7.append(arrayList2.get(i29));
                    i29++;
                }
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.q5(b6Var, str + sb7.toString() + ")", concurrentHashMap, countDownLatch));
                i27 = i28;
            }
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "[perf] Phase1b-rawQuery:%dms, batches:%d, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis4), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(concurrentHashMap.size()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData][perf] Phase1-batchQuery:%dms, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(concurrentHashMap.size()));
        if (concurrentHashMap.isEmpty() || this.f283944d.f283672s.get()) {
            if (this.f283944d.f283672s.get()) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n5(this));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f283944d.f284075e) ? ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(this.f283944d.f284075e) : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var2 = this.f283944d;
        b6Var2.getClass();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(concurrentHashMap.values());
        java.util.Collections.sort(arrayList3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.r5(b6Var2));
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3.size());
        for (int i37 = 0; i37 < arrayList3.size(); i37++) {
            arrayList4.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList3.get(i37)).m124847x74d37ac6()));
        }
        long currentTimeMillis5 = java.lang.System.currentTimeMillis();
        int i38 = 0;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var3 = this.f283944d;
        b6Var3.getClass();
        if (!arrayList4.isEmpty() && !b6Var3.f283672s.get()) {
            int size2 = arrayList4.size();
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
            java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(((size2 + 50) - 1) / 50);
            while (i38 < size2) {
                int i39 = i38 + 50;
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s5(b6Var3, i38, java.lang.Math.min(i39, size2), arrayList4, concurrentHashMap, z07, concurrentLinkedQueue, countDownLatch2));
                i38 = i39;
            }
            try {
                countDownLatch2.await();
            } catch (java.lang.InterruptedException unused2) {
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(concurrentLinkedQueue);
            java.util.Collections.sort(arrayList5, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t5(b6Var3));
            java.util.Iterator it = arrayList5.iterator();
            long j18 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5 z5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5) it.next();
                long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(z5Var.f279941a));
                if (j18 != a17) {
                    b6Var3.f284079i.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.g0(z5Var.f279941a));
                    j18 = a17;
                }
                b6Var3.f284079i.add(z5Var);
                atomicInteger.incrementAndGet();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData][perf] Phase3-parse+drain:%dms, validItems:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis5), java.lang.Integer.valueOf(atomicInteger.get()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var4 = this.f283944d;
        int i47 = atomicInteger.get();
        if (!b6Var4.f283672s.get()) {
            b6Var4.n();
            if (!b6Var4.f284079i.isEmpty()) {
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0) b6Var4.f284079i.get(r3.size() - 1)).a() == 2147483646) {
                    b6Var4.f284079i.remove(r3.size() - 1);
                }
            }
            b6Var4.f284080m = b6Var4.f284079i;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.u5(b6Var4, i47));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData][perf][final] total:%dms, items:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Integer.valueOf(atomicInteger.get()));
    }
}
