package androidx.camera.extensions;

/* loaded from: classes14.dex */
public interface CameraExtensionsInfo {
    default androidx.lifecycle.g0 getCurrentExtensionMode() {
        return null;
    }

    default androidx.lifecycle.g0 getExtensionStrength() {
        return null;
    }

    default boolean isCurrentExtensionModeAvailable() {
        return false;
    }

    default boolean isExtensionStrengthAvailable() {
        return false;
    }
}
