package e51;

/* loaded from: classes10.dex */
public final class e extends android.os.Handler implements e51.b {

    /* renamed from: d, reason: collision with root package name */
    public final e51.m f331108d;

    /* renamed from: e, reason: collision with root package name */
    public final e51.d f331109e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f331110f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.os.Looper looper, e51.m confettiView) {
        super(looper);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(looper, "looper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confettiView, "confettiView");
        this.f331108d = confettiView;
        this.f331109e = new e51.d(new java.lang.ref.WeakReference(this));
        this.f331110f = new java.util.LinkedList();
    }

    public final void a(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        synchronized (this.f331110f) {
            java.util.Iterator it = this.f331110f.iterator();
            while (it.hasNext()) {
                ((e51.j) ((e51.l) it.next())).f331117e.draw(canvas);
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                synchronized (this.f331110f) {
                    this.f331110f.clear();
                }
                e51.d dVar = this.f331109e;
                dVar.f331107d = false;
                dVar.f331105b.removeFrameCallback(dVar.f331106c);
                return;
            }
            java.lang.Object obj = msg.obj;
            e51.l lVar = obj instanceof e51.l ? (e51.l) obj : null;
            if (lVar == null) {
                return;
            }
            ((e51.j) lVar).G = android.os.SystemClock.uptimeMillis();
            synchronized (this.f331110f) {
                this.f331110f.add(lVar);
            }
            e51.d dVar2 = this.f331109e;
            if (dVar2.f331107d) {
                return;
            }
            dVar2.f331107d = true;
            dVar2.f331105b.removeFrameCallback(dVar2.f331106c);
            dVar2.f331105b.postFrameCallback(dVar2.f331106c);
            return;
        }
        java.lang.Object obj2 = msg.obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj2).longValue();
        synchronized (this.f331110f) {
            java.util.Iterator it = this.f331110f.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                e51.j jVar = (e51.j) ((e51.l) next);
                long j17 = longValue - jVar.G;
                jVar.i(j17);
                if (((java.util.ArrayList) jVar.f331119g).size() != 0 || j17 < jVar.f331123k) {
                    z17 = true;
                } else {
                    jVar.h();
                    z17 = false;
                }
                if (!z17) {
                    it.remove();
                }
            }
        }
        if (this.f331110f.isEmpty()) {
            e51.d dVar3 = this.f331109e;
            dVar3.f331107d = false;
            dVar3.f331105b.removeFrameCallback(dVar3.f331106c);
        }
        this.f331108d.a();
    }
}
