package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel */
/* loaded from: classes8.dex */
class C18990x49fae371 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18990x49fae371> f38654x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.n();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f259107d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259108e;

    public C18990x49fae371(android.os.Parcel parcel) {
        this.f259107d = parcel.readString();
        this.f259108e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f259107d);
        parcel.writeString(this.f259108e);
    }
}
