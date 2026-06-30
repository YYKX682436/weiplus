package com.p314xaae8f345.mm.p930xc01b152a.p931x316220;

/* renamed from: com.tencent.mm.mm7zip.impl.OutArchive7zImpl */
/* loaded from: classes16.dex */
public class C11084xc9d7ee97 extends com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11049x5f6fd41b> implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11042x6c47f8c4, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11055xb76d797 {

    /* renamed from: solidExtension */
    private boolean f32470xf1cfe5d4;

    /* renamed from: solid */
    private boolean f32469x688a6ab = true;

    /* renamed from: countOfFilesPerBlock */
    private int f32468x76c0e361 = -1;

    /* renamed from: countOfBytesPerBlock */
    private long f32467xdef4b555 = -1;

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4
    /* renamed from: applyFeatures */
    public void mo47732xf7477dcb() {
        super.mo47732xf7477dcb();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.f32470xf1cfe5d4) {
            sb6.append(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad);
        }
        int i17 = this.f32468x76c0e361;
        if (i17 != -1) {
            sb6.append(i17);
            sb6.append("F");
        }
        long j17 = this.f32467xdef4b555;
        if (j17 != -1) {
            sb6.append(j17);
            sb6.append("B");
        }
        if (sb6.length() > 0) {
            m47744x62f3307b(sb6.toString());
        }
        if (this.f32469x688a6ab) {
            return;
        }
        m47744x62f3307b(null);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11045xda5c4b21
    /* renamed from: setHeaderEncryption */
    public void mo47596x9676be72(boolean z17) {
        m47738x59f5cb9c(z17);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11046x985b4453
    /* renamed from: setLevel */
    public void mo47597x534d5c42(int i17) {
        m47739x7172e558(i17);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11048x98c24f7a
    /* renamed from: setSolid */
    public void mo47599x53b46769(boolean z17) {
        this.f32469x688a6ab = z17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11048x98c24f7a
    /* renamed from: setSolidExtension */
    public void mo47600xa85e1ad6(boolean z17) {
        this.f32470xf1cfe5d4 = z17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11048x98c24f7a
    /* renamed from: setSolidFiles */
    public void mo47601x572c9c8e(int i17) {
        this.f32468x76c0e361 = i17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11048x98c24f7a
    /* renamed from: setSolidSize */
    public void mo47602xb17df0a(long j17) {
        this.f32467xdef4b555 = j17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11047x506b2090
    /* renamed from: setThreadCount */
    public void mo47598xe1c84363(int i17) {
        m47740xd1ac23f9(i17);
    }
}
