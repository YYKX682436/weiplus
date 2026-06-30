package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 f283829d;

    public k0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var) {
        this.f283829d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        long j17;
        long j18;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f283829d.f284105s.set(false);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        xg3.m0 u17 = c01.d9.b().u();
        java.lang.String str = this.f283829d.f284075e;
        int[] iArr = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0.f284103w;
        int T1 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17).T1(str, iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[loadData][perf] Phase1-count:%dms, total:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(T1));
        if (T1 <= 0 || this.f283829d.f284105s.get()) {
            if (this.f283829d.f284105s.get()) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.i0(this));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f283829d.f284075e) ? ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(this.f283829d.f284075e) : null;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var = this.f283829d;
        z0Var.getClass();
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).f1(z0Var.f284075e, new java.lang.String[]{"msgId", "createTime"}, iArr);
        if (f17 != null) {
            while (f17.moveToNext()) {
                try {
                    arrayList.add(new long[]{f17.getLong(0), f17.getLong(1)});
                } finally {
                    f17.close();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[perf] Phase2a-idOnly:%dms, count:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis4), java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty() || z0Var.f284105s.get()) {
            a3Var = z07;
            j17 = currentTimeMillis;
            j18 = currentTimeMillis3;
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        } else {
            arrayList.sort(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l0(z0Var));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                arrayList2.add(java.lang.Long.valueOf(((long[]) arrayList.get(i17))[0]));
            }
            arrayList.clear();
            long currentTimeMillis5 = java.lang.System.currentTimeMillis();
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            java.lang.String X8 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).X8(z0Var.f284075e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i18 = 0;
            while (true) {
                j17 = currentTimeMillis;
                if (i18 >= 9) {
                    break;
                }
                if (i18 > 0) {
                    sb6.append(",");
                }
                sb6.append(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0.f284104x[i18]);
                i18++;
                currentTimeMillis = j17;
            }
            java.lang.String str2 = "SELECT " + ((java.lang.Object) sb6) + " FROM " + X8 + " WHERE msgId IN (";
            int size = ((arrayList2.size() + 200) - 1) / 200;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                int i27 = i19 + 200;
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = z07;
                int min = java.lang.Math.min(i27, arrayList2.size());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                long j19 = currentTimeMillis3;
                for (int i28 = i19; i28 < min; i28++) {
                    if (i28 > i19) {
                        sb7.append(",");
                    }
                    sb7.append(arrayList2.get(i28));
                }
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m0(z0Var, str2 + sb7.toString() + ")", concurrentHashMap, countDownLatch));
                i19 = i27;
                z07 = a3Var2;
                currentTimeMillis3 = j19;
            }
            a3Var = z07;
            j18 = currentTimeMillis3;
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[perf] Phase2b-rawQuery:%dms, batches:%d, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis5), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(concurrentHashMap.size()));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        if (concurrentHashMap2.isEmpty() || this.f283829d.f284105s.get()) {
            if (this.f283829d.f284105s.get()) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.j0(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[loadData][perf] Phase2-batchQuery:%dms, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j18), java.lang.Integer.valueOf(concurrentHashMap2.size()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var2 = this.f283829d;
        z0Var2.getClass();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(concurrentHashMap2.values());
        java.util.Collections.sort(arrayList3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n0(z0Var2));
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3.size());
        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
            arrayList4.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList3.get(i29)).m124847x74d37ac6()));
        }
        long currentTimeMillis6 = java.lang.System.currentTimeMillis();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var3 = this.f283829d;
        z0Var3.getClass();
        if (!arrayList4.isEmpty() && !z0Var3.f284105s.get()) {
            int size2 = arrayList4.size();
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
            java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(((size2 + 50) - 1) / 50);
            int i37 = 0;
            while (i37 < size2) {
                int i38 = i37 + 50;
                java.util.concurrent.CountDownLatch countDownLatch3 = countDownLatch2;
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o0(z0Var3, i37, java.lang.Math.min(i38, size2), arrayList4, concurrentHashMap2, a3Var, concurrentLinkedQueue2, countDownLatch3));
                i37 = i38;
                countDownLatch2 = countDownLatch3;
                concurrentLinkedQueue = concurrentLinkedQueue2;
                size2 = size2;
            }
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
            try {
                countDownLatch2.await();
            } catch (java.lang.InterruptedException unused2) {
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(concurrentLinkedQueue3);
            arrayList5.sort(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p0(z0Var3));
            java.util.Iterator it = arrayList5.iterator();
            long j27 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 w0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0) it.next();
                long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(w0Var.f279941a));
                if (j27 != a17) {
                    z0Var3.f284079i.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.g0(w0Var.f279941a));
                    j27 = a17;
                }
                z0Var3.f284079i.add(w0Var);
                atomicInteger.incrementAndGet();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[loadData][perf] Phase-parse+drain: %dms, validItems:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis6), java.lang.Integer.valueOf(atomicInteger.get()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var4 = this.f283829d;
        int i39 = atomicInteger.get();
        if (!z0Var4.f284105s.get()) {
            z0Var4.n();
            if (!z0Var4.f284079i.isEmpty()) {
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0) z0Var4.f284079i.get(r3.size() - 1)).a() == 2147483646) {
                    z0Var4.f284079i.remove(r3.size() - 1);
                }
            }
            z0Var4.f284080m = z0Var4.f284079i;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.q0(z0Var4, i39));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[loadData][perf][final] total:%dms, items:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Integer.valueOf(atomicInteger.get()));
    }
}
