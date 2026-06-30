package com.p314xaae8f345.p318x5a5de35.p319xbd3a024d;

/* loaded from: classes14.dex */
public class a implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d f127382a;

    public a(com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar) {
        this.f127382a = dVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        this.f127382a.f127391e = false;
        this.f127382a.a("cameraFocus focus: " + z17);
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29 = this.f127382a.f127388b;
        if (interfaceC2889x4c929a29 != null) {
            interfaceC2889x4c929a29.mo21570x825db598();
        }
    }
}
