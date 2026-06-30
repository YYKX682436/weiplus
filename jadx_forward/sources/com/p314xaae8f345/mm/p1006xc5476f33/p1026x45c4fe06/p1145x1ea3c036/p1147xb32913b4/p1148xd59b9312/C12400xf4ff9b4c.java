package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.ByRuntimeQrcodeResult */
/* loaded from: classes7.dex */
public class C12400xf4ff9b4c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12400xf4ff9b4c> f35082x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f167086d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f167087e;

    public C12400xf4ff9b4c(java.lang.String str, java.lang.String str2) {
        this.f167086d = str;
        this.f167087e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f167086d);
        parcel.writeString(this.f167087e);
    }

    public C12400xf4ff9b4c(android.os.Parcel parcel) {
        this.f167086d = parcel.readString();
        this.f167087e = parcel.readString();
    }
}
