package com.p314xaae8f345.mm.p930xc01b152a;

/* renamed from: com.tencent.mm.mm7zip.IInArchive */
/* loaded from: classes16.dex */
public interface InterfaceC11037xc9d7a994 extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: extract */
    void mo47569xb232dc81(int[] iArr, boolean z17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d interfaceC11033x7deeaa6d);

    /* renamed from: extractSlow */
    com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 mo47570x6ca61222(int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26);

    /* renamed from: extractSlow */
    com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 mo47571x6ca61222(int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, java.lang.String str);

    /* renamed from: getArchiveFormat */
    com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 mo47572x6ade67a3();

    /* renamed from: getArchiveProperty */
    java.lang.Object mo47573xd56f1281(com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde);

    /* renamed from: getArchivePropertyInfo */
    com.p314xaae8f345.mm.p930xc01b152a.C11063xd63f1843 mo47574x8ad2c2cf(int i17);

    /* renamed from: getConnectedOutArchive */
    com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11054xb0185d74<com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11050x4c8a6f93> mo47575x32baca47();

    /* renamed from: getConnectedOutArchive7z */
    com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11055xb76d797 mo47576x6f315baa();

    /* renamed from: getConnectedOutArchiveZip */
    com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11056x63649d0d mo47577x76fa9b5a();

    /* renamed from: getNumberOfArchiveProperties */
    int mo47578x96ef45bf();

    /* renamed from: getNumberOfItems */
    int mo47579x6df5dcea();

    /* renamed from: getNumberOfProperties */
    int mo47580x1e324249();

    /* renamed from: getProperty */
    java.lang.Object mo47581x40a81b4b(int i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde);

    /* renamed from: getPropertyInfo */
    com.p314xaae8f345.mm.p930xc01b152a.C11063xd63f1843 mo47582x2d665699(int i17);

    /* renamed from: getSimpleInterface */
    com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11092x5690fac2 mo47583x9848f571();

    /* renamed from: getStringArchiveProperty */
    java.lang.String mo47584xffba26b0(com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde);

    /* renamed from: getStringProperty */
    java.lang.String mo47585x5f40cdfc(int i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde);
}
