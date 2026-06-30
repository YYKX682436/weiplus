package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.p2386x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion */
/* loaded from: classes9.dex */
public class C19196xf4e4ba33 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.p2386x633fb29.C19196xf4e4ba33> f38706x681a0c0c = new zt4.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f262805d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f262806e;

    public C19196xf4e4ba33(java.lang.String str, java.lang.String str2) {
        this.f262805d = str;
        this.f262806e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f262805d);
        parcel.writeString(this.f262806e);
    }

    public C19196xf4e4ba33(android.os.Parcel parcel) {
        this.f262805d = parcel.readString();
        this.f262806e = parcel.readString();
    }
}
