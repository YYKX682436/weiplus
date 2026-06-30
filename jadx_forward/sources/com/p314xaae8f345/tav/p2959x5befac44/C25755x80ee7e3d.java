package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.AudioDecoderTrack */
/* loaded from: classes16.dex */
public class C25755x80ee7e3d implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 {
    private static java.lang.String TAG = "AudioDecoderTrack";

    /* renamed from: _speed */
    private float f47941xa8a56348;

    /* renamed from: audioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47942xb3299a4;

    /* renamed from: audioMixer */
    private com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3 f47943x5b56f5d3;

    /* renamed from: currentDecoder */
    private com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae f47944xfd2c1c8b;

    /* renamed from: currentDecoderLock */
    private final java.lang.Object f47945x19891856;

    /* renamed from: currentSegmentStartTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47946xc76763f5;

    /* renamed from: decodeError */
    private boolean f47947x45b354ba;

    /* renamed from: decodeException */
    private java.lang.Exception f47948x22f9aa01;

    /* renamed from: decodeType */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType f47949xb7f3ee48;

    /* renamed from: decoderCreateThread */
    private com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.AudioDecoderCreateThread f47950xb6fca88a;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f47951x2d4a8826;

    /* renamed from: decoderThread */
    private final com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.DecoderThread f47952xbeec636e;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47953x89444d94;

    /* renamed from: emptyAudioBuffer */
    private java.nio.ByteBuffer f47954x29242429;

    /* renamed from: frameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47955xef5b9e21;

    /* renamed from: frameRate */
    private int f47956x207cebed;

    /* renamed from: isEmptyFrame */
    private boolean f47957x40e878ea;

    /* renamed from: isReleased */
    private boolean f47958xafdb8087;

    /* renamed from: lastSampleState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f47959x8ad81491;

    /* renamed from: nextDecoder */
    private com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.DecoderWrapper f47960xac8311d1;

    /* renamed from: nextDecoderLock */
    private final java.lang.Object f47961xae37fa9c;

    /* renamed from: preRead */
    private boolean f47962xecf876d9;

    /* renamed from: segmentIndex */
    private int f47963x1ea6215f;

    /* renamed from: segments */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> f47964x3eef47a0;

    /* renamed from: started */
    private boolean f47965x8eeb4081;

    /* renamed from: trackID */
    private int f47966xc060d3a6;

    /* renamed from: volume */
    private float f47967xcfaae71a;

    /* renamed from: com.tencent.tav.decoder.AudioDecoderTrack$AudioDecoderCreateThread */
    /* loaded from: classes16.dex */
    public class AudioDecoderCreateThread extends java.lang.Thread {

        /* renamed from: extractor */
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f f47968xf0edce24;

        /* renamed from: outputSurface */
        private android.view.Surface f47969x10d4786c;

        /* renamed from: segmentIndex */
        private int f47970x1ea6215f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [com.tencent.tav.decoder.AudioDecoderTrack$1] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13, types: [com.tencent.tav.decoder.IDecoder] */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.tencent.tav.decoder.IDecoder] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* renamed from: createDecoder */
        private void m97404xe1d6cfa8() {
            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d;
            com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae;
            if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47964x3eef47a0 == null || this.f47970x1ea6215f >= com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47964x3eef47a0.size() || com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47958xafdb8087 || android.text.TextUtils.isEmpty(this.f47968xf0edce24.f48008x4e63cb35)) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "createDecoder skip - " + this.f47968xf0edce24.f48008x4e63cb35);
                return;
            }
            ?? r27 = 0;
            r27 = 0;
            try {
                try {
                    try {
                        c25754x72d1fae = new com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae(this.f47968xf0edce24.f48008x4e63cb35, com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47951x2d4a8826);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
                try {
                    c25754x72d1fae.mo97370x68ac462(((com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac) com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47964x3eef47a0.get(this.f47970x1ea6215f)).m97455xdd1fba(), ((com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac) com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47964x3eef47a0.get(this.f47970x1ea6215f)).m97453x7cd3f1e1());
                    com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.DecoderWrapper();
                    com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.f47979x5befac44 = c25754x72d1fae;
                    com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.f47980xf0edce24 = this.f47968xf0edce24;
                    com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.f47981x1ea6215f = this.f47970x1ea6215f;
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "DecoderCreateThread success - " + this.f47968xf0edce24.f48008x4e63cb35);
                } catch (java.lang.Exception e18) {
                    e = e18;
                    r27 = c25754x72d1fae;
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "createDecoder", e);
                    if (r27 != 0) {
                        try {
                            r27.mo97365x41012807();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47958xafdb8087) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "createDecoder: released");
                        if (r27 != 0) {
                            try {
                                r27.mo97365x41012807();
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                        if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 != null) {
                            c25755x80ee7e3d = com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this;
                            c25755x80ee7e3d.f47960xac8311d1.m97413x41012807();
                        }
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    r27 = c25754x72d1fae;
                    if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47958xafdb8087) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "createDecoder: released");
                        if (r27 != 0) {
                            try {
                                r27.mo97365x41012807();
                            } catch (java.lang.Exception unused3) {
                            }
                        }
                        try {
                            if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 != null) {
                                com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.m97413x41012807();
                            }
                        } catch (java.lang.Exception unused4) {
                        }
                    }
                    throw th;
                }
                if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47958xafdb8087) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "createDecoder: released");
                    try {
                        c25754x72d1fae.mo97365x41012807();
                    } catch (java.lang.Exception unused5) {
                    }
                    if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 != null) {
                        c25755x80ee7e3d = com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this;
                        c25755x80ee7e3d.f47960xac8311d1.m97413x41012807();
                    }
                }
            } catch (java.lang.Exception unused6) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.String str = com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AudioDecoderCreateThread start - ");
            sb6.append(this.f47968xf0edce24.f48008x4e63cb35);
            sb6.append(" - ");
            sb6.append(this.f47969x10d4786c != null);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str, sb6.toString());
            if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47958xafdb8087) {
                com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47950xb6fca88a = null;
                return;
            }
            synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47961xae37fa9c) {
                if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 == null || !com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.m97391xbf249754(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.f47980xf0edce24, this.f47968xf0edce24)) {
                    if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 != null) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "AudioDecoderCreateThread create - " + this.f47968xf0edce24.f48008x4e63cb35);
                        if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.f47979x5befac44 != null && com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.f47979x5befac44 != com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47944xfd2c1c8b) {
                            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.m97413x41012807();
                            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 = null;
                        }
                        m97404xe1d6cfa8();
                    } else {
                        m97404xe1d6cfa8();
                    }
                }
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47950xb6fca88a = null;
            if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47958xafdb8087) {
                synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47961xae37fa9c) {
                    if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 != null) {
                        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1.m97413x41012807();
                        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47960xac8311d1 = null;
                    }
                }
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "AudioDecoderCreateThread finish - " + this.f47968xf0edce24.f48008x4e63cb35);
        }

        private AudioDecoderCreateThread(com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f, android.view.Surface surface, int i17) {
            super("AudioDCreateThread " + c25760x91f3af7f.f48008x4e63cb35);
            this.f47968xf0edce24 = c25760x91f3af7f;
            this.f47969x10d4786c = surface;
            this.f47970x1ea6215f = i17;
        }
    }

    /* renamed from: com.tencent.tav.decoder.AudioDecoderTrack$CacheBuffer */
    /* loaded from: classes16.dex */
    public static class CacheBuffer {

        /* renamed from: frameTime */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47972x207df1da;

        /* renamed from: preFrameTime */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47973xa479a677;

        /* renamed from: sampleBuffer */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f47974xe9bf8e8a;

        private CacheBuffer() {
        }
    }

    /* renamed from: com.tencent.tav.decoder.AudioDecoderTrack$DecoderThread */
    /* loaded from: classes16.dex */
    public class DecoderThread extends com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a.AbstractHandlerThreadC25817xd0622a0b {

        /* renamed from: NAME */
        private static final java.lang.String f47975x24728b = "AudioDecoderThread";

        /* renamed from: nextFrameDecoderLock */
        private final java.lang.Object f47976xe62474f5;

        /* renamed from: pcmFrame */
        private com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.CacheBuffer f47977xa59c80b3;

        public DecoderThread() {
            super(f47975x24728b);
            this.f47976xe62474f5 = new java.lang.Object();
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a.AbstractHandlerThreadC25817xd0622a0b
        /* renamed from: doAction */
        public void mo96678xf85da2a1() {
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14;
            synchronized (this.f47976xe62474f5) {
                if (this.f47977xa59c80b3 != null) {
                    if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47959x8ad81491.m97208xfb85bb43() == com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "doAction: CMTime.CMTimeZero");
                        c25734xcdff9c14 = com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.m97388xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
                    } else if (com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47959x8ad81491.m97208xfb85bb43().m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
                        c25734xcdff9c14 = null;
                    } else {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "doAction: lastSampleTime.add(frameDuration)");
                        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d = com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this;
                        c25734xcdff9c14 = c25755x80ee7e3d.m97388xe881a9cb(c25755x80ee7e3d.f47959x8ad81491.m97208xfb85bb43().add(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47955xef5b9e21));
                    }
                    if (c25734xcdff9c14 != null) {
                        if (c25734xcdff9c14.m97192x1d62828() != null) {
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "doAction: processFrame [volume " + com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47967xcfaae71a + "] [_speed " + com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47941xa8a56348 + "]");
                            c25734xcdff9c14.m97198xa5d2bd34(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.m97399x756f483e(c25734xcdff9c14.m97192x1d62828(), 1.0f, com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47941xa8a56348, com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.m97395xaa00aee()));
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "doAction: processFrame finish [volume " + com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47967xcfaae71a + "] [_speed " + com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47941xa8a56348 + "]");
                        }
                        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.CacheBuffer cacheBuffer = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.CacheBuffer();
                        this.f47977xa59c80b3 = cacheBuffer;
                        cacheBuffer.f47973xa479a677 = com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.this.f47959x8ad81491.m97208xfb85bb43();
                        this.f47977xa59c80b3.f47972x207df1da = c25734xcdff9c14.m97195xfb85bb43();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper */
    /* loaded from: classes16.dex */
    public static class DecoderWrapper {

        /* renamed from: decoder */
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb f47979x5befac44;

        /* renamed from: extractor */
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f f47980xf0edce24;

        /* renamed from: segmentIndex */
        int f47981x1ea6215f;

        private DecoderWrapper() {
            this.f47981x1ea6215f = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: release */
        public void m97413x41012807() {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "Audio DecoderWrapper release: ");
            try {
                com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb interfaceC25766x5e5e0fbb = this.f47979x5befac44;
                if (interfaceC25766x5e5e0fbb != null) {
                    interfaceC25766x5e5e0fbb.mo97365x41012807();
                }
            } catch (java.lang.Error | java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: com.tencent.tav.decoder.AudioDecoderTrack$ReleaseDecoderThread */
    /* loaded from: classes16.dex */
    public static class ReleaseDecoderThread extends java.lang.Thread {

        /* renamed from: decoder */
        private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb f47982x5befac44;

        public ReleaseDecoderThread(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb interfaceC25766x5e5e0fbb) {
            super("ReleaseDecoderThread");
            this.f47982x5befac44 = interfaceC25766x5e5e0fbb;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb interfaceC25766x5e5e0fbb = this.f47982x5befac44;
            if (interfaceC25766x5e5e0fbb != null) {
                interfaceC25766x5e5e0fbb.mo97365x41012807();
            }
        }
    }

    public C25755x80ee7e3d() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0195, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r9.f47964x3eef47a0.get(r5.f47981x1ea6215f) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r6.mo97370x68ac462(r10.m97455xdd1fba(), r10.m97453x7cd3f1e1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        r9.f47960xac8311d1 = null;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "hint decoder - audio  " + r6.mo97358xabff72d6());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00da, code lost:
    
        if (r9.f47964x3eef47a0.get(r5.f47981x1ea6215f) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00dc, code lost:
    
        r6.mo97370x68ac462(r10.m97455xdd1fba(), r10.m97453x7cd3f1e1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e7, code lost:
    
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.TAG, "hint decoder - audio  " + r6.mo97358xabff72d6() + ", segmentIndex: " + r9.f47963x1ea6215f + ", nextDecoder.segmentIndex: " + r9.f47960xac8311d1.f47981x1ea6215f);
        r9.f47960xac8311d1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011b, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127 A[SYNTHETIC] */
    /* renamed from: createDecoder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb m97386xe1d6cfa8(com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac r10, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 r11) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.m97386xe1d6cfa8(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IDecoder");
    }

    /* renamed from: createNextDecoder */
    private synchronized void m97387xd9a1e335(int i17) {
        java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> arrayList = this.f47964x3eef47a0;
        if (arrayList != null && this.f47962xecf876d9) {
            int i18 = i17 + 1;
            if (i18 >= arrayList.size()) {
                return;
            }
            if (this.f47950xb6fca88a == null) {
                com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f m97456x8c2b332b = this.f47964x3eef47a0.get(i18).m97456x8c2b332b();
                if (m97456x8c2b332b != null) {
                    com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.DecoderWrapper decoderWrapper = this.f47960xac8311d1;
                    if (decoderWrapper == null || !m97391xbf249754(decoderWrapper.f47980xf0edce24, m97456x8c2b332b)) {
                        try {
                            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.AudioDecoderCreateThread audioDecoderCreateThread = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.AudioDecoderCreateThread(m97456x8c2b332b, null, i18);
                            this.f47950xb6fca88a = audioDecoderCreateThread;
                            audioDecoderCreateThread.start();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "createNextDecoder", e17);
                        }
                    }
                } else if (this.f47960xac8311d1 != null && i17 >= 0 && i17 < this.f47964x3eef47a0.size()) {
                    com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.DecoderWrapper decoderWrapper2 = this.f47960xac8311d1;
                    if (decoderWrapper2.f47981x1ea6215f != i17) {
                        decoderWrapper2.f47979x5befac44.mo97369x68ac462(this.f47964x3eef47a0.get(i17).m97455xdd1fba());
                        this.f47960xac8311d1.f47981x1ea6215f = i17;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doReadSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97388xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        synchronized (this) {
            if (this.f47958xafdb8087) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "doReadSample: has released");
                return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97200x360047e = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
            this.f47957x40e878ea = false;
            int i17 = this.f47963x1ea6215f;
            if (i17 == -1) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "doReadSample: segmentIndex == -1");
                return this.f47959x8ad81491.m97206x8311a768() < -1 ? new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L)) : new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = this.f47964x3eef47a0.get(i17);
            while (true) {
                if (this.f47944xfd2c1c8b == null) {
                    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add = this.f47959x8ad81491.m97208xfb85bb43().add(this.f47955xef5b9e21);
                    if (this.f47959x8ad81491.m97210x5241396d()) {
                        add = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
                    }
                    if (add.m97238x9f3f7b48(this.f47946xc76763f5.add(c25761x99b6cdac.m97454x3583a504()))) {
                        this.f47957x40e878ea = true;
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "doReadSample: return emptyBuffer currentDecoder == null");
                        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(add, m97398xdb4114a1());
                    }
                } else {
                    m97200x360047e = this.f47959x8ad81491.m97208xfb85bb43().sub(this.f47946xc76763f5).m97236x636d539(this.f47941xa8a56348).m97222xf922bec1(c25761x99b6cdac.m97454x3583a504().m97236x636d539(this.f47941xa8a56348)) ? com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L) : this.f47944xfd2c1c8b.mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
                }
                java.nio.ByteBuffer byteBuffer = null;
                if (m97200x360047e.m97206x8311a768() != -1) {
                    if (m97200x360047e.m97206x8311a768() < 0) {
                        if (m97200x360047e.m97206x8311a768() == -3 || m97200x360047e.m97206x8311a768() == -100) {
                            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(m97200x360047e);
                        }
                        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(this.f47959x8ad81491);
                    }
                    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97226xb0a37c79 = m97200x360047e.m97208xfb85bb43().sub(c25761x99b6cdac.m97453x7cd3f1e1()).m97226xb0a37c79(this.f47941xa8a56348);
                    if (m97226xb0a37c79.m97232x31040141() > c25761x99b6cdac.m97454x3583a504().m97232x31040141()) {
                        m97226xb0a37c79 = c25761x99b6cdac.m97454x3583a504();
                    }
                    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(m97226xb0a37c79.add(this.f47946xc76763f5));
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "doReadSample: [success] " + c25735x289c723d);
                    com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae = this.f47944xfd2c1c8b;
                    if (c25754x72d1fae != null) {
                        byteBuffer = c25754x72d1fae.mo97362xdb4114a1();
                    }
                    return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25735x289c723d, byteBuffer);
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add2 = c25761x99b6cdac.m97454x3583a504().add(this.f47946xc76763f5);
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add3 = this.f47959x8ad81491.m97208xfb85bb43().add(this.f47955xef5b9e21);
                if (add2.m97222xf922bec1(add3)) {
                    com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae2 = this.f47944xfd2c1c8b;
                    java.nio.ByteBuffer m97396xd0fc8b9f = c25754x72d1fae2 == null ? m97396xd0fc8b9f() : c25754x72d1fae2.mo97362xdb4114a1();
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "doReadSample: finish && !end");
                    if (m97396xd0fc8b9f == null) {
                        m97396xd0fc8b9f = m97396xd0fc8b9f();
                    }
                    return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(add3, m97396xd0fc8b9f);
                }
                if (!m97392xc63804c0(true)) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "doReadSample: finish && end && next failed");
                    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97200x360047e2 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
                    com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae3 = this.f47944xfd2c1c8b;
                    if (c25754x72d1fae3 != null) {
                        byteBuffer = c25754x72d1fae3.mo97362xdb4114a1();
                    }
                    return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(m97200x360047e2, byteBuffer);
                }
                c25761x99b6cdac = this.f47964x3eef47a0.get(this.f47963x1ea6215f);
            }
        }
    }

    /* renamed from: findSegmentIndexAt */
    private int m97389x4019180b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        boolean z18;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> it = this.f47964x3eef47a0.iterator();
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

    /* renamed from: getSegmentStartTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97390x8b1fdbd2(int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (int i18 = 0; i18 < i17; i18++) {
            c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.add(c25736x76b98a57, this.f47964x3eef47a0.get(i18).m97454x3583a504());
        }
        return c25736x76b98a57;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSameExtractor */
    public static boolean m97391xbf249754(com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f, com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f2) {
        java.lang.String str;
        return (c25760x91f3af7f == null || c25760x91f3af7f2 == null || (str = c25760x91f3af7f.f48008x4e63cb35) == null || !str.equals(c25760x91f3af7f2.f48008x4e63cb35)) ? false : true;
    }

    /* renamed from: nextSegment */
    private boolean m97392xc63804c0(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "nextSegment:" + z17);
        int i17 = this.f47963x1ea6215f + 1;
        this.f47963x1ea6215f = i17;
        if (i17 >= this.f47964x3eef47a0.size()) {
            this.f47963x1ea6215f = -1;
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97390x8b1fdbd2 = m97390x8b1fdbd2(this.f47963x1ea6215f);
        this.f47946xc76763f5 = m97390x8b1fdbd2;
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(m97390x8b1fdbd2);
        this.f47959x8ad81491 = c25735x289c723d;
        if (c25735x289c723d.m97208xfb85bb43().m97229x22a7969a(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
            this.f47959x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = this.f47964x3eef47a0.get(this.f47963x1ea6215f);
        if (c25761x99b6cdac.m97456x8c2b332b() != null) {
            synchronized (this.f47945x19891856) {
                com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae = this.f47944xfd2c1c8b;
                if (c25754x72d1fae != null && c25754x72d1fae.mo97358xabff72d6() != null) {
                    new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.ReleaseDecoderThread(this.f47944xfd2c1c8b).start();
                    this.f47944xfd2c1c8b = null;
                }
            }
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb m97386xe1d6cfa8 = m97386xe1d6cfa8(c25761x99b6cdac, z17 ? this.f47964x3eef47a0.get(this.f47963x1ea6215f).m97453x7cd3f1e1() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
            synchronized (this.f47945x19891856) {
                this.f47944xfd2c1c8b = (com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae) m97386xe1d6cfa8;
                com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3 c25757xd228d1f3 = this.f47943x5b56f5d3;
                if (c25757xd228d1f3 != null) {
                    c25757xd228d1f3.m97431x41012807();
                }
                this.f47943x5b56f5d3 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3();
                com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae2 = this.f47944xfd2c1c8b;
                if (c25754x72d1fae2 != null && c25754x72d1fae2.mo97359x7c8fed1() && z17) {
                    this.f47944xfd2c1c8b.mo97367xc9fc1b13(c25761x99b6cdac.m97453x7cd3f1e1());
                }
            }
        } else {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "nextSegment: videoAsset is null");
            synchronized (this.f47945x19891856) {
                if (this.f47944xfd2c1c8b != null) {
                    new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.ReleaseDecoderThread(this.f47944xfd2c1c8b).start();
                    this.f47944xfd2c1c8b = null;
                }
            }
        }
        if (c25761x99b6cdac.m97454x3583a504().m97232x31040141() > 0) {
            this.f47941xa8a56348 = (((float) c25761x99b6cdac.m97455xdd1fba().m97257x37a7fb48()) * 1.0f) / ((float) c25761x99b6cdac.m97454x3583a504().m97232x31040141());
        }
        java.lang.String str = TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nextSegment:");
        sb6.append(this.f47944xfd2c1c8b == null);
        sb6.append(" ");
        sb6.append(this.f47941xa8a56348);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str, sb6.toString());
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: asyncReadNextSample */
    public void mo96649xb8b7224f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f47952xbeec636e.f47977xa59c80b3 == null) {
            synchronized (this.f47952xbeec636e) {
                if (this.f47952xbeec636e.f47977xa59c80b3 == null) {
                    this.f47952xbeec636e.m97940xab2f7e36();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: clipRangeAndClearRange */
    public void mo96650x5b0b7d5a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null || c25738xead39d26.m97257x37a7fb48() <= 0 || this.f47964x3eef47a0.size() == 0) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97394x89444d94 = m97394x89444d94();
        m97393x55684def(c25738xead39d26);
        if (m97260x75286aac.m97233x754a37bb() != 0) {
            this.f47964x3eef47a0.add(0, new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m97260x75286aac), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
        if (m97258xb58839a5.m97232x31040141() < m97394x89444d94.m97232x31040141()) {
            this.f47964x3eef47a0.add(new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97258xb58839a5, new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97394x89444d94.m97231x793685bc() - m97258xb58839a5.m97231x793685bc())), (com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f) null));
        }
    }

    /* renamed from: clipRangeAndRemoveRange */
    public void m97393x55684def(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null || c25738xead39d26.m97257x37a7fb48() <= 0 || this.f47964x3eef47a0.size() == 0) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        int m97389x4019180b = m97389x4019180b(m97260x75286aac, false);
        if (m97389x4019180b == -1) {
            return;
        }
        int m97389x4019180b2 = m97389x4019180b(m97258xb58839a5, false);
        if (m97389x4019180b2 == -1) {
            m97389x4019180b2 = this.f47964x3eef47a0.size() - 1;
        } else if (m97390x8b1fdbd2(m97389x4019180b2) == m97258xb58839a5) {
            m97389x4019180b2--;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97390x8b1fdbd2 = m97390x8b1fdbd2(m97389x4019180b);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97390x8b1fdbd22 = m97390x8b1fdbd2(m97389x4019180b2);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = this.f47964x3eef47a0.get(m97389x4019180b);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac2 = this.f47964x3eef47a0.get(m97389x4019180b2);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = c25738xead39d26.m97258xb58839a5().sub(m97390x8b1fdbd22);
        c25761x99b6cdac2.m97458x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25761x99b6cdac2.m97455xdd1fba().m97260x75286aac(), sub.m97226xb0a37c79((((float) c25761x99b6cdac2.m97454x3583a504().m97232x31040141()) * 1.0f) / ((float) c25761x99b6cdac2.m97455xdd1fba().m97257x37a7fb48()))));
        c25761x99b6cdac2.m97457xfd7a0d10(sub);
        float m97232x31040141 = (((float) c25761x99b6cdac.m97454x3583a504().m97232x31040141()) * 1.0f) / ((float) c25761x99b6cdac.m97455xdd1fba().m97257x37a7fb48());
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub2 = c25738xead39d26.m97260x75286aac().sub(m97390x8b1fdbd2);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97226xb0a37c79 = sub2.m97226xb0a37c79(m97232x31040141);
        c25761x99b6cdac.m97458x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25761x99b6cdac.m97455xdd1fba().m97260x75286aac().add(m97226xb0a37c79), c25761x99b6cdac.m97455xdd1fba().m97256x51e8b0a().sub(m97226xb0a37c79)));
        c25761x99b6cdac.m97457xfd7a0d10(c25761x99b6cdac.m97454x3583a504().sub(sub2));
        for (int size = this.f47964x3eef47a0.size() - 1; size >= 0; size--) {
            if (size > m97389x4019180b2 || size < m97389x4019180b) {
                this.f47964x3eef47a0.remove(size);
            }
        }
    }

    /* renamed from: duration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97394x89444d94() {
        return m97390x8b1fdbd2(this.f47964x3eef47a0.size());
    }

    /* renamed from: getAudioInfo */
    public com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 m97395xaa00aee() {
        com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae = this.f47944xfd2c1c8b;
        return c25754x72d1fae != null ? c25754x72d1fae.m97356xaa00aee() : this.f47942xb3299a4;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getCurrentSampleTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a() {
        return this.f47959x8ad81491.m97208xfb85bb43();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96652xc291ccac() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = this.f47953x89444d94;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        if (c25736x76b98a57 == c25736x76b98a572) {
            java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> it = this.f47964x3eef47a0.iterator();
            while (it.hasNext()) {
                c25736x76b98a572 = c25736x76b98a572.add(it.next().m97454x3583a504());
            }
            this.f47953x89444d94 = c25736x76b98a572;
        }
        return this.f47953x89444d94;
    }

    /* renamed from: getEmptyAudioBuffer */
    public java.nio.ByteBuffer m97396xd0fc8b9f() {
        if (this.f47954x29242429 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984 = this.f47942xb3299a4;
            long m97232x31040141 = ((c25756x82a4b984.f47983xf99d8dcc * c25756x82a4b984.f47985x88751aa) * this.f47955xef5b9e21.m97232x31040141()) / 1000000;
            int i17 = (int) m97232x31040141;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i17 * 2);
            this.f47954x29242429 = allocate;
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            short[] sArr = new short[i17];
            for (int i18 = 0; i18 < m97232x31040141; i18++) {
                sArr[i18] = 0;
            }
            this.f47954x29242429.asShortBuffer().put(sArr, 0, i17);
        }
        this.f47954x29242429.position(0);
        return this.f47954x29242429;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96654xacbb5a6b() {
        return this.f47955xef5b9e21;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameRate */
    public int mo96655x1fea5d37() {
        return this.f47956x207cebed;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getLaggingTime */
    public long mo96656x213de1e4() {
        return 0L;
    }

    /* renamed from: getTrackID */
    public int m97397xfe2e0f70() {
        return this.f47966xc060d3a6;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getTrackId */
    public int mo96657xfe2e0f90() {
        return this.f47966xc060d3a6;
    }

    /* renamed from: outputBuffer */
    public java.nio.ByteBuffer m97398xdb4114a1() {
        if (this.f47957x40e878ea) {
            return m97396xd0fc8b9f();
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae = this.f47944xfd2c1c8b;
        if (c25754x72d1fae == null) {
            return null;
        }
        return c25754x72d1fae.mo97362xdb4114a1();
    }

    /* renamed from: processFrame */
    public synchronized java.nio.ByteBuffer m97399x756f483e(java.nio.ByteBuffer byteBuffer, float f17, float f18, com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        if (this.f47943x5b56f5d3.m97428x8e9b588a() != c25756x82a4b984.f47983xf99d8dcc) {
            this.f47943x5b56f5d3.m97431x41012807();
            this.f47943x5b56f5d3 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3(c25756x82a4b984.f47985x88751aa, c25756x82a4b984.f47983xf99d8dcc);
        }
        return this.f47943x5b56f5d3.m97430x753a5f3c(byteBuffer, f18, f17, 1.0f);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0() {
        return mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: release */
    public synchronized void mo96661x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release: start ");
        this.f47952xbeec636e.m97941x41012807();
        this.f47958xafdb8087 = true;
        com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae = this.f47944xfd2c1c8b;
        if (c25754x72d1fae != null) {
            c25754x72d1fae.mo97365x41012807();
            this.f47944xfd2c1c8b = null;
        }
        synchronized (this.f47961xae37fa9c) {
            com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.DecoderWrapper decoderWrapper = this.f47960xac8311d1;
            if (decoderWrapper != null) {
                decoderWrapper.m97413x41012807();
                this.f47960xac8311d1 = null;
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release: finish ");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: seekTo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "seekTo:[time " + c25736x76b98a57 + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        if (this.f47958xafdb8087) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "seekTo: [failed] has released");
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        synchronized (this.f47952xbeec636e.f47976xe62474f5) {
            this.f47952xbeec636e.f47977xa59c80b3 = null;
        }
        if (!this.f47965x8eeb4081) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(TAG, "seekTo: [failed] un started, stack = " + android.util.Log.getStackTraceString(new java.lang.RuntimeException()));
            return null;
        }
        int m97389x4019180b = m97389x4019180b(c25736x76b98a57, true);
        if (m97389x4019180b == -1) {
            this.f47963x1ea6215f = -1;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "seekTo: [failed] segmentIndex = -1");
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97390x8b1fdbd2 = m97390x8b1fdbd2(m97389x4019180b);
        if (this.f47963x1ea6215f != m97389x4019180b || this.f47944xfd2c1c8b == null) {
            this.f47963x1ea6215f = m97389x4019180b - 1;
            m97392xc63804c0(false);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97236x636d539 = c25736x76b98a57.sub(m97390x8b1fdbd2).m97236x636d539(this.f47941xa8a56348);
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = this.f47964x3eef47a0.get(this.f47963x1ea6215f);
        com.p314xaae8f345.tav.p2959x5befac44.C25754x72d1fae c25754x72d1fae = this.f47944xfd2c1c8b;
        if (c25754x72d1fae == null) {
            if (c25736x76b98a57.m97222xf922bec1(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
                this.f47959x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
            } else {
                this.f47959x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "seekTo: [failed] currentDecoder == null ");
            return null;
        }
        c25754x72d1fae.mo97367xc9fc1b13(c25761x99b6cdac.m97453x7cd3f1e1().add(m97236x636d539));
        if (c25736x76b98a57.m97222xf922bec1(this.f47955xef5b9e21)) {
            this.f47959x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57.sub(this.f47955xef5b9e21));
        } else {
            this.f47959x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "seekTo: [success] [lastSampleState " + this.f47959x8ad81491 + "]");
        return null;
    }

    /* renamed from: setAudioInfo */
    public void m97400x66f3cb62(com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f47942xb3299a4 = c25756x82a4b984.m97415x5a5dd5d();
        if (this.f47954x29242429 != null) {
            this.f47954x29242429 = null;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setDecodeType */
    public void mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType decodeType) {
        this.f47949xb7f3ee48 = decodeType;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setFrameRate */
    public void mo96667x7c3e1dab(int i17) {
        this.f47955xef5b9e21 = this.f47955xef5b9e21.m97226xb0a37c79(i17 / this.f47956x207cebed);
        this.f47956x207cebed = i17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setLogger */
    public void mo96668x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
    }

    /* renamed from: setTrackID */
    public void m97401x719f5ce4(int i17) {
        this.f47966xc060d3a6 = i17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setTrackSegments */
    public void mo96670xef2344c9(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> list) {
        if (this.f47964x3eef47a0 == null) {
            this.f47964x3eef47a0 = new java.util.ArrayList<>();
        }
        this.f47964x3eef47a0.clear();
        this.f47964x3eef47a0.addAll(list);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setVolume */
    public void mo96671x27f73e1c(float f17) {
        this.f47967xcfaae71a = f17;
    }

    /* renamed from: speed */
    public float m97402x6890047() {
        return this.f47941xa8a56348;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96672x68ac462() {
        mo96673x68ac462(null);
    }

    public C25755x80ee7e3d(com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.f47962xecf876d9 = false;
        this.f47955xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(92880L, 1000000);
        this.f47956x207cebed = 11;
        this.f47967xcfaae71a = 1.0f;
        this.f47966xc060d3a6 = -1;
        this.f47964x3eef47a0 = new java.util.ArrayList<>();
        this.f47949xb7f3ee48 = com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Audio;
        this.f47963x1ea6215f = -1;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f47946xc76763f5 = c25736x76b98a57;
        this.f47959x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        this.f47950xb6fca88a = null;
        this.f47961xae37fa9c = new java.lang.Object();
        this.f47945x19891856 = new java.lang.Object();
        this.f47958xafdb8087 = false;
        this.f47952xbeec636e = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d.DecoderThread();
        this.f47943x5b56f5d3 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3();
        this.f47942xb3299a4 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984();
        this.f47957x40e878ea = false;
        this.f47947x45b354ba = false;
        this.f47948x22f9aa01 = null;
        this.f47941xa8a56348 = 1.0f;
        this.f47965x8eeb4081 = false;
        this.f47953x89444d94 = c25736x76b98a57;
        this.f47951x2d4a8826 = interfaceC25650x9122a0cf;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f47958xafdb8087) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "readSample: [error] has released");
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        if (this.f47947x45b354ba) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -202, "", this.f47948x22f9aa01));
        }
        synchronized (this.f47952xbeec636e.f47976xe62474f5) {
            if (this.f47952xbeec636e.f47977xa59c80b3 != null && this.f47952xbeec636e.f47977xa59c80b3.f47972x207df1da == this.f47959x8ad81491.m97208xfb85bb43()) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f47952xbeec636e.f47977xa59c80b3.f47974xe9bf8e8a;
                this.f47959x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(this.f47952xbeec636e.f47977xa59c80b3.f47972x207df1da);
                m97387xd9a1e335(this.f47963x1ea6215f);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample: [success] hit asyncRead - " + this.f47959x8ad81491);
                return c25734xcdff9c14;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97388xe881a9cb = m97388xe881a9cb(c25736x76b98a57);
            if (m97388xe881a9cb.m97192x1d62828() != null) {
                float f17 = this.f47941xa8a56348;
                if (f17 > 0.1f && f17 < 16.0f) {
                    m97388xe881a9cb.m97198xa5d2bd34(m97399x756f483e(m97388xe881a9cb.m97192x1d62828(), this.f47967xcfaae71a, this.f47941xa8a56348, m97395xaa00aee()));
                }
            }
            this.f47959x8ad81491 = m97388xe881a9cb.m97193x75286adb();
            m97387xd9a1e335(this.f47963x1ea6215f);
            return m97388xe881a9cb;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96673x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
        mo96674x68ac462(surfaceCreator, null);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96674x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (this.f47964x3eef47a0.size() == 0) {
            mo96661x41012807();
            return;
        }
        this.f47958xafdb8087 = false;
        this.f47952xbeec636e.start();
        this.f47965x8eeb4081 = true;
        this.f47963x1ea6215f = -1;
        m97393x55684def(c25738xead39d26);
        m97392xc63804c0(true);
    }
}
