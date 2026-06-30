package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraInternal */
/* loaded from: classes14.dex */
public interface InterfaceC0677x9e0bc522 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback {

    /* renamed from: androidx.camera.core.impl.CameraInternal$State */
    /* loaded from: classes14.dex */
    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* renamed from: mHoldsCameraSlot */
        private final boolean f1569xc2464d4a;

        State(boolean z17) {
            this.f1569xc2464d4a = z17;
        }

        /* renamed from: holdsCameraSlot */
        public boolean m5295xf2981d77() {
            return this.f1569xc2464d4a;
        }
    }

    /* renamed from: attachUseCases */
    void mo3082x352acf61(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection);

    /* renamed from: close */
    void mo3083x5a5ddf8();

    /* renamed from: detachUseCases */
    void mo3086xe116caaf(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection);

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getCameraControl */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658 mo4252xa97012c2() {
        return mo3090x8af45b9f();
    }

    /* renamed from: getCameraControlInternal */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 mo3090x8af45b9f();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getCameraInfo */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 mo4253x764d3969() {
        return mo3091xbefeb46();
    }

    /* renamed from: getCameraInfoInternal */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 mo3091xbefeb46();

    /* renamed from: getCameraState */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State> mo3092x53e98736();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getExtendedConfig */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 mo3093x13f11ad1() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0668x1ba9066c.m5276x1e74d0e3();
    }

    /* renamed from: getHasTransform */
    default boolean mo5289x5ef3d868() {
        return true;
    }

    /* renamed from: isFrontFacing */
    default boolean m5290x298133d9() {
        return mo4253x764d3969().mo3168x5f62de6e() == 0;
    }

    /* renamed from: open */
    void mo3101x34264a();

    /* renamed from: release */
    wa.a mo3104x41012807();

    /* renamed from: setActiveResumingMode */
    default void mo3107x2bcb495(boolean z17) {
    }

    /* renamed from: setExtendedConfig */
    default void mo3108xdbe782dd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 interfaceC0665xb691d6e7) {
    }

    /* renamed from: setPrimary */
    default void mo3109x9e7b9740(boolean z17) {
    }
}
