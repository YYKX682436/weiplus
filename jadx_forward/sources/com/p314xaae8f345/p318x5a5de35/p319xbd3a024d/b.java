package com.p314xaae8f345.p318x5a5de35.p319xbd3a024d;

/* loaded from: classes14.dex */
public class b implements android.hardware.Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera f127383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d f127384b;

    public b(com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.d dVar, android.hardware.Camera camera) {
        this.f127384b = dVar;
        this.f127383a = camera;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        if (this.f127383a == null) {
            com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002.C2893xc5ea4935.b("CameraHolderImp", "currentCamera is null!", this.f127384b.f127389c);
            return;
        }
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 interfaceC2889x4c929a29 = this.f127384b.f127388b;
        if (interfaceC2889x4c929a29 != null) {
            interfaceC2889x4c929a29.mo21573x60cd3549(bArr);
        }
    }
}
