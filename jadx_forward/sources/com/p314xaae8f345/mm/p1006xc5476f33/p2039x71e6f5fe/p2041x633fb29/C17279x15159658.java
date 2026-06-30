package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* renamed from: com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative */
/* loaded from: classes15.dex */
public class C17279x15159658 {
    private static final java.lang.String TAG = "MicroMsg.ScanFastFocusEngineNative";

    /* renamed from: isSoLoaded */
    private static boolean f37917xf2ac9ccb;

    /* renamed from: bestImageData */
    public byte[] f37918x2e555221;

    /* renamed from: bestImageId */
    public int f37919xe27aa152;

    /* renamed from: fullImageData */
    public byte[] f37922xaeef55d6;

    /* renamed from: result */
    public int f37926xc84dc81d = 0;

    /* renamed from: width */
    public int f37929x6be2dc6 = 0;

    /* renamed from: height */
    public int f37923xb7389127 = 0;

    /* renamed from: points */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17281x9d144f3[] f37925xc56c5ce3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17281x9d144f3[10];

    /* renamed from: pointCount */
    public int f37924x49ed055f = 0;

    /* renamed from: cropObject */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 f37920x3aa21def = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615();

    /* renamed from: trackInfoList */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60[] f37928x6a955cd7 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60[5];

    /* renamed from: trackInfoCount */
    public int f37927xe79a2bf6 = 0;

    /* renamed from: detectType */
    public int f37921x8c08207d = 0;

    static {
        m68565x8090dc3a();
    }

    public C17279x15159658() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ScanFastFocusEngineNative constructor %s", java.lang.Integer.valueOf(hashCode()));
        m68563x316510();
    }

    /* renamed from: init */
    private void m68563x316510() {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17281x9d144f3[] c17281x9d144f3Arr = this.f37925xc56c5ce3;
            if (i18 >= c17281x9d144f3Arr.length) {
                break;
            }
            c17281x9d144f3Arr[i18] = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17281x9d144f3();
            i18++;
        }
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60[] c17282x335f2f60Arr = this.f37928x6a955cd7;
            if (i17 >= c17282x335f2f60Arr.length) {
                return;
            }
            c17282x335f2f60Arr[i17] = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60();
            i17++;
        }
    }

    /* renamed from: isSoLoaded */
    public static boolean m68564xf2ac9ccb() {
        return f37917xf2ac9ccb;
    }

    /* renamed from: tryLoadLibrary */
    public static boolean m68565x8090dc3a() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("scan_recognize");
        try {
            boolean wi6 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("XNet");
            boolean wi7 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("opencv_world");
            boolean wi8 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("ffengine");
            boolean wi9 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("focusEngineJni");
            boolean z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadLibrary loadXNet: %s, loadOpencv: %s, loadFFE: %s, loadJNI: %s", java.lang.Boolean.valueOf(wi6), java.lang.Boolean.valueOf(wi7), java.lang.Boolean.valueOf(wi8), java.lang.Boolean.valueOf(wi9));
            if (!wi6 || !wi7 || !wi8 || !wi9) {
                z17 = false;
            }
            f37917xf2ac9ccb = z17;
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "FocusEngine init exception", new java.lang.Object[0]);
            f37917xf2ac9ccb = false;
            return false;
        }
    }

    /* renamed from: computeImagePHash */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17266x8cecd44e m68566x6feb509a(byte[] bArr, int i17, int i18, boolean z17);

    /* renamed from: getCropRGBAByTrackId */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68567x278a7755(int i17, float f17, float f18, float f19, float f27);

    /* renamed from: getCropYUVByTrackId */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68568xd37de1db(int i17, float f17, float f18, float f19, float f27);

    /* renamed from: getModelConfigIntValue */
    public native int m68569xb66b9477(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17);

    /* renamed from: getPointObjects */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17281x9d144f3[] m68570x47b037da();

    /* renamed from: getReportString */
    public native java.lang.String m68571x84e97cdb();

    /* renamed from: getScanProductInfoList */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60[] m68572x1518b908(byte[] bArr, int i17, int i18, int i19, int i27);

    /* renamed from: getScanProductInfoListForFullImage */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60[] m68573xd9987e6b(int i17, float f17, float f18, float f19, float f27);

    /* renamed from: getUploadFullRGBAImage */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68574x72e8d721(byte[] bArr, int i17, boolean z17, float f17);

    /* renamed from: getUploadFullYUVImage */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68575x1be4b2e7(byte[] bArr, int i17, boolean z17, float f17);

    /* renamed from: getUploadFullYUVImageAndResize */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68576x74bc644(byte[] bArr, int i17, boolean z17, float f17, int i18, int i19);

    /* renamed from: isAICrop */
    public native boolean m68577xd1d7e882();

    /* renamed from: isUsingAI */
    public native boolean m68578xd4e2db22();

    /* renamed from: nativeFocusEngineVersion */
    public native int m68579xc5af5ab5();

    /* renamed from: nativeInit */
    public native int m68580xb90145c7(int i17, int i18, int i19, int i27, int i28, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19);

    /* renamed from: nativeRelease */
    public native void m68581x7f877f0();

    /* renamed from: process */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68582xed8d1e6f(byte[] bArr, int i17, int i18);

    /* renamed from: reset */
    public native void m68583x6761d4f();

    /* renamed from: resetNoBoxCount */
    public native void m68584x660cd94();

    /* renamed from: resetStatus */
    public void m68585xd1eb6221() {
        this.f37918x2e555221 = null;
        this.f37922xaeef55d6 = null;
        this.f37927xe79a2bf6 = 0;
        this.f37921x8c08207d = 0;
    }

    /* renamed from: rotateYUVImage */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68586x5bb4171c(byte[] bArr, int i17, int i18, int i19, int i27, int i28);

    /* renamed from: setConfig */
    public native void m68587x78bda44(java.lang.String str);

    /* renamed from: setNetSpeed */
    public native void m68588xc2e17f2c(int i17);

    /* renamed from: setPHashConfig */
    public native void m68589x173378be(java.lang.String str);

    /* renamed from: setServerDetectFrameCount */
    public native void m68590x1545870a(int i17);

    /* renamed from: setServerState */
    public native void m68591x425b714c(int i17);

    /* renamed from: shouldJump */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17280x9ea96c7c m68592xee966c81(float f17, float f18, float f19, float f27, int i17, boolean z17);
}
