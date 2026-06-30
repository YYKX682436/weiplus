package com.p314xaae8f345.p3223x6dd56e0.p3224x15398116.jni;

/* renamed from: com.tencent.youtu.lipreader.jni.YTLipReader */
/* loaded from: classes5.dex */
public class C27881x41abd05b {
    private static final java.lang.String TAG = "YTLipReader";

    /* renamed from: nativePtr */
    private long f61494xc3e75f57;

    public C27881x41abd05b() {
        m120548x65a24b43();
    }

    /* renamed from: NativeConstructor */
    private native void m120548x65a24b43();

    /* renamed from: NativeDestructor */
    private native void m120549xb127390();

    /* renamed from: encodeJpeg */
    public static byte[] m120550xe2a0979e(android.graphics.Bitmap bitmap, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: encodePng */
    public static byte[] m120551x59e43c33(android.graphics.Bitmap bitmap, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: destroy */
    public void m120552x5cd39ffa() {
        m120549xb127390();
    }

    /* renamed from: feature */
    public native java.lang.String m120553xc5a27af6();

    /* renamed from: feed */
    public native void m120554x2fe59e(float[] fArr, byte[] bArr, int i17, int i18, int i19, float f17, float f18, float f19);

    /* renamed from: finalize */
    public void m120555xd764dc1e() {
        super.finalize();
        m120549xb127390();
    }

    /* renamed from: getImageListJsonStr */
    public native java.lang.String m120556x2bd478c6();

    /* renamed from: getVersion */
    public native java.lang.String m120557x52c258a2();

    /* renamed from: init */
    public native void m120558x316510();

    /* renamed from: lipReadingFeature */
    public native java.lang.String m120559x3ed9003d();

    /* renamed from: reset */
    public native void m120560x6761d4f();
}
