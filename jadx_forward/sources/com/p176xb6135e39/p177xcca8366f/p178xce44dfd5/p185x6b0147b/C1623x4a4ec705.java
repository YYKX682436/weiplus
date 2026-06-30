package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b;

/* renamed from: com.google.android.exoplayer2.video.DummySurface */
/* loaded from: classes14.dex */
public final class C1623x4a4ec705 extends android.view.Surface {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f125701f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f125702g;

    /* renamed from: d, reason: collision with root package name */
    public final u9.d f125703d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125704e;

    public C1623x4a4ec705(u9.d dVar, android.graphics.SurfaceTexture surfaceTexture, boolean z17, u9.c cVar) {
        super(surfaceTexture);
        this.f125703d = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(android.content.Context r7) {
        /*
            java.lang.Class<com.google.android.exoplayer2.video.DummySurface> r0 = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705.class
            monitor-enter(r0)
            boolean r1 = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705.f125702g     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L4c
            int r1 = t9.d0.f498031a     // Catch: java.lang.Throwable -> L50
            r2 = 0
            r3 = 24
            r4 = 1
            if (r1 < r3) goto L48
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch: java.lang.Throwable -> L50
            r6 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r6)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L44
            java.lang.String r6 = "EGL_EXT_protected_content"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L50
            if (r5 != 0) goto L24
            goto L44
        L24:
            if (r1 != r3) goto L31
            java.lang.String r3 = "samsung"
            java.lang.String r5 = t9.d0.f498033c     // Catch: java.lang.Throwable -> L50
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L31
            goto L44
        L31:
            r3 = 26
            if (r1 >= r3) goto L42
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L42
            goto L44
        L42:
            r7 = r4
            goto L45
        L44:
            r7 = r2
        L45:
            if (r7 == 0) goto L48
            r2 = r4
        L48:
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705.f125701f = r2     // Catch: java.lang.Throwable -> L50
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705.f125702g = r4     // Catch: java.lang.Throwable -> L50
        L4c:
            boolean r7 = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705.f125701f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            return r7
        L50:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705.a(android.content.Context):boolean");
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705 b(android.content.Context context, boolean z17) {
        if (t9.d0.f498031a < 17) {
            throw new java.lang.UnsupportedOperationException("Unsupported prior to API level 17");
        }
        boolean z18 = false;
        t9.a.d(!z17 || a(context));
        u9.d dVar = new u9.d();
        dVar.start();
        dVar.f507268h = new android.os.Handler(dVar.getLooper(), dVar);
        synchronized (dVar) {
            dVar.f507268h.obtainMessage(1, z17 ? 1 : 0, 0).sendToTarget();
            while (dVar.f507272o == null && dVar.f507271n == null && dVar.f507270m == null) {
                try {
                    dVar.wait();
                } catch (java.lang.InterruptedException unused) {
                    z18 = true;
                }
            }
        }
        if (z18) {
            java.lang.Thread.currentThread().interrupt();
        }
        java.lang.RuntimeException runtimeException = dVar.f507271n;
        if (runtimeException != null) {
            throw runtimeException;
        }
        java.lang.Error error = dVar.f507270m;
        if (error == null) {
            return dVar.f507272o;
        }
        throw error;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f125703d) {
            if (!this.f125704e) {
                this.f125703d.f507268h.sendEmptyMessage(3);
                this.f125704e = true;
            }
        }
    }
}
