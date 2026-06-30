package com.p314xaae8f345.mm.p930xc01b152a;

/* renamed from: com.tencent.mm.mm7zip.ArchiveFormat */
/* loaded from: classes13.dex */
public enum EnumC11029xdd1ddb39 {
    ZIP("Zip", com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11086x91b2c88d.class, true),
    SEVEN_ZIP("7z", com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11084xc9d7ee97.class, true);


    /* renamed from: codecIndex */
    private int f29785xe205c65c;

    /* renamed from: methodName */
    private java.lang.String f29786xd4e5670c;

    /* renamed from: outArchiveImplementation */
    java.lang.Class<? extends com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?>> f29787x8a15ba66;

    /* renamed from: supportMultipleFiles */
    private boolean f29788x88a186b8;

    EnumC11029xdd1ddb39(java.lang.String str, boolean z17) {
        this(str, null, z17);
    }

    /* renamed from: findOutArchiveImplementationToInterface */
    public static com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 m47546x46ffda3f(java.lang.Class<? extends com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11041x8f29e5e1<?>> cls) {
        for (com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39 : m47548xcee59d22()) {
            java.lang.Class<? extends com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?>> m47550xba224bdc = enumC11029xdd1ddb39.m47550xba224bdc();
            if (m47550xba224bdc != null && cls.isAssignableFrom(m47550xba224bdc)) {
                return enumC11029xdd1ddb39;
            }
        }
        throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Can't determine corresponding archive format to the interface IOutArchive.");
    }

    /* renamed from: getMethodName */
    public java.lang.String m47549xc3261f02() {
        return this.f29786xd4e5670c;
    }

    /* renamed from: getOutArchiveImplementation */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?>> m47550xba224bdc() {
        return this.f29787x8a15ba66;
    }

    /* renamed from: isOutArchiveSupported */
    public boolean m47551x3bec2bf0() {
        return this.f29787x8a15ba66 != null;
    }

    /* renamed from: supportMultipleFiles */
    public boolean m47552x88a186b8() {
        return this.f29788x88a186b8;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f29786xd4e5670c;
    }

    EnumC11029xdd1ddb39(java.lang.String str, java.lang.Class cls, boolean z17) {
        this.f29785xe205c65c = -2;
        this.f29786xd4e5670c = str;
        this.f29787x8a15ba66 = cls;
        this.f29788x88a186b8 = z17;
    }
}
