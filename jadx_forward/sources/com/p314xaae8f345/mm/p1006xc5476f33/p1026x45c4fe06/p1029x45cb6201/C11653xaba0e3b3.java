package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.AssetReader */
/* loaded from: classes7.dex */
public final class C11653xaba0e3b3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.AbstractC11652xbeaa3fb5 {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6[] f156904i;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f156902m = !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157561c;

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3 f156903n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3();

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3> f33442x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q();

    public /* synthetic */ C11653xaba0e3b3(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q qVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public android.content.res.AssetFileDescriptor G0(java.lang.String str) {
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        if (f156902m) {
            return null;
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        if (b17.endsWith(".js")) {
            b17 = b17.concat(".nocompress");
        }
        android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157560b.ordinal() != 0) {
                assetFileDescriptor = assets.openFd("wxa_library" + b17);
            } else {
                assetFileDescriptor = assets.openFd("wxa_library/develop" + b17);
            }
        } catch (java.lang.Exception unused) {
        }
        return assetFileDescriptor;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public java.io.InputStream a(java.lang.String str) {
        if (f156902m) {
            return null;
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157560b.ordinal() != 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.b("wxa_library" + b17);
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.b("wxa_library/develop" + b17);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m49187x9616526c() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AssetReader[%d][%s]", java.lang.Integer.valueOf(i()), W0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 v0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6[] c11667xc7e59dd6Arr = this.f156904i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = c11667xc7e59dd6Arr[0];
        if (c11667xc7e59dd6 == null) {
            synchronized (c11667xc7e59dd6Arr) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6[] c11667xc7e59dd6Arr2 = this.f156904i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd62 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6();
                c11667xc7e59dd62.f156934f = true;
                c11667xc7e59dd62.f156932d = 0;
                if (f156902m) {
                    c11667xc7e59dd62.f33456x1c82a56c = 0;
                } else {
                    c11667xc7e59dd62.f33456x1c82a56c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a;
                }
                c11667xc7e59dd62.f156905md5 = "";
                c11667xc7e59dd6Arr2[0] = c11667xc7e59dd62;
                c11667xc7e59dd6 = this.f156904i[0];
            }
        }
        return c11667xc7e59dd6;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    public C11653xaba0e3b3() {
        this.f156904i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6[]{null};
    }

    private C11653xaba0e3b3(android.os.Parcel parcel) {
        this();
    }
}
