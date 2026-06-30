package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016;

/* renamed from: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper */
/* loaded from: classes14.dex */
public abstract class AbstractC26494xe34e9411 implements com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd {

    /* renamed from: CANT_REUSE_LIMIT */
    public static final int f54094x23a3d0d5 = 3;

    /* renamed from: ID_HISTORY_LIMIT */
    public static final int f54095xc8a64fec = 100;

    /* renamed from: METHOD_DEQUEUE_INPUT_BUFFER */
    public static final int f54096x8ea451e2 = 0;

    /* renamed from: METHOD_DEQUEUE_OUTPUT_BUFFER */
    public static final int f54097x9d0ab371 = 1;

    /* renamed from: TRY_AGAIN_LATER_LIMIT */
    public static final int f54098x9a5d7e5 = 100;

    /* renamed from: mSurfaceMap */
    private static final java.util.Map<android.view.Surface, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411> f54099x5da05dbc = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: mAdaptationMode */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.AdaptationWorkaroundMode f54100x3c917f23;

    /* renamed from: mAdaptive */
    public boolean f54101xd7257e03;

    /* renamed from: mBackupSurface */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c f54102x6d36791e;

    /* renamed from: mCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b f54103x1ab9c7d2;

    /* renamed from: mCantReuseCount */
    private int f54104x312d868c;

    /* renamed from: mCapabilities */
    private android.media.MediaCodecInfo.CodecCapabilities f54105x3eea28c3;

    /* renamed from: mCodec */
    private final android.media.MediaCodec f54106xbde45ba9;

    /* renamed from: mCodecMaxValues */
    protected final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26490x18ff2850 f54107x5b6b65fd;

    /* renamed from: mCodecName */
    protected final java.lang.String f54108x37b14dd4;

    /* renamed from: mDecodeState */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.DecodeState f54109xf0865896 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.DecodeState.Started;

    /* renamed from: mDequeueInOutputTryAgainCount */
    private final int[] f54110x6f456881;

    /* renamed from: mErrorHappened */
    private boolean f54111x2a0e05fc;

    /* renamed from: mFormat */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c f54112x3cc1ec4;

    /* renamed from: mHasAlwaysTryAgainError */
    private boolean f54113xd99b40a7;

    /* renamed from: mHasConfigureCalled */
    private boolean f54114x77bd2b56;

    /* renamed from: mHasReused */
    private boolean f54115x67f695bd;

    /* renamed from: mHoldBufferOutIndex */
    private final java.util.HashSet<java.lang.Integer> f54116x25c40470;

    /* renamed from: mIsRecycled */
    public boolean f54117x7dcc7fc8;

    /* renamed from: mReleaseCalled */
    private boolean f54118xfabb22f7;

    /* renamed from: mReuseType */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType f54119x743519e1;

    /* renamed from: mSecure */
    public boolean f54120x19678244;

    /* renamed from: mState */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState f54121xbec81024;

    /* renamed from: mStoreToRelease */
    private final java.util.Set<android.graphics.SurfaceTexture> f54122xeadc1ef8;

    /* renamed from: mSurface */
    protected android.view.Surface f54123x2fa29f80;

    /* renamed from: mTag */
    private final java.lang.String f54124x32d3ed;

    /* renamed from: mThreadId */
    private long f54125x7cd36452;

    /* renamed from: mThreadIdHistory */
    private final java.util.ArrayList<java.lang.Long> f54126xd5ecf7e2;

    /* renamed from: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper$2, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: $SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType */
        static final /* synthetic */ int[] f54128x7d50a2f;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.m103496xcee59d22().length];
            f54128x7d50a2f = iArr;
            try {
                iArr[com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_NO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f54128x7d50a2f[com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f54128x7d50a2f[com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f54128x7d50a2f[com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITH_FLUSH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper$CodecState */
    /* loaded from: classes14.dex */
    public enum CodecState {
        Uninitialized,
        Configured,
        Error,
        Flushed,
        Running,
        EndOfStream,
        Released
    }

    /* renamed from: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper$DecodeState */
    /* loaded from: classes14.dex */
    public enum DecodeState {
        Started,
        DequeueIn,
        QueueIn,
        DequeueOut,
        ReleaseOut
    }

    public AbstractC26494xe34e9411(android.media.MediaCodec mediaCodec, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        java.lang.String str = "ReuseCodecWrapper[" + hashCode() + "]";
        this.f54124x32d3ed = str;
        this.f54116x25c40470 = new java.util.HashSet<>();
        this.f54126xd5ecf7e2 = new java.util.ArrayList<>();
        this.f54122xeadc1ef8 = new java.util.LinkedHashSet();
        this.f54110x6f456881 = new int[2];
        this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Uninitialized;
        this.f54119x743519e1 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_NO;
        boolean z17 = false;
        this.f54111x2a0e05fc = false;
        this.f54113xd99b40a7 = false;
        this.f54104x312d868c = 0;
        this.f54106xbde45ba9 = mediaCodec;
        this.f54112x3cc1ec4 = c26493xe13fc07c;
        this.f54107x5b6b65fd = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26490x18ff2850(c26493xe13fc07c.f54089x17dd56c2, c26493xe13fc07c.f54087xc9fe87ab, c26493xe13fc07c.f54088x10e801e7);
        java.lang.String m103541x481b1b8e = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103541x481b1b8e(mediaCodec);
        this.f54108x37b14dd4 = m103541x481b1b8e;
        this.f54100x3c917f23 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.m103487xef90f50a(m103541x481b1b8e);
        boolean z18 = android.os.Build.VERSION.SDK_INT != 29 || c26493xe13fc07c.f54090x461e29c9 == 0;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(str, "canCallGetCodecInfo:" + z18);
        if (z18) {
            this.f54105x3eea28c3 = mediaCodec.getCodecInfo().getCapabilitiesForType(c26493xe13fc07c.f54091x7fd47d58);
        }
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f54105x3eea28c3;
        this.f54101xd7257e03 = codecCapabilities != null && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103547x82df7dc0(codecCapabilities);
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f54105x3eea28c3;
        if (codecCapabilities2 != null && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103549xf2284d41(codecCapabilities2)) {
            z17 = true;
        }
        this.f54120x19678244 = z17;
    }

    /* renamed from: bindingToBackupSurface */
    private void m103394x3f7ac08b() {
        if (this.f54102x6d36791e != null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c c26507x4073a84c = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c(1, 1);
        this.f54102x6d36791e = c26507x4073a84c;
        m103402xb97ec1a0(c26507x4073a84c.m103476xcf572877(), true, true);
    }

    /* renamed from: byte2HexString */
    private java.lang.String m103395x3322ce02(java.lang.Byte b17) {
        return java.lang.String.format("%02X", java.lang.Integer.valueOf(b17.intValue() & 255));
    }

    /* renamed from: checkSurfaceState */
    private int m103396x3b9fb90c(android.view.Surface surface) {
        if (surface == null) {
            return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
        }
        if (surface.isValid()) {
            return 0;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103397xaf65a0fc(android.media.MediaCodec mediaCodec, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103552x7b98c171(str) ? new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26495xaba8af98(mediaCodec, c26493xe13fc07c) : new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26488x28070673(mediaCodec, c26493xe13fc07c);
    }

    /* renamed from: dumpInputBuffer */
    private void m103398x73c7c616(int i17, int i18, int i19, long j17, int i27) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103298x7a994349()) {
            try {
                java.nio.ByteBuffer byteBuffer = this.f54106xbde45ba9.getInputBuffers()[i17];
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n########################## " + this + " dumpInputBuffer ###################");
                for (int i28 = 0; i28 < 4; i28++) {
                    sb6.append("\n");
                    for (int i29 = 0; i29 < 16; i29++) {
                        sb6.append(" ");
                        sb6.append(m103395x3322ce02(java.lang.Byte.valueOf(byteBuffer.get((i28 * 4) + i18 + i29))));
                    }
                }
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.v(this.f54124x32d3ed, sb6.toString());
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(this.f54124x32d3ed, "dumpInputBuffer error", th6);
            }
        }
    }

    /* renamed from: handleCoreAPIException */
    private void m103399xacfca6dc(int i17, java.lang.String str, java.lang.Throwable th6) {
        m103400xacfca6dc(i17, str, th6, false, this.f54123x2fa29f80);
    }

    /* renamed from: innerSetOutputSurface */
    private void m103401xb97ec1a0(android.view.Surface surface) {
        m103402xb97ec1a0(surface, true, false);
    }

    /* renamed from: isAlwaysTryAgain */
    private boolean m103403x61535d5e(int i17, int i18) {
        if (i18 != -1) {
            this.f54110x6f456881[i17] = 0;
            return false;
        }
        int[] iArr = this.f54110x6f456881;
        int i19 = iArr[i17] + 1;
        iArr[i17] = i19;
        return i19 > 100;
    }

    /* renamed from: isNotMyThread */
    private boolean m103404x95e63f3f() {
        return java.lang.Thread.currentThread().getId() != this.f54125x7cd36452;
    }

    /* renamed from: onReuseCodec */
    private void m103405xfc654141() {
        int[] iArr = this.f54110x6f456881;
        iArr[0] = 0;
        iArr[1] = 0;
    }

    /* renamed from: processInputBufferWithReConfig */
    private final void m103406xe36da496(int i17, int i18, int i19, long j17, int i27) {
        this.f54106xbde45ba9.queueInputBuffer(i17, i18, i19, j17, i27);
    }

    /* renamed from: queueInputBufferForAdaptation */
    private final void m103407x3a036063(int i17, int i18, int i19, long j17, int i27) {
        int i28 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.AnonymousClass2.f54128x7d50a2f[this.f54119x743519e1.ordinal()];
        if (i28 == 1) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "queueInputBufferForAdaptation error for KEEP_CODEC_RESULT_NO");
        } else if (i28 == 2) {
            m103406xe36da496(i17, i18, i19, j17, i27);
        } else {
            if (i28 != 3) {
                return;
            }
            this.f54106xbde45ba9.queueInputBuffer(i17, i18, i19, j17, i27);
        }
    }

    /* renamed from: realConfigure */
    private void m103409x921ae8(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        int i18;
        java.lang.String str = null;
        try {
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                str = this + ", realConfigure mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i17 + " state:" + this.f54121xbec81024 + " mHasConfigureCalled：" + this.f54114x77bd2b56;
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, str);
            }
            this.f54106xbde45ba9.configure(mediaFormat, surface, mediaCrypto, i17);
            m103412x42c875eb(surface);
            this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Configured;
        } catch (java.lang.Throwable th6) {
            java.lang.String str2 = str;
            if (th6 instanceof java.lang.IllegalStateException) {
                i18 = 10000;
            } else {
                i18 = th6 instanceof android.media.MediaCodec.CryptoException ? 10001 : 0;
            }
            m103400xacfca6dc(i18, str2, th6, true, surface);
            throw th6;
        }
    }

    /* renamed from: releaseCodecWhenError */
    private void m103410x9e04cf5f(int i17) {
        if (i17 < 40000) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(this.f54124x32d3ed, this + "    releaseCodecWhenError, errorCode:" + i17);
            mo103373x41012807();
        }
    }

    /* renamed from: resetParam */
    private void m103411x9b38047e() {
        this.f54113xd99b40a7 = false;
        this.f54104x312d868c = 0;
    }

    /* renamed from: setSurface */
    private void m103412x42c875eb(android.view.Surface surface) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(this.f54124x32d3ed, this + ", oldSurface:" + this.f54123x2fa29f80 + " CodecWrapperSetSurface surface:" + surface);
        }
        this.f54123x2fa29f80 = surface;
    }

    /* renamed from: trackDecodeApi */
    private void m103413xbe727441(int i17, int i18) {
        if (this.f54113xd99b40a7 || !m103403x61535d5e(i17, i18)) {
            return;
        }
        this.f54113xd99b40a7 = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(", trackDecodeApi state:");
        sb6.append(this.f54121xbec81024);
        sb6.append("  surfaceState:");
        android.view.Surface surface = this.f54123x2fa29f80;
        sb6.append(surface != null ? java.lang.Boolean.valueOf(surface.isValid()) : null);
        java.lang.String sb7 = sb6.toString();
        if (i17 == 0) {
            m103399xacfca6dc(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54057xa587db98, sb7, null);
        } else if (i17 == 1) {
            m103399xacfca6dc(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54060x9c452acf, sb7, null);
        }
    }

    /* renamed from: unBindingBackupSurface */
    private void m103414x339c6e3f() {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, this + "unBindingBackupSurface");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb.C26507x4073a84c c26507x4073a84c = this.f54102x6d36791e;
        if (c26507x4073a84c != null) {
            c26507x4073a84c.m103478x41012807();
        }
        this.f54102x6d36791e = null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: attachThread */
    public void mo103363x800860af() {
        long id6 = java.lang.Thread.currentThread().getId();
        if (this.f54126xd5ecf7e2.contains(java.lang.Long.valueOf(id6))) {
            return;
        }
        this.f54125x7cd36452 = id6;
        this.f54126xd5ecf7e2.add(java.lang.Long.valueOf(id6));
        if (this.f54126xd5ecf7e2.size() > 100) {
            this.f54126xd5ecf7e2.remove(0);
        }
    }

    /* renamed from: canReuse */
    public abstract com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103361xf7b91884(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c);

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: canReuseType */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103364xccd939de(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103361xf7b91884 = mo103361xf7b91884(c26493xe13fc07c);
        this.f54119x743519e1 = mo103361xf7b91884;
        return mo103361xf7b91884;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: configure */
    public void mo103366xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore call method configure for isNotMyThread");
            return;
        }
        this.f54114x77bd2b56 = true;
        this.f54118xfabb22f7 = false;
        if (this.f54121xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Uninitialized) {
            m103409x921ae8(mediaFormat, surface, mediaCrypto, i17);
        } else if (surface != null) {
            m103405xfc654141();
            m103401xb97ec1a0(surface);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: dequeueInputBuffer */
    public int mo103367x9a572d5a(long j17) {
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore call method dequeueInputBuffer for isNotMyThread");
            return -1;
        }
        int i17 = 0;
        java.lang.String str = null;
        try {
            int dequeueInputBuffer = this.f54106xbde45ba9.dequeueInputBuffer(j17);
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                str = this + ", dequeueInputBuffer state:" + this.f54121xbec81024 + " decodeState:" + this.f54109xf0865896 + " , result=" + dequeueInputBuffer;
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.v(this.f54124x32d3ed, str);
            }
            this.f54109xf0865896 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.DecodeState.DequeueIn;
            this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Running;
            m103413xbe727441(0, dequeueInputBuffer);
            return dequeueInputBuffer;
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof java.lang.IllegalStateException) {
                i17 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
            } else if (th6 instanceof java.lang.IllegalArgumentException) {
                i17 = 40001;
            }
            m103399xacfca6dc(i17, str, th6);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: dequeueOutputBuffer */
    public int mo103368x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore call method dequeueOutputBuffer for isNotMyThread");
            return -1;
        }
        java.lang.String str = null;
        try {
            int dequeueOutputBuffer = this.f54106xbde45ba9.dequeueOutputBuffer(bufferInfo, j17);
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                str = this + ", dequeueOutputBuffer outIndex:" + dequeueOutputBuffer;
                if (this instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26495xaba8af98) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.v(this.f54124x32d3ed, str);
                }
            }
            this.f54116x25c40470.add(java.lang.Integer.valueOf(dequeueOutputBuffer));
            this.f54109xf0865896 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.DecodeState.DequeueOut;
            m103413xbe727441(1, dequeueOutputBuffer);
            return dequeueOutputBuffer;
        } catch (java.lang.Throwable th6) {
            m103399xacfca6dc(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8 : 0 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54061x54ac4478, str, th6);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: flush */
    public void mo103369x5d03b04() {
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "call method flush for isNotMyThread...");
        }
        java.lang.String str = null;
        try {
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                str = this + ", flush state:" + this.f54121xbec81024;
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, str);
            }
            this.f54106xbde45ba9.flush();
            this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Flushed;
        } catch (java.lang.Throwable th6) {
            m103399xacfca6dc(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54064xffc564fb : 0 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4, str, th6);
            throw th6;
        }
    }

    /* renamed from: getCallback */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b m103415x71965dbb() {
        return this.f54103x1ab9c7d2;
    }

    /* renamed from: getCodec */
    public final android.media.MediaCodec m103416x7444b660() {
        return this.f54106xbde45ba9;
    }

    /* renamed from: getCodecName */
    public java.lang.String m103417xbc67750b() {
        return this.f54108x37b14dd4;
    }

    /* renamed from: getFormat */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c m103418x19771aed() {
        return this.f54112x3cc1ec4;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: getMediaCodec */
    public android.media.MediaCodec mo103370x6053b688() {
        return this.f54106xbde45ba9;
    }

    /* renamed from: isNeedKeep */
    public boolean mo103419x44c9485() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103299x94d1bfc7() ? !this.f54111x2a0e05fc && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103309x172a8d6a() && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103308xc870f2a0() : !this.f54111x2a0e05fc && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103309x172a8d6a();
    }

    /* renamed from: isReleaseCalled */
    public final boolean m103420x20ec715a() {
        return this.f54118xfabb22f7;
    }

    /* renamed from: needToErase */
    public boolean m103421x8b2ac375() {
        return this.f54104x312d868c >= 3;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: prepareToReUse */
    public void mo103371xe451a992() {
        m103411x9b38047e();
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103299x94d1bfc7()) {
            if (this.f54121xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Running) {
                try {
                    mo103369x5d03b04();
                } catch (java.lang.IllegalStateException e17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(this.f54124x32d3ed, "flush failed in prepareToReUse", e17);
                }
            }
        } else if (this.f54121xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Flushed) {
            mo103369x5d03b04();
        }
        this.f54115x67f695bd = true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: queueInputBuffer */
    public void mo103372xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        java.lang.String str;
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore call method queueInputBuffer for isNotMyThread");
            return;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            str = this + ", queueInputBuffer index:" + i17 + " offset:" + i18 + " size:" + i19 + " presentationTimeUs:" + j17 + " flags:" + i27 + " state:" + this.f54121xbec81024 + " decodeState:" + this.f54109xf0865896;
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.v(this.f54124x32d3ed, str);
        } else {
            str = null;
        }
        try {
            if (this.f54115x67f695bd) {
                m103407x3a036063(i17, i18, i19, j17, i27);
            } else {
                this.f54106xbde45ba9.queueInputBuffer(i17, i18, i19, j17, i27);
            }
            this.f54109xf0865896 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.DecodeState.QueueIn;
        } catch (java.lang.Throwable th6) {
            m103399xacfca6dc(!(th6 instanceof android.media.MediaCodec.CodecException) ? !(th6 instanceof java.lang.IllegalStateException) ? th6 instanceof android.media.MediaCodec.CryptoException ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54066x39a4c2d7 : 0 : 50000 : 50001, str, th6);
            throw th6;
        }
    }

    /* renamed from: recycle */
    public final void m103422x408b7293() {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, this + ", recycle isRecycled:" + this.f54117x7dcc7fc8 + "  mSurfaceMap.size:" + f54099x5da05dbc.size() + "...... stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        if (this.f54117x7dcc7fc8) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore recycle for has isRecycled is true.");
            return;
        }
        this.f54114x77bd2b56 = false;
        this.f54117x7dcc7fc8 = true;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26517x68dfca23.m103557x309ebdc0(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.this.f54106xbde45ba9.stop();
                        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.this.f54106xbde45ba9.release();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.this.f54106xbde45ba9.release();
                        throw th6;
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.this.f54124x32d3ed, "recycle codec ignore error,", th7);
                }
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.this.f54103x1ab9c7d2 != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.this.f54103x1ab9c7d2.mo103358x7086812a();
                }
            }
        });
        this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Uninitialized;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: release */
    public void mo103373x41012807() {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, this + " call release mHoldBufferOutIndex:" + this.f54116x25c40470 + " mReleaseCalled:" + this.f54118xfabb22f7 + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        this.f54118xfabb22f7 = true;
        this.f54114x77bd2b56 = false;
        if (mo103419x44c9485()) {
            try {
                mo103369x5d03b04();
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(this.f54124x32d3ed, "flush failed for not in the Executing state.", e17);
            }
            m103394x3f7ac08b();
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103312xd1ba8172(this);
            return;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "Don't not keep the codec, release it ..., mErrorHappened:" + this.f54111x2a0e05fc);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103313xac8a81f(this);
        m103422x408b7293();
        this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Released;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: releaseOutputBuffer */
    public void mo103375xab26be48(int i17, boolean z17) {
        java.lang.String str;
        int i18;
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            str = this + ", releaseOutputBuffer render:" + z17;
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.v(this.f54124x32d3ed, str);
        } else {
            str = null;
        }
        try {
            this.f54116x25c40470.remove(java.lang.Integer.valueOf(i17));
            this.f54106xbde45ba9.releaseOutputBuffer(i17, z17);
        } catch (java.lang.Throwable th6) {
            if (this.f54121xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Flushed) {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, this + ", releaseOutputBuffer failed, ignore e:", th6);
            }
            if (th6 instanceof android.media.MediaCodec.CodecException) {
                i18 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54068xa74f9ecf;
            } else {
                i18 = th6 instanceof java.lang.IllegalStateException ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54069x7617ffff : 0;
            }
            m103399xacfca6dc(i18, str, th6);
        }
        this.f54109xf0865896 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.DecodeState.ReleaseOut;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: reset */
    public void mo103376x6761d4f() {
        java.lang.String str = null;
        try {
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                str = this + ", callMsg state:" + this.f54121xbec81024;
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, str);
            }
            if (mo103419x44c9485()) {
                return;
            }
            this.f54106xbde45ba9.reset();
            this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Uninitialized;
        } catch (java.lang.Throwable th6) {
            m103399xacfca6dc(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54071x6575cc46 : 0 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54070x4810c209, str, th6);
            throw th6;
        }
    }

    /* renamed from: setCallback */
    public final void m103423x6c4ebec7(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b interfaceC26486x9cae4e5b) {
        this.f54103x1ab9c7d2 = interfaceC26486x9cae4e5b;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: setCodecCallback */
    public void mo103377xbd454139(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b interfaceC26486x9cae4e5b) {
        this.f54103x1ab9c7d2 = interfaceC26486x9cae4e5b;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: setOutputSurface */
    public void mo103378x610a9b2a(android.view.Surface surface) {
        m103402xb97ec1a0(surface, false, false);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: start */
    public void mo103379x68ac462() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState codecState = this.f54121xbec81024;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState codecState2 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Configured;
        if (codecState != codecState2) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, "start ignore:" + this.f54121xbec81024);
            return;
        }
        java.lang.String str = null;
        try {
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                str = this + ", start state:" + this.f54121xbec81024;
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, str);
            }
            if (this.f54121xbec81024 == codecState2) {
                this.f54106xbde45ba9.start();
                this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Running;
            }
        } catch (java.lang.Throwable th6) {
            m103399xacfca6dc(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059 : 0 : 20001, str, th6);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: stop */
    public void mo103380x360802() {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, this + ", stop");
        }
        if (mo103419x44c9485()) {
            return;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, this + ", codec real stop");
        }
        try {
            this.f54106xbde45ba9.stop();
            this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Uninitialized;
        } catch (java.lang.IllegalStateException e17) {
            this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Uninitialized;
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(this.f54124x32d3ed, "stop failed", e17);
            throw e17;
        }
    }

    /* renamed from: toString */
    public java.lang.String mo103362x9616526c() {
        return super.toString() + " mReleaseCalled:" + this.f54118xfabb22f7 + " isRecycled:" + this.f54117x7dcc7fc8;
    }

    /* renamed from: trackCantReuse */
    public void m103424xd8193525() {
        this.f54104x312d868c++;
    }

    /* renamed from: handleCoreAPIException */
    private void m103400xacfca6dc(int i17, java.lang.String str, java.lang.Throwable th6, boolean z17, android.view.Surface surface) {
        int m103396x3b9fb90c;
        this.f54111x2a0e05fc = true;
        java.lang.String str2 = str + " handleCoreAPIException exception:" + (th6 == null ? "" : th6.getLocalizedMessage());
        if (z17 && (m103396x3b9fb90c = m103396x3b9fb90c(surface)) != 0) {
            i17 = m103396x3b9fb90c;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i17);
            jSONObject.put("exceptionMsg", str2);
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b interfaceC26486x9cae4e5b = this.f54103x1ab9c7d2;
            if (interfaceC26486x9cae4e5b != null) {
                interfaceC26486x9cae4e5b.mo102099x55167336(jSONObject.toString(), th6);
            }
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(this.f54124x32d3ed, "hasReused:" + this.f54115x67f695bd + "    errorCode:" + i17 + ", " + str2, th6);
        m103410x9e04cf5f(i17);
    }

    /* renamed from: innerSetOutputSurface */
    private void m103402xb97ec1a0(android.view.Surface surface, boolean z17, boolean z18) {
        java.lang.String str;
        int i17;
        if (this.f54123x2fa29f80 == surface) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, this + ", innerSetOutputSurface error surface:" + surface + " is same, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            str = this + " configure, call innerSetOutputSurface surface:" + surface + "  decodeState:" + this.f54109xf0865896 + " callByInner:" + z17;
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, str);
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        try {
            m103412x42c875eb(surface);
            this.f54106xbde45ba9.setOutputSurface(surface);
            if (z18) {
                return;
            }
            m103414x339c6e3f();
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof java.lang.IllegalStateException) {
                i17 = 30000;
            } else {
                i17 = th6 instanceof java.lang.IllegalArgumentException ? 30001 : 0;
            }
            m103400xacfca6dc(i17, str2, th6, true, surface);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: configure */
    public void mo103365xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore call method configure for isNotMyThread");
            return;
        }
        this.f54114x77bd2b56 = true;
        this.f54118xfabb22f7 = false;
        if (this.f54121xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Uninitialized) {
            m103408x921ae8(mediaFormat, surface, i17, mediaDescrambler);
        } else if (surface != null) {
            m103405xfc654141();
            m103401xb97ec1a0(surface);
        }
    }

    /* renamed from: realConfigure */
    private void m103408x921ae8(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        java.lang.String str;
        int i18;
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            str = this + ", configure mediaFormat:" + mediaFormat + " surface:" + surface + " flags:" + i17 + " descrambler:" + mediaDescrambler + " state:" + this.f54121xbec81024 + " mHasConfigureCalled：" + this.f54114x77bd2b56;
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(this.f54124x32d3ed, str);
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        try {
            this.f54106xbde45ba9.configure(mediaFormat, surface, i17, mediaDescrambler);
            m103412x42c875eb(surface);
            this.f54121xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.CodecState.Configured;
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof android.media.MediaCodec.CodecException) {
                i18 = 10002;
            } else if (th6 instanceof java.lang.IllegalStateException) {
                i18 = 10000;
            } else {
                i18 = th6 instanceof android.media.MediaCodec.CryptoException ? 10001 : 0;
            }
            m103400xacfca6dc(i18, str2, th6, true, surface);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: releaseOutputBuffer */
    public void mo103374xab26be48(int i17, long j17) {
        java.lang.String str;
        int i18;
        if (m103404x95e63f3f()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(this.f54124x32d3ed, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            str = this + ", releaseOutputBuffer API21" + i17;
            if (this instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26495xaba8af98) {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.v(this.f54124x32d3ed, str);
            }
        } else {
            str = null;
        }
        this.f54116x25c40470.remove(java.lang.Integer.valueOf(i17));
        try {
            this.f54106xbde45ba9.releaseOutputBuffer(i17, j17);
            this.f54109xf0865896 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.DecodeState.ReleaseOut;
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof android.media.MediaCodec.CodecException) {
                i18 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54068xa74f9ecf;
            } else {
                i18 = th6 instanceof java.lang.IllegalStateException ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54069x7617ffff : 0;
            }
            m103399xacfca6dc(i18, str, th6);
            throw th6;
        }
    }
}
