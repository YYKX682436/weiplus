package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f;

/* renamed from: com.tencent.thumbplayer.adapter.TPPlayerStateStrategy */
/* loaded from: classes16.dex */
public class C26137xc88409a7 {

    /* renamed from: API_GET_BUFFERED */
    public static final int f50011x8acd4ded = 15;

    /* renamed from: API_GET_DEMUXER_OFFSET */
    public static final int f50012x804d3444 = 19;

    /* renamed from: API_GET_DURATION */
    public static final int f50013x6eca0aa2 = 11;

    /* renamed from: API_GET_POSITION */
    public static final int f50014x12185637 = 12;

    /* renamed from: API_GET_STATUS */
    public static final int f50015x554c7c80 = 14;

    /* renamed from: API_GET_VIDEO_SIZE */
    public static final int f50016x3c5eb6f3 = 13;

    /* renamed from: API_PAUSE */
    public static final int f50017xd807ab51 = 6;

    /* renamed from: API_PREPARE */
    public static final int f50018x10e9a3a2 = 1;

    /* renamed from: API_RELEASE */
    public static final int f50019x64e4bea2 = 16;

    /* renamed from: API_RESET */
    public static final int f50020xd825a2aa = 8;

    /* renamed from: API_SEEK */
    public static final int f50021x6a122d9d = 9;

    /* renamed from: API_SELECT_PROGRAM */
    public static final int f50022xf2563b06 = 18;

    /* renamed from: API_SET_DATASOURCE */
    public static final int f50023xb3e39147 = 2;

    /* renamed from: API_SET_PARAMS */
    public static final int f50024xc29af388 = 3;

    /* renamed from: API_SET_SURFACE */
    public static final int f50025x519932cb = 4;

    /* renamed from: API_START */
    public static final int f50026xd83a49bd = 5;

    /* renamed from: API_STOP */
    public static final int f50027x6a126727 = 7;

    /* renamed from: API_SWITCH_DEF */
    public static final int f50028x5d12dfbf = 17;

    /* renamed from: CB_ON_COMPLETE */
    public static final int f50029xe703c3b9 = 2;

    /* renamed from: CB_ON_DATA_OUTPUT */
    public static final int f50030x9de05cb6 = 7;

    /* renamed from: CB_ON_ERROR */
    public static final int f50031xcae14768 = 4;

    /* renamed from: CB_ON_INFO */
    public static final int f50032x92f03f2e = 3;

    /* renamed from: CB_ON_PREPARED */
    public static final int f50033xbe7a26bd = 1;

    /* renamed from: CB_ON_SEEK_COMPLETE */
    public static final int f50034x693e40a0 = 5;

    /* renamed from: CB_ON_VIDEO_SIZE_CHANGE */
    public static final int f50035xa3fb514a = 6;

    /* renamed from: mState */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 f50036xbec81024;

    public C26137xc88409a7(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        this.f50036xbec81024 = c26187x2e775614;
    }

    /* renamed from: validCallGetBufferPercent */
    private static boolean m100526x54660cc9(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallGetDemuxerOffset */
    private static boolean m100527xb3e6f533(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1) || c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallGetDuration */
    private static boolean m100528x3290e230(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallGetPosition */
    private static boolean m100529xd5df2dc5(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1) || c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallGetStatus */
    private static boolean m100530x482edb8e(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1) || c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallGetVideoSize */
    private static boolean m100531xcfb8b200(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1) || c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallPause */
    private static boolean m100532x718c519c(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(5) || c26187x2e775614.is(6);
    }

    /* renamed from: validCallPrepare */
    private static boolean m100533x5bdde72d(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(2) || c26187x2e775614.is(8) || c26187x2e775614.is(9);
    }

    /* renamed from: validCallRelease */
    private static boolean m100534xafd9022d(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1) || c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7) || c26187x2e775614.is(10);
    }

    /* renamed from: validCallReset */
    private static boolean m100535x71aa48f5(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1) || c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(7) || c26187x2e775614.is(10);
    }

    /* renamed from: validCallSeek */
    private static boolean m100536xc19a9612(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallSelectProgram */
    private static boolean m100537xb2e7538e(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(6) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallSetDataSource */
    private static boolean m100538x276880d(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1);
    }

    /* renamed from: validCallSetParams */
    private static boolean m100539x3541392e(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(1) || c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(7) || c26187x2e775614.is(8) || c26187x2e775614.is(9);
    }

    /* renamed from: validCallSetSurface */
    private static boolean m100540x33bba205(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return true;
    }

    /* renamed from: validCallStart */
    private static boolean m100541x71bef008(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallStop */
    private static boolean m100542xc19acf9c(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(8) || c26187x2e775614.is(9) || c26187x2e775614.is(6) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallSwitchDef */
    private static boolean m100543x7ab780d7(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(7);
    }

    /* renamed from: validCallbackOnComplete */
    private static boolean m100544xecac4379(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6);
    }

    /* renamed from: validCallbackOnDataOutput */
    private static boolean m100545xd8448f8b(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6) || c26187x2e775614.is(7) || c26187x2e775614.is(8);
    }

    /* renamed from: validCallbackOnError */
    private static boolean m100546x2dc0e7c8(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(2) || c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6);
    }

    /* renamed from: validCallbackOnInfo */
    private static boolean m100547x17b96ee(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6);
    }

    /* renamed from: validCallbackOnPrepared */
    private static boolean m100548xc422a67d(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(3);
    }

    /* renamed from: validCallbackOnSeekComplete */
    private static boolean m100549xf2cf5e11(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6);
    }

    /* renamed from: validCallbackOnSizeChange */
    private static boolean m100550xf85b9d51(com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614) {
        return c26187x2e775614.is(3) || c26187x2e775614.is(4) || c26187x2e775614.is(5) || c26187x2e775614.is(6);
    }

    /* renamed from: validStateCall */
    public final boolean m100551x3465cdf3(int i17) {
        if (i17 == 1) {
            return m100533x5bdde72d(this.f50036xbec81024);
        }
        if (i17 == 2) {
            return m100538x276880d(this.f50036xbec81024);
        }
        if (i17 == 3) {
            return m100539x3541392e(this.f50036xbec81024);
        }
        if (i17 == 4) {
            return m100540x33bba205(this.f50036xbec81024);
        }
        if (i17 == 5) {
            return m100541x71bef008(this.f50036xbec81024);
        }
        if (i17 == 6) {
            return m100532x718c519c(this.f50036xbec81024);
        }
        if (i17 == 7) {
            return m100542xc19acf9c(this.f50036xbec81024);
        }
        if (i17 == 8) {
            return m100535x71aa48f5(this.f50036xbec81024);
        }
        if (i17 == 9) {
            return m100536xc19a9612(this.f50036xbec81024);
        }
        if (i17 == 11) {
            return m100528x3290e230(this.f50036xbec81024);
        }
        if (i17 == 12) {
            return m100529xd5df2dc5(this.f50036xbec81024);
        }
        if (i17 == 13) {
            return m100531xcfb8b200(this.f50036xbec81024);
        }
        if (i17 == 14) {
            return m100530x482edb8e(this.f50036xbec81024);
        }
        if (i17 == 15) {
            return m100526x54660cc9(this.f50036xbec81024);
        }
        if (i17 == 16) {
            return m100534xafd9022d(this.f50036xbec81024);
        }
        if (i17 == 17) {
            return m100543x7ab780d7(this.f50036xbec81024);
        }
        if (i17 == 18) {
            return m100537xb2e7538e(this.f50036xbec81024);
        }
        if (i17 == 19) {
            return m100527xb3e6f533(this.f50036xbec81024);
        }
        return false;
    }

    /* renamed from: validStateCallback */
    public final boolean m100552xd045a15a(int i17) {
        if (i17 == 1) {
            return m100548xc422a67d(this.f50036xbec81024);
        }
        if (i17 == 2) {
            return m100544xecac4379(this.f50036xbec81024);
        }
        if (i17 == 3) {
            return m100547x17b96ee(this.f50036xbec81024);
        }
        if (i17 == 4) {
            return m100546x2dc0e7c8(this.f50036xbec81024);
        }
        if (i17 == 5) {
            return m100549xf2cf5e11(this.f50036xbec81024);
        }
        if (i17 == 6) {
            return m100550xf85b9d51(this.f50036xbec81024);
        }
        if (i17 == 7) {
            return m100545xd8448f8b(this.f50036xbec81024);
        }
        return false;
    }
}
