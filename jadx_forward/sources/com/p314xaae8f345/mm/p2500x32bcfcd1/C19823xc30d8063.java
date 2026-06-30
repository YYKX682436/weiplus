package com.p314xaae8f345.mm.p2500x32bcfcd1;

/* renamed from: com.tencent.mm.recoveryv2.RecoveryCrash$Record */
/* loaded from: classes12.dex */
public class C19823xc30d8063 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063> f39066x681a0c0c = new d55.i();

    /* renamed from: d, reason: collision with root package name */
    public int f273739d;

    /* renamed from: e, reason: collision with root package name */
    public long f273740e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273741f;

    public C19823xc30d8063(android.os.Parcel parcel) {
        this.f273739d = parcel.readInt();
        this.f273740e = parcel.readLong();
        this.f273741f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f273739d);
        parcel.writeLong(this.f273740e);
        parcel.writeString(this.f273741f);
    }
}
