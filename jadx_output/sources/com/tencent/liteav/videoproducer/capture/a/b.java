package com.tencent.liteav.videoproducer.capture.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class b implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.videoproducer.capture.a.b f47034a = new com.tencent.liteav.videoproducer.capture.a.b();

    private b() {
    }

    public static android.hardware.Camera.AutoFocusCallback a() {
        return f47034a;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.tencent.liteav.base.util.LiteavLog.d("CameraController", "onAutoFocus success: %b", java.lang.Boolean.valueOf(z17));
    }
}
