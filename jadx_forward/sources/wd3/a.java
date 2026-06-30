package wd3;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "startListenToEvent";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("eventName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiStartListenToEvent", "eventName:" + optString);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            u(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.m66569xdce0328(optString));
            s().mo146xb9724478(k());
        } catch (java.lang.IllegalArgumentException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiStartListenToEvent", "eventName error");
            s().mo146xb9724478(i(lc3.x.f399470d));
        }
    }

    public final void u(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4 g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4.class);
        java.lang.String instanceName = e().f425864a;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f399423a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6 i6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6) g4Var;
        synchronized (i6Var) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushJsEventExtFeatureService", "registerEventCallback instanceName:" + instanceName + " eventName:" + event);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6 h6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h6(instanceName, weakReference);
            i6Var.wi(event);
            if (i6Var.f229558d.get(event) == null) {
                i6Var.f229558d.put(event, new java.util.concurrent.ConcurrentLinkedQueue());
            }
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) i6Var.f229558d.get(event);
            if (concurrentLinkedQueue != null) {
                concurrentLinkedQueue.add(h6Var);
            }
        }
    }
}
