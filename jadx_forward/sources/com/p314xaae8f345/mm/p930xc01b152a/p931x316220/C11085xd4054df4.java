package com.p314xaae8f345.mm.p930xc01b152a.p931x316220;

/* renamed from: com.tencent.mm.mm7zip.impl.OutArchiveImpl */
/* loaded from: classes16.dex */
public class C11085xd4054df4<T extends com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11051x42cfe9e9> implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11039xe3d16abd<T> {

    /* renamed from: archiveFormat */
    private com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 f32471xad7eab59;

    /* renamed from: closed */
    private boolean f32472xaf15e16c;

    /* renamed from: headerEncryption */
    private java.lang.Boolean f32474x4aa1c1f0;

    /* renamed from: inArchive */
    private com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 f32475xa97447dd;

    /* renamed from: jbindingSession */
    private long f32476x83d2fb3b;

    /* renamed from: sevenZipArchiveInstance */
    private long f32477xea4a8503;

    /* renamed from: trace */
    private boolean f32479x697f145;

    /* renamed from: tracePrintStream */
    private java.io.PrintStream f32480x64252208;

    /* renamed from: compressionLevel */
    private int f32473x84a241be = -1;

    /* renamed from: threadCount */
    private int f32478x718c8925 = -1;

    /* renamed from: doUpdateItems */
    private void m47733xc13abaec(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11044xb21bbf06<?> interfaceC11044xb21bbf06) {
        mo47732xf7477dcb();
        m47736xb62707e0(interfaceC11060xf8e90f26, i17, interfaceC11044xb21bbf06);
    }

    /* renamed from: ensureOpened */
    private void m47734x31e3aa47() {
        if (this.f32472xaf15e16c) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("OutArchive closed");
        }
        com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 interfaceC11037xc9d7a994 = this.f32475xa97447dd;
        if (interfaceC11037xc9d7a994 != null) {
            ((com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11083xf3e5177d) interfaceC11037xc9d7a994).m47729x31e3aa47();
        }
    }

    /* renamed from: nativeClose */
    private native void m47735x66d21421();

    /* renamed from: nativeUpdateItems */
    private native void m47736xb62707e0(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, int i17, java.lang.Object obj);

    /* renamed from: traceMessage */
    private final void m47737x489b9f02(java.lang.String str) {
        if (this.f32479x697f145) {
            java.io.PrintStream printStream = this.f32480x64252208;
            if (printStream == null) {
                java.lang.System.out.println(str);
            } else {
                printStream.println(str);
            }
        }
    }

    /* renamed from: applyFeatures */
    public void mo47732xf7477dcb() {
        m47734x31e3aa47();
        int i17 = this.f32473x84a241be;
        if (i17 != -1) {
            m47742x6b400979(i17);
        }
        java.lang.Boolean bool = this.f32474x4aa1c1f0;
        if (bool != null) {
            m47741x273078db(bool.booleanValue());
        }
        int i18 = this.f32478x718c8925;
        if (i18 >= 0) {
            m47743x44fac62a(i18);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32472xaf15e16c) {
            return;
        }
        this.f32472xaf15e16c = true;
        if (this.f32475xa97447dd != null) {
            return;
        }
        m47735x66d21421();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11041x8f29e5e1
    /* renamed from: createArchive */
    public void mo47590x59500426(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11044xb21bbf06<? extends T> interfaceC11044xb21bbf06) {
        m47734x31e3aa47();
        m47733xc13abaec(interfaceC11060xf8e90f26, i17, interfaceC11044xb21bbf06);
    }

    /* renamed from: featureSetHeaderEncryption */
    public void m47738x59f5cb9c(boolean z17) {
        this.f32474x4aa1c1f0 = java.lang.Boolean.valueOf(z17);
    }

    /* renamed from: featureSetLevel */
    public void m47739x7172e558(int i17) {
        this.f32473x84a241be = i17;
    }

    /* renamed from: featureSetThreadCount */
    public void m47740xd1ac23f9(int i17) {
        this.f32478x718c8925 = i17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11041x8f29e5e1, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11054xb0185d74
    /* renamed from: getArchiveFormat */
    public com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 mo47591x6ade67a3() {
        return this.f32471xad7eab59;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11054xb0185d74
    /* renamed from: getConnectedInArchive */
    public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 mo47629xbbdf30ca() {
        return this.f32475xa97447dd;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11040x73933f2e
    /* renamed from: getTracePrintStream */
    public java.io.PrintStream mo47586xbfd897e() {
        return this.f32480x64252208;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11040x73933f2e
    /* renamed from: isTrace */
    public boolean mo47587x7b809e3b() {
        return this.f32479x697f145;
    }

    /* renamed from: nativeSetHeaderEncryption */
    public native void m47741x273078db(boolean z17);

    /* renamed from: nativeSetLevel */
    public native void m47742x6b400979(int i17);

    /* renamed from: nativeSetMultithreading */
    public native void m47743x44fac62a(int i17);

    /* renamed from: nativeSetSolidSpec */
    public native void m47744x62f3307b(java.lang.String str);

    /* renamed from: setArchiveFormat */
    public void m47745xfdb4ce17(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39) {
        this.f32471xad7eab59 = enumC11029xdd1ddb39;
    }

    /* renamed from: setInArchive */
    public void m47746x535799b(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 interfaceC11037xc9d7a994) {
        this.f32475xa97447dd = interfaceC11037xc9d7a994;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11040x73933f2e
    /* renamed from: setTrace */
    public void mo47588x53c3b203(boolean z17) {
        this.f32479x697f145 = z17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11040x73933f2e
    /* renamed from: setTracePrintStream */
    public void mo47589xaffa1e8a(java.io.PrintStream printStream) {
        this.f32480x64252208 = printStream;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11054xb0185d74
    /* renamed from: updateItems */
    public void mo47630xdc9bd477(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11044xb21bbf06<T> interfaceC11044xb21bbf06) {
        m47734x31e3aa47();
        m47733xc13abaec(interfaceC11060xf8e90f26, i17, interfaceC11044xb21bbf06);
    }
}
