package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AudioCompositionDecoderTrack */
/* loaded from: classes16.dex */
public class C25669xd1aeed9b implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 {
    private static final java.lang.String TAG = "AudioCompositionDecoder";

    /* renamed from: _lastReadAudioBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f47419x4d3d6c0b;

    /* renamed from: audioCompositorMap */
    private java.util.HashMap<java.lang.Integer, com.p314xaae8f345.tav.p2947x2eaf9f.C25670x49b6bc57> f47420xba64c165;

    /* renamed from: audioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47421xb3299a4;

    /* renamed from: audioMix */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 f47422x3a2afaa6;

    /* renamed from: audioTracks */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> f47423x1bee07fe;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f47424x2d4a8826;

    /* renamed from: decoderStarted */
    private boolean f47425xfd4a979d;

    /* renamed from: decoderThread */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.DecoderThread f47426xbeec636e;

    /* renamed from: decoderTrackList */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d> f47427x7f6278a5;

    /* renamed from: logger */
    public com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f47428xbe97f590;

    /* renamed from: mAudioMixer */
    private com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3 f47429x3788ee20;

    /* renamed from: rate */
    private float f47430x354ce0;

    /* renamed from: volume */
    private float f47431xcfaae71a;

    /* renamed from: com.tencent.tav.core.AudioCompositionDecoderTrack$DecoderThread */
    /* loaded from: classes16.dex */
    public class DecoderThread extends com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a.AbstractHandlerThreadC25817xd0622a0b {

        /* renamed from: NAME */
        private static final java.lang.String f47432x24728b = "AudioDecoderThread";

        /* renamed from: nextFrameDecoderLock */
        private final java.lang.Object f47433xe62474f5;

        /* renamed from: pcmFrame */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f47434xa59c80b3;

        public DecoderThread() {
            super(f47432x24728b);
            this.f47433xe62474f5 = new java.lang.Object();
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a.AbstractHandlerThreadC25817xd0622a0b
        /* renamed from: doAction */
        public void mo96678xf85da2a1() {
            synchronized (this.f47433xe62474f5) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.TAG, "doAction: start ");
                com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96645xe881a9cb = com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.this.m96645xe881a9cb();
                this.f47434xa59c80b3 = m96645xe881a9cb;
                if (m96645xe881a9cb.m97192x1d62828() != null) {
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f47434xa59c80b3;
                    c25734xcdff9c14.m97198xa5d2bd34(com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.this.m96658x756f483e(c25734xcdff9c14.m97192x1d62828(), com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.this.f47431xcfaae71a, com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.this.f47430x354ce0, com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.this.f47421xb3299a4));
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.TAG, "doAction: finish ");
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
        }
    }

    public C25669xd1aeed9b(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> list, int i17) {
        this(list, i17, null);
    }

    /* renamed from: createDecoderTrackSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m96643x477c3330(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 c25635x5b7fe258) {
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f;
        if (c25635x5b7fe258.m96174x7aab3243()) {
            c25760x91f3af7f = null;
        } else {
            c25760x91f3af7f = new com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f();
            c25760x91f3af7f.f48008x4e63cb35 = c25634xf527485b.m96160xabff72d6();
            c25760x91f3af7f.f48016xc060d3c6 = c25634xf527485b.m96163xfe2e0f70();
            c25760x91f3af7f.f48010x7f94e13e = c25634xf527485b.m96152x7f025288();
            c25760x91f3af7f.f48014x35e001 = c25634xf527485b.m96153x47007694();
            c25760x91f3af7f.f48012x5880ffeb = c25634xf527485b.m96157x6bdd61e1();
            c25760x91f3af7f.f48013xdb79bafb = c25634xf527485b.m96158xbfdb8cc5();
            c25760x91f3af7f.f48009x207cebed = (int) c25634xf527485b.m96155xe9bce1e7();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97240x2fa78b11 = c25635x5b7fe258.m96173x35b5540b().m97240x2fa78b11();
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97240x2fa78b11.m97260x75286aac(), m97240x2fa78b11.m97256x51e8b0a()), c25760x91f3af7f);
        c25761x99b6cdac.m97457xfd7a0d10(c25635x5b7fe258.m96172x61b08d48());
        return c25761x99b6cdac;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doReadSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96645xe881a9cb() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "doReadSample: start ");
        if (this.f47427x7f6278a5.isEmpty()) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "doReadSample:[finish] decoderTrackList.isEmpty ");
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L));
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d = this.f47427x7f6278a5.get(0);
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0 = c25755x80ee7e3d.mo96659xe121b2e0();
        if (mo96659xe121b2e0.m97193x75286adb().m97206x8311a768() < -1) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "doReadSample:[failed]");
            return mo96659xe121b2e0;
        }
        this.f47419x4d3d6c0b = mo96659xe121b2e0;
        java.nio.ByteBuffer m97192x1d62828 = mo96659xe121b2e0.m97192x1d62828();
        if (this.f47419x4d3d6c0b.m97192x1d62828() == null) {
            m97192x1d62828 = c25755x80ee7e3d.m97396xd0fc8b9f();
        }
        if (m97192x1d62828 != null) {
            m97192x1d62828.position(0);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(this.f47419x4d3d6c0b.m97195xfb85bb43(), m97192x1d62828);
        int size = this.f47427x7f6278a5.size() - 1;
        while (true) {
            c25736x76b98a57 = null;
            if (size <= 0) {
                break;
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d2 = this.f47427x7f6278a5.get(size);
            com.p314xaae8f345.tav.p2947x2eaf9f.C25670x49b6bc57 c25670x49b6bc57 = this.f47420xba64c165.get(java.lang.Integer.valueOf(c25755x80ee7e3d2.m97397xfe2e0f70()));
            if (c25670x49b6bc57 != null) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "doReadSample: readMergeSample " + size);
                com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6 = this.f47422x3a2afaa6;
                c25734xcdff9c14 = c25670x49b6bc57.m96682xef17908c(c25755x80ee7e3d2, c25671x3e055ec6 != null ? c25671x3e055ec6.m96685xf92a8602(c25755x80ee7e3d2.m97397xfe2e0f70()) : null, c25734xcdff9c14);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "doReadSample: readMergeSample finish " + size);
                if (c25734xcdff9c14 != null && c25734xcdff9c14.m97193x75286adb().m97206x8311a768() < -1) {
                    break;
                }
            } else {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "doReadSample: audioCompositorMap.get(decoderTrack.getTrackID(), return null!");
            }
            size--;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("doReadSample:[success]  ");
        if (c25734xcdff9c14 != null) {
            c25736x76b98a57 = c25734xcdff9c14.m97195xfb85bb43();
        }
        sb6.append(c25736x76b98a57);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, sb6.toString());
        return c25734xcdff9c14;
    }

    /* renamed from: initAudioDecodeTracks */
    private void m96646x6e9f87dc(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (this.f47423x1bee07fe == null) {
            return;
        }
        synchronized (this) {
            this.f47427x7f6278a5.clear();
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m96644x477c3330((com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b) null, new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25738xead39d26 == null ? mo96653x51e8b0a() : c25738xead39d26.m97256x51e8b0a()))));
        c25755x80ee7e3d.m97401x719f5ce4(0);
        c25755x80ee7e3d.mo96670xef2344c9(arrayList);
        c25755x80ee7e3d.mo96671x27f73e1c(0.0f);
        c25755x80ee7e3d.mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Audio);
        c25755x80ee7e3d.m97400x66f3cb62(this.f47421xb3299a4);
        this.f47427x7f6278a5.add(c25755x80ee7e3d);
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : this.f47423x1bee07fe) {
            if (c25634xf527485b.m96152x7f025288() == 2) {
                com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d2 = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d(this.f47424x2d4a8826);
                com.p314xaae8f345.tav.p2947x2eaf9f.C25670x49b6bc57 c25670x49b6bc57 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25670x49b6bc57(this.f47421xb3299a4);
                java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258> mo96159xbac98516 = c25634xf527485b.mo96159xbac98516();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 c25635x5b7fe258 : mo96159xbac98516) {
                    if (c25635x5b7fe258 instanceof com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) {
                        arrayList2.add(m96644x477c3330(c25634xf527485b, (com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) c25635x5b7fe258));
                    } else {
                        arrayList2.add(m96643x477c3330(c25634xf527485b, c25635x5b7fe258));
                    }
                }
                c25755x80ee7e3d2.m97401x719f5ce4(c25634xf527485b.m96163xfe2e0f70());
                c25755x80ee7e3d2.mo96670xef2344c9(arrayList2);
                c25755x80ee7e3d2.mo96667x7c3e1dab((int) c25634xf527485b.m96155xe9bce1e7());
                c25755x80ee7e3d2.mo96671x27f73e1c(c25634xf527485b.m96158xbfdb8cc5());
                c25755x80ee7e3d2.mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Audio);
                c25755x80ee7e3d2.m97400x66f3cb62(this.f47421xb3299a4);
                if (c25634xf527485b.m96161xdd1fba() != null) {
                    c25755x80ee7e3d2.mo96650x5b0b7d5a(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25634xf527485b.m96161xdd1fba().m97260x75286aac(), c25634xf527485b.m96161xdd1fba().m97256x51e8b0a()));
                }
                this.f47427x7f6278a5.add(c25755x80ee7e3d2);
                this.f47420xba64c165.put(java.lang.Integer.valueOf(c25634xf527485b.m96163xfe2e0f70()), c25670x49b6bc57);
            }
        }
    }

    /* renamed from: initAudioMix */
    private void m96647xc148b3d6() {
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> list = this.f47423x1bee07fe;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : this.f47423x1bee07fe) {
            if (c25634xf527485b != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.C25687xc3e1dfe8 c25687xc3e1dfe8 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25687xc3e1dfe8(c25634xf527485b, null);
                c25687xc3e1dfe8.m96796xaab1dbe3(c25634xf527485b.m96158xbfdb8cc5(), c25634xf527485b.m96161xdd1fba());
                arrayList.add(c25687xc3e1dfe8);
            }
        }
        this.f47422x3a2afaa6 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6(arrayList);
    }

    /* renamed from: addTrack */
    public synchronized void m96648xb5bac52a(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        this.f47423x1bee07fe.add(c25634xf527485b);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: asyncReadNextSample */
    public void mo96649xb8b7224f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "asyncReadNextSample: " + c25736x76b98a57);
        if (this.f47426xbeec636e.f47434xa59c80b3 == null) {
            synchronized (this.f47426xbeec636e.f47433xe62474f5) {
                if (this.f47426xbeec636e.f47434xa59c80b3 == null) {
                    this.f47426xbeec636e.m97940xab2f7e36();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: clipRangeAndClearRange */
    public void mo96650x5b0b7d5a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getCurrentSampleTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a() {
        return this.f47427x7f6278a5.get(0).mo96651x940ab53a();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96652xc291ccac() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        java.util.Iterator<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> it = this.f47423x1bee07fe.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96150x51e8b0a = it.next().mo96150x51e8b0a();
            if (mo96150x51e8b0a.m97222xf922bec1(c25736x76b98a57)) {
                c25736x76b98a57 = mo96150x51e8b0a;
            }
        }
        return c25736x76b98a57;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96654xacbb5a6b() {
        return com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameRate */
    public int mo96655x1fea5d37() {
        return 0;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getLaggingTime */
    public long mo96656x213de1e4() {
        return 0L;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getTrackId */
    public int mo96657xfe2e0f90() {
        return 0;
    }

    /* renamed from: processFrame */
    public synchronized java.nio.ByteBuffer m96658x756f483e(java.nio.ByteBuffer byteBuffer, float f17, float f18, com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f47429x3788ee20.m97432x66f3cb62(c25756x82a4b984.f47985x88751aa, c25756x82a4b984.f47983xf99d8dcc, c25756x82a4b984.f47984x2771c84d);
        return this.f47429x3788ee20.m97430x753a5f3c(byteBuffer, f18, f17, 1.0f);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0() {
        if (this.f47427x7f6278a5.size() == 0) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L));
        }
        synchronized (this.f47426xbeec636e.f47433xe62474f5) {
            if (this.f47426xbeec636e.f47434xa59c80b3 != null) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f47426xbeec636e.f47434xa59c80b3;
                this.f47426xbeec636e.f47434xa59c80b3 = null;
                return c25734xcdff9c14;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96645xe881a9cb = m96645xe881a9cb();
            if (m96645xe881a9cb != null && m96645xe881a9cb.m97192x1d62828() != null) {
                m96645xe881a9cb.m97198xa5d2bd34(m96658x756f483e(m96645xe881a9cb.m97192x1d62828(), this.f47431xcfaae71a, this.f47430x354ce0, this.f47421xb3299a4));
            }
            return m96645xe881a9cb;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: release */
    public synchronized void mo96661x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release: " + this);
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d> it = this.f47427x7f6278a5.iterator();
        while (it.hasNext()) {
            it.next().mo96661x41012807();
        }
        this.f47427x7f6278a5.clear();
        this.f47423x1bee07fe.clear();
        this.f47426xbeec636e.m97941x41012807();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release: finish" + this);
    }

    /* renamed from: removeTrack */
    public synchronized void m96662xede4bb27(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        this.f47423x1bee07fe.remove(c25634xf527485b);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: seekTo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "seekTo:[timeUs " + c25736x76b98a57 + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        synchronized (this.f47426xbeec636e.f47433xe62474f5) {
            this.f47426xbeec636e.f47434xa59c80b3 = null;
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d> it = this.f47427x7f6278a5.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d next = it.next();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "seekTo: " + next);
            next.mo96663xc9fc1b13(c25736x76b98a57, false, z18);
        }
        synchronized (this) {
            this.f47419x4d3d6c0b = null;
            java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25670x49b6bc57> it6 = this.f47420xba64c165.values().iterator();
            while (it6.hasNext()) {
                it6.next().m96680x5a5b64d();
            }
        }
        return null;
    }

    /* renamed from: setAudioInfo */
    public void m96664x66f3cb62(com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f47421xb3299a4 = c25756x82a4b984.m97415x5a5dd5d();
        this.f47429x3788ee20 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3(c25756x82a4b984.f47985x88751aa, c25756x82a4b984.f47983xf99d8dcc);
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d> it = this.f47427x7f6278a5.iterator();
        while (it.hasNext()) {
            it.next().m97400x66f3cb62(c25756x82a4b984);
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25670x49b6bc57> it6 = this.f47420xba64c165.values().iterator();
        while (it6.hasNext()) {
            it6.next().m96683x66f3cb62(c25756x82a4b984);
        }
    }

    /* renamed from: setAudioMix */
    public void m96665xb0bd9928(com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6) {
        this.f47422x3a2afaa6 = c25671x3e055ec6;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setDecodeType */
    public void mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType decodeType) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setFrameRate */
    public void mo96667x7c3e1dab(int i17) {
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d> it = this.f47427x7f6278a5.iterator();
        while (it.hasNext()) {
            it.next().mo96667x7c3e1dab(i17);
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setLogger */
    public void mo96668x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
    }

    /* renamed from: setRate */
    public void m96669x764f7c62(float f17) {
        this.f47430x354ce0 = f17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setTrackSegments */
    public void mo96670xef2344c9(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> list) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setVolume */
    public void mo96671x27f73e1c(float f17) {
        java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae> m96684xb3fb131e;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "setVolume: " + f17);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6 = this.f47422x3a2afaa6;
        if (c25671x3e055ec6 != null && (m96684xb3fb131e = c25671x3e055ec6.m96684xb3fb131e()) != null) {
            for (com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae c25672xf1d075ae : m96684xb3fb131e) {
                if (c25672xf1d075ae != null && (c25672xf1d075ae instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25687xc3e1dfe8)) {
                    ((com.p314xaae8f345.tav.p2947x2eaf9f.C25687xc3e1dfe8) c25672xf1d075ae).m96795xaab1dbe3(f17);
                }
            }
        }
        this.f47431xcfaae71a = f17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96672x68ac462() {
        mo96673x68ac462(null);
    }

    public C25669xd1aeed9b(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> list, int i17, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.f47423x1bee07fe = new java.util.ArrayList();
        this.f47427x7f6278a5 = new java.util.ArrayList<>();
        this.f47420xba64c165 = new java.util.HashMap<>();
        this.f47431xcfaae71a = 1.0f;
        this.f47430x354ce0 = 1.0f;
        this.f47425xfd4a979d = false;
        this.f47426xbeec636e = new com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.DecoderThread();
        this.f47429x3788ee20 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3();
        this.f47421xb3299a4 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984();
        this.f47428xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        this.f47424x2d4a8826 = interfaceC25650x9122a0cf;
        this.f47423x1bee07fe = list;
        m96646x6e9f87dc(null);
        m96647xc148b3d6();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96673x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
        mo96674x68ac462(surfaceCreator, null);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96674x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        int i17;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "start: " + c25738xead39d26);
        if (this.f47425xfd4a979d) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "start: " + this);
        this.f47426xbeec636e.start();
        m96646x6e9f87dc(c25738xead39d26);
        this.f47425xfd4a979d = true;
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262 = null;
        for (int i18 = 0; i18 < this.f47427x7f6278a5.size(); i18++) {
            if (i18 > 0 && i18 - 1 < this.f47423x1bee07fe.size()) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b = this.f47423x1bee07fe.get(i17);
                if (c25634xf527485b != null && c25634xf527485b.m96161xdd1fba() != null) {
                    c25738xead39d262 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25634xf527485b.m96161xdd1fba().m97260x75286aac(), c25634xf527485b.m96161xdd1fba().m97256x51e8b0a());
                }
            } else {
                c25738xead39d262 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, mo96653x51e8b0a());
            }
            this.f47427x7f6278a5.get(i18).mo96674x68ac462(null, c25738xead39d262);
        }
    }

    /* renamed from: createDecoderTrackSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m96644x477c3330(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212) {
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f;
        if (c25640x7df05212.m96174x7aab3243()) {
            c25760x91f3af7f = null;
        } else {
            c25760x91f3af7f = new com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f();
            c25760x91f3af7f.f48016xc060d3c6 = c25640x7df05212.m96185x83637b55();
            c25760x91f3af7f.f48010x7f94e13e = c25634xf527485b.m96152x7f025288();
            c25760x91f3af7f.f48008x4e63cb35 = c25640x7df05212.m96184xabff72d6();
            c25760x91f3af7f.f48012x5880ffeb = c25634xf527485b.m96157x6bdd61e1();
            c25760x91f3af7f.f48014x35e001 = c25634xf527485b.m96153x47007694();
            c25760x91f3af7f.f48009x207cebed = (int) c25634xf527485b.m96155xe9bce1e7();
            c25760x91f3af7f.f48013xdb79bafb = c25634xf527485b.m96158xbfdb8cc5();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97240x2fa78b11 = c25640x7df05212.m96173x35b5540b().m97240x2fa78b11();
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97240x2fa78b11.m97260x75286aac(), m97240x2fa78b11.m97256x51e8b0a()), c25760x91f3af7f);
        c25761x99b6cdac.m97457xfd7a0d10(c25640x7df05212.m96172x61b08d48());
        return c25761x99b6cdac;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return mo96659xe121b2e0();
    }

    public C25669xd1aeed9b(int i17) {
        this(i17, (com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf) null);
    }

    public C25669xd1aeed9b(int i17, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.f47423x1bee07fe = new java.util.ArrayList();
        this.f47427x7f6278a5 = new java.util.ArrayList<>();
        this.f47420xba64c165 = new java.util.HashMap<>();
        this.f47431xcfaae71a = 1.0f;
        this.f47430x354ce0 = 1.0f;
        this.f47425xfd4a979d = false;
        this.f47426xbeec636e = new com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b.DecoderThread();
        this.f47429x3788ee20 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3();
        this.f47421xb3299a4 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984();
        this.f47428xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        this.f47424x2d4a8826 = interfaceC25650x9122a0cf;
        m96646x6e9f87dc(null);
        m96647xc148b3d6();
    }
}
