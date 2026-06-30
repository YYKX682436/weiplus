package com.tencent.magicbrush;

/* loaded from: classes7.dex */
public abstract class c0 {
    public static final /* synthetic */ f06.v[] I = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "devicePixelRatio", "getDevicePixelRatio()F", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "canvasWidth", "getCanvasWidth()I", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "canvasHeight", "getCanvasHeight()I", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "animationFrameHandlerStrategy", "getAnimationFrameHandlerStrategy()Lcom/tencent/magicbrush/ui/AnimationFrameHandler$Strategy;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableAntialias", "getEnableAntialias()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableGfx", "getEnableGfx()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "gcFactor", "getGcFactor()F", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableWindowAttributesAlpha", "getEnableWindowAttributesAlpha()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "sdcardPath", "getSdcardPath()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "syncSurfaceDestroy", "getSyncSurfaceDestroy()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableGpuUnwrap", "getEnableGpuUnwrap()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "renderThreadName", "getRenderThreadName()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "appBrandRuntime", "getAppBrandRuntime()J", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableAngleTranslator", "getEnableAngleTranslator()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "maxAvailableFPS", "getMaxAvailableFPS()F", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableProgramBinary", "getEnableProgramBinary()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "programBinaryPath", "getProgramBinaryPath()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "suspendRafWhenNoWindow", "getSuspendRafWhenNoWindow()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "fetchFpsByPeriod", "getFetchFpsByPeriod()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "resDelegate", "getResDelegate()Lcom/tencent/magicbrush/delegate/MagicBrushResDelegate;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableParallelShaderCompile", "getEnableParallelShaderCompile()I", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableWindowRefactor", "getEnableWindowRefactor()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableCmdbufferCanvas2d", "getEnableCmdbufferCanvas2d()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableCmdbufferCanvas", "getEnableCmdbufferCanvas()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.magicbrush.c0.class, "enableUnifiedCmdbuffer", "getEnableUnifiedCmdbuffer()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f48599a;

    /* renamed from: b, reason: collision with root package name */
    public ch.a f48600b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f48601c;

    /* renamed from: g, reason: collision with root package name */
    public dh.a f48605g;

    /* renamed from: i, reason: collision with root package name */
    public yg.b0 f48607i;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48602d = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.h
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).device_pixel_ratio_ = ((java.lang.Number) obj2).floatValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Float.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).device_pixel_ratio_);
        }
    });

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48603e = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.g
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).screen_width_ = ((java.lang.Number) obj2).intValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Integer.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).screen_width_);
        }
    });

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48604f = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.f
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).screen_height_ = ((java.lang.Number) obj2).intValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Integer.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).screen_height_);
        }
    });

    /* renamed from: h, reason: collision with root package name */
    public final yg.f0 f48606h = new yg.f0();

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48608j = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.d
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).animationFrameHandlerStrategy = (gh.b) obj2;
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return ((com.tencent.magicbrush.MBRuntime.MBParams) obj).animationFrameHandlerStrategy;
        }
    });

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48609k = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.j
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).allow_antialias_ = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).allow_antialias_);
        }
    });

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48610l = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.m
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_gfx = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_gfx);
        }
    });

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48611m = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.u
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).gc_factor = ((java.lang.Number) obj2).floatValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Float.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).gc_factor);
        }
    });

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48612n = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.r
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_window_attributes_alpha = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_window_attributes_alpha);
        }
    });

    /* renamed from: o, reason: collision with root package name */
    public final boolean f48613o = true;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f48614p = true;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48615q = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.z
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).sdcard_path = (java.lang.String) obj2;
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return ((com.tencent.magicbrush.MBRuntime.MBParams) obj).sdcard_path;
        }
    });

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48616r = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.b0
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).sync_surface_destroy = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).sync_surface_destroy);
        }
    });

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48617s = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.n
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_gpu_unwrap = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_gpu_unwrap);
        }
    });

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48618t = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.x
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).render_thread_name = (java.lang.String) obj2;
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return ((com.tencent.magicbrush.MBRuntime.MBParams) obj).render_thread_name;
        }
    });

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48619u = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.e
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).app_brand_runtime = ((java.lang.Number) obj2).longValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Long.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).app_brand_runtime);
        }
    });

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48620v = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.i
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_angle_translator = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_angle_translator);
        }
    });

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48621w = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.v
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).max_available_fps = ((java.lang.Number) obj2).floatValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Float.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).max_available_fps);
        }
    });

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48622x = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.p
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_program_binary = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_program_binary);
        }
    });

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48623y = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.w
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).program_binary_path = (java.lang.String) obj2;
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return ((com.tencent.magicbrush.MBRuntime.MBParams) obj).program_binary_path;
        }
    });

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.magicbrush.c f48624z = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.a0
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).suspend_raf_when_no_window = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).suspend_raf_when_no_window);
        }
    });
    public final com.tencent.magicbrush.c A = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.t
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).fetch_fps_by_period = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).fetch_fps_by_period);
        }
    });
    public final com.tencent.magicbrush.c B = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.y
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).resDelegate = (ah.j) obj2;
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return ((com.tencent.magicbrush.MBRuntime.MBParams) obj).resDelegate;
        }
    });
    public final com.tencent.magicbrush.c C = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.o
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_parallel_shader_compile = ((java.lang.Number) obj2).intValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Integer.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_parallel_shader_compile);
        }
    });
    public final com.tencent.magicbrush.c D = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.s
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_window_refactor = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_window_refactor);
        }
    });
    public final com.tencent.magicbrush.c E = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.l
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_cmdbuffer_canvas2d = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_cmdbuffer_canvas2d);
        }
    });
    public final com.tencent.magicbrush.c F = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.k
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_cmdbuffer_canvas = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_cmdbuffer_canvas);
        }
    });
    public final com.tencent.magicbrush.c G = new com.tencent.magicbrush.c(this, new kotlin.jvm.internal.u() { // from class: com.tencent.magicbrush.q
        @Override // kotlin.jvm.internal.u, f06.l
        public void I(java.lang.Object obj, java.lang.Object obj2) {
            ((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_unified_cmdbuffer = ((java.lang.Boolean) obj2).booleanValue();
        }

        @Override // kotlin.jvm.internal.u, f06.u
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((com.tencent.magicbrush.MBRuntime.MBParams) obj).enable_unified_cmdbuffer);
        }
    });
    public final com.tencent.magicbrush.MBRuntime.MBParams H = new com.tencent.magicbrush.MBRuntime.MBParams();

    public final gh.b a() {
        java.lang.Object a17 = this.f48608j.a(this, I[3]);
        kotlin.jvm.internal.o.f(a17, "<get-animationFrameHandlerStrategy>(...)");
        return (gh.b) a17;
    }

    public final int b() {
        return ((java.lang.Number) this.f48604f.a(this, I[2])).intValue();
    }

    public final int c() {
        return ((java.lang.Number) this.f48603e.a(this, I[1])).intValue();
    }

    public final float d() {
        return ((java.lang.Number) this.f48602d.a(this, I[0])).floatValue();
    }

    public final void e(gh.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<set-?>");
        this.f48608j.b(this, I[3], bVar);
    }

    public final void f(long j17) {
        this.f48619u.b(this, I[12], java.lang.Long.valueOf(j17));
    }

    public final void g(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f48623y.b(this, I[16], str);
    }
}
