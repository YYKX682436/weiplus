package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.model.Profession */
/* loaded from: classes9.dex */
public class C19086x2eaebd1c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c> f38666x681a0c0c = new ys4.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f260954d;

    /* renamed from: e, reason: collision with root package name */
    public final int f260955e;

    public C19086x2eaebd1c(java.lang.String str, int i17) {
        this.f260954d = str;
        this.f260955e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f260954d);
        parcel.writeInt(this.f260955e);
    }

    public C19086x2eaebd1c(android.os.Parcel parcel) {
        this.f260954d = parcel.readString();
        this.f260955e = parcel.readInt();
    }
}
