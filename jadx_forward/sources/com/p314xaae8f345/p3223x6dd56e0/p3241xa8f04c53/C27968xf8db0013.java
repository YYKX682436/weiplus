package com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53;

/* renamed from: com.tencent.youtu.ytfacetrack.YTFaceTrack */
/* loaded from: classes14.dex */
public class C27968xf8db0013 {

    /* renamed from: Version */
    public static java.lang.String f62624x782db4b8 = "2.3.3.7";

    /* renamed from: instance */
    private static com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013 f62625x21169495;

    /* renamed from: loggerListener */
    private static com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.IYtLoggerListener f62626x70688e64;

    /* renamed from: handleId */
    public long f62627x1f8d63 = 0;

    /* renamed from: nativePtr */
    private long f62628xc3e75f57;

    /* renamed from: com.tencent.youtu.ytfacetrack.YTFaceTrack$FaceStatus */
    /* loaded from: classes14.dex */
    public static class FaceStatus {

        /* renamed from: pitch */
        public float f62629x65bc340;

        /* renamed from: pointsVis */
        public float[] f62630x5d4ea43d;

        /* renamed from: roll */
        public float f62631x35807d;
        public float[] xys;

        /* renamed from: xys5p */
        public float[] f62632x6d3bbed;
        public float yaw;
    }

    /* renamed from: com.tencent.youtu.ytfacetrack.YTFaceTrack$FaceStatus3d */
    /* loaded from: classes14.dex */
    public static class FaceStatus3d {

        /* renamed from: denseFaceModel */
        public float[] f62633xf33b166d;

        /* renamed from: expression */
        public float[] f62634x94fb9298;

        /* renamed from: pitch */
        public float f62635x65bc340;

        /* renamed from: roll */
        public float f62636x35807d;

        /* renamed from: transform */
        public float[] f62637x3ebe6b6c;
        public float yaw;
    }

    /* renamed from: com.tencent.youtu.ytfacetrack.YTFaceTrack$IYtLoggerListener */
    /* loaded from: classes14.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    /* renamed from: com.tencent.youtu.ytfacetrack.YTFaceTrack$YTImage */
    /* loaded from: classes14.dex */
    public static class YTImage {

        /* renamed from: data */
        public byte[] f62638x2eefaa;

        /* renamed from: height */
        public int f62639xb7389127;

        /* renamed from: width */
        public int f62640x6be2dc6;
    }

    static {
        m121323xb90145c7();
    }

    public C27968xf8db0013() {
        m121320x65a24b43();
    }

    /* renamed from: GlobalInit */
    public static int m121314x439d2f73(java.lang.String str) {
        int m121315x72bddea3 = m121315x72bddea3(str);
        if (m121315x72bddea3 == 0) {
            f62625x21169495 = new com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013();
        }
        return m121315x72bddea3;
    }

    /* renamed from: GlobalInitInner */
    private static native int m121315x72bddea3(java.lang.String str);

    /* renamed from: GlobalInitSuccessCount */
    private static native int m121316xd48b99df();

    /* renamed from: GlobalRelease */
    public static boolean m121317x1db61ec4() {
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013 c27968xf8db0013 = f62625x21169495;
        if (c27968xf8db0013 != null) {
            c27968xf8db0013.m121321xb127390();
            f62625x21169495 = null;
        }
        return m121318x881ad9f2();
    }

    /* renamed from: GlobalReleaseInner */
    private static native boolean m121318x881ad9f2();

    /* renamed from: IsInstanceExist */
    public static boolean m121319xf1fe8a38() {
        return f62625x21169495 != null;
    }

    /* renamed from: NativeConstructor */
    private native void m121320x65a24b43();

    /* renamed from: NativeDestructor */
    private native void m121321xb127390();

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013 m121322x9cf0d20b() {
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013 c27968xf8db0013;
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.class) {
            c27968xf8db0013 = f62625x21169495;
        }
        return c27968xf8db0013;
    }

    /* renamed from: nativeInit */
    private static native boolean m121323xb90145c7();

    /* renamed from: nativeLog */
    public static void m121324xc3e74fad(int i17, java.lang.String str) {
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.IYtLoggerListener iYtLoggerListener = f62626x70688e64;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTFaceTrack.nativeLog]", str);
        }
    }

    /* renamed from: setLoggerListener */
    public static void m121325x26f6c366(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.IYtLoggerListener iYtLoggerListener) {
        f62626x70688e64 = iYtLoggerListener;
    }

    /* renamed from: DoDetectionProcess */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121326xe18e92f5(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: DoDetectionProcessBitmap */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121327x63cda484(android.graphics.Bitmap bitmap, int i17, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: DoDetectionProcessRGB */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121328x4e80c998(byte[] bArr, int i17, int i18, int i19, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: DoDetectionProcessRGBA */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121329x819869a9(byte[] bArr, int i17, int i18, int i19, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: DoDetectionProcessYUV */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121330x4e80e5a5(byte[] bArr, int i17, int i18, int i19, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: DoDetectionProcessYUVWithBlur */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus[] m121331x61a75712(byte[] bArr, int i17, int i18, int i19, boolean z17, float[] fArr, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: GetFaceAlignParam */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27969xf9b91ac0 m121332x27195b9b();

    /* renamed from: GetFaceDetectParam */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27970xd3d78872 m121333x527f62f7();

    /* renamed from: GetFaceRect */
    public native android.graphics.Rect[] m121334xfcde1337(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: GetFaceTrackParam */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a m121335xaa667d15();

    /* renamed from: GetYTImageBitmap */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage m121336x94d2d4d9(android.graphics.Bitmap bitmap, int i17);

    /* renamed from: GetYTImageBitmapReuseData */
    public native int m121337xc44df65(android.graphics.Bitmap bitmap, int i17, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: GetYTImageRGB */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage m121338xba88163(byte[] bArr, int i17, int i18, int i19);

    /* renamed from: GetYTImageRGBA */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage m121339x6967ab3e(byte[] bArr, int i17, int i18, int i19);

    /* renamed from: GetYTImageRGBAReuseData */
    public native int m121340xe3ba6aa0(byte[] bArr, int i17, int i18, int i19, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: GetYTImageRGBReuseData */
    public native int m121341x7ca7ae1b(byte[] bArr, int i17, int i18, int i19, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: GetYTImageYUV */
    public native com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage m121342xba89d70(byte[] bArr, int i17, int i18, int i19);

    /* renamed from: GetYTImageYUVReuseData */
    public native int m121343xecc1d0ae(byte[] bArr, int i17, int i18, int i19, com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.YTImage yTImage);

    /* renamed from: RotateYUV */
    public native byte[] m121344x2cf8d95f(byte[] bArr, int i17, int i18, int i19);

    /* renamed from: SaveYTImage */
    public native void m121345x20f516c3(byte[] bArr, int i17, int i18);

    /* renamed from: SetFaceAlignParam */
    public native boolean m121346xef0fc3a7(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27969xf9b91ac0 c27969xf9b91ac0);

    /* renamed from: SetFaceDetectParam */
    public native boolean m121347x8955fc6b(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27970xd3d78872 c27970xd3d78872);

    /* renamed from: SetFaceTrackParam */
    public native boolean m121348x725ce521(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a c27971x7d063c3a);
}
