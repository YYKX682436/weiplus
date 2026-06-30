package androidx.camera.core.impl.utils;

/* loaded from: classes14.dex */
public final class SessionProcessorUtil {
    private SessionProcessorUtil() {
    }

    public static androidx.camera.core.FocusMeteringAction getModifiedFocusMeteringAction(androidx.camera.core.impl.SessionProcessor sessionProcessor, androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        boolean z17;
        if (sessionProcessor == null) {
            return focusMeteringAction;
        }
        androidx.camera.core.FocusMeteringAction.Builder builder = new androidx.camera.core.FocusMeteringAction.Builder(focusMeteringAction);
        boolean z18 = true;
        if (focusMeteringAction.getMeteringPointsAf().isEmpty() || isOperationSupported(sessionProcessor, 1, 2)) {
            z17 = false;
        } else {
            builder.removePoints(1);
            z17 = true;
        }
        if (!focusMeteringAction.getMeteringPointsAe().isEmpty() && !isOperationSupported(sessionProcessor, 3)) {
            builder.removePoints(2);
            z17 = true;
        }
        if (focusMeteringAction.getMeteringPointsAwb().isEmpty() || isOperationSupported(sessionProcessor, 4)) {
            z18 = z17;
        } else {
            builder.removePoints(4);
        }
        if (!z18) {
            return focusMeteringAction;
        }
        androidx.camera.core.FocusMeteringAction build = builder.build();
        if (build.getMeteringPointsAf().isEmpty() && build.getMeteringPointsAe().isEmpty() && build.getMeteringPointsAwb().isEmpty()) {
            return null;
        }
        return builder.build();
    }

    public static boolean isOperationSupported(androidx.camera.core.impl.SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }
}
