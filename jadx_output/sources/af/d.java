package af;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final af.d f4444a = new af.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f4445b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String instanceId) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        af.c cVar = (af.c) f4445b.remove(instanceId);
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandParallelTasksCollection", "finishAllTask: ");
            java.util.HashMap hashMap = cVar.f4442a;
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.concurrent.FutureTask futureTask = ((af.b) ((java.util.Map.Entry) it.next()).getValue()).f4437a;
                if (futureTask != null) {
                    if (futureTask == null) {
                        throw new java.lang.IllegalStateException();
                    }
                    futureTask.cancel(false);
                }
            }
            hashMap.clear();
            java.util.LinkedList linkedList = cVar.f4443b;
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((yz5.a) it6.next()).invoke();
            }
            linkedList.clear();
        }
    }

    public final af.c b(java.lang.String instanceId, boolean z17) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f4445b;
        af.c cVar = (af.c) concurrentHashMap.get(instanceId);
        if (cVar != null) {
            return cVar;
        }
        if (!z17) {
            return null;
        }
        af.c cVar2 = new af.c();
        concurrentHashMap.put(instanceId, cVar2);
        return cVar2;
    }
}
