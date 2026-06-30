package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel */
/* loaded from: classes7.dex */
public class C11738x6e2c0d85 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85> f33520x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158465d;

    /* renamed from: e, reason: collision with root package name */
    public int f158466e;

    /* renamed from: f, reason: collision with root package name */
    public int f158467f;

    /* renamed from: g, reason: collision with root package name */
    public int f158468g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158469h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f158470i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f158471m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f158472n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f158473o;

    /* renamed from: p, reason: collision with root package name */
    public int f158474p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f158475q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f158476r;

    public C11738x6e2c0d85() {
        this.f158474p = -1;
        this.f158476r = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m49964x9616526c() {
        return "operation{appId='" + this.f158465d + "', versionType=" + this.f158466e + ", usage=" + this.f158467f + ", operation=" + this.f158468g + ", uiclass='" + this.f158469h + "', name='" + this.f158470i + "', icon='" + this.f158471m + "', username='" + this.f158472n + "', process='" + this.f158473o + "', customNotificationLogicClassName='" + this.f158475q + "', justNotify=" + this.f158476r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158465d);
        parcel.writeInt(this.f158466e);
        parcel.writeInt(this.f158467f);
        parcel.writeInt(this.f158468g);
        parcel.writeString(this.f158469h);
        parcel.writeString(this.f158470i);
        parcel.writeString(this.f158471m);
        parcel.writeString(this.f158472n);
        parcel.writeString(this.f158473o);
        parcel.writeString(this.f158475q);
        parcel.writeInt(this.f158474p);
    }

    public C11738x6e2c0d85(android.os.Parcel parcel) {
        this.f158474p = -1;
        this.f158476r = false;
        this.f158465d = parcel.readString();
        this.f158466e = parcel.readInt();
        this.f158467f = parcel.readInt();
        this.f158468g = parcel.readInt();
        this.f158469h = parcel.readString();
        this.f158470i = parcel.readString();
        this.f158471m = parcel.readString();
        this.f158472n = parcel.readString();
        this.f158473o = parcel.readString();
        this.f158475q = parcel.readString();
        this.f158474p = parcel.readInt();
    }
}
