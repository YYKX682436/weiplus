package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class ConvergenceUtils {
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> AE_CONVERGED_STATE_SET;
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> AE_TORCH_AS_FLASH_CONVERGED_STATE_SET;
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AfState> AF_CONVERGED_STATE_SET = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED, androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AwbState> AWB_CONVERGED_STATE_SET = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED, androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN));
    private static final java.lang.String TAG = "ConvergenceUtils";

    static {
        androidx.camera.core.impl.CameraCaptureMetaData.AeState aeState = androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED;
        androidx.camera.core.impl.CameraCaptureMetaData.AeState aeState2 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        androidx.camera.core.impl.CameraCaptureMetaData.AeState aeState3 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
        java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> unmodifiableSet = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(aeState, aeState2, aeState3));
        AE_CONVERGED_STATE_SET = unmodifiableSet;
        java.util.EnumSet copyOf = java.util.EnumSet.copyOf((java.util.Collection) unmodifiableSet);
        copyOf.remove(aeState2);
        copyOf.remove(aeState3);
        AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = java.util.Collections.unmodifiableSet(copyOf);
    }

    private ConvergenceUtils() {
    }

    public static boolean is3AConverged(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult, boolean z17) {
        boolean z18 = cameraCaptureResult.getAfMode() == androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF || cameraCaptureResult.getAfMode() == androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN || AF_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAfState());
        boolean z19 = cameraCaptureResult.getAeMode() == androidx.camera.core.impl.CameraCaptureMetaData.AeMode.OFF;
        boolean z27 = !z17 ? !(z19 || AE_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState())) : !(z19 || AE_TORCH_AS_FLASH_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState()));
        boolean z28 = (cameraCaptureResult.getAwbMode() == androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.OFF) || AWB_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAwbState());
        androidx.camera.core.Logger.d(TAG, "checkCaptureResult, AE=" + cameraCaptureResult.getAeState() + " AF =" + cameraCaptureResult.getAfState() + " AWB=" + cameraCaptureResult.getAwbState());
        return z18 && z27 && z28;
    }
}
