package com.p314xaae8f345.mm.p971x6de15a2e;

/* renamed from: com.tencent.mm.network.AxAuthData */
/* loaded from: classes12.dex */
class C11178xdfeb52e9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p971x6de15a2e.C11178xdfeb52e9> f32587x681a0c0c = new com.p314xaae8f345.mm.p971x6de15a2e.g();

    /* renamed from: d, reason: collision with root package name */
    public r45.uc f153455d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f153456e;

    public C11178xdfeb52e9(android.os.Parcel parcel) {
        try {
            r45.uc ucVar = new r45.uc();
            this.f153455d = ucVar;
            ucVar.mo11468x92b714fd(parcel.createByteArray());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AxAuthData", e17, "sessionKey.parseFrom", new java.lang.Object[0]);
        }
        this.f153456e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeByteArray(this.f153455d.mo14344x5f01b1f6());
            parcel.writeByteArray(this.f153456e);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AxAuthData", e17, "writeToParcel", new java.lang.Object[0]);
        }
    }
}
