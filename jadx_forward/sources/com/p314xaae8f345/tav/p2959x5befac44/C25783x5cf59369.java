package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.VideoDecoder */
/* loaded from: classes16.dex */
public class C25783x5cf59369 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 {

    /* renamed from: MAX_WAIT_TIME */
    private static final int f48216xf5307a1c = 1000;
    public final java.lang.String TAG;

    /* renamed from: allFrameTime */
    private java.util.List<java.lang.Long> f48217x61b6dd39;

    /* renamed from: bufferInfo */
    private android.media.MediaCodec.BufferInfo f48218x719a4d0e;

    /* renamed from: cropInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25782x9e08c8d9 f48219x7e51cb5e;

    /* renamed from: currentDecoderState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48220x17fed6c6;

    /* renamed from: currentStartState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48221xd9e053a8;

    /* renamed from: decodeReporter */
    private final com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b f48222xb3470cef;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f48223x2d4a8826;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48224x89444d94;

    /* renamed from: extractor */
    private com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f48225xf0edce24;

    /* renamed from: extractorDone */
    private boolean f48226xb72b3c6;

    /* renamed from: frameDurationUs */
    private long f48227x86eca49f;

    /* renamed from: isReleased */
    boolean f48228xafdb8087;

    /* renamed from: lastFrameValid */
    boolean f48229xfbcf7dc5;

    /* renamed from: lastOutputBufferIndex */
    private int f48230xb2824cbb;

    /* renamed from: logger */
    private com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f48231xbe97f590;

    /* renamed from: mLastVideoQueueTime */
    private long f48232xf8a550c6;

    /* renamed from: mTimeOffset */
    private long f48233x3dc8e0d;

    /* renamed from: mediaCodecWrapper */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb f48234xe0f0f5a1;

    /* renamed from: mediaFormat */
    private android.media.MediaFormat f48235xd571d8fb;

    /* renamed from: mirrorExtractor */
    private com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f48236x4a164925;

    /* renamed from: outputBuffer */
    private java.nio.ByteBuffer f48237xdb4114a1;

    /* renamed from: outputSurface */
    private android.view.Surface f48238x10d4786c;

    /* renamed from: pFrameTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48239x78118f4a;

    /* renamed from: pendingFrames */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.PendingFrame> f48240x2ba2d1d;

    /* renamed from: preReadCost */
    private long f48241x3bdf8646;

    /* renamed from: preReadTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48242x3be72946;

    /* renamed from: readSampleFinish */
    private boolean f48243xa0768393;

    /* renamed from: started */
    private boolean f48244x8eeb4081;

    /* renamed from: timeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48245x16fae70;

    /* renamed from: trackIndex */
    private int f48246x43ea5e47;

    /* renamed from: videoTexture */
    private com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 f48247xa2b86820;

    /* renamed from: com.tencent.tav.decoder.VideoDecoder$PendingFrame */
    /* loaded from: classes16.dex */
    public static class PendingFrame {

        /* renamed from: seekStartTime */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48249xff66a2b7;

        /* renamed from: timeOffset */
        private long f48250x27aa95c0;

        private PendingFrame() {
            this.f48250x27aa95c0 = 0L;
            this.f48249xff66a2b7 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        }
    }

    /* renamed from: com.tencent.tav.decoder.VideoDecoder$SampleTime */
    /* loaded from: classes16.dex */
    public class SampleTime {

        /* renamed from: sampleState */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48251x8795907;

        /* renamed from: timeUs */
        private long f48253xcbecde4b;

        private SampleTime() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: fixCMTime */
        public void m97683xf144f2ac() {
            if (this.f48251x8795907.m97208xfb85bb43().m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
                this.f48251x8795907 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.f48227x86eca49f));
            }
        }

        /* renamed from: toString */
        public java.lang.String m97684x9616526c() {
            return "SampleTime{sampleState=" + this.f48251x8795907 + ", timeUs=" + this.f48253xcbecde4b + '}';
        }
    }

    public C25783x5cf59369(java.lang.String str) {
        this(str, null, null, null, null);
    }

    /* renamed from: clearDecoder */
    private void m97657x5a844d37() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "clearDecoder " + mo97358xabff72d6());
        m97673xab26be48();
        if (this.f48240x2ba2d1d.size() != 0 || this.f48226xb72b3c6) {
            try {
                this.f48234xe0f0f5a1.mo96252x5d03b04();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "flushDecoder", e17);
            }
            this.f48240x2ba2d1d.clear();
        }
        this.f48220x17fed6c6 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
    }

    /* renamed from: createMirrorExtractor */
    private void m97658x3ee5c889() {
        new java.lang.Thread() { // from class: com.tencent.tav.decoder.VideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                    com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
                    c25820xcadb1d34.m97977x683d6267(com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.f48225xf0edce24.m97967xabff72d6());
                    while (c25820xcadb1d34.m97965x452c8b07() != -1) {
                        c25820xcadb1d34.m97982x5c729176(c25820xcadb1d34.m97965x452c8b07());
                    }
                    c25820xcadb1d34.m97975xc3b89af(com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(c25820xcadb1d34, "video/"));
                    c25820xcadb1d34.m97974xc9fc1b13(com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.f48245x16fae70 == null ? 0L : com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.f48245x16fae70.m97261xccb87a6a(), 0);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (c25820xcadb1d34.m97964xf6c90f8d() != -1) {
                        arrayList.add(java.lang.Long.valueOf(c25820xcadb1d34.m97964xf6c90f8d()));
                        c25820xcadb1d34.m97955xbc8da882();
                    }
                    com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.f48217x61b6dd39.addAll(arrayList);
                    com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.f48236x4a164925 = c25820xcadb1d34;
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.TAG, "Decoder: MirrorExtractor Init " + (android.os.SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.this.TAG, "createMirrorExtractor", e17);
                }
            }
        }.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x030a, code lost:
    
        r22.f48230xb2824cbb = r8;
        r2 = r22.f48234xe0f0f5a1.mo96255x3c33a717(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0312, code lost:
    
        if (r2 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0314, code lost:
    
        r2.position(r22.f48218x719a4d0e.offset);
        r6 = r22.f48218x719a4d0e;
        r2.limit(r6.offset + r6.size);
        r22.f48237xdb4114a1 = r2;
        r23.m97683xf144f2ac();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032b, code lost:
    
        r22.f48234xe0f0f5a1.mo96260xab26be48(r8, false);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(r22.TAG, "doReadFrames:[error] " + r22.f48218x719a4d0e.size + " byteBuffer==null");
        r23.f48251x8795907 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0356, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: doReadFrames */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m97659xd33cb8c7(com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.SampleTime r23, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.m97659xd33cb8c7(com.tencent.tav.decoder.VideoDecoder$SampleTime, com.tencent.tav.coremedia.CMTime, boolean):void");
    }

    /* renamed from: doReadSample */
    private synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97660xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        if (c25736x76b98a57.m97222xf922bec1(this.f48245x16fae70.m97256x51e8b0a()) && !z17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "doReadSample:[finish] targetTime.bigThan(timeRange.getDuration()) is" + c25736x76b98a57.m97222xf922bec1(this.f48245x16fae70.m97256x51e8b0a()) + "&& !justCache istrue");
            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
        }
        if (this.f48226xb72b3c6 && this.f48240x2ba2d1d.size() == 0 && this.f48245x16fae70.m97253x805f158c(c25736x76b98a57) && !this.f48243xa0768393) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "error state , and will go correct it ! ");
        }
        this.f48242x3be72946 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
        if (this.f48244x8eeb4081 && this.f48246x43ea5e47 != -1) {
            m97673xab26be48();
            com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.SampleTime sampleTime = new com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.SampleTime();
            sampleTime.f48251x8795907 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-2L);
            sampleTime.f48253xcbecde4b = -2L;
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                m97659xd33cb8c7(sampleTime, c25736x76b98a57, z17);
                this.f48222xb3470cef.add(java.lang.System.currentTimeMillis() - currentTimeMillis);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doReadSample:[success] " + this.f48226xb72b3c6 + " " + sampleTime.f48253xcbecde4b + "  " + sampleTime.f48251x8795907);
                return sampleTime.f48251x8795907;
            } catch (java.lang.Exception e17) {
                return m97664x315bdd74(e17);
            }
        }
        java.lang.String str = this.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReadSample:[unStart]  !started || trackIndex == -1 ");
        boolean z18 = true;
        sb6.append(!this.f48244x8eeb4081);
        sb6.append(" - ");
        if (this.f48246x43ea5e47 != -1) {
            z18 = false;
        }
        sb6.append(z18);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str, sb6.toString());
        return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L);
    }

    /* renamed from: hasPreReadAndFirstFrameSeek */
    private boolean m97661xea8c14d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return (c25736x76b98a57 != com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f || this.f48242x3be72946 == com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0 || this.f48230xb2824cbb == -1 || this.f48220x17fed6c6.m97210x5241396d()) ? false : true;
    }

    /* renamed from: initExtractor */
    private boolean m97662x4d873af4(java.lang.String str) {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        this.f48225xf0edce24 = c25820xcadb1d34;
        c25820xcadb1d34.m97977x683d6267(str);
        while (this.f48225xf0edce24.m97965x452c8b07() != -1) {
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d342 = this.f48225xf0edce24;
            c25820xcadb1d342.m97982x5c729176(c25820xcadb1d342.m97965x452c8b07());
        }
        int m97464x334942e1 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(this.f48225xf0edce24, "video/");
        this.f48246x43ea5e47 = m97464x334942e1;
        if (m97464x334942e1 != -1) {
            this.f48225xf0edce24.m97975xc3b89af(m97464x334942e1);
            return true;
        }
        this.f48238x10d4786c = null;
        this.f48237xdb4114a1 = null;
        return false;
    }

    /* renamed from: moreCloseCurrentThenSeek */
    private boolean m97663xbe6d70ab(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f48236x4a164925 == null) {
            return false;
        }
        long m97232x31040141 = this.f48220x17fed6c6.m97208xfb85bb43().m97232x31040141();
        this.f48236x4a164925.m97974xc9fc1b13(c25736x76b98a57.m97232x31040141(), 2);
        if (this.f48236x4a164925.m97964xf6c90f8d() > c25736x76b98a57.m97232x31040141()) {
            this.f48236x4a164925.m97974xc9fc1b13(c25736x76b98a57.m97232x31040141(), 0);
        }
        long m97964xf6c90f8d = this.f48236x4a164925.m97964xf6c90f8d();
        return m97964xf6c90f8d <= m97232x31040141 && this.f48220x17fed6c6.m97208xfb85bb43().m97232x31040141() >= m97964xf6c90f8d && this.f48220x17fed6c6.m97208xfb85bb43().m97232x31040141() < c25736x76b98a57.m97232x31040141() + this.f48239x78118f4a.m97232x31040141() && m97232x31040141 <= c25736x76b98a57.m97232x31040141();
    }

    /* renamed from: onReadFramesException */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97664x315bdd74(java.lang.Exception exc) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "onReadFramesException: ", exc);
        if (!(exc instanceof android.media.MediaCodec.CodecException)) {
            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L);
        }
        android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) exc;
        if (!codecException.isRecoverable()) {
            if (codecException.isTransient()) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "doReadSample:[error] isTransient() is true");
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "doReadSample:[error] retry failed");
            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L);
        }
        m97673xab26be48();
        this.f48234xe0f0f5a1.mo96261x6761d4f();
        this.f48230xb2824cbb = -1;
        this.f48240x2ba2d1d.clear();
        this.f48225xf0edce24.m97974xc9fc1b13(this.f48221xd9e053a8.m97208xfb85bb43().m97232x31040141() - this.f48245x16fae70.m97261xccb87a6a(), 0);
        this.f48226xb72b3c6 = false;
        return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L);
    }

    /* renamed from: preReadSample */
    private synchronized void m97665xdc9c91e3() {
        this.f48229xfbcf7dc5 = false;
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97660xe881a9cb = m97660xe881a9cb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0, true);
        this.f48220x17fed6c6 = m97660xe881a9cb;
        if (!m97660xe881a9cb.m97208xfb85bb43().m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
            this.f48220x17fed6c6 = this.f48221xd9e053a8;
        }
        this.f48242x3be72946 = this.f48220x17fed6c6.m97208xfb85bb43();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "preReadSample: " + mo97358xabff72d6() + " preReadTime = " + this.f48242x3be72946 + ", lastOutputBufferIndex = " + this.f48230xb2824cbb);
    }

    /* renamed from: readFromExtractor */
    private synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 m97666xd0b56fa4() {
        long m97964xf6c90f8d = this.f48225xf0edce24.m97964xf6c90f8d();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doReadFrames readFromExtractor sampleTime:" + m97964xf6c90f8d + ", timeRangeEnd:" + this.f48245x16fae70.m97259x74606f23() + ", trackIndex: " + this.f48225xf0edce24.m97965x452c8b07());
        if (m97964xf6c90f8d < this.f48245x16fae70.m97259x74606f23() && this.f48225xf0edce24.m97965x452c8b07() != -1 && m97964xf6c90f8d != -1) {
            return m97667x416da6aa();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966();
        if (m97964xf6c90f8d >= this.f48245x16fae70.m97259x74606f23()) {
            c25733xc7e62966 = m97667x416da6aa();
        }
        int mo96250x9a572d5a = this.f48234xe0f0f5a1.mo96250x9a572d5a(1000L);
        if (mo96250x9a572d5a >= 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doReadFrames readFromExtractor queue end of steam sampleTime:" + m97964xf6c90f8d);
            this.f48234xe0f0f5a1.mo96258xfe5642d9(mo96250x9a572d5a, 0, 0, 0L, 4);
            this.f48226xb72b3c6 = true;
        }
        return c25733xc7e62966;
    }

    /* renamed from: readSampleData */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 m97667x416da6aa() {
        long m97964xf6c90f8d = this.f48225xf0edce24.m97964xf6c90f8d();
        com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.DECODE_WAIT);
        c25733xc7e62966.m97184xc75a0595();
        int mo96250x9a572d5a = this.f48234xe0f0f5a1.mo96250x9a572d5a(1000L);
        if (mo96250x9a572d5a >= 0) {
            c25733xc7e62966.m97183x32057ace();
            com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e629662 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.EXTRACTOR);
            c25733xc7e629662.m97180x5eb42364(c25733xc7e62966);
            c25733xc7e629662.m97184xc75a0595();
            int m97972x416da6aa = this.f48225xf0edce24.m97972x416da6aa(this.f48234xe0f0f5a1.mo96253xaa9f9f74(mo96250x9a572d5a), 0);
            c25733xc7e629662.m97183x32057ace();
            if (m97972x416da6aa >= 0) {
                this.f48232xf8a550c6 = (m97964xf6c90f8d - this.f48245x16fae70.m97261xccb87a6a()) + this.f48233x3dc8e0d;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doReadFrames readSampleData queueInputBuffer sampleTime:" + m97964xf6c90f8d);
                this.f48234xe0f0f5a1.mo96258xfe5642d9(mo96250x9a572d5a, 0, m97972x416da6aa, this.f48232xf8a550c6, 0);
                com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e629663 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.DECODE);
                c25733xc7e629663.f47836xb1e29dce.add(c25733xc7e629662);
                c25733xc7e629663.m97184xc75a0595();
                com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.PendingFrame pendingFrame = new com.p314xaae8f345.tav.p2959x5befac44.C25783x5cf59369.PendingFrame();
                pendingFrame.f48250x27aa95c0 = this.f48233x3dc8e0d;
                pendingFrame.f48249xff66a2b7 = this.f48221xd9e053a8.m97208xfb85bb43();
                this.f48240x2ba2d1d.add(pendingFrame);
                c25733xc7e62966 = c25733xc7e629663;
            } else {
                c25733xc7e62966 = c25733xc7e629662;
            }
            this.f48225xf0edce24.m97955xbc8da882();
        }
        return c25733xc7e62966;
    }

    /* renamed from: renderCacheBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97668xaf9eb2ec() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "renderCacheBuffer: cache hit - " + this.f48220x17fed6c6);
        try {
            this.f48234xe0f0f5a1.mo96260xab26be48(this.f48230xb2824cbb, true);
            this.f48230xb2824cbb = -1;
            if (this.f48220x17fed6c6.m97208xfb85bb43().m97222xf922bec1(this.f48245x16fae70.m97258xb58839a5())) {
                this.f48220x17fed6c6 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
                this.f48240x2ba2d1d.clear();
                this.f48226xb72b3c6 = true;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = this.f48220x17fed6c6;
            c25735x289c723d.f47857xa7c31030.f47837x68ac2fe = com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.DECODE_CACHE;
            return c25735x289c723d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "renderCacheBuffer: ", e17);
            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-2L);
        }
    }

    /* renamed from: seekExtractorTo */
    private synchronized void m97669x9b1f7e27(long j17) {
        this.f48225xf0edce24.m97974xc9fc1b13(j17, 2);
        if (this.f48225xf0edce24.m97964xf6c90f8d() > j17) {
            this.f48225xf0edce24.m97974xc9fc1b13(j17, 0);
        }
        m97657x5a844d37();
        this.f48233x3dc8e0d = this.f48232xf8a550c6 + 10000000;
    }

    /* renamed from: finalize */
    public void m97670xd764dc1e() {
        super.finalize();
        mo97565x41012807(false);
    }

    /* renamed from: getCropInfo */
    public com.p314xaae8f345.tav.p2959x5befac44.C25782x9e08c8d9 m97671xfa2c08d4() {
        return this.f48219x7e51cb5e;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo97357xc291ccac() {
        return this.f48222xb3470cef;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: getPreReadCost */
    public long mo97558x15b5cd10() {
        return this.f48241x3bdf8646;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getSourcePath */
    public java.lang.String mo97358xabff72d6() {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f48225xf0edce24;
        if (c25820xcadb1d34 == null) {
            return null;
        }
        return c25820xcadb1d34.m97967xabff72d6();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: getTextureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97559x3a00ef33() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: hasTrack */
    public synchronized boolean mo97359x7c8fed1() {
        return this.f48246x43ea5e47 != -1;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: init */
    public void mo97560x316510(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: isLastFrameValid */
    public boolean mo97561xa27b058f() {
        return this.f48229xfbcf7dc5;
    }

    /* renamed from: isStarted */
    public boolean m97672x6c5c87f7() {
        return this.f48244x8eeb4081;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: nextFrameTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo97562x99ce2827(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        long m97232x31040141 = c25736x76b98a57.m97232x31040141();
        java.util.Iterator<java.lang.Long> it = this.f48217x61b6dd39.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if (m97232x31040141 < longValue) {
                return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((((float) longValue) / 1000.0f) / 1000.0f);
            }
        }
        return this.f48220x17fed6c6.m97208xfb85bb43().add(this.f48239x78118f4a);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: outputBuffer */
    public synchronized java.nio.ByteBuffer mo97362xdb4114a1() {
        return this.f48237xdb4114a1;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: outputSurface */
    public synchronized android.view.Surface mo97563x10d4786c() {
        return this.f48238x10d4786c;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97363xe121b2e0() {
        return mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: readVideoSampleBuffer */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo97564xe7f79baf(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97364xe121b2e0 = mo97364xe121b2e0(c25736x76b98a57);
        return (mo97364xe121b2e0.m97206x8311a768() <= -1 || !mo97561xa27b058f() || mo97364xe121b2e0.m97204xfab0f3b7() < 0) ? new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(mo97364xe121b2e0) : new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(mo97364xe121b2e0, mo97559x3a00ef33());
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: release */
    public void mo97365x41012807() {
    }

    /* renamed from: releaseOutputBuffer */
    public void m97673xab26be48() {
        int i17 = this.f48230xb2824cbb;
        if (i17 != -1) {
            try {
                this.f48234xe0f0f5a1.mo96260xab26be48(i17, false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "releaseOutputBuffer", e17);
            }
            this.f48230xb2824cbb = -1;
        }
        this.f48237xdb4114a1 = null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: seekTo */
    public synchronized void mo97367xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        mo97566xc9fc1b13(c25736x76b98a57, true);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: setLogger */
    public void mo97368x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
        this.f48231xbe97f590 = c25799x4a77fd1;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: start */
    public synchronized void mo97369x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        mo97370x68ac462(c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: switchFrame */
    public void mo97567x7d8a6299() {
    }

    public C25783x5cf59369(java.lang.String str, android.view.Surface surface, com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 c25785xac83bc40, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf, com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        java.lang.String str2 = "VideoDecoder@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str2;
        this.f48227x86eca49f = 33333L;
        this.f48224x89444d94 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f48239x78118f4a = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(20L, 600);
        this.f48246x43ea5e47 = -1;
        this.f48218x719a4d0e = new android.media.MediaCodec.BufferInfo();
        this.f48237xdb4114a1 = null;
        this.f48220x17fed6c6 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        this.f48242x3be72946 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
        this.f48240x2ba2d1d = new java.util.ArrayList<>();
        this.f48217x61b6dd39 = new java.util.ArrayList();
        this.f48231xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        boolean z17 = false;
        this.f48228xafdb8087 = false;
        this.f48244x8eeb4081 = false;
        this.f48229xfbcf7dc5 = false;
        this.f48230xb2824cbb = -1;
        this.f48241x3bdf8646 = 0L;
        this.f48222xb3470cef = new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b();
        this.f48233x3dc8e0d = 10000000L;
        this.f48232xf8a550c6 = 0L;
        this.f48221xd9e053a8 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        this.f48226xb72b3c6 = false;
        this.f48243xa0768393 = false;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str2, "create VideoDecoder start");
        if (interfaceC25650x9122a0cf != null) {
            this.f48223x2d4a8826 = interfaceC25650x9122a0cf;
        } else {
            this.f48223x2d4a8826 = new com.p314xaae8f345.tav.p2946x5a71016.C25648xd8cdf4a7();
        }
        if (surface != null) {
            this.f48238x10d4786c = surface;
        }
        if (c25785xac83bc40 != null) {
            this.f48247xa2b86820 = c25785xac83bc40;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (m97662x4d873af4(str)) {
            m97658x3ee5c889();
            this.f48235xd571d8fb = this.f48225xf0edce24.m97969xe2db7ec(this.f48246x43ea5e47);
            this.f48224x89444d94 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((((float) this.f48225xf0edce24.m97961x51e8b0a()) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
            if (this.f48235xd571d8fb.containsKey("frame-rate")) {
                int integer = this.f48235xd571d8fb.getInteger("frame-rate");
                this.f48239x78118f4a = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(600 / integer, 600);
                this.f48227x86eca49f = 1000000 / integer;
            }
            if (this.f48235xd571d8fb.containsKey("rotation-degrees")) {
                int integer2 = this.f48235xd571d8fb.getInteger("rotation-degrees");
                if (c25785xac83bc40 != null) {
                    c25785xac83bc40.m97763xc79c4c4e(integer2);
                }
            }
            boolean z18 = android.os.Build.VERSION.SDK_INT >= 31;
            if (c25706x7dc2d64f != null && z18) {
                z18 = c25706x7dc2d64f.m96961x6383263f();
                if (c25706x7dc2d64f.m96960x75267e64() != null && z18) {
                    this.f48235xd571d8fb.setInteger("color-transfer-request", 3);
                }
            }
            com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96242xc9e59a65 = this.f48223x2d4a8826.mo96242xc9e59a65(this.f48235xd571d8fb.getString("mime"));
            this.f48234xe0f0f5a1 = mo96242xc9e59a65;
            this.f48225xf0edce24.m97979x11f52776(mo96242xc9e59a65.mo96257xb9a8d074());
            this.f48234xe0f0f5a1.mo96262x683d6267(str);
            this.f48234xe0f0f5a1.mo96248xd00d62e6(this.f48235xd571d8fb, surface, null, 0);
            android.media.MediaFormat mo96254xb124032b = this.f48234xe0f0f5a1.mo96254xb124032b();
            if (z18 && mo96254xb124032b != null && mo96254xb124032b.getInteger("color-transfer-request", 0) == 3) {
                z17 = true;
            }
            if (c25706x7dc2d64f != null && z17 && !c25706x7dc2d64f.m96960x75267e64().isRecycled()) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "system hdr transcode supported, disable lut");
                c25706x7dc2d64f.m96960x75267e64().recycle();
            } else {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "system hdr transcode not supported");
            }
            this.f48234xe0f0f5a1.mo96247x49c4954b(this.f48247xa2b86820.m97764x299653ae());
            this.f48234xe0f0f5a1.mo96264x68ac462();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str2, "create VideoDecoder end " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        boolean z17;
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97660xe881a9cb;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSample: " + c25736x76b98a57 + ", currentDecoderTime = " + this.f48220x17fed6c6 + ",  extractor.getSampleTime() = " + this.f48225xf0edce24.m97964xf6c90f8d() + ", lastOutputBufferIndex = " + this.f48230xb2824cbb);
        this.f48229xfbcf7dc5 = false;
        boolean z18 = (mo97563x10d4786c() == null || this.f48230xb2824cbb == -1) ? false : true;
        if (this.f48220x17fed6c6.m97208xfb85bb43().m97238x9f3f7b48(c25736x76b98a57) && (!this.f48226xb72b3c6 || !this.f48240x2ba2d1d.isEmpty())) {
            z17 = false;
            if (!z18 && z17) {
                return m97668xaf9eb2ec();
            }
            m97660xe881a9cb = m97660xe881a9cb(c25736x76b98a57, false);
            if (this.f48220x17fed6c6.m97210x5241396d() && m97660xe881a9cb.m97208xfb85bb43().m97222xf922bec1(this.f48245x16fae70.m97256x51e8b0a())) {
                this.f48220x17fed6c6 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
                this.f48240x2ba2d1d.clear();
                this.f48226xb72b3c6 = true;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSample: finish " + c25736x76b98a57 + "  -  " + this.f48220x17fed6c6);
                this.f48243xa0768393 = true;
                return this.f48220x17fed6c6;
            }
            this.f48220x17fed6c6 = m97660xe881a9cb;
            if (!m97660xe881a9cb.m97214x36f88ac9(-1, -4) || !this.f48220x17fed6c6.m97208xfb85bb43().m97238x9f3f7b48(this.f48224x89444d94)) {
                m97657x5a844d37();
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSample: finish flag = " + this.f48229xfbcf7dc5 + " - " + this.f48226xb72b3c6 + ", time = " + c25736x76b98a57 + "  -  " + this.f48220x17fed6c6);
            return m97660xe881a9cb;
        }
        z17 = true;
        if (!z18) {
        }
        m97660xe881a9cb = m97660xe881a9cb(c25736x76b98a57, false);
        if (this.f48220x17fed6c6.m97210x5241396d()) {
        }
        this.f48220x17fed6c6 = m97660xe881a9cb;
        if (!m97660xe881a9cb.m97214x36f88ac9(-1, -4)) {
        }
        m97657x5a844d37();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSample: finish flag = " + this.f48229xfbcf7dc5 + " - " + this.f48226xb72b3c6 + ", time = " + c25736x76b98a57 + "  -  " + this.f48220x17fed6c6);
        return m97660xe881a9cb;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: release */
    public synchronized void mo97565x41012807(boolean z17) {
        if (this.f48228xafdb8087) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "release:start " + z17);
        if (z17) {
            this.f48225xf0edce24.m97958x63a5261f();
            this.f48225xf0edce24 = null;
        }
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f48236x4a164925;
        if (c25820xcadb1d34 != null) {
            c25820xcadb1d34.m97958x63a5261f();
            this.f48236x4a164925 = null;
        }
        this.f48244x8eeb4081 = false;
        this.f48228xafdb8087 = true;
        com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb interfaceC25651x5e1bd3bb = this.f48234xe0f0f5a1;
        if (interfaceC25651x5e1bd3bb != null) {
            interfaceC25651x5e1bd3bb.mo96259x41012807();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "release:end " + z17);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "decode performance:" + this.f48222xb3470cef);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: seekTo */
    public synchronized void mo97566xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "seekTo: " + c25736x76b98a57 + "  - " + this + "  " + this.f48221xd9e053a8 + "  " + this.f48220x17fed6c6);
        if (this.f48244x8eeb4081 && this.f48246x43ea5e47 != -1) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            if (c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a572)) {
                c25736x76b98a57 = c25736x76b98a572;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add = this.f48245x16fae70.m97260x75286aac().add(c25736x76b98a57);
            if ((!z17 || !m97663xbe6d70ab(c25736x76b98a57)) && !c25736x76b98a57.m97229x22a7969a(this.f48220x17fed6c6.m97208xfb85bb43()) && !m97661xea8c14d(c25736x76b98a57)) {
                this.f48221xd9e053a8 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
                m97669x9b1f7e27(add.m97232x31040141());
                this.f48226xb72b3c6 = false;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "seekTo: finish - " + this.f48221xd9e053a8 + "  " + this.f48225xf0edce24.m97964xf6c90f8d());
                return;
            }
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "seekTo: [failed] !started || trackIndex == -1 ");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: start */
    public synchronized void mo97370x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "start:" + mo97358xabff72d6() + " [timeRange " + c25738xead39d26 + "] [start " + c25736x76b98a57 + "]");
        if (this.f48246x43ea5e47 == -1) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "start: trackIndex == -1");
            return;
        }
        m97657x5a844d37();
        if (c25738xead39d26 == null) {
            this.f48245x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, this.f48224x89444d94);
        } else {
            this.f48245x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97260x75286aac(), c25738xead39d26.m97256x51e8b0a());
        }
        this.f48226xb72b3c6 = false;
        this.f48244x8eeb4081 = true;
        if (c25736x76b98a57.m97232x31040141() >= 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            mo97566xc9fc1b13(c25736x76b98a57, false);
            m97665xdc9c91e3();
            this.f48241x3bdf8646 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        }
    }
}
