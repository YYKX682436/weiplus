package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1;

/* renamed from: com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor */
/* loaded from: classes7.dex */
public class C12530x293588b2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12530x293588b2> f35143x681a0c0c = new ri1.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f168766d;

    public C12530x293588b2(android.os.Parcel parcel) {
        this.f168766d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f168766d);
    }
}
