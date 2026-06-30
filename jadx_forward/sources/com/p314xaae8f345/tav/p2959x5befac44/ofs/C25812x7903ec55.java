package com.p314xaae8f345.tav.p2959x5befac44.ofs;

/* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack */
/* loaded from: classes16.dex */
public class C25812x7903ec55 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 {

    /* renamed from: LOG_VERBOSE */
    public static boolean f48488x81d26f47 = false;

    /* renamed from: PRE_READ */
    public static boolean f48489xe33c6dd2 = true;
    private static final java.lang.String TAG = "OFSVDecoderTrack";

    /* renamed from: _outputSurface */
    private android.view.Surface f48490xe2224a6d;

    /* renamed from: currentDecoder */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 f48491xfd2c1c8b;

    /* renamed from: currentDecoderLock */
    private final java.lang.Object f48492x19891856;

    /* renamed from: currentSegmentStartTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48493xc76763f5;

    /* renamed from: decodeError */
    private boolean f48494x45b354ba;

    /* renamed from: decodeException */
    private java.lang.Exception f48495x22f9aa01;

    /* renamed from: decodeReporter */
    private final com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b f48496xb3470cef;

    /* renamed from: decoderCreateThread */
    private com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderCreateThread f48497xb6fca88a;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f48498x2d4a8826;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48499x89444d94;

    /* renamed from: isReleased */
    private boolean f48500xafdb8087;

    /* renamed from: lastSampleState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48501x8ad81491;

    /* renamed from: nextDecoder */
    private com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderWrapper f48502xac8311d1;

    /* renamed from: nextDecoderLock */
    private final java.lang.Object f48503xae37fa9c;

    /* renamed from: nextFrameDecoderLock */
    private final java.lang.Object f48504xe62474f5;

    /* renamed from: preReadReporters */
    private final java.util.ArrayList<com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b> f48506x78d004d9;

    /* renamed from: segmentIndex */
    private int f48507x1ea6215f;

    /* renamed from: started */
    private boolean f48509x8eeb4081;

    /* renamed from: surfaceCreator */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator f48510xbb66febf;

    /* renamed from: trackId */
    private final int f48511xc060d3c6;

    /* renamed from: videoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f48512xaffe922f;

    /* renamed from: outputFrameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48505xc9181ea0 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1, 30);

    /* renamed from: segments */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> f48508x3eef47a0 = new java.util.ArrayList<>();

    /* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack$DecoderCreateThread */
    /* loaded from: classes16.dex */
    public class DecoderCreateThread extends java.lang.Thread {

        /* renamed from: outputSurface */
        private android.view.Surface f48513x10d4786c;

        /* renamed from: segmentIndex */
        private int f48514x1ea6215f;

        /* renamed from: videoAsset */
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f f48516x9dea7b35;

        /* renamed from: checkCreateDecoder */
        private void m97934xfc8780() {
            if (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1 == null || !com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97990xbf249754(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.f48518xf0edce24, this.f48516x9dea7b35)) {
                if (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1 == null) {
                    m97935xe1d6cfa8();
                    return;
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, "DecoderCreateThread create - " + this.f48516x9dea7b35.f48008x4e63cb35);
                if (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.f48517x5befac44 != null && com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.f48517x5befac44 != com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48491xfd2c1c8b) {
                    m97936xcbfe174a();
                }
                m97935xe1d6cfa8();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: createDecoder */
        private void m97935xe1d6cfa8() {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 c25811xac414296;
            if (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48508x3eef47a0 == null || this.f48514x1ea6215f >= com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48508x3eef47a0.size()) {
                return;
            }
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = null;
            java.lang.Object[] objArr = 0;
            try {
                android.view.Surface surface = this.f48513x10d4786c;
                com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f = this.f48516x9dea7b35;
                if (c25760x91f3af7f.f48015xbdc0e5f5 == 3) {
                    c25811xac414296 = new com.p314xaae8f345.tav.p2959x5befac44.C25771x8963c289();
                    try {
                        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.m97920x30166c(surface);
                        c25811xac414296.mo97560x316510(this.f48516x9dea7b35.f48008x4e63cb35, com.p314xaae8f345.tav.p2959x5befac44.C25771x8963c289.f48108x3bfe9eae, null);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        interfaceC25770x60526e32 = c25811xac414296;
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, "createDecoder: ", e);
                        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.m97930xce1bc0d8(interfaceC25770x60526e32);
                        return;
                    }
                } else {
                    c25811xac414296 = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296(c25760x91f3af7f.f48008x4e63cb35, (com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719) com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48510xbb66febf, surface, com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48510xbb66febf.mo97552x6eb64fe4(this.f48513x10d4786c), com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48498x2d4a8826, com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48512xaffe922f, com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48505xc9181ea0);
                }
                c25811xac414296.mo97370x68ac462(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.m97922xb371dafd(this.f48514x1ea6215f).m97455xdd1fba(), com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.m97922xb371dafd(this.f48514x1ea6215f).m97453x7cd3f1e1());
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55 c25812x7903ec55 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this;
                c25812x7903ec55.f48502xac8311d1 = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderWrapper();
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.f48519x10d4786c = surface;
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.f48517x5befac44 = c25811xac414296;
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.f48518xf0edce24 = this.f48516x9dea7b35;
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.f48520x1ea6215f = this.f48514x1ea6215f;
                ((com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b) com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48506x78d004d9.get(this.f48514x1ea6215f)).add(c25811xac414296.mo97558x15b5cd10());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, "DecoderCreateThread success - " + this.f48516x9dea7b35.f48008x4e63cb35);
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        }

        /* renamed from: releaseNextDecoder */
        private void m97936xcbfe174a() {
            synchronized (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48503xae37fa9c) {
                if (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1 != null) {
                    com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1.m97938x41012807();
                    com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48502xac8311d1 = null;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DecoderCreateThread start - ");
            sb6.append(this.f48516x9dea7b35.f48008x4e63cb35);
            sb6.append(" - ");
            sb6.append(this.f48513x10d4786c != null);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, sb6.toString());
            if (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48500xafdb8087) {
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48497xb6fca88a = null;
                return;
            }
            synchronized (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48503xae37fa9c) {
                m97934xfc8780();
            }
            com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48497xb6fca88a = null;
            if (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.f48500xafdb8087) {
                m97936xcbfe174a();
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, "DecoderCreateThread finish - " + this.f48516x9dea7b35.f48008x4e63cb35);
        }

        private DecoderCreateThread(com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f, android.view.Surface surface, int i17) {
            super("DecoderCreateThread " + c25760x91f3af7f.f48008x4e63cb35);
            this.f48516x9dea7b35 = c25760x91f3af7f;
            this.f48513x10d4786c = surface;
            this.f48514x1ea6215f = i17;
        }
    }

    /* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack$DecoderWrapper */
    /* loaded from: classes16.dex */
    public class DecoderWrapper {

        /* renamed from: decoder */
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 f48517x5befac44;

        /* renamed from: extractor */
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f f48518xf0edce24;

        /* renamed from: outputSurface */
        android.view.Surface f48519x10d4786c;

        /* renamed from: segmentIndex */
        int f48520x1ea6215f;

        private DecoderWrapper() {
            this.f48520x1ea6215f = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: release */
        public void m97938x41012807() {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, "Video DecoderWrapper release: ");
            com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.m97930xce1bc0d8(this.f48517x5befac44);
        }
    }

    /* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack$ReleaseDecoderThread */
    /* loaded from: classes16.dex */
    public class ReleaseDecoderThread extends java.lang.Thread {

        /* renamed from: decoder */
        private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 f48522x5befac44;

        public ReleaseDecoderThread(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32) {
            super("ReleaseDecoderThread");
            this.f48522x5befac44 = interfaceC25770x60526e32;
        }

        /* renamed from: doRelease */
        private void m97939x999790fc() {
            if (this.f48522x5befac44 != null) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, "ReleaseDecoderThread start");
                this.f48522x5befac44.mo97565x41012807(true);
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.this.m97920x30166c(this.f48522x5befac44.mo97563x10d4786c());
                this.f48522x5befac44 = null;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.TAG, "ReleaseDecoderThread end");
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m97939x999790fc();
        }

        @Override // java.lang.Thread
        public void start() {
            if (!(this.f48522x5befac44 instanceof com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369)) {
                m97939x999790fc();
            }
            super.start();
        }
    }

    public C25812x7903ec55(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        java.util.ArrayList<com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b> arrayList = new java.util.ArrayList<>();
        this.f48506x78d004d9 = arrayList;
        this.f48507x1ea6215f = -1;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f48493xc76763f5 = c25736x76b98a57;
        this.f48501x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        this.f48497xb6fca88a = null;
        this.f48503xae37fa9c = new java.lang.Object();
        this.f48492x19891856 = new java.lang.Object();
        this.f48504xe62474f5 = new java.lang.Object();
        this.f48500xafdb8087 = false;
        this.f48499x89444d94 = c25736x76b98a57;
        this.f48510xbb66febf = null;
        this.f48496xb3470cef = new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b();
        this.f48509x8eeb4081 = false;
        this.f48494x45b354ba = false;
        this.f48495x22f9aa01 = null;
        this.f48498x2d4a8826 = interfaceC25650x9122a0cf;
        this.f48511xc060d3c6 = c25634xf527485b.m96163xfe2e0f70();
        java.util.List mo96159xbac98516 = c25634xf527485b.mo96159xbac98516();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.clear();
        java.util.Iterator it = mo96159xbac98516.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(c25634xf527485b, (com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258) it.next()));
            this.f48506x78d004d9.add(new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b());
        }
        mo96670xef2344c9(arrayList2);
        mo96667x7c3e1dab(mo96655x1fea5d37() > 0 ? mo96655x1fea5d37() : (int) c25634xf527485b.m96155xe9bce1e7());
        mo96671x27f73e1c(c25634xf527485b.m96158xbfdb8cc5());
        mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Video);
        if (c25634xf527485b.m96161xdd1fba() != null) {
            mo96650x5b0b7d5a(c25634xf527485b.m96161xdd1fba().m97252x5a5dd5d());
        }
    }

    /* renamed from: ceilAlignToOutputFrameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97910x69000f05(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return this.f48505xc9181ea0.m97236x636d539((int) java.lang.Math.ceil(c25736x76b98a57.m97231x793685bc() / this.f48505xc9181ea0.m97231x793685bc()));
    }

    /* renamed from: clipRangeAndRemoveRange */
    private void m97911x55684def(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null || c25738xead39d26.m97257x37a7fb48() <= 0 || this.f48508x3eef47a0.isEmpty()) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        int m97919x4019180b = m97919x4019180b(m97260x75286aac, false);
        if (m97919x4019180b == -1) {
            return;
        }
        int m97919x4019180b2 = m97919x4019180b(m97258xb58839a5, false);
        if (m97919x4019180b2 == -1) {
            m97919x4019180b2 = this.f48508x3eef47a0.size() - 1;
        } else if (m97924x8b1fdbd2(m97919x4019180b2) == m97258xb58839a5) {
            m97919x4019180b2--;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97924x8b1fdbd2 = m97924x8b1fdbd2(m97919x4019180b);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97924x8b1fdbd22 = m97924x8b1fdbd2(m97919x4019180b2);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97922xb371dafd = m97922xb371dafd(m97919x4019180b);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97922xb371dafd2 = m97922xb371dafd(m97919x4019180b2);
        if (m97922xb371dafd2.m97455xdd1fba().m97257x37a7fb48() > 0 && !m97924x8b1fdbd2(m97919x4019180b2 + 1).m97238x9f3f7b48(c25738xead39d26.m97258xb58839a5())) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = c25738xead39d26.m97258xb58839a5().sub(m97924x8b1fdbd22);
            m97922xb371dafd2.m97458x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97922xb371dafd2.m97455xdd1fba().m97260x75286aac(), sub.m97226xb0a37c79((((float) m97922xb371dafd2.m97454x3583a504().m97232x31040141()) * 1.0f) / ((float) m97922xb371dafd2.m97455xdd1fba().m97257x37a7fb48()))));
            m97922xb371dafd2.m97457xfd7a0d10(sub);
        }
        if (m97922xb371dafd.m97455xdd1fba().m97257x37a7fb48() > 0) {
            float m97232x31040141 = (((float) m97922xb371dafd.m97454x3583a504().m97232x31040141()) * 1.0f) / ((float) m97922xb371dafd.m97455xdd1fba().m97257x37a7fb48());
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub2 = c25738xead39d26.m97260x75286aac().sub(m97924x8b1fdbd2);
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97226xb0a37c79 = sub2.m97226xb0a37c79(m97232x31040141);
            m97922xb371dafd.m97458x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97922xb371dafd.m97455xdd1fba().m97260x75286aac().add(m97226xb0a37c79), m97922xb371dafd.m97455xdd1fba().m97256x51e8b0a().sub(m97226xb0a37c79)));
            m97922xb371dafd.m97457xfd7a0d10(m97922xb371dafd.m97454x3583a504().sub(sub2));
        }
        for (int size = this.f48508x3eef47a0.size() - 1; size >= 0; size--) {
            if (size > m97919x4019180b2 || size < m97919x4019180b) {
                this.f48508x3eef47a0.remove(size);
            }
        }
        if (m97924x8b1fdbd2(m97919x4019180b2 + 1).m97238x9f3f7b48(c25738xead39d26.m97258xb58839a5())) {
            this.f48508x3eef47a0.add(new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m97258xb58839a5.sub(m97922xb371dafd2.m97454x3583a504().add(m97924x8b1fdbd22))), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
        m97931x87b54eaf();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:18|(4:22|74|43|44)|(2:48|49)|(2:51|(12:53|54|55|56|57|(5:91|92|94|95|96)(4:59|60|61|62)|63|64|65|66|68|69))|105|55|56|57|(0)(0)|63|64|65|66|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:18|(4:22|74|43|44)|48|49|(2:51|(12:53|54|55|56|57|(5:91|92|94|95|96)(4:59|60|61|62)|63|64|65|66|68|69))|105|55|56|57|(0)(0)|63|64|65|66|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f3, code lost:
    
        r5.mo97565x41012807(true);
        m97920x30166c(r5.mo97563x10d4786c());
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d A[Catch: Exception -> 0x01cd, all -> 0x0218, TryCatch #2 {Exception -> 0x01cd, blocks: (B:49:0x0149, B:51:0x014d, B:53:0x0153), top: B:48:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c A[Catch: Exception -> 0x01c7, all -> 0x0218, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002a, B:16:0x003a, B:18:0x0040, B:20:0x004c, B:22:0x005a, B:23:0x0074, B:47:0x00cb, B:49:0x0149, B:51:0x014d, B:53:0x0153, B:56:0x0160, B:92:0x0165, B:95:0x016a, B:63:0x019d, B:66:0x01a3, B:72:0x01d1, B:75:0x0202, B:77:0x0206, B:79:0x020e, B:87:0x01ff, B:59:0x017c, B:62:0x0199, B:109:0x00cc, B:111:0x00e8, B:113:0x00f0, B:115:0x00f6, B:116:0x00f8, B:140:0x0148, B:118:0x00f9, B:120:0x00fd, B:122:0x0101, B:125:0x0105, B:127:0x010d, B:128:0x0118, B:131:0x012b, B:132:0x0141, B:136:0x0144, B:25:0x0075, B:27:0x0079, B:29:0x0081, B:32:0x0087, B:34:0x008f, B:35:0x009a, B:38:0x00ad, B:39:0x00c3, B:43:0x00c6, B:83:0x01f3), top: B:3:0x0007, inners: #3, #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202 A[Catch: all -> 0x0218, TryCatch #5 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002a, B:16:0x003a, B:18:0x0040, B:20:0x004c, B:22:0x005a, B:23:0x0074, B:47:0x00cb, B:49:0x0149, B:51:0x014d, B:53:0x0153, B:56:0x0160, B:92:0x0165, B:95:0x016a, B:63:0x019d, B:66:0x01a3, B:72:0x01d1, B:75:0x0202, B:77:0x0206, B:79:0x020e, B:87:0x01ff, B:59:0x017c, B:62:0x0199, B:109:0x00cc, B:111:0x00e8, B:113:0x00f0, B:115:0x00f6, B:116:0x00f8, B:140:0x0148, B:118:0x00f9, B:120:0x00fd, B:122:0x0101, B:125:0x0105, B:127:0x010d, B:128:0x0118, B:131:0x012b, B:132:0x0141, B:136:0x0144, B:25:0x0075, B:27:0x0079, B:29:0x0081, B:32:0x0087, B:34:0x008f, B:35:0x009a, B:38:0x00ad, B:39:0x00c3, B:43:0x00c6, B:83:0x01f3), top: B:3:0x0007, inners: #3, #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: createDecoder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 m97912xe1d6cfa8(com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac r20, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 r21) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.m97912xe1d6cfa8(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IVideoDecoder");
    }

    /* renamed from: createNextDecoder */
    private void m97914xd9a1e335(int i17) {
        int i18;
        java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> arrayList = this.f48508x3eef47a0;
        if (arrayList == null || !f48489xe33c6dd2 || (i18 = i17 + 1) >= arrayList.size() || this.f48497xb6fca88a != null) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f m97456x8c2b332b = m97922xb371dafd(i18).m97456x8c2b332b();
        if (m97456x8c2b332b != null) {
            com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderWrapper decoderWrapper = this.f48502xac8311d1;
            if (decoderWrapper == null || !com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97990xbf249754(decoderWrapper.f48518xf0edce24, m97456x8c2b332b)) {
                m97913xe1d6cfa8(m97456x8c2b332b, i18);
                return;
            }
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderWrapper decoderWrapper2 = this.f48502xac8311d1;
        if (decoderWrapper2 == null || decoderWrapper2.f48520x1ea6215f == i17) {
            return;
        }
        decoderWrapper2.f48517x5befac44.mo97369x68ac462(m97922xb371dafd(i17).m97455xdd1fba());
        this.f48502xac8311d1.f48520x1ea6215f = i17;
    }

    /* renamed from: createSampleBufferFromError */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97915x432cb578(long j17) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(j17));
    }

    /* renamed from: doReadSample */
    private synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97917xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return m97918xe881a9cb(c25736x76b98a57, false);
    }

    /* renamed from: findSegmentIndexAt */
    private int m97919x4019180b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        boolean z18;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> it = this.f48508x3eef47a0.iterator();
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97923x8966c095 = m97923x8966c095(it.next());
            if (c25736x76b98a57.m97225x38a73ce5(c25736x76b98a572) >= 0 && c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a572.add(m97923x8966c095))) {
                z19 = true;
                break;
            }
            c25736x76b98a572 = c25736x76b98a572.add(m97923x8966c095);
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
    public void m97920x30166c(android.view.Surface surface) {
        if (surface != null) {
            try {
                this.f48510xbb66febf.mo97550x30166c(surface);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: getCurrentSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97921x578dc70() {
        return m97922xb371dafd(this.f48507x1ea6215f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSegment */
    public com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97922xb371dafd(int i17) {
        return this.f48508x3eef47a0.get(i17);
    }

    /* renamed from: getSegmentAlignedScaledDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97923x8966c095(com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac) {
        return m97910x69000f05(c25761x99b6cdac.m97454x3583a504());
    }

    /* renamed from: getSegmentStartTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97924x8b1fdbd2(int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (int i18 = 0; i18 < i17 && i18 < this.f48508x3eef47a0.size(); i18++) {
            c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.add(c25736x76b98a57, m97923x8966c095(m97922xb371dafd(i18)));
        }
        return c25736x76b98a57;
    }

    /* renamed from: logVerbose */
    private void m97925x9c66f99e(java.lang.String str) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, str);
    }

    /* renamed from: nextSegment */
    private boolean m97926xc63804c0(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "nextSegment:" + z17);
        int i17 = this.f48507x1ea6215f + 1;
        this.f48507x1ea6215f = i17;
        this.f48490xe2224a6d = null;
        if (i17 >= this.f48508x3eef47a0.size()) {
            this.f48507x1ea6215f = -1;
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97924x8b1fdbd2 = m97924x8b1fdbd2(this.f48507x1ea6215f);
        this.f48493xc76763f5 = m97924x8b1fdbd2;
        this.f48501x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(m97924x8b1fdbd2);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97921x578dc70 = m97921x578dc70();
        if (m97921x578dc70.m97456x8c2b332b() != null) {
            synchronized (this.f48492x19891856) {
                com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48491xfd2c1c8b;
                if (interfaceC25770x60526e32 != null && interfaceC25770x60526e32.mo97358xabff72d6() != null) {
                    new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.ReleaseDecoderThread(this.f48491xfd2c1c8b).start();
                    this.f48491xfd2c1c8b = null;
                }
            }
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 m97912xe1d6cfa8 = m97912xe1d6cfa8(m97921x578dc70, z17 ? m97921x578dc70().m97453x7cd3f1e1() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
            synchronized (this.f48492x19891856) {
                this.f48491xfd2c1c8b = m97912xe1d6cfa8;
                if (m97912xe1d6cfa8 != null && m97912xe1d6cfa8.mo97359x7c8fed1()) {
                    if (z17) {
                        this.f48491xfd2c1c8b.mo97367xc9fc1b13(m97921x578dc70.m97453x7cd3f1e1());
                    }
                    this.f48490xe2224a6d = this.f48491xfd2c1c8b.mo97563x10d4786c();
                }
            }
        } else {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "nextSegment: videoAsset is null");
            synchronized (this.f48492x19891856) {
                if (this.f48491xfd2c1c8b != null) {
                    new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.ReleaseDecoderThread(this.f48491xfd2c1c8b).start();
                    this.f48491xfd2c1c8b = null;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nextSegment:");
        sb6.append(this.f48491xfd2c1c8b == null);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, sb6.toString());
        return true;
    }

    /* renamed from: release */
    private void m97927x41012807(android.view.Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: releaseDecoder */
    private void m97928x9132563d() {
        if (this.f48491xfd2c1c8b == null) {
            return;
        }
        synchronized (this.f48492x19891856) {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48491xfd2c1c8b;
            if (interfaceC25770x60526e32 != null && interfaceC25770x60526e32.mo97358xabff72d6() != null) {
                this.f48496xb3470cef.add(this.f48491xfd2c1c8b.mo97357xc291ccac());
                new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.ReleaseDecoderThread(this.f48491xfd2c1c8b).start();
                this.f48491xfd2c1c8b = null;
            }
        }
    }

    /* renamed from: segmentsDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97929x129c5954() {
        return m97924x8b1fdbd2(this.f48508x3eef47a0.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryReleaseDecoder */
    public void m97930xce1bc0d8(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32) {
        if (interfaceC25770x60526e32 != null) {
            try {
                interfaceC25770x60526e32.mo97565x41012807(true);
                m97920x30166c(interfaceC25770x60526e32.mo97563x10d4786c());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "tryReleaseDecoder Exception, ignore", e17);
            }
        }
    }

    /* renamed from: updateTotalDuration */
    private void m97931x87b54eaf() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> it = this.f48508x3eef47a0.iterator();
        while (it.hasNext()) {
            c25736x76b98a57 = c25736x76b98a57.add(m97923x8966c095(it.next()));
        }
        this.f48499x89444d94 = c25736x76b98a57;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: asyncReadNextSample */
    public synchronized void mo96649xb8b7224f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: clipRangeAndClearRange */
    public void mo96650x5b0b7d5a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null || c25738xead39d26.m97257x37a7fb48() <= 0 || this.f48508x3eef47a0.size() == 0) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97929x129c5954 = m97929x129c5954();
        m97911x55684def(c25738xead39d26);
        if (m97260x75286aac.m97233x754a37bb() != 0) {
            this.f48508x3eef47a0.add(0, new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m97260x75286aac), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
        if (m97258xb58839a5.m97232x31040141() < m97929x129c5954.m97232x31040141()) {
            this.f48508x3eef47a0.add(new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97258xb58839a5, new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97929x129c5954.m97231x793685bc() - m97258xb58839a5.m97231x793685bc())), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getCurrentSampleTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a() {
        return this.f48501x8ad81491.m97208xfb85bb43();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96652xc291ccac() {
        return this.f48496xb3470cef;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a() {
        if (this.f48499x89444d94 == com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f) {
            m97931x87b54eaf();
        }
        return this.f48499x89444d94;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96654xacbb5a6b() {
        return this.f48505xc9181ea0;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameRate */
    public int mo96655x1fea5d37() {
        return (int) (1.0f / this.f48505xc9181ea0.m97231x793685bc());
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getLaggingTime */
    public long mo96656x213de1e4() {
        long j17 = 0;
        for (int i17 = 1; i17 < this.f48506x78d004d9.size(); i17++) {
            j17 += java.lang.Math.max(0L, this.f48506x78d004d9.get(i17).m98298xda5cde1d() - (this.f48508x3eef47a0.get(i17).m97454x3583a504().m97232x31040141() / 1000));
        }
        return j17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getTrackId */
    public int mo96657xfe2e0f90() {
        return this.f48511xc060d3c6;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0() {
        if (this.f48501x8ad81491.m97210x5241396d()) {
            return mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
        }
        return mo96660xe121b2e0(this.f48501x8ad81491.m97208xfb85bb43().add(this.f48505xc9181ea0));
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: seekTo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18) {
        m97925x9c66f99e("seekTo:[time " + c25736x76b98a57 + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        synchronized (this) {
            if (this.f48509x8eeb4081 && !this.f48500xafdb8087) {
                int m97919x4019180b = m97919x4019180b(c25736x76b98a57, true);
                if (m97919x4019180b == -1) {
                    this.f48507x1ea6215f = -1;
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "seekTo: [failed] [index " + m97919x4019180b + "]");
                    return null;
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97924x8b1fdbd2 = m97924x8b1fdbd2(m97919x4019180b);
                if (this.f48507x1ea6215f != m97919x4019180b || this.f48491xfd2c1c8b == null) {
                    this.f48507x1ea6215f = m97919x4019180b - 1;
                    m97926xc63804c0(false);
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = c25736x76b98a57.sub(m97924x8b1fdbd2);
                com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97921x578dc70 = m97921x578dc70();
                com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48491xfd2c1c8b;
                if (interfaceC25770x60526e32 == null) {
                    this.f48501x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "seekTo: [failed] [currentDecoder == null]");
                    return null;
                }
                interfaceC25770x60526e32.mo97566xc9fc1b13(m97921x578dc70.m97453x7cd3f1e1().add(sub), z18);
                if (c25736x76b98a57.m97222xf922bec1(this.f48505xc9181ea0)) {
                    this.f48501x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57.sub(this.f48505xc9181ea0));
                } else {
                    this.f48501x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0 = z17 ? mo96659xe121b2e0() : null;
                m97925x9c66f99e("seekTo: [success] [lastSampleState " + this.f48501x8ad81491 + "] [sampleBuffer " + mo96659xe121b2e0 + "]");
                return mo96659xe121b2e0;
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "seekTo: [failed] [started " + this.f48509x8eeb4081 + "] [isReleased " + this.f48500xafdb8087 + "]");
            return null;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setDecodeType */
    public void mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType decodeType) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setFrameRate */
    public void mo96667x7c3e1dab(int i17) {
        this.f48505xc9181ea0 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(600 / i17, 600);
        m97931x87b54eaf();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setLogger */
    public void mo96668x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setTrackSegments */
    public void mo96670xef2344c9(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> list) {
        if (this.f48508x3eef47a0 == null) {
            this.f48508x3eef47a0 = new java.util.ArrayList<>();
        }
        this.f48508x3eef47a0.clear();
        this.f48508x3eef47a0.addAll(list);
    }

    /* renamed from: setVideoComposition */
    public void m97932xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f48512xaffe922f = c25706x7dc2d64f;
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

    /* renamed from: createSampleBufferFromError */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97916x432cb578(long j17, java.lang.String str, java.lang.Throwable th6) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97202x360047e(j17, str, th6));
    }

    /* renamed from: doReadSample */
    private synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97918xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo97564xe7f79baf;
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97915x432cb578;
        m97925x9c66f99e("doReadSample: step 1 ");
        if (this.f48500xafdb8087) {
            return m97915x432cb578(-100L);
        }
        if (c25736x76b98a57 == null) {
            return m97915x432cb578(-3L);
        }
        if (this.f48507x1ea6215f == -1) {
            if (this.f48501x8ad81491.m97206x8311a768() >= -1) {
                m97915x432cb578 = m97915x432cb578(-1L);
            } else {
                m97915x432cb578 = m97915x432cb578(-100L);
            }
            return m97915x432cb578;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m97921x578dc70 = m97921x578dc70();
        while (true) {
            m97925x9c66f99e("doReadSample: step 2 ");
            if (this.f48491xfd2c1c8b == null) {
                if (this.f48501x8ad81491.m97210x5241396d()) {
                    this.f48501x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
                } else {
                    this.f48501x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(this.f48501x8ad81491.m97208xfb85bb43().add(this.f48505xc9181ea0));
                }
                if (this.f48501x8ad81491.m97208xfb85bb43().m97238x9f3f7b48(this.f48493xc76763f5.add(m97923x8966c095(m97921x578dc70)))) {
                    return m97916x432cb578(-3L, "Failed to create decoder", null);
                }
                mo97564xe7f79baf = m97915x432cb578(-1L);
            } else {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97235x456b0497 = c25736x76b98a57.sub(this.f48493xc76763f5).m97235x456b0497(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
                if (!m97235x456b0497.m97238x9f3f7b48(m97923x8966c095(m97921x578dc70))) {
                    mo97564xe7f79baf = m97915x432cb578(-1L);
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add = m97235x456b0497.add(m97921x578dc70.m97453x7cd3f1e1());
                    com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48491xfd2c1c8b;
                    if (interfaceC25770x60526e32 == null) {
                        mo97564xe7f79baf = m97915x432cb578(-100L);
                    } else {
                        mo97564xe7f79baf = interfaceC25770x60526e32.mo97564xe7f79baf(add);
                    }
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readVideoSampleBuffer cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
            if (!mo97564xe7f79baf.m97193x75286adb().m97214x36f88ac9(-1)) {
                if (mo97564xe7f79baf.m97193x75286adb().m97206x8311a768() < 0) {
                    return mo97564xe7f79baf;
                }
                m97925x9c66f99e("doReadSample: step 3 ");
                com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97193x75286adb = mo97564xe7f79baf.m97193x75286adb();
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = m97193x75286adb.m97208xfb85bb43().sub(m97921x578dc70.m97453x7cd3f1e1());
                if (sub.m97222xf922bec1(m97921x578dc70.m97455xdd1fba().m97256x51e8b0a())) {
                    sub = m97921x578dc70.m97455xdd1fba().m97256x51e8b0a();
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(this.f48493xc76763f5.add(sub), m97193x75286adb.f47857xa7c31030);
                m97925x9c66f99e("readSample: currentTime = " + c25736x76b98a57 + "  sampleState = " + c25735x289c723d);
                return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25735x289c723d, mo97564xe7f79baf.m97194x3a00ef33());
            }
            if (z17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "async read finish , skip it!");
                return null;
            }
            if (!m97926xc63804c0(true)) {
                return m97915x432cb578(-1L);
            }
            m97921x578dc70 = m97921x578dc70();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: release */
    public synchronized void mo96661x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release: start " + this);
        this.f48500xafdb8087 = true;
        this.f48508x3eef47a0.clear();
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 interfaceC25770x60526e32 = this.f48491xfd2c1c8b;
        if (interfaceC25770x60526e32 != null) {
            this.f48496xb3470cef.add(interfaceC25770x60526e32.mo97357xc291ccac());
            this.f48491xfd2c1c8b.mo97565x41012807(true);
            m97927x41012807(this.f48491xfd2c1c8b.mo97563x10d4786c());
            this.f48491xfd2c1c8b = null;
        }
        synchronized (this.f48503xae37fa9c) {
            com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderWrapper decoderWrapper = this.f48502xac8311d1;
            if (decoderWrapper != null) {
                decoderWrapper.m97938x41012807();
                this.f48502xac8311d1 = null;
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release: finish");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96673x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
        mo96674x68ac462(surfaceCreator, null);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96674x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "VideoDecoderTrack start:" + c25738xead39d26);
        if (this.f48508x3eef47a0.size() == 0) {
            mo96661x41012807();
            return;
        }
        this.f48500xafdb8087 = false;
        this.f48509x8eeb4081 = true;
        this.f48510xbb66febf = surfaceCreator;
        this.f48507x1ea6215f = -1;
        m97911x55684def(c25738xead39d26);
        m97926xc63804c0(true);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "VideoDecoderTrack start finish:");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        m97925x9c66f99e("readSample: start expectFrameTime = " + c25736x76b98a57);
        if (this.f48500xafdb8087) {
            m97928x9132563d();
            return m97915x432cb578(-100L);
        }
        if (c25736x76b98a57.m97222xf922bec1(mo96653x51e8b0a())) {
            m97928x9132563d();
            return m97915x432cb578(-1L);
        }
        if (this.f48494x45b354ba) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(TAG, "skip this frame by decode error, expectFrameTime = " + c25736x76b98a57);
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -201, "", this.f48495x22f9aa01));
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97917xe881a9cb = m97917xe881a9cb(c25736x76b98a57);
        m97914xd9a1e335(this.f48507x1ea6215f);
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
        this.f48501x8ad81491 = c25735x289c723d;
        c25735x289c723d.f47857xa7c31030 = m97917xe881a9cb.m97193x75286adb().f47857xa7c31030;
        m97925x9c66f99e("readSample: step 4 ");
        return m97917xe881a9cb;
    }

    /* renamed from: createDecoder */
    private void m97913xe1d6cfa8(com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f, int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85;
        try {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator = this.f48510xbb66febf;
            if (surfaceCreator == null || (c25732x76648a85 = c25760x91f3af7f.f48014x35e001) == null) {
                return;
            }
            com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderCreateThread decoderCreateThread = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55.DecoderCreateThread(c25760x91f3af7f, surfaceCreator.mo97549x718480d0((int) c25732x76648a85.f47833x6be2dc6, (int) c25732x76648a85.f47832xb7389127, c25760x91f3af7f.f48011xcc7d15ae), i17);
            this.f48497xb6fca88a = decoderCreateThread;
            decoderCreateThread.start();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "createNextDecoder: try start DecoderCreateThread", e17);
        }
    }
}
