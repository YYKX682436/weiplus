package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.VideoDecoderTrack */
/* loaded from: classes16.dex */
public class C25784x4902762 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 {

    /* renamed from: LOG_VERBOSE */
    public static boolean f48254x81d26f47 = false;

    /* renamed from: PRE_READ */
    public static boolean f48255xe33c6dd2 = true;
    private static java.lang.String TAG = "VDecoderTrack";

    /* renamed from: _outputSurface */
    private android.view.Surface f48256xe2224a6d;

    /* renamed from: _speed */
    private float f48257xa8a56348;

    /* renamed from: currentDecoder */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 f48258xfd2c1c8b;

    /* renamed from: currentDecoderLock */
    private final java.lang.Object f48259x19891856;

    /* renamed from: currentFrame */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f48260x562c7f74;

    /* renamed from: currentSegmentStartTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48261xc76763f5;

    /* renamed from: decodeError */
    private boolean f48262x45b354ba;

    /* renamed from: decodeException */
    private java.lang.Exception f48263x22f9aa01;

    /* renamed from: decodeReporter */
    private final com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b f48264xb3470cef;

    /* renamed from: decoderCreateThread */
    private com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderCreateThread f48266xb6fca88a;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f48267x2d4a8826;

    /* renamed from: decoderThread */
    private final com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderThread f48268xbeec636e;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48269x89444d94;

    /* renamed from: isReleased */
    private boolean f48272xafdb8087;

    /* renamed from: lastSampleState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48273x8ad81491;

    /* renamed from: logger */
    private com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f48274xbe97f590;

    /* renamed from: nextDecoder */
    private com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderWrapper f48275xac8311d1;

    /* renamed from: nextDecoderLock */
    private final java.lang.Object f48276xae37fa9c;

    /* renamed from: nextFrame */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f48277x472c0e3a;

    /* renamed from: nextFrameDecoderLock */
    private final java.lang.Object f48278xe62474f5;

    /* renamed from: started */
    private boolean f48282x8eeb4081;

    /* renamed from: surfaceCreator */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator f48283xbb66febf;

    /* renamed from: trackId */
    private int f48284xc060d3c6;

    /* renamed from: videoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f48285xaffe922f;

    /* renamed from: frameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48270xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1, 44);

    /* renamed from: frameRate */
    private int f48271x207cebed = 44;

    /* renamed from: segments */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> f48281x3eef47a0 = new java.util.ArrayList<>();

    /* renamed from: preReadReporters */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b> f48279x78d004d9 = new java.util.ArrayList<>();

    /* renamed from: decodeType */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType f48265xb7f3ee48 = com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Video;

    /* renamed from: segmentIndex */
    private int f48280x1ea6215f = -1;

    /* renamed from: com.tencent.tav.decoder.VideoDecoderTrack$DecoderCreateThread */
    /* loaded from: classes16.dex */
    public class DecoderCreateThread extends java.lang.Thread {

        /* renamed from: outputSurface */
        private android.view.Surface f48286x10d4786c;

        /* renamed from: segmentIndex */
        private int f48287x1ea6215f;

        /* renamed from: videoAsset */
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f f48289x9dea7b35;

        /* renamed from: checkCreateDecoder */
        private void m97735xfc8780() {
            if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1 == null || !com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97990xbf249754(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.f48293xf0edce24, this.f48289x9dea7b35)) {
                if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1 == null) {
                    m97736xe1d6cfa8();
                    return;
                }
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.d(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "DecoderCreateThread create - " + this.f48289x9dea7b35.f48008x4e63cb35);
                if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.f48292x5befac44 != null && com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.f48292x5befac44 != com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48258xfd2c1c8b) {
                    m97737xcbfe174a();
                }
                m97736xe1d6cfa8();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: createDecoder */
        private void m97736xe1d6cfa8() {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 c25783x5cf59369;
            if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48281x3eef47a0 == null || this.f48287x1ea6215f >= com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48281x3eef47a0.size()) {
                return;
            }
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = null;
            java.lang.Object[] objArr = 0;
            try {
                android.view.Surface surface = this.f48286x10d4786c;
                com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f = this.f48289x9dea7b35;
                if (c25760x91f3af7f.f48015xbdc0e5f5 == 3) {
                    c25783x5cf59369 = new com.p314xaae8f345.tav.p2959x5befac44.C25771x8963c289();
                    try {
                        com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97720x30166c(surface);
                        c25783x5cf59369.mo97560x316510(this.f48289x9dea7b35.f48008x4e63cb35, com.p314xaae8f345.tav.p2959x5befac44.C25771x8963c289.f48108x3bfe9eae, null);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        interfaceC25770x60526e32 = c25783x5cf59369;
                        com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.e(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "createDecoder: ", e);
                        com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97731xce1bc0d8(interfaceC25770x60526e32);
                        return;
                    }
                } else {
                    c25783x5cf59369 = new com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369(c25760x91f3af7f.f48008x4e63cb35, surface, com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48283xbb66febf.mo97552x6eb64fe4(this.f48286x10d4786c), com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48267x2d4a8826, com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48285xaffe922f);
                }
                c25783x5cf59369.mo97370x68ac462(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97722xb371dafd(this.f48287x1ea6215f).m97455xdd1fba(), com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97722xb371dafd(this.f48287x1ea6215f).m97453x7cd3f1e1());
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762 c25784x4902762 = com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this;
                c25784x4902762.f48275xac8311d1 = new com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderWrapper();
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.f48294x10d4786c = surface;
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.f48292x5befac44 = c25783x5cf59369;
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.f48293xf0edce24 = this.f48289x9dea7b35;
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.f48295x1ea6215f = this.f48287x1ea6215f;
                ((com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b) com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48279x78d004d9.get(this.f48287x1ea6215f)).add(c25783x5cf59369.mo97558x15b5cd10());
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.d(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "DecoderCreateThread success - " + this.f48289x9dea7b35.f48008x4e63cb35);
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        }

        /* renamed from: releaseNextDecoder */
        private void m97737xcbfe174a() {
            synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48276xae37fa9c) {
                if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1 != null) {
                    com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1.m97740x41012807();
                    com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48275xac8311d1 = null;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590;
            java.lang.String str = com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DecoderCreateThread start - ");
            sb6.append(this.f48289x9dea7b35.f48008x4e63cb35);
            sb6.append(" - ");
            sb6.append(this.f48286x10d4786c != null);
            c25799x4a77fd1.d(str, sb6.toString());
            if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48272xafdb8087) {
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48266xb6fca88a = null;
                return;
            }
            synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48276xae37fa9c) {
                m97735xfc8780();
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48266xb6fca88a = null;
            if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48272xafdb8087) {
                m97737xcbfe174a();
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.d(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "DecoderCreateThread finish - " + this.f48289x9dea7b35.f48008x4e63cb35);
        }

        private DecoderCreateThread(com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f, android.view.Surface surface, int i17) {
            super("DecoderCreateThread " + c25760x91f3af7f.f48008x4e63cb35);
            this.f48289x9dea7b35 = c25760x91f3af7f;
            this.f48286x10d4786c = surface;
            this.f48287x1ea6215f = i17;
        }
    }

    /* renamed from: com.tencent.tav.decoder.VideoDecoderTrack$DecoderThread */
    /* loaded from: classes16.dex */
    public class DecoderThread extends com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a.AbstractHandlerThreadC25817xd0622a0b {

        /* renamed from: NAME */
        private static final java.lang.String f48290x24728b = "VideoDecoder";

        /* renamed from: doActionInDecoderLock */
        private void m97738xaa0d2009() {
            if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48277x472c0e3a == null) {
                return;
            }
            if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48273x8ad81491.m97210x5241396d()) {
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97724x9c66f99e("DecoderThread doAction: CMTime.CMTimeZero");
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762 c25784x4902762 = com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this;
                c25784x4902762.f48277x472c0e3a = c25784x4902762.m97718xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, true);
            } else if (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48273x8ad81491.m97206x8311a768() >= 0) {
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97724x9c66f99e("DecoderThread doAction: lastSampleTime.add(frameDuration) ");
                com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97193x75286adb = com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48277x472c0e3a.m97193x75286adb();
                if (m97193x75286adb != null) {
                    com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762 c25784x49027622 = com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this;
                    c25784x49027622.f48277x472c0e3a = c25784x49027622.m97718xe881a9cb(m97193x75286adb.m97208xfb85bb43(), true);
                } else {
                    com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.e(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "frame state is null");
                    com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48277x472c0e3a = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-211L));
                }
            }
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a.AbstractHandlerThreadC25817xd0622a0b
        /* renamed from: doAction */
        public void mo96678xf85da2a1() {
            synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48278xe62474f5) {
                m97738xaa0d2009();
            }
        }

        private DecoderThread() {
            super(f48290x24728b);
        }
    }

    /* renamed from: com.tencent.tav.decoder.VideoDecoderTrack$DecoderWrapper */
    /* loaded from: classes16.dex */
    public class DecoderWrapper {

        /* renamed from: decoder */
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 f48292x5befac44;

        /* renamed from: extractor */
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f f48293xf0edce24;

        /* renamed from: outputSurface */
        android.view.Surface f48294x10d4786c;

        /* renamed from: segmentIndex */
        int f48295x1ea6215f;

        private DecoderWrapper() {
            this.f48295x1ea6215f = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: release */
        public void m97740x41012807() {
            com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.d(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "Video DecoderWrapper release: ");
            com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97731xce1bc0d8(this.f48292x5befac44);
        }
    }

    /* renamed from: com.tencent.tav.decoder.VideoDecoderTrack$ReleaseDecoderThread */
    /* loaded from: classes16.dex */
    public class ReleaseDecoderThread extends java.lang.Thread {

        /* renamed from: decoder */
        private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 f48297x5befac44;

        public ReleaseDecoderThread(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32) {
            super("ReleaseDecoderThread");
            this.f48297x5befac44 = interfaceC25770x60526e32;
        }

        /* renamed from: doRelease */
        private void m97741x999790fc() {
            if (this.f48297x5befac44 != null) {
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.d(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "ReleaseDecoderThread start");
                this.f48297x5befac44.mo97565x41012807(true);
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.m97720x30166c(this.f48297x5befac44.mo97563x10d4786c());
                this.f48297x5befac44 = null;
                com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.this.f48274xbe97f590.d(com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.TAG, "ReleaseDecoderThread end");
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m97741x999790fc();
        }

        @Override // java.lang.Thread
        public void start() {
            if (!(this.f48297x5befac44 instanceof com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369)) {
                m97741x999790fc();
            }
            super.start();
        }
    }

    public C25784x4902762(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f48261xc76763f5 = c25736x76b98a57;
        this.f48273x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        this.f48266xb6fca88a = null;
        this.f48276xae37fa9c = new java.lang.Object();
        this.f48259x19891856 = new java.lang.Object();
        this.f48278xe62474f5 = new java.lang.Object();
        this.f48272xafdb8087 = false;
        this.f48277x472c0e3a = null;
        this.f48260x562c7f74 = null;
        this.f48269x89444d94 = c25736x76b98a57;
        this.f48268xbeec636e = new com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderThread();
        this.f48283xbb66febf = null;
        this.f48264xb3470cef = new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b();
        this.f48257xa8a56348 = 1.0f;
        this.f48282x8eeb4081 = false;
        this.f48262x45b354ba = false;
        this.f48263x22f9aa01 = null;
        this.f48274xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        this.f48267x2d4a8826 = interfaceC25650x9122a0cf;
        this.f48284xc060d3c6 = c25634xf527485b.m96163xfe2e0f70();
        java.util.List mo96159xbac98516 = c25634xf527485b.mo96159xbac98516();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f48279x78d004d9.clear();
        java.util.Iterator it = mo96159xbac98516.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(c25634xf527485b, (com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258) it.next()));
            this.f48279x78d004d9.add(new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b());
        }
        mo96670xef2344c9(arrayList);
        mo96667x7c3e1dab(mo96655x1fea5d37() > 0 ? mo96655x1fea5d37() : (int) c25634xf527485b.m96155xe9bce1e7());
        mo96671x27f73e1c(c25634xf527485b.m96158xbfdb8cc5());
        mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Video);
        if (c25634xf527485b.m96161xdd1fba() != null) {
            mo96650x5b0b7d5a(c25634xf527485b.m96161xdd1fba().m97252x5a5dd5d());
        }
    }

    /* renamed from: clipRangeAndRemoveRange */
    private void m97707x55684def(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null || c25738xead39d26.m97257x37a7fb48() <= 0 || this.f48281x3eef47a0.size() == 0) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        int m97719x4019180b = m97719x4019180b(m97260x75286aac, false);
        if (m97719x4019180b == -1) {
            return;
        }
        int m97719x4019180b2 = m97719x4019180b(m97258xb58839a5, false);
        if (m97719x4019180b2 == -1) {
            m97719x4019180b2 = this.f48281x3eef47a0.size() - 1;
        } else if (m97723x8b1fdbd2(m97719x4019180b2) == m97258xb58839a5) {
            m97719x4019180b2--;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97723x8b1fdbd2 = m97723x8b1fdbd2(m97719x4019180b);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97723x8b1fdbd22 = m97723x8b1fdbd2(m97719x4019180b2);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97722xb371dafd = m97722xb371dafd(m97719x4019180b);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97722xb371dafd2 = m97722xb371dafd(m97719x4019180b2);
        if (m97722xb371dafd2.m97455xdd1fba().m97257x37a7fb48() > 0 && !m97723x8b1fdbd2(m97719x4019180b2 + 1).m97238x9f3f7b48(c25738xead39d26.m97258xb58839a5())) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = c25738xead39d26.m97258xb58839a5().sub(m97723x8b1fdbd22);
            m97722xb371dafd2.m97458x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97722xb371dafd2.m97455xdd1fba().m97260x75286aac(), sub.m97226xb0a37c79((((float) m97722xb371dafd2.m97454x3583a504().m97232x31040141()) * 1.0f) / ((float) m97722xb371dafd2.m97455xdd1fba().m97257x37a7fb48()))));
            m97722xb371dafd2.m97457xfd7a0d10(sub);
        }
        if (m97722xb371dafd.m97455xdd1fba().m97257x37a7fb48() > 0) {
            float m97232x31040141 = (((float) m97722xb371dafd.m97454x3583a504().m97232x31040141()) * 1.0f) / ((float) m97722xb371dafd.m97455xdd1fba().m97257x37a7fb48());
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub2 = c25738xead39d26.m97260x75286aac().sub(m97723x8b1fdbd2);
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97226xb0a37c79 = sub2.m97226xb0a37c79(m97232x31040141);
            m97722xb371dafd.m97458x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97722xb371dafd.m97455xdd1fba().m97260x75286aac().add(m97226xb0a37c79), m97722xb371dafd.m97455xdd1fba().m97256x51e8b0a().sub(m97226xb0a37c79)));
            m97722xb371dafd.m97457xfd7a0d10(m97722xb371dafd.m97454x3583a504().sub(sub2));
        }
        for (int size = this.f48281x3eef47a0.size() - 1; size >= 0; size--) {
            if (size > m97719x4019180b2 || size < m97719x4019180b) {
                this.f48281x3eef47a0.remove(size);
            }
        }
        if (m97723x8b1fdbd2(m97719x4019180b2 + 1).m97238x9f3f7b48(c25738xead39d26.m97258xb58839a5())) {
            this.f48281x3eef47a0.add(new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m97258xb58839a5.sub(m97722xb371dafd2.m97454x3583a504().add(m97723x8b1fdbd22))), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:18|(4:22|78|43|44)|(2:48|49)|(2:51|(11:53|54|55|56|(4:58|59|60|61)(1:90)|62|63|64|65|67|68))|93|55|56|(0)(0)|62|63|64|65|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01eb, code lost:
    
        r5.mo97565x41012807(true);
        m97720x30166c(r5.mo97563x10d4786c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157 A[Catch: Exception -> 0x01c3, all -> 0x0210, TryCatch #1 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002c, B:16:0x003c, B:18:0x0042, B:20:0x004e, B:22:0x005c, B:23:0x0078, B:47:0x00d1, B:49:0x0153, B:51:0x0157, B:53:0x015d, B:56:0x016a, B:58:0x016f, B:60:0x0174, B:62:0x0194, B:65:0x019f, B:70:0x01c7, B:73:0x01fa, B:75:0x01fe, B:77:0x0206, B:85:0x01f7, B:90:0x0180, B:97:0x00d2, B:99:0x00f0, B:101:0x00f8, B:103:0x00fe, B:104:0x0100, B:128:0x0152, B:106:0x0101, B:108:0x0105, B:110:0x0109, B:113:0x010d, B:115:0x0115, B:116:0x0120, B:119:0x0135, B:120:0x014b, B:124:0x014e, B:81:0x01eb, B:25:0x0079, B:27:0x007d, B:29:0x0085, B:32:0x008b, B:34:0x0093, B:35:0x009e, B:38:0x00b3, B:39:0x00c9, B:43:0x00cc), top: B:3:0x0007, inners: #0, #5, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f A[Catch: Exception -> 0x01bf, all -> 0x0210, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002c, B:16:0x003c, B:18:0x0042, B:20:0x004e, B:22:0x005c, B:23:0x0078, B:47:0x00d1, B:49:0x0153, B:51:0x0157, B:53:0x015d, B:56:0x016a, B:58:0x016f, B:60:0x0174, B:62:0x0194, B:65:0x019f, B:70:0x01c7, B:73:0x01fa, B:75:0x01fe, B:77:0x0206, B:85:0x01f7, B:90:0x0180, B:97:0x00d2, B:99:0x00f0, B:101:0x00f8, B:103:0x00fe, B:104:0x0100, B:128:0x0152, B:106:0x0101, B:108:0x0105, B:110:0x0109, B:113:0x010d, B:115:0x0115, B:116:0x0120, B:119:0x0135, B:120:0x014b, B:124:0x014e, B:81:0x01eb, B:25:0x0079, B:27:0x007d, B:29:0x0085, B:32:0x008b, B:34:0x0093, B:35:0x009e, B:38:0x00b3, B:39:0x00c9, B:43:0x00cc), top: B:3:0x0007, inners: #0, #5, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180 A[Catch: Exception -> 0x01bf, all -> 0x0210, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002c, B:16:0x003c, B:18:0x0042, B:20:0x004e, B:22:0x005c, B:23:0x0078, B:47:0x00d1, B:49:0x0153, B:51:0x0157, B:53:0x015d, B:56:0x016a, B:58:0x016f, B:60:0x0174, B:62:0x0194, B:65:0x019f, B:70:0x01c7, B:73:0x01fa, B:75:0x01fe, B:77:0x0206, B:85:0x01f7, B:90:0x0180, B:97:0x00d2, B:99:0x00f0, B:101:0x00f8, B:103:0x00fe, B:104:0x0100, B:128:0x0152, B:106:0x0101, B:108:0x0105, B:110:0x0109, B:113:0x010d, B:115:0x0115, B:116:0x0120, B:119:0x0135, B:120:0x014b, B:124:0x014e, B:81:0x01eb, B:25:0x0079, B:27:0x007d, B:29:0x0085, B:32:0x008b, B:34:0x0093, B:35:0x009e, B:38:0x00b3, B:39:0x00c9, B:43:0x00cc), top: B:3:0x0007, inners: #0, #5, #8, #9 }] */
    /* renamed from: createDecoder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 m97708xe1d6cfa8(com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac r17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 r18) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.m97708xe1d6cfa8(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IVideoDecoder");
    }

    /* renamed from: createNextDecoder */
    private void m97710xd9a1e335(int i17) {
        int i18;
        java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> arrayList = this.f48281x3eef47a0;
        if (arrayList == null || !f48255xe33c6dd2 || (i18 = i17 + 1) >= arrayList.size() || this.f48266xb6fca88a != null) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f m97456x8c2b332b = m97722xb371dafd(i18).m97456x8c2b332b();
        if (m97456x8c2b332b != null) {
            com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderWrapper decoderWrapper = this.f48275xac8311d1;
            if (decoderWrapper == null || !com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97990xbf249754(decoderWrapper.f48293xf0edce24, m97456x8c2b332b)) {
                m97709xe1d6cfa8(m97456x8c2b332b, i18);
                return;
            }
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderWrapper decoderWrapper2 = this.f48275xac8311d1;
        if (decoderWrapper2 == null || decoderWrapper2.f48295x1ea6215f == i17) {
            return;
        }
        decoderWrapper2.f48292x5befac44.mo97369x68ac462(m97722xb371dafd(i17).m97455xdd1fba());
        this.f48275xac8311d1.f48295x1ea6215f = i17;
    }

    /* renamed from: createSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97716x607ae9a6(boolean z17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f48260x562c7f74;
        if (c25734xcdff9c14 != null) {
            return m97713x607ae9a6(this.f48273x8ad81491, c25734xcdff9c14.m97194x3a00ef33(), z17);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = this.f48273x8ad81491;
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48258xfd2c1c8b;
        return m97713x607ae9a6(c25735x289c723d, interfaceC25770x60526e32 == null ? null : interfaceC25770x60526e32.mo97559x3a00ef33(), z17);
    }

    /* renamed from: doReadSample */
    private synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97717xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97718xe881a9cb(c25736x76b98a57, false);
    }

    /* renamed from: findSegmentIndexAt */
    private int m97719x4019180b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        boolean z18;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> it = this.f48281x3eef47a0.iterator();
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97454x3583a504 = it.next().m97454x3583a504();
            if (c25736x76b98a57.m97225x38a73ce5(c25736x76b98a572) >= 0 && c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a572.add(m97454x3583a504))) {
                z19 = true;
                break;
            }
            c25736x76b98a572 = c25736x76b98a572.add(m97454x3583a504);
            i17++;
        }
        if (z19 || c25736x76b98a57 != c25736x76b98a572 || i17 <= 0 || !z17) {
            z18 = z19;
        } else {
            i17--;
        }
        if (z18) {
            return i17;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: free */
    public void m97720x30166c(android.view.Surface surface) {
        if (surface != null) {
            try {
                this.f48283xbb66febf.mo97550x30166c(surface);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: getCurrentSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97721x578dc70() {
        return m97722xb371dafd(this.f48280x1ea6215f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSegment */
    public com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97722xb371dafd(int i17) {
        return this.f48281x3eef47a0.get(i17);
    }

    /* renamed from: getSegmentStartTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97723x8b1fdbd2(int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (int i18 = 0; i18 < i17 && i18 < this.f48281x3eef47a0.size(); i18++) {
            c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.add(c25736x76b98a57, m97722xb371dafd(i18).m97454x3583a504());
        }
        return c25736x76b98a57;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logVerbose */
    public void m97724x9c66f99e(java.lang.String str) {
        this.f48274xbe97f590.v(TAG, str);
    }

    /* renamed from: needSwitchNextFrame */
    private boolean m97725xde2181f0(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c142, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (c25734xcdff9c14 == null) {
            return true;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97195xfb85bb43 = c25734xcdff9c142.m97195xfb85bb43();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        if (m97195xfb85bb43.m97238x9f3f7b48(c25736x76b98a572)) {
            return true;
        }
        long m97232x31040141 = c25734xcdff9c142.m97195xfb85bb43().m97232x31040141();
        long m97232x310401412 = c25736x76b98a57.m97232x31040141();
        if (c25734xcdff9c142.m97196x216ebaf7()) {
            for (int i17 = 0; i17 < this.f48280x1ea6215f && i17 < this.f48281x3eef47a0.size(); i17++) {
                c25736x76b98a572.add(this.f48281x3eef47a0.get(i17).m97454x3583a504());
            }
            if (c25736x76b98a57.m97222xf922bec1(c25734xcdff9c14.m97195xfb85bb43()) && !c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a572)) {
                return true;
            }
        }
        return java.lang.Math.abs(m97232x310401412) >= java.lang.Math.abs(m97232x31040141);
    }

    /* renamed from: nextSegment */
    private boolean m97726xc63804c0(boolean z17) {
        this.f48274xbe97f590.d(TAG, "nextSegment:" + z17);
        int i17 = this.f48280x1ea6215f + 1;
        this.f48280x1ea6215f = i17;
        this.f48256xe2224a6d = null;
        if (i17 >= this.f48281x3eef47a0.size()) {
            this.f48280x1ea6215f = -1;
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97723x8b1fdbd2 = m97723x8b1fdbd2(this.f48280x1ea6215f);
        this.f48261xc76763f5 = m97723x8b1fdbd2;
        this.f48273x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(m97723x8b1fdbd2);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97721x578dc70 = m97721x578dc70();
        if (m97721x578dc70.m97456x8c2b332b() != null) {
            synchronized (this.f48259x19891856) {
                com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48258xfd2c1c8b;
                if (interfaceC25770x60526e32 != null && interfaceC25770x60526e32.mo97358xabff72d6() != null) {
                    new com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.ReleaseDecoderThread(this.f48258xfd2c1c8b).start();
                    this.f48258xfd2c1c8b = null;
                }
            }
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 m97708xe1d6cfa8 = m97708xe1d6cfa8(m97721x578dc70, z17 ? m97721x578dc70().m97453x7cd3f1e1() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
            synchronized (this.f48259x19891856) {
                this.f48258xfd2c1c8b = m97708xe1d6cfa8;
                if (m97708xe1d6cfa8 != null && m97708xe1d6cfa8.mo97359x7c8fed1()) {
                    if (z17) {
                        this.f48258xfd2c1c8b.mo97367xc9fc1b13(m97721x578dc70.m97453x7cd3f1e1());
                    }
                    this.f48256xe2224a6d = this.f48258xfd2c1c8b.mo97563x10d4786c();
                }
            }
        } else {
            this.f48274xbe97f590.d(TAG, "nextSegment: videoAsset is null");
            synchronized (this.f48259x19891856) {
                if (this.f48258xfd2c1c8b != null) {
                    new com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.ReleaseDecoderThread(this.f48258xfd2c1c8b).start();
                    this.f48258xfd2c1c8b = null;
                }
            }
        }
        if (m97721x578dc70.m97454x3583a504().m97232x31040141() > 0) {
            this.f48257xa8a56348 = (((float) m97721x578dc70.m97455xdd1fba().m97257x37a7fb48()) * 1.0f) / ((float) m97721x578dc70.m97454x3583a504().m97232x31040141());
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48274xbe97f590;
        java.lang.String str = TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nextSegment:");
        sb6.append(this.f48258xfd2c1c8b == null);
        sb6.append(" ");
        sb6.append(this.f48257xa8a56348);
        c25799x4a77fd1.d(str, sb6.toString());
        return true;
    }

    /* renamed from: release */
    private void m97727x41012807(android.view.Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: releaseDecoder */
    private void m97728x9132563d() {
        if (this.f48258xfd2c1c8b == null) {
            return;
        }
        synchronized (this.f48259x19891856) {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48258xfd2c1c8b;
            if (interfaceC25770x60526e32 != null && interfaceC25770x60526e32.mo97358xabff72d6() != null) {
                this.f48264xb3470cef.add(this.f48258xfd2c1c8b.mo97357xc291ccac());
                new com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.ReleaseDecoderThread(this.f48258xfd2c1c8b).start();
                this.f48258xfd2c1c8b = null;
            }
        }
    }

    /* renamed from: segmentsDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97729x129c5954() {
        return m97723x8b1fdbd2(this.f48281x3eef47a0.size());
    }

    /* renamed from: switchToNextFrame */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97730x2cf2622b() {
        com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 m97433xe94b10e5;
        this.f48260x562c7f74 = m97713x607ae9a6(this.f48277x472c0e3a.m97193x75286adb(), this.f48277x472c0e3a.m97194x3a00ef33(), this.f48277x472c0e3a.m97196x216ebaf7());
        if (this.f48277x472c0e3a.m97196x216ebaf7()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f48277x472c0e3a;
            if ((c25734xcdff9c14 instanceof com.p314xaae8f345.tav.p2959x5befac44.C25758x23ea9f0c) && (m97433xe94b10e5 = ((com.p314xaae8f345.tav.p2959x5befac44.C25758x23ea9f0c) c25734xcdff9c14).m97433xe94b10e5()) != null && !java.lang.Thread.currentThread().getName().equals("VideoDecoder")) {
                m97724x9c66f99e("readSample: awaitNewImage: " + this.f48277x472c0e3a.m97195xfb85bb43());
                try {
                    m97433xe94b10e5.m97749x13bc3b11();
                } catch (java.lang.Throwable th6) {
                    this.f48274xbe97f590.e(TAG, "readSample: videoTexture.awaitNewImage() error", th6);
                    return m97712x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L));
                }
            }
        }
        this.f48277x472c0e3a = m97712x607ae9a6(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d());
        if (!this.f48260x562c7f74.m97195xfb85bb43().m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
            return null;
        }
        this.f48273x8ad81491 = this.f48260x562c7f74.m97193x75286adb();
        return m97712x607ae9a6(this.f48260x562c7f74.m97193x75286adb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryReleaseDecoder */
    public void m97731xce1bc0d8(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32) {
        if (interfaceC25770x60526e32 != null) {
            try {
                interfaceC25770x60526e32.mo97565x41012807(true);
                m97720x30166c(interfaceC25770x60526e32.mo97563x10d4786c());
            } catch (java.lang.Exception e17) {
                this.f48274xbe97f590.e(TAG, "tryReleaseDecoder Exception, ignore", e17);
            }
        }
    }

    /* renamed from: unNeedReDecoderNextFrame */
    private boolean m97732xef1af7d8(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f48277x472c0e3a;
        boolean z17 = c25734xcdff9c14 != null && c25734xcdff9c14.m97195xfb85bb43().m97222xf922bec1(c25736x76b98a57);
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c142 = this.f48277x472c0e3a;
        return z17 || (c25734xcdff9c142 != null && this.f48260x562c7f74 != null && c25734xcdff9c142.m97195xfb85bb43().m97222xf922bec1(this.f48260x562c7f74.m97195xfb85bb43()));
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: asyncReadNextSample */
    public synchronized void mo96649xb8b7224f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (m97732xef1af7d8(c25736x76b98a57)) {
            return;
        }
        if (this.f48272xafdb8087) {
            return;
        }
        this.f48277x472c0e3a = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25736x76b98a57);
        synchronized (this.f48268xbeec636e) {
            this.f48268xbeec636e.m97940xab2f7e36();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: clipRangeAndClearRange */
    public void mo96650x5b0b7d5a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null || c25738xead39d26.m97257x37a7fb48() <= 0 || this.f48281x3eef47a0.size() == 0) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97729x129c5954 = m97729x129c5954();
        m97707x55684def(c25738xead39d26);
        if (m97260x75286aac.m97233x754a37bb() != 0) {
            this.f48281x3eef47a0.add(0, new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m97260x75286aac), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
        if (m97258xb58839a5.m97232x31040141() < m97729x129c5954.m97232x31040141()) {
            this.f48281x3eef47a0.add(new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97258xb58839a5, new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97729x129c5954.m97231x793685bc() - m97258xb58839a5.m97231x793685bc())), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getCurrentSampleTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a() {
        return this.f48273x8ad81491.m97208xfb85bb43();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96652xc291ccac() {
        return this.f48264xb3470cef;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = this.f48269x89444d94;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        if (c25736x76b98a57 == c25736x76b98a572) {
            java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> it = this.f48281x3eef47a0.iterator();
            while (it.hasNext()) {
                c25736x76b98a572 = c25736x76b98a572.add(it.next().m97454x3583a504());
            }
            this.f48269x89444d94 = c25736x76b98a572;
        }
        return this.f48269x89444d94;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96654xacbb5a6b() {
        return this.f48270xef5b9e21;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameRate */
    public int mo96655x1fea5d37() {
        return this.f48271x207cebed;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getLaggingTime */
    public long mo96656x213de1e4() {
        long j17 = 0;
        for (int i17 = 1; i17 < this.f48279x78d004d9.size(); i17++) {
            j17 += java.lang.Math.max(0L, this.f48279x78d004d9.get(i17).m98298xda5cde1d() - (this.f48281x3eef47a0.get(i17).m97454x3583a504().m97232x31040141() / 1000));
        }
        return j17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getTrackId */
    public int mo96657xfe2e0f90() {
        return this.f48284xc060d3c6;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0() {
        if (this.f48273x8ad81491.m97210x5241396d()) {
            return mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
        }
        return mo96660xe121b2e0(this.f48273x8ad81491.m97208xfb85bb43().add(this.f48270xef5b9e21));
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: seekTo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18) {
        m97724x9c66f99e("seekTo:[time " + c25736x76b98a57 + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        synchronized (this.f48278xe62474f5) {
            this.f48260x562c7f74 = null;
            this.f48277x472c0e3a = null;
        }
        synchronized (this) {
            if (this.f48282x8eeb4081 && !this.f48272xafdb8087) {
                int m97719x4019180b = m97719x4019180b(c25736x76b98a57, true);
                if (m97719x4019180b == -1) {
                    this.f48280x1ea6215f = -1;
                    this.f48274xbe97f590.e(TAG, "seekTo: [failed] [index " + m97719x4019180b + "]");
                    return null;
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97723x8b1fdbd2 = m97723x8b1fdbd2(m97719x4019180b);
                if (this.f48280x1ea6215f != m97719x4019180b || this.f48258xfd2c1c8b == null) {
                    this.f48280x1ea6215f = m97719x4019180b - 1;
                    m97726xc63804c0(false);
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97236x636d539 = c25736x76b98a57.sub(m97723x8b1fdbd2).m97236x636d539(this.f48257xa8a56348);
                com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97721x578dc70 = m97721x578dc70();
                com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48258xfd2c1c8b;
                if (interfaceC25770x60526e32 == null) {
                    this.f48273x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
                    this.f48274xbe97f590.e(TAG, "seekTo: [failed] [currentDecoder == null]");
                    return null;
                }
                interfaceC25770x60526e32.mo97566xc9fc1b13(m97721x578dc70.m97453x7cd3f1e1().add(m97236x636d539), z18);
                if (c25736x76b98a57.m97222xf922bec1(this.f48270xef5b9e21)) {
                    this.f48273x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57.sub(this.f48270xef5b9e21));
                } else {
                    this.f48273x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0 = z17 ? mo96659xe121b2e0() : null;
                this.f48260x562c7f74 = null;
                this.f48277x472c0e3a = null;
                m97724x9c66f99e("seekTo: [success] [lastSampleState " + this.f48273x8ad81491 + "] [sampleBuffer " + mo96659xe121b2e0 + "]");
                return mo96659xe121b2e0;
            }
            this.f48274xbe97f590.e(TAG, "seekTo: [failed] [started " + this.f48282x8eeb4081 + "] [isReleased " + this.f48272xafdb8087 + "]");
            return null;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setDecodeType */
    public void mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType decodeType) {
        this.f48265xb7f3ee48 = decodeType;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setFrameRate */
    public void mo96667x7c3e1dab(int i17) {
        this.f48271x207cebed = i17;
        this.f48270xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(600 / i17, 600);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setLogger */
    public void mo96668x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
        this.f48274xbe97f590 = c25799x4a77fd1;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setTrackSegments */
    public void mo96670xef2344c9(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> list) {
        if (this.f48281x3eef47a0 == null) {
            this.f48281x3eef47a0 = new java.util.ArrayList<>();
        }
        this.f48281x3eef47a0.clear();
        this.f48281x3eef47a0.addAll(list);
    }

    /* renamed from: setVideoComposition */
    public void m97733xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f48285xaffe922f = c25706x7dc2d64f;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setVolume */
    public void mo96671x27f73e1c(float f17) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96672x68ac462() {
        mo96673x68ac462(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doReadSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97718xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32;
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97711x607ae9a6;
        m97724x9c66f99e("doReadSample: step 1 ");
        if (this.f48272xafdb8087) {
            return m97711x607ae9a6(-100L);
        }
        if (c25736x76b98a57 == null) {
            return m97711x607ae9a6(-3L);
        }
        if (this.f48280x1ea6215f == -1) {
            if (this.f48273x8ad81491.m97206x8311a768() >= -1) {
                m97711x607ae9a6 = m97711x607ae9a6(-1L);
            } else {
                m97711x607ae9a6 = m97711x607ae9a6(-100L);
            }
            return m97711x607ae9a6;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97721x578dc70 = m97721x578dc70();
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
        boolean z18 = false;
        boolean z19 = false;
        while (true) {
            m97724x9c66f99e("doReadSample: step 2 ");
            if (this.f48258xfd2c1c8b == null) {
                this.f48273x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(this.f48273x8ad81491.m97208xfb85bb43().add(this.f48270xef5b9e21));
                if (this.f48273x8ad81491.m97208xfb85bb43().m97238x9f3f7b48(this.f48261xc76763f5.add(m97721x578dc70.m97454x3583a504()))) {
                    com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator = this.f48283xbb66febf;
                    if (surfaceCreator == null) {
                        return m97712x607ae9a6(this.f48273x8ad81491);
                    }
                    return m97714x607ae9a6(this.f48273x8ad81491, surfaceCreator.mo97552x6eb64fe4(this.f48256xe2224a6d), false);
                }
            } else {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97235x456b0497 = c25736x76b98a57.sub(this.f48261xc76763f5).m97236x636d539(this.f48257xa8a56348).m97235x456b0497(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
                if (((float) m97235x456b0497.m97232x31040141()) > ((float) m97721x578dc70.m97454x3583a504().m97232x31040141()) * this.f48257xa8a56348) {
                    m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
                } else {
                    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add = m97235x456b0497.add(m97721x578dc70.m97453x7cd3f1e1());
                    com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e322 = this.f48258xfd2c1c8b;
                    if (interfaceC25770x60526e322 == null) {
                        m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L);
                    } else {
                        m97200x360047e = interfaceC25770x60526e322.mo97364xe121b2e0(add);
                    }
                    z19 = true;
                }
            }
            if (!m97200x360047e.m97214x36f88ac9(-1) && !m97200x360047e.m97208xfb85bb43().m97222xf922bec1(m97721x578dc70.m97455xdd1fba().m97256x51e8b0a())) {
                if (m97200x360047e.m97206x8311a768() >= 0) {
                    m97724x9c66f99e("doReadSample: step 3 ");
                    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = m97200x360047e.m97208xfb85bb43().sub(m97721x578dc70.m97453x7cd3f1e1());
                    if (sub.m97222xf922bec1(m97721x578dc70.m97455xdd1fba().m97256x51e8b0a())) {
                        sub = m97721x578dc70.m97455xdd1fba().m97256x51e8b0a();
                    }
                    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(this.f48261xc76763f5.add(sub.m97226xb0a37c79(this.f48257xa8a56348)), m97200x360047e.f47857xa7c31030);
                    m97724x9c66f99e("readSample: currentTime = " + c25736x76b98a57 + "  sampleState = " + c25735x289c723d);
                    return m97715x607ae9a6(c25735x289c723d, true);
                }
                if (!m97200x360047e.m97214x36f88ac9(-3)) {
                    return m97712x607ae9a6(this.f48273x8ad81491);
                }
                return m97712x607ae9a6(m97200x360047e);
            }
            if (m97721x578dc70.m97454x3583a504().add(this.f48261xc76763f5).sub(this.f48270xef5b9e21).m97222xf922bec1(c25736x76b98a57)) {
                if (z19 && (interfaceC25770x60526e32 = this.f48258xfd2c1c8b) != null && interfaceC25770x60526e32.mo97561xa27b058f()) {
                    z18 = true;
                }
                return m97715x607ae9a6(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57), z18);
            }
            if (z17) {
                this.f48274xbe97f590.d(TAG, "async read finish , skip it!");
                return null;
            }
            if (!m97726xc63804c0(true)) {
                return m97715x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L), false);
            }
            m97721x578dc70 = m97721x578dc70();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: release */
    public synchronized void mo96661x41012807() {
        this.f48268xbeec636e.m97941x41012807();
        this.f48274xbe97f590.d(TAG, "release: start " + this);
        this.f48272xafdb8087 = true;
        this.f48281x3eef47a0.clear();
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48258xfd2c1c8b;
        if (interfaceC25770x60526e32 != null) {
            this.f48264xb3470cef.add(interfaceC25770x60526e32.mo97357xc291ccac());
            this.f48258xfd2c1c8b.mo97565x41012807(true);
            m97727x41012807(this.f48258xfd2c1c8b.mo97563x10d4786c());
            this.f48258xfd2c1c8b = null;
        }
        synchronized (this.f48276xae37fa9c) {
            com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderWrapper decoderWrapper = this.f48275xac8311d1;
            if (decoderWrapper != null) {
                decoderWrapper.m97740x41012807();
                this.f48275xac8311d1 = null;
            }
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f48260x562c7f74;
        if (c25734xcdff9c14 != null && c25734xcdff9c14.m97194x3a00ef33() != null) {
            this.f48260x562c7f74.m97194x3a00ef33().m97285x41012807();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c142 = this.f48277x472c0e3a;
        if (c25734xcdff9c142 != null && (c25734xcdff9c142 instanceof com.p314xaae8f345.tav.p2959x5befac44.C25758x23ea9f0c) && ((com.p314xaae8f345.tav.p2959x5befac44.C25758x23ea9f0c) c25734xcdff9c142).m97433xe94b10e5() != null) {
            ((com.p314xaae8f345.tav.p2959x5befac44.C25758x23ea9f0c) this.f48277x472c0e3a).m97433xe94b10e5().m97759x41012807();
        }
        this.f48274xbe97f590.d(TAG, "release: finish");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96673x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
        mo96674x68ac462(surfaceCreator, null);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96674x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f48274xbe97f590.d(TAG, "VideoDecoderTrack start:" + c25738xead39d26);
        if (this.f48281x3eef47a0.size() == 0) {
            mo96661x41012807();
            return;
        }
        this.f48272xafdb8087 = false;
        this.f48282x8eeb4081 = true;
        this.f48283xbb66febf = surfaceCreator;
        this.f48280x1ea6215f = -1;
        this.f48268xbeec636e.start();
        m97707x55684def(c25738xead39d26);
        m97726xc63804c0(true);
        this.f48274xbe97f590.d(TAG, "VideoDecoderTrack start finish:");
    }

    /* renamed from: createSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97715x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48258xfd2c1c8b;
        if (interfaceC25770x60526e32 instanceof com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369) {
            return m97714x607ae9a6(c25735x289c723d, this.f48283xbb66febf.mo97552x6eb64fe4(this.f48256xe2224a6d), z17);
        }
        return m97713x607ae9a6(c25735x289c723d, interfaceC25770x60526e32 == null ? null : interfaceC25770x60526e32.mo97559x3a00ef33(), z17);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97730x2cf2622b;
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14;
        m97724x9c66f99e("readSample: start expectFrameTime = " + c25736x76b98a57);
        if (this.f48272xafdb8087) {
            m97728x9132563d();
            return m97712x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L));
        }
        if (c25736x76b98a57.m97222xf922bec1(mo96653x51e8b0a())) {
            m97728x9132563d();
            return m97712x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        if (this.f48262x45b354ba) {
            this.f48274xbe97f590.w(TAG, "skip this frame by decode error, expectFrameTime = " + c25736x76b98a57);
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -201, "", this.f48263x22f9aa01));
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c142 = this.f48260x562c7f74;
        if (c25734xcdff9c142 != null && c25734xcdff9c142.m97195xfb85bb43().m97232x31040141() >= 0 && this.f48260x562c7f74.m97194x3a00ef33() != null && !this.f48260x562c7f74.m97195xfb85bb43().m97238x9f3f7b48(c25736x76b98a57)) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
            this.f48273x8ad81491 = c25735x289c723d;
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97713x607ae9a6 = m97713x607ae9a6(c25735x289c723d, this.f48260x562c7f74.m97194x3a00ef33(), false);
            m97713x607ae9a6.m97193x75286adb().f47857xa7c31030.f47837x68ac2fe = com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.DECODE_JUMP;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48274xbe97f590;
            java.lang.String str = TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip frame by jump, expectFrameTime = ");
            sb6.append(c25736x76b98a57);
            sb6.append(" currentFrame = ");
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c143 = this.f48260x562c7f74;
            sb6.append(c25734xcdff9c143 == null ? com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f : c25734xcdff9c143.m97195xfb85bb43());
            c25799x4a77fd1.i(str, sb6.toString());
            return m97713x607ae9a6;
        }
        m97724x9c66f99e("readSample: step 1 ");
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add = c25736x76b98a57.sub(this.f48270xef5b9e21).add(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, c25736x76b98a57.f47868x17e7e7d));
        if (m97719x4019180b(c25736x76b98a57, false) == this.f48280x1ea6215f && (c25734xcdff9c14 = this.f48277x472c0e3a) != null && c25734xcdff9c14.m97193x75286adb().m97206x8311a768() >= 0 && this.f48265xb7f3ee48 == com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Video) {
            synchronized (this.f48278xe62474f5) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c144 = this.f48277x472c0e3a;
                if (c25734xcdff9c144 == null || c25734xcdff9c144.m97193x75286adb().m97206x8311a768() < -1 || (this.f48277x472c0e3a.m97194x3a00ef33() == null && this.f48277x472c0e3a.m97192x1d62828() == null)) {
                    m97724x9c66f99e("readSample:" + add + " nextFrame not hit time");
                    this.f48277x472c0e3a = m97717xe881a9cb(add);
                }
            }
        } else {
            m97724x9c66f99e("readSample:" + add + " nextFrame not hit");
            if (m97719x4019180b(c25736x76b98a57, false) != this.f48280x1ea6215f) {
                this.f48277x472c0e3a = m97717xe881a9cb(c25736x76b98a57);
            } else {
                this.f48277x472c0e3a = m97717xe881a9cb(add);
            }
        }
        m97724x9c66f99e("readSample: step 2 ");
        boolean m97725xde2181f0 = m97725xde2181f0(this.f48260x562c7f74, this.f48277x472c0e3a, c25736x76b98a57);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd12 = this.f48274xbe97f590;
        java.lang.String str2 = TAG;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("readSample: needSwitch: ");
        sb7.append(m97725xde2181f0);
        sb7.append(" expectFrameTime = ");
        sb7.append(c25736x76b98a57);
        sb7.append(" currentFrame = ");
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c145 = this.f48260x562c7f74;
        sb7.append(c25734xcdff9c145 == null ? com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f : c25734xcdff9c145.m97195xfb85bb43());
        sb7.append("  nextFrame = ");
        sb7.append(this.f48277x472c0e3a);
        c25799x4a77fd12.m97814x5d2a96d(str2, sb7.toString());
        if (m97725xde2181f0 && (m97730x2cf2622b = m97730x2cf2622b()) != null) {
            return m97730x2cf2622b;
        }
        m97724x9c66f99e("readSample: step 3 ");
        m97710xd9a1e335(this.f48280x1ea6215f);
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d2 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
        this.f48273x8ad81491 = c25735x289c723d2;
        c25735x289c723d2.f47857xa7c31030 = this.f48260x562c7f74.m97193x75286adb().f47857xa7c31030;
        m97724x9c66f99e("readSample: step 4 ");
        return m97716x607ae9a6(m97725xde2181f0);
    }

    /* renamed from: createSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97711x607ae9a6(long j17) {
        return m97712x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(j17));
    }

    /* renamed from: createSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97712x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25735x289c723d);
    }

    /* renamed from: createSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97714x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d, com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 c25785xac83bc40, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.C25758x23ea9f0c c25758x23ea9f0c = new com.p314xaae8f345.tav.p2959x5befac44.C25758x23ea9f0c(c25735x289c723d, c25785xac83bc40 == null ? null : c25785xac83bc40.m97757x3a00ef33(), z17);
        c25758x23ea9f0c.m97434x5cbc5e59(c25785xac83bc40);
        return c25758x23ea9f0c;
    }

    /* renamed from: createSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97713x607ae9a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, boolean z17) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25735x289c723d, c25745xc3945049, z17);
    }

    /* renamed from: createDecoder */
    private void m97709xe1d6cfa8(com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f, int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85;
        try {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator = this.f48283xbb66febf;
            if (surfaceCreator == null || (c25732x76648a85 = c25760x91f3af7f.f48014x35e001) == null) {
                return;
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderCreateThread decoderCreateThread = new com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762.DecoderCreateThread(c25760x91f3af7f, surfaceCreator.mo97549x718480d0((int) c25732x76648a85.f47833x6be2dc6, (int) c25732x76648a85.f47832xb7389127, c25760x91f3af7f.f48011xcc7d15ae), i17);
            this.f48266xb6fca88a = decoderCreateThread;
            decoderCreateThread.start();
        } catch (java.lang.Exception e17) {
            this.f48274xbe97f590.e(TAG, "createNextDecoder: try start DecoderCreateThread", e17);
        }
    }
}
