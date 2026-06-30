package com.p314xaae8f345.tav.p2959x5befac44.ofs;

/* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder */
/* loaded from: classes16.dex */
public class C25811xac414296 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32, android.os.Handler.Callback {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f48427x7118e671 = false;

    /* renamed from: MAX_PRE_DECODE_BUFFER_FRAME_COUNT */
    private static final int f48428xb75b5f78 = 8;

    /* renamed from: MSG_DECODE_MORE_FRAME */
    private static final int f48429x693a8176 = 4;

    /* renamed from: MSG_PREPARE */
    private static final int f48430xbff57a09 = 1;

    /* renamed from: MSG_RELEASE */
    private static final int f48431x13f09509 = 5;

    /* renamed from: MSG_SEEK_TO */
    private static final int f48432x487756c4 = 3;

    /* renamed from: MSG_SEND_REQUEST */
    private static final int f48433x8b9a68d6 = 6;

    /* renamed from: MSG_START */
    private static final int f48434x99468de4 = 2;

    /* renamed from: REQUEST_TIMEOUT_MS */
    private static final int f48435x61f94d34 = 5000;
    public final java.lang.String TAG;

    /* renamed from: allocTextureCount */
    private int f48436x7cef5489;

    /* renamed from: blitRenderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f48437x71476e44;

    /* renamed from: bufferInfo */
    private final android.media.MediaCodec.BufferInfo f48438x719a4d0e;

    /* renamed from: causedError */
    private java.lang.Exception f48439x1f2ec1ad;

    /* renamed from: clipTimeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48440xe66de500;

    /* renamed from: decodeReporter */
    private final com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b f48441xb3470cef;

    /* renamed from: decodeRequest */
    private com.p314xaae8f345.tav.p2959x5befac44.ofs.C25806x6f46c0a1 f48442x3fa790c1;

    /* renamed from: decoderFactory */
    private final com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f48443x2d4a8826;

    /* renamed from: decodingStateContext */
    private com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.DecodingStateContext f48444xe655caa9;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48445x89444d94;

    /* renamed from: extractor */
    private com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f48446xf0edce24;

    /* renamed from: handler */
    private final android.os.Handler f48447x294b574a;

    /* renamed from: handlerThread */
    private final android.os.HandlerThread f48448xe30131f4;

    /* renamed from: mediaCodecWrapper */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb f48449xe0f0f5a1;

    /* renamed from: mediaFormat */
    private android.media.MediaFormat f48450xd571d8fb;

    /* renamed from: mirrorExtractor */
    private com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f48451x4a164925;

    /* renamed from: oesTextureBlitter */
    private com.p314xaae8f345.tav.p2959x5befac44.ofs.C25810x25c39e0e f48452xa8a8622e;

    /* renamed from: originVideoFrameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48453xab1d472c;

    /* renamed from: outputFrameDuration */
    private final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48454xc9181ea0;

    /* renamed from: outputSurface */
    private android.view.Surface f48455x10d4786c;

    /* renamed from: outputTextureSize */
    private android.util.Size f48456xdbbfb7fb;

    /* renamed from: preReadCost */
    private long f48457x3bdf8646;

    /* renamed from: sharedRenderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f48458x238c46d4;

    /* renamed from: state */
    private volatile com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State f48459x68ac491;

    /* renamed from: texturePool */
    private final java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> f48460x602ddbd7;

    /* renamed from: trackIndex */
    private int f48461x43ea5e47;

    /* renamed from: videoTexture */
    private com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 f48462xa2b86820;

    /* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder$5, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: $SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State */
        static final /* synthetic */ int[] f48472x6e0a83a8;

        static {
            int[] iArr = new int[com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.m97894xcee59d22().length];
            f48472x6e0a83a8 = iArr;
            try {
                iArr[com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Decoding.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48472x6e0a83a8[com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Uninitialized.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f48472x6e0a83a8[com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Releasing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f48472x6e0a83a8[com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Released.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f48472x6e0a83a8[com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Error.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder$DecodingStateContext */
    /* loaded from: classes16.dex */
    public class DecodingStateContext {

        /* renamed from: optimizedFrameSamplingVideoDecoder */
        private final com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296 f48477x5039c676;

        /* renamed from: originStartGopPts */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48478x29560143;

        /* renamed from: seekTargetTimeInMedia */
        public final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48480xc2d24849;

        /* renamed from: decodingEntitiesByPTS */
        final java.util.LinkedList<com.p314xaae8f345.tav.p2959x5befac44.ofs.C25808xe9791ac3> f48473x4921b26c = new java.util.LinkedList<>();

        /* renamed from: outputQueue */
        final java.util.LinkedList<com.p314xaae8f345.tav.p2959x5befac44.ofs.C25807xacfc92f7> f48479xce178890 = new java.util.LinkedList<>();

        /* renamed from: lastDecodeState */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48476xc8d802cd = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);

        /* renamed from: isInputEOS */
        boolean f48474xecc5d029 = false;

        /* renamed from: isOutputEOS */
        boolean f48475xc7eb0a3e = false;

        public DecodingStateContext(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296 c25811xac414296, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
            this.f48477x5039c676 = c25811xac414296;
            this.f48480xc2d24849 = c25736x76b98a57;
            this.f48478x29560143 = c25736x76b98a572;
        }

        /* renamed from: hasReachToPreDecodePosition */
        public boolean m97889xddf5a1c6() {
            return this.f48475xc7eb0a3e || this.f48479xce178890.size() > 8;
        }

        /* renamed from: release */
        public void m97890x41012807() {
            java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.ofs.C25807xacfc92f7> it = this.f48479xce178890.iterator();
            while (it.hasNext()) {
                this.f48477x5039c676.f48460x602ddbd7.add(it.next().f48403x602aa869);
            }
            this.f48479xce178890.clear();
        }
    }

    /* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder$State */
    /* loaded from: classes16.dex */
    public enum State {
        Uninitialized,
        Decoding,
        Releasing,
        Released,
        Error
    }

    public C25811xac414296(java.lang.String str, com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719, android.view.Surface surface, com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 c25785xac83bc40, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf, com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        java.lang.String str2 = "OFSVideoDecoder@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str2;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("OFSDecodeProcessor");
        this.f48448xe30131f4 = handlerThread;
        this.f48459x68ac491 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Uninitialized;
        this.f48453xab1d472c = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(20L, 600);
        this.f48445x89444d94 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f48461x43ea5e47 = -1;
        this.f48438x719a4d0e = new android.media.MediaCodec.BufferInfo();
        this.f48457x3bdf8646 = 0L;
        this.f48441xb3470cef = new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b();
        this.f48460x602ddbd7 = new java.util.ArrayList<>();
        this.f48436x7cef5489 = 0;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str2, "create VideoDecoder start");
        this.f48458x238c46d4 = c25779x3338e719;
        if (interfaceC25650x9122a0cf != null) {
            this.f48443x2d4a8826 = interfaceC25650x9122a0cf;
        } else {
            this.f48443x2d4a8826 = new com.p314xaae8f345.tav.p2946x5a71016.C25648xd8cdf4a7();
        }
        if (surface != null) {
            this.f48455x10d4786c = surface;
        }
        if (c25785xac83bc40 != null) {
            this.f48462xa2b86820 = c25785xac83bc40;
        }
        this.f48454xc9181ea0 = c25736x76b98a57;
        handlerThread.start();
        this.f48447x294b574a = new android.os.Handler(handlerThread.getLooper(), this);
        m97880xba047978(str, c25706x7dc2d64f);
    }

    /* renamed from: ceilAlignToOutputFrameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97861x69000f05(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return this.f48454xc9181ea0.m97236x636d539((int) java.lang.Math.ceil(c25736x76b98a57.m97231x793685bc() / this.f48454xc9181ea0.m97231x793685bc()));
    }

    /* renamed from: checkNoNeedSeek */
    private boolean m97862xc06ec837(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34;
        if (this.f48444xe655caa9 == null || (c25820xcadb1d34 = this.f48451x4a164925) == null) {
            return false;
        }
        c25820xcadb1d34.m97974xc9fc1b13(c25736x76b98a57.m97232x31040141(), 2);
        if (this.f48451x4a164925.m97964xf6c90f8d() > c25736x76b98a57.m97232x31040141()) {
            this.f48451x4a164925.m97974xc9fc1b13(c25736x76b98a57.m97232x31040141(), 0);
        }
        long m97964xf6c90f8d = this.f48451x4a164925.m97964xf6c90f8d();
        if (m97964xf6c90f8d < this.f48444xe655caa9.f48478x29560143.m97232x31040141()) {
            return false;
        }
        if (m97964xf6c90f8d == this.f48444xe655caa9.f48478x29560143.m97232x31040141()) {
            if (this.f48444xe655caa9.f48479xce178890.isEmpty()) {
                return true;
            }
            return !this.f48444xe655caa9.f48479xce178890.getFirst().f48402x8f136bd0.m97222xf922bec1(c25736x76b98a57);
        }
        if (this.f48444xe655caa9.f48479xce178890.isEmpty() && this.f48444xe655caa9.f48473x4921b26c.isEmpty()) {
            return false;
        }
        return ((this.f48444xe655caa9.f48479xce178890.isEmpty() ? this.f48444xe655caa9.f48473x4921b26c.getFirst().f48405x8f136bd0 : this.f48444xe655caa9.f48479xce178890.getFirst().f48402x8f136bd0).m97222xf922bec1(c25736x76b98a57) || c25736x76b98a57.m97222xf922bec1(this.f48444xe655caa9.f48473x4921b26c.isEmpty() ? this.f48444xe655caa9.f48479xce178890.getLast().f48402x8f136bd0 : this.f48444xe655caa9.f48473x4921b26c.getLast().f48405x8f136bd0)) ? false : true;
    }

    /* renamed from: checkRequestTimeout */
    private boolean m97863x89e06fa() {
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25806x6f46c0a1 c25806x6f46c0a1 = this.f48442x3fa790c1;
        if (c25806x6f46c0a1 == null || c25806x6f46c0a1.f48397xf29e3841 || java.lang.System.currentTimeMillis() - this.f48442x3fa790c1.f48399xb1c71246 < 5000) {
            return false;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "Decode request is timeout. time: " + this.f48442x3fa790c1.f48400x8fcb1336.m97260x75286aac().m97231x793685bc());
        this.f48442x3fa790c1.m97844x310c92c2();
        this.f48442x3fa790c1 = null;
        return true;
    }

    /* renamed from: clearDecodingStateContext */
    private void m97864x3bcb8c96() {
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.DecodingStateContext decodingStateContext = this.f48444xe655caa9;
        if (decodingStateContext != null) {
            decodingStateContext.m97890x41012807();
            this.f48444xe655caa9 = null;
        }
    }

    /* renamed from: doDecodeMoreFrame */
    private void m97865x4a8bc8bf() {
        if (m97863x89e06fa()) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doDecodeOneFrame: start. inputEOS:" + this.f48444xe655caa9.f48474xecc5d029 + " outputEOS:" + this.f48444xe655caa9.f48474xecc5d029);
        java.lang.String str = this.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doDecodeOneFrame: pendingDecodingFrames: ");
        sb6.append(this.f48444xe655caa9.f48473x4921b26c.isEmpty() ? "NaN" : java.lang.String.valueOf(this.f48444xe655caa9.f48473x4921b26c.getFirst().f48405x8f136bd0.m97231x793685bc()));
        sb6.append(" -> ");
        sb6.append(this.f48444xe655caa9.f48473x4921b26c.isEmpty() ? "NaN" : java.lang.String.valueOf(this.f48444xe655caa9.f48473x4921b26c.getLast().f48405x8f136bd0.m97231x793685bc()));
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str, sb6.toString());
        java.lang.String str2 = this.TAG;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doDecodeOneFrame: outputQueue: ");
        sb7.append(this.f48444xe655caa9.f48479xce178890.isEmpty() ? "NaN" : java.lang.String.valueOf(this.f48444xe655caa9.f48479xce178890.getFirst().f48402x8f136bd0.m97231x793685bc()));
        sb7.append(" -> ");
        sb7.append(this.f48444xe655caa9.f48479xce178890.isEmpty() ? "NaN" : java.lang.String.valueOf(this.f48444xe655caa9.f48479xce178890.getLast().f48402x8f136bd0.m97231x793685bc()));
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str2, sb7.toString());
        java.lang.String str3 = this.TAG;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("doDecodeOneFrame: targetTime: ");
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25806x6f46c0a1 c25806x6f46c0a1 = this.f48442x3fa790c1;
        sb8.append(c25806x6f46c0a1 != null ? java.lang.Float.valueOf(c25806x6f46c0a1.f48400x8fcb1336.m97260x75286aac().m97231x793685bc()) : "preload");
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str3, sb8.toString());
        try {
            if (this.f48442x3fa790c1 == null && this.f48444xe655caa9.m97889xddf5a1c6()) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doDecodeOneFrame: hasReachToMaxDecodePosition.");
                return;
            }
            m97868x863670c6();
            boolean m97867x110b232c = m97867x110b232c();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "doDecodeOneFrame - hasNewFrame " + m97867x110b232c);
            if (m97867x110b232c || this.f48444xe655caa9.f48475xc7eb0a3e) {
                boolean m97885x44f44a3a = m97885x44f44a3a(this.f48444xe655caa9.f48475xc7eb0a3e);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "trySamplingTargetFrame: ok=" + m97885x44f44a3a);
            }
            m97882x85ee933();
        } catch (java.lang.Exception e17) {
            m97870xf86adeb9(e17);
        }
    }

    /* renamed from: doSeekTo */
    private void m97866x172a3f7e(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        long m97232x31040141 = c25736x76b98a57.m97232x31040141();
        this.f48446xf0edce24.m97974xc9fc1b13(m97232x31040141, 2);
        if (this.f48446xf0edce24.m97964xf6c90f8d() > m97232x31040141) {
            this.f48446xf0edce24.m97974xc9fc1b13(m97232x31040141, 0);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97221xb488dfe8 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(this.f48446xf0edce24.m97964xf6c90f8d());
        m97864x3bcb8c96();
        this.f48444xe655caa9 = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.DecodingStateContext(this, c25736x76b98a57, m97221xb488dfe8);
        this.f48449xe0f0f5a1.mo96252x5d03b04();
    }

    /* renamed from: drainDecoder */
    private boolean m97867x110b232c() {
        if (this.f48444xe655caa9.f48475xc7eb0a3e) {
            return false;
        }
        this.f48438x719a4d0e.set(0, 0, 0L, 0);
        int mo96251x436dd5f1 = this.f48449xe0f0f5a1.mo96251x436dd5f1(this.f48438x719a4d0e, 0L);
        if (mo96251x436dd5f1 < 0) {
            if (mo96251x436dd5f1 == -2) {
                android.media.MediaFormat mo96256x42b80ace = this.f48449xe0f0f5a1.mo96256x42b80ace();
                if (mo96256x42b80ace == null) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "drainDecoder: newFormat is null.");
                    return false;
                }
                m97879x89518667(mo96256x42b80ace);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "drainDecoder:newFormat %s", mo96256x42b80ace);
            } else if (mo96251x436dd5f1 == -1) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "drainDecoder: try again later.");
            } else {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "drainDecoder: not ready. outputBufferIndex: " + mo96251x436dd5f1);
            }
            return false;
        }
        android.media.MediaCodec.BufferInfo bufferInfo = this.f48438x719a4d0e;
        if ((bufferInfo.flags & 4) != 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "drainDecoder: output end of stream.");
            this.f48444xe655caa9.f48475xc7eb0a3e = true;
            this.f48449xe0f0f5a1.mo96260xab26be48(mo96251x436dd5f1, false);
            return false;
        }
        if (bufferInfo.size <= 0) {
            this.f48449xe0f0f5a1.mo96260xab26be48(mo96251x436dd5f1, false);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "drainDecoder: bufferInfo.size: " + this.f48438x719a4d0e.size);
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97221xb488dfe8 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(bufferInfo.presentationTimeUs);
        java.util.LinkedList<com.p314xaae8f345.tav.p2959x5befac44.ofs.C25808xe9791ac3> linkedList = this.f48444xe655caa9.f48473x4921b26c;
        if (!linkedList.isEmpty()) {
            while (!linkedList.isEmpty()) {
                java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.ofs.C25808xe9791ac3> it = linkedList.iterator();
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25808xe9791ac3 next = it.next();
                if (next.f48405x8f136bd0.m97228xb2c87fbf(m97221xb488dfe8) && !next.m97845x9dc820cf()) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "drainDecoder: frame decoded. pts:" + m97221xb488dfe8.m97231x793685bc());
                    next.m97846xd5a9418c();
                }
                if (next.f48405x8f136bd0.m97222xf922bec1(m97221xb488dfe8) || !it.hasNext() || it.next().f48405x8f136bd0.m97222xf922bec1(m97221xb488dfe8)) {
                    break;
                }
                linkedList.poll();
            }
        } else {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "drainDecoder: frame decoded, but decodingFrameSequenceGroupsByPTS is empty. pts:" + m97221xb488dfe8.m97231x793685bc());
        }
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25806x6f46c0a1 c25806x6f46c0a1 = this.f48442x3fa790c1;
        boolean z17 = ((double) m97221xb488dfe8.m97232x31040141()) + (((double) this.f48453xab1d472c.m97232x31040141()) * 1.5d) > ((double) (c25806x6f46c0a1 == null ? new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f48444xe655caa9.f48480xc2d24849, this.f48454xc9181ea0) : c25806x6f46c0a1.f48400x8fcb1336).m97261xccb87a6a());
        this.f48449xe0f0f5a1.mo96260xab26be48(mo96251x436dd5f1, z17);
        if (!z17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "drainDecoder: discard frame pts:" + m97221xb488dfe8.m97231x793685bc());
            return false;
        }
        try {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "drainDecoder: awaitNewImage");
            this.f48462xa2b86820.m97749x13bc3b11();
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97878xe5cf38b6 = m97878xe5cf38b6(this.f48456xdbbfb7fb);
            this.f48452xa8a8622e.m97852xad5e5050(this.f48462xa2b86820.m97757x3a00ef33(), this.f48462xa2b86820.m97756x9ef2e328(), m97878xe5cf38b6.f47890xc35d0376);
            android.opengl.GLES20.glFinish();
            this.f48444xe655caa9.f48479xce178890.add(new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25807xacfc92f7(this.f48440xe66de500, m97221xb488dfe8, m97878xe5cf38b6));
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "drainDecoder: videoTexture.awaitNewImage() error", th6);
            return false;
        }
    }

    /* renamed from: feedDecoder */
    private void m97868x863670c6() {
        int i17 = 3;
        while (!this.f48444xe655caa9.f48474xecc5d029) {
            int i18 = i17 - 1;
            if (i17 <= 0) {
                return;
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "feedDecoder: start. maxFeedTimes:" + i18);
            int mo96250x9a572d5a = this.f48449xe0f0f5a1.mo96250x9a572d5a(0L);
            if (mo96250x9a572d5a < 0) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "feedDecoder: input buffer not read.");
            } else {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97221xb488dfe8 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(this.f48446xf0edce24.m97964xf6c90f8d());
                int m97972x416da6aa = this.f48446xf0edce24.m97972x416da6aa(this.f48449xe0f0f5a1.mo96253xaa9f9f74(mo96250x9a572d5a), 0);
                if (m97972x416da6aa < 0) {
                    m97883x99b8d3a7(mo96250x9a572d5a);
                    return;
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "feedDecoder: samplePts:" + m97221xb488dfe8.m97231x793685bc() + " size:" + m97972x416da6aa);
                this.f48444xe655caa9.f48474xecc5d029 = this.f48446xf0edce24.m97955xbc8da882() ^ true;
                this.f48449xe0f0f5a1.mo96258xfe5642d9(mo96250x9a572d5a, 0, m97972x416da6aa, m97221xb488dfe8.m97232x31040141(), this.f48444xe655caa9.f48474xecc5d029 ? 4 : 0);
                this.f48444xe655caa9.f48473x4921b26c.add(new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25808xe9791ac3(m97221xb488dfe8));
                java.util.Collections.sort(this.f48444xe655caa9.f48473x4921b26c);
            }
            i17 = i18;
        }
    }

    /* renamed from: floorAlignToOutputFrameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97869x5dbd5f4c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return this.f48454xc9181ea0.m97236x636d539((int) java.lang.Math.floor(c25736x76b98a57.m97231x793685bc() / this.f48454xc9181ea0.m97231x793685bc()));
    }

    /* renamed from: handleDecodeException */
    private void m97870xf86adeb9(java.lang.Exception exc) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "handleDecodeException: ", exc);
        if (exc instanceof android.media.MediaCodec.CodecException) {
            android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) exc;
            if (codecException.isRecoverable()) {
                this.f48449xe0f0f5a1.mo96261x6761d4f();
                m97866x172a3f7e(this.f48444xe655caa9.f48480xc2d24849);
                m97882x85ee933();
                return;
            } else if (codecException.isTransient()) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "doDecodeMoreFrame:[error] isTransient() is true");
            }
        }
        m97884x33e13198(exc);
    }

    /* renamed from: handleDecodeMoreFrame */
    private void m97871xad05982() {
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "handleDecodeOneFrame: DecodeOneFrame in invalid state:" + this.f48459x68ac491.name());
            return;
        }
        if (this.f48444xe655caa9 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "handleDecodeOneFrame: decodingState is null");
        } else {
            m97865x4a8bc8bf();
        }
    }

    /* renamed from: handlePrepare */
    private void m97872xf7379bf(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25813x3e383517 c25813x3e383517) {
        java.lang.String str = c25813x3e383517.f48525xbdbebae0;
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = c25813x3e383517.f48526xaffe922f;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
            } catch (java.lang.Exception e17) {
                m97884x33e13198(new java.lang.RuntimeException("Failed to init decoder", e17));
            }
            if (!m97877x4d873af4(str)) {
                m97884x33e13198(new java.lang.RuntimeException("Failed to init extractor from " + str));
                return;
            }
            this.f48450xd571d8fb = this.f48446xf0edce24.m97969xe2db7ec(this.f48461x43ea5e47);
            this.f48445x89444d94 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57((((float) this.f48446xf0edce24.m97961x51e8b0a()) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
            if (this.f48450xd571d8fb.containsKey("frame-rate")) {
                this.f48453xab1d472c = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(600 / this.f48450xd571d8fb.getInteger("frame-rate"), 600);
            }
            boolean z17 = false;
            boolean z18 = android.os.Build.VERSION.SDK_INT >= 31;
            if (c25706x7dc2d64f != null && z18) {
                z18 = c25706x7dc2d64f.m96961x6383263f();
                if (c25706x7dc2d64f.m96960x75267e64() != null && z18) {
                    this.f48450xd571d8fb.setInteger("color-transfer-request", 3);
                }
            }
            com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96242xc9e59a65 = this.f48443x2d4a8826.mo96242xc9e59a65(this.f48450xd571d8fb.getString("mime"));
            this.f48449xe0f0f5a1 = mo96242xc9e59a65;
            this.f48446xf0edce24.m97979x11f52776(mo96242xc9e59a65.mo96257xb9a8d074());
            this.f48449xe0f0f5a1.mo96262x683d6267(str);
            this.f48449xe0f0f5a1.mo96248xd00d62e6(this.f48450xd571d8fb, this.f48455x10d4786c, null, 0);
            android.media.MediaFormat mo96254xb124032b = this.f48449xe0f0f5a1.mo96254xb124032b();
            if (z18 && mo96254xb124032b != null && mo96254xb124032b.getInteger("color-transfer-request", 0) == 3) {
                z17 = true;
            }
            if (c25706x7dc2d64f == null || !z17 || c25706x7dc2d64f.m96960x75267e64().isRecycled()) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "system hdr transcode not supported");
            } else {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "system hdr transcode supported, disable lut");
                c25706x7dc2d64f.m96960x75267e64().recycle();
            }
            this.f48449xe0f0f5a1.mo96247x49c4954b(this.f48462xa2b86820.m97764x299653ae());
            this.f48449xe0f0f5a1.mo96264x68ac462();
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719(1, 1, null, this.f48458x238c46d4.m97628x77710645());
            this.f48437x71476e44 = c25779x3338e719;
            c25779x3338e719.m97634x900967ab();
            this.f48452xa8a8622e = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25810x25c39e0e();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "create VideoDecoder end " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } finally {
            c25813x3e383517.f48524xf5bc2045.mo97847xa6db431b();
        }
    }

    /* renamed from: handleRelease */
    private void m97873x636e94bf(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25806x6f46c0a1 c25806x6f46c0a1 = this.f48442x3fa790c1;
        if (c25806x6f46c0a1 != null) {
            c25806x6f46c0a1.m97842x40c5fba9(-2L, "Decoder has released.", new java.lang.RuntimeException("Decoder has released."));
            this.f48442x3fa790c1 = null;
        }
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f48446xf0edce24;
        if (c25820xcadb1d34 != null && z17) {
            c25820xcadb1d34.m97958x63a5261f();
            this.f48446xf0edce24 = null;
        }
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d342 = this.f48451x4a164925;
        if (c25820xcadb1d342 != null) {
            c25820xcadb1d342.m97958x63a5261f();
            this.f48451x4a164925 = null;
        }
        com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb interfaceC25651x5e1bd3bb = this.f48449xe0f0f5a1;
        if (interfaceC25651x5e1bd3bb != null) {
            interfaceC25651x5e1bd3bb.mo96259x41012807();
        }
        m97864x3bcb8c96();
        java.util.Iterator<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> it = this.f48460x602ddbd7.iterator();
        while (it.hasNext()) {
            it.next().m97285x41012807();
        }
        this.f48460x602ddbd7.clear();
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25810x25c39e0e c25810x25c39e0e = this.f48452xa8a8622e;
        if (c25810x25c39e0e != null) {
            c25810x25c39e0e.m97856x41012807();
            this.f48452xa8a8622e = null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f48437x71476e44;
        if (c25779x3338e719 != null) {
            c25779x3338e719.mo97551x41012807();
            this.f48437x71476e44 = null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "release:end " + z17);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "decode performance:" + this.f48441xb3470cef);
    }

    /* renamed from: handleRequest */
    private void m97874x63bc5f47(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25805x86be1473 interfaceC25805x86be1473) {
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            if (interfaceC25805x86be1473 != null) {
                interfaceC25805x86be1473.mo97839x624fb4c0(new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L)));
                return;
            }
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "handleSeekTo in valid state." + this.f48459x68ac491.name());
            if (interfaceC25805x86be1473 != null) {
                interfaceC25805x86be1473.mo97839x624fb4c0(new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97202x360047e(-3L, "Decode error", this.f48439x1f2ec1ad)));
                return;
            }
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        if (c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a572)) {
            c25736x76b98a57 = c25736x76b98a572;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97236x636d539 = this.f48454xc9181ea0.m97236x636d539(c25736x76b98a57.m97231x793685bc() / this.f48454xc9181ea0.m97231x793685bc());
        if (!m97236x636d539.m97238x9f3f7b48(this.f48440xe66de500.m97256x51e8b0a()) && interfaceC25805x86be1473 != null) {
            interfaceC25805x86be1473.mo97839x624fb4c0(new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L)));
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add = this.f48440xe66de500.m97260x75286aac().add(m97236x636d539);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "handleRequest: targetTimeInMedia:" + add.m97231x793685bc());
        this.f48442x3fa790c1 = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25806x6f46c0a1(this, java.lang.System.currentTimeMillis(), m97236x636d539, add, this.f48454xc9181ea0, interfaceC25805x86be1473);
        if (m97885x44f44a3a(this.f48444xe655caa9.f48475xc7eb0a3e)) {
            return;
        }
        if (this.f48444xe655caa9.f48475xc7eb0a3e) {
            this.f48442x3fa790c1.m97844x310c92c2();
        }
        if (!m97862xc06ec837(add)) {
            m97866x172a3f7e(c25736x76b98a57);
        }
        m97865x4a8bc8bf();
    }

    /* renamed from: handleSeekTo */
    private void m97875xb252375b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488 interfaceC25809x611e9488) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 add;
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 != 2 && i17 != 3 && i17 != 4) {
            try {
                if (i17 != 5) {
                    try {
                        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
                        if (c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a572)) {
                            c25736x76b98a57 = c25736x76b98a572;
                        }
                        add = this.f48440xe66de500.m97260x75286aac().add(m97869x5dbd5f4c(c25736x76b98a57));
                    } catch (java.lang.Exception e17) {
                        m97884x33e13198(new java.lang.RuntimeException("Failed to seek", e17));
                        if (interfaceC25809x611e9488 == null) {
                            return;
                        }
                    }
                    if (m97862xc06ec837(add)) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "seekTo: no need to re-seek");
                        if (interfaceC25809x611e9488 != null) {
                            interfaceC25809x611e9488.mo97847xa6db431b();
                            return;
                        }
                        return;
                    }
                    this.f48442x3fa790c1 = null;
                    m97866x172a3f7e(add);
                    m97865x4a8bc8bf();
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "seekTo: finish - " + this.f48444xe655caa9 + "  " + this.f48446xf0edce24.m97964xf6c90f8d());
                    if (interfaceC25809x611e9488 == null) {
                        return;
                    }
                    interfaceC25809x611e9488.mo97847xa6db431b();
                    return;
                }
            } catch (java.lang.Throwable th6) {
                if (interfaceC25809x611e9488 != null) {
                    interfaceC25809x611e9488.mo97847xa6db431b();
                }
                throw th6;
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "handleSeekTo in valid state." + this.f48459x68ac491.name());
        if (interfaceC25809x611e9488 != null) {
            interfaceC25809x611e9488.mo97847xa6db431b();
        }
    }

    /* renamed from: handleStart */
    private void m97876x585bff1a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488 interfaceC25809x611e9488) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub;
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "handleStart in valid state." + this.f48459x68ac491.name());
        }
        try {
            try {
                if (c25738xead39d26 == null) {
                    this.f48440xe66de500 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m97861x69000f05(this.f48445x89444d94));
                } else {
                    this.f48440xe66de500 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97260x75286aac(), m97861x69000f05(c25738xead39d26.m97256x51e8b0a()));
                }
                if (c25736x76b98a57 == null) {
                    sub = this.f48440xe66de500.m97260x75286aac();
                } else {
                    if (c25736x76b98a57.m97238x9f3f7b48(this.f48440xe66de500.m97260x75286aac())) {
                        c25736x76b98a57 = this.f48440xe66de500.m97260x75286aac();
                    }
                    sub = this.f48440xe66de500.m97258xb58839a5().m97238x9f3f7b48(c25736x76b98a57) ? this.f48440xe66de500.m97258xb58839a5().sub(this.f48454xc9181ea0) : c25736x76b98a57;
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
                if (sub.m97238x9f3f7b48(c25736x76b98a572)) {
                    sub = c25736x76b98a572;
                }
                m97866x172a3f7e(sub);
                m97882x85ee933();
                if (interfaceC25809x611e9488 == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                m97884x33e13198(e17);
                if (interfaceC25809x611e9488 == null) {
                    return;
                }
            }
            interfaceC25809x611e9488.mo97847xa6db431b();
        } catch (java.lang.Throwable th6) {
            if (interfaceC25809x611e9488 != null) {
                interfaceC25809x611e9488.mo97847xa6db431b();
            }
            throw th6;
        }
    }

    /* renamed from: initExtractor */
    private boolean m97877x4d873af4(java.lang.String str) {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        this.f48446xf0edce24 = c25820xcadb1d34;
        c25820xcadb1d34.m97977x683d6267(str);
        while (this.f48446xf0edce24.m97965x452c8b07() != -1) {
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d342 = this.f48446xf0edce24;
            c25820xcadb1d342.m97982x5c729176(c25820xcadb1d342.m97965x452c8b07());
        }
        int m97464x334942e1 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(this.f48446xf0edce24, "video/");
        this.f48461x43ea5e47 = m97464x334942e1;
        if (m97464x334942e1 == -1) {
            this.f48455x10d4786c = null;
            return false;
        }
        this.f48446xf0edce24.m97975xc3b89af(m97464x334942e1);
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d343 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        c25820xcadb1d343.m97977x683d6267(this.f48446xf0edce24.m97967xabff72d6());
        while (c25820xcadb1d343.m97965x452c8b07() != -1) {
            c25820xcadb1d343.m97982x5c729176(c25820xcadb1d343.m97965x452c8b07());
        }
        c25820xcadb1d343.m97975xc3b89af(com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(c25820xcadb1d343, "video/"));
        this.f48451x4a164925 = c25820xcadb1d343;
        return true;
    }

    /* renamed from: obtainTexture */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97878xe5cf38b6(android.util.Size size) {
        if (!this.f48460x602ddbd7.isEmpty()) {
            java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> arrayList = this.f48460x602ddbd7;
            return arrayList.remove(arrayList.size() - 1);
        }
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        android.opengl.GLES20.glBindTexture(3553, i17);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glTexParameter");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, size.getWidth(), size.getHeight(), 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        this.f48436x7cef5489++;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "Alloc new texture. count: " + this.f48436x7cef5489);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(i17, 3553, size.getWidth(), size.getHeight(), null, 0);
    }

    /* renamed from: onOutputFormatChange */
    private void m97879x89518667(android.media.MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
            this.f48456xdbbfb7fb = new android.util.Size(mediaFormat.getInteger("width"), mediaFormat.getInteger("height"));
        }
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-top") && mediaFormat.containsKey("crop-bottom")) {
            int integer = mediaFormat.getInteger("crop-left");
            int integer2 = mediaFormat.getInteger("crop-top");
            this.f48456xdbbfb7fb = new android.util.Size((mediaFormat.getInteger("crop-right") + 1) - integer, (mediaFormat.getInteger("crop-bottom") + 1) - integer2);
        }
        if (this.f48456xdbbfb7fb != null && mediaFormat.containsKey("rotation-degrees")) {
            this.f48452xa8a8622e.m97859x61569507(-mediaFormat.getInteger("rotation-degrees"));
        }
        if (this.f48456xdbbfb7fb == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "drainDecoder: No output size.");
            this.f48456xdbbfb7fb = new android.util.Size(1, 1);
        }
    }

    /* renamed from: prepareDecoderSync */
    private void m97880xba047978(java.lang.String str, com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        android.os.Handler handler = this.f48447x294b574a;
        handler.sendMessage(android.os.Message.obtain(handler, 1, new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25813x3e383517(str, c25706x7dc2d64f, new com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.1
            @Override // com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488
            /* renamed from: onCompletion */
            public void mo97847xa6db431b() {
                countDownLatch.countDown();
            }
        })));
        try {
            countDownLatch.await();
            if (this.f48459x68ac491 == com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Uninitialized) {
                this.f48459x68ac491 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Decoding;
            }
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: samplingTargetFrame */
    private void m97881xee0c4bf5(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25807xacfc92f7 c25807xacfc92f7, int i17) {
        for (int i18 = 0; i18 < i17 - 1; i18++) {
            this.f48460x602ddbd7.add(this.f48444xe655caa9.f48479xce178890.removeFirst().f48403x602aa869);
        }
        this.f48442x3fa790c1.m97843x40d3d30e(c25807xacfc92f7);
        this.f48442x3fa790c1 = null;
    }

    /* renamed from: scheduleDecodeMoreFrame */
    private void m97882x85ee933() {
        if (this.f48447x294b574a.hasMessages(4)) {
            return;
        }
        android.os.Handler handler = this.f48447x294b574a;
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 4), 1L);
    }

    /* renamed from: signalInputEOS */
    private void m97883x99b8d3a7(int i17) {
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.DecodingStateContext decodingStateContext = this.f48444xe655caa9;
        if (decodingStateContext == null || decodingStateContext.f48474xecc5d029) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "signalInputEOS");
        this.f48444xe655caa9.f48474xecc5d029 = true;
        this.f48449xe0f0f5a1.mo96258xfe5642d9(i17, 0, 0, 0L, 4);
    }

    /* renamed from: switchToErrorState */
    private synchronized void m97884x33e13198(java.lang.Exception exc) {
        if (this.f48459x68ac491 != com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Released && this.f48459x68ac491 != com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Releasing) {
            this.f48439x1f2ec1ad = exc;
            this.f48459x68ac491 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.State.Error;
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "switchToErrorState: Has released. exception:" + exc);
    }

    /* renamed from: trySamplingTargetFrame */
    private boolean m97885x44f44a3a(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25806x6f46c0a1 c25806x6f46c0a1;
        boolean m97886x96659b17 = m97886x96659b17(z17);
        if (m97886x96659b17 || (c25806x6f46c0a1 = this.f48442x3fa790c1) == null || !z17) {
            return m97886x96659b17;
        }
        c25806x6f46c0a1.m97841xaad2a2ea();
        this.f48442x3fa790c1 = null;
        return true;
    }

    /* renamed from: trySamplingTargetFrameInternal */
    private boolean m97886x96659b17(boolean z17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub;
        java.util.LinkedList<com.p314xaae8f345.tav.p2959x5befac44.ofs.C25807xacfc92f7> linkedList = this.f48444xe655caa9.f48479xce178890;
        if (this.f48442x3fa790c1 != null && !linkedList.isEmpty()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f48442x3fa790c1.f48400x8fcb1336;
            while (linkedList.size() >= 2 && !linkedList.get(1).f48402x8f136bd0.m97222xf922bec1(c25738xead39d26.m97260x75286aac())) {
                this.f48460x602ddbd7.add(linkedList.removeFirst().f48403x602aa869);
            }
            int i17 = 0;
            while (i17 < linkedList.size()) {
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25807xacfc92f7 c25807xacfc92f7 = linkedList.get(i17);
                if (c25807xacfc92f7.f48402x8f136bd0.m97222xf922bec1(c25738xead39d26.m97258xb58839a5())) {
                    m97881xee0c4bf5(c25807xacfc92f7, i17);
                    return true;
                }
                int i18 = i17 + 1;
                if (i18 != linkedList.size()) {
                    sub = linkedList.get(i18).f48402x8f136bd0.sub(c25807xacfc92f7.f48402x8f136bd0);
                } else {
                    if (!z17) {
                        break;
                    }
                    sub = this.f48454xc9181ea0;
                }
                com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25807xacfc92f7.f48402x8f136bd0, sub);
                com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97249x6b10bcff = com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.m97249x6b10bcff(c25738xead39d26, c25738xead39d262);
                if (m97249x6b10bcff == com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26.f47873x2dc6f5f1) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "trySamplingDecodeTarget: no intersection why?");
                } else if (m97249x6b10bcff.m97256x51e8b0a().m97232x31040141() >= c25738xead39d26.m97256x51e8b0a().m97232x31040141() / 2 || m97249x6b10bcff.m97256x51e8b0a().m97228xb2c87fbf(c25738xead39d262.m97256x51e8b0a()) || !c25738xead39d262.m97258xb58839a5().m97238x9f3f7b48(c25738xead39d26.m97258xb58839a5())) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "trySamplingDecodeTarget: choose frame pts:" + c25807xacfc92f7.f48402x8f136bd0.m97231x793685bc() + " duration:" + sub.m97231x793685bc() + " sampleTimeRange:" + c25738xead39d26.m97260x75286aac().m97231x793685bc() + " - " + c25738xead39d26.m97256x51e8b0a().m97231x793685bc());
                    m97881xee0c4bf5(c25807xacfc92f7, i17);
                    return true;
                }
                i17 = i18;
            }
            if (this.f48442x3fa790c1 != null && z17 && !linkedList.isEmpty()) {
                m97881xee0c4bf5(linkedList.getLast(), linkedList.size() - 1);
                return true;
            }
        }
        return false;
    }

    /* renamed from: finalize */
    public void m97887xd764dc1e() {
        super.finalize();
        mo97565x41012807(false);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo97357xc291ccac() {
        return this.f48441xb3470cef;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: getPreReadCost */
    public long mo97558x15b5cd10() {
        return this.f48457x3bdf8646;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getSourcePath */
    public java.lang.String mo97358xabff72d6() {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f48446xf0edce24;
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

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "handleMessage - " + message);
        switch (message.what) {
            case 1:
                m97872xf7379bf((com.p314xaae8f345.tav.p2959x5befac44.ofs.C25813x3e383517) message.obj);
                return true;
            case 2:
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25816x51d7195c c25816x51d7195c = (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25816x51d7195c) message.obj;
                m97876x585bff1a(c25816x51d7195c.f48534x16fae70, c25816x51d7195c.f48533x68ac462, c25816x51d7195c.f48532xf5bc2045);
                return true;
            case 3:
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25814x9adce54b c25814x9adce54b = (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25814x9adce54b) message.obj;
                m97875xb252375b(c25814x9adce54b.f48529xe30e87b3, c25814x9adce54b.f48528x4d87aa05, c25814x9adce54b.f48527xf5bc2045);
                return true;
            case 4:
                m97871xad05982();
                return true;
            case 5:
                m97873x636e94bf(((java.lang.Boolean) message.obj).booleanValue());
                return true;
            case 6:
                com.p314xaae8f345.tav.p2959x5befac44.ofs.C25815x3a674437 c25815x3a674437 = (com.p314xaae8f345.tav.p2959x5befac44.ofs.C25815x3a674437) message.obj;
                m97874x63bc5f47(c25815x3a674437.f48531xe30e87b3, c25815x3a674437.f48530xf5bc2045);
                return true;
            default:
                return false;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: hasTrack */
    public synchronized boolean mo97359x7c8fed1() {
        return this.f48461x43ea5e47 != -1;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: init */
    public void mo97560x316510(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: isLastFrameValid */
    public boolean mo97561xa27b058f() {
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: nextFrameTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo97562x99ce2827(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return c25736x76b98a57.add(this.f48454xc9181ea0);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: outputBuffer */
    public synchronized java.nio.ByteBuffer mo97362xdb4114a1() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: outputSurface */
    public synchronized android.view.Surface mo97563x10d4786c() {
        return this.f48455x10d4786c;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97363xe121b2e0() {
        return mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: readVideoSampleBuffer */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo97564xe7f79baf(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readVideoSampleBuffer: targetTime" + c25736x76b98a57);
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-2L));
        }
        if (i17 == 5) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "seekTo: in invalid state: " + this.f48459x68ac491);
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L));
        }
        final com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14[] c25734xcdff9c14Arr = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14[1];
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        android.os.Handler handler = this.f48447x294b574a;
        handler.sendMessage(android.os.Message.obtain(handler, 6, new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25815x3a674437(c25736x76b98a57, new com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25805x86be1473() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.4
            @Override // com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25805x86be1473
            /* renamed from: onDecodeFrame */
            public void mo97839x624fb4c0(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
                c25734xcdff9c14Arr[0] = c25734xcdff9c14;
                countDownLatch.countDown();
            }
        })));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "seekTo: interrupted.");
        }
        return c25734xcdff9c14Arr[0];
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: release */
    public void mo97365x41012807() {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: seekTo */
    public synchronized void mo97367xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        mo97566xc9fc1b13(c25736x76b98a57, true);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: setLogger */
    public void mo97368x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
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

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return mo97564xe7f79baf(c25736x76b98a57).m97193x75286adb();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: release */
    public synchronized void mo97565x41012807(boolean z17) {
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "release:start " + z17);
        android.os.Handler handler = this.f48447x294b574a;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        android.os.Handler handler2 = this.f48447x294b574a;
        handler2.sendMessage(android.os.Message.obtain(handler2, 5, java.lang.Boolean.valueOf(z17)));
        this.f48448xe30131f4.quitSafely();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: seekTo */
    public synchronized void mo97566xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "seekTo: " + c25736x76b98a57 + "  - " + this + " " + this.f48444xe655caa9);
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != 5) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            android.os.Handler handler = this.f48447x294b574a;
            handler.sendMessage(android.os.Message.obtain(handler, 3, new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25814x9adce54b(c25736x76b98a57, z17, new com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.3
                @Override // com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488
                /* renamed from: onCompletion */
                public void mo97847xa6db431b() {
                    countDownLatch.countDown();
                }
            })));
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "seekTo: interrupted.");
            }
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "seekTo: in invalid state: " + this.f48459x68ac491);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: start */
    public synchronized void mo97370x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "start:" + mo97358xabff72d6() + " [timeRange " + c25738xead39d26 + "] [start " + c25736x76b98a57 + "] [state " + this.f48459x68ac491 + "]");
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296.AnonymousClass5.f48472x6e0a83a8[this.f48459x68ac491.ordinal()];
        if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != 5) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            android.os.Handler handler = this.f48447x294b574a;
            handler.sendMessage(android.os.Message.obtain(handler, 2, new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25816x51d7195c(c25738xead39d26, c25736x76b98a57, new com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.2
                @Override // com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25809x611e9488
                /* renamed from: onCompletion */
                public void mo97847xa6db431b() {
                    countDownLatch.countDown();
                }
            })));
            try {
                countDownLatch.await();
                mo97364xe121b2e0(c25736x76b98a57);
                return;
            } catch (java.lang.InterruptedException unused) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "start: interrupted.");
                return;
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "start: in invalid state: " + this.f48459x68ac491);
    }
}
