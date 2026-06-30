package q01;

/* loaded from: classes12.dex */
public final class b0 implements q01.b1 {
    public final void a(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object obj;
        q01.e0 e0Var = q01.e0.f440803a;
        synchronized (e0Var.d()) {
            int size = e0Var.d().size();
            int hashCode = m1Var.hashCode();
            java.util.Iterator it = e0Var.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((java.lang.Number) ((jz5.l) obj).f384366d).intValue() == hashCode) {
                        break;
                    }
                }
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect watch-removed: " + m1Var.getClass().getName() + '@' + hashCode + ", total=" + size);
                ap.a.a(10001, "errNetScene", new java.lang.Throwable(), null, "WatchRemoved", q01.a1.f440792a.a(m1Var), java.lang.String.valueOf(size), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Number) lVar.f384367e).longValue()));
            }
        }
        if (q01.a1.f440792a.b()) {
            m1Var.m48022x4479fa06().g(301);
            synchronized (q01.a1.f440794c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTracker", "#onDequeueNetScene: " + ((q01.s0) ((java.util.Map) q01.a1.f440795d.mo141623x754a37bb()).remove(java.lang.Integer.valueOf(m1Var.hashCode()))) + '@' + m1Var.hashCode());
            }
        }
    }

    public final void b(com.p314xaae8f345.mm.p944x882e457a.m1 netScene) {
        q01.a1 a1Var = q01.a1.f440792a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netScene, "netScene");
        if (a1Var.b()) {
            netScene.m48022x4479fa06().g(210);
            synchronized (q01.a1.f440794c) {
                q01.s0 c17 = a1Var.c(netScene);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTracker", "#onEnqueueNetScene: " + c17 + '@' + netScene.hashCode());
                ((java.util.Map) q01.a1.f440795d.mo141623x754a37bb()).put(java.lang.Integer.valueOf(netScene.hashCode()), c17);
            }
        }
    }
}
