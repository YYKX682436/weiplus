package wq4;

/* loaded from: classes13.dex */
public class m extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public boolean f530197d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f530198e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f530199f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f530200g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f530201h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f530202i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f530203m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f530204n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f530209s;

    /* renamed from: v, reason: collision with root package name */
    public wq4.l f530212v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.ref.WeakReference f530213w;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f530210t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f530211u = true;

    /* renamed from: o, reason: collision with root package name */
    public int f530205o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f530206p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f530208r = true;

    /* renamed from: q, reason: collision with root package name */
    public int f530207q = 1;

    public m(java.lang.ref.WeakReference weakReference) {
        this.f530213w = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq4.m.a():void");
    }

    public final boolean b() {
        return this.f530199f && !this.f530200g && this.f530205o > 0 && this.f530206p > 0 && (this.f530208r || this.f530207q == 1);
    }

    public void c() {
        wq4.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r;
        synchronized (nVar) {
            this.f530197d = true;
            nVar.notifyAll();
            while (!this.f530198e) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void d() {
        if (this.f530202i) {
            wq4.l lVar = this.f530212v;
            lVar.getClass();
            java.lang.Thread.currentThread().getId();
            if (lVar.f530195f != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b textureViewSurfaceTextureListenerC18921x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b) lVar.f530190a.get();
                if (textureViewSurfaceTextureListenerC18921x32ae0c3b != null) {
                    textureViewSurfaceTextureListenerC18921x32ae0c3b.f258568i.mo174321x8812055(lVar.f530191b, lVar.f530192c, lVar.f530195f);
                }
                lVar.f530195f = null;
            }
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = lVar.f530192c;
            if (eGLDisplay != null) {
                lVar.f530191b.eglTerminate(eGLDisplay);
                lVar.f530192c = null;
            }
            this.f530202i = false;
            wq4.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r;
            if (nVar.f530217d == this) {
                nVar.f530217d = null;
            }
            nVar.notifyAll();
        }
    }

    public final void e() {
        if (this.f530203m) {
            this.f530203m = false;
            wq4.l lVar = this.f530212v;
            lVar.getClass();
            java.lang.Thread.currentThread().getId();
            lVar.b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("GLThread " + getId());
        getId();
        try {
            a();
        } catch (java.lang.InterruptedException | java.lang.RuntimeException unused) {
        } catch (java.lang.Throwable th6) {
            wq4.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r.b(this);
            throw th6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r.b(this);
    }
}
