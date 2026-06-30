package is0;

/* loaded from: classes14.dex */
public final class a implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f375919d;

    /* renamed from: e, reason: collision with root package name */
    public final int f375920e;

    /* renamed from: f, reason: collision with root package name */
    public final long f375921f;

    /* renamed from: g, reason: collision with root package name */
    public final int f375922g;

    /* renamed from: h, reason: collision with root package name */
    public final long f375923h;

    public a(long j17) {
        this.f375920e = -1;
        this.f375921f = 2L;
        this.f375922g = -1;
        this.f375921f = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOCreated");
        jx3.f.INSTANCE.w(1184L, 100L, 1L);
        int myTid = android.os.Process.myTid();
        this.f375922g = myTid;
        long nativeHandle = android.opengl.EGL14.eglGetCurrentContext().getNativeHandle();
        this.f375923h = nativeHandle;
        int q17 = rs0.i.f480829a.q();
        this.f375920e = q17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create frameBuffer:");
        sb6.append(q17);
        sb6.append(" tid:");
        sb6.append(myTid);
        sb6.append(", context: ");
        sb6.append(nativeHandle);
        sb6.append(", stackTrace: ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLFrameBufferObject", sb6.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f375919d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLFrameBufferObject", hashCode() + " close already close");
            return;
        }
        int myTid = android.os.Process.myTid();
        if (this.f375922g != myTid) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(hashCode());
            sb6.append(" Leaked by different thread!!!  scene：");
            sb6.append(this.f375921f);
            sb6.append("  created in:");
            sb6.append(this.f375922g);
            sb6.append(" release in:");
            sb6.append(myTid);
            sb6.append(", stackTrace:\t");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLFrameBufferObject", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeakedInErrorTid");
            jx3.f.INSTANCE.w(1184L, 201L, 1L);
            return;
        }
        this.f375919d = true;
        rs0.g gVar = rs0.i.f480829a;
        int i17 = this.f375920e;
        gVar.getClass();
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext.getNativeHandle() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLFrameBufferObject", "context is destroyed, framebuffer leaked! framebufferId: " + this.f375920e);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (eglGetCurrentContext.getNativeHandle() != this.f375923h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLFrameBufferObject", "release framebuffer(" + this.f375920e + ") with current context(" + eglGetCurrentContext.getNativeHandle() + ") which NOT equals to the origin context (" + this.f375923h + "). something wrong and causes leak!");
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(hashCode());
        sb7.append(" close framebufferId:");
        sb7.append(this.f375920e);
        sb7.append(" context: ");
        sb7.append(eglGetCurrentContext.getNativeHandle());
        sb7.append(", stacks:");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb7.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLFrameBufferObject", sb7.toString());
    }

    /* renamed from: finalize */
    public final void m139815xd764dc1e() {
        if (this.f375919d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLFrameBufferObject", hashCode() + " release success!");
            return;
        }
        long j17 = this.f375921f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeakedScene key:" + j17);
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.w(1184L, ((long) 100) + j17, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeaked");
        fVar.w(1184L, 101L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLFrameBufferObject", hashCode() + " Leaked !!!  scene：" + this.f375921f);
    }

    /* renamed from: toString */
    public java.lang.String m139816x9616526c() {
        return "hashcode:" + hashCode() + " frameBufferId:" + this.f375920e + " memRelease:" + this.f375919d + " scene:" + this.f375921f + " create-tid:" + this.f375922g;
    }
}
