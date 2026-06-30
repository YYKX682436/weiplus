package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api;

/* renamed from: com.tencent.mm.plugin.brandservice.api.TransferResultInfo */
/* loaded from: classes7.dex */
public class C12966xaa8af0d6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6> f35386x681a0c0c = new zq1.r0();

    /* renamed from: d, reason: collision with root package name */
    public int f175459d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f175460e;

    /* renamed from: f, reason: collision with root package name */
    public r45.z24 f175461f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175462g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f175463h;

    public C12966xaa8af0d6(android.os.Parcel parcel) {
        this.f175459d = parcel.readInt();
        this.f175460e = parcel.readString();
        this.f175462g = parcel.readByte() != 0;
        this.f175463h = parcel.readByte() != 0;
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f175461f = new r45.z24();
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                this.f175461f.mo11468x92b714fd(bArr);
            }
        } catch (java.lang.Exception e17) {
            this.f175461f = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferResultInfo", e17, "parse jsApiResponse exception", new java.lang.Object[0]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m54299x9616526c() {
        return java.lang.String.format("TransferResultInfo{errCode: %s, errMsg: %s, hasH5Auth: %s, retryForTokenExpired: %s}", java.lang.Integer.valueOf(this.f175459d), this.f175460e, java.lang.Boolean.valueOf(this.f175462g), java.lang.Boolean.valueOf(this.f175463h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f175459d);
        parcel.writeString(this.f175460e);
        parcel.writeByte(this.f175462g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f175463h ? (byte) 1 : (byte) 0);
        try {
            r45.z24 z24Var = this.f175461f;
            if (z24Var != null) {
                byte[] mo14344x5f01b1f6 = z24Var.mo14344x5f01b1f6();
                if (mo14344x5f01b1f6 == null || mo14344x5f01b1f6.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(mo14344x5f01b1f6.length);
                    parcel.writeByteArray(mo14344x5f01b1f6);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferResultInfo", e17, "writeToParcel exception", new java.lang.Object[0]);
            parcel.writeInt(0);
        }
    }
}
