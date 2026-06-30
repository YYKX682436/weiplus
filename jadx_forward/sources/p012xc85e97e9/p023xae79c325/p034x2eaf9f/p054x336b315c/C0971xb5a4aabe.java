package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* renamed from: androidx.camera.core.streamsharing.VirtualCameraInfo */
/* loaded from: classes14.dex */
public class C0971xb5a4aabe extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70 {

    /* renamed from: mVirtualCameraId */
    private final java.lang.String f2376xb5c90f1e;

    /* renamed from: mVirtualCameraRotationDegrees */
    private int f2377x6021c4a6;

    public C0971xb5a4aabe(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570) {
        super(interfaceC0675x66574570);
        this.f2376xb5c90f1e = "virtual-" + interfaceC0675x66574570.mo3161x72efd496() + "-" + java.util.UUID.randomUUID().toString();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getCameraId */
    public java.lang.String mo3161x72efd496() {
        return this.f2376xb5c90f1e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSensorRotationDegrees */
    public int mo3172x3b4734f9() {
        return mo3173x3b4734f9(0);
    }

    /* renamed from: setVirtualCameraRotationDegrees */
    public void m6612x2a02af1b(int i17) {
        this.f2377x6021c4a6 = i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSensorRotationDegrees */
    public int mo3173x3b4734f9(int i17) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5974x36f045e2(super.mo3173x3b4734f9(i17) - this.f2377x6021c4a6);
    }
}
