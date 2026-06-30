package ev2;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final ev2.n f338454f = new ev2.n();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f338455a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "uni_action_like_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f338456b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338457c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f338458d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f338459e;

    public n() {
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u90) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f120664v).mo141623x754a37bb()).y0()).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90 t90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90) it.next();
                this.f338458d.put(java.lang.Long.valueOf(t90Var.f68554x88be67a1), t90Var);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MusicUni.FinderLikeActionMgr", th6, "restoreLocalLikeFeed", new java.lang.Object[0]);
        }
        this.f338456b = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f338457c = new java.util.concurrent.ConcurrentHashMap();
        this.f338458d = new java.util.HashMap();
        this.f338459e = new ev2.m(this);
    }

    public final int a(long j17, jv2.c commentObj, int i17) {
        ev2.t tVar;
        boolean z17;
        ev2.t tVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj, "commentObj");
        if (j17 == 0) {
            return commentObj.m141448xf4204902();
        }
        boolean z18 = commentObj.u0().m76081xbd8ebd19() == 1;
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j().r()).intValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f338457c;
        if (intValue == 1 || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M != 1) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap2 != null && (tVar = (ev2.t) concurrentHashMap2.get(new ev2.k(commentObj.t0(), i17))) != null) {
                z17 = tVar.f338468e;
            }
            z17 = z18;
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap3 != null && (tVar2 = (ev2.t) concurrentHashMap3.get(new ev2.k(commentObj.t0(), 1))) != null) {
                z17 = tVar2.f338468e;
            }
            z17 = z18;
        }
        return (!z18 || z18 == z17) ? (z18 || z18 == z17) ? commentObj.m141448xf4204902() : commentObj.m141448xf4204902() + 1 : commentObj.m141448xf4204902() - 1;
    }

    public final boolean b(long j17, jv2.c commentObj, int i17) {
        ev2.t tVar;
        ev2.t tVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj, "commentObj");
        if (j17 == 0) {
            return commentObj.u0().m76081xbd8ebd19() == 1;
        }
        boolean z17 = commentObj.u0().m76081xbd8ebd19() == 1;
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j().r()).intValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f338457c;
        if (intValue == 1 || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M != 1) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap2 != null && (tVar = (ev2.t) concurrentHashMap2.get(new ev2.k(commentObj.t0(), i17))) != null) {
                z17 = tVar.f338468e;
            }
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap3 != null && (tVar2 = (ev2.t) concurrentHashMap3.get(new ev2.k(commentObj.t0(), 1))) != null) {
                z17 = tVar2.f338468e;
            }
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z17;
    }

    public final void c(ev2.t action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f338457c.get(java.lang.Long.valueOf(action.f338470g));
        if (concurrentHashMap != null) {
            ev2.k kVar = new ev2.k(action.f338467d.t0(), action.f338471h);
            ev2.t tVar = (ev2.t) concurrentHashMap.get(kVar);
            if (tVar != null) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (action.f338440b >= tVar.f338440b) {
                    concurrentHashMap.remove(kVar);
                }
            }
        }
    }

    public final void d() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f338456b;
        if (concurrentLinkedQueue.size() <= 0) {
            return;
        }
        ev2.e eVar = (ev2.e) concurrentLinkedQueue.poll();
        eVar.getClass();
        boolean z17 = eVar.f338439a < 2 && c01.id.a() - eVar.f338440b <= ((long) 1200000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.FinderLikeActionMgr", "tryNext isValid:" + z17 + " action:" + eVar + " size:" + concurrentLinkedQueue.size());
        if (z17) {
            this.f338455a.b(new ev2.q(eVar), new ev2.l(this, eVar));
        } else {
            d();
        }
    }
}
