package com.p314xaae8f345.p2936x80def495;

/* renamed from: com.tencent.skyline.SkylineRuntime */
/* loaded from: classes7.dex */
public class C25587x226dda3 implements com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad, com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be {

    /* renamed from: mRouteBackCallback */
    private com.p314xaae8f345.p2936x80def495.InterfaceC25562x6c64dec f46833xab4a1a48;

    /* renamed from: sWindowDestroy */
    private com.p314xaae8f345.p2936x80def495.InterfaceC25571x85e88f86 f46840x675ed037;

    /* renamed from: sWindowReady */
    private com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def f46841x4999f520;

    /* renamed from: skylineMapHandler */
    private com.p314xaae8f345.p2936x80def495.InterfaceC25567xc6445f7a f46843xcde6a4c3;
    private final java.lang.String TAG = "SkylineRuntime";

    /* renamed from: runtimeHolderPtr */
    private long f46839x528a20aa = 0;

    /* renamed from: runtimeDelegatePtr */
    private long f46838xb0b2b431 = 0;

    /* renamed from: nativeHandler */
    private com.p314xaae8f345.p2936x80def495.jni.C25598x1fe1d713 f46834xf042a733 = new com.p314xaae8f345.p2936x80def495.jni.C25598x1fe1d713();

    /* renamed from: resourceLoader */
    private com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596 f46836xf15a1dc1 = new com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596();

    /* renamed from: skylineFileSystem */
    private com.p314xaae8f345.p2936x80def495.jni.C25601xf41a6120 f46842x9562140 = new com.p314xaae8f345.p2936x80def495.jni.C25601xf41a6120();

    /* renamed from: isInit */
    private volatile boolean f46831xb9a4415a = false;

    /* renamed from: routeDoneCallbacks */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p2936x80def495.InterfaceC25563x4038a187> f46837xb381f3a3 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: taskId */
    private java.util.concurrent.atomic.AtomicInteger f46847xcb7ef180 = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: syncBootstrapObject */
    private final java.lang.Object f46845xd9dd0732 = new java.lang.Object();

    /* renamed from: isBootstrapDone */
    private volatile boolean f46830x4cfcd606 = false;

    /* renamed from: mBootstrapDoneCallbacks */
    private volatile java.util.ArrayList<com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac> f46832xcc39686b = new java.util.ArrayList<>();

    /* renamed from: syncWindowObject */
    private final java.lang.Object f46846xd6b8158a = new java.lang.Object();

    /* renamed from: windowReadyIds */
    private volatile java.util.ArrayList<java.lang.Integer> f46849xf15e0e25 = new java.util.ArrayList<>();

    /* renamed from: windowReadyCallbacks */
    private volatile java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def>> f46848xc9b65a7b = new java.util.HashMap<>();

    /* renamed from: needCreateRuntime */
    private boolean f46835x67b5be46 = true;

    /* renamed from: skylineScrollViewChangeMap */
    private final android.util.SparseArray<com.p314xaae8f345.p2936x80def495.InterfaceC25570x528f558e> f46844x7902e1c5 = new android.util.SparseArray<>();

    /* renamed from: checkAndRun */
    private boolean m95829xebdd05c(com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac interfaceC25561xb8af7aac) {
        if (this.f46831xb9a4415a) {
            if (!this.f46830x4cfcd606) {
                return false;
            }
            interfaceC25561xb8af7aac.mo95651xc3989e01();
            return true;
        }
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e("SkylineRuntime", "waitForBootstrap fail, stack: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return true;
    }

    /* renamed from: checkAndRunForWindowReady */
    private boolean m95830x894286(int i17, com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def interfaceC25572xa06c2def) {
        if (!this.f46849xf15e0e25.contains(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        interfaceC25572xa06c2def.mo95681x8df18c34(i17);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeAppLaunch */
    public native void m95831x32cca6dd(long j17, int i17, int i18, com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeAutoReLaunch */
    public native void m95832xf5d7c84c(long j17, int i17, int i18, com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeClearJSBindings */
    public native void m95833x371387ed(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeClearWorkletJSBindings */
    public native void m95834xbbb03e0b(long j17);

    /* renamed from: nativeCreateRuntime */
    private native long m95835x85e4f065(com.p314xaae8f345.p2936x80def495.jni.C25598x1fe1d713 c25598x1fe1d713, com.p314xaae8f345.p2936x80def495.jni.C25605x34db0596 c25605x34db0596, com.p314xaae8f345.p2936x80def495.jni.C25601xf41a6120 c25601xf41a6120);

    /* renamed from: nativeDestroyRuntime */
    private native void m95836xfa2f6275(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeDestroyWindow */
    public native void m95837x183301b3(long j17, int i17);

    /* renamed from: nativeInitJsEngine */
    private native void m95838x219f0bd2(long j17, long j18, long j19, long j27);

    /* renamed from: nativeInitUITaskRunner */
    private native void m95839xaa499a10(long j17, long j18);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeListenRootScrollViewChange */
    public native void m95840x66301842(long j17, int i17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNavigateBack */
    public native int m95841x1d3a17af(long j17, int i17, int i18, int i19, boolean z17, int i27);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNavigateTo */
    public native void m95842x55023343(long j17, int i17, int i18, int i19, com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeReLaunch */
    public native void m95843xc04c18fd(long j17, int i17, int i18, com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeRedirectTo */
    public native void m95844x3c5ab6ee(long j17, int i17, int i18, int i19, com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSwitchTab */
    public native void m95845x48d0cd6a(long j17, int i17, int i18, com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeUpdateAccessibilityEnable */
    public native void m95846x98f58891(long j17, boolean z17);

    /* renamed from: nativeUpdateKeyboardStatus */
    private native void m95847xe35f6a99(long j17, int i17, int i18, double d17, double d18, int i19, long j18);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeUpdatePlatformBrightnessConfig */
    public native void m95848x230c6d66(long j17, int i17, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeUpdateRuntimeInfo */
    public native void m95849xbe9184c6(long j17, int i17, com.p314xaae8f345.p2936x80def495.jni.C25606xb28c2cf1 c25606xb28c2cf1);

    /* renamed from: nativeUpdateWindowViewport */
    private native void m95850x91a04c96(long j17, int i17, float f17, float f18);

    /* renamed from: addSkylineScrollViewChange */
    public void m95851x3ceffa36(int i17, com.p314xaae8f345.p2936x80def495.InterfaceC25570x528f558e interfaceC25570x528f558e) {
        this.f46844x7902e1c5.put(i17, interfaceC25570x528f558e);
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: appLaunch */
    public void mo95665x4c69ad34(final int i17, final int i18, final com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.6
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.m95871x9bcaa3df(i17, new com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def() { // from class: com.tencent.skyline.SkylineRuntime.6.1
                    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
                    /* renamed from: onWindowReady */
                    public void mo95681x8df18c34(int i19) {
                        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " appLaunch id:" + i19 + " pageId:" + i18);
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        long j17 = c25587x226dda3.f46838xb0b2b431;
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass6 anonymousClass6 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass6.this;
                        c25587x226dda3.m95831x32cca6dd(j17, i19, i18, c25573xa7f446d1);
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: autoReLaunch */
    public void mo95666x9dfc8e95(final int i17, final int i18, final com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.7
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.m95871x9bcaa3df(i17, new com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def() { // from class: com.tencent.skyline.SkylineRuntime.7.1
                    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
                    /* renamed from: onWindowReady */
                    public void mo95681x8df18c34(int i19) {
                        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " autoReLaunch id:" + i19 + " pageId:" + i18);
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        long j17 = c25587x226dda3.f46838xb0b2b431;
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass7 anonymousClass7 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass7.this;
                        c25587x226dda3.m95832xf5d7c84c(j17, i19, i18, c25573xa7f446d1);
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: clearJSBindings */
    public void mo95667x46923104() {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.1
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                c25587x226dda3.m95833x371387ed(c25587x226dda3.f46838xb0b2b431);
            }
        });
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: clearWorkletJSBindings */
    public void mo95668xde4c7d14() {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.2
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                c25587x226dda3.m95834xbbb03e0b(c25587x226dda3.f46838xb0b2b431);
            }
        });
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: destroyWindow */
    public void mo95669x74a7048a(final int i17) {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " destroyWindow: " + i17);
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.10
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                synchronized (this) {
                    if (com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46838xb0b2b431 != 0) {
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        c25587x226dda3.m95837x183301b3(c25587x226dda3.f46838xb0b2b431, i17);
                    }
                }
            }
        });
    }

    /* renamed from: enableCronet */
    public void m95852x8004ff20(final boolean z17) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.12
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95943x17408ca2(com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46838xb0b2b431, z17);
            }
        });
    }

    /* renamed from: getRuntimePtr */
    public long m95854xceabf3ec() {
        return this.f46839x528a20aa;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: init */
    public void mo95670x316510() {
        synchronized (this) {
            this.f46839x528a20aa = m95835x85e4f065(this.f46834xf042a733, this.f46836xf15a1dc1, this.f46842x9562140);
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " init: " + this.f46839x528a20aa);
            this.f46836xf15a1dc1.m95961x316510();
            this.f46842x9562140.m95927x316510();
            this.f46831xb9a4415a = true;
        }
    }

    /* renamed from: initFileSystem */
    public void m95855xa23e73fb(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25594x1b3dbf7 interfaceC25594x1b3dbf7) {
        this.f46842x9562140.m95928xa23e73fb(interfaceC25594x1b3dbf7);
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: initJSEngine */
    public void mo95671x2cfc69fb(long j17, long j18, long j19) {
        m95838x219f0bd2(this.f46839x528a20aa, j17, j18, j19);
    }

    /* renamed from: initMapHandler */
    public void m95856x66cef77e(com.p314xaae8f345.p2936x80def495.InterfaceC25567xc6445f7a interfaceC25567xc6445f7a) {
        this.f46843xcde6a4c3 = interfaceC25567xc6445f7a;
    }

    /* renamed from: initNativeHandler */
    public void m95857x55b92c03(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a interfaceC25590x8820556a) {
        this.f46834xf042a733.m95919x316510(interfaceC25590x8820556a);
    }

    /* renamed from: initResourceLoader */
    public void m95858x3ab432f1(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced interfaceC25597x90fd3ced) {
        this.f46836xf15a1dc1.m95962x3ab432f1(interfaceC25597x90fd3ced);
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: initUITaskRunner */
    public void mo95672x8aa013d9(long j17) {
        m95839xaa499a10(this.f46839x528a20aa, j17);
    }

    /* renamed from: listenRootScrollViewChange */
    public void m95859x5313aacb(final int i17) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.16
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " listenRootScrollViewChange windowId:" + i17);
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                c25587x226dda3.m95840x66301842(c25587x226dda3.f46838xb0b2b431, i17);
            }
        });
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: navigateBack */
    public int mo95673xc55eddf8(final int i17, final int i18, final int i19, final boolean z17, final com.p314xaae8f345.p2936x80def495.InterfaceC25563x4038a187 interfaceC25563x4038a187) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.5
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.m95871x9bcaa3df(i17, new com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def() { // from class: com.tencent.skyline.SkylineRuntime.5.1
                    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
                    /* renamed from: onWindowReady */
                    public void mo95681x8df18c34(int i27) {
                        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " navigateBack id:" + i27 + " pageId:" + i18);
                        int andIncrement = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46847xcb7ef180.getAndIncrement();
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46837xb381f3a3.put(java.lang.Integer.valueOf(andIncrement), interfaceC25563x4038a187);
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        long j17 = c25587x226dda3.f46838xb0b2b431;
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass5 anonymousClass5 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass5.this;
                        c25587x226dda3.m95841x1d3a17af(j17, i27, i18, i19, z17, andIncrement);
                    }
                });
            }
        });
        return 0;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: navigateTo */
    public void mo95674x6f05f7cc(final int i17, final int i18, final com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1, final com.p314xaae8f345.p2936x80def495.InterfaceC25563x4038a187 interfaceC25563x4038a187) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.3
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.m95871x9bcaa3df(i17, new com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def() { // from class: com.tencent.skyline.SkylineRuntime.3.1
                    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
                    /* renamed from: onWindowReady */
                    public void mo95681x8df18c34(int i19) {
                        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " navigateTo id:" + i19 + " pageId:" + i18);
                        int andIncrement = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46847xcb7ef180.getAndIncrement();
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46837xb381f3a3.put(java.lang.Integer.valueOf(andIncrement), interfaceC25563x4038a187);
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        long j17 = c25587x226dda3.f46838xb0b2b431;
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass3 anonymousClass3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass3.this;
                        c25587x226dda3.m95842x55023343(j17, i19, i18, andIncrement, c25573xa7f446d1);
                    }
                });
            }
        });
    }

    /* renamed from: needCreateRuntime */
    public boolean m95860x67b5be46() {
        boolean z17;
        synchronized (this.f46846xd6b8158a) {
            z17 = this.f46835x67b5be46;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad
    /* renamed from: notifyBack */
    public void mo95658xba8843d0(int i17, int i18) {
        com.p314xaae8f345.p2936x80def495.InterfaceC25562x6c64dec interfaceC25562x6c64dec = this.f46833xab4a1a48;
        if (interfaceC25562x6c64dec != null) {
            interfaceC25562x6c64dec.mo95652xc3977f66(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad
    /* renamed from: notifyBackDone */
    public void mo95659xf2427372(int i17, int i18) {
        com.p314xaae8f345.p2936x80def495.InterfaceC25562x6c64dec interfaceC25562x6c64dec = this.f46833xab4a1a48;
        if (interfaceC25562x6c64dec != null) {
            interfaceC25562x6c64dec.mo95653x237df408(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad
    /* renamed from: notifyBootstrapDone */
    public void mo95660x36e0f647(long j17) {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " notifyBootstrapDone " + j17);
        this.f46838xb0b2b431 = j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f46845xd9dd0732) {
            this.f46830x4cfcd606 = true;
            arrayList.addAll(this.f46832xcc39686b);
            this.f46832xcc39686b.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac interfaceC25561xb8af7aac = (com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac) it.next();
            if (interfaceC25561xb8af7aac != null) {
                interfaceC25561xb8af7aac.mo95651xc3989e01();
            }
        }
    }

    /* renamed from: notifyRootScrollViewChange */
    public void m95861x4ce05f4d(int i17, double d17, double d18, double d19, double d27, double d28, double d29) {
        com.p314xaae8f345.p2936x80def495.InterfaceC25570x528f558e interfaceC25570x528f558e = this.f46844x7902e1c5.get(i17);
        if (interfaceC25570x528f558e != null) {
            interfaceC25570x528f558e.mo95679xc13a0561(d17, d18, d19, d27, d28, d29);
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad
    /* renamed from: notifyRouteDone */
    public void mo95661x11eca822(int i17) {
        com.p314xaae8f345.p2936x80def495.InterfaceC25563x4038a187 remove = this.f46837xb381f3a3.remove(java.lang.Integer.valueOf(i17));
        if (remove != null) {
            remove.mo95654xc3989e01();
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad
    /* renamed from: notifyWindowDestroy */
    public void mo95662x2c418521(int i17) {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " notifyWindowDestroy: " + i17);
        com.p314xaae8f345.p2936x80def495.InterfaceC25571x85e88f86 interfaceC25571x85e88f86 = this.f46840x675ed037;
        if (interfaceC25571x85e88f86 != null) {
            interfaceC25571x85e88f86.mo95680xf42cf24b(i17);
        }
        synchronized (this.f46846xd6b8158a) {
            this.f46849xf15e0e25.remove(java.lang.Integer.valueOf(i17));
            this.f46848xc9b65a7b.remove(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad
    /* renamed from: notifyWindowReady */
    public void mo95663x5298dc8a(int i17) {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " notifyWindowReady: " + i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f46846xd6b8158a) {
            this.f46835x67b5be46 = false;
            this.f46849xf15e0e25.add(java.lang.Integer.valueOf(i17));
            if (this.f46848xc9b65a7b.get(java.lang.Integer.valueOf(i17)) != null) {
                arrayList.addAll(this.f46848xc9b65a7b.get(java.lang.Integer.valueOf(i17)));
                this.f46848xc9b65a7b.remove(java.lang.Integer.valueOf(i17));
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def) it.next()).mo95681x8df18c34(i17);
        }
        com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def interfaceC25572xa06c2def = this.f46841x4999f520;
        if (interfaceC25572xa06c2def != null) {
            interfaceC25572xa06c2def.mo95681x8df18c34(i17);
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: reLaunch */
    public void mo95675xa8596bc6(final int i17, final int i18, final com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.8
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.m95871x9bcaa3df(i17, new com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def() { // from class: com.tencent.skyline.SkylineRuntime.8.1
                    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
                    /* renamed from: onWindowReady */
                    public void mo95681x8df18c34(int i19) {
                        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " reLaunch id:" + i19 + " pageId:" + i18);
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        long j17 = c25587x226dda3.f46838xb0b2b431;
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass8 anonymousClass8 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass8.this;
                        c25587x226dda3.m95843xc04c18fd(j17, i19, i18, c25573xa7f446d1);
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: redirectTo */
    public void mo95676x565e7b77(final int i17, final int i18, final com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1, final com.p314xaae8f345.p2936x80def495.InterfaceC25563x4038a187 interfaceC25563x4038a187) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.4
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.m95871x9bcaa3df(i17, new com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def() { // from class: com.tencent.skyline.SkylineRuntime.4.1
                    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
                    /* renamed from: onWindowReady */
                    public void mo95681x8df18c34(int i19) {
                        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " redirectTo id:" + i19 + " pageId:" + i18);
                        int andIncrement = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46847xcb7ef180.getAndIncrement();
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46837xb381f3a3.put(java.lang.Integer.valueOf(andIncrement), interfaceC25563x4038a187);
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        long j17 = c25587x226dda3.f46838xb0b2b431;
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass4 anonymousClass4 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass4.this;
                        c25587x226dda3.m95844x3c5ab6ee(j17, i19, i18, andIncrement, c25573xa7f446d1);
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: release */
    public void mo95677x41012807() {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " release");
        synchronized (this) {
            this.f46831xb9a4415a = false;
            this.f46836xf15a1dc1.m95962x3ab432f1(null);
            this.f46836xf15a1dc1.m95967x41012807();
            this.f46842x9562140.m95928xa23e73fb(null);
            this.f46842x9562140.m95929x41012807();
            m95836xfa2f6275(this.f46839x528a20aa);
            this.f46839x528a20aa = 0L;
            this.f46838xb0b2b431 = 0L;
            this.f46834xf042a733.m95919x316510(null);
        }
        synchronized (this.f46845xd9dd0732) {
            this.f46832xcc39686b.clear();
        }
        synchronized (this.f46846xd6b8158a) {
            this.f46841x4999f520 = null;
            this.f46840x675ed037 = null;
            this.f46849xf15e0e25.clear();
            this.f46848xc9b65a7b.clear();
        }
    }

    /* renamed from: removeSkylineScrollViewChange */
    public void m95862x6dc94af3(int i17, com.p314xaae8f345.p2936x80def495.InterfaceC25570x528f558e interfaceC25570x528f558e) {
        this.f46844x7902e1c5.remove(i17);
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25569xb00ee4be
    /* renamed from: switchTab */
    public void mo95678x626dd3c1(final int i17, final int i18, final com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.9
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.m95871x9bcaa3df(i17, new com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def() { // from class: com.tencent.skyline.SkylineRuntime.9.1
                    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
                    /* renamed from: onWindowReady */
                    public void mo95681x8df18c34(int i19) {
                        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " switchTab id:" + i19 + " pageId:" + i18);
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                        long j17 = c25587x226dda3.f46838xb0b2b431;
                        com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass9 anonymousClass9 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.AnonymousClass9.this;
                        c25587x226dda3.m95845x48d0cd6a(j17, i19, i18, c25573xa7f446d1);
                    }
                });
            }
        });
    }

    /* renamed from: updateAccessibilityEnable */
    public void m95863x3d8100e8(final boolean z17) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.14
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " update accessibility enable:" + z17);
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                c25587x226dda3.m95846x98f58891(c25587x226dda3.f46838xb0b2b431, z17);
            }
        });
    }

    /* renamed from: updateKeyboardStatus */
    public void m95864x5ce1d7e2(int i17, int i18, double d17, double d18, int i19, long j17) {
        long j18 = this.f46838xb0b2b431;
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " updateKeyboardStatus(runtimeId:" + j18 + ", windowId:" + i17 + ", animStartPosition:" + d17 + ", animEndPosition:" + d18 + ", animDuration:" + i19 + ", timestamp:" + j17 + ")");
        if (j18 != 0) {
            m95847xe35f6a99(j18, i17, i18, d17, d18, i19, j17);
        }
    }

    /* renamed from: updateMapCustomCallout */
    public void m95865x8ef2166c(int i17, long j17, double d17, double d18, int i18, byte[] bArr) {
        com.p314xaae8f345.p2936x80def495.InterfaceC25567xc6445f7a interfaceC25567xc6445f7a = this.f46843xcde6a4c3;
        if (interfaceC25567xc6445f7a != null) {
            interfaceC25567xc6445f7a.mo95657x8ef2166c(i17, j17, d17, d18, i18, bArr);
        }
    }

    /* renamed from: updatePlatformBrightnessConfig */
    public void m95866xf761936f(final int i17, final boolean z17) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.11
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " updatePlatformBrightnessConfig brightness:" + i17);
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                c25587x226dda3.m95848x230c6d66(c25587x226dda3.f46838xb0b2b431, i17, z17);
            }
        });
    }

    /* renamed from: updateRuntimeInfo */
    public void m95867xe90a441d(final int i17, final com.p314xaae8f345.p2936x80def495.jni.C25606xb28c2cf1 c25606xb28c2cf1) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.15
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " updateRuntimeInfo windowId:" + i17 + " info:" + c25606xb28c2cf1);
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = com.p314xaae8f345.p2936x80def495.C25587x226dda3.this;
                c25587x226dda3.m95849xbe9184c6(c25587x226dda3.f46838xb0b2b431, i17, c25606xb28c2cf1);
            }
        });
    }

    /* renamed from: updateWindowViewport */
    public void m95868xb22b9df(int i17, float f17, float f18) {
        long j17 = this.f46838xb0b2b431;
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineRuntime", this + " updateWindowViewport(runtimeId:" + j17 + ", windowId:" + i17 + ", width:" + f17 + ", height:" + f18 + ")");
        if (j17 != 0) {
            m95850x91a04c96(j17, i17, f17, f18);
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25568xe639abad
    /* renamed from: waitForBack */
    public void mo95664xe300e21b(com.p314xaae8f345.p2936x80def495.InterfaceC25562x6c64dec interfaceC25562x6c64dec) {
        this.f46833xab4a1a48 = interfaceC25562x6c64dec;
    }

    /* renamed from: waitForBootstrap */
    public void m95869x115111ba(com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac interfaceC25561xb8af7aac) {
        if (m95829xebdd05c(interfaceC25561xb8af7aac)) {
            return;
        }
        synchronized (this.f46845xd9dd0732) {
            if (m95829xebdd05c(interfaceC25561xb8af7aac)) {
                return;
            }
            this.f46832xcc39686b.add(interfaceC25561xb8af7aac);
        }
    }

    /* renamed from: waitForWindowDestroy */
    public void m95870xf01ecb36(com.p314xaae8f345.p2936x80def495.InterfaceC25571x85e88f86 interfaceC25571x85e88f86) {
        this.f46840x675ed037 = interfaceC25571x85e88f86;
    }

    /* renamed from: waitForWindowReady */
    public void m95872x9bcaa3df(com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def interfaceC25572xa06c2def) {
        this.f46841x4999f520 = interfaceC25572xa06c2def;
    }

    /* renamed from: enableCronet */
    public void m95853x8004ff20(final boolean z17, final java.lang.String str, final java.lang.String str2) {
        m95869x115111ba(new com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac() { // from class: com.tencent.skyline.SkylineRuntime.13
            @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
            /* renamed from: onDone */
            public void mo95651xc3989e01() {
                com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95944xd0d107d0(com.p314xaae8f345.p2936x80def495.C25587x226dda3.this.f46838xb0b2b431, z17, str, str2);
            }
        });
    }

    /* renamed from: waitForWindowReady */
    public void m95871x9bcaa3df(int i17, com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def interfaceC25572xa06c2def) {
        if (m95830x894286(i17, interfaceC25572xa06c2def)) {
            return;
        }
        synchronized (this.f46846xd6b8158a) {
            if (m95830x894286(i17, interfaceC25572xa06c2def)) {
                return;
            }
            if (this.f46848xc9b65a7b.get(java.lang.Integer.valueOf(i17)) == null) {
                this.f46848xc9b65a7b.put(java.lang.Integer.valueOf(i17), new java.util.ArrayList<>());
            }
            this.f46848xc9b65a7b.get(java.lang.Integer.valueOf(i17)).add(interfaceC25572xa06c2def);
        }
    }
}
