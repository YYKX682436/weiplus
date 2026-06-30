package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface */
/* loaded from: classes14.dex */
public class C27927x5486a314 {

    /* renamed from: TIME_REGULATION_LOOSE */
    public static int f62400x9e50d4db = 1;

    /* renamed from: TIME_REGULATION_STRICT */
    public static int f62401x3803600c;

    /* renamed from: instance */
    private static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314 f62402x21169495;

    /* renamed from: instanceLock */
    private static java.util.concurrent.locks.Lock f62403xd4047b60 = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: loggerListener */
    private static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.IYtLoggerListener f62404x70688e64;

    /* renamed from: FRnativePtr */
    private long f62405xb9f67c0b;

    /* renamed from: context */
    public android.content.Context f62406x38b735af = null;

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface$IYtLoggerListener */
    /* loaded from: classes14.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    private C27927x5486a314() {
        m121105x98f373f7();
    }

    /* renamed from: Checksum */
    public static native java.lang.String m121076x5f75c063(java.lang.String str);

    /* renamed from: FRGenConfigData */
    public static native java.lang.String m121077xbd15d010(int i17, java.lang.String str);

    /* renamed from: FRVersion */
    public static native java.lang.String m121078x49046e6c();

    /* renamed from: SetActStr */
    public static native void m121079x7aeda321(java.lang.String str);

    /* renamed from: SetPipelineVersion */
    public static native void m121080xb625734(java.lang.String str);

    /* renamed from: clearInstance */
    public static synchronized void m121081xf5161202() {
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.class) {
            try {
                f62403xd4047b60.lock();
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314 c27927x5486a314 = f62402x21169495;
                if (c27927x5486a314 != null) {
                    c27927x5486a314.m121106xa15f645c();
                    f62402x21169495 = null;
                }
            } finally {
                f62403xd4047b60.unlock();
            }
        }
    }

    /* renamed from: compressTest */
    public static void m121082x55e72314(android.graphics.Bitmap bitmap, int i17) {
        try {
            java.io.File file = new java.io.File("/sdcard/reflect/");
            if (!file.exists()) {
                file.mkdirs();
            }
            java.lang.String str = "/sdcard/reflect/" + i17 + "/";
            java.io.File file2 = new java.io.File(str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(str, "mytestInJava_" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG));
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: configNativeLog */
    public static native void m121083xd2cc768b(boolean z17);

    /* renamed from: encodeJpeg */
    public static byte[] m121085xe2a0979e(android.graphics.Bitmap bitmap, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314 m121086x9cf0d20b() {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314 c27927x5486a314;
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.class) {
            try {
                f62403xd4047b60.lock();
                if (f62402x21169495 == null) {
                    f62402x21169495 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314();
                }
                f62403xd4047b60.unlock();
                c27927x5486a314 = f62402x21169495;
            } catch (java.lang.Throwable th6) {
                f62403xd4047b60.unlock();
                throw th6;
            }
        }
        return c27927x5486a314;
    }

    /* renamed from: modelVersion */
    public static java.lang.String m121087xca9896f() {
        return "";
    }

    /* renamed from: nativeLog */
    public static void m121089xc3e74fad(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.IYtLoggerListener iYtLoggerListener = f62404x70688e64;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    /* renamed from: sdkVersion */
    public static java.lang.String m121090x8b04a33e() {
        return "";
    }

    /* renamed from: setLoggerListener */
    public static void m121091x26f6c366(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.IYtLoggerListener iYtLoggerListener) {
        f62404x70688e64 = iYtLoggerListener;
    }

    /* renamed from: updateParam */
    public static native int m121092xdcf60544(java.lang.String str, java.lang.String str2);

    /* renamed from: FRDoDetectionYuvs */
    public native int m121093x37acd5c7(boolean z17, int i17);

    /* renamed from: FRGetAGin */
    public native com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27931x532e7d68 m121094x2f8be9b5();

    /* renamed from: FRGetChangePoint */
    public native int m121095xb0d4e676();

    /* renamed from: FRGetConfigBegin */
    public native int m121096x13b3853d();

    /* renamed from: FRGetConfigEnd */
    public native int m121097x1e2aa6f();

    /* renamed from: FRGetISOCaptureTimeVecSize */
    public native int m121098xa52d539d();

    /* renamed from: FRGetISObackup */
    public native double m121099xafb5cebd();

    /* renamed from: FRGetISOchangeFrame */
    public native int m121100xf37f82();

    /* renamed from: FRGetISOmin */
    public native double m121101x8a7c6737();

    /* renamed from: FRGetRawYuvDatas */
    public native com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27934xe970fa7c[] m121102xf58c744d();

    /* renamed from: FRGetTriggerTime */
    public native int m121103xebb1475b();

    /* renamed from: FRInit */
    public native int m121104x7c199bfc(boolean z17, java.lang.String str, int i17, long[] jArr, float f17, int i18);

    /* renamed from: FRNativeConstructor */
    public native void m121105x98f373f7();

    /* renamed from: FRNativeDestructor */
    public native void m121106xa15f645c();

    /* renamed from: FRPushCaptureTime */
    public native void m121107x50415d4d(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27935x14e7fd14 c27935x14e7fd14);

    /* renamed from: FRPushISOCaptureTime */
    public native void m121108xe162a914(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27935x14e7fd14 c27935x14e7fd14);

    /* renamed from: FRPushISOImgYuv */
    public native void m121109xe411f396(byte[] bArr, int i17, int i18);

    /* renamed from: FRPushYuv */
    public native void m121110x26f570f4(byte[] bArr, int i17, int i18, long j17, int i19, float[] fArr);

    /* renamed from: FRRelease */
    public native int m121111x7510799b();

    /* renamed from: FRSetBegin */
    public native void m121112xa09b1a53(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27935x14e7fd14 c27935x14e7fd14);

    /* renamed from: FRSetChangePointTime */
    public native void m121113xd6f1bd7(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27935x14e7fd14 c27935x14e7fd14);

    /* renamed from: FRSetDoingDelayCalc */
    public native void m121114x4138a657(boolean z17);

    /* renamed from: FRSetEnd */
    public native void m121115xecb88d05(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27935x14e7fd14 c27935x14e7fd14);

    /* renamed from: FRSetISObackup */
    public native void m121116xc098f31(double d17);

    /* renamed from: FRSetISOchangeFrame */
    public native void m121117xc8e9e78e(int i17);

    /* renamed from: FRSetISOchangeTime */
    public native void m121118x7a1e4c8c(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27935x14e7fd14 c27935x14e7fd14);

    /* renamed from: FRSetSafetyLevel */
    public native void m121119xf78439fc(int i17);

    /* renamed from: nativeLog */
    public static void m121088xc3e74fad(int i17, java.lang.String str) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.IYtLoggerListener iYtLoggerListener = f62404x70688e64;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTAGReflectLiveCheckJNIInterface.nativeLog]", str);
        }
    }

    /* renamed from: encodeJpeg */
    public static byte[] m121084xe2a0979e(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 99, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
