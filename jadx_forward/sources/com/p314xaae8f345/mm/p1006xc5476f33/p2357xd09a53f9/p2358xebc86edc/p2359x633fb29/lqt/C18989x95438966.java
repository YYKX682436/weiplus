package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel */
/* loaded from: classes8.dex */
class C18989x95438966 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18989x95438966> f38653x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.m();

    /* renamed from: d, reason: collision with root package name */
    public boolean f259104d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259105e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f259106f;

    public C18989x95438966() {
        this.f259106f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f259104d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f259105e);
        parcel.writeList(this.f259106f);
    }

    public C18989x95438966(android.os.Parcel parcel) {
        this.f259106f = new java.util.ArrayList();
        this.f259104d = parcel.readByte() != 0;
        this.f259105e = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f259106f = arrayList;
        parcel.readList(arrayList, java.lang.Integer.class.getClassLoader());
    }
}
