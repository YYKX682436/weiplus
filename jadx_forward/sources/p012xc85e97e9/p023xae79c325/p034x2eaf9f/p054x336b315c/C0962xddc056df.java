package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.streamsharing.StreamSharingBuilder */
/* loaded from: classes14.dex */
public class C0962xddc056df implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df> {

    /* renamed from: UNSUPPORTED_MESSAGE */
    private static final java.lang.String f2347xfb0703bd = "Operation not supported by StreamSharingBuilder.";

    /* renamed from: mMutableConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f2348x61287a9b;

    public C0962xddc056df() {
        this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
    /* renamed from: getMutableConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52() {
        return this.f2348x61287a9b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
    /* renamed from: setTargetClass */
    public /* bridge */ /* synthetic */ java.lang.Object mo4354xf26d54a5(java.lang.Class cls) {
        return mo4354xf26d54a5((java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c>) cls);
    }

    public C0962xddc056df(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a c0731x74f1ef5a) {
        this.f2348x61287a9b = c0731x74f1ef5a;
        java.lang.Class cls = (java.lang.Class) c0731x74f1ef5a.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, null);
        if (cls != null && !cls.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.class)) {
            throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.STREAM_SHARING);
        mo4354xf26d54a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.class);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
    /* renamed from: build */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c mo2888x59bc66e() {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: getUseCaseConfig, reason: avoid collision after fix types in other method */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e mo4446x111127c3() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f2348x61287a9b));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setCaptureOptionUnpacker */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4449x89aad198(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker optionUnpacker) {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setCaptureType */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType) {
        mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1829x7803883d, captureType);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setDefaultCaptureConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4452x8bbd60e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setDefaultSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4454xe586039(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setHighResolutionDisabled */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4456xcfdff38c(boolean z17) {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setSessionOptionUnpacker */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4465x523980e8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker optionUnpacker) {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setSurfaceOccupancyPriority */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4467x678fae66(int i17) {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
    /* renamed from: setTargetClass */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4354xf26d54a5(java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c> cls) {
        mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, cls);
        if (mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, null) == null) {
            mo4355x396335be(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
        }
        return this;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
    /* renamed from: setTargetName */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4355x396335be(java.lang.String str) {
        mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, str);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
    /* renamed from: setZslDisabled */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df mo4471xc3162e2d(boolean z17) {
        throw new java.lang.UnsupportedOperationException(f2347xfb0703bd);
    }
}
