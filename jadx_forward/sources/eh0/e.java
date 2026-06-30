package eh0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f334406a = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String talker, long j17, long j18, java.lang.String deltaText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deltaText, "deltaText");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f334406a.get(talker);
        if (copyOnWriteArrayList == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp) ((dh0.i) it.next())).q0(talker, j17, j18, deltaText);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyResultContentDelta error", new java.lang.Object[0]);
            }
        }
    }

    public final void b(java.lang.String talker, long j17, long j18, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f334406a.get(talker);
        if (copyOnWriteArrayList == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp) ((dh0.i) it.next())).s0(talker, j17, j18, i17, str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyStreamError error", new java.lang.Object[0]);
            }
        }
    }

    public final void c(java.lang.String talker, long j17, long j18, java.lang.String streamText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamText, "streamText");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f334406a.get(talker);
        if (copyOnWriteArrayList == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp) ((dh0.i) it.next())).t0(talker, j17, j18, streamText);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyThinkingDelta error", new java.lang.Object[0]);
            }
        }
    }
}
