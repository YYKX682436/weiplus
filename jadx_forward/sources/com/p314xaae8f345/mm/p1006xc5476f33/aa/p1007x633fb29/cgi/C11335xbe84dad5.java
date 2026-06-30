package com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi;

/* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel */
/* loaded from: classes9.dex */
public class C11335xbe84dad5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11335xbe84dad5> f33354x681a0c0c = new i61.m();

    /* renamed from: d, reason: collision with root package name */
    public int f153941d;

    /* renamed from: e, reason: collision with root package name */
    public int f153942e;

    /* renamed from: f, reason: collision with root package name */
    public int f153943f;

    /* renamed from: g, reason: collision with root package name */
    public long f153944g;

    /* renamed from: h, reason: collision with root package name */
    public long f153945h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f153946i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f153947m;

    public C11335xbe84dad5(android.os.Parcel parcel) {
        this.f153941d = parcel.readInt();
        this.f153942e = parcel.readInt();
        this.f153943f = parcel.readInt();
        this.f153944g = parcel.readLong();
        this.f153945h = parcel.readLong();
        this.f153946i = parcel.readString();
        this.f153947m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48621x9616526c() {
        return "AAOperationInfoParcel{max_payer_num=" + this.f153941d + ", max_receiver_num=" + this.f153942e + ", max_total_num=" + this.f153943f + ", max_total_amount=" + this.f153944g + ", max_per_amount=" + this.f153945h + ", notice='" + this.f153946i + "', notice_url='" + this.f153947m + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f153941d);
        parcel.writeInt(this.f153942e);
        parcel.writeInt(this.f153943f);
        parcel.writeLong(this.f153944g);
        parcel.writeLong(this.f153945h);
        parcel.writeString(this.f153946i);
        parcel.writeString(this.f153947m);
    }
}
