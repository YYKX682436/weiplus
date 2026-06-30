package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj */
/* loaded from: classes8.dex */
public class C12558x591103cd implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd> f35153x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f169309d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f169310e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f169311f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f169312g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f169313h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f169314i;

    /* renamed from: m, reason: collision with root package name */
    public final int f169315m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f169316n;

    /* renamed from: o, reason: collision with root package name */
    public final int f169317o;

    /* renamed from: p, reason: collision with root package name */
    public final float f169318p;

    /* renamed from: q, reason: collision with root package name */
    public final float f169319q;

    /* renamed from: r, reason: collision with root package name */
    public final long f169320r;

    public C12558x591103cd(android.os.Parcel parcel) {
        this.f169309d = parcel.readString();
        this.f169310e = parcel.readString();
        this.f169311f = parcel.readString();
        this.f169312g = parcel.readString();
        this.f169313h = parcel.readString();
        this.f169314i = parcel.readString();
        this.f169315m = parcel.readInt();
        this.f169316n = parcel.readString();
        this.f169317o = parcel.readInt();
        this.f169318p = parcel.readFloat();
        this.f169319q = parcel.readFloat();
        this.f169320r = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52358x9616526c() {
        return "AppBrandRecommendStatObj{username=" + this.f169309d + ", recommend_id='" + this.f169310e + "', strategy_info=" + this.f169311f + ", appid='" + this.f169312g + "', page_path=" + this.f169313h + ", page_param=" + this.f169314i + ", card_type=" + this.f169315m + ", pass_str=" + this.f169316n + ", position=" + this.f169317o + ", longitude=" + this.f169318p + ", latitude=" + this.f169319q + ", sessionId=" + this.f169320r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f169309d);
        parcel.writeString(this.f169310e);
        parcel.writeString(this.f169311f);
        parcel.writeString(this.f169312g);
        parcel.writeString(this.f169313h);
        parcel.writeString(this.f169314i);
        parcel.writeInt(this.f169315m);
        parcel.writeString(this.f169316n);
        parcel.writeInt(this.f169317o);
        parcel.writeFloat(this.f169318p);
        parcel.writeFloat(this.f169319q);
        parcel.writeLong(this.f169320r);
    }
}
