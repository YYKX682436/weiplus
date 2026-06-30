package org.p3367x5a555907.p3368x32b0ae;

/* renamed from: org.tensorflow.lite.TensorFlowLite */
/* loaded from: classes13.dex */
public final class C29718xd6a8d295 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f429400a;

    public static void a() {
        if (f429400a) {
            return;
        }
        try {
            m155092xf1d689d7();
            f429400a = true;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            throw new java.lang.UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():");
        }
    }

    /* renamed from: nativeRuntimeVersion */
    public static native java.lang.String m155092xf1d689d7();

    /* renamed from: nativeSchemaVersion */
    public static native java.lang.String m155093x95a01520();
}
