package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29;

/* renamed from: com.tencent.mm.plugin.recharge.model.MallRechargeProduct */
/* loaded from: classes9.dex */
public class C16957xf1da7b74 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74> f37754x681a0c0c = new vs3.c();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f236603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f236604e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f236605f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f236606g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f236607h;

    /* renamed from: i, reason: collision with root package name */
    public float f236608i;

    /* renamed from: m, reason: collision with root package name */
    public float f236609m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236610n;

    /* renamed from: o, reason: collision with root package name */
    public int f236611o;

    /* renamed from: p, reason: collision with root package name */
    public int f236612p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236613q;

    /* renamed from: r, reason: collision with root package name */
    public int f236614r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f236615s;

    public C16957xf1da7b74(boolean z17) {
        this.f236608i = 0.0f;
        this.f236609m = 0.0f;
        this.f236615s = z17;
    }

    public boolean a() {
        return !this.f236610n || this.f236611o > 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f236603d);
        parcel.writeString(this.f236604e);
        parcel.writeString(this.f236605f);
        parcel.writeString(this.f236606g);
        parcel.writeString(this.f236607h);
        parcel.writeFloat(this.f236608i);
        parcel.writeFloat(this.f236609m);
        parcel.writeInt(this.f236610n ? 1 : 0);
        parcel.writeInt(this.f236611o);
        parcel.writeInt(this.f236612p);
        parcel.writeInt(this.f236613q ? 1 : 0);
        parcel.writeInt(this.f236615s ? 1 : 0);
        parcel.writeInt(this.f236614r);
    }

    public C16957xf1da7b74(android.os.Parcel parcel) {
        this.f236608i = 0.0f;
        this.f236609m = 0.0f;
        this.f236603d = parcel.readString();
        this.f236604e = parcel.readString();
        this.f236605f = parcel.readString();
        this.f236606g = parcel.readString();
        this.f236607h = parcel.readString();
        this.f236608i = parcel.readFloat();
        this.f236609m = parcel.readFloat();
        this.f236610n = parcel.readInt() == 1;
        this.f236611o = parcel.readInt();
        this.f236612p = parcel.readInt();
        this.f236613q = parcel.readInt() == 1;
        this.f236615s = parcel.readInt() == 1;
        this.f236614r = parcel.readInt();
    }
}
