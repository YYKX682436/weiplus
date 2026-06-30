package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 f283962e;

    public q1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var, boolean z17) {
        this.f283962e = p1Var;
        this.f283961d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        xg3.m0 u17 = c01.d9.b().u();
        java.lang.String str = this.f283962e.f284075e;
        int[] iArr = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1.f283949t;
        int T1 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17).T1(str, iArr);
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(T1)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step1-count:%dms, total:%d", objArr);
        if (T1 <= 0 || this.f283962e.f283952s.get()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1.p(this.f283962e, this.f283961d, currentTimeMillis);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var = this.f283962e;
        p1Var.getClass();
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).f1(p1Var.f284075e, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1.f283950u, iArr);
        if (f17 != null) {
            while (f17.moveToNext()) {
                try {
                    arrayList.add(new long[]{f17.getLong(0), f17.getLong(1)});
                } finally {
                    f17.close();
                }
            }
        }
        arrayList.sort(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.C21853x6411a80());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((long[]) it.next())[0]));
        }
        java.lang.Object[] objArr2 = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3), java.lang.Integer.valueOf(arrayList2.size())};
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step2a-idOnly+sort:%dms, count:%d", objArr2);
        if (arrayList2.isEmpty() || this.f283962e.f283952s.get()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1.p(this.f283962e, this.f283961d, currentTimeMillis);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var2 = this.f283962e;
        p1Var2.getClass();
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.lang.String X8 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).X8(p1Var2.f284075e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < 10; i19++) {
            if (i19 > 0) {
                sb6.append(",");
            }
            sb6.append(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1.f283951v[i19]);
        }
        java.lang.String str2 = "SELECT " + sb6.toString() + " FROM " + X8 + " WHERE msgId IN (";
        int size = ((arrayList2.size() + 200) - 1) / 200;
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
        int i27 = 0;
        while (i27 < arrayList2.size()) {
            int i28 = i27 + 200;
            int min = java.lang.Math.min(i28, arrayList2.size());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            long j17 = currentTimeMillis;
            for (int i29 = i27; i29 < min; i29++) {
                if (i29 > i27) {
                    sb7.append(",");
                }
                sb7.append(arrayList2.get(i29));
            }
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s1(p1Var2, str2 + sb7.toString() + ")", concurrentHashMap, countDownLatch));
            i27 = i28;
            currentTimeMillis = j17;
        }
        long j18 = currentTimeMillis;
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
        }
        java.lang.Object[] objArr3 = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis4), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(concurrentHashMap.size())};
        int i37 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step2b-rawQuery:%dms, batches:%d, found:%d", objArr3);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var3 = this.f283962e;
        p1Var3.getClass();
        long currentTimeMillis5 = java.lang.System.currentTimeMillis();
        int size2 = arrayList2.size();
        if (size2 != 0 && !p1Var3.f283952s.get()) {
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(p1Var3.f284075e);
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
            int i38 = ((size2 + 50) - 1) / 50;
            java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(i38);
            int i39 = 0;
            while (i39 < size2) {
                int i47 = i39 + 50;
                java.util.concurrent.CountDownLatch countDownLatch3 = countDownLatch2;
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t1(p1Var3, i39, java.lang.Math.min(i47, size2), concurrentHashMap, arrayList2, R4, concurrentLinkedQueue2, countDownLatch3));
                size2 = size2;
                i39 = i47;
                countDownLatch2 = countDownLatch3;
                i38 = i38;
                concurrentLinkedQueue = concurrentLinkedQueue2;
            }
            int i48 = i38;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
            try {
                countDownLatch2.await();
            } catch (java.lang.InterruptedException unused2) {
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(concurrentLinkedQueue3);
            java.util.Collections.sort(arrayList3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.u1(p1Var3));
            java.util.Iterator it6 = arrayList3.iterator();
            long j19 = 0;
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1 y1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1) it6.next();
                long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(y1Var.f279941a));
                if (j19 != a17) {
                    p1Var3.f284079i.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.g0(y1Var.f279941a));
                    j19 = a17;
                }
                p1Var3.f284079i.add(y1Var);
            }
            java.lang.Object[] objArr4 = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis5), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(arrayList3.size())};
            int i49 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step3-parse+sort:%dms, chunks:%d, items:%d", objArr4);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1.p(this.f283962e, this.f283961d, j18);
    }
}
