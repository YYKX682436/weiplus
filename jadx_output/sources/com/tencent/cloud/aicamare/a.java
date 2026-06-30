package com.tencent.cloud.aicamare;

/* loaded from: classes14.dex */
public class a implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.cloud.aicamare.d f45849a;

    public a(com.tencent.cloud.aicamare.d dVar) {
        this.f45849a = dVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        this.f45849a.f45858e = false;
        this.f45849a.a("cameraFocus focus: " + z17);
        com.tencent.cloud.aicamare.callback.CameraEventListener cameraEventListener = this.f45849a.f45855b;
        if (cameraEventListener != null) {
            cameraEventListener.onAutoFocusSucceed();
        }
    }
}
