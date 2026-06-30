package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer */
/* loaded from: classes7.dex */
public final class C11810xcb772e0b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11810xcb772e0b> f33584x681a0c0c = new k91.j0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158847d;

    /* renamed from: e, reason: collision with root package name */
    public int f158848e;

    /* renamed from: f, reason: collision with root package name */
    public int f158849f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158850g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158851h;

    /* renamed from: i, reason: collision with root package name */
    public int f158852i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f158853m;

    public C11810xcb772e0b(android.os.Parcel parcel, k91.j0 j0Var) {
        this.f158847d = parcel.readString();
        this.f158848e = parcel.readInt();
        this.f158849f = parcel.readInt();
        this.f158850g = parcel.readString();
        this.f158851h = parcel.readString();
        this.f158852i = parcel.readInt();
        this.f158853m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50092x9616526c() {
        return "AppBrandLaunchFromNotifyReferrer{appId=" + this.f158847d + ", uin='" + this.f158848e + "', readscene='" + this.f158849f + "', appbrandPushMsgId='" + this.f158850g + "', content='" + this.f158851h + "', opLocation='" + this.f158852i + "', reportSessionId='" + this.f158853m + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158847d);
        parcel.writeInt(this.f158848e);
        parcel.writeInt(this.f158849f);
        parcel.writeString(this.f158850g);
        parcel.writeString(this.f158851h);
        parcel.writeInt(this.f158852i);
        parcel.writeString(this.f158853m);
    }
}
