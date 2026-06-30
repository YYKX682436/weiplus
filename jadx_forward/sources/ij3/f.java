package ij3;

/* loaded from: classes14.dex */
public final class f extends p3325xe03a0797.p3326xc267989b.p0 implements java.io.Closeable {

    /* renamed from: e, reason: collision with root package name */
    public fj3.f f373237e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Thread f373238f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f373239g = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingDeque f373240h = new java.util.concurrent.LinkedBlockingDeque();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f373241i = new java.util.ArrayList();

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ij3.m mVar = (ij3.m) context.get(ij3.m.f373245e);
        ij3.k kVar = mVar != null ? mVar.f373248d : null;
        if (kVar instanceof ij3.g) {
            M(this.f373237e, block);
            return;
        }
        if (kVar instanceof ij3.i) {
            M(this.f373237e, new ij3.a(kVar, this, block));
            return;
        }
        if (kVar instanceof ij3.j) {
            if (this.f373238f == null) {
                M(this.f373237e, new ij3.c(this));
            }
            this.f373240h.offer(block);
            return;
        }
        if (kVar instanceof ij3.h) {
            M(this.f373237e, block);
            return;
        }
        java.util.ArrayList arrayList = this.f373241i;
        boolean isEmpty = arrayList.isEmpty();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f373239g;
        if (isEmpty || (linkedBlockingQueue.size() > arrayList.size() && arrayList.size() < 5)) {
            fj3.f fVar = this.f373237e;
            if (fVar == null || (hVar = fVar.f344736e) == null || (eGLContext = hVar.f480827c) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                return;
            }
            fj3.a aVar = new fj3.a(linkedBlockingQueue, eGLContext, new ij3.d(arrayList), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            arrayList.add(aVar);
            zj3.g gVar = zj3.g.f554835a;
            zj3.g.f554852r = java.lang.Math.max(zj3.g.f554852r, arrayList.size());
            K(aVar);
        }
        linkedBlockingQueue.offer(block);
    }

    public final java.lang.Thread K(fj3.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f344724m);
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(aVar.f344724m, -4);
        a17.start();
        new android.os.Handler(a17.getLooper()).post(new ij3.e(aVar, a17));
        return a17;
    }

    public final void M(fj3.f fVar, java.lang.Runnable runnable) {
        if (fVar == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b((android.os.HandlerThread) ((jz5.n) fVar.f344734c).mo141623x754a37bb(), java.lang.Thread.currentThread())) {
            runnable.run();
            return;
        }
        android.os.Handler handler = fVar.f344733b ? (android.os.Handler) ((jz5.n) fVar.f344735d).mo141623x754a37bb() : null;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "close");
        java.util.Iterator it = this.f373241i.iterator();
        while (it.hasNext()) {
            ((fj3.a) it.next()).f344722h = false;
        }
        this.f373239g.clear();
        this.f373240h.clear();
        java.lang.Thread thread = this.f373238f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f373238f = null;
        fj3.f fVar = this.f373237e;
        if (fVar != null) {
            ((android.os.Handler) ((jz5.n) fVar.f344735d).mo141623x754a37bb()).post(new fj3.c(fVar));
            ((android.os.HandlerThread) ((jz5.n) fVar.f344734c).mo141623x754a37bb()).quitSafely();
        }
        this.f373237e = null;
    }
}
