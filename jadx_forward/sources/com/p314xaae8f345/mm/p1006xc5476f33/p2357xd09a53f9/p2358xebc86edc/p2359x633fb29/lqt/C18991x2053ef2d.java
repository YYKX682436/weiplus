package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel */
/* loaded from: classes8.dex */
public class C18991x2053ef2d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18991x2053ef2d> f38655x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.o();

    /* renamed from: d, reason: collision with root package name */
    public int f259109d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f259110e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f259111f;

    /* renamed from: g, reason: collision with root package name */
    public long f259112g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f259113h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18988x4d2dd19a f259114i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f259115m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f259116n;

    public C18991x2053ef2d() {
        this.f259111f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f259109d);
        parcel.writeString(this.f259110e);
        parcel.writeList(this.f259111f);
        parcel.writeLong(this.f259112g);
        parcel.writeString(this.f259113h);
        parcel.writeParcelable(this.f259114i, i17);
        parcel.writeString(this.f259115m);
        parcel.writeString(this.f259116n);
    }

    public C18991x2053ef2d(android.os.Parcel parcel) {
        this.f259111f = new java.util.ArrayList();
        this.f259109d = parcel.readInt();
        this.f259110e = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f259111f = arrayList;
        parcel.readList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18992x25658f0a.class.getClassLoader());
        this.f259112g = parcel.readLong();
        this.f259113h = parcel.readString();
        this.f259114i = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18988x4d2dd19a) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18988x4d2dd19a.class.getClassLoader());
        this.f259115m = parcel.readString();
        this.f259116n = parcel.readString();
    }
}
