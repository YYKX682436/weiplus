package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel */
/* loaded from: classes8.dex */
public class C18995xe3fe0610 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18995xe3fe0610> f38659x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.t();

    /* renamed from: d, reason: collision with root package name */
    public int f259136d;

    /* renamed from: e, reason: collision with root package name */
    public long f259137e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f259138f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f259139g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18994x65c66ca0 f259140h;

    /* renamed from: i, reason: collision with root package name */
    public int f259141i;

    /* renamed from: m, reason: collision with root package name */
    public int f259142m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f259143n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f259144o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f259145p;

    public C18995xe3fe0610(android.os.Parcel parcel) {
        this.f259136d = parcel.readInt();
        this.f259137e = parcel.readLong();
        this.f259138f = parcel.readString();
        this.f259139g = parcel.readString();
        this.f259140h = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18994x65c66ca0) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18994x65c66ca0.class.getClassLoader());
        this.f259141i = parcel.readInt();
        this.f259142m = parcel.readInt();
        this.f259143n = parcel.readString();
        this.f259144o = parcel.readString();
        this.f259145p = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f259136d);
        parcel.writeLong(this.f259137e);
        parcel.writeString(this.f259138f);
        parcel.writeString(this.f259139g);
        parcel.writeParcelable(this.f259140h, i17);
        parcel.writeInt(this.f259141i);
        parcel.writeInt(this.f259142m);
        parcel.writeString(this.f259143n);
        parcel.writeString(this.f259144o);
        parcel.writeString(this.f259145p);
    }
}
