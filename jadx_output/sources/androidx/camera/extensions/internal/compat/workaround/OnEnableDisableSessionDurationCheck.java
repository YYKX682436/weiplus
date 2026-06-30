package androidx.camera.extensions.internal.compat.workaround;

/* loaded from: classes14.dex */
public class OnEnableDisableSessionDurationCheck {
    static final long MIN_DURATION_FOR_ENABLE_DISABLE_SESSION = 100;
    private static final java.lang.String TAG = "OnEnableDisableSessionDurationCheck";
    private final boolean mEnabledMinimumDuration;
    private long mOnEnableSessionTimeStamp;

    public OnEnableDisableSessionDurationCheck() {
        this(androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.get(androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon.class) != null);
    }

    private void ensureMinDurationAfterOnEnableSession() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.mOnEnableSessionTimeStamp;
        while (true) {
            long j18 = elapsedRealtime - j17;
            if (j18 >= 100) {
                return;
            }
            long j19 = 100 - j18;
            try {
                androidx.camera.core.Logger.d(TAG, "onDisableSession too soon, wait " + j19 + " ms");
                java.lang.Thread.sleep(j19);
                elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                j17 = this.mOnEnableSessionTimeStamp;
            } catch (java.lang.InterruptedException unused) {
                androidx.camera.core.Logger.e(TAG, "sleep interrupted");
                return;
            }
        }
    }

    public void onDisableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            ensureMinDurationAfterOnEnableSession();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            this.mOnEnableSessionTimeStamp = android.os.SystemClock.elapsedRealtime();
        }
    }

    public OnEnableDisableSessionDurationCheck(boolean z17) {
        this.mOnEnableSessionTimeStamp = 0L;
        this.mEnabledMinimumDuration = z17;
    }
}
