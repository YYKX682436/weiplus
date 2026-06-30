package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo */
/* loaded from: classes7.dex */
public class C11709x5a897c43 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43> f33502x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f0();

    /* renamed from: d, reason: collision with root package name */
    public int f157870d;

    /* renamed from: e, reason: collision with root package name */
    public int f157871e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f157872f;

    /* renamed from: g, reason: collision with root package name */
    public final float f157873g;

    public C11709x5a897c43() {
        this.f157870d = 0;
        this.f157871e = 1;
        this.f157872f = "";
        this.f157873g = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f157870d);
        parcel.writeInt(this.f157871e);
        java.lang.String str = this.f157872f;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeFloat(this.f157873g);
    }

    public C11709x5a897c43(android.os.Parcel parcel) {
        this.f157870d = 0;
        this.f157871e = 1;
        this.f157872f = "";
        this.f157873g = 0.0f;
        this.f157870d = parcel.readInt();
        this.f157871e = parcel.readInt();
        this.f157872f = parcel.readString();
        this.f157873g = parcel.readFloat();
    }
}
