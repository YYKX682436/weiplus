package p20;

/* loaded from: classes12.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.v9 f432943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bw5.v9 v9Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f432943d = v9Var;
        this.f432944e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p20.b(this.f432943d, this.f432944e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p20.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = p20.i.f432954g;
        if (atomicBoolean.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Preloader was paused, resuming all tasks");
            if (atomicBoolean.get()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Resuming all preload tasks, active tasks: ");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) p20.i.f432951d;
                sb6.append(concurrentHashMap.size());
                sb6.append(", waiting tasks: ");
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = p20.i.f432952e;
                sb6.append(concurrentLinkedQueue.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", sb6.toString());
                atomicBoolean.set(false);
                java.util.List S0 = kz5.n0.S0(concurrentHashMap.values());
                concurrentHashMap.clear();
                java.util.List K0 = kz5.n0.K0(S0, 5);
                java.util.List R = kz5.n0.R(S0, 5);
                for (p20.a aVar2 : kz5.n0.x0(R)) {
                    concurrentLinkedQueue.offer(aVar2);
                    ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f432953f).add(aVar2.a());
                }
                java.util.Iterator it = K0.iterator();
                while (it.hasNext()) {
                    p20.i.f432948a.a((p20.a) it.next());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Resumed " + K0.size() + " tasks, " + R.size() + " tasks moved to waiting queue");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Preloader is not paused, no need to resume");
            }
        }
        bw5.v9 v9Var = this.f432943d;
        java.lang.String str = v9Var.f115758m[1] ? v9Var.f115752d : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUrl(...)");
        p20.a aVar3 = new p20.a(new p20.j(str), v9Var.f115757i, this.f432944e);
        p20.i iVar = p20.i.f432948a;
        java.lang.String a17 = aVar3.a();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) p20.i.f432951d;
        boolean contains = concurrentHashMap2.containsKey(a17) ? true : ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f432953f).contains(a17);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Task already exists, skipping: " + aVar3.a());
            return f0Var;
        }
        if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) p20.i.f432950c).d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Acquired semaphore permit, executing task: " + aVar3.a() + ", active tasks: " + concurrentHashMap2.size());
            iVar.a(aVar3);
        } else {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = p20.i.f432952e;
            concurrentLinkedQueue2.offer(aVar3);
            ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f432953f).add(aVar3.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Preload queue is full, added to waiting queue: " + aVar3.a() + ", waiting queue size: " + concurrentLinkedQueue2.size());
        }
        return f0Var;
    }
}
