package com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni;

/* renamed from: com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface */
/* loaded from: classes14.dex */
public class C27976x9bccb0c3 {

    /* renamed from: loggerListener */
    private static com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.IYtLoggerListener f62693x70688e64;

    /* renamed from: com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface$IYtLoggerListener */
    /* loaded from: classes14.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    /* renamed from: Checksum */
    public static native java.lang.String m121368x5f75c063(byte[] bArr);

    /* renamed from: canReflect */
    public static native boolean m121369xecfe84cd();

    /* renamed from: configNativeLog */
    public static native void m121370xd2cc768b(boolean z17);

    /* renamed from: encodeJpeg */
    public static byte[] m121371xe2a0979e(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 99, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: getActionReflectData */
    public static native com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.p3244x2eefaa.C27974x9ac85366 m121372xba49673b(int i17);

    /* renamed from: getBestImage */
    public static native byte[] m121373x4b0d2321(int i17);

    /* renamed from: getConfigData */
    public static native java.lang.String m121374x1fc92e02(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: getEyeImage */
    public static native byte[] m121375x29142320(int i17);

    /* renamed from: getFrameList */
    public static native byte[][] m121376x1fe7c0f5();

    /* renamed from: getLiveSelectDataChecksum */
    public static native java.lang.String m121377x89d9562b(java.lang.String str, java.lang.String str2);

    /* renamed from: getMouthImage */
    public static native byte[] m121378x631e18ca(int i17);

    /* renamed from: getVersion */
    public static native java.lang.String m121379x52c258a2();

    /* renamed from: initModel */
    public static native int m121380xefa44ff9(java.lang.String str);

    /* renamed from: isRecordingDone */
    public static native boolean m121381x4f560c09();

    /* renamed from: nativeLog */
    public static void m121383xc3e74fad(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.IYtLoggerListener iYtLoggerListener = f62693x70688e64;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    /* renamed from: poseDetect */
    public static native int m121384x2c993a94(float[] fArr, float[] fArr2, int i17, byte[] bArr, int i18, int i19, int i27, float f17, float f18, float f19, int i28);

    /* renamed from: releaseAll */
    public static native void m121385xa592081a();

    /* renamed from: resetDetect */
    public static native void m121386xb787b8d2();

    /* renamed from: setColorData */
    public static native void m121387xd1cc5b6b(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: setLoggerListener */
    public static void m121388x26f6c366(com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.IYtLoggerListener iYtLoggerListener) {
        f62693x70688e64 = iYtLoggerListener;
    }

    /* renamed from: setSafetyLevel */
    public static native void m121389xbd12ba10(int i17);

    /* renamed from: updateParam */
    public static native int m121390xdcf60544(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeLog */
    public static void m121382xc3e74fad(int i17, java.lang.String str) {
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.IYtLoggerListener iYtLoggerListener = f62693x70688e64;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTPoseDetectJNIInterface.nativeLog]", str);
        }
    }
}
