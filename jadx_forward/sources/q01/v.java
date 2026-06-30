package q01;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.x f440871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f440872e;

    public v(q01.x xVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f440871d = xVar;
        this.f440872e = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        q01.x xVar = this.f440871d;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f440872e;
        if (xVar.d().get() < xVar.c().get() && !(m1Var instanceof z11.b)) {
            q01.e0 e0Var = q01.e0.f440803a;
            int i17 = 0;
            if (e0Var.e()) {
                synchronized (e0Var.d()) {
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
                        q01.e0.f440803a.d().remove(lVar);
                    }
                    q01.e0 e0Var2 = q01.e0.f440803a;
                    e0Var2.d().add(new jz5.l(java.lang.Integer.valueOf(hashCode), java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect watch: " + m1Var.getClass().getName() + '@' + hashCode + ", total=" + e0Var2.d().size());
                }
            }
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = xVar.f440878e;
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = u0Var instanceof com.p314xaae8f345.mm.p944x882e457a.r1 ? (com.p314xaae8f345.mm.p944x882e457a.r1) u0Var : null;
            if (r1Var != null) {
                synchronized (r1Var.f152306p) {
                    linkedList = new java.util.LinkedList(r1Var.f152300g);
                }
                if (!linkedList.isEmpty()) {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p944x882e457a.m1) it6.next(), m1Var) && (i17 = i17 + 1) < 0) {
                            kz5.c0.o();
                            throw null;
                        }
                    }
                }
            } else {
                i17 = -1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect leaking callback to onSceneEnd: " + xVar.e() + ", leakCount=" + i17);
            java.util.LinkedHashMap a17 = xVar.a();
            a17.put("leakCount", java.lang.Integer.valueOf(i17));
            ap.a.a(10001, "errNetScene", null, a17, "LeakCallback", q01.a1.f440792a.a(m1Var), xVar.b(), java.lang.String.valueOf(i17));
        }
    }
}
