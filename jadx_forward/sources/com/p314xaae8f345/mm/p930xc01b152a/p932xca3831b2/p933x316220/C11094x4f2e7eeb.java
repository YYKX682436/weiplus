package com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220;

/* renamed from: com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveImpl */
/* loaded from: classes16.dex */
public class C11094x4f2e7eeb implements com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11092x5690fac2 {

    /* renamed from: sevenZipInArchive */
    private final com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 f32515x614ee69;

    /* renamed from: wasClosed */
    private boolean f32516x840905b5 = false;

    public C11094x4f2e7eeb(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 interfaceC11037xc9d7a994) {
        this.f32515x614ee69 = interfaceC11037xc9d7a994;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11092x5690fac2
    /* renamed from: close */
    public void mo47769x5a5ddf8() {
        this.f32515x614ee69.close();
        this.f32516x840905b5 = true;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11092x5690fac2
    /* renamed from: getArchiveItem */
    public com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5 mo47770x189fe5bf(int i17) {
        if (i17 >= 0 && i17 < this.f32515x614ee69.mo47579x6df5dcea()) {
            return new com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220.C11095x64664f1e(this, i17);
        }
        throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Index " + i17 + " is out of range. Number of items in archive: " + this.f32515x614ee69.mo47579x6df5dcea());
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11092x5690fac2
    /* renamed from: getArchiveItems */
    public com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5[] mo47771xfb5cd294() {
        int mo47772x6df5dcea = mo47772x6df5dcea();
        com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5[] interfaceC11093x5c54b8f5Arr = new com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5[mo47772x6df5dcea];
        for (int i17 = 0; i17 < mo47772x6df5dcea; i17++) {
            interfaceC11093x5c54b8f5Arr[i17] = new com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220.C11095x64664f1e(this, i17);
        }
        return interfaceC11093x5c54b8f5Arr;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11092x5690fac2
    /* renamed from: getNumberOfItems */
    public int mo47772x6df5dcea() {
        return m47793xcfd74dab().mo47579x6df5dcea();
    }

    /* renamed from: testAndGetSafeSevenZipInArchive */
    public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 m47793xcfd74dab() {
        if (this.f32516x840905b5) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Archive was closed");
        }
        return this.f32515x614ee69;
    }
}
