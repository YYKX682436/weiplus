package nq;

/* loaded from: classes8.dex */
public class s extends java.lang.Thread {
    public nq.q B;
    public final java.lang.ref.WeakReference C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f420433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f420434e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f420435f;

    /* renamed from: g, reason: collision with root package name */
    public final nq.r f420436g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420437h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f420438i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f420439m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f420440n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f420441o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f420442p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f420443q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f420444r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f420445s;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f420451y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f420452z = true;
    public final java.lang.Object A = new java.lang.Object();

    /* renamed from: t, reason: collision with root package name */
    public int f420446t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f420447u = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f420449w = true;

    /* renamed from: v, reason: collision with root package name */
    public int f420448v = 1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f420450x = false;

    public s(java.lang.ref.WeakReference weakReference) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("MicroMsg.GLCommandThread" + getId());
        this.f420435f = handlerThread;
        handlerThread.start();
        this.f420436g = new nq.r(this, handlerThread.getLooper());
        this.C = weakReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nq.s.a():void");
    }

    public final void b(javax.microedition.khronos.opengles.GL10 gl10) {
        mq.h.b("MicroMsg.GLThread", "notifyOnEglSurfaceChanged", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) this.C.get();
        if (surfaceHolderCallback2C10435xb52e77fb != null) {
            nq.f fVar = (nq.f) surfaceHolderCallback2C10435xb52e77fb.f146416g;
            fVar.getClass();
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLSurfaceChanged and do nothing", new java.lang.Object[0]);
            fVar.f420409j = 0;
        }
    }

    public final boolean c() {
        return !this.f420439m && this.f420440n && !this.f420441o && this.f420446t > 0 && this.f420447u > 0 && (this.f420449w || this.f420448v == 1);
    }

    public final void d() {
        if (this.f420443q) {
            this.f420443q = false;
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb.f146412s.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("MicroMsg.GLThread" + getId());
        mq.h.b("MicroMsg.GLThread", "starting tid=" + getId(), new java.lang.Object[0]);
        try {
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -8);
        } catch (java.lang.Exception unused) {
        }
        try {
            try {
                a();
            } finally {
                com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb.f146412s.a(this);
            }
        } catch (java.lang.InterruptedException e17) {
            mq.h.c("MicroMsg.GLThread", e17, "InterruptedException", new java.lang.Object[0]);
            nq.t tVar = com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb.f146412s;
        } catch (java.lang.Throwable th6) {
            mq.h.a("MicroMsg.GLThread", "alvinluo GLThread#run() stack = [%s]", android.util.Log.getStackTraceString(th6));
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) this.C.get();
            if (surfaceHolderCallback2C10435xb52e77fb != null) {
                ((nq.f) surfaceHolderCallback2C10435xb52e77fb.f146416g).e(th6);
            }
        }
    }
}
