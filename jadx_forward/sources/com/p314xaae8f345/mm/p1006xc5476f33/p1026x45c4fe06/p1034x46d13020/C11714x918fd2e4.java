package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo */
/* loaded from: classes7.dex */
public class C11714x918fd2e4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4> f33506x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h6();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157894d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f157895e;

    /* renamed from: f, reason: collision with root package name */
    public final int f157896f;

    /* renamed from: g, reason: collision with root package name */
    public final int f157897g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f157898h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f157899i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f157900m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f157901n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f157902o;

    /* renamed from: p, reason: collision with root package name */
    public final long f157903p;

    /* renamed from: q, reason: collision with root package name */
    public final long f157904q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f157905r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f157906s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f157907t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43 f157908u;

    public C11714x918fd2e4(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, long j17, long j18, boolean z18, java.lang.String str6) {
        this.f157899i = "";
        this.f157907t = "";
        this.f157894d = str;
        this.f157895e = str2;
        this.f157896f = i17;
        this.f157897g = i18;
        this.f157898h = str3;
        this.f157900m = str4;
        this.f157901n = str5;
        this.f157902o = z17;
        this.f157903p = j17;
        this.f157904q = j18;
        this.f157905r = z18;
        this.f157906s = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f157894d);
        parcel.writeString(this.f157895e);
        parcel.writeInt(this.f157896f);
        parcel.writeInt(this.f157897g);
        parcel.writeString(this.f157898h);
        parcel.writeString(this.f157899i);
        parcel.writeString(this.f157900m);
        parcel.writeString(this.f157901n);
        parcel.writeByte(this.f157902o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f157903p);
        parcel.writeLong(this.f157904q);
        parcel.writeByte(this.f157905r ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f157906s);
        parcel.writeString(this.f157907t);
        parcel.writeParcelable(this.f157908u, i17);
    }

    public C11714x918fd2e4(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, long j17, long j18) {
        this(str, str2, i17, i18, str3, str4, str5, z17, j17, j18, false, "");
    }

    public C11714x918fd2e4(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h6 h6Var) {
        this.f157899i = "";
        this.f157907t = "";
        this.f157894d = parcel.readString();
        this.f157895e = parcel.readString();
        this.f157896f = parcel.readInt();
        this.f157897g = parcel.readInt();
        this.f157898h = parcel.readString();
        this.f157899i = parcel.readString();
        this.f157900m = parcel.readString();
        this.f157901n = parcel.readString();
        this.f157902o = parcel.readByte() > 0;
        this.f157903p = parcel.readLong();
        this.f157904q = parcel.readLong();
        this.f157905r = parcel.readByte() > 0;
        this.f157906s = parcel.readString();
        this.f157907t = parcel.readString();
        this.f157908u = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43.class.getClassLoader());
    }
}
