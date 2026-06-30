package com.tencent.liteav.videoproducer.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class NativeCapturerParamCreator {
    public static java.lang.Boolean createBooleanWithValue(boolean z17) {
        return java.lang.Boolean.valueOf(z17);
    }

    public static com.tencent.liteav.videoproducer.capture.CameraCaptureParams createCameraParams(java.lang.Boolean bool, int i17, int i18, int i19) {
        com.tencent.liteav.videoproducer.capture.CameraCaptureParams cameraCaptureParams = new com.tencent.liteav.videoproducer.capture.CameraCaptureParams();
        cameraCaptureParams.f46992a = bool;
        cameraCaptureParams.f46998b = i17;
        cameraCaptureParams.f46999c = i18;
        cameraCaptureParams.f47000d = i19;
        return cameraCaptureParams;
    }
}
