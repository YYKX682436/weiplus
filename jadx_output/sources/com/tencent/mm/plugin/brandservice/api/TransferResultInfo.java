package com.tencent.mm.plugin.brandservice.api;

/* loaded from: classes7.dex */
public class TransferResultInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.brandservice.api.TransferResultInfo> CREATOR = new zq1.r0();

    /* renamed from: d, reason: collision with root package name */
    public int f93926d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f93927e;

    /* renamed from: f, reason: collision with root package name */
    public r45.z24 f93928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93929g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93930h;

    public TransferResultInfo(android.os.Parcel parcel) {
        this.f93926d = parcel.readInt();
        this.f93927e = parcel.readString();
        this.f93929g = parcel.readByte() != 0;
        this.f93930h = parcel.readByte() != 0;
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f93928f = new r45.z24();
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                this.f93928f.parseFrom(bArr);
            }
        } catch (java.lang.Exception e17) {
            this.f93928f = null;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferResultInfo", e17, "parse jsApiResponse exception", new java.lang.Object[0]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format("TransferResultInfo{errCode: %s, errMsg: %s, hasH5Auth: %s, retryForTokenExpired: %s}", java.lang.Integer.valueOf(this.f93926d), this.f93927e, java.lang.Boolean.valueOf(this.f93929g), java.lang.Boolean.valueOf(this.f93930h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f93926d);
        parcel.writeString(this.f93927e);
        parcel.writeByte(this.f93929g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f93930h ? (byte) 1 : (byte) 0);
        try {
            r45.z24 z24Var = this.f93928f;
            if (z24Var != null) {
                byte[] byteArray = z24Var.toByteArray();
                if (byteArray == null || byteArray.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferResultInfo", e17, "writeToParcel exception", new java.lang.Object[0]);
            parcel.writeInt(0);
        }
    }
}
