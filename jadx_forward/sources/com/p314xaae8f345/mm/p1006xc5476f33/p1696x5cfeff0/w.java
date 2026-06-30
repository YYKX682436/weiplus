package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class w implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.PreviewCallback f218820d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var, android.hardware.Camera.PreviewCallback previewCallback) {
        this.f218820d = previewCallback;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        android.hardware.Camera.PreviewCallback previewCallback = this.f218820d;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        camera.addCallbackBuffer(bArr);
    }
}
