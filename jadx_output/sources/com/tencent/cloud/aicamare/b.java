package com.tencent.cloud.aicamare;

/* loaded from: classes14.dex */
public class b implements android.hardware.Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera f45850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.cloud.aicamare.d f45851b;

    public b(com.tencent.cloud.aicamare.d dVar, android.hardware.Camera camera) {
        this.f45851b = dVar;
        this.f45850a = camera;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        if (this.f45850a == null) {
            com.tencent.cloud.aicamare.util.CameraLogger.b("CameraHolderImp", "currentCamera is null!", this.f45851b.f45856c);
            return;
        }
        com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener = this.f45851b.f45855b;
        if (cameraEventListener != null) {
            cameraEventListener.onDataFrameCallBack(bArr);
        }
    }
}
