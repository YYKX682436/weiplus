package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.ScreenCapturerAndroid */
/* loaded from: classes16.dex */
public class C29854x41f5ccb7 implements org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e {

    /* renamed from: DISPLAY_FLAGS */
    private static final int f75927x98317c8a = 3;

    /* renamed from: VIRTUAL_DISPLAY_DPI */
    private static final int f75928xbeaebccc = 400;

    /* renamed from: capturerObserver */
    private org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 f75929x7e102ce2;

    /* renamed from: height */
    private int f75930xb7389127;

    /* renamed from: isDisposed */
    private boolean f75931xe1b7456f;

    /* renamed from: mediaProjection */
    private android.media.projection.MediaProjection f75932x1e068953;

    /* renamed from: mediaProjectionCallback */
    private final android.media.projection.MediaProjection.Callback f75933x63340ab8;

    /* renamed from: mediaProjectionManager */
    private android.media.projection.MediaProjectionManager f75934xf3408ada;

    /* renamed from: mediaProjectionPermissionResultData */
    private final android.content.Intent f75935x9d99689;

    /* renamed from: numCapturedFrames */
    private long f75936x24d6094a;

    /* renamed from: surfaceTextureHelper */
    private org.p3371xd0ce3e8d.C29864x472c891c f75937x3b6754fc;

    /* renamed from: virtualDisplay */
    private android.hardware.display.VirtualDisplay f75938x42109f37;

    /* renamed from: width */
    private int f75939x6be2dc6;

    public C29854x41f5ccb7(android.content.Intent intent, android.media.projection.MediaProjection.Callback callback) {
        this.f75935x9d99689 = intent;
        this.f75933x63340ab8 = callback;
    }

    /* renamed from: checkNotDisposed */
    private void m156354xda5af7f0() {
        if (this.f75931xe1b7456f) {
            throw new java.lang.RuntimeException("capturer is disposed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createVirtualDisplay */
    public void m156355xf761a353() {
        this.f75937x3b6754fc.m156410xd06addfa(this.f75939x6be2dc6, this.f75930xb7389127);
        this.f75938x42109f37 = this.f75932x1e068953.createVirtualDisplay("WebRTC_ScreenCapture", this.f75939x6be2dc6, this.f75930xb7389127, 400, 3, new android.view.Surface(this.f75937x3b6754fc.m156407x182e20a4()), null, null);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: changeCaptureFormat */
    public synchronized void mo155151xb311390d(int i17, int i18, int i19) {
        m156354xda5af7f0();
        this.f75939x6be2dc6 = i17;
        this.f75930xb7389127 = i18;
        if (this.f75938x42109f37 == null) {
            return;
        }
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156477x29214152(this.f75937x3b6754fc.m156406x67189314(), new java.lang.Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.2
            @Override // java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75938x42109f37.release();
                org.p3371xd0ce3e8d.C29854x41f5ccb7.this.m156355xf761a353();
            }
        });
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: dispose */
    public synchronized void mo155153x63a5261f() {
        this.f75931xe1b7456f = true;
    }

    /* renamed from: getMediaProjection */
    public android.media.projection.MediaProjection m156356x2685b1d() {
        return this.f75932x1e068953;
    }

    /* renamed from: getNumCapturedFrames */
    public long m156357x780a9094() {
        return this.f75936x24d6094a;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: initialize */
    public synchronized void mo155154x33ebcb90(org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, android.content.Context context, org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 interfaceC29751x4bd47102) {
        m156354xda5af7f0();
        if (interfaceC29751x4bd47102 == null) {
            throw new java.lang.RuntimeException("capturerObserver not set.");
        }
        this.f75929x7e102ce2 = interfaceC29751x4bd47102;
        if (c29864x472c891c == null) {
            throw new java.lang.RuntimeException("surfaceTextureHelper not set.");
        }
        this.f75937x3b6754fc = c29864x472c891c;
        this.f75934xf3408ada = (android.media.projection.MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: isScreencast */
    public boolean mo155155x68912275() {
        return true;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        this.f75936x24d6094a++;
        this.f75929x7e102ce2.mo155344x962f56cc(c29904x150215d2);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: startCapture */
    public synchronized void mo155157x18ec4884(int i17, int i18, int i19) {
        m156354xda5af7f0();
        this.f75939x6be2dc6 = i17;
        this.f75930xb7389127 = i18;
        android.media.projection.MediaProjection mediaProjection = this.f75934xf3408ada.getMediaProjection(-1, this.f75935x9d99689);
        this.f75932x1e068953 = mediaProjection;
        mediaProjection.registerCallback(this.f75933x63340ab8, this.f75937x3b6754fc.m156406x67189314());
        m156355xf761a353();
        this.f75929x7e102ce2.mo155342x5e404516(true);
        this.f75937x3b6754fc.m156411xa23d0a79(this);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: stopCapture */
    public synchronized void mo155158xd45bb0e4() {
        m156354xda5af7f0();
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156477x29214152(this.f75937x3b6754fc.m156406x67189314(), new java.lang.Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.1
            @Override // java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75937x3b6754fc.m156412x3f73dad9();
                org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75929x7e102ce2.mo155343x5f049662();
                if (org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75938x42109f37 != null) {
                    org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75938x42109f37.release();
                    org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75938x42109f37 = null;
                }
                if (org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75932x1e068953 != null) {
                    org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75932x1e068953.unregisterCallback(org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75933x63340ab8);
                    org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75932x1e068953.stop();
                    org.p3371xd0ce3e8d.C29854x41f5ccb7.this.f75932x1e068953 = null;
                }
            }
        });
    }
}
