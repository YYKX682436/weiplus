package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class LocalUsageInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo> CREATOR = new com.tencent.mm.plugin.appbrand.appusage.h6();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76361d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76362e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76363f;

    /* renamed from: g, reason: collision with root package name */
    public final int f76364g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f76365h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f76366i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f76367m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f76368n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f76369o;

    /* renamed from: p, reason: collision with root package name */
    public final long f76370p;

    /* renamed from: q, reason: collision with root package name */
    public final long f76371q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f76372r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f76373s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f76374t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo f76375u;

    public LocalUsageInfo(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, long j17, long j18, boolean z18, java.lang.String str6) {
        this.f76366i = "";
        this.f76374t = "";
        this.f76361d = str;
        this.f76362e = str2;
        this.f76363f = i17;
        this.f76364g = i18;
        this.f76365h = str3;
        this.f76367m = str4;
        this.f76368n = str5;
        this.f76369o = z17;
        this.f76370p = j17;
        this.f76371q = j18;
        this.f76372r = z18;
        this.f76373s = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76361d);
        parcel.writeString(this.f76362e);
        parcel.writeInt(this.f76363f);
        parcel.writeInt(this.f76364g);
        parcel.writeString(this.f76365h);
        parcel.writeString(this.f76366i);
        parcel.writeString(this.f76367m);
        parcel.writeString(this.f76368n);
        parcel.writeByte(this.f76369o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f76370p);
        parcel.writeLong(this.f76371q);
        parcel.writeByte(this.f76372r ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f76373s);
        parcel.writeString(this.f76374t);
        parcel.writeParcelable(this.f76375u, i17);
    }

    public LocalUsageInfo(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, long j17, long j18) {
        this(str, str2, i17, i18, str3, str4, str5, z17, j17, j18, false, "");
    }

    public LocalUsageInfo(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.appusage.h6 h6Var) {
        this.f76366i = "";
        this.f76374t = "";
        this.f76361d = parcel.readString();
        this.f76362e = parcel.readString();
        this.f76363f = parcel.readInt();
        this.f76364g = parcel.readInt();
        this.f76365h = parcel.readString();
        this.f76366i = parcel.readString();
        this.f76367m = parcel.readString();
        this.f76368n = parcel.readString();
        this.f76369o = parcel.readByte() > 0;
        this.f76370p = parcel.readLong();
        this.f76371q = parcel.readLong();
        this.f76372r = parcel.readByte() > 0;
        this.f76373s = parcel.readString();
        this.f76374t = parcel.readString();
        this.f76375u = (com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo.class.getClassLoader());
    }
}
