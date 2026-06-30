package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes7.dex */
public final class i6 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f229558d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f229559e;

    public i6() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f229559e = concurrentHashMap;
        concurrentHashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.f229753e, new ad3.b(this));
        concurrentHashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.f229754f, new ad3.a(this));
    }

    public final void Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4 z4Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f229558d;
        if (concurrentHashMap.get(z4Var) != null) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) concurrentHashMap.get(z4Var);
            boolean z17 = false;
            if (concurrentLinkedQueue != null && concurrentLinkedQueue.size() == 0) {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        concurrentHashMap.remove(z4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushJsEventExtFeatureService", "unRegister eventName:" + z4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4 u4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4) this.f229559e.get(z4Var);
        if (u4Var != null) {
            u4Var.b();
        }
    }

    public void Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4 eventName, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) this.f229558d.get(eventName);
        if (concurrentLinkedQueue != null) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                lc3.h0 h0Var = (lc3.h0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6) it.next()).f229555b.get();
                if (h0Var != null) {
                    h0Var.C0(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d(eventName.name(), data));
                }
            }
        }
    }

    public synchronized void Di(java.lang.String instanceName, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4 eventName) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushJsEventExtFeatureService", "unregisterEventCallback instanceName:" + instanceName + " eventName:" + eventName);
        if (eventName == com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.f229752d) {
            for (java.util.Map.Entry entry : this.f229558d.entrySet()) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6 h6Var : (java.lang.Iterable) entry.getValue()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(instanceName, h6Var.f229554a) && (concurrentLinkedQueue2 = (java.util.concurrent.ConcurrentLinkedQueue) this.f229558d.get(entry.getKey())) != null) {
                        concurrentLinkedQueue2.remove(h6Var);
                    }
                    Ai((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4) entry.getKey());
                }
            }
        } else {
            java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6> concurrentLinkedQueue3 = (java.util.concurrent.ConcurrentLinkedQueue) this.f229558d.get(eventName);
            if (concurrentLinkedQueue3 != null) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6 h6Var2 : concurrentLinkedQueue3) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h6Var2.f229554a, instanceName) && (concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) this.f229558d.get(eventName)) != null) {
                        concurrentLinkedQueue.remove(h6Var2);
                    }
                }
            }
            Ai(eventName);
        }
    }

    public final void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4 z4Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f229558d;
        if (concurrentHashMap.get(z4Var) != null) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) concurrentHashMap.get(z4Var);
            boolean z17 = false;
            if (concurrentLinkedQueue != null && concurrentLinkedQueue.size() == 0) {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushJsEventExtFeatureService", "register eventName:" + z4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4 u4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4) this.f229559e.get(z4Var);
        if (u4Var != null) {
            u4Var.a();
        }
    }
}
