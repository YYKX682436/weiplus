package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* renamed from: androidx.camera.core.streamsharing.VirtualCameraControl */
/* loaded from: classes14.dex */
public class C0967xca3da54d extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b {

    /* renamed from: DEFAULT_JPEG_QUALITY */
    private static final int f2373xf8aa2966 = 100;

    /* renamed from: DEFAULT_ROTATION_DEGREES */
    private static final int f2374x976ba5a4 = 0;

    /* renamed from: mStreamSharingControl */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.Control f2375x65d4548e;

    public C0967xca3da54d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 interfaceC0669xec29d935, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.Control control) {
        super(interfaceC0669xec29d935);
        this.f2375x65d4548e = control;
    }

    /* renamed from: getJpegQuality */
    private int m6607x354bfa41(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        java.lang.Integer num = (java.lang.Integer) c0690x88f65a08.m5333xca0018d6().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1602x542c7792, 100);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: getRotationDegrees */
    private int m6608x2a7ffb93(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        java.lang.Integer num = (java.lang.Integer) c0690x88f65a08.m5333xca0018d6().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1604x5742e808, 0);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$submitStillCaptureRequests$0 */
    public static /* synthetic */ wa.a m6609xc1288c63(wa.a aVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603 interfaceC0595xc48d2603) {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603) aVar.get()).mo3222x7b0ce9bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$submitStillCaptureRequests$1 */
    public /* synthetic */ wa.a m6610xc1288c64(java.util.List list, java.lang.Void r47) {
        return this.f2375x65d4548e.mo6580x70f4324c(m6607x354bfa41((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08) list.get(0)), m6608x2a7ffb93((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$submitStillCaptureRequests$2 */
    public static /* synthetic */ wa.a m6611xc1288c65(wa.a aVar, java.lang.Void r17) {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603) aVar.get()).mo3221xbabf3aee();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: submitStillCaptureRequests */
    public wa.a mo3004x7c34ae9a(final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list, int i17, int i18) {
        m3.h.b(list.size() == 1, "Only support one capture config.");
        final wa.a mo2965x86fba60f = mo2965x86fba60f(i17, i18);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6008xc771b0f1(java.util.Collections.singletonList(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(mo2965x86fba60f).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
            /* renamed from: apply */
            public final wa.a mo3010x58b836e(java.lang.Object obj) {
                wa.a m6609xc1288c63;
                m6609xc1288c63 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0967xca3da54d.m6609xc1288c63(wa.a.this, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0595xc48d2603) obj);
                return m6609xc1288c63;
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc()).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$b
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
            /* renamed from: apply */
            public final wa.a mo3010x58b836e(java.lang.Object obj) {
                wa.a m6610xc1288c64;
                m6610xc1288c64 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0967xca3da54d.this.m6610xc1288c64(list, (java.lang.Void) obj);
                return m6610xc1288c64;
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc()).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$c
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
            /* renamed from: apply */
            public final wa.a mo3010x58b836e(java.lang.Object obj) {
                wa.a m6611xc1288c65;
                m6611xc1288c65 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0967xca3da54d.m6611xc1288c65(wa.a.this, (java.lang.Void) obj);
                return m6611xc1288c65;
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc())));
    }
}
