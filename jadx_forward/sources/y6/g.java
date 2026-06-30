package y6;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f541123a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final y6.f f541124b = new y6.f();

    public void a(java.lang.String str) {
        y6.e eVar;
        synchronized (this) {
            java.lang.Object obj = ((java.util.HashMap) this.f541123a).get(str);
            q7.n.b(obj);
            eVar = (y6.e) obj;
            int i17 = eVar.f541121b;
            if (i17 < 1) {
                throw new java.lang.IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + eVar.f541121b);
            }
            int i18 = i17 - 1;
            eVar.f541121b = i18;
            if (i18 == 0) {
                y6.e eVar2 = (y6.e) ((java.util.HashMap) this.f541123a).remove(str);
                if (!eVar2.equals(eVar)) {
                    throw new java.lang.IllegalStateException("Removed the wrong lock, expected to remove: " + eVar + ", but actually removed: " + eVar2 + ", safeKey: " + str);
                }
                y6.f fVar = this.f541124b;
                synchronized (fVar.f541122a) {
                    if (((java.util.ArrayDeque) fVar.f541122a).size() < 10) {
                        ((java.util.ArrayDeque) fVar.f541122a).offer(eVar2);
                    }
                }
            }
        }
        ((java.util.concurrent.locks.ReentrantLock) eVar.f541120a).unlock();
    }
}
