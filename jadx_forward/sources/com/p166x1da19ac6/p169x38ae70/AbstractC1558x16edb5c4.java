package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaConfigJNIBase */
/* loaded from: classes15.dex */
public abstract class AbstractC1558x16edb5c4 extends com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2 {

    /* renamed from: mLogger */
    private com.p166x1da19ac6.p169x38ae70.InterfaceC1570x9606d840 f5104xe041c5d;

    /* renamed from: mNativePointer */
    long f5105xa2496b9;

    private AbstractC1558x16edb5c4(long j17) {
        if (j17 != 0) {
            this.f5105xa2496b9 = j17;
            return;
        }
        throw new java.lang.IllegalStateException("Failed to allocate native memory");
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: getLogger */
    public com.p166x1da19ac6.p169x38ae70.InterfaceC1570x9606d840 mo16754x23af1886() {
        return this.f5104xe041c5d;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: getNativePointer */
    public long mo16755x6c764a70() {
        return this.f5105xa2496b9;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: setExperimentalFeatureEnabled */
    public void mo16756xaae73c75(com.p166x1da19ac6.p169x38ae70.EnumC1565xe5245c3e enumC1565xe5245c3e, boolean z17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16836x458d465a(this.f5105xa2496b9, enumC1565xe5245c3e.m16798x2124a6c2(), z17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: setLogger */
    public void mo16757x16e44c92(com.p166x1da19ac6.p169x38ae70.InterfaceC1570x9606d840 interfaceC1570x9606d840) {
        this.f5104xe041c5d = interfaceC1570x9606d840;
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16837x60ebbe1d(this.f5105xa2496b9, interfaceC1570x9606d840);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: setPointScaleFactor */
    public void mo16758xa9d4840b(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16838xc0462b84(this.f5105xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: setPrintTreeFlag */
    public void mo16759xa57624b5(boolean z17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16839xa151cb06(this.f5105xa2496b9, z17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: setShouldDiffLayoutWithoutLegacyStretchBehaviour */
    public void mo16760x622e6045(boolean z17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16840xd064d76(this.f5105xa2496b9, z17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: setUseLegacyStretchBehaviour */
    public void mo16761x6242e546(boolean z17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16841xa64723d5(this.f5105xa2496b9, z17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2
    /* renamed from: setUseWebDefaults */
    public void mo16762x603bac1(boolean z17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16842x750ce38e(this.f5105xa2496b9, z17);
    }

    public AbstractC1558x16edb5c4() {
        this(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16835xa36fb5cf());
    }

    public AbstractC1558x16edb5c4(boolean z17) {
        this(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16835xa36fb5cf());
    }
}
