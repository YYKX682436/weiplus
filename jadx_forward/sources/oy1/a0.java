package oy1;

/* loaded from: classes13.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f431372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy1.c0 f431373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f431374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f431375g;

    public a0(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, oy1.c0 c0Var, int i17, int i18) {
        this.f431372d = m1Var;
        this.f431373e = c0Var;
        this.f431374f = i17;
        this.f431375g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f431372d;
        if ((m1Var instanceof ny1.j) && ((ny1.j) m1Var).f422943f.f422947a == this.f431373e.f431379a) {
            java.util.concurrent.ConcurrentLinkedQueue localReportIdList = ((ny1.j) m1Var).f422943f.f422950d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localReportIdList, "localReportIdList");
            java.lang.Long l17 = (java.lang.Long) kz5.n0.Y(localReportIdList);
            if (l17 != null) {
                oy1.c0 c0Var = this.f431373e;
                long longValue = l17.longValue();
                synchronized (c0Var.f431391m) {
                    oy1.v vVar = (oy1.v) ((java.util.LinkedHashMap) c0Var.f431391m).get(java.lang.Long.valueOf(longValue));
                    if (vVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiStorageHelper", "netScene end !");
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        ((p3325xe03a0797.p3326xc267989b.r) ((qy1.o) vVar).f449279a).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                    }
                }
            }
            if (this.f431374f == 0 && this.f431375g == 0) {
                oy1.c0 c0Var2 = this.f431373e;
                com.p314xaae8f345.mm.p944x882e457a.m1 scene = this.f431372d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scene, "$scene");
                c0Var2.getClass();
                if ((scene instanceof ny1.j ? (ny1.j) scene : null) != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i17 = c0Var2.i();
                    android.os.Message mo50288x733c63a2 = c0Var2.i().mo50288x733c63a2();
                    mo50288x733c63a2.what = 1002;
                    ny1.k kVar = ((ny1.j) scene).f422943f;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    mo50288x733c63a2.obj = nm5.j.e(kVar, bool, bool, bool);
                    i17.mo50308x2936bf5f(mo50288x733c63a2);
                    return;
                }
                return;
            }
            qy1.g gVar = qy1.g.f449258a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f431373e.f431379a);
            sb6.append('_');
            sb6.append(this.f431375g);
            sb6.append('_');
            sb6.append(this.f431374f);
            gVar.l(11, sb6.toString());
            oy1.c0 c0Var3 = this.f431373e;
            com.p314xaae8f345.mm.p944x882e457a.m1 scene2 = this.f431372d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scene2, "$scene");
            c0Var3.getClass();
            ny1.k kVar2 = ((ny1.j) scene2).f422943f;
            if (kVar2 != null && (concurrentLinkedQueue = kVar2.f422949c) != null) {
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    ((r45.pq5) it.next()).f464851i++;
                }
            }
            oy1.c0 c0Var4 = this.f431373e;
            com.p314xaae8f345.mm.p944x882e457a.m1 scene3 = this.f431372d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scene3, "$scene");
            c0Var4.n(scene3, oy1.m.f431418a.a(this.f431373e.f431379a) == 0, this.f431375g);
        }
    }
}
