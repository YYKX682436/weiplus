package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
class Camera2CaptureRequestBuilder {
    private static final java.lang.String TAG = "Camera2CaptureRequestBuilder";

    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(android.hardware.camera2.CameraDevice cameraDevice, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private Camera2CaptureRequestBuilder() {
    }

    private static void applyAeFpsRange(androidx.camera.core.impl.CaptureConfig captureConfig, android.hardware.camera2.CaptureRequest.Builder builder) {
        if (captureConfig.getExpectedFrameRateRange().equals(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            return;
        }
        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, captureConfig.getExpectedFrameRateRange());
    }

    private static void applyImplementationOptionToCaptureBuilder(android.hardware.camera2.CaptureRequest.Builder builder, androidx.camera.core.impl.Config config) {
        androidx.camera.camera2.interop.CaptureRequestOptions build = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(config).build();
        for (androidx.camera.core.impl.Config.Option<?> option : build.listOptions()) {
            android.hardware.camera2.CaptureRequest.Key key = (android.hardware.camera2.CaptureRequest.Key) option.getToken();
            try {
                builder.set(key, build.retrieveOption(option));
            } catch (java.lang.IllegalArgumentException unused) {
                androidx.camera.core.Logger.e(TAG, "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void applyTemplateParamsOverrideWorkaround(android.hardware.camera2.CaptureRequest.Builder builder, int i17, androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride templateParamsOverride) {
        for (java.util.Map.Entry<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> entry : templateParamsOverride.getOverrideParams(i17).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    public static void applyVideoStabilization(androidx.camera.core.impl.CaptureConfig captureConfig, android.hardware.camera2.CaptureRequest.Builder builder) {
        if (captureConfig.getPreviewStabilizationMode() == 1 || captureConfig.getVideoStabilizationMode() == 1) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (captureConfig.getPreviewStabilizationMode() == 2) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (captureConfig.getVideoStabilizationMode() == 2) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    public static android.hardware.camera2.CaptureRequest build(androidx.camera.core.impl.CaptureConfig captureConfig, android.hardware.camera2.CameraDevice cameraDevice, java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> map, boolean z17, androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride templateParamsOverride) {
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        java.util.List<android.view.Surface> configuredSurfaces = getConfiguredSurfaces(captureConfig.getSurfaces(), map);
        if (configuredSurfaces.isEmpty()) {
            return null;
        }
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = captureConfig.getCameraCaptureResult();
        if (captureConfig.getTemplateType() == 5 && cameraCaptureResult != null && (cameraCaptureResult.getCaptureResult() instanceof android.hardware.camera2.TotalCaptureResult)) {
            androidx.camera.core.Logger.d(TAG, "createReprocessCaptureRequest");
            createCaptureRequest = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.Api23Impl.createReprocessCaptureRequest(cameraDevice, (android.hardware.camera2.TotalCaptureResult) cameraCaptureResult.getCaptureResult());
        } else {
            androidx.camera.core.Logger.d(TAG, "createCaptureRequest");
            if (captureConfig.getTemplateType() == 5) {
                createCaptureRequest = cameraDevice.createCaptureRequest(z17 ? 1 : 2);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(captureConfig.getTemplateType());
            }
        }
        applyTemplateParamsOverrideWorkaround(createCaptureRequest, captureConfig.getTemplateType(), templateParamsOverride);
        applyAeFpsRange(captureConfig, createCaptureRequest);
        applyVideoStabilization(captureConfig, createCaptureRequest);
        androidx.camera.core.impl.Config implementationOptions = captureConfig.getImplementationOptions();
        androidx.camera.core.impl.Config.Option<java.lang.Integer> option = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION;
        if (implementationOptions.containsOption(option)) {
            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION, (java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(option));
        }
        androidx.camera.core.impl.Config implementationOptions2 = captureConfig.getImplementationOptions();
        androidx.camera.core.impl.Config.Option<java.lang.Integer> option2 = androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY;
        if (implementationOptions2.containsOption(option2)) {
            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.JPEG_QUALITY, java.lang.Byte.valueOf(((java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(option2)).byteValue()));
        }
        applyImplementationOptionToCaptureBuilder(createCaptureRequest, captureConfig.getImplementationOptions());
        java.util.Iterator<android.view.Surface> it = configuredSurfaces.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget(it.next());
        }
        createCaptureRequest.setTag(captureConfig.getTagBundle());
        return createCaptureRequest.build();
    }

    public static android.hardware.camera2.CaptureRequest buildWithoutTarget(androidx.camera.core.impl.CaptureConfig captureConfig, android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride templateParamsOverride) {
        if (cameraDevice == null) {
            return null;
        }
        androidx.camera.core.Logger.d(TAG, "template type = " + captureConfig.getTemplateType());
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(captureConfig.getTemplateType());
        applyTemplateParamsOverrideWorkaround(createCaptureRequest, captureConfig.getTemplateType(), templateParamsOverride);
        applyImplementationOptionToCaptureBuilder(createCaptureRequest, captureConfig.getImplementationOptions());
        return createCaptureRequest.build();
    }

    private static java.util.List<android.view.Surface> getConfiguredSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> list, java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            android.view.Surface surface = map.get(it.next());
            if (surface == null) {
                throw new java.lang.IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
