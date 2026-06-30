package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class l0 implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.PreviewCallback f100012d;

    public l0(com.tencent.mm.plugin.facedetect.model.n0 n0Var, android.hardware.Camera.PreviewCallback previewCallback) {
        this.f100012d = previewCallback;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        android.hardware.Camera.PreviewCallback previewCallback = this.f100012d;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        camera.addCallbackBuffer(bArr);
    }
}
