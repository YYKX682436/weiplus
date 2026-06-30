package androidx.camera.extensions.internal.compat.workaround;

/* loaded from: classes14.dex */
public class ExtensionDisabledValidator {
    private final androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk mQuirk = (androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk) androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.get(androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk.class);

    public boolean shouldDisableExtension() {
        androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk extensionDisabledQuirk = this.mQuirk;
        return extensionDisabledQuirk != null && extensionDisabledQuirk.shouldDisableExtension();
    }
}
