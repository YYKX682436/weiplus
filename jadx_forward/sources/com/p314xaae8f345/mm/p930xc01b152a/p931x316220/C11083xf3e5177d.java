package com.p314xaae8f345.mm.p930xc01b152a.p931x316220;

/* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl */
/* loaded from: classes16.dex */
public final class C11083xf3e5177d implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 {

    /* renamed from: archiveFormat */
    private com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 f32456xad7eab59;

    /* renamed from: closed */
    private boolean f32457xaf15e16c;

    /* renamed from: jbindingSession */
    private long f32458x83d2fb3b;

    /* renamed from: numberOfItems */
    private int f32459xb09620a0 = -1;

    /* renamed from: outArchiveImpl */
    private com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?> f32460xfbe81d4;

    /* renamed from: sevenZipArchiveInstance */
    private long f32461xea4a8503;

    /* renamed from: sevenZipInStreamInstance */
    private long f32462x723e60ae;

    /* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$mm$mm7zip$PropID */
        static final /* synthetic */ int[] f32463x36faacb6;

        static {
            int[] iArr = new int[com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.m47642xcee59d22().length];
            f32463x36faacb6 = iArr;
            try {
                iArr[com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.SIZE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f32463x36faacb6[com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.PACKED_SIZE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f32463x36faacb6[com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.IS_FOLDER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f32463x36faacb6[com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.ENCRYPTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f32463x36faacb6[com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.TIME_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl$ExtractSlowCallback */
    /* loaded from: classes16.dex */
    public static class ExtractSlowCallback implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d {

        /* renamed from: extractOperationResult */
        private com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 f32464xbe88c9a3;

        /* renamed from: sequentialOutStreamParam */
        com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 f32465xdd41879e;

        public ExtractSlowCallback(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26) {
            this.f32465xdd41879e = interfaceC11060xf8e90f26;
        }

        /* renamed from: getExtractOperationResult */
        public com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 m47731x28574099() {
            return this.f32464xbe88c9a3;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d
        /* renamed from: getStream */
        public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 mo47561x2fec7276(int i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11031xa996e81b enumC11031xa996e81b) {
            if (enumC11031xa996e81b.equals(com.p314xaae8f345.mm.p930xc01b152a.EnumC11031xa996e81b.EXTRACT)) {
                return this.f32465xdd41879e;
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d
        /* renamed from: prepareOperation */
        public void mo47562x9d07a020(com.p314xaae8f345.mm.p930xc01b152a.EnumC11031xa996e81b enumC11031xa996e81b) {
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11057xfb2cd96
        /* renamed from: setCompleted */
        public void mo47631x8222809(long j17) {
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d
        /* renamed from: setOperationResult */
        public void mo47563xac740ba2(com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 enumC11032xedd175c3) {
            this.f32464xbe88c9a3 = enumC11032xedd175c3;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11057xfb2cd96
        /* renamed from: setTotal */
        public void mo47632x53c29c02(long j17) {
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl$ExtractSlowCryptoCallback */
    /* loaded from: classes16.dex */
    public static final class ExtractSlowCryptoCallback extends com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11083xf3e5177d.ExtractSlowCallback implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11036xbce10d94 {

        /* renamed from: password */
        private java.lang.String f32466x4889ba9b;

        public ExtractSlowCryptoCallback(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, java.lang.String str) {
            super(interfaceC11060xf8e90f26);
            this.f32466x4889ba9b = str;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11036xbce10d94
        /* renamed from: cryptoGetTextPassword */
        public java.lang.String mo47568xf3dd865d() {
            return this.f32466x4889ba9b;
        }
    }

    /* renamed from: createConnectedOutArchive */
    private void m47713xd3041ae1() {
        if (!this.f32456xad7eab59.m47551x3bec2bf0()) {
            throw new java.lang.IllegalStateException("Archive format '" + this.f32456xad7eab59 + "' doesn't support archive manipulations.");
        }
        try {
            com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?> newInstance = this.f32456xad7eab59.m47550xba224bdc().newInstance();
            this.f32460xfbe81d4 = newInstance;
            newInstance.m47746x535799b(this);
            this.f32460xfbe81d4.m47745xfdb4ce17(this.f32456xad7eab59);
            m47717x78ab8ec7(this.f32460xfbe81d4, this.f32456xad7eab59);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("Internal error: Can't create new instance of the class " + this.f32456xad7eab59.m47550xba224bdc() + " using default constructor.");
        }
    }

    /* renamed from: ensureArchiveFormatForArchiveFormatSpecificUpdateAPI */
    private void m47714x1a5607d4(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39) {
        if (mo47572x6ade67a3() == enumC11029xdd1ddb39) {
            return;
        }
        throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Archive format specific update API for " + enumC11029xdd1ddb39.m47549xc3261f02() + "-archives can't work with the currently opened " + mo47572x6ade67a3().m47549xc3261f02() + "-archive");
    }

    /* renamed from: getConnectedOutArchiveIntern */
    private <T extends com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11051x42cfe9e9> com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11054xb0185d74<T> m47715x98abdc39() {
        if (this.f32460xfbe81d4 == null) {
            m47713xd3041ae1();
        }
        return this.f32460xfbe81d4;
    }

    /* renamed from: nativeClose */
    private native void m47716x66d21421();

    /* renamed from: nativeConnectOutArchive */
    private native void m47717x78ab8ec7(com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?> c11085xd4054df4, com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39);

    /* renamed from: nativeExtract */
    private native void m47718x792a2c6a(int[] iArr, boolean z17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d interfaceC11033x7deeaa6d);

    /* renamed from: nativeGetArchiveProperty */
    private native java.lang.Object m47719xb0cfe6f8(int i17);

    /* renamed from: nativeGetArchivePropertyInfo */
    private native com.p314xaae8f345.mm.p930xc01b152a.C11063xd63f1843 m47720x683683c6(int i17);

    /* renamed from: nativeGetNumberOfArchiveProperties */
    private native int m47721x54a63176();

    /* renamed from: nativeGetNumberOfItems */
    private native int m47722x8d9f6321();

    /* renamed from: nativeGetNumberOfProperties */
    private native int m47723x67670672();

    /* renamed from: nativeGetProperty */
    private native java.lang.Object m47724x1a334eb4(int i17, int i18);

    /* renamed from: nativeGetPropertyInfo */
    private native com.p314xaae8f345.mm.p930xc01b152a.C11063xd63f1843 m47725x1de7ad82(int i17);

    /* renamed from: nativeGetStringArchiveProperty */
    private native java.lang.String m47726x133185e7(int i17);

    /* renamed from: nativeGetStringProperty */
    private native java.lang.String m47727x34c80ea5(int i17, int i18);

    /* renamed from: setArchiveFormat */
    private void m47728xfdb4ce17(java.lang.String str) {
        for (com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39 : com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.m47548xcee59d22()) {
            if (enumC11029xdd1ddb39.m47549xc3261f02().equalsIgnoreCase(str)) {
                this.f32456xad7eab59 = enumC11029xdd1ddb39;
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32457xaf15e16c) {
            return;
        }
        this.f32457xaf15e16c = true;
        m47716x66d21421();
    }

    /* renamed from: ensureOpened */
    public void m47729x31e3aa47() {
        if (this.f32457xaf15e16c) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("InArchive closed");
        }
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: extract */
    public void mo47569xb232dc81(int[] iArr, boolean z17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d interfaceC11033x7deeaa6d) {
        m47729x31e3aa47();
        m47718x792a2c6a(iArr, z17, interfaceC11033x7deeaa6d);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: extractSlow */
    public com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 mo47570x6ca61222(int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26) {
        m47729x31e3aa47();
        com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11083xf3e5177d.ExtractSlowCallback extractSlowCallback = new com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11083xf3e5177d.ExtractSlowCallback(interfaceC11060xf8e90f26);
        m47718x792a2c6a(new int[]{i17}, false, extractSlowCallback);
        return extractSlowCallback.m47731x28574099();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getArchiveFormat */
    public com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 mo47572x6ade67a3() {
        return this.f32456xad7eab59;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getArchiveProperty */
    public java.lang.Object mo47573xd56f1281(com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde) {
        m47729x31e3aa47();
        return m47719xb0cfe6f8(enumC11062x8efe4bde.m47643x10b1467e());
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getArchivePropertyInfo */
    public com.p314xaae8f345.mm.p930xc01b152a.C11063xd63f1843 mo47574x8ad2c2cf(int i17) {
        m47729x31e3aa47();
        return m47720x683683c6(i17);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getConnectedOutArchive */
    public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11054xb0185d74<com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11050x4c8a6f93> mo47575x32baca47() {
        m47729x31e3aa47();
        return m47715x98abdc39();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getConnectedOutArchive7z */
    public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11055xb76d797 mo47576x6f315baa() {
        m47729x31e3aa47();
        m47714x1a5607d4(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.SEVEN_ZIP);
        return (com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11055xb76d797) m47715x98abdc39();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getConnectedOutArchiveZip */
    public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11056x63649d0d mo47577x76fa9b5a() {
        m47729x31e3aa47();
        m47714x1a5607d4(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.ZIP);
        return (com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11056x63649d0d) m47715x98abdc39();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getNumberOfArchiveProperties */
    public int mo47578x96ef45bf() {
        m47729x31e3aa47();
        return m47721x54a63176();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getNumberOfItems */
    public int mo47579x6df5dcea() {
        m47729x31e3aa47();
        if (this.f32459xb09620a0 == -1) {
            this.f32459xb09620a0 = m47722x8d9f6321();
        }
        return this.f32459xb09620a0;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getNumberOfProperties */
    public int mo47580x1e324249() {
        m47729x31e3aa47();
        return m47723x67670672();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getProperty */
    public java.lang.Object mo47581x40a81b4b(int i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde) {
        m47729x31e3aa47();
        if (i17 >= 0 && i17 < mo47579x6df5dcea()) {
            java.lang.Object m47724x1a334eb4 = m47724x1a334eb4(i17, enumC11062x8efe4bde.m47643x10b1467e());
            int i18 = com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11083xf3e5177d.AnonymousClass1.f32463x36faacb6[enumC11062x8efe4bde.ordinal()];
            return (i18 == 1 || i18 == 2) ? m47724x1a334eb4 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Integer) m47724x1a334eb4).longValue()) : m47724x1a334eb4 : i18 != 3 ? i18 != 4 ? (i18 == 5 && m47724x1a334eb4 != null) ? com.p314xaae8f345.mm.p930xc01b152a.EnumC11061xee5094b1.m47638xcee59d22()[((java.lang.Integer) m47724x1a334eb4).intValue()] : m47724x1a334eb4 : m47724x1a334eb4 == null ? java.lang.Boolean.FALSE : m47724x1a334eb4 : m47724x1a334eb4 == null ? java.lang.Boolean.FALSE : m47724x1a334eb4;
        }
        throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Index out of range. Index: " + i17 + ", NumberOfItems: " + mo47579x6df5dcea());
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getPropertyInfo */
    public com.p314xaae8f345.mm.p930xc01b152a.C11063xd63f1843 mo47582x2d665699(int i17) {
        m47729x31e3aa47();
        return m47725x1de7ad82(i17);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getSimpleInterface */
    public com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11092x5690fac2 mo47583x9848f571() {
        return new com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.p933x316220.C11094x4f2e7eeb(this);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getStringArchiveProperty */
    public java.lang.String mo47584xffba26b0(com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde) {
        m47729x31e3aa47();
        return m47726x133185e7(enumC11062x8efe4bde.m47643x10b1467e());
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: getStringProperty */
    public java.lang.String mo47585x5f40cdfc(int i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde enumC11062x8efe4bde) {
        m47729x31e3aa47();
        if (i17 >= 0 && i17 < mo47579x6df5dcea()) {
            return m47727x34c80ea5(i17, enumC11062x8efe4bde.m47643x10b1467e());
        }
        throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Index out of range. Index: " + i17 + ", NumberOfItems: " + mo47579x6df5dcea());
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994
    /* renamed from: extractSlow */
    public com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 mo47571x6ca61222(int i17, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 interfaceC11060xf8e90f26, java.lang.String str) {
        m47729x31e3aa47();
        com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11083xf3e5177d.ExtractSlowCryptoCallback extractSlowCryptoCallback = new com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11083xf3e5177d.ExtractSlowCryptoCallback(interfaceC11060xf8e90f26, str);
        m47718x792a2c6a(new int[]{i17}, false, extractSlowCryptoCallback);
        return extractSlowCryptoCallback.m47731x28574099();
    }
}
