package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class SessionResetPolicy {
    private final boolean mNeedAbortCapture;

    public SessionResetPolicy(androidx.camera.core.impl.Quirks quirks) {
        this.mNeedAbortCapture = quirks.contains(androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk.class);
    }

    public boolean needAbortCapture() {
        return this.mNeedAbortCapture;
    }
}
