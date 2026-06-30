package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel */
/* loaded from: classes8.dex */
class C18993x96ebd037 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18993x96ebd037> f38657x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.q();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f259131d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259132e;

    public C18993x96ebd037(android.os.Parcel parcel) {
        this.f259131d = parcel.readString();
        this.f259132e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f259131d);
        parcel.writeString(this.f259132e);
    }
}
