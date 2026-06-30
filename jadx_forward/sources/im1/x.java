package im1;

/* loaded from: classes14.dex */
public class x implements yf.t {

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f373753b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f373754c = false;

    /* renamed from: d, reason: collision with root package name */
    public float f373755d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f373756e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f373757f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f373758g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373759h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f373760i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f373761j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f373762k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f373763l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f373764m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f373765n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f373766o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f373767p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f373768q = new int[1];

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f373769r = new java.util.ArrayList();

    @Override // yf.t
    public void a(yf.s sVar, java.lang.String str) {
        f(new im1.t(this, str, sVar));
    }

    @Override // yf.t
    public void b(yf.r rVar, java.lang.String str) {
        f(new im1.v(this, rVar, str));
    }

    public final void c() {
        this.f373753b = ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).wi(1, rh0.z.f477150n, null, false);
        int[] iArr = this.f373768q;
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(3553, iArr[0]);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
        android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9728);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        android.opengl.GLES20.glBindTexture(3553, 0);
        ((p05.l4) ((rh0.e0) this.f373753b)).F.f144457d = 2;
        this.f373754c = true;
    }

    @Override // yf.t
    public void d() {
        f(new im1.w(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r4 > 1.0f) goto L4;
     */
    @Override // yf.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(yf.q r3, float r4) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r4 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r4
            int r0 = (int) r0
            im1.r r1 = new im1.r
            r1.<init>(r2, r3, r0, r4)
            r2.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.x.e(yf.q, float):void");
    }

    public final void f(java.lang.Runnable runnable) {
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("runnable must not be null");
        }
        synchronized (this) {
            this.f373769r.add(runnable);
        }
    }

    @Override // yf.t
    /* renamed from: isEnabled */
    public boolean mo136758x7d80d2b7() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x000b, code lost:
    
        if (r11 > 1.0f) goto L4;
     */
    @Override // yf.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(java.lang.String r10, float r11) {
        /*
            r9 = this;
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r11 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L4f
            com.tencent.mm.vfs.z7 r0 = com.p314xaae8f345.mm.vfs.z7.a(r10)     // Catch: java.lang.Exception -> L4e
            r1 = 0
            java.lang.String r2 = r0.f294812f
            if (r2 == 0) goto L36
            java.lang.String r6 = com.p314xaae8f345.mm.vfs.e8.l(r2, r1, r1)     // Catch: java.lang.Exception -> L4e
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> L4e
            if (r2 != 0) goto L36
            com.tencent.mm.vfs.z7 r2 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Exception -> L4e
            java.lang.String r4 = r0.f294810d     // Catch: java.lang.Exception -> L4e
            java.lang.String r5 = r0.f294811e     // Catch: java.lang.Exception -> L4e
            java.lang.String r7 = r0.f294813g     // Catch: java.lang.Exception -> L4e
            java.lang.String r8 = r0.f294814h     // Catch: java.lang.Exception -> L4e
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L4e
            r0 = r2
        L36:
            com.tencent.mm.vfs.b3 r2 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Exception -> L4e
            r3 = 0
            com.tencent.mm.vfs.z2 r0 = r2.m(r0, r3)     // Catch: java.lang.Exception -> L4e
            boolean r2 = r0.a()     // Catch: java.lang.Exception -> L4e
            if (r2 != 0) goto L44
            goto L4c
        L44:
            com.tencent.mm.vfs.q2 r1 = r0.f294799a     // Catch: java.lang.Exception -> L4e
            java.lang.String r0 = r0.f294800b     // Catch: java.lang.Exception -> L4e
            boolean r1 = r1.F(r0)     // Catch: java.lang.Exception -> L4e
        L4c:
            if (r1 != 0) goto L4f
        L4e:
            return
        L4f:
            im1.s r0 = new im1.s
            r0.<init>(r9, r10, r11)
            r9.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.x.k(java.lang.String, float):void");
    }

    @Override // yf.t
    public void l() {
        k("", 0.0f);
    }

    @Override // yf.t
    public void m() {
        f(new im1.u(this));
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onDetectFacePoints */
    public void mo29881xb9d12ca2(float[] fArr) {
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0008, B:9:0x0011, B:11:0x001d, B:13:0x0024, B:15:0x002a, B:17:0x0030, B:19:0x0036, B:21:0x003e, B:23:0x0046, B:25:0x004c, B:27:0x0052, B:29:0x0058, B:31:0x005e, B:33:0x0064, B:35:0x006a, B:40:0x0076, B:41:0x00b4, B:44:0x00b6), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6 A[Catch: all -> 0x00b8, DONT_GENERATE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0008, B:9:0x0011, B:11:0x001d, B:13:0x0024, B:15:0x002a, B:17:0x0030, B:19:0x0036, B:21:0x003e, B:23:0x0046, B:25:0x004c, B:27:0x0052, B:29:0x0058, B:31:0x005e, B:33:0x0064, B:35:0x006a, B:40:0x0076, B:41:0x00b4, B:44:0x00b6), top: B:2:0x0001 }] */
    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onTextureCustomProcess */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo29893x2613f4e2(int r13, int r14, int r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f373754c     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L8
            r12.c()     // Catch: java.lang.Throwable -> Lb8
        L8:
            java.util.ArrayList r0 = r12.f373769r     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            r1 = 0
            if (r0 != 0) goto L1d
            java.util.ArrayList r0 = r12.f373769r     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> Lb8
            r0.run()     // Catch: java.lang.Throwable -> Lb8
            goto L8
        L1d:
            float r0 = r12.f373755d     // Catch: java.lang.Throwable -> Lb8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L73
            float r0 = r12.f373756e     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L73
            float r0 = r12.f373757f     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L73
            float r0 = r12.f373758g     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L73
            java.lang.String r0 = r12.f373759h     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L73
            long r2 = r12.f373760i     // Catch: java.lang.Throwable -> Lb8
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = r12.f373761j     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = r12.f373762k     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = r12.f373763l     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = r12.f373764m     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = r12.f373765n     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = r12.f373766o     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = r12.f373767p     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L71
            goto L73
        L71:
            r0 = r1
            goto L74
        L73:
            r0 = 1
        L74:
            if (r0 == 0) goto Lb6
            int[] r0 = r12.f373768q     // Catch: java.lang.Throwable -> Lb8
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lb8
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r0)     // Catch: java.lang.Throwable -> Lb8
            r3 = 3553(0xde1, float:4.979E-42)
            r4 = 0
            r5 = 6408(0x1908, float:8.98E-42)
            r8 = 0
            r9 = 6408(0x1908, float:8.98E-42)
            r10 = 5121(0x1401, float:7.176E-42)
            r11 = 0
            r6 = r14
            r7 = r15
            android.opengl.GLES20.glTexImage2D(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb8
            rh0.d0 r0 = r12.f373753b     // Catch: java.lang.Throwable -> Lb8
            p05.l4 r0 = (p05.l4) r0     // Catch: java.lang.Throwable -> Lb8
            r0.J(r14, r15)     // Catch: java.lang.Throwable -> Lb8
            rh0.d0 r14 = r12.f373753b     // Catch: java.lang.Throwable -> Lb8
            p05.l4 r14 = (p05.l4) r14     // Catch: java.lang.Throwable -> Lb8
            r14.q(r13, r1, r1, r1)     // Catch: java.lang.Throwable -> Lb8
            rh0.d0 r14 = r12.f373753b     // Catch: java.lang.Throwable -> Lb8
            int[] r15 = r12.f373768q     // Catch: java.lang.Throwable -> Lb8
            r4 = r15[r1]     // Catch: java.lang.Throwable -> Lb8
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r2 = r14
            p05.l4 r2 = (p05.l4) r2     // Catch: java.lang.Throwable -> Lb8
            r3 = r13
            r2.w(r3, r4, r5, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb8
            int[] r13 = r12.f373768q     // Catch: java.lang.Throwable -> Lb8
            r13 = r13[r1]     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb8
            return r13
        Lb6:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb8
            return r13
        Lb8:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb8
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.x.mo29893x2613f4e2(int, int, int):int");
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onTextureDestoryed */
    public void mo29894x6fb839d7() {
        synchronized (this) {
            if (this.f373754c) {
                ((p05.l4) this.f373753b).o();
                android.opengl.GLES20.glDeleteTextures(1, this.f373768q, 0);
                this.f373754c = false;
            }
        }
    }
}
