package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1;

/* renamed from: com.tencent.thumbplayer.core.player.TPNativePlayer */
/* loaded from: classes16.dex */
public class C26406x391cae74 {

    /* renamed from: mContext */
    private android.content.Context f53322xd6cfe882;

    /* renamed from: mNativeContext */
    private long f53323x5abc8e2b;

    /* renamed from: m_playerID */
    private int f53324x78adcb4e;

    public C26406x391cae74(android.content.Context context) {
        this.f53324x78adcb4e = -1;
        this.f53322xd6cfe882 = null;
        this.f53322xd6cfe882 = context.getApplicationContext();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(context);
        try {
            this.f53324x78adcb4e = m102590xd892e4dc();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101777x316510(this.f53322xd6cfe882);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.m101686x316510(this.f53322xd6cfe882);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.m101928x316510(this.f53322xd6cfe882);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101960xd9f08ded(this.f53322xd6cfe882);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "Failed to create native player:" + th6.getMessage());
            throw new java.lang.UnsupportedOperationException("Failed to create native player");
        }
    }

    /* renamed from: _addAudioTrackSource */
    private native int m102582x979e3392(java.lang.String str, java.lang.String str2);

    /* renamed from: _addAudioTrackSourceWithHttpHeader */
    private native int m102583xaf676cd(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr);

    /* renamed from: _addInitConfigQueueInt */
    private native int m102584x379bab32(int i17, int i18);

    /* renamed from: _addInitConfigQueueString */
    private native int m102585x3dbce1ee(int i17, java.lang.String str);

    /* renamed from: _addSubtitleTrackSource */
    private native int m102586xde13ecc(java.lang.String str, java.lang.String str2);

    /* renamed from: _addSubtitleTrackSourceWithHttpHeader */
    private native int m102587x99405487(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr);

    /* renamed from: _applyInitConfig */
    private native int m102588xf5558c41();

    /* renamed from: _configBufferDurationAsync */
    private native int m102589x98826c7(int i17, long j17, long j18, long j19);

    /* renamed from: _createPlayer */
    private native int m102590xd892e4dc();

    /* renamed from: _deselectTrackAsync */
    private native int m102591x45376f2d(int i17, long j17);

    /* renamed from: _getAutoExpendBufferCount */
    private native int m102592xb2181beb();

    /* renamed from: _getBufferIOMaxReadDurationPosMs */
    private native long m102593x66396ba9();

    /* renamed from: _getBufferIOMaxReadFileOffset */
    private native long m102594xbe9ef24c();

    /* renamed from: _getBufferIOMaxWriteDurationPosMs */
    private native long m102595xa012abae();

    /* renamed from: _getBufferIOMaxWriteFileOffset */
    private native long m102596x5e843867();

    /* renamed from: _getBufferedDurationMs */
    private native long m102597xf810790();

    /* renamed from: _getBufferedSize */
    private native long m102598xb98145b7();

    /* renamed from: _getContainerType */
    private native int m102599x21a64604(int i17);

    /* renamed from: _getCurrentPositionMs */
    private native long m102600x8a967531();

    /* renamed from: _getDemuxerOffsetInFile */
    private native long m102601xc0425559();

    /* renamed from: _getDurationMs */
    private native long m102602x8f5cc51();

    /* renamed from: _getDynamicStatisticParams */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 m102603x551642e(boolean z17);

    /* renamed from: _getGeneralPlayFlowParams */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 m102604xcee54759();

    /* renamed from: _getPlayerCoreParams */
    private static native java.lang.Object m102605xc53e287d(int i17);

    /* renamed from: _getPlayerID */
    private native int m102606xc6ca0b73();

    /* renamed from: _getProgramCount */
    private native int m102607x606b9d22();

    /* renamed from: _getProgramInfo */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26411x17ea3e3e m102608x6e79ca3b(int i17);

    /* renamed from: _getPropertyLong */
    private native long m102609xe2890e28(int i17);

    /* renamed from: _getPropertyString */
    private native java.lang.String m102610x70b86cbd(int i17);

    /* renamed from: _getTrackCount */
    private native int m102611x325107b();

    /* renamed from: _getTrackDashFormat */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26309x971775ec m102612xce9f623d(int i17);

    /* renamed from: _getTrackHlsTag */
    private native com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26408xe9b96cbf m102613x69d9a73f(int i17);

    /* renamed from: _getTrackIsExclusive */
    private native boolean m102614xedd87f00(int i17);

    /* renamed from: _getTrackIsInternal */
    private native boolean m102615x8144721b(int i17);

    /* renamed from: _getTrackIsSelected */
    private native boolean m102616xa64a9df9(int i17);

    /* renamed from: _getTrackName */
    private native java.lang.String m102617xad8a1d9f(int i17);

    /* renamed from: _getTrackType */
    private native int m102618xad8d324e(int i17);

    /* renamed from: _getVideoHeight */
    private native int m102619x5ccfbe6b();

    /* renamed from: _getVideoWidth */
    private native int m102620x5eaa4802();

    /* renamed from: _pause */
    private native int m102621xa87488f7();

    /* renamed from: _prepare */
    private native int m102622x7995b3c8();

    /* renamed from: _prepareAsync */
    private native int m102623x8157b94();

    /* renamed from: _release */
    private native int m102624xcd90cec8();

    /* renamed from: _reset */
    private native int m102625xa8928050();

    /* renamed from: _resetInitConfig */
    private native int m102626xe59600e2();

    /* renamed from: _resume */
    private native int m102627x69bdc54c();

    /* renamed from: _seekToAsync */
    private native int m102628x257f496a(int i17, int i18, long j17);

    /* renamed from: _selectProgramAsync */
    private native int m102629xd00e9c13(int i17, long j17);

    /* renamed from: _selectTrackAsync */
    private native int m102630x4605a06c(int i17, long j17);

    /* renamed from: _setAudioFrameCallback */
    private native int m102631x61a7959f(java.lang.Object obj);

    /* renamed from: _setAudioMute */
    private native int m102632xe99522ac(boolean z17);

    /* renamed from: _setAudioNormalizeVolumeParams */
    private native int m102633x5e4720ba(java.lang.String str);

    /* renamed from: _setAudioVolume */
    private native int m102634xe7dadeed(float f17);

    /* renamed from: _setDataSource */
    private native int m102635x398b3468(java.lang.String str);

    /* renamed from: _setDataSourceFd */
    private native int m102636x38fc346(int i17, long j17, long j18);

    /* renamed from: _setDataSourceWithHttpHeader */
    private native int m102637x678e4923(java.lang.String str, java.lang.Object[] objArr);

    /* renamed from: _setDemuxerCallback */
    private native int m102638xe1e076de(java.lang.Object obj);

    /* renamed from: _setEventRecordCallback */
    private native int m102639xe10344d(java.lang.Object obj);

    /* renamed from: _setInitConfigBool */
    private native int m102640x10cd0cff(int i17, boolean z17);

    /* renamed from: _setInitConfigFloat */
    private native int m102641x90b92e7(int i17, float f17);

    /* renamed from: _setInitConfigInt */
    private native int m102642x6be5af3a(int i17, int i18);

    /* renamed from: _setInitConfigLong */
    private native int m102643x10d19891(int i17, long j17);

    /* renamed from: _setInitConfigObject */
    private native int m102644x27334414(int i17, java.lang.Object obj);

    /* renamed from: _setInitConfigString */
    private native int m102645x2f0800e6(int i17, java.lang.String str);

    /* renamed from: _setLoopback */
    private native int m102646xd813d64e(boolean z17, long j17, long j18);

    /* renamed from: _setMessageCallback */
    private native int m102647x92d33f49(java.lang.Object obj);

    /* renamed from: _setOptionLong */
    private native int m102648x3f8e5894(int i17, long j17, long j18);

    /* renamed from: _setOptionObject */
    private native int m102649x99c00f57(int i17, java.lang.Object obj);

    /* renamed from: _setPlaySharpenSwitch */
    private native int m102650xee77baf0();

    /* renamed from: _setPlaybackRate */
    private native int m102651x9d26f4de(float f17);

    /* renamed from: _setPostProcessFrameCallback */
    private native int m102652x90930226(java.lang.Object obj);

    /* renamed from: _setSubtitleFrameCallback */
    private native int m102653x18f4d3b7(java.lang.Object obj);

    /* renamed from: _setVideoFrameCallback */
    private native int m102654x523b111a(java.lang.Object obj);

    /* renamed from: _setVideoSurface */
    private native int m102655xd52162f5(android.view.Surface surface);

    /* renamed from: _setVideoSurfaceWithType */
    private native int m102656x7e5e335(android.view.Surface surface, int i17);

    /* renamed from: _start */
    private native int m102657xa8a72763();

    /* renamed from: _stop */
    private native int m102658x570c0e1();

    /* renamed from: _switchDefinitionAsync */
    private native int m102659x536fac16(java.lang.String str, int i17, long j17);

    /* renamed from: _switchDefinitionAsyncWithHttpHeader */
    private native int m102660x73f8b851(java.lang.String str, java.lang.Object[] objArr, int i17, long j17);

    /* renamed from: _switchHdrModeWithSurface */
    private native int m102661x4e80df41(android.view.Surface surface, int i17, int i18);

    /* renamed from: addAudioTrackSource */
    public int m102662xa28fa651(java.lang.String str, java.lang.String str2) {
        try {
            return m102582x979e3392(str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: addSubtitleTrackSource */
    public int m102664x85795fad(java.lang.String str, java.lang.String str2) {
        try {
            return m102586xde13ecc(str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: configBufferDurationAsync */
    public int m102666x59e24e46(int i17, long j17, long j18, long j19) {
        try {
            return m102589x98826c7(i17, j17, j18, j19);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: deselectTrackAsync */
    public int m102667xf2fd288e(int i17, long j17) {
        try {
            return m102591x45376f2d(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: getAutoExpendBufferCount */
    public int m102668xa42b888c() {
        try {
            return m102592xb2181beb();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0;
        }
    }

    /* renamed from: getBufferIOMaxReadDurationPosMs */
    public long m102669xdc51b7e8() {
        try {
            return m102593x66396ba9();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getBufferIOMaxReadFileOffset */
    public long m102670x69f9266d() {
        try {
            return m102594xbe9ef24c();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    public long m102671xed03e74f() {
        try {
            return m102595xa012abae();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getBufferIOMaxWriteFileOffset */
    public long m102672x1e708866() {
        try {
            return m102596x5e843867();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getBufferedDurationMs */
    public long m102673x23e0c68f() {
        try {
            return m102597xf810790();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getBufferedSize */
    public long m102674x45feff6() {
        try {
            return m102598xb98145b7();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getCurrentPositionMs */
    public long m102675xddd35a52() {
        try {
            return m102600x8a967531();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getDemuxerOffsetInFile */
    public long m102676x37da763a() {
        try {
            return m102601xc0425559();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return -1L;
        }
    }

    /* renamed from: getDurationMs */
    public long m102677x37a7fa50() {
        try {
            return m102602x8f5cc51();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getDynamicStatisticParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 m102678x55ab8bad(boolean z17) {
        try {
            return m102603x551642e(z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return null;
        }
    }

    /* renamed from: getGeneralPlayFlowParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 m102679xc0f8b3fa() {
        try {
            return m102604xcee54759();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return null;
        }
    }

    /* renamed from: getPlayerCoreParams */
    public java.lang.Object m102680xd02f9b3c(int i17) {
        return null;
    }

    /* renamed from: getPlayerID */
    public int m102681xebddad32() {
        try {
            return m102606xc6ca0b73();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0;
        }
    }

    /* renamed from: getProgramCount */
    public int m102682xab4a4761() {
        try {
            return m102607x606b9d22();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: getProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26411x17ea3e3e[] m102683x160d5c1c() {
        try {
            int m102607x606b9d22 = m102607x606b9d22();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26411x17ea3e3e[] c26411x17ea3e3eArr = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26411x17ea3e3e[m102607x606b9d22];
            for (int i17 = 0; i17 < m102607x606b9d22; i17++) {
                c26411x17ea3e3eArr[i17] = m102608x6e79ca3b(i17);
            }
            return c26411x17ea3e3eArr;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return null;
        }
    }

    /* renamed from: getPropertyLong */
    public long m102684x2d67b867(int i17) {
        try {
            return m102609xe2890e28(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0L;
        }
    }

    /* renamed from: getPropertyString */
    public java.lang.String m102685x7e95833c(int i17) {
        try {
            return m102610x70b86cbd(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return "";
        }
    }

    /* renamed from: getTrackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[] m102686x2ae89de3() {
        try {
            int m102611x325107b = m102611x325107b();
            if (m102611x325107b <= 0) {
                return null;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[] c26311x67c84ab1Arr = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[m102611x325107b];
            for (int i17 = 0; i17 < m102611x325107b; i17++) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1 c26311x67c84ab1 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1();
                c26311x67c84ab1Arr[i17] = c26311x67c84ab1;
                c26311x67c84ab1.f52218x2b805725 = m102618xad8d324e(i17);
                c26311x67c84ab1Arr[i17].f52211xd857386b = m102599x21a64604(i17);
                c26311x67c84ab1Arr[i17].f52217x2b7d4276 = m102617xad8a1d9f(i17);
                c26311x67c84ab1Arr[i17].f52216x17bd99e5 = m102616xa64a9df9(i17);
                c26311x67c84ab1Arr[i17].f52214xaac50094 = m102614xedd87f00(i17);
                c26311x67c84ab1Arr[i17].f52215xf2b76e07 = m102615x8144721b(i17);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1 c26311x67c84ab12 = c26311x67c84ab1Arr[i17];
                int i18 = c26311x67c84ab12.f52211xd857386b;
                if (i18 == 1) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26408xe9b96cbf m102613x69d9a73f = m102613x69d9a73f(i17);
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26310x9514ea6e c26310x9514ea6e = c26311x67c84ab1Arr[i17].f52213xb79f792b;
                    c26310x9514ea6e.f52202x337a8b = m102613x69d9a73f.f53340x337a8b;
                    c26310x9514ea6e.f52201x9fd29358 = m102613x69d9a73f.f53339x9fd29358;
                    c26310x9514ea6e.f52200x117d5bfa = m102613x69d9a73f.f53338x117d5bfa;
                    c26310x9514ea6e.f52203xa0a178ac = m102613x69d9a73f.f53341xa0a178ac;
                    c26310x9514ea6e.f52198xaf3af31d = m102613x69d9a73f.f53336xaf3af31d;
                    c26310x9514ea6e.f52199x208b77cd = m102613x69d9a73f.f53337x208b77cd;
                    c26310x9514ea6e.f52197x8ad4c0b1 = m102613x69d9a73f.f53335x8ad4c0b1;
                } else if (i18 == 2) {
                    c26311x67c84ab12.f52212x40125e29 = m102612xce9f623d(i17);
                }
            }
            return c26311x67c84ab1Arr;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return null;
        }
    }

    /* renamed from: getVideoHeight */
    public int m102687x463504c() {
        try {
            return m102619x5ccfbe6b();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0;
        }
    }

    /* renamed from: getVideoWidth */
    public int m102688x8d5c7601() {
        try {
            return m102620x5eaa4802();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return 0;
        }
    }

    /* renamed from: pause */
    public int m102689x65825f6() {
        try {
            return m102621xa87488f7();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: prepare */
    public int m102690xed060d07() {
        try {
            return m102622x7995b3c8();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: prepareAsync */
    public int m102691x857611b5() {
        try {
            return m102623x8157b94();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: release */
    public void m102692x41012807() {
        try {
            m102624xcd90cec8();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    /* renamed from: reset */
    public void m102693x6761d4f() {
        try {
            m102625xa8928050();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    /* renamed from: seekToAsync */
    public int m102694x4a92eb29(int i17, int i18, long j17) {
        try {
            return m102628x257f496a(i17, i18, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: selectProgramAsync */
    public int m102695x7dd45574(int i17, long j17) {
        try {
            return m102629xd00e9c13(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: selectTrackAsync */
    public int m102696x56fc3e0d(int i17, long j17) {
        try {
            return m102630x4605a06c(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setAudioFrameCallback */
    public int m102697x7607549e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26397xc5894279 interfaceC26397xc5894279) {
        try {
            return m102631x61a7959f(interfaceC26397xc5894279);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setAudioMute */
    public int m102698x66f5b8cd(boolean z17) {
        try {
            return m102632xe99522ac(z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setAudioNormalizeVolumeParams */
    public int m102699x1e3370b9(java.lang.String str) {
        try {
            return m102633x5e4720ba(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setAudioVolume */
    public int m102700x8f6e70ce(float f17) {
        try {
            return m102634xe7dadeed(f17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setDataSource */
    public int m102702x683d6267(java.lang.String str) {
        try {
            return m102635x398b3468(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setDemuxerCallback */
    public int m102704x8fa6303f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.InterfaceC26350x1052c465 interfaceC26350x1052c465) {
        try {
            return m102638xe1e076de(interfaceC26350x1052c465);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setEventRecordCallback */
    public int m102705x85a8552e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26398x266422b3 interfaceC26398x266422b3) {
        try {
            return m102639xe10344d(interfaceC26398x266422b3);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setInitConfig */
    public void m102706x103ece74(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26409xd9e7d206 c26409xd9e7d206) {
        try {
            m102626xe59600e2();
            java.util.HashMap<java.lang.Integer, java.lang.Integer> m102728x1e87fde3 = c26409xd9e7d206.m102728x1e87fde3();
            java.util.HashMap<java.lang.Integer, java.lang.String> m102733xf424f8d5 = c26409xd9e7d206.m102733xf424f8d5();
            java.util.HashMap<java.lang.Integer, java.lang.Long> m102729x5296410a = c26409xd9e7d206.m102729x5296410a();
            java.util.HashMap<java.lang.Integer, java.lang.Float> m102727xf3a9dad6 = c26409xd9e7d206.m102727xf3a9dad6();
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> m102726x41a84ddc = c26409xd9e7d206.m102726x41a84ddc();
            java.util.HashMap<java.lang.Integer, java.util.Vector<java.lang.Integer>> m102731x92ee5628 = c26409xd9e7d206.m102731x92ee5628();
            java.util.HashMap<java.lang.Integer, java.lang.Object> m102730xa6a3bee7 = c26409xd9e7d206.m102730xa6a3bee7();
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : m102728x1e87fde3.entrySet()) {
                m102642x6be5af3a(entry.getKey().intValue(), entry.getValue().intValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry2 : m102733xf424f8d5.entrySet()) {
                m102645x2f0800e6(entry2.getKey().intValue(), entry2.getValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry3 : m102729x5296410a.entrySet()) {
                m102643x10d19891(entry3.getKey().intValue(), entry3.getValue().longValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Float> entry4 : m102727xf3a9dad6.entrySet()) {
                m102641x90b92e7(entry4.getKey().intValue(), entry4.getValue().floatValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Boolean> entry5 : m102726x41a84ddc.entrySet()) {
                m102640x10cd0cff(entry5.getKey().intValue(), entry5.getValue().booleanValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Object> entry6 : m102730xa6a3bee7.entrySet()) {
                m102644x27334414(entry6.getKey().intValue(), entry6.getValue());
            }
            for (java.util.Map.Entry<java.lang.Integer, java.util.Vector<java.lang.Integer>> entry7 : m102731x92ee5628.entrySet()) {
                java.util.Vector<java.lang.Integer> value = entry7.getValue();
                if (value != null) {
                    java.util.Iterator<java.lang.Integer> it = value.iterator();
                    while (it.hasNext()) {
                        m102584x379bab32(entry7.getKey().intValue(), it.next().intValue());
                    }
                }
            }
            for (java.util.Map.Entry<java.lang.Integer, java.util.Vector<java.lang.String>> entry8 : c26409xd9e7d206.m102732x861efe70().entrySet()) {
                java.util.Vector<java.lang.String> value2 = entry8.getValue();
                if (value2 != null) {
                    java.util.Iterator<java.lang.String> it6 = value2.iterator();
                    while (it6.hasNext()) {
                        m102585x3dbce1ee(entry8.getKey().intValue(), it6.next());
                    }
                }
            }
            m102588xf5558c41();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
    }

    /* renamed from: setLoopback */
    public int m102707xfd27780d(boolean z17, long j17, long j18) {
        try {
            return m102646xd813d64e(z17, j17, j18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setMessageCallback */
    public int m102708x4098f8aa(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af interfaceC26399x617a50af) {
        try {
            return m102647x92d33f49(interfaceC26399x617a50af);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setOptionLong */
    public int m102709x6e408693(int i17, long j17, long j18) {
        try {
            return m102648x3f8e5894(i17, j17, j18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setOptionObject */
    public int m102710xe49eb996(int i17, java.lang.Object obj) {
        try {
            return m102649x99c00f57(i17, obj);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setPlaySharpenSwitch */
    public int m102711x41b4a011() {
        try {
            return m102650xee77baf0();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setPlaybackRate */
    public int m102712xe8059f1d(float f17) {
        try {
            return m102651x9d26f4de(f17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setPostProcessFrameCallback */
    public int m102713x330145e5(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26400x83922380 interfaceC26400x83922380) {
        try {
            return m102652x90930226(interfaceC26400x83922380);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setSubtitleFrameCallback */
    public int m102714xb084058(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26401x6c06c09d interfaceC26401x6c06c09d) {
        try {
            return m102653x18f4d3b7(interfaceC26401x6c06c09d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setVideoFrameCallback */
    public int m102715x669ad019(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26403xb61cbdf4 interfaceC26403xb61cbdf4) {
        try {
            return m102654x523b111a(interfaceC26403xb61cbdf4);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setVideoSurface */
    public int m102716x20000d34(android.view.Surface surface) {
        try {
            return m102655xd52162f5(surface);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setVideoSurfaceWithType */
    public int m102717x8351de74(android.view.Surface surface, int i17) {
        try {
            return m102656x7e5e335(surface, i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: start */
    public int m102718x68ac462() {
        try {
            return m102657xa8a72763();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: stop */
    public int m102719x360802() {
        try {
            return m102658x570c0e1();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    @java.lang.Deprecated
    /* renamed from: switchDefinitionAsync */
    public int m102721x67cf6b15(java.lang.String str, long j17) {
        return m102720x67cf6b15(str, 0, j17);
    }

    /* renamed from: switchHdrModeWithSurface */
    public int m102723x40944be2(android.view.Surface surface, int i17, int i18) {
        try {
            return m102661x4e80df41(surface, i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: switchDefinitionAsync */
    public int m102720x67cf6b15(java.lang.String str, int i17, long j17) {
        try {
            return m102659x536fac16(str, i17, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: addAudioTrackSource */
    public int m102663xa28fa651(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return m102583xaf676cd(str, str2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26420xce765a9d.m102743x8779895c(map));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: addSubtitleTrackSource */
    public int m102665x85795fad(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return m102587x99405487(str, str2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26420xce765a9d.m102743x8779895c(map));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setDataSource */
    public int m102703x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return m102637x678e4923(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26420xce765a9d.m102743x8779895c(map));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: switchDefinitionAsync */
    public int m102722x67cf6b15(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, int i17, long j17) {
        try {
            return m102660x73f8b851(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26420xce765a9d.m102743x8779895c(map), i17, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }

    /* renamed from: setDataSource */
    public int m102701x683d6267(int i17, long j17, long j18) {
        try {
            return m102636x38fc346(i17, j17, j18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d;
        }
    }
}
