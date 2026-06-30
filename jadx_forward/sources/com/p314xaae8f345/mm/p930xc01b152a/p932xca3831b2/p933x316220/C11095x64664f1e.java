package com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220;

/* renamed from: com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveItemImpl */
/* loaded from: classes16.dex */
public class C11095x64664f1e implements com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5 {

    /* renamed from: index */
    private final int f32517x5fb28d2;

    /* renamed from: simpleInArchiveImpl */
    private final com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220.C11094x4f2e7eeb f32518x47ab70b;

    public C11095x64664f1e(com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220.C11094x4f2e7eeb c11094x4f2e7eeb, int i17) {
        this.f32518x47ab70b = c11094x4f2e7eeb;
        this.f32517x5fb28d2 = i17;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: extractSlow */
    public com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 mo47773x6ca61222(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26) {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47570x6ca61222(this.f32517x5fb28d2, interfaceC11060xf8e90f26);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getAttributes */
    public java.lang.Integer mo47775x66e614d() {
        return (java.lang.Integer) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.ATTRIBUTES);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getCRC */
    public java.lang.Integer mo47776xb5882e9e() {
        return (java.lang.Integer) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.CRC);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getComment */
    public java.lang.String mo47777x76732a29() {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47585x5f40cdfc(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.COMMENT);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getCreationTime */
    public java.util.Date mo47778xbf7b40c2() {
        return (java.util.Date) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.CREATION_TIME);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getGroup */
    public java.lang.String mo47779x747e9cc9() {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47585x5f40cdfc(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.GROUP);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getHostOS */
    public java.lang.String mo47780x1ce15882() {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47585x5f40cdfc(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.HOST_OS);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getItemIndex */
    public int mo47781x7e9522c9() {
        return this.f32517x5fb28d2;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getLastAccessTime */
    public java.util.Date mo47782xb6fca27d() {
        return (java.util.Date) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.LAST_ACCESS_TIME);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getLastWriteTime */
    public java.util.Date mo47783xfe98e9a0() {
        return (java.util.Date) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.LAST_MODIFICATION_TIME);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getMethod */
    public java.lang.String mo47784x24dcf3d7() {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47585x5f40cdfc(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.METHOD);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getPackedSize */
    public java.lang.Long mo47785xf6a15c8f() {
        return (java.lang.Long) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.PACKED_SIZE);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getPath */
    public java.lang.String mo47786xfb83cc9b() {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47585x5f40cdfc(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.PATH);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getPosition */
    public java.lang.Integer mo47787xa86cd69f() {
        return (java.lang.Integer) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.POSITION);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getSize */
    public java.lang.Long mo47788xfb854877() {
        return (java.lang.Long) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.SIZE);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: getUser */
    public java.lang.String mo47789xfb865441() {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47585x5f40cdfc(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.USER);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: isCommented */
    public java.lang.Boolean mo47790xed212134() {
        return (java.lang.Boolean) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.COMMENTED);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: isEncrypted */
    public boolean mo47791xa66d7bba() {
        return ((java.lang.Boolean) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.ENCRYPTED)).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: isFolder */
    public boolean mo47792xdc8a0e38() {
        return ((java.lang.Boolean) this.f32518x47ab70b.m47793xcfd74dab().mo47581x40a81b4b(this.f32517x5fb28d2, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.IS_FOLDER)).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5
    /* renamed from: extractSlow */
    public com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 mo47774x6ca61222(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, java.lang.String str) {
        return this.f32518x47ab70b.m47793xcfd74dab().mo47571x6ca61222(this.f32517x5fb28d2, interfaceC11060xf8e90f26, str);
    }

    public C11095x64664f1e(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 interfaceC11037xc9d7a994, int i17) {
        this.f32518x47ab70b = new com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220.C11094x4f2e7eeb(interfaceC11037xc9d7a994);
        this.f32517x5fb28d2 = i17;
    }
}
