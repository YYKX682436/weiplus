package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo$DelayOptionParcel */
/* loaded from: classes9.dex */
public class C17112xb8098213 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17112xb8098213> f37801x681a0c0c = new sw3.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f238087d;

    /* renamed from: e, reason: collision with root package name */
    public final int f238088e;

    public C17112xb8098213(r45.bd0 bd0Var) {
        this.f238087d = bd0Var.f452206d;
        this.f238088e = bd0Var.f452207e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f238087d);
        parcel.writeInt(this.f238088e);
    }

    public C17112xb8098213(android.os.Parcel parcel) {
        this.f238087d = parcel.readString();
        this.f238088e = parcel.readInt();
    }
}
