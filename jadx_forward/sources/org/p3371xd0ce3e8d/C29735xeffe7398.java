package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.Camera1Capturer */
/* loaded from: classes16.dex */
public class C29735xeffe7398 extends org.p3371xd0ce3e8d.AbstractC29745x79152051 {

    /* renamed from: captureToTexture */
    private final boolean f75129x1ec2557a;

    public C29735xeffe7398(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler cameraEventsHandler, boolean z17) {
        super(str, cameraEventsHandler, new org.p3371xd0ce3e8d.C29736xd4076e70(z17));
        this.f75129x1ec2557a = z17;
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: changeCaptureFormat */
    public /* bridge */ /* synthetic */ void mo155151xb311390d(int i17, int i18, int i19) {
        super.mo155151xb311390d(i17, i18, i19);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051
    /* renamed from: createCameraSession */
    public void mo155152x8a597c15(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback createSessionCallback, org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events events, android.content.Context context, org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, java.lang.String str, int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29737x33d44b6a.m155187xaf65a0fc(createSessionCallback, events, this.f75129x1ec2557a, context, c29864x472c891c, str, i17, i18, i19);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: dispose */
    public /* bridge */ /* synthetic */ void mo155153x63a5261f() {
        super.mo155153x63a5261f();
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: initialize */
    public /* bridge */ /* synthetic */ void mo155154x33ebcb90(org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, android.content.Context context, org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 interfaceC29751x4bd47102) {
        super.mo155154x33ebcb90(c29864x472c891c, context, interfaceC29751x4bd47102);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: isScreencast */
    public /* bridge */ /* synthetic */ boolean mo155155x68912275() {
        return super.mo155155x68912275();
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051
    /* renamed from: printStackTrace */
    public /* bridge */ /* synthetic */ void mo155156x6e0e6e2a() {
        super.mo155156x6e0e6e2a();
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: startCapture */
    public /* bridge */ /* synthetic */ void mo155157x18ec4884(int i17, int i18, int i19) {
        super.mo155157x18ec4884(i17, i18, i19);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: stopCapture */
    public /* bridge */ /* synthetic */ void mo155158xd45bb0e4() {
        super.mo155158xd45bb0e4();
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842
    /* renamed from: switchCamera */
    public /* bridge */ /* synthetic */ void mo155159x2db92f79(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler) {
        super.mo155159x2db92f79(cameraSwitchHandler);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29745x79152051, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842
    /* renamed from: switchCamera */
    public /* bridge */ /* synthetic */ void mo155160x2db92f79(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler, java.lang.String str) {
        super.mo155160x2db92f79(cameraSwitchHandler, str);
    }
}
