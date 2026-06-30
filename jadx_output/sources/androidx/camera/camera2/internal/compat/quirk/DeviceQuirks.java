package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class DeviceQuirks {
    private static final java.lang.String TAG = "DeviceQuirks";
    private static volatile androidx.camera.core.impl.Quirks sQuirks;

    static {
        androidx.camera.core.impl.QuirkSettingsHolder.instance().observe(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new androidx.camera.camera2.internal.compat.quirk.DeviceQuirks$$a());
    }

    private DeviceQuirks() {
    }

    public static <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> cls) {
        return (T) sQuirks.get(cls);
    }

    public static androidx.camera.core.impl.Quirks getAll() {
        return sQuirks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        sQuirks = new androidx.camera.core.impl.Quirks(androidx.camera.camera2.internal.compat.quirk.DeviceQuirksLoader.loadQuirks(quirkSettings));
        androidx.camera.core.Logger.d(TAG, "camera2 DeviceQuirks = " + androidx.camera.core.impl.Quirks.toString(sQuirks));
    }
}
