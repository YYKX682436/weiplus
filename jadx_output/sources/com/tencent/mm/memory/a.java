package com.tencent.mm.memory;

/* loaded from: classes14.dex */
public abstract class a extends com.tencent.mm.memory.g {
    public synchronized java.lang.Object l(java.lang.Integer num) {
        java.lang.Object obj;
        java.util.NavigableMap subMap = ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).subMap((java.lang.Object) num, true, (java.lang.Object) Integer.MAX_VALUE, true);
        if (subMap != null && !subMap.isEmpty()) {
            java.util.Iterator it = subMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                com.tencent.mm.memory.d dVar = (com.tencent.mm.memory.d) subMap.get(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()));
                if (((java.util.concurrent.ConcurrentLinkedQueue) dVar.f68957a).size() > 0) {
                    obj = ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f68957a).poll();
                    ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).put((java.lang.Integer) dVar.f68958b, dVar);
                    break;
                }
            }
            if (obj != null) {
                long e17 = e(obj);
                synchronized (this) {
                    this.f68962c -= e17;
                }
                return obj;
            }
        }
        return null;
    }

    public synchronized java.lang.Object m(java.lang.Integer num) {
        java.util.Queue queue;
        com.tencent.mm.memory.d dVar = (com.tencent.mm.memory.d) ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).get(num);
        if (dVar == null || ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f68957a).size() <= 0) {
            if (dVar != null && (queue = dVar.f68957a) != null) {
                ((java.util.concurrent.ConcurrentLinkedQueue) queue).size();
            }
            return null;
        }
        java.lang.Object poll = ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f68957a).poll();
        ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).put((java.lang.Integer) dVar.f68958b, dVar);
        long e17 = e(poll);
        synchronized (this) {
            this.f68962c -= e17;
        }
        return poll;
    }
}
