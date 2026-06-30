package com.tencent.mm.plugin.aa.model.cgi;

/* loaded from: classes9.dex */
public class NetSceneNewAAQueryPFInfo$AAOperationInfoParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel> CREATOR = new i61.m();

    /* renamed from: d, reason: collision with root package name */
    public int f72408d;

    /* renamed from: e, reason: collision with root package name */
    public int f72409e;

    /* renamed from: f, reason: collision with root package name */
    public int f72410f;

    /* renamed from: g, reason: collision with root package name */
    public long f72411g;

    /* renamed from: h, reason: collision with root package name */
    public long f72412h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f72413i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f72414m;

    public NetSceneNewAAQueryPFInfo$AAOperationInfoParcel(android.os.Parcel parcel) {
        this.f72408d = parcel.readInt();
        this.f72409e = parcel.readInt();
        this.f72410f = parcel.readInt();
        this.f72411g = parcel.readLong();
        this.f72412h = parcel.readLong();
        this.f72413i = parcel.readString();
        this.f72414m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AAOperationInfoParcel{max_payer_num=" + this.f72408d + ", max_receiver_num=" + this.f72409e + ", max_total_num=" + this.f72410f + ", max_total_amount=" + this.f72411g + ", max_per_amount=" + this.f72412h + ", notice='" + this.f72413i + "', notice_url='" + this.f72414m + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f72408d);
        parcel.writeInt(this.f72409e);
        parcel.writeInt(this.f72410f);
        parcel.writeLong(this.f72411g);
        parcel.writeLong(this.f72412h);
        parcel.writeString(this.f72413i);
        parcel.writeString(this.f72414m);
    }
}
