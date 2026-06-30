package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.TextureBufferImpl */
/* loaded from: classes16.dex */
public class C29875x346d5db implements org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer {

    /* renamed from: height */
    private final int f76000xb7389127;

    /* renamed from: id, reason: collision with root package name */
    private final int f429472id;

    /* renamed from: refCountDelegate */
    private final org.p3371xd0ce3e8d.C29845xdcc09601 f76001xefc51e1;

    /* renamed from: refCountMonitor */
    private final org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor f76002xd4fc4d7e;

    /* renamed from: toI420Handler */
    private final android.os.Handler f76003x79a1a126;

    /* renamed from: transformMatrix */
    private final android.graphics.Matrix f76004xcd15ae4d;

    /* renamed from: type */
    private final org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type f76005x368f3a;

    /* renamed from: unscaledHeight */
    private final int f76006x2fe633a;

    /* renamed from: unscaledWidth */
    private final int f76007x3abc4d53;

    /* renamed from: width */
    private final int f76008x6be2dc6;

    /* renamed from: yuvConverter */
    private final org.p3371xd0ce3e8d.C29917xb5bbfe06 f76009xabf0a9e6;

    /* renamed from: org.webrtc.TextureBufferImpl$RefCountMonitor */
    /* loaded from: classes16.dex */
    public interface RefCountMonitor {
        /* renamed from: onDestroy */
        void mo156414xac79a11b(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db);

        /* renamed from: onRelease */
        void mo156415x90a72928(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db);

        /* renamed from: onRetain */
        void mo156416x5742c7c4(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db);
    }

    public C29875x346d5db(int i17, int i18, org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type type, int i19, android.graphics.Matrix matrix, android.os.Handler handler, org.p3371xd0ce3e8d.C29917xb5bbfe06 c29917xb5bbfe06, final java.lang.Runnable runnable) {
        this(i17, i18, i17, i18, type, i19, matrix, handler, c29917xb5bbfe06, new org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.1
            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onDestroy */
            public void mo156414xac79a11b(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onRelease */
            public void mo156415x90a72928(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
            }

            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onRetain */
            public void mo156416x5742c7c4(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ void m156442x51ef5f0f(org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor refCountMonitor) {
        refCountMonitor.mo156414xac79a11b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$toI420$1 */
    public /* synthetic */ org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer m156443x11909d4e() {
        return this.f76009xabf0a9e6.m156595x38b81db3(this);
    }

    /* renamed from: applyTransformMatrix */
    public org.p3371xd0ce3e8d.C29875x346d5db m156444xf5f3d8ff(android.graphics.Matrix matrix, int i17, int i18) {
        return m156441xf5f3d8ff(matrix, i17, i18, i17, i18);
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: cropAndScale */
    public org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63(int i17, int i18, int i19, int i27, int i28, int i29) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(i17 / this.f76008x6be2dc6, (r0 - (i18 + i27)) / this.f76000xb7389127);
        matrix.preScale(i19 / this.f76008x6be2dc6, i27 / this.f76000xb7389127);
        return m156441xf5f3d8ff(matrix, java.lang.Math.round((this.f76007x3abc4d53 * i19) / this.f76008x6be2dc6), java.lang.Math.round((this.f76006x2fe633a * i27) / this.f76000xb7389127), i28, i29);
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getHeight */
    public int mo155641x1c4fb41d() {
        return this.f76000xb7389127;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer
    /* renamed from: getTextureId */
    public int mo156445xc2ca74e0() {
        return this.f429472id;
    }

    /* renamed from: getToI420Handler */
    public android.os.Handler m156446x37015d70() {
        return this.f76003x79a1a126;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer
    /* renamed from: getTransformMatrix */
    public android.graphics.Matrix mo156447xb1778017() {
        return this.f76004xcd15ae4d;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer
    /* renamed from: getType */
    public org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type mo156448xfb85f7b0() {
        return this.f76005x368f3a;
    }

    /* renamed from: getUnscaledHeight */
    public int m156449xf1963030() {
        return this.f76006x2fe633a;
    }

    /* renamed from: getUnscaledWidth */
    public int m156450xf81c099d() {
        return this.f76007x3abc4d53;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getWidth */
    public int mo155645x755bd410() {
        return this.f76008x6be2dc6;
    }

    /* renamed from: getYuvConverter */
    public org.p3371xd0ce3e8d.C29917xb5bbfe06 m156451xce33c5c() {
        return this.f76009xabf0a9e6;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        this.f76002xd4fc4d7e.mo156415x90a72928(this);
        this.f76001xefc51e1.mo155513x41012807();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        this.f76002xd4fc4d7e.mo156416x5742c7c4(this);
        this.f76001xefc51e1.mo155514xc84df105();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: toI420 */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184() {
        return (org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer) org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156476x29214152(this.f76003x79a1a126, new java.util.concurrent.Callable() { // from class: org.webrtc.TextureBufferImpl$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer m156443x11909d4e;
                m156443x11909d4e = org.p3371xd0ce3e8d.C29875x346d5db.this.m156443x11909d4e();
                return m156443x11909d4e;
            }
        });
    }

    public C29875x346d5db(int i17, int i18, org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type type, int i19, android.graphics.Matrix matrix, android.os.Handler handler, org.p3371xd0ce3e8d.C29917xb5bbfe06 c29917xb5bbfe06, org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor refCountMonitor) {
        this(i17, i18, i17, i18, type, i19, matrix, handler, c29917xb5bbfe06, refCountMonitor);
    }

    /* renamed from: applyTransformMatrix */
    private org.p3371xd0ce3e8d.C29875x346d5db m156441xf5f3d8ff(android.graphics.Matrix matrix, int i17, int i18, int i19, int i27) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(this.f76004xcd15ae4d);
        matrix2.preConcat(matrix);
        mo155514xc84df105();
        return new org.p3371xd0ce3e8d.C29875x346d5db(i17, i18, i19, i27, this.f76005x368f3a, this.f429472id, matrix2, this.f76003x79a1a126, this.f76009xabf0a9e6, new org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.2
            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onDestroy */
            public void mo156414xac79a11b(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
                org.p3371xd0ce3e8d.C29875x346d5db.this.mo155513x41012807();
            }

            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onRelease */
            public void mo156415x90a72928(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
                org.p3371xd0ce3e8d.C29875x346d5db.this.f76002xd4fc4d7e.mo156415x90a72928(org.p3371xd0ce3e8d.C29875x346d5db.this);
            }

            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onRetain */
            public void mo156416x5742c7c4(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
                org.p3371xd0ce3e8d.C29875x346d5db.this.f76002xd4fc4d7e.mo156416x5742c7c4(org.p3371xd0ce3e8d.C29875x346d5db.this);
            }
        });
    }

    private C29875x346d5db(int i17, int i18, int i19, int i27, org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type type, int i28, android.graphics.Matrix matrix, android.os.Handler handler, org.p3371xd0ce3e8d.C29917xb5bbfe06 c29917xb5bbfe06, final org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor refCountMonitor) {
        this.f76007x3abc4d53 = i17;
        this.f76006x2fe633a = i18;
        this.f76008x6be2dc6 = i19;
        this.f76000xb7389127 = i27;
        this.f76005x368f3a = type;
        this.f429472id = i28;
        this.f76004xcd15ae4d = matrix;
        this.f76003x79a1a126 = handler;
        this.f76009xabf0a9e6 = c29917xb5bbfe06;
        this.f76001xefc51e1 = new org.p3371xd0ce3e8d.C29845xdcc09601(new java.lang.Runnable() { // from class: org.webrtc.TextureBufferImpl$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29875x346d5db.this.m156442x51ef5f0f(refCountMonitor);
            }
        });
        this.f76002xd4fc4d7e = refCountMonitor;
    }
}
