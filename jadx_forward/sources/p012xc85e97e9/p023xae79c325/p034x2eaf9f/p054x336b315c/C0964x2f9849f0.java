package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.streamsharing.VirtualCamera */
/* loaded from: classes14.dex */
public class C0964x2f9849f0 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 {

    /* renamed from: UNSUPPORTED_MESSAGE */
    private static final java.lang.String f2351xfb0703bd = "Operation not supported by VirtualCamera.";

    /* renamed from: mParentCamera */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2352xba9c297c;

    /* renamed from: mStateChangeCallback */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback f2353x4344b559;

    /* renamed from: mVirtualCameraControl */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0967xca3da54d f2354x275e2d3a;

    /* renamed from: mVirtualCameraInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0971xb5a4aabe f2355x67c1f1f1;

    public C0964x2f9849f0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback stateChangeCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.Control control) {
        this.f2352xba9c297c = interfaceC0677x9e0bc522;
        this.f2353x4344b559 = stateChangeCallback;
        this.f2354x275e2d3a = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0967xca3da54d(interfaceC0677x9e0bc522.mo3090x8af45b9f(), control);
        this.f2355x67c1f1f1 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0971xb5a4aabe(interfaceC0677x9e0bc522.mo3091xbefeb46());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: attachUseCases */
    public void mo3082x352acf61(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        throw new java.lang.UnsupportedOperationException(f2351xfb0703bd);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: close */
    public void mo3083x5a5ddf8() {
        throw new java.lang.UnsupportedOperationException(f2351xfb0703bd);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: detachUseCases */
    public void mo3086xe116caaf(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        throw new java.lang.UnsupportedOperationException(f2351xfb0703bd);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: getCameraControlInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 mo3090x8af45b9f() {
        return this.f2354x275e2d3a;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: getCameraInfoInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 mo3091xbefeb46() {
        return this.f2355x67c1f1f1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: getCameraState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State> mo3092x53e98736() {
        return this.f2352xba9c297c.mo3092x53e98736();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: getHasTransform */
    public boolean mo5289x5ef3d868() {
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseActive */
    public void mo3097x82b04b9e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f2353x4344b559.mo3097x82b04b9e(abstractC0580x5a5e3137);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseInactive */
    public void mo3098xfbf86303(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f2353x4344b559.mo3098xfbf86303(abstractC0580x5a5e3137);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseReset */
    public void mo3099xdbdd5db7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f2353x4344b559.mo3099xdbdd5db7(abstractC0580x5a5e3137);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseUpdated */
    public void mo3100xa9fa723(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f2353x4344b559.mo3100xa9fa723(abstractC0580x5a5e3137);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: open */
    public void mo3101x34264a() {
        throw new java.lang.UnsupportedOperationException(f2351xfb0703bd);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: release */
    public wa.a mo3104x41012807() {
        throw new java.lang.UnsupportedOperationException(f2351xfb0703bd);
    }

    /* renamed from: setRotationDegrees */
    public void m6583x61569507(int i17) {
        this.f2355x67c1f1f1.m6612x2a02af1b(i17);
    }
}
