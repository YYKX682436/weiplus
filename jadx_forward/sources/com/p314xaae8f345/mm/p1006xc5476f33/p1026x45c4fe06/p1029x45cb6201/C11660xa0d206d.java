package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader */
/* loaded from: classes7.dex */
public final class C11660xa0d206d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.AbstractC11652xbeaa3fb5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11660xa0d206d> f33461x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d8();

    /* renamed from: i, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 f156908i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f156909m;

    public C11660xa0d206d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6) {
        this.f156909m = c11667xc7e59dd6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public android.content.res.AssetFileDescriptor G0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 P1 = P1();
        P1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 mo49523xc00e82af = P1.mo49523xc00e82af(str);
        if (mo49523xc00e82af == null) {
            return null;
        }
        try {
            return new android.content.res.AssetFileDescriptor(com.p314xaae8f345.mm.vfs.w6.z(com.p314xaae8f345.mm.vfs.z7.a(mo49523xc00e82af.f156921d), null, "r"), mo49523xc00e82af.f156923f, mo49523xc00e82af.f156924g);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 P1() {
        if (this.f156908i != null) {
            return this.f156908i;
        }
        synchronized (this) {
            if (this.f156908i == null) {
                this.f156908i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(this.f156909m.mo49190xe121c411());
            }
        }
        return this.f156908i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public java.io.InputStream a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 P1 = P1();
        P1.a();
        return P1.c(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = this.f156908i;
            if (y8Var != null) {
                try {
                    y8Var.close();
                } finally {
                }
            }
            this.f156908i = null;
            if (y8Var != null) {
                y8Var.close();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: finalize */
    public void m49208xd764dc1e() {
        super.finalize();
        close();
    }

    /* renamed from: toString */
    public java.lang.String m49209x9616526c() {
        return java.lang.String.format(java.util.Locale.US, "PkgReader[%d] [%s]", java.lang.Integer.valueOf(i()), W0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    /* renamed from: v0 */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 getF172191d() {
        return this.f156909m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f156909m, i17);
    }
}
