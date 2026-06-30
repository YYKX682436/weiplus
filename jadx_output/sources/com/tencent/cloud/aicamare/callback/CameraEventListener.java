package com.tencent.cloud.aicamare.callback;

/* loaded from: classes14.dex */
public interface CameraEventListener {
    void onAutoFocusSucceed();

    void onCameraClosed();

    void onCameraSucceed();

    void onDataFrameCallBack(byte[] bArr);

    void onEventError(int i17, java.lang.String str);

    void onPreviewSucceed();
}
