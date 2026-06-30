package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel */
/* loaded from: classes8.dex */
class C18994x65c66ca0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18994x65c66ca0> f38658x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s();

    /* renamed from: d, reason: collision with root package name */
    public boolean f259133d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259134e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f259135f;

    public C18994x65c66ca0() {
        this.f259135f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f259133d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f259134e);
        parcel.writeList(this.f259135f);
    }

    public C18994x65c66ca0(android.os.Parcel parcel) {
        this.f259135f = new java.util.ArrayList();
        this.f259133d = parcel.readByte() != 0;
        this.f259134e = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f259135f = arrayList;
        parcel.readList(arrayList, java.lang.Integer.class.getClassLoader());
    }
}
