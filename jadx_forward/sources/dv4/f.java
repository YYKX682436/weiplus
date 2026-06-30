package dv4;

/* loaded from: classes.dex */
public class f implements dv4.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f325537a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f325538b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f325539c = false;

    /* renamed from: d, reason: collision with root package name */
    public final o13.x f325540d = new dv4.d(this);

    /* renamed from: e, reason: collision with root package name */
    public final o13.x f325541e = new dv4.e(this);

    public final boolean a(dv4.a aVar, o13.x xVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f325530a)) {
            return false;
        }
        p13.u uVar = new p13.u();
        uVar.f432673b = 17;
        uVar.f432674c = aVar.f325530a;
        uVar.f432678g = new int[]{131072};
        uVar.f432679h = new int[]{1, 5};
        uVar.f432680i = aVar.f325531b;
        ((u50.x) i95.n0.c(u50.x.class)).getClass();
        uVar.f432683l = r13.b.f450135d;
        uVar.f432681j = new java.util.HashSet();
        uVar.f432684m = xVar;
        uVar.f432686o = 1;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar).f432603m = aVar;
        return true;
    }

    public dv4.a b(java.lang.String str, long j17, int i17) {
        boolean z17;
        boolean d17 = d();
        o13.x xVar = this.f325540d;
        java.util.Map map = this.f325537a;
        if (!d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "Use old logic");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            dv4.q qVar = new dv4.q(str, i17);
            java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) ((java.util.concurrent.ConcurrentHashMap) map).get(qVar);
            if (countDownLatch != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "have a running task ,wait for result, query %s,maxMatch %d", str, java.lang.Integer.valueOf(i17));
            } else if (c(qVar, xVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "not have a running task ,start new task, query %s,maxMatch %d", str, java.lang.Integer.valueOf(i17));
                countDownLatch = new java.util.concurrent.CountDownLatch(1);
                ((java.util.concurrent.ConcurrentHashMap) map).put(qVar, countDownLatch);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "start new task fail, query %s,maxMatch %d", str, java.lang.Integer.valueOf(i17));
            }
            if (countDownLatch != null) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "queryUserName query for " + str + " using latch " + countDownLatch);
                    countDownLatch.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FTSMatchContact", e17, "", new java.lang.Object[0]);
                }
            }
            ((java.util.concurrent.ConcurrentHashMap) map).remove(qVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "queryUserName coast: %d, query %s, timeoutMs: %d, maxMatch %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            return qVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "Use new logic");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        dv4.q qVar2 = new dv4.q(str, i17);
        java.util.concurrent.CountDownLatch countDownLatch2 = (java.util.concurrent.CountDownLatch) ((java.util.concurrent.ConcurrentHashMap) map).get(qVar2);
        boolean z18 = countDownLatch2 != null;
        if (countDownLatch2 == null) {
            countDownLatch2 = new java.util.concurrent.CountDownLatch(1);
            ((java.util.concurrent.ConcurrentHashMap) map).put(qVar2, countDownLatch2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic start new task fail, query %s,maxMatch %d", str, java.lang.Integer.valueOf(i17));
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic not have a running task ,start new task, query %s,maxMatch %d", str, java.lang.Integer.valueOf(i17));
                z17 = true;
            }
            c(qVar2, xVar);
            z18 = z17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic have a running task ,wait for result, query %s,maxMatch %d", str, java.lang.Integer.valueOf(i17));
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic try to wait for latch");
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic waiting for latch using latch " + countDownLatch2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic latch wait finished, result is " + countDownLatch2.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic latch is null, do not wait");
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FTSMatchContact", e18, "new logic wait for task finish error", new java.lang.Object[0]);
        }
        ((java.util.concurrent.ConcurrentHashMap) map).remove(qVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "new logic queryUserName coast: %d, query %s, timeoutMs: %d, maxMatch %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        return qVar2;
    }

    public final boolean c(dv4.a aVar, o13.x xVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f325530a)) {
            return false;
        }
        p13.u uVar = new p13.u();
        uVar.f432674c = aVar.f325530a;
        uVar.f432678g = new int[]{131072};
        uVar.f432679h = new int[]{1, 5};
        uVar.f432680i = aVar.f325531b;
        ((u50.x) i95.n0.c(u50.x.class)).getClass();
        uVar.f432683l = r13.b.f450135d;
        uVar.f432681j = new java.util.HashSet();
        uVar.f432684m = xVar;
        uVar.f432686o = 1;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar).f432603m = aVar;
        return true;
    }

    public final boolean d() {
        boolean l17 = j62.e.g().l("clicfg_fts_contact_query_username_use_new_logic", false, true, true);
        if (this.f325539c != l17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "useNewQueryUserName:" + this.f325539c + " to:" + l17);
            this.f325539c = l17;
        }
        return this.f325539c;
    }
}
