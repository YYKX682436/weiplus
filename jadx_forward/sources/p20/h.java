package p20;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f432947d = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p20.h(this.f432947d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p20.h hVar = (p20.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Stopping preload tasks for group: ");
        java.lang.String str = this.f432947d;
        sb6.append(str);
        sb6.append(", current preloading: ");
        java.util.Map map = p20.i.f432951d;
        sb6.append(((java.util.concurrent.ConcurrentHashMap) map).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", sb6.toString());
        sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p20.a) entry.getValue()).f432942c, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            try {
                ((rx.a) a0Var).aj(str2, new dn.h());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Stopped preload task: " + str2 + " from group: " + str);
                ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) p20.i.f432950c).c();
                ((java.util.concurrent.ConcurrentHashMap) p20.i.f432951d).remove(str2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsPlayerPreloadMgr", "Failed to stop preload task: " + str2 + " from group: " + str, e17);
            }
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = p20.i.f432952e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : concurrentLinkedQueue) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p20.a) obj2).f432942c, str)) {
                arrayList.add(obj2);
            }
        }
        p20.i.f432952e.removeAll(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f432953f).remove(((p20.a) it.next()).a());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Stopped " + linkedHashMap.size() + " active tasks and " + arrayList.size() + " waiting tasks for group: " + str);
        return jz5.f0.f384359a;
    }
}
