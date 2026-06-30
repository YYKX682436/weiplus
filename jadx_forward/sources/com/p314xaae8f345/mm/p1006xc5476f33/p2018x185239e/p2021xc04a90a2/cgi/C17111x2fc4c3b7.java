package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord$HisRcvrParcel */
/* loaded from: classes9.dex */
public class C17111x2fc4c3b7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17111x2fc4c3b7> f37800x681a0c0c = new sw3.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f238081d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f238082e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f238083f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f238084g;

    /* renamed from: h, reason: collision with root package name */
    public final long f238085h;

    /* renamed from: i, reason: collision with root package name */
    public final int f238086i;

    public C17111x2fc4c3b7(r45.ow3 ow3Var) {
        this.f238081d = ow3Var.f464108d;
        this.f238082e = ow3Var.f464109e;
        this.f238083f = ow3Var.f464110f;
        this.f238084g = ow3Var.f464111g;
        this.f238085h = ow3Var.f464112h;
        this.f238086i = ow3Var.f464113i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f238081d);
        parcel.writeString(this.f238082e);
        parcel.writeString(this.f238083f);
        parcel.writeString(this.f238084g);
        parcel.writeLong(this.f238085h);
        parcel.writeInt(this.f238086i);
    }

    public C17111x2fc4c3b7(android.os.Parcel parcel) {
        this.f238081d = parcel.readString();
        this.f238082e = parcel.readString();
        this.f238083f = parcel.readString();
        this.f238084g = parcel.readString();
        this.f238085h = parcel.readLong();
        this.f238086i = parcel.readInt();
    }
}
