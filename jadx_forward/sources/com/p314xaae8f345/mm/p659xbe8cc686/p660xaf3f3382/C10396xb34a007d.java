package com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382;

/* renamed from: com.tencent.mm.choosemsgfile.compat.MsgFile */
/* loaded from: classes3.dex */
public class C10396xb34a007d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d> f27787x681a0c0c = new lo.p();

    /* renamed from: d, reason: collision with root package name */
    public long f146294d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f146295e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f146296f;

    /* renamed from: g, reason: collision with root package name */
    public long f146297g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f146298h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f146299i;

    public C10396xb34a007d(android.os.Parcel parcel) {
        this.f146294d = parcel.readLong();
        this.f146295e = parcel.readString();
        this.f146296f = parcel.readString();
        this.f146297g = parcel.readLong();
        this.f146298h = parcel.readString();
        this.f146299i = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m43580x9616526c() {
        return "MsgFile{fileSize=" + this.f146294d + ", filePath='" + this.f146295e + "', fileName='" + this.f146296f + "', timeStamp=" + this.f146297g + ", type='" + this.f146298h + "', fileExt='" + this.f146299i + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f146294d);
        parcel.writeString(this.f146295e);
        parcel.writeString(this.f146296f);
        parcel.writeLong(this.f146297g);
        parcel.writeString(this.f146298h);
        parcel.writeString(this.f146299i);
    }
}
