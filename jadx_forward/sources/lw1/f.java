package lw1;

/* loaded from: classes14.dex */
public final class f extends p3325xe03a0797.p3326xc267989b.p0 implements java.io.Closeable {

    /* renamed from: e, reason: collision with root package name */
    public iw1.f f403085e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Thread f403086f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f403087g = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingDeque f403088h = new java.util.concurrent.LinkedBlockingDeque();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f403089i = new java.util.ArrayList();

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        lw1.m mVar = (lw1.m) context.get(lw1.m.f403093e);
        lw1.k kVar = mVar != null ? mVar.f403095d : null;
        if (kVar instanceof lw1.g) {
            M(this.f403085e, block);
            return;
        }
        if (kVar instanceof lw1.i) {
            M(this.f403085e, new lw1.a(kVar, this, block));
            return;
        }
        if (kVar instanceof lw1.j) {
            if (this.f403086f == null) {
                M(this.f403085e, new lw1.c(this));
            }
            this.f403088h.offer(block);
            return;
        }
        if (kVar instanceof lw1.h) {
            M(this.f403085e, block);
            return;
        }
        java.util.ArrayList arrayList = this.f403089i;
        boolean isEmpty = arrayList.isEmpty();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f403087g;
        if (isEmpty || (linkedBlockingQueue.size() > arrayList.size() && arrayList.size() < 5)) {
            iw1.f fVar = this.f403085e;
            if (fVar == null || (hVar = fVar.f376741e) == null || (eGLContext = hVar.f480827c) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                return;
            } else {
                iw1.a aVar = new iw1.a(linkedBlockingQueue, eGLContext, new lw1.d(arrayList), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                arrayList.add(aVar);
                K(aVar);
            }
        }
        linkedBlockingQueue.offer(block);
    }

    public final java.lang.Thread K(iw1.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f376729m);
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(aVar.f376729m, -4);
        a17.start();
        new android.os.Handler(a17.getLooper()).post(new lw1.e(aVar, a17));
        return a17;
    }

    public final void M(iw1.f fVar, java.lang.Runnable runnable) {
        if (fVar == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b((android.os.HandlerThread) ((jz5.n) fVar.f376739c).mo141623x754a37bb(), java.lang.Thread.currentThread())) {
            runnable.run();
            return;
        }
        android.os.Handler handler = fVar.f376738b ? (android.os.Handler) ((jz5.n) fVar.f376740d).mo141623x754a37bb() : null;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "close");
        java.util.Iterator it = this.f403089i.iterator();
        while (it.hasNext()) {
            ((iw1.a) it.next()).f376727h = false;
        }
        this.f403087g.clear();
        this.f403088h.clear();
        java.lang.Thread thread = this.f403086f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f403086f = null;
        iw1.f fVar = this.f403085e;
        if (fVar != null) {
            ((android.os.Handler) ((jz5.n) fVar.f376740d).mo141623x754a37bb()).post(new iw1.c(fVar));
            ((android.os.HandlerThread) ((jz5.n) fVar.f376739c).mo141623x754a37bb()).quitSafely();
        }
        this.f403085e = null;
    }
}
