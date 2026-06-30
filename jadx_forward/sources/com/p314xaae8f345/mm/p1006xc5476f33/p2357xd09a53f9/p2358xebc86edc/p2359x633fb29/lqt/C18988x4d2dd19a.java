package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel */
/* loaded from: classes8.dex */
class C18988x4d2dd19a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18988x4d2dd19a> f38652x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f259102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259103e;

    public C18988x4d2dd19a(android.os.Parcel parcel) {
        this.f259102d = parcel.readString();
        this.f259103e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f259102d);
        parcel.writeString(this.f259103e);
    }
}
