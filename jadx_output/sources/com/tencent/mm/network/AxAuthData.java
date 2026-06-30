package com.tencent.mm.network;

/* loaded from: classes12.dex */
class AxAuthData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.network.AxAuthData> CREATOR = new com.tencent.mm.network.g();

    /* renamed from: d, reason: collision with root package name */
    public r45.uc f71922d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f71923e;

    public AxAuthData(android.os.Parcel parcel) {
        try {
            r45.uc ucVar = new r45.uc();
            this.f71922d = ucVar;
            ucVar.parseFrom(parcel.createByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AxAuthData", e17, "sessionKey.parseFrom", new java.lang.Object[0]);
        }
        this.f71923e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeByteArray(this.f71922d.toByteArray());
            parcel.writeByteArray(this.f71923e);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AxAuthData", e17, "writeToParcel", new java.lang.Object[0]);
        }
    }
}
