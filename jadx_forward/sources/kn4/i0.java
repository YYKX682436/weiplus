package kn4;

@j95.b
/* loaded from: classes12.dex */
public class i0 extends i95.w implements pf0.t, pf0.u {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f391242d = com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f391243e = new java.util.ArrayList();

    public final void Ai(java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.Intent.ACTION_NET_STATS");
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        intent.putExtra("ui", str);
        intent.putExtra("opCode", i17);
        ((ku5.t0) ku5.t0.f394148d).h(new kn4.k0(this, intent), "TrafficMonitorBroadcast");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(final android.content.Context context) {
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: kn4.i0$$a
            @Override // java.lang.Runnable
            public final void run() {
                gp1.v Bi;
                kn4.i0 i0Var = kn4.i0.this;
                android.content.Context context2 = context;
                i0Var.getClass();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_NET_STATS");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                if (fp.h.a(33)) {
                    context2.registerReceiver(new com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88(), intentFilter);
                } else {
                    context2.registerReceiver(new com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88(), intentFilter, 2);
                }
                for (kn4.g0 g0Var : ((java.util.concurrent.ConcurrentHashMap) kn4.o0.b().f391268a).values()) {
                    synchronized (g0Var) {
                        if (!g0Var.f391230j) {
                            g0Var.f391230j = true;
                            g0Var.f391228h = new kn4.f0(g0Var);
                            try {
                                g0Var.f391229i = ((ku5.t0) ku5.t0.f394148d).d(g0Var.f391228h, 0L, g0Var.f391199b);
                            } catch (java.lang.IllegalArgumentException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrafficInspector", "timer.schedule got an IllegalArgumentException, %s", e17.getMessage());
                            }
                        }
                    }
                }
                kn4.j0 j0Var = new kn4.j0(i0Var);
                if (fp.h.a(33)) {
                    context2.registerReceiver(j0Var, new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_START_TRAFFIC_COLLECTOR"));
                } else {
                    context2.registerReceiver(j0Var, new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_START_TRAFFIC_COLLECTOR"), 2);
                }
                kn4.v vVar = kn4.v.f391287a;
                pv.d0 d0Var = (pv.d0) i95.n0.c(pv.d0.class);
                if (d0Var == null || (Bi = ((ov.i0) d0Var).Bi()) == null) {
                    return;
                }
                Bi.a0(0, vVar);
            }
        });
    }

    public void wi(int i17, java.util.Map map, long j17) {
        java.util.List list = f391243e;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((pf0.s) it.next()).a(i17, map, j17);
            }
        }
    }
}
