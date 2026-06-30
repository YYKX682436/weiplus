package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes14.dex */
public abstract class a extends com.p314xaae8f345.mm.p872xbfc2bd01.g {
    public synchronized java.lang.Object l(java.lang.Integer num) {
        java.lang.Object obj;
        java.util.NavigableMap subMap = ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).subMap((java.lang.Object) num, true, (java.lang.Object) Integer.MAX_VALUE, true);
        if (subMap != null && !subMap.isEmpty()) {
            java.util.Iterator it = subMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                com.p314xaae8f345.mm.p872xbfc2bd01.d dVar = (com.p314xaae8f345.mm.p872xbfc2bd01.d) subMap.get(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()));
                if (((java.util.concurrent.ConcurrentLinkedQueue) dVar.f150490a).size() > 0) {
                    obj = ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f150490a).poll();
                    ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).put((java.lang.Integer) dVar.f150491b, dVar);
                    break;
                }
            }
            if (obj != null) {
                long e17 = e(obj);
                synchronized (this) {
                    this.f150495c -= e17;
                }
                return obj;
            }
        }
        return null;
    }

    public synchronized java.lang.Object m(java.lang.Integer num) {
        java.util.Queue queue;
        com.p314xaae8f345.mm.p872xbfc2bd01.d dVar = (com.p314xaae8f345.mm.p872xbfc2bd01.d) ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).get(num);
        if (dVar == null || ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f150490a).size() <= 0) {
            if (dVar != null && (queue = dVar.f150490a) != null) {
                ((java.util.concurrent.ConcurrentLinkedQueue) queue).size();
            }
            return null;
        }
        java.lang.Object poll = ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f150490a).poll();
        ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).put((java.lang.Integer) dVar.f150491b, dVar);
        long e17 = e(poll);
        synchronized (this) {
            this.f150495c -= e17;
        }
        return poll;
    }
}
