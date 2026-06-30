package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26;

/* renamed from: com.tencent.thumbplayer.tmediacodec.TCodecManager */
/* loaded from: classes14.dex */
public final class C26484x826be92b {
    public static final java.lang.String TAG = "TCodecManager";

    /* renamed from: mInstance */
    private static final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b f54025x46143c22 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b();

    /* renamed from: mIsDebugVersion */
    private static boolean f54026x241be71c = false;

    /* renamed from: mIsLeakFixed */
    private static boolean f54027x3eded11a = true;

    /* renamed from: mConfigMethodCalled */
    private boolean f54031x7a57976d;

    /* renamed from: mReusePolicy */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6 f54034x33f42219 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6.f54200x86df6221;

    /* renamed from: mGlobalReuseEnable */
    private boolean f54032x20dd2887 = true;

    /* renamed from: mCodecMap */
    private final java.util.HashMap<com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd> f54030xf147c4f3 = new java.util.HashMap<>();

    /* renamed from: mPreloadCodecManager */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.C26506xc08c3740 f54033x60747db3 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.C26506xc08c3740();

    /* renamed from: mVideoCodecManager */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26501x8d192d30 f54035x307581e5 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26501x8d192d30();

    /* renamed from: mAudioCodecManager */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26501x8d192d30 f54029xacd3d8c0 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26501x8d192d30();

    /* renamed from: mAllowKeepPool */
    private boolean f54028xa23fa43d = true;

    /* renamed from: changeToReuseDisable */
    private void m103292x3a0657bf() {
        this.f54035x307581e5.mo103445xcedb1c04();
        this.f54029xacd3d8c0.mo103445xcedb1c04();
    }

    /* renamed from: createDirectCodecWrapper */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103293x7cc9d842(android.media.MediaFormat mediaFormat, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "createDirectCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + c26485xc3ef8206.m103334xe85b97e9() + " nameOrType:" + c26485xc3ef8206.m103337xbab0321e());
        }
        return c26485xc3ef8206.m103334xe85b97e9() == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.CreateBy.CreateByName ? new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26492xbd3fe46(android.media.MediaCodec.createByCodecName(c26485xc3ef8206.m103337xbab0321e())) : new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26492xbd3fe46(android.media.MediaCodec.createDecoderByType(c26485xc3ef8206.m103337xbab0321e()));
    }

    /* renamed from: createNewReuseCodecWrapper */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103294x58ddd8d(android.media.MediaFormat mediaFormat, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "createNewReuseCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + c26485xc3ef8206.m103334xe85b97e9() + " nameOrType:" + c26485xc3ef8206.m103337xbab0321e());
        }
        java.lang.String string = mediaFormat.getString("mime");
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c m103384xaf65a0fc = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c.m103384xaf65a0fc(mediaFormat);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.m103488x1717156c(m103384xaf65a0fc, mediaFormat);
        return c26485xc3ef8206.m103334xe85b97e9() == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.CreateBy.CreateByName ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.m103397xaf65a0fc(android.media.MediaCodec.createByCodecName(c26485xc3ef8206.m103337xbab0321e()), string, m103384xaf65a0fc) : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411.m103397xaf65a0fc(android.media.MediaCodec.createDecoderByType(string), string, m103384xaf65a0fc);
    }

    /* renamed from: getCodec */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103295x7444b660(android.media.MediaFormat mediaFormat, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, android.view.Surface surface) {
        boolean m103343x7b98c171 = c26485xc3ef8206.m103343x7b98c171();
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "getCodec isVideo:" + m103343x7b98c171 + " codecFinalReuseEnable:" + c26485xc3ef8206.f54037x735d79f7);
        }
        if (!c26485xc3ef8206.f54037x735d79f7) {
            c26485xc3ef8206.f54040xf06d0e5a = false;
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "getCodec return DirectCodecWrapper for mediaFormat:" + mediaFormat + " codecFinalReuseEnable:false surface:" + surface);
            }
            return m103293x7cc9d842(mediaFormat, c26485xc3ef8206);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c m103384xaf65a0fc = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c.m103384xaf65a0fc(mediaFormat);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103300xeb868ce2 = m103300xeb868ce2(m103343x7b98c171, m103384xaf65a0fc);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c.m103385x90e982d9(m103384xaf65a0fc.f54084xfa6c8c6a);
        if (m103300xeb868ce2 != null) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103364xccd939de = m103300xeb868ce2.mo103364xccd939de(m103384xaf65a0fc);
            if (mo103364xccd939de == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION || mo103364xccd939de == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "getCodec reuse, isVideo:" + m103343x7b98c171 + " reuseType:" + mo103364xccd939de);
                }
                m103300xeb868ce2.mo103363x800860af();
                m103300xeb868ce2.mo103371xe451a992();
                c26485xc3ef8206.f54040xf06d0e5a = true;
                return m103300xeb868ce2;
            }
            if (mo103364xccd939de == com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_NO && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "getCodec not reuse, isVideo:" + m103343x7b98c171 + " reuseType:" + mo103364xccd939de);
            }
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "getCodec not reuse, for can't find reUseAble CodecWrapper. isVideo:" + m103343x7b98c171);
        }
        c26485xc3ef8206.f54040xf06d0e5a = false;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103294x58ddd8d = m103294x58ddd8d(mediaFormat, c26485xc3ef8206);
        m103294x58ddd8d.mo103363x800860af();
        this.f54030xf147c4f3.put(c26485xc3ef8206, m103294x58ddd8d);
        return m103294x58ddd8d;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b m103296x9cf0d20b() {
        return f54025x46143c22;
    }

    /* renamed from: init */
    public static void m103297x316510() {
    }

    /* renamed from: isDebug */
    public static boolean m103298x7a994349() {
        return f54026x241be71c;
    }

    /* renamed from: isLeakFixed */
    public static boolean m103299x94d1bfc7() {
        return f54027x3eded11a;
    }

    /* renamed from: obtainCodecWrapper */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103300xeb868ce2(boolean z17, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        return (z17 ? this.f54035x307581e5 : this.f54029xacd3d8c0).mo103449xeb868ce2(c26493xe13fc07c);
    }

    /* renamed from: onCodecRunning */
    private void m103301xd58b0448(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd) {
        if (m103309x172a8d6a()) {
            if (interfaceC26491x6cbe3bbd instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26495xaba8af98) {
                this.f54035x307581e5.mo103452xa12918fc((com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411) interfaceC26491x6cbe3bbd);
            } else if (interfaceC26491x6cbe3bbd instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26488x28070673) {
                this.f54029xacd3d8c0.mo103452xa12918fc((com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411) interfaceC26491x6cbe3bbd);
            }
        }
    }

    /* renamed from: setIsDebug */
    public static void m103302x2bd7cc87(boolean z17) {
        f54026x241be71c = z17;
    }

    /* renamed from: setLeakFixed */
    public static void m103303xaa55af8f(boolean z17) {
        f54027x3eded11a = z17;
    }

    /* renamed from: clearAndReleaseKeepPool */
    public final void m103304xa76850be() {
        this.f54028xa23fa43d = false;
        this.f54035x307581e5.m103446xa76850be();
        this.f54029xacd3d8c0.m103446xa76850be();
    }

    /* renamed from: configure */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103306xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "configureStart videoPoolInfo:" + this.f54035x307581e5.m103447xfd563638() + ", audioPoolInfo:" + this.f54029xacd3d8c0.m103447xfd563638());
        }
        this.f54031x7a57976d = true;
        this.f54028xa23fa43d = true;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103295x7444b660 = m103295x7444b660(mediaFormat, c26485xc3ef8206, surface);
        m103301xd58b0448(m103295x7444b660);
        m103295x7444b660.mo103377xbd454139(c26485xc3ef8206.m103332x2a6edac5());
        m103295x7444b660.mo103366xd00d62e6(mediaFormat, surface, mediaCrypto, i17);
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "configureEnd   videoPoolInfo:" + this.f54035x307581e5.m103447xfd563638() + ", audioPoolInfo:" + this.f54029xacd3d8c0.m103447xfd563638());
        }
        return m103295x7444b660;
    }

    /* renamed from: getReusePolicy */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6 m103307x63bd5790() {
        return this.f54034x33f42219;
    }

    /* renamed from: isAllowKeepPool */
    public final boolean m103308xc870f2a0() {
        return this.f54028xa23fa43d;
    }

    /* renamed from: isGlobalReuseEnable */
    public final boolean m103309x172a8d6a() {
        return this.f54032x20dd2887;
    }

    /* renamed from: isVideoKeepPoolFull */
    public final boolean m103310x4f346f81() {
        return this.f54035x307581e5.m103448x30b2edba();
    }

    /* renamed from: preloadCodec */
    public final void m103311x5dd00f8d(java.lang.String str, java.lang.String str2) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.C26506xc08c3740.m103468x8ffbce1b(str)) {
            linkedHashSet.add(str);
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.C26506xc08c3740.m103468x8ffbce1b(str2)) {
            linkedHashSet.add(str2);
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "preloadCodec mimeTypeSet:" + linkedHashSet);
        }
        this.f54033x60747db3.m103470xed046e09(linkedHashSet);
    }

    /* renamed from: recycleCodecFromRunning */
    public final void m103312xd1ba8172(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd) {
        if (m103309x172a8d6a()) {
            if (interfaceC26491x6cbe3bbd instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26495xaba8af98) {
                this.f54035x307581e5.mo103451x6a083968((com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411) interfaceC26491x6cbe3bbd);
            } else if (interfaceC26491x6cbe3bbd instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26488x28070673) {
                this.f54029xacd3d8c0.mo103451x6a083968((com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411) interfaceC26491x6cbe3bbd);
            }
        }
    }

    /* renamed from: removeCodecFromRunningPool */
    public final void m103313xac8a81f(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd) {
        if (m103309x172a8d6a()) {
            if (interfaceC26491x6cbe3bbd instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26495xaba8af98) {
                this.f54035x307581e5.mo103450xd8b47791((com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411) interfaceC26491x6cbe3bbd);
            } else if (interfaceC26491x6cbe3bbd instanceof com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26488x28070673) {
                this.f54029xacd3d8c0.mo103450xd8b47791((com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411) interfaceC26491x6cbe3bbd);
            }
        }
    }

    /* renamed from: reuseEnable */
    public boolean m103314x770e9117(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, android.view.Surface surface) {
        boolean m103309x172a8d6a = m103309x172a8d6a();
        boolean m103342x23032d8d = c26485xc3ef8206.m103342x23032d8d();
        boolean m103343x7b98c171 = c26485xc3ef8206.m103343x7b98c171();
        boolean z17 = m103309x172a8d6a && m103342x23032d8d;
        boolean z18 = !com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103540x9e82986f();
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "reuseEnable getCodec isVideo:" + m103343x7b98c171 + " reuseEnable:" + z17 + " globalReuseEnable:" + m103309x172a8d6a + " mediaCodecReuseEnable:" + m103342x23032d8d + " canUseSetOutputSurfaceAPI:" + z18 + " ,surface:" + surface);
        }
        return z17 && m103343x7b98c171 && z18 && surface != null;
    }

    /* renamed from: setGlobalReuseEnable */
    public final void m103315xb2c63532(boolean z17) {
        if (this.f54032x20dd2887 != z17) {
            this.f54032x20dd2887 = z17;
            if (!this.f54031x7a57976d || z17) {
                return;
            }
            m103292x3a0657bf();
        }
    }

    /* renamed from: setLogEnable */
    public final void m103316xb7de63a5(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103514xb7de63a5(z17);
    }

    /* renamed from: setLogLevel */
    public final void m103317xed871122(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103515xed871122(i17);
    }

    /* renamed from: setLogProxy */
    public final void m103318xedc5400c(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3 interfaceC26512xc290acf3) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103516xedc5400c(interfaceC26512xc290acf3);
    }

    /* renamed from: setReusePolicy */
    public final void m103319xfa22cb04(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6 c26510xed50b8a6) {
        this.f54034x33f42219 = c26510xed50b8a6;
    }

    /* renamed from: configure */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103305xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "configureStart videoPoolInfo:" + this.f54035x307581e5.m103447xfd563638() + ", audioPoolInfo:" + this.f54029xacd3d8c0.m103447xfd563638());
        }
        this.f54031x7a57976d = true;
        this.f54028xa23fa43d = true;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103295x7444b660 = m103295x7444b660(mediaFormat, c26485xc3ef8206, surface);
        m103295x7444b660.mo103377xbd454139(c26485xc3ef8206.m103332x2a6edac5());
        m103301xd58b0448(m103295x7444b660);
        m103295x7444b660.mo103365xd00d62e6(mediaFormat, surface, i17, mediaDescrambler);
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "configureEnd   videoPoolInfo:" + this.f54035x307581e5.m103447xfd563638() + ", audioPoolInfo:" + this.f54029xacd3d8c0.m103447xfd563638());
        }
        return m103295x7444b660;
    }
}
