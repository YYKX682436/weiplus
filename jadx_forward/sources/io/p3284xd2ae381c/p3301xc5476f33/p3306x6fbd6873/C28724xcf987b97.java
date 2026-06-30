package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.PlatformViewsController */
/* loaded from: classes15.dex */
public class C28724xcf987b97 implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218 {
    private static final java.lang.String TAG = "PlatformViewsController";

    /* renamed from: VIEW_TYPES_REQUIRE_NON_TLHC */
    private static java.lang.Class[] f71805xfcd4e77f = {android.view.SurfaceView.class};

    /* renamed from: enableImageRenderTarget */
    private static boolean f71806x1ea8d47f = true;

    /* renamed from: enableSurfaceProducerRenderTarget */
    private static boolean f71807xaf026043 = true;

    /* renamed from: _hellAccFlag_ */
    private byte f71808x7f11beae;

    /* renamed from: androidTouchProcessor */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 f71810xd973d862;

    /* renamed from: context */
    private android.content.Context f71812x38b735af;

    /* renamed from: flutterView */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 f71817xe28578e1;

    /* renamed from: platformViewsChannel */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8 f71824x496caac8;

    /* renamed from: textInputPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 f71828x69758830;

    /* renamed from: textureRegistry */
    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f71829x4cc71e78;

    /* renamed from: flutterJNI */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71816x2014a1e9 = null;

    /* renamed from: preRegistered */
    private boolean f71825x8c05fd85 = false;

    /* renamed from: nextOverlayLayerId */
    private int f71820x6f5459af = 0;

    /* renamed from: flutterViewConvertedToImageView */
    private boolean f71818x24959ff4 = false;

    /* renamed from: synchronizeToNativeViewHierarchy */
    private boolean f71827xed95344e = true;

    /* renamed from: usesSoftwareRendering */
    private boolean f71830xb9bc7639 = false;

    /* renamed from: channelHandler */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler f71811xf8a558c7 = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.AnonymousClass1();

    /* renamed from: registry */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28720x6bffe9f5 f71826xd6dc303d = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28720x6bffe9f5();

    /* renamed from: vdControllers */
    final java.util.HashMap<java.lang.Integer, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53> f71831xef0150c9 = new java.util.HashMap<>();

    /* renamed from: accessibilityEventsDelegate */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c f71809xf53d26ac = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c();

    /* renamed from: contextToEmbeddedView */
    final java.util.HashMap<android.content.Context, android.view.View> f71813xf950d9f9 = new java.util.HashMap<>();

    /* renamed from: overlayLayerViews */
    private final android.util.SparseArray<io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28714x7dfe9c82> f71821x585bfc0d = new android.util.SparseArray<>();

    /* renamed from: currentFrameUsedOverlayLayerIds */
    private final java.util.HashSet<java.lang.Integer> f71814x10d69a86 = new java.util.HashSet<>();

    /* renamed from: currentFrameUsedPlatformViewIds */
    private final java.util.HashSet<java.lang.Integer> f71815xc0ff444f = new java.util.HashSet<>();

    /* renamed from: viewWrappers */
    private final android.util.SparseArray<io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b> f71832x726a3805 = new android.util.SparseArray<>();

    /* renamed from: platformViews */
    private final android.util.SparseArray<io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8> f71823x1f8e11bb = new android.util.SparseArray<>();

    /* renamed from: platformViewParent */
    private final android.util.SparseArray<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b> f71822x74817082 = new android.util.SparseArray<>();

    /* renamed from: motionEventTracker */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34 f71819x28a1ee14 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.m137338x9cf0d20b();

    /* renamed from: io.flutter.plugin.platform.PlatformViewsController$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$resize$0 */
        public /* synthetic */ void m138758x7b87dc7d(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 c28742x12d6aa53, float f17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferResized platformViewBufferResized) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138754xcd5e664(c28742x12d6aa53);
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71812x38b735af != null) {
                f17 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138735xabf0e2bc();
            }
            platformViewBufferResized.run(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferSize(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138751x7813dd5b(c28742x12d6aa53.m138846x81d15289(), f17), io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138751x7813dd5b(c28742x12d6aa53.m138845x9e8a04c4(), f17)));
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: clearFocus */
        public void mo138267xd2ef968b(int i17) {
            android.view.View mo31848xfb86a31b;
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138654x756fc223(i17)) {
                mo31848xfb86a31b = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71831xef0150c9.get(java.lang.Integer.valueOf(i17)).m138847xfb86a31b();
            } else {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71823x1f8e11bb.get(i17);
                if (interfaceC28717x1311f9d8 == null) {
                    io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Clearing focus on an unknown view with id: " + i17);
                    return;
                }
                mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            }
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.clearFocus();
                return;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Clearing focus on a null view with id: " + i17);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: createForPlatformViewLayer */
        public void mo138268xa2344fcc(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138732x1d03c8c1(19);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138733x62aeca51(platformViewCreationRequest);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138749xf105b803();
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138729x8212604b(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138631x800200d4(platformViewCreationRequest, false), platformViewCreationRequest);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: createForTextureLayer */
        public long mo138269x96d983c3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138733x62aeca51(platformViewCreationRequest);
            int i17 = platformViewCreationRequest.f71394xcf532ea0;
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71832x726a3805.get(i17) != null) {
                throw new java.lang.IllegalStateException("Trying to create an already created platform view, view id: " + i17);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this;
            if (c28724xcf987b97.f71829x4cc71e78 == null) {
                throw new java.lang.IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i17);
            }
            if (c28724xcf987b97.f71817xe28578e1 == null) {
                throw new java.lang.IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i17);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo138631x800200d4 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138631x800200d4(platformViewCreationRequest, true);
            android.view.View mo31848xfb86a31b = mo138631x800200d4.mo31848xfb86a31b();
            if (mo31848xfb86a31b.getParent() != null) {
                throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (!(io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139428x42e1a0f8(mo31848xfb86a31b, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.f71805xfcd4e77f) ? false : true)) {
                if (platformViewCreationRequest.f71388x662b9585 == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK) {
                    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138729x8212604b(mo138631x800200d4, platformViewCreationRequest);
                    return -2L;
                }
                if (!io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71830xb9bc7639) {
                    return io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138730x5f2aa1a(mo138631x800200d4, platformViewCreationRequest);
                }
            }
            return io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138628x5c821751(mo138631x800200d4, platformViewCreationRequest);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: dispose */
        public void mo138270x63a5261f(int i17) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71823x1f8e11bb.get(i17);
            if (interfaceC28717x1311f9d8 == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Disposing unknown platform view with id: " + i17);
                return;
            }
            if (interfaceC28717x1311f9d8.mo31848xfb86a31b() != null) {
                android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo31848xfb86a31b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(mo31848xfb86a31b);
                }
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71823x1f8e11bb.remove(i17);
            try {
                interfaceC28717x1311f9d8.mo31847x63a5261f();
            } catch (java.lang.RuntimeException e17) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Disposing platform view threw an exception", e17);
            }
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138654x756fc223(i17)) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 c28742x12d6aa53 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71831xef0150c9.get(java.lang.Integer.valueOf(i17));
                android.view.View m138847xfb86a31b = c28742x12d6aa53.m138847xfb86a31b();
                if (m138847xfb86a31b != null) {
                    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71813xf950d9f9.remove(m138847xfb86a31b.getContext());
                }
                c28742x12d6aa53.m138844x63a5261f();
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71831xef0150c9.remove(java.lang.Integer.valueOf(i17));
                return;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b c28722xf4c3df9b = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71832x726a3805.get(i17);
            if (c28722xf4c3df9b != null) {
                c28722xf4c3df9b.removeAllViews();
                c28722xf4c3df9b.m138702x41012807();
                c28722xf4c3df9b.m138707x388a4537();
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) c28722xf4c3df9b.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c28722xf4c3df9b);
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71832x726a3805.remove(i17);
                return;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b c28621x2bcb4b4b = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71822x74817082.get(i17);
            if (c28621x2bcb4b4b != null) {
                c28621x2bcb4b4b.removeAllViews();
                c28621x2bcb4b4b.m137963x388a4537();
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) c28621x2bcb4b4b.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(c28621x2bcb4b4b);
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71822x74817082.remove(i17);
            }
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: offset */
        public void mo138271xc3376493(int i17, double d17, double d18) {
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138654x756fc223(i17)) {
                return;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b c28722xf4c3df9b = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71832x726a3805.get(i17);
            if (c28722xf4c3df9b == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Setting offset for unknown platform view with id: " + i17);
            } else {
                int m138752xf10575bf = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138752xf10575bf(d17);
                int m138752xf10575bf2 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138752xf10575bf(d18);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c28722xf4c3df9b.getLayoutParams();
                layoutParams.topMargin = m138752xf10575bf;
                layoutParams.leftMargin = m138752xf10575bf2;
                c28722xf4c3df9b.m138704x183e6d2(layoutParams);
            }
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: onTouch */
        public void mo138272xb05cb4a0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewTouch platformViewTouch) {
            int i17 = platformViewTouch.f71416xcf532ea0;
            float f17 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71812x38b735af.getResources().getDisplayMetrics().density;
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138654x756fc223(i17)) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71831xef0150c9.get(java.lang.Integer.valueOf(i17)).m138843xb864a2b5(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138652x97f17309(f17, platformViewTouch, true));
                return;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71823x1f8e11bb.get(i17);
            if (interfaceC28717x1311f9d8 == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Sending touch to an unknown view with id: " + i17);
                return;
            }
            android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.dispatchTouchEvent(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138652x97f17309(f17, platformViewTouch, false));
                return;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Sending touch to a null view with id: " + i17);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: resize */
        public void mo138273xc84d9cb4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewResizeRequest platformViewResizeRequest, final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferResized platformViewBufferResized) {
            int m138752xf10575bf = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138752xf10575bf(platformViewResizeRequest.f71401x7dcc4cfd);
            int m138752xf10575bf2 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138752xf10575bf(platformViewResizeRequest.f71400x21ee58d0);
            int i17 = platformViewResizeRequest.f71402xcf532ea0;
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138654x756fc223(i17)) {
                final float m138735xabf0e2bc = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138735xabf0e2bc();
                final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 c28742x12d6aa53 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71831xef0150c9.get(java.lang.Integer.valueOf(i17));
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138741xc363959d(c28742x12d6aa53);
                c28742x12d6aa53.m138853xc84d9cb4(m138752xf10575bf, m138752xf10575bf2, new java.lang.Runnable() { // from class: io.flutter.plugin.platform.PlatformViewsController$1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.AnonymousClass1.this.m138758x7b87dc7d(c28742x12d6aa53, m138735xabf0e2bc, platformViewBufferResized);
                    }
                });
                return;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71823x1f8e11bb.get(i17);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b c28722xf4c3df9b = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71832x726a3805.get(i17);
            if (interfaceC28717x1311f9d8 == null || c28722xf4c3df9b == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Resizing unknown platform view with id: " + i17);
                return;
            }
            if (m138752xf10575bf > c28722xf4c3df9b.m138701x81d15289() || m138752xf10575bf2 > c28722xf4c3df9b.m138700x9e8a04c4()) {
                c28722xf4c3df9b.m138703x7f90199b(m138752xf10575bf, m138752xf10575bf2);
            }
            android.view.ViewGroup.LayoutParams layoutParams = c28722xf4c3df9b.getLayoutParams();
            layoutParams.width = m138752xf10575bf;
            layoutParams.height = m138752xf10575bf2;
            c28722xf4c3df9b.setLayoutParams(layoutParams);
            android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            if (mo31848xfb86a31b != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = mo31848xfb86a31b.getLayoutParams();
                layoutParams2.width = m138752xf10575bf;
                layoutParams2.height = m138752xf10575bf2;
                mo31848xfb86a31b.setLayoutParams(layoutParams2);
            }
            platformViewBufferResized.run(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferSize(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138750x7813dd5b(c28722xf4c3df9b.m138701x81d15289()), io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138750x7813dd5b(c28722xf4c3df9b.m138700x9e8a04c4())));
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: setDirection */
        public void mo138274x2261393d(int i17, int i18) {
            android.view.View mo31848xfb86a31b;
            if (!io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.m138755x5f44e709(i18)) {
                throw new java.lang.IllegalStateException("Trying to set unknown direction value: " + i18 + "(view id: " + i17 + ")");
            }
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.mo138654x756fc223(i17)) {
                mo31848xfb86a31b = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71831xef0150c9.get(java.lang.Integer.valueOf(i17)).m138847xfb86a31b();
            } else {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71823x1f8e11bb.get(i17);
                if (interfaceC28717x1311f9d8 == null) {
                    io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Setting direction to an unknown view with id: " + i17);
                    return;
                }
                mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            }
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.setLayoutDirection(i18);
                return;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.TAG, "Setting direction to a null view with id: " + i17);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: synchronizeToNativeViewHierarchy */
        public void mo138275xed95344e(boolean z17) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.f71827xed95344e = z17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configureForHybridComposition */
    public void m138729x8212604b(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest) {
        m138732x1d03c8c1(19);
        io.p3284xd2ae381c.Log.i(TAG, "Using hybrid composition for platform view: " + platformViewCreationRequest.f71394xcf532ea0);
        m138749xf105b803();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configureForVirtualDisplay */
    public long m138730x5f2aa1a(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8, final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest) {
        m138732x1d03c8c1(20);
        io.p3284xd2ae381c.Log.i(TAG, "Hosting view in a virtual display for platform view: " + platformViewCreationRequest.f71394xcf532ea0);
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf m138742x15b97cad = m138742x15b97cad(this.f71829x4cc71e78);
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 m138840xaf65a0fc = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53.m138840xaf65a0fc(this.f71812x38b735af, this.f71809xf53d26ac, interfaceC28717x1311f9d8, m138742x15b97cad, m138752xf10575bf(platformViewCreationRequest.f71392xdc50bf3d), m138752xf10575bf(platformViewCreationRequest.f71389x93f82e90), platformViewCreationRequest.f71394xcf532ea0, null, new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewsController$$d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z17) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138738xd355a7e3(platformViewCreationRequest, view, z17);
            }
        });
        if (m138840xaf65a0fc != null) {
            this.f71831xef0150c9.put(java.lang.Integer.valueOf(platformViewCreationRequest.f71394xcf532ea0), m138840xaf65a0fc);
            android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            this.f71813xf950d9f9.put(mo31848xfb86a31b.getContext(), mo31848xfb86a31b);
            return m138742x15b97cad.mo53763x5db1b11();
        }
        throw new java.lang.IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.f71395x4747637f + " with id: " + platformViewCreationRequest.f71394xcf532ea0);
    }

    /* renamed from: diposeAllViews */
    private void m138731xa5c5d603() {
        while (this.f71823x1f8e11bb.size() > 0) {
            this.f71811xf8a558c7.mo138270x63a5261f(this.f71823x1f8e11bb.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enforceMinimumAndroidApiVersion */
    public void m138732x1d03c8c1(int i17) {
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= i17) {
            return;
        }
        throw new java.lang.IllegalStateException("Trying to use platform views with API " + i18 + ", required API level is: " + i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensureValidRequest */
    public void m138733x62aeca51(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest) {
        if (m138755x5f44e709(platformViewCreationRequest.f71387xc6a0077f)) {
            return;
        }
        throw new java.lang.IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.f71387xc6a0077f + "(view id: " + platformViewCreationRequest.f71394xcf532ea0 + ")");
    }

    /* renamed from: finishFrame */
    private void m138734x4ef6109a(boolean z17) {
        for (int i17 = 0; i17 < this.f71821x585bfc0d.size(); i17++) {
            int keyAt = this.f71821x585bfc0d.keyAt(i17);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28714x7dfe9c82 valueAt = this.f71821x585bfc0d.valueAt(i17);
            if (this.f71814x10d69a86.contains(java.lang.Integer.valueOf(keyAt))) {
                this.f71817xe28578e1.m137256xc0e639f3(valueAt);
                z17 &= valueAt.m137188xaf314b5e();
            } else {
                if (!this.f71818x24959ff4) {
                    valueAt.mo137191x77fe19c0();
                }
                valueAt.setVisibility(8);
                this.f71817xe28578e1.removeView(valueAt);
            }
        }
        for (int i18 = 0; i18 < this.f71822x74817082.size(); i18++) {
            int keyAt2 = this.f71822x74817082.keyAt(i18);
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b c28621x2bcb4b4b = this.f71822x74817082.get(keyAt2);
            if (!this.f71815xc0ff444f.contains(java.lang.Integer.valueOf(keyAt2)) || (!z17 && this.f71827xed95344e)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c28621x2bcb4b4b, arrayList.toArray(), "io/flutter/plugin/platform/PlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c28621x2bcb4b4b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c28621x2bcb4b4b, "io/flutter/plugin/platform/PlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c28621x2bcb4b4b, arrayList2.toArray(), "io/flutter/plugin/platform/PlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c28621x2bcb4b4b.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c28621x2bcb4b4b, "io/flutter/plugin/platform/PlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDisplayDensity */
    public float m138735xabf0e2bc() {
        return this.f71812x38b735af.getResources().getDisplayMetrics().density;
    }

    /* renamed from: initializeRootImageViewIfNeeded */
    private void m138736xadfa6b80() {
        if (!this.f71827xed95344e || this.f71818x24959ff4) {
            return;
        }
        this.f71817xe28578e1.mo124143x2f386ab2();
        this.f71818x24959ff4 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$configureForTextureLayerComposition$1 */
    public /* synthetic */ void m138737x39f6d881(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest, android.view.View view, boolean z17) {
        if (z17) {
            this.f71824x496caac8.m138250x5027fd7a(platformViewCreationRequest.f71394xcf532ea0);
            return;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = this.f71828x69758830;
        if (c28701x2e084010 != null) {
            c28701x2e084010.m138546x90d0b4d0(platformViewCreationRequest.f71394xcf532ea0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$configureForVirtualDisplay$0 */
    public /* synthetic */ void m138738xd355a7e3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest, android.view.View view, boolean z17) {
        if (z17) {
            this.f71824x496caac8.m138250x5027fd7a(platformViewCreationRequest.f71394xcf532ea0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initializePlatformViewIfNeeded$2 */
    public /* synthetic */ void m138739x7dd6d005(int i17, android.view.View view, boolean z17) {
        if (z17) {
            this.f71824x496caac8.m138250x5027fd7a(i17);
            return;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = this.f71828x69758830;
        if (c28701x2e084010 != null) {
            c28701x2e084010.m138546x90d0b4d0(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onEndFrame$3 */
    public /* synthetic */ void m138740xdaf90a5d() {
        m138734x4ef6109a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lockInputConnection */
    public void m138741xc363959d(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 c28742x12d6aa53) {
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = this.f71828x69758830;
        if (c28701x2e084010 == null) {
            return;
        }
        c28701x2e084010.m138555x859f2945();
        c28742x12d6aa53.m138850x6ba43ad3();
    }

    /* renamed from: makePlatformViewRenderTarget */
    private static io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf m138742x15b97cad(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658) {
        int i17;
        if (f71807xaf026043 && (i17 = android.os.Build.VERSION.SDK_INT) >= 29) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer mo138021xfdf2a2c3 = interfaceC28980x1159d658.mo138021xfdf2a2c3(i17 <= 34 ? io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceLifecycle.resetInBackground : io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceLifecycle.manual);
            io.p3284xd2ae381c.Log.i(TAG, "PlatformView is using SurfaceProducer backend");
            return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28740x95aefe(mo138021xfdf2a2c3);
        }
        if (!f71806x1ea8d47f || android.os.Build.VERSION.SDK_INT < 29) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca = interfaceC28980x1159d658.mo138022xdee757ca();
            io.p3284xd2ae381c.Log.i(TAG, "PlatformView is using SurfaceTexture backend");
            return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28741x872bf68d(mo138022xdee757ca);
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageTextureEntry mo138020x45e1f25c = interfaceC28980x1159d658.mo138020x45e1f25c();
        io.p3284xd2ae381c.Log.i(TAG, "PlatformView is using ImageReader backend");
        return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28713xbb648c9d(mo138020x45e1f25c);
    }

    /* renamed from: maybeInvokeOnFlutterViewAttached */
    private void m138743x4472c226(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f71817xe28578e1;
        if (c28553x45ef20c1 == null) {
            io.p3284xd2ae381c.Log.i(TAG, "null flutterView");
        } else {
            interfaceC28717x1311f9d8.mo65795x5e3a4146(c28553x45ef20c1);
        }
    }

    /* renamed from: parsePointerCoords */
    private static android.view.MotionEvent.PointerCoords m138744x978f3cc8(java.lang.Object obj, float f17) {
        java.util.List list = (java.util.List) obj;
        android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((java.lang.Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((java.lang.Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((java.lang.Double) list.get(2)).doubleValue();
        double d17 = f17;
        pointerCoords.toolMajor = (float) (((java.lang.Double) list.get(3)).doubleValue() * d17);
        pointerCoords.toolMinor = (float) (((java.lang.Double) list.get(4)).doubleValue() * d17);
        pointerCoords.touchMajor = (float) (((java.lang.Double) list.get(5)).doubleValue() * d17);
        pointerCoords.touchMinor = (float) (((java.lang.Double) list.get(6)).doubleValue() * d17);
        pointerCoords.x = (float) (((java.lang.Double) list.get(7)).doubleValue() * d17);
        pointerCoords.y = (float) (((java.lang.Double) list.get(8)).doubleValue() * d17);
        return pointerCoords;
    }

    /* renamed from: parsePointerCoordsList */
    private static java.util.List<android.view.MotionEvent.PointerCoords> m138745x90b7bd86(java.lang.Object obj, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m138744x978f3cc8(it.next(), f17));
        }
        return arrayList;
    }

    /* renamed from: parsePointerProperties */
    private static android.view.MotionEvent.PointerProperties m138746x4d2c40dd(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
        pointerProperties.id = ((java.lang.Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((java.lang.Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: parsePointerPropertiesList */
    private static java.util.List<android.view.MotionEvent.PointerProperties> m138747x695aaf1b(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m138746x4d2c40dd(it.next()));
        }
        return arrayList;
    }

    /* renamed from: removeOverlaySurfaces */
    private void m138748x6e9028b2() {
        if (this.f71817xe28578e1 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i17 = 0; i17 < this.f71821x585bfc0d.size(); i17++) {
            this.f71817xe28578e1.removeView(this.f71821x585bfc0d.valueAt(i17));
        }
        this.f71821x585bfc0d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: throwIfHCPPEnabled */
    public void m138749xf105b803() {
        if (this.f71816x2014a1e9.m137640xe695ca07()) {
            throw new java.lang.IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLogicalPixels */
    public int m138751x7813dd5b(double d17, float f17) {
        return (int) java.lang.Math.round(d17 / f17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toPhysicalPixels */
    public int m138752xf10575bf(double d17) {
        return (int) java.lang.Math.round(d17 * m138735xabf0e2bc());
    }

    /* renamed from: translateMotionEvent */
    private static void m138753xcc9a9e56(android.view.MotionEvent motionEvent, android.view.MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unlockInputConnection */
    public void m138754xcd5e664(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 c28742x12d6aa53) {
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = this.f71828x69758830;
        if (c28701x2e084010 == null) {
            return;
        }
        c28701x2e084010.m138562x8df3878c();
        c28742x12d6aa53.m138851x9518646c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateDirection */
    public static boolean m138755x5f44e709(int i17) {
        return i17 == 0 || i17 == 1;
    }

    /* renamed from: attach */
    public void mo138622xac1eee45(android.content.Context context, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        if (this.f71812x38b735af != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f71812x38b735af = context;
        this.f71829x4cc71e78 = interfaceC28980x1159d658;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8 c28663x5531dee8 = this.f71824x496caac8;
        if (c28663x5531dee8 != null) {
            c28663x5531dee8.m138251x6ecb7091(this.f71811xf8a558c7);
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8 c28663x5531dee82 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8(c28604xeb2eb192);
        this.f71824x496caac8 = c28663x5531dee82;
        c28663x5531dee82.m138251x6ecb7091(this.f71811xf8a558c7);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: attachAccessibilityBridge */
    public void mo138623x58b57ff2(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657) {
        this.f71809xf53d26ac.m138579xdd693ab5(c28974x81a86657);
    }

    /* renamed from: attachTextInputPlugin */
    public void mo138624x6ac05f2b(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010) {
        this.f71828x69758830 = c28701x2e084010;
    }

    /* renamed from: attachToFlutterRenderer */
    public void mo138625x5489893f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
        this.f71810xd973d862 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842(c28641x1f60b8df, true);
    }

    /* renamed from: attachToView */
    public void mo138626x805e5a65(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        this.f71817xe28578e1 = c28553x45ef20c1;
        for (int i17 = 0; i17 < this.f71832x726a3805.size(); i17++) {
            this.f71817xe28578e1.addView(this.f71832x726a3805.valueAt(i17));
        }
        for (int i18 = 0; i18 < this.f71822x74817082.size(); i18++) {
            this.f71817xe28578e1.addView(this.f71822x74817082.valueAt(i18));
        }
        for (int i19 = 0; i19 < this.f71823x1f8e11bb.size(); i19++) {
            this.f71823x1f8e11bb.valueAt(i19).mo65795x5e3a4146(this.f71817xe28578e1);
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8 c28663x5531dee8 = this.f71824x496caac8;
        if (c28663x5531dee8 != null) {
            c28663x5531dee8.m138249xe70b282f();
        }
    }

    /* renamed from: checkInputConnectionProxy */
    public boolean mo138627x7dcece2e(android.view.View view) {
        if (view == null || !this.f71813xf950d9f9.containsKey(view.getContext())) {
            return false;
        }
        android.view.View view2 = this.f71813xf950d9f9.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* renamed from: configureForTextureLayerComposition */
    public long mo138628x5c821751(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8, final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b c28722xf4c3df9b;
        long j17;
        m138732x1d03c8c1(23);
        io.p3284xd2ae381c.Log.i(TAG, "Hosting view in view hierarchy for platform view: " + platformViewCreationRequest.f71394xcf532ea0);
        int m138752xf10575bf = m138752xf10575bf(platformViewCreationRequest.f71392xdc50bf3d);
        int m138752xf10575bf2 = m138752xf10575bf(platformViewCreationRequest.f71389x93f82e90);
        if (this.f71830xb9bc7639) {
            c28722xf4c3df9b = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b(this.f71812x38b735af);
            j17 = -1;
        } else {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf m138742x15b97cad = m138742x15b97cad(this.f71829x4cc71e78);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b c28722xf4c3df9b2 = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b(this.f71812x38b735af, m138742x15b97cad);
            long mo53763x5db1b11 = m138742x15b97cad.mo53763x5db1b11();
            c28722xf4c3df9b = c28722xf4c3df9b2;
            j17 = mo53763x5db1b11;
        }
        c28722xf4c3df9b.m138706x6867915(this.f71810xd973d862);
        c28722xf4c3df9b.m138703x7f90199b(m138752xf10575bf, m138752xf10575bf2);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(m138752xf10575bf, m138752xf10575bf2);
        int m138752xf10575bf3 = m138752xf10575bf(platformViewCreationRequest.f71391x8528448c);
        int m138752xf10575bf4 = m138752xf10575bf(platformViewCreationRequest.f71390x1fdc83b0);
        layoutParams.topMargin = m138752xf10575bf3;
        layoutParams.leftMargin = m138752xf10575bf4;
        c28722xf4c3df9b.m138704x183e6d2(layoutParams);
        android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
        mo31848xfb86a31b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(m138752xf10575bf, m138752xf10575bf2));
        mo31848xfb86a31b.setImportantForAccessibility(4);
        c28722xf4c3df9b.addView(mo31848xfb86a31b);
        c28722xf4c3df9b.m138705xe6831cde(new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewsController$$a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z17) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138737x39f6d881(platformViewCreationRequest, view, z17);
            }
        });
        this.f71817xe28578e1.addView(c28722xf4c3df9b);
        this.f71832x726a3805.append(platformViewCreationRequest.f71394xcf532ea0, c28722xf4c3df9b);
        m138743x4472c226(interfaceC28717x1311f9d8);
        return j17;
    }

    /* renamed from: createOverlaySurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28589x102bb959 mo138630x36e8ca59(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28714x7dfe9c82 c28714x7dfe9c82) {
        int i17 = this.f71820x6f5459af;
        this.f71820x6f5459af = i17 + 1;
        this.f71821x585bfc0d.put(i17, c28714x7dfe9c82);
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28589x102bb959(i17, c28714x7dfe9c82.m137195xcf572877());
    }

    /* renamed from: createPlatformView */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo138631x800200d4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest, boolean z17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 m138697xfcb86cd4 = this.f71826xd6dc303d.m138697xfcb86cd4(platformViewCreationRequest.f71395x4747637f);
        if (m138697xfcb86cd4 == null) {
            throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.f71395x4747637f);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc = m138697xfcb86cd4.mo14572xaf65a0fc(z17 ? new android.content.MutableContextWrapper(this.f71812x38b735af) : this.f71812x38b735af, platformViewCreationRequest.f71394xcf532ea0, platformViewCreationRequest.f71393xc4aaf986 != null ? m138697xfcb86cd4.m138695xe04fd67().mo138407x37439e39(platformViewCreationRequest.f71393xc4aaf986) : null);
        android.view.View mo31848xfb86a31b = mo14572xaf65a0fc.mo31848xfb86a31b();
        if (mo31848xfb86a31b == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        mo31848xfb86a31b.setLayoutDirection(platformViewCreationRequest.f71387xc6a0077f);
        this.f71823x1f8e11bb.put(platformViewCreationRequest.f71394xcf532ea0, mo14572xaf65a0fc);
        m138743x4472c226(mo14572xaf65a0fc);
        return mo14572xaf65a0fc;
    }

    /* renamed from: destroyOverlaySurfaces */
    public void mo138632x5a00e67c() {
        io.p3284xd2ae381c.Log.i(TAG, "overlayLayerViews size=" + this.f71821x585bfc0d.size());
        for (int i17 = 0; i17 < this.f71821x585bfc0d.size(); i17++) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28714x7dfe9c82 valueAt = this.f71821x585bfc0d.valueAt(i17);
            valueAt.mo137191x77fe19c0();
            valueAt.m137190x23991ce6();
        }
    }

    /* renamed from: detach */
    public void mo138633xb06a1793() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8 c28663x5531dee8 = this.f71824x496caac8;
        if (c28663x5531dee8 != null) {
            c28663x5531dee8.m138251x6ecb7091(null);
        }
        mo138632x5a00e67c();
        if (this.f71825x8c05fd85) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8 c28663x5531dee82 = this.f71824x496caac8;
            if (c28663x5531dee82 != null) {
                c28663x5531dee82.m138247xac32f546();
                this.f71824x496caac8.m138248x62ecbcbc();
            }
        } else {
            this.f71824x496caac8 = null;
        }
        this.f71812x38b735af = null;
        this.f71829x4cc71e78 = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: detachAccessibilityBridge */
    public void mo138634x212f07e4() {
        this.f71809xf53d26ac.m138579xdd693ab5(null);
    }

    /* renamed from: detachFromView */
    public void mo138635xa95a1a22() {
        for (int i17 = 0; i17 < this.f71832x726a3805.size(); i17++) {
            this.f71817xe28578e1.removeView(this.f71832x726a3805.valueAt(i17));
        }
        for (int i18 = 0; i18 < this.f71822x74817082.size(); i18++) {
            this.f71817xe28578e1.removeView(this.f71822x74817082.valueAt(i18));
        }
        mo138632x5a00e67c();
        m138748x6e9028b2();
        this.f71817xe28578e1 = null;
        this.f71818x24959ff4 = false;
        for (int i19 = 0; i19 < this.f71823x1f8e11bb.size(); i19++) {
            this.f71823x1f8e11bb.valueAt(i19).mo65796x7c604f14();
        }
    }

    /* renamed from: detachTextInputPlugin */
    public void mo138636xfe0fb01d() {
        this.f71828x69758830 = null;
    }

    /* renamed from: disposePlatformView */
    public void mo138637x7c0be977(int i17) {
        this.f71811xf8a558c7.mo138270x63a5261f(i17);
    }

    /* renamed from: getOverlayLayerViews */
    public android.util.SparseArray<io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28714x7dfe9c82> mo138638xab908357() {
        return this.f71821x585bfc0d;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: getPlatformViewById */
    public android.view.View mo138639xbd854120(int i17) {
        if (mo138654x756fc223(i17)) {
            return this.f71831xef0150c9.get(java.lang.Integer.valueOf(i17)).m138847xfb86a31b();
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = this.f71823x1f8e11bb.get(i17);
        if (interfaceC28717x1311f9d8 == null) {
            return null;
        }
        return interfaceC28717x1311f9d8.mo31848xfb86a31b();
    }

    /* renamed from: getRegistry */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 mo138640x52b66db3() {
        return this.f71826xd6dc303d;
    }

    /* renamed from: initializePlatformViewIfNeeded */
    public boolean mo138641xcab320ba(final int i17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = this.f71823x1f8e11bb.get(i17);
        if (interfaceC28717x1311f9d8 == null) {
            return false;
        }
        if (this.f71822x74817082.get(i17) != null) {
            return true;
        }
        android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
        if (mo31848xfb86a31b == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (mo31848xfb86a31b.getParent() != null) {
            throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        android.content.Context context = this.f71812x38b735af;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b c28621x2bcb4b4b = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b(context, context.getResources().getDisplayMetrics().density, this.f71810xd973d862);
        c28621x2bcb4b4b.m137962xe6831cde(new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewsController$$b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z17) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138739x7dd6d005(i17, view, z17);
            }
        });
        this.f71822x74817082.put(i17, c28621x2bcb4b4b);
        mo31848xfb86a31b.setImportantForAccessibility(4);
        c28621x2bcb4b4b.addView(mo31848xfb86a31b);
        this.f71817xe28578e1.addView(c28621x2bcb4b4b);
        return true;
    }

    /* renamed from: onBeginFrame */
    public void mo138643x806a183() {
        this.f71814x10d69a86.clear();
        this.f71815xc0ff444f.clear();
    }

    /* renamed from: onDetachedFromJNI */
    public void mo138644x3d3e7ea() {
        m138731xa5c5d603();
    }

    /* renamed from: onDisplayOverlaySurface */
    public void mo138645xf4d92300(int i17, int i18, int i19, int i27, int i28) {
        if (this.f71821x585bfc0d.get(i17) == null) {
            throw new java.lang.IllegalStateException("The overlay surface (id:" + i17 + ") doesn't exist");
        }
        m138736xadfa6b80();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28714x7dfe9c82 c28714x7dfe9c82 = this.f71821x585bfc0d.get(i17);
        if (c28714x7dfe9c82.getParent() == null) {
            this.f71817xe28578e1.addView(c28714x7dfe9c82);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i27, i28);
        layoutParams.leftMargin = i18;
        layoutParams.topMargin = i19;
        c28714x7dfe9c82.setLayoutParams(layoutParams);
        c28714x7dfe9c82.setVisibility(0);
        c28714x7dfe9c82.bringToFront();
        this.f71814x10d69a86.add(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: onDisplayPlatformView */
    public void mo138646x77ae573b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db c28622x9672b4db) {
        m138736xadfa6b80();
        if (mo138641xcab320ba(i17)) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b c28621x2bcb4b4b = this.f71822x74817082.get(i17);
            c28621x2bcb4b4b.m137961xb0c5df64(c28622x9672b4db, i18, i19, i27, i28);
            c28621x2bcb4b4b.setVisibility(0);
            c28621x2bcb4b4b.bringToFront();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i29, i37);
            android.view.View mo31848xfb86a31b = this.f71823x1f8e11bb.get(i17).mo31848xfb86a31b();
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.setLayoutParams(layoutParams);
                mo31848xfb86a31b.bringToFront();
            }
            this.f71815xc0ff444f.add(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: onEndFrame */
    public void mo138647xa92a451() {
        boolean z17 = false;
        if (this.f71818x24959ff4 && this.f71815xc0ff444f.isEmpty()) {
            this.f71818x24959ff4 = false;
            this.f71817xe28578e1.mo124149x5beb491c(new java.lang.Runnable() { // from class: io.flutter.plugin.platform.PlatformViewsController$$c
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97.this.m138740xdaf90a5d();
                }
            });
        } else {
            if (this.f71818x24959ff4 && this.f71817xe28578e1.m137253x27591c0a()) {
                z17 = true;
            }
            m138734x4ef6109a(z17);
        }
    }

    /* renamed from: onPreEngineRestart */
    public void mo138648x89b45f89() {
        m138731xa5c5d603();
    }

    /* renamed from: onResume */
    public void mo138649x57429eec() {
        java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53> it = this.f71831xef0150c9.values().iterator();
        while (it.hasNext()) {
            it.next().m138852x6e1ea05e();
        }
    }

    /* renamed from: onTrimMemory */
    public void mo138650x29685b02(int i17) {
        if (i17 < 40) {
            return;
        }
        java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53> it = this.f71831xef0150c9.values().iterator();
        while (it.hasNext()) {
            it.next().m138842x901e8da0();
        }
    }

    /* renamed from: preRegisterChannel */
    public void m138756xd1eec3bd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        if (this.f71824x496caac8 != null) {
            io.p3284xd2ae381c.Log.w(TAG, "preRegisterChannel called but channel already exists, ignoring.");
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8 c28663x5531dee8 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8(c28604xeb2eb192);
        this.f71824x496caac8 = c28663x5531dee8;
        c28663x5531dee8.m138248x62ecbcbc();
        this.f71825x8c05fd85 = true;
    }

    /* renamed from: setFlutterJNI */
    public void m138757x3c79a7eb(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this.f71816x2014a1e9 = c28586x96e67e09;
    }

    /* renamed from: setSoftwareRendering */
    public void mo138651xbc662463(boolean z17) {
        this.f71830xb9bc7639 = z17;
    }

    /* renamed from: toMotionEvent */
    public android.view.MotionEvent mo138652x97f17309(float f17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewTouch platformViewTouch, boolean z17) {
        android.view.MotionEvent pop = this.f71819x28a1ee14.pop(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId.m137343x3017aa(platformViewTouch.f71411x8b2b1cbf));
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = (android.view.MotionEvent.PointerCoords[]) m138745x90b7bd86(platformViewTouch.f71413x9789e573, f17).toArray(new android.view.MotionEvent.PointerCoords[platformViewTouch.f71412x8bb380d2]);
        if (z17 || pop == null) {
            return android.view.MotionEvent.obtain(platformViewTouch.f71406x550fca8f.longValue(), platformViewTouch.f71408x1df5c87.longValue(), platformViewTouch.f71403xab2f7e36, platformViewTouch.f71412x8bb380d2, (android.view.MotionEvent.PointerProperties[]) m138747x695aaf1b(platformViewTouch.f71414xc1e37cc6).toArray(new android.view.MotionEvent.PointerProperties[platformViewTouch.f71412x8bb380d2]), pointerCoordsArr, platformViewTouch.f71410xbf9ab98c, platformViewTouch.f71404x96785c7f, platformViewTouch.f71417xa7d85ae6, platformViewTouch.f71418x9c21cc05, platformViewTouch.f71405x421cea11, platformViewTouch.f71407xbfd9eca, platformViewTouch.f71415xca90681b, platformViewTouch.f71409x5cfee87);
        }
        m138753xcc9a9e56(pop, pointerCoordsArr);
        return pop;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: usesVirtualDisplay */
    public boolean mo138654x756fc223(int i17) {
        return this.f71831xef0150c9.containsKey(java.lang.Integer.valueOf(i17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLogicalPixels */
    public int m138750x7813dd5b(double d17) {
        return m138751x7813dd5b(d17, m138735xabf0e2bc());
    }

    /* renamed from: createOverlaySurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28589x102bb959 mo138629x36e8ca59() {
        return mo138630x36e8ca59(new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28714x7dfe9c82(this.f71817xe28578e1.getContext(), this.f71817xe28578e1.getWidth(), this.f71817xe28578e1.getHeight(), this.f71809xf53d26ac));
    }
}
