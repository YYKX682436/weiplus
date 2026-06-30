package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes14.dex */
public class l0 implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.PreviewCallback f181545d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var, android.hardware.Camera.PreviewCallback previewCallback) {
        this.f181545d = previewCallback;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        android.hardware.Camera.PreviewCallback previewCallback = this.f181545d;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        camera.addCallbackBuffer(bArr);
    }
}
