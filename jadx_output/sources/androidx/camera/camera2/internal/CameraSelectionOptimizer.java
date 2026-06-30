package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
class CameraSelectionOptimizer {
    private CameraSelectionOptimizer() {
    }

    private static java.lang.String decideSkippedCameraIdByHeuristic(androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, java.lang.Integer num, java.util.List<java.lang.String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((java.lang.Integer) cameraManagerCompat.getCameraCharacteristicsCompat("0").get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((java.lang.Integer) cameraManagerCompat.getCameraCharacteristicsCompat("1").get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    public static java.util.List<java.lang.String> getSelectedAvailableCameraIds(androidx.camera.camera2.internal.Camera2CameraFactory camera2CameraFactory, androidx.camera.core.CameraSelector cameraSelector) {
        java.lang.String str;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.String> asList = java.util.Arrays.asList(camera2CameraFactory.getCameraManager().getCameraIdList());
            if (cameraSelector == null) {
                java.util.Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) it.next());
                }
                return arrayList;
            }
            try {
                str = decideSkippedCameraIdByHeuristic(camera2CameraFactory.getCameraManager(), cameraSelector.getLensFacing(), asList);
            } catch (java.lang.IllegalStateException unused) {
                str = null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(camera2CameraFactory.getCameraInfo(str2));
                }
            }
            java.util.Iterator<androidx.camera.core.CameraInfo> it6 = cameraSelector.filter(arrayList2).iterator();
            while (it6.hasNext()) {
                arrayList.add(((androidx.camera.core.impl.CameraInfoInternal) it6.next()).getCameraId());
            }
            return arrayList;
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            throw new androidx.camera.core.InitializationException(androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(e17));
        } catch (androidx.camera.core.CameraUnavailableException e18) {
            throw new androidx.camera.core.InitializationException(e18);
        }
    }
}
