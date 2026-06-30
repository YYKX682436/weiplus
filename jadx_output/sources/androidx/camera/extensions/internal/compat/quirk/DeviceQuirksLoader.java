package androidx.camera.extensions.internal.compat.quirk;

/* loaded from: classes14.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    public static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk.class, androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk.load())) {
            arrayList.add(new androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon.class, androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon.load())) {
            arrayList.add(new androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit.class, androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit.load())) {
            arrayList.add(new androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk.class, androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk.load())) {
            arrayList.add(new androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk());
        }
        return arrayList;
    }
}
