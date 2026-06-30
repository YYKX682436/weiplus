package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.p1777x633fb29;

/* renamed from: com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType */
/* loaded from: classes9.dex */
public class C16094x601fe117 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.p1777x633fb29.C16094x601fe117> f37102x681a0c0c = new u73.a();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f223792d;

    public C16094x601fe117(r45.av3 av3Var) {
        try {
            this.f223792d = av3Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HoneyPayCardType", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f223792d;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public C16094x601fe117(android.os.Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f223792d = bArr;
        parcel.readByteArray(bArr);
    }
}
