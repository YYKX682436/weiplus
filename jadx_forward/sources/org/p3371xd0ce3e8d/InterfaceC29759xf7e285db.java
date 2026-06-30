package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.EglBase */
/* loaded from: classes14.dex */
public interface InterfaceC29759xf7e285db {

    /* renamed from: EGL_OPENGL_ES2_BIT */
    public static final int f75307x7af810d7 = 4;

    /* renamed from: EGL_OPENGL_ES3_BIT */
    public static final int f75308x7b062858 = 64;

    /* renamed from: EGL_RECORDABLE_ANDROID */
    public static final int f75309x5a4fb9b0 = 12610;

    /* renamed from: lock */
    public static final java.lang.Object f75310x32c52b = new java.lang.Object();

    /* renamed from: CONFIG_PLAIN */
    public static final int[] f75304xe0dfc26d = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155428xeee135f9().m155422x8b0dcb55();

    /* renamed from: CONFIG_RGBA */
    public static final int[] f75306x8320d411 = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155428xeee135f9().m155423x225bf8bd(true).m155422x8b0dcb55();

    /* renamed from: CONFIG_PIXEL_BUFFER */
    public static final int[] f75302x3f179a16 = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155428xeee135f9().m155426xebc3a580(true).m155422x8b0dcb55();

    /* renamed from: CONFIG_PIXEL_RGBA_BUFFER */
    public static final int[] f75303x69d5cd95 = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155428xeee135f9().m155423x225bf8bd(true).m155426xebc3a580(true).m155422x8b0dcb55();

    /* renamed from: CONFIG_RECORDABLE */
    public static final int[] f75305x8b357e48 = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155428xeee135f9().m155424x4479fb77(true).m155422x8b0dcb55();

    /* renamed from: org.webrtc.EglBase$ConfigBuilder */
    /* loaded from: classes14.dex */
    public static class ConfigBuilder {

        /* renamed from: hasAlphaChannel */
        private boolean f75311x7238d7f;

        /* renamed from: isRecordable */
        private boolean f75312xad3e6df5;

        /* renamed from: openGlesVersion */
        private int f75313x2aefdc5b = 2;

        /* renamed from: supportsPixelBuffer */
        private boolean f75314x454f0942;

        /* renamed from: createConfigAttributes */
        public int[] m155422x8b0dcb55() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.f75311x7238d7f) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i17 = this.f75313x2aefdc5b;
            if (i17 == 2 || i17 == 3) {
                arrayList.add(12352);
                arrayList.add(java.lang.Integer.valueOf(this.f75313x2aefdc5b == 3 ? 64 : 4));
            }
            if (this.f75314x454f0942) {
                arrayList.add(12339);
                arrayList.add(1);
            }
            if (this.f75312xad3e6df5) {
                arrayList.add(java.lang.Integer.valueOf(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0));
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                iArr[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
            }
            return iArr;
        }

        /* renamed from: setHasAlphaChannel */
        public org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.ConfigBuilder m155423x225bf8bd(boolean z17) {
            this.f75311x7238d7f = z17;
            return this;
        }

        /* renamed from: setIsRecordable */
        public org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.ConfigBuilder m155424x4479fb77(boolean z17) {
            this.f75312xad3e6df5 = z17;
            return this;
        }

        /* renamed from: setOpenGlesVersion */
        public org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.ConfigBuilder m155425x46284799(int i17) {
            if (i17 >= 1 && i17 <= 3) {
                this.f75313x2aefdc5b = i17;
                return this;
            }
            throw new java.lang.IllegalArgumentException("OpenGL ES version " + i17 + " not supported");
        }

        /* renamed from: setSupportsPixelBuffer */
        public org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.ConfigBuilder m155426xebc3a580(boolean z17) {
            this.f75314x454f0942 = z17;
            return this;
        }
    }

    /* renamed from: org.webrtc.EglBase$Context */
    /* loaded from: classes7.dex */
    public interface Context {

        /* renamed from: NO_CONTEXT */
        public static final long f75315x1f912111 = 0;

        /* renamed from: getNativeEglContext */
        long mo155427x545a932();
    }

    /* renamed from: org.webrtc.EglBase$EglBaseStatic */
    /* loaded from: classes14.dex */
    public static class EglBaseStatic {
        /* renamed from: configBuilder */
        public static org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.ConfigBuilder m155428xeee135f9() {
            return new org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.ConfigBuilder();
        }

        /* renamed from: create */
        public static org.p3371xd0ce3e8d.InterfaceC29759xf7e285db m155431xaf65a0fc(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, int[] iArr) {
            if (context == null) {
                return org.p3371xd0ce3e8d.C29763x3abc887e.m155455xc7351f4b() ? m155437xe1206011(iArr) : m155434xe120600d(iArr);
            }
            if (context instanceof org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context) {
                return m155436xe1206011((org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context) context, iArr);
            }
            if (context instanceof org.p3371xd0ce3e8d.InterfaceC29760x8958813a.Context) {
                return m155433xe120600d((org.p3371xd0ce3e8d.InterfaceC29760x8958813a.Context) context, iArr);
            }
            throw new java.lang.IllegalArgumentException("Unrecognized Context");
        }

        /* renamed from: createEgl10 */
        public static org.p3371xd0ce3e8d.InterfaceC29760x8958813a m155434xe120600d(int[] iArr) {
            return new org.p3371xd0ce3e8d.C29761x3a842a7a(null, iArr);
        }

        /* renamed from: createEgl14 */
        public static org.p3371xd0ce3e8d.InterfaceC29762x8958813e m155437xe1206011(int[] iArr) {
            return new org.p3371xd0ce3e8d.C29763x3abc887e(null, iArr);
        }

        /* renamed from: getOpenGlesVersionFromConfig */
        public static int m155438xb07a7f91(int[] iArr) {
            for (int i17 = 0; i17 < iArr.length - 1; i17++) {
                if (iArr[i17] == 12352) {
                    int i18 = iArr[i17 + 1];
                    if (i18 != 4) {
                        return i18 != 64 ? 1 : 3;
                    }
                    return 2;
                }
            }
            return 1;
        }

        /* renamed from: createEgl10 */
        public static org.p3371xd0ce3e8d.InterfaceC29760x8958813a m155433xe120600d(org.p3371xd0ce3e8d.InterfaceC29760x8958813a.Context context, int[] iArr) {
            return new org.p3371xd0ce3e8d.C29761x3a842a7a(context == null ? null : context.mo155439xca7ed05d(), iArr);
        }

        /* renamed from: createEgl14 */
        public static org.p3371xd0ce3e8d.InterfaceC29762x8958813e m155436xe1206011(org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context context, int[] iArr) {
            return new org.p3371xd0ce3e8d.C29763x3abc887e(context == null ? null : context.mo155447xca7ed05d(), iArr);
        }

        /* renamed from: createEgl10 */
        public static org.p3371xd0ce3e8d.InterfaceC29760x8958813a m155432xe120600d(javax.microedition.khronos.egl.EGLContext eGLContext, int[] iArr) {
            return new org.p3371xd0ce3e8d.C29761x3a842a7a(eGLContext, iArr);
        }

        /* renamed from: createEgl14 */
        public static org.p3371xd0ce3e8d.InterfaceC29762x8958813e m155435xe1206011(android.opengl.EGLContext eGLContext, int[] iArr) {
            return new org.p3371xd0ce3e8d.C29763x3abc887e(eGLContext, iArr);
        }

        /* renamed from: create */
        public static org.p3371xd0ce3e8d.InterfaceC29759xf7e285db m155429xaf65a0fc() {
            return m155431xaf65a0fc(null, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75304xe0dfc26d);
        }

        /* renamed from: create */
        public static org.p3371xd0ce3e8d.InterfaceC29759xf7e285db m155430xaf65a0fc(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context) {
            return m155431xaf65a0fc(context, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75304xe0dfc26d);
        }
    }

    /* renamed from: createDummyPbufferSurface */
    void mo155408xc7ea9609();

    /* renamed from: createPbufferSurface */
    void mo155409xb71ce1f9(int i17, int i18);

    /* renamed from: createSurface */
    void mo155410x17711011(android.graphics.SurfaceTexture surfaceTexture);

    /* renamed from: createSurface */
    void mo155411x17711011(android.view.Surface surface);

    /* renamed from: detachCurrent */
    void mo155412x6c0f2266();

    /* renamed from: getEglBaseContext */
    org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context mo155413x66100c2a();

    /* renamed from: hasSurface */
    boolean mo155414xaadb0b3();

    /* renamed from: makeCurrent */
    void mo155415x900967ab();

    /* renamed from: release */
    void mo155416x41012807();

    /* renamed from: releaseSurface */
    void mo155417xc6cc96a6();

    /* renamed from: surfaceHeight */
    int mo155418x59c7434();

    /* renamed from: surfaceWidth */
    int mo155419xdffb3519();

    /* renamed from: swapBuffers */
    void mo155420x82211f20();

    /* renamed from: swapBuffers */
    void mo155421x82211f20(long j17);
}
