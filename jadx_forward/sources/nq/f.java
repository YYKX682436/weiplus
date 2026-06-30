package nq;

/* loaded from: classes8.dex */
public final class f implements nq.w {

    /* renamed from: n, reason: collision with root package name */
    public static long f420399n = 500;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 f420400a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f420401b;

    /* renamed from: c, reason: collision with root package name */
    public int f420402c;

    /* renamed from: d, reason: collision with root package name */
    public int f420403d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f420404e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f420405f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f420406g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420407h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb f420408i;

    /* renamed from: j, reason: collision with root package name */
    public int f420409j;

    /* renamed from: k, reason: collision with root package name */
    public nq.a f420410k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f420411l;

    /* renamed from: m, reason: collision with root package name */
    public final lq.c f420412m;

    public f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        lq.c cVar = lq.d.f401980a;
        lq.c cVar2 = lq.d.f401980a;
        this.f420412m = cVar2;
        if (cVar2 == null || !cVar2.getIsEnable() || cVar2 == null || cVar2.mo43643x947cd6f5()) {
            mq.h.a("MicroMsg.DynamicBgSurfaceView", "alvinluo AppBrandDesktopConfig not enableNativeDynamicBackground", new java.lang.Object[0]);
        } else {
            this.f420400a = new com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524();
        }
        this.f420401b = new java.lang.ref.WeakReference(context);
    }

    public final void a() {
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo NativeRender init", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e9524 = this.f420400a;
        if (c10432x58e9524 != null) {
            try {
                if (c10432x58e9524.f146409a <= 0) {
                    c10432x58e9524.f146409a = c10432x58e9524.m43646xb90145c7();
                    mq.h.b("MicroMsg.DynamicBackgroundNative", "create DynamicBackgroundNative inst: " + c10432x58e9524.f146409a, new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th6) {
                mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo nativeInit exception", new java.lang.Object[0]);
                if (th6 instanceof java.lang.UnsatisfiedLinkError) {
                    mq.h.a("MicroMsg.DynamicBgSurfaceView", "alvinluo nativeInit called failed, try to load so once more", new java.lang.Object[0]);
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add("dynamicBg");
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                        yj0.a.f(obj, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        if (c10432x58e9524 != null) {
                            c10432x58e9524.m43646xb90145c7();
                        }
                        this.f420411l = true;
                        return;
                    } catch (java.lang.Throwable unused) {
                        lq.c cVar = this.f420412m;
                        if (cVar != null) {
                            cVar.mo43639xed42f558();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        this.f420411l = true;
        nq.a aVar = this.f420410k;
        if (aVar == null || c10432x58e9524 == null) {
            return;
        }
        int i17 = aVar.f420390a;
        int i18 = aVar.f420391b;
        int i19 = aVar.f420392c;
        int i27 = aVar.f420393d;
        int i28 = aVar.f420394e;
        long j17 = c10432x58e9524.f146409a;
        if (j17 > 0) {
            c10432x58e9524.m43648x52d2f021(j17, i17, i18, i19, i27, i28);
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e9524 = this.f420400a;
        if (c10432x58e9524 != null) {
            int i17 = this.f420402c;
            int i18 = this.f420403d;
            long j17 = c10432x58e9524.f146409a;
            if (j17 > 0) {
                c10432x58e9524.m43651xbb66fd7b(j17, i17, i18);
            }
        }
        android.content.Context context = (android.content.Context) this.f420401b.get();
        if (context != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            mq.e eVar = mq.e.f412043a;
            sb6.append(eVar.b(context));
            sb6.append("scene_shaderv.glsl");
            java.lang.String vertexShader = sb6.toString();
            java.lang.String fragmentShader = eVar.b(context) + "scene_shaderf.glsl";
            java.lang.String vertexFrameBuffer = eVar.b(context) + "vertex_framebuffer_plane.glsl";
            java.lang.String fragFrameBuffer = eVar.b(context) + "frag_framebuffer_plane.glsl";
            java.lang.String textureVertexShader = eVar.b(context) + "texture_vertex_shader.glsl";
            java.lang.String textureFragmentShader = eVar.b(context) + "texture_fragment_shader.glsl";
            java.lang.String bgVertexShader = eVar.b(context) + "bg_gradient_vertex_shader.glsl";
            java.lang.String bgFragmentShader = eVar.b(context) + "bg_gradient_fragment_shader.glsl";
            com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e95242 = this.f420400a;
            if (c10432x58e95242 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(vertexShader, "vertexShader");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(fragmentShader, "fragmentShader");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(vertexFrameBuffer, "vertexFrameBuffer");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(fragFrameBuffer, "fragFrameBuffer");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(textureVertexShader, "textureVertexShader");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(textureFragmentShader, "textureFragmentShader");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(bgVertexShader, "bgVertexShader");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.h(bgFragmentShader, "bgFragmentShader");
                if (c10432x58e95242.f146409a > 0) {
                    synchronized (com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524.class) {
                        c10432x58e95242.m43649x6b36c51c(c10432x58e95242.f146409a, vertexShader, fragmentShader, vertexFrameBuffer, fragFrameBuffer, textureVertexShader, textureFragmentShader, bgVertexShader, bgFragmentShader);
                    }
                }
            }
            com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e95243 = this.f420400a;
            if (c10432x58e95243 != null) {
                long j18 = c10432x58e95243.f146409a;
                if (j18 > 0) {
                    c10432x58e95243.m43645x10010bd5(j18);
                }
            }
            this.f420409j = 0;
        }
    }

    public void c(javax.microedition.khronos.opengles.GL10 gl10, boolean z17) {
        android.view.View view;
        lq.c cVar = this.f420412m;
        if (cVar != null && cVar.mo43638xe55c1d69() && cVar != null) {
            cVar.mo43636xb23dbadf();
        }
        try {
            com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e9524 = this.f420400a;
            if (c10432x58e9524 != null) {
                long j17 = c10432x58e9524.f146409a;
                if (j17 > 0) {
                    c10432x58e9524.m43644x2f2d44(j17);
                }
            }
        } catch (java.lang.Throwable th6) {
            mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo onDraw exception", new java.lang.Object[0]);
            if (cVar != null) {
                cVar.mo43642x4875e531(false);
            }
        }
        if (cVar != null && cVar.mo43638xe55c1d69()) {
            int i17 = this.f420409j + 1;
            this.f420409j = i17;
            if (i17 >= 2 && cVar != null) {
                cVar.mo43635x9b4fca46();
            }
        }
        boolean z18 = this.f420405f;
        if (!z18 && !this.f420407h) {
            this.f420407h = true;
            android.view.View view2 = this.f420404e;
            if (view2 != null) {
                view2.post(new nq.c(this));
                return;
            }
            return;
        }
        if (z18) {
            android.view.View view3 = this.f420404e;
            if ((view3 == null || view3.getVisibility() != 0) && (view = this.f420404e) != null) {
                view.post(new nq.e(this));
            }
        }
    }

    public void d(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        android.graphics.Point point;
        lq.c cVar = this.f420412m;
        try {
            a();
            android.content.Context context = (android.content.Context) this.f420401b.get();
            if (context != null) {
                if (cVar == null || (point = cVar.mo43630x69e01b6b(context)) == null) {
                    point = new android.graphics.Point(0, 0);
                }
                int i17 = point.x;
                this.f420402c = i17;
                this.f420403d = point.y;
                mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLCreated width: %d, height: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f420403d));
                b();
                if (cVar == null || !cVar.getIsEnable() || cVar == null || cVar.mo43633x3555fa6d() || cVar == null) {
                    return;
                }
                cVar.mo43640xc3c6d2cc();
            }
        } catch (java.lang.Throwable th6) {
            mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo onEGLCreated exception", new java.lang.Object[0]);
            if (cVar != null) {
                cVar.mo43639xed42f558();
            }
        }
    }

    public void e(java.lang.Throwable th6) {
        mq.h.a("MicroMsg.DynamicBgSurfaceView", "alvinluo GLSurfaceView onError", new java.lang.Object[0]);
        lq.c cVar = this.f420412m;
        if (cVar != null) {
            cVar.mo43637xec9246a8();
        }
    }

    public void f(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        try {
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged width: %d, height: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            int i19 = this.f420402c;
            if ((i19 == i17 || this.f420403d != i18) && (this.f420403d == i18 || i19 == i17)) {
                return;
            }
            a();
            this.f420402c = i17;
            this.f420403d = i18;
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged reCreated width: %d, height: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f420403d));
            b();
        } catch (java.lang.Throwable th6) {
            mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo onSurfaceSizeChanged exception", new java.lang.Object[0]);
            lq.c cVar = this.f420412m;
            if (cVar != null) {
                cVar.mo43642x4875e531(false);
            }
        }
    }

    public void g() {
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "preDestroy", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e9524 = this.f420400a;
        if (c10432x58e9524 == null || c10432x58e9524.f146410b > 0) {
            return;
        }
        mq.h.b("MicroMsg.DynamicBackgroundNative", "preRelease: " + c10432x58e9524.f146409a, new java.lang.Object[0]);
        c10432x58e9524.f146410b = c10432x58e9524.f146409a;
        c10432x58e9524.f146409a = -1L;
    }
}
