package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel */
/* loaded from: classes7.dex */
public class C11741xcdfabd1f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f> f33521x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.f1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158478d;

    /* renamed from: e, reason: collision with root package name */
    public int f158479e;

    /* renamed from: f, reason: collision with root package name */
    public int f158480f;

    public C11741xcdfabd1f(android.os.Parcel parcel) {
        this.f158478d = parcel.readString();
        this.f158479e = parcel.readInt();
        this.f158480f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m49966x9616526c() {
        return "operation{appId='" + this.f158478d + "', usage=" + this.f158479e + ", operation=" + this.f158480f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158478d);
        parcel.writeInt(this.f158479e);
        parcel.writeInt(this.f158480f);
    }
}
