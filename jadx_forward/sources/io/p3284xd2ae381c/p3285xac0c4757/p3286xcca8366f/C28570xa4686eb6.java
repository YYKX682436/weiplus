package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.SwapSurfaceController */
/* loaded from: classes15.dex */
public class C28570xa4686eb6 {
    private static final java.lang.String TAG = "SwapSurfaceController";

    /* renamed from: firstTimeSwap */
    private boolean f70762xf1f130d0;

    /* renamed from: flutterView */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 f70763xe28578e1;

    /* renamed from: surface */
    private android.view.Surface f70767x9189ecad;

    /* renamed from: swapSurface */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 f70769x614179a;

    /* renamed from: swapView */
    private android.view.View f70770xed05bed8;

    /* renamed from: surfaceAvailable */
    private boolean f70768x2e34b09c = false;

    /* renamed from: swappingSurface */
    private boolean f70771xe4f82368 = false;

    /* renamed from: isInSwapSurface */
    private boolean f70765xccfd02b = false;

    /* renamed from: isResumingSurface */
    private boolean f70766x54a9519 = false;

    /* renamed from: isFullScreenSize */
    boolean f70764x1449de46 = false;

    /* JADX WARN: Multi-variable type inference failed */
    public C28570xa4686eb6(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 interfaceC28651x6b183344) {
        this.f70762xf1f130d0 = false;
        this.f70763xe28578e1 = c28553x45ef20c1;
        this.f70769x614179a = interfaceC28651x6b183344;
        this.f70770xed05bed8 = (android.view.View) interfaceC28651x6b183344;
        this.f70762xf1f130d0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeSurface$2 */
    public /* synthetic */ void m137381x512dcd71() {
        io.p3284xd2ae381c.Log.i(TAG, "resumeSurface on onRenderSurfaceNextUpdate, isResumingSurface:" + this.f70766x54a9519);
        if (this.f70766x54a9519) {
            m137386x2b5af35a();
            this.f70763xe28578e1.m137285x7fe94d14(false);
        }
        this.f70766x54a9519 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeSurface$3 */
    public /* synthetic */ void m137382x512dcd72(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17) {
        io.p3284xd2ae381c.Log.i(TAG, "resumeSurface onNextFrameDisplayed");
        interfaceC28648x8c0b9e17.mo137198x896c3e54(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$a
            @Override // java.lang.Runnable
            public final void run() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6.this.m137381x512dcd71();
            }
        });
        interfaceC28648x8c0b9e17.mo137197x669ed6f1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$swapSurfaceAfterReachFullScreenSize$0 */
    public /* synthetic */ void m137383x7f31a33c() {
        io.p3284xd2ae381c.Log.i(TAG, "swapSurface onNextSurfaceUpdate, hide current renderSurface, isResumingSurface:" + this.f70766x54a9519);
        if (this.f70766x54a9519) {
            return;
        }
        this.f70763xe28578e1.m137285x7fe94d14(true);
        this.f70770xed05bed8.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$swapSurfaceAfterReachFullScreenSize$1 */
    public /* synthetic */ void m137384x7f31a33d() {
        this.f70769x614179a.mo137396xf93a2f84(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$b
            @Override // java.lang.Runnable
            public final void run() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6.this.m137383x7f31a33c();
            }
        });
        io.p3284xd2ae381c.Log.i(TAG, "swapSurface onNextFrameDisplayed, markSurfaceIsSwapOut");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f70763xe28578e1.f70653x5c6c6e37;
        if (interfaceC28648x8c0b9e17 != null) {
            interfaceC28648x8c0b9e17.mo137197x669ed6f1(true);
        }
    }

    /* renamed from: makeFullScreen */
    private void m137385xc7553869() {
        io.p3284xd2ae381c.Log.i(TAG, "makeFullScreen");
        android.view.ViewGroup.LayoutParams layoutParams = this.f70770xed05bed8.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f70770xed05bed8.setLayoutParams(layoutParams);
    }

    /* renamed from: makeSmallSize */
    private void m137386x2b5af35a() {
        io.p3284xd2ae381c.Log.i(TAG, "makeSmallSize");
        android.view.ViewGroup.LayoutParams layoutParams = this.f70770xed05bed8.getLayoutParams();
        layoutParams.width = 1;
        layoutParams.height = 1;
        this.f70770xed05bed8.setLayoutParams(layoutParams);
        this.f70764x1449de46 = false;
    }

    /* renamed from: swapSurfaceAfterReachFullScreenSize */
    private void m137387x7228610d() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70763xe28578e1;
        if (c28553x45ef20c1 == null || c28553x45ef20c1.m137264x385aa5fd() == null) {
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = this.f70763xe28578e1.m137264x385aa5fd();
        io.p3284xd2ae381c.Log.i(TAG, "swapSurfaceAfterReachFullScreenSize");
        m137264x385aa5fd.m138052x614179a(this.f70767x9189ecad);
        m137264x385aa5fd.m138030x29812006(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$d
            @Override // java.lang.Runnable
            public final void run() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6.this.m137384x7f31a33d();
            }
        });
        m137264x385aa5fd.m138039x4fb41144();
        this.f70771xe4f82368 = false;
        this.f70765xccfd02b = true;
        this.f70766x54a9519 = false;
    }

    /* renamed from: resumeSurface */
    public void m137388xd9789fc0() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70763xe28578e1;
        if (c28553x45ef20c1 == null || c28553x45ef20c1.m137264x385aa5fd() == null || this.f70763xe28578e1.f70653x5c6c6e37 == null) {
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "resumeSurface, swappingSurface:" + this.f70771xe4f82368);
        this.f70766x54a9519 = true;
        this.f70771xe4f82368 = false;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = this.f70763xe28578e1.m137264x385aa5fd();
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f70763xe28578e1.f70653x5c6c6e37;
        if (interfaceC28648x8c0b9e17 == null || !interfaceC28648x8c0b9e17.mo137196x1f8c622()) {
            io.p3284xd2ae381c.Log.i(TAG, "resume surface originRenderSurfacenot not available" + interfaceC28648x8c0b9e17);
        } else {
            io.p3284xd2ae381c.Log.i(TAG, "show current renderSurface");
            m137264x385aa5fd.m138030x29812006(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$c
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6.this.m137382x512dcd72(interfaceC28648x8c0b9e17);
                }
            });
            m137264x385aa5fd.m138052x614179a(interfaceC28648x8c0b9e17.mo137194x19cc2a81());
            m137264x385aa5fd.m138039x4fb41144();
            this.f70765xccfd02b = false;
        }
    }

    /* renamed from: surfaceAvailable */
    public void m137389x2e34b09c(android.view.Surface surface) {
        io.p3284xd2ae381c.Log.i(TAG, "surfaceCreated, swappingSurface:" + this.f70771xe4f82368 + ", isInSwapSurface: " + this.f70765xccfd02b);
        this.f70767x9189ecad = surface;
        this.f70768x2e34b09c = true;
        if (this.f70771xe4f82368) {
            m137385xc7553869();
            return;
        }
        if (this.f70765xccfd02b) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70763xe28578e1;
            if (c28553x45ef20c1 != null && c28553x45ef20c1.m137264x385aa5fd() != null) {
                this.f70763xe28578e1.m137264x385aa5fd().m138048x9a9e0888(surface, false);
            }
            this.f70765xccfd02b = true;
        }
    }

    /* renamed from: surfaceDestroyed */
    public void m137390xd05ebbec() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1;
        io.p3284xd2ae381c.Log.i(TAG, "surfaceDestroyed, isInSwapSurface:" + this.f70765xccfd02b);
        this.f70768x2e34b09c = false;
        this.f70764x1449de46 = false;
        if (!this.f70765xccfd02b || (c28553x45ef20c1 = this.f70763xe28578e1) == null || c28553x45ef20c1.m137264x385aa5fd() == null) {
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "stopRenderingToSurface");
        this.f70763xe28578e1.m137264x385aa5fd().m138050xc19ba428(this.f70767x9189ecad);
        this.f70763xe28578e1.m137264x385aa5fd().m138019xd94bbdc8();
    }

    /* renamed from: surfaceSizeChanged */
    public void m137391xf2544486(int i17, int i18) {
        this.f70764x1449de46 = i17 > 1 && i18 > 1;
        io.p3284xd2ae381c.Log.i(TAG, "surfaceSizeChanged: " + i17 + " , " + i18 + ", swappingSurface: " + this.f70771xe4f82368 + ", isFullScreenSize:" + this.f70764x1449de46);
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70763xe28578e1;
        if (c28553x45ef20c1 == null || c28553x45ef20c1.m137264x385aa5fd() == null) {
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = this.f70763xe28578e1.m137264x385aa5fd();
        if (this.f70765xccfd02b) {
            m137264x385aa5fd.m138051xaa23e147(i17, i18);
        } else if (this.f70764x1449de46) {
            if (this.f70771xe4f82368) {
                m137387x7228610d();
            } else {
                m137386x2b5af35a();
            }
        }
    }

    /* renamed from: swapSurface */
    public void m137392x614179a() {
        io.p3284xd2ae381c.Log.i(TAG, "swapSurface, surfaceAvailable:" + this.f70768x2e34b09c + ", isFullScreenSize:" + this.f70764x1449de46);
        this.f70771xe4f82368 = true;
        this.f70766x54a9519 = false;
        if (!this.f70768x2e34b09c) {
            io.p3284xd2ae381c.Log.w(TAG, "swapSurface not is not available!");
        } else if (this.f70764x1449de46) {
            m137387x7228610d();
        } else {
            m137385xc7553869();
        }
    }
}
