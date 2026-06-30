package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel */
/* loaded from: classes8.dex */
class C18992x25658f0a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18992x25658f0a> f38656x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.p();

    /* renamed from: d, reason: collision with root package name */
    public int f259117d;

    /* renamed from: e, reason: collision with root package name */
    public long f259118e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f259119f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f259120g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f259121h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f259122i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18993x96ebd037 f259123m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18990x49fae371 f259124n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18989x95438966 f259125o;

    /* renamed from: p, reason: collision with root package name */
    public int f259126p;

    /* renamed from: q, reason: collision with root package name */
    public int f259127q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f259128r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f259129s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f259130t;

    public C18992x25658f0a(android.os.Parcel parcel) {
        this.f259117d = parcel.readInt();
        this.f259118e = parcel.readLong();
        this.f259119f = parcel.readString();
        this.f259120g = parcel.readString();
        this.f259121h = parcel.readString();
        this.f259122i = parcel.readString();
        this.f259123m = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18993x96ebd037) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18993x96ebd037.class.getClassLoader());
        this.f259124n = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18990x49fae371) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18990x49fae371.class.getClassLoader());
        this.f259125o = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18989x95438966) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18989x95438966.class.getClassLoader());
        this.f259126p = parcel.readInt();
        this.f259127q = parcel.readInt();
        this.f259128r = parcel.readString();
        this.f259129s = parcel.readString();
        this.f259130t = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f259117d);
        parcel.writeLong(this.f259118e);
        parcel.writeString(this.f259119f);
        parcel.writeString(this.f259120g);
        parcel.writeString(this.f259121h);
        parcel.writeString(this.f259122i);
        parcel.writeParcelable(this.f259123m, i17);
        parcel.writeParcelable(this.f259124n, i17);
        parcel.writeParcelable(this.f259125o, i17);
        parcel.writeInt(this.f259126p);
        parcel.writeInt(this.f259127q);
        parcel.writeString(this.f259128r);
        parcel.writeString(this.f259129s);
        parcel.writeString(this.f259130t);
    }
}
