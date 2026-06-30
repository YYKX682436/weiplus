package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes15.dex */
public class u2 {

    /* renamed from: f, reason: collision with root package name */
    public static int f274537f;

    /* renamed from: h, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.t2 f274539h;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f274541j;

    /* renamed from: a, reason: collision with root package name */
    public final int f274542a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274543b;

    /* renamed from: c, reason: collision with root package name */
    public long f274544c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f274545d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.s2 f274546e;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f274538g = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f274540i = false;

    public u2(com.p314xaae8f345.mm.sdk.p2603x2137b148.s2 s2Var, boolean z17) {
        iz5.a.g("bumper not initialized", f274540i);
        this.f274546e = s2Var;
        this.f274543b = z17;
        if (f274537f >= 8192) {
            f274537f = 0;
        }
        int i17 = f274537f + 1;
        f274537f = i17;
        this.f274542a = i17;
    }

    public static long a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t2 t2Var;
        boolean z17;
        f274541j = false;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Map map = f274538g;
        hashSet.addAll(((java.util.HashMap) map).keySet());
        java.util.Iterator it = hashSet.iterator();
        long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u2 u2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.u2) ((java.util.HashMap) map).get(num);
            if (u2Var != null) {
                long j18 = u2Var.f274544c;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j18;
                if (elapsedRealtime < 0) {
                    elapsedRealtime = 0;
                }
                long j19 = u2Var.f274545d;
                if (elapsedRealtime > j19) {
                    dh4.f0 f0Var = ((dh4.d0) u2Var.f274546e).f314041a;
                    if (f0Var.f314050i == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f0Var.f314049h)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomServer", "talkNoopTimer error: roomId %d, talkUsername %s", java.lang.Integer.valueOf(f0Var.f314050i), f0Var.f314049h);
                        f0Var.f314060v = null;
                        z17 = false;
                    } else {
                        java.lang.String str = f0Var.f314049h;
                        c01.d9.e().g(new eh4.e(str, f0Var.f314050i, f0Var.f314051m, f0Var.l(str)));
                        z17 = true;
                    }
                    if (z17 && u2Var.f274543b) {
                        j17 = u2Var.f274545d;
                    } else {
                        linkedList.add(num);
                    }
                    u2Var.f274544c = android.os.SystemClock.elapsedRealtime();
                } else if (j19 - elapsedRealtime < j17) {
                    j17 = j19 - elapsedRealtime;
                }
            }
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            ((java.util.HashMap) map).remove(linkedList.get(i17));
        }
        if (!f274541j && j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 && (t2Var = f274539h) != null) {
            t2Var.mo43377xae7a2e7a();
        }
        return j17;
    }

    /* renamed from: finalize */
    public void m77817xd764dc1e() {
        ((java.util.HashMap) f274538g).remove(java.lang.Integer.valueOf(this.f274542a));
        super.finalize();
    }
}
