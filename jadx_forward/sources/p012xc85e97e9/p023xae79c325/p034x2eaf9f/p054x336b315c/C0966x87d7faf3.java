package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* renamed from: androidx.camera.core.streamsharing.VirtualCameraCaptureResult */
/* loaded from: classes14.dex */
public class C0966x87d7faf3 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be {

    /* renamed from: INVALID_TIMESTAMP */
    private static final long f2369x21d7908e = -1;

    /* renamed from: mBaseCameraCaptureResult */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be f2370x52309220;

    /* renamed from: mTagBundle */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c f2371xc5f18acf;

    /* renamed from: mTimestamp */
    private final long f2372x7e007329;

    public C0966x87d7faf3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        this(interfaceC0663xe081a7be, c0760xc2ac609c, -1L);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAeMode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode mo2927x10512add() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        return interfaceC0663xe081a7be != null ? interfaceC0663xe081a7be.mo2927x10512add() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAeState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState mo2928xfa2afa97() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        return interfaceC0663xe081a7be != null ? interfaceC0663xe081a7be.mo2928xfa2afa97() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAfMode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode mo2929x105f425e() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        return interfaceC0663xe081a7be != null ? interfaceC0663xe081a7be.mo2929x105f425e() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAfState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState mo2930xfbdfd336() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        return interfaceC0663xe081a7be != null ? interfaceC0663xe081a7be.mo2930xfbdfd336() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAwbMode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode mo2931x19a40e79() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        return interfaceC0663xe081a7be != null ? interfaceC0663xe081a7be.mo2931x19a40e79() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAwbState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState mo2932x1b348a7b() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        return interfaceC0663xe081a7be != null ? interfaceC0663xe081a7be.mo2932x1b348a7b() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getFlashState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState mo2934xa6611277() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        return interfaceC0663xe081a7be != null ? interfaceC0663xe081a7be.mo2934xa6611277() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getTagBundle */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c mo2935x4aa7b206() {
        return this.f2371xc5f18acf;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getTimestamp */
    public long mo2936x2b69a60() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be = this.f2370x52309220;
        if (interfaceC0663xe081a7be != null) {
            return interfaceC0663xe081a7be.mo2936x2b69a60();
        }
        long j17 = this.f2372x7e007329;
        if (j17 != -1) {
            return j17;
        }
        throw new java.lang.IllegalStateException("No timestamp is available.");
    }

    public C0966x87d7faf3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, long j17) {
        this(null, c0760xc2ac609c, j17);
    }

    private C0966x87d7faf3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, long j17) {
        this.f2370x52309220 = interfaceC0663xe081a7be;
        this.f2371xc5f18acf = c0760xc2ac609c;
        this.f2372x7e007329 = j17;
    }
}
