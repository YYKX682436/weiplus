package androidx.camera.core.internal.utils;

/* loaded from: classes14.dex */
public final class UseCaseConfigUtil {
    private UseCaseConfigUtil() {
    }

    public static void updateTargetRotationAndRelatedConfigs(androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder, int i17) {
        android.util.Size targetResolution;
        androidx.camera.core.impl.ImageOutputConfig imageOutputConfig = (androidx.camera.core.impl.ImageOutputConfig) builder.getUseCaseConfig();
        int targetRotation = imageOutputConfig.getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i17) {
            ((androidx.camera.core.impl.ImageOutputConfig.Builder) builder).setTargetRotation(i17);
        }
        if (targetRotation == -1 || i17 == -1 || targetRotation == i17) {
            return;
        }
        if (java.lang.Math.abs(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i17) - androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)) % 180 != 90 || (targetResolution = imageOutputConfig.getTargetResolution(null)) == null) {
            return;
        }
        ((androidx.camera.core.impl.ImageOutputConfig.Builder) builder).setTargetResolution(new android.util.Size(targetResolution.getHeight(), targetResolution.getWidth()));
    }
}
