package org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01;

/* renamed from: org.chromium.base.memory.JavaHeapDumpGenerator */
/* loaded from: classes7.dex */
public final class C29400xe8e40291 {
    private static final java.lang.String TAG = "JavaHprofGenerator";

    private C29400xe8e40291() {
    }

    /* renamed from: generateHprof */
    public static boolean m152876x66af4b4c(java.lang.String str) {
        try {
            android.os.Debug.dumpHprofData(str);
            return true;
        } catch (java.io.IOException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "Error writing to file " + str + ". Error: " + e17.getMessage());
            return false;
        }
    }
}
