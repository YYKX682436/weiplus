package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI */
/* loaded from: classes10.dex */
public final class C16537x7c20fff9 {

    /* renamed from: SEGMENT_COLOR_FORMAT_YUV420P */
    public static final int f37681xe4c18eb8 = 2;

    /* renamed from: SEGMENT_COLOR_FORMAT_YUV420SP */
    public static final int f37682xb37048f5 = 1;

    /* renamed from: lock */
    private static final java.lang.Object f37683x32c52b;

    static {
        mq1.w0.wi();
        f37683x32c52b = new java.lang.Object();
    }

    /* renamed from: ffmpegCheckIfReachEndTimestamp */
    public static native boolean m66876x27c2d52e();

    /* renamed from: ffmpegCheckIfReachEndTimestampLock */
    public static boolean m66877x32fcc779() {
        boolean m66876x27c2d52e;
        synchronized (f37683x32c52b) {
            m66876x27c2d52e = m66876x27c2d52e();
        }
        return m66876x27c2d52e;
    }

    /* renamed from: ffmpegGetNextVideoFrameData */
    public static native byte[] m66878xb6df7b00(byte[] bArr);

    /* renamed from: ffmpegGetNextVideoFrameDataLock */
    public static byte[] m66879xf4ce344b(byte[] bArr) {
        byte[] m66878xb6df7b00;
        synchronized (f37683x32c52b) {
            m66878xb6df7b00 = m66878xb6df7b00(bArr);
        }
        return m66878xb6df7b00;
    }

    /* renamed from: ffmpegGetVideoHeight */
    public static native int m66880x274b29f1();

    /* renamed from: ffmpegGetVideoHeightLock */
    public static int m66881xd8f702bc() {
        int m66880x274b29f1;
        synchronized (f37683x32c52b) {
            m66880x274b29f1 = m66880x274b29f1();
        }
        return m66880x274b29f1;
    }

    /* renamed from: ffmpegGetVideoWidth */
    public static native int m66882x5cf053bc();

    /* renamed from: ffmpegGetVideoWidthLock */
    public static int m66883x10c4f07() {
        int m66882x5cf053bc;
        synchronized (f37683x32c52b) {
            m66882x5cf053bc = m66882x5cf053bc();
        }
        return m66882x5cf053bc;
    }

    /* renamed from: ffmpegOpenAndSeekFile */
    private static native int m66884x58d63d5c(java.lang.String str, double d17, double d18);

    /* renamed from: ffmpegOpenAndSeekFileLock */
    public static int m66885x5ea468a7(java.lang.String str, double d17, double d18) {
        int m66886xb4fc0c7;
        synchronized (f37683x32c52b) {
            m66886xb4fc0c7 = m66886xb4fc0c7(str, d17, d18);
        }
        return m66886xb4fc0c7;
    }

    /* renamed from: ffmpegOpenAndSeekFileVFS */
    public static int m66886xb4fc0c7(java.lang.String str, double d17, double d18) {
        return m66884x58d63d5c(kk.w.a(str, false), d17, d18);
    }

    /* renamed from: getVideoThumb */
    private static native byte[] m66887x8d31fa11(java.lang.String str, int i17, int i18);

    /* renamed from: getVideoThumbVFS */
    public static byte[] m66888xadccbf2(java.lang.String str, int i17, int i18) {
        return m66887x8d31fa11(kk.w.a(str, false), i17, i18);
    }

    /* renamed from: initDataBuf */
    public static native int m66889xa4b35f39(int i17);

    /* renamed from: initDataBufLock */
    public static int m66890x51335404(int i17) {
        int m66889xa4b35f39;
        synchronized (f37683x32c52b) {
            m66889xa4b35f39 = m66889xa4b35f39(i17);
        }
        return m66889xa4b35f39;
    }

    /* renamed from: initH264Encoder */
    public static native int m66891x32c8d3c4(int i17, int i18, float f17, int i19, int i27, int i28, int i29, float f18, int i37, int i38);

    /* renamed from: initH264EncoderLock */
    public static int m66892x37158b0f(int i17, int i18, float f17, int i19, int i27, int i28, int i29, float f18, int i37, int i38) {
        int m66891x32c8d3c4;
        synchronized (f37683x32c52b) {
            m66891x32c8d3c4 = m66891x32c8d3c4(i17, i18, f17, i19, i27, i28, i29, f18, i37, i38);
        }
        return m66891x32c8d3c4;
    }

    /* renamed from: muxing */
    private static native int m66893xc0a91e12(int i17, int i18, int i19, int i27, int i28, java.lang.String str, float f17, byte[] bArr, int i29);

    /* renamed from: muxingForX264 */
    public static native int m66894xcb1ba4ef(int i17, int i18, int i19, int i27, java.lang.String str, float f17, int i28, byte[] bArr, int i29);

    /* renamed from: muxingForX264Lock */
    public static int m66895xd9f5ceba(int i17, int i18, int i19, int i27, java.lang.String str, float f17, int i28, byte[] bArr, int i29) {
        int m66896xe5ffcc54;
        synchronized (f37683x32c52b) {
            m66896xe5ffcc54 = m66896xe5ffcc54(i17, i18, i19, i27, str, f17, i28, bArr, i29);
        }
        return m66896xe5ffcc54;
    }

    /* renamed from: muxingForX264VFS */
    public static int m66896xe5ffcc54(int i17, int i18, int i19, int i27, java.lang.String str, float f17, int i28, byte[] bArr, int i29) {
        return m66894xcb1ba4ef(i17, i18, i19, i27, kk.w.a(str, false), f17, i28, bArr, i29);
    }

    /* renamed from: muxingLock */
    public static int m66897xec0bfe5d(int i17, int i18, int i19, int i27, int i28, java.lang.String str, float f17, byte[] bArr, int i29) {
        int m66898x20639c51;
        synchronized (f37683x32c52b) {
            m66898x20639c51 = m66898x20639c51(i17, i18, i19, i27, i28, str, f17, bArr, i29);
        }
        return m66898x20639c51;
    }

    /* renamed from: muxingVFS */
    public static int m66898x20639c51(int i17, int i18, int i19, int i27, int i28, java.lang.String str, float f17, byte[] bArr, int i29) {
        return m66893xc0a91e12(i17, i18, i19, i27, i28, kk.w.a(str, false), f17, bArr, i29);
    }

    /* renamed from: releaseDataBuf */
    public static native void m66899x8b47a862(int i17);

    /* renamed from: releaseDataBufLock */
    public static void m66900xd4bce0ad(int i17) {
        synchronized (f37683x32c52b) {
            m66899x8b47a862(i17);
        }
    }

    /* renamed from: triggerEncodeForSegment */
    public static native int m66901x385186b8(int i17, boolean z17);

    /* renamed from: triggerEncodeForSegmentLock */
    public static int m66902x1263a403(int i17, boolean z17) {
        int m66901x385186b8;
        synchronized (f37683x32c52b) {
            m66901x385186b8 = m66901x385186b8(i17, z17);
        }
        return m66901x385186b8;
    }

    /* renamed from: writeAACData */
    public static native void m66903x1f9475ae(int i17, java.nio.ByteBuffer byteBuffer, int i18);

    /* renamed from: writeAACDataLock */
    public static void m66904xb00a27f9(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        synchronized (f37683x32c52b) {
            m66903x1f9475ae(i17, byteBuffer, i18);
        }
    }

    /* renamed from: writeH264Data */
    public static native void m66905x798715d1(int i17, java.nio.ByteBuffer byteBuffer, int i18);

    /* renamed from: writeH264DataLock */
    public static void m66906x9199fe9c(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        synchronized (f37683x32c52b) {
            m66905x798715d1(i17, byteBuffer, i18);
        }
    }

    /* renamed from: writeYuvDataForSegment */
    public static native int m66907xe8e002cf(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37);

    /* renamed from: writeYuvDataForSegmentLock */
    public static int m66908xa0983c9a(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        int m66907xe8e002cf;
        synchronized (f37683x32c52b) {
            m66907xe8e002cf = m66907xe8e002cf(bArr, i17, i18, i19, i27, i28, i29, i37);
        }
        return m66907xe8e002cf;
    }

    /* renamed from: yuv420pTo420XXAndScale */
    public static native void m66909x1b18f8f2(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, int i27, int i28, int i29, int i37, int i38);

    /* renamed from: yuv420pTo420XXAndScaleLock */
    public static void m66910x8353693d(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        synchronized (f37683x32c52b) {
            m66909x1b18f8f2(bArr, i17, bArr2, i18, i19, i27, i28, i29, i37, i38);
        }
    }
}
