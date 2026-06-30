package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.mall.MallFunction */
/* loaded from: classes9.dex */
public class C19100xad1ade2c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c> f38692x681a0c0c = new bt4.b();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261352d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261353e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261354f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261355g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261356h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261357i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261358m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f261359n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 f261360o;

    /* renamed from: p, reason: collision with root package name */
    public int f261361p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f261362q;

    /* renamed from: r, reason: collision with root package name */
    public int f261363r;

    public C19100xad1ade2c() {
        this.f261363r = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f261352d);
        parcel.writeString(this.f261353e);
        parcel.writeString(this.f261354f);
        parcel.writeString(this.f261355g);
        parcel.writeString(this.f261356h);
        parcel.writeString(this.f261357i);
        parcel.writeString(this.f261358m);
        parcel.writeStringList(this.f261359n);
        parcel.writeParcelable(this.f261360o, i17);
        parcel.writeInt(this.f261361p);
        parcel.writeString(this.f261362q);
        parcel.writeInt(this.f261363r);
    }

    public C19100xad1ade2c(android.os.Parcel parcel) {
        this.f261363r = 0;
        this.f261352d = parcel.readString();
        this.f261353e = parcel.readString();
        this.f261354f = parcel.readString();
        this.f261355g = parcel.readString();
        this.f261356h = parcel.readString();
        this.f261357i = parcel.readString();
        this.f261358m = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f261359n = arrayList;
        parcel.readStringList(arrayList);
        this.f261360o = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27.class.getClassLoader());
        this.f261361p = parcel.readInt();
        this.f261362q = parcel.readString();
        this.f261363r = parcel.readInt();
    }
}
