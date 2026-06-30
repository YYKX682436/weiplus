package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.ContextUtils */
/* loaded from: classes13.dex */
public class C29752x4bd17462 {
    private static final java.lang.String TAG = "ContextUtils";

    /* renamed from: applicationContext */
    private static android.content.Context f75262x5b0a2e3f;

    @java.lang.Deprecated
    /* renamed from: getApplicationContext */
    public static android.content.Context m155345x6e669035() {
        return f75262x5b0a2e3f;
    }

    /* renamed from: initialize */
    public static void m155346x33ebcb90(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
        }
        f75262x5b0a2e3f = context;
    }
}
