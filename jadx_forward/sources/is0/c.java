package is0;

/* loaded from: classes14.dex */
public class c implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f375927d;

    /* renamed from: e, reason: collision with root package name */
    public int f375928e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f375929f;

    /* renamed from: g, reason: collision with root package name */
    public final long f375930g;

    /* renamed from: h, reason: collision with root package name */
    public final long f375931h;

    /* renamed from: i, reason: collision with root package name */
    public int f375932i;

    /* renamed from: m, reason: collision with root package name */
    public int f375933m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f375934n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f375935o = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e;

    /* renamed from: p, reason: collision with root package name */
    public int f375936p;

    public c(boolean z17, long j17) {
        this.f375927d = true;
        this.f375928e = -1;
        this.f375930g = 2L;
        this.f375932i = -1;
        this.f375930g = j17;
        if (j17 < 0) {
            this.f375930g = 15L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLTextureCreated");
        jx3.f.INSTANCE.w(1184L, 0L, 1L);
        this.f375927d = false;
        this.f375932i = android.os.Process.myTid();
        this.f375929f = z17;
        if (z17) {
            this.f375928e = rs0.i.f480829a.r();
        } else {
            rs0.g gVar = rs0.i.f480829a;
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(36197, iArr[0]);
            android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
            android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
            android.opengl.GLES20.glBindTexture(36197, 0);
            gVar.f("glGenTextures");
            this.f375928e = iArr[0];
        }
        long nativeHandle = android.opengl.EGL14.eglGetCurrentContext().getNativeHandle();
        this.f375931h = nativeHandle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" create texID:");
        sb6.append(this.f375928e);
        sb6.append("  sampler2D:");
        sb6.append(z17);
        sb6.append(" tid:");
        sb6.append(this.f375932i);
        sb6.append(", context: ");
        sb6.append(nativeHandle);
        sb6.append(", stackTrace:\t");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureObject", sb6.toString());
    }

    public static /* synthetic */ void b(is0.c cVar, int i17, int i18, int i19, java.nio.Buffer buffer, int i27, int i28, int i29, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: allocTexMem");
        }
        if ((i29 & 4) != 0) {
            i19 = 32856;
        }
        int i37 = i19;
        if ((i29 & 8) != 0) {
            buffer = null;
        }
        java.nio.Buffer buffer2 = buffer;
        if ((i29 & 16) != 0) {
            i27 = 9729;
        }
        int i38 = i27;
        if ((i29 & 32) != 0) {
            i28 = 10497;
        }
        cVar.a(i17, i18, i37, buffer2, i38, i28);
    }

    public static void c(is0.c cVar, android.graphics.Bitmap bitmap, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: allocTexMemFromBitmap");
        }
        if ((i19 & 2) != 0) {
            i17 = 9729;
        }
        if ((i19 & 4) != 0) {
            i18 = 10497;
        }
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (cVar.f375933m != bitmap.getWidth() || cVar.f375934n != bitmap.getHeight()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureObject", cVar.hashCode() + " allocTexMemFromBitmap, width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight() + ", internalFormat:" + cVar.f375935o + ", memorySize:" + cVar.j());
        }
        android.opengl.GLES20.glBindTexture(3553, cVar.f375928e);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        float f17 = i17;
        android.opengl.GLES20.glTexParameterf(3553, 10241, f17);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, f17);
        float f18 = i18;
        android.opengl.GLES20.glTexParameterf(3553, 10242, f18);
        android.opengl.GLES20.glTexParameterf(3553, 10243, f18);
        cVar.f375933m = bitmap.getWidth();
        cVar.f375934n = bitmap.getHeight();
        cVar.f375935o = android.opengl.GLUtils.getInternalFormat(bitmap);
    }

    public final void a(int i17, int i18, int i19, java.nio.Buffer buffer, int i27, int i28) {
        if (i17 == this.f375933m && i18 == this.f375934n && i19 == this.f375935o && buffer == null) {
            return;
        }
        int i29 = this.f375936p;
        this.f375936p = i29 + 1;
        if (i29 % 50 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureObject", hashCode() + " allocTexMem, width:" + i17 + ", height:" + i18 + ", internalFormat:" + i19 + ", memorySize:" + j());
        }
        android.opengl.GLES20.glBindTexture(3553, this.f375928e);
        android.opengl.GLES20.glTexImage2D(3553, 0, i19 != 6403 ? i19 != 6407 ? i19 != 6408 ? i19 : 32856 : 32849 : 33321, i17, i18, 0, i19 != 32849 ? i19 != 32856 ? i19 != 33321 ? i19 : 6403 : 6408 : 6407, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, buffer);
        float f17 = i27;
        android.opengl.GLES20.glTexParameterf(3553, 10241, f17);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, f17);
        float f18 = i28;
        android.opengl.GLES20.glTexParameterf(3553, 10242, f18);
        android.opengl.GLES20.glTexParameterf(3553, 10243, f18);
        this.f375933m = i17;
        this.f375934n = i18;
        this.f375935o = i19;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f375927d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureObject", hashCode() + " tex already close");
            return;
        }
        int myTid = android.os.Process.myTid();
        if (this.f375932i != myTid) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(hashCode());
            sb6.append(" Leaked by different thread!!!  scene：");
            sb6.append(this.f375930g);
            sb6.append("  created in:");
            sb6.append(this.f375932i);
            sb6.append(" release in:");
            sb6.append(myTid);
            sb6.append(", stackTrace:\t");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLTextureObject", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLTextureLeakedInErrorTid");
            jx3.f.INSTANCE.w(1184L, 200L, 1L);
            this.f375927d = false;
            return;
        }
        this.f375927d = true;
        rs0.g gVar = rs0.i.f480829a;
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f375928e}, 0);
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext.getNativeHandle() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLTextureObject", "context is destroyed, texture leaked! texID: " + this.f375928e);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (eglGetCurrentContext.getNativeHandle() != this.f375931h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLTextureObject", "release texID(" + this.f375928e + ") with current context(" + eglGetCurrentContext.getNativeHandle() + ") which NOT equals to the origin context (" + this.f375931h + "). something wrong and causes leak!");
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(hashCode());
        sb7.append(" close texID:");
        sb7.append(this.f375928e);
        sb7.append("  sampler2D:");
        sb7.append(this.f375929f);
        sb7.append(", context: ");
        sb7.append(eglGetCurrentContext.getNativeHandle());
        sb7.append(", stacks:");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb7.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureObject", sb7.toString());
    }

    public void f() {
        android.opengl.GLES20.glBindTexture(3553, this.f375928e);
    }

    /* renamed from: finalize */
    public final void m139818xd764dc1e() {
        if (this.f375927d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureObject", hashCode() + " release success!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLTextureLeaked");
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.w(1184L, 1L, 1L);
        long j17 = this.f375930g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLLeakIDKeyReport", "markGLTextureLeakedScene key:" + j17);
        fVar.w(1184L, j17, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLTextureObject", hashCode() + " Leaked !!!  scene：" + this.f375930g);
    }

    public final void i(is0.a aVar, int i17, int i18) {
        java.lang.String str;
        if (aVar != null) {
            rs0.i.f480829a.c(aVar, this, i17, i18);
        }
        int glCheckFramebufferStatus = android.opengl.GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            switch (glCheckFramebufferStatus) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
                default:
                    str = "unknown error";
                    break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLTextureObject", "bind framebuffer status not complete, status:" + glCheckFramebufferStatus + " error:" + str);
        }
    }

    public final int j() {
        int i17;
        if (!this.f375929f) {
            return ((this.f375933m * this.f375934n) * 3) / 2;
        }
        int i18 = this.f375933m * this.f375934n;
        switch (this.f375935o) {
            case com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e /* 6408 */:
            case 6409:
            case 6410:
                i17 = 32;
                break;
            default:
                i17 = 24;
                break;
        }
        return i18 * i17;
    }

    /* renamed from: toString */
    public java.lang.String m139819x9616526c() {
        return "hashcode:" + hashCode() + " texID:" + this.f375928e + " sampler2D:" + this.f375929f + " memRelease:" + this.f375927d + " scene:" + this.f375930g + " create-tid:" + this.f375932i + " width:" + this.f375933m + " height:" + this.f375934n;
    }
}
