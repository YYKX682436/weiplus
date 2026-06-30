package p20;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.p {
    public g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p20.g(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new p20.g((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = p20.i.f432954g.get();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Preloader is paused, not processing waiting queue");
            return f0Var;
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = p20.i.f432952e;
        p20.a aVar2 = (p20.a) concurrentLinkedQueue.poll();
        if (aVar2 != null) {
            java.util.Set set = p20.i.f432953f;
            ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).remove(aVar2.a());
            if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) p20.i.f432950c).d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Processing next task from waiting queue: " + aVar2.a() + ", remaining in queue: " + concurrentLinkedQueue.size());
                p20.i.f432948a.a(aVar2);
            } else {
                concurrentLinkedQueue.offer(aVar2);
                ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).add(aVar2.a());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "No permit available, task returned to queue: " + aVar2.a());
            }
        }
        return f0Var;
    }
}
