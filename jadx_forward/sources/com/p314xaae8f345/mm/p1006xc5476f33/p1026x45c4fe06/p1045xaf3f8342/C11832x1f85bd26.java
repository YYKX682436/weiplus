package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaExposedParams */
/* loaded from: classes7.dex */
public class C11832x1f85bd26 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26> f33609x681a0c0c = new k91.y5();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f159011d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f159012e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f159013f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f159014g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f159015h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f159016i;

    /* renamed from: m, reason: collision with root package name */
    public final int f159017m;

    /* renamed from: n, reason: collision with root package name */
    public final int f159018n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f159019o;

    /* renamed from: p, reason: collision with root package name */
    public final int f159020p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f159021q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f159022r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f159023s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f159024t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f159025u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f159026v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f159027w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f159028x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f159029y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f159030z;

    public C11832x1f85bd26(k91.z5 z5Var, k91.y5 y5Var) {
        this.f159012e = "";
        this.f159013f = "";
        this.f159011d = z5Var.f387396a;
        this.f159012e = z5Var.f387397b;
        this.f159013f = z5Var.f387398c;
        this.f159014g = z5Var.f387399d;
        this.f159015h = z5Var.f387400e;
        this.f159016i = z5Var.f387401f;
        this.f159017m = z5Var.f387403h;
        this.f159018n = z5Var.f387402g;
        this.f159019o = z5Var.f387404i;
        this.f159020p = z5Var.f387405j;
        this.f159021q = z5Var.f387406k;
        this.f159022r = z5Var.f387407l;
        this.f159023s = z5Var.f387408m;
        this.f159024t = z5Var.f387409n;
        this.f159025u = z5Var.f387410o;
        this.f159026v = z5Var.f387411p;
        java.lang.String str = z5Var.f387412q;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f159027w = str == null ? "" : str;
        java.lang.String str2 = z5Var.f387413r;
        this.f159028x = str2 != null ? str2 : "";
        this.f159029y = z5Var.f387414s;
        this.f159030z = z5Var.f387415t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50144x9616526c() {
        return "WxaExposedParams{appId='" + this.f159011d + "', username='" + this.f159014g + "', nickname='" + this.f159015h + "', iconUrl='" + this.f159016i + "', pkgDebugType=" + this.f159017m + ", pkgVersion=" + this.f159018n + ", pkgMD5='" + this.f159019o + "', from=" + this.f159020p + ", pageId='" + this.f159021q + "', errorUrl='" + this.f159022r + "', screenshotLocalId='" + this.f159023s + "', sessionId='" + this.f159024t + "', businessAppId='" + this.f159025u + "', msgId='" + this.f159026v + "', voipRoomId='" + this.f159030z + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f159011d);
        parcel.writeString(this.f159012e);
        parcel.writeString(this.f159013f);
        parcel.writeString(this.f159014g);
        parcel.writeString(this.f159015h);
        parcel.writeString(this.f159016i);
        parcel.writeInt(this.f159017m);
        parcel.writeInt(this.f159018n);
        parcel.writeString(this.f159019o);
        parcel.writeInt(this.f159020p);
        parcel.writeString(this.f159021q);
        parcel.writeString(this.f159022r);
        parcel.writeString(this.f159023s);
        parcel.writeString(this.f159024t);
        parcel.writeString(this.f159025u);
        parcel.writeString(this.f159026v);
        parcel.writeString(this.f159027w);
        parcel.writeString(this.f159028x);
        parcel.writeString(this.f159029y);
        parcel.writeString(this.f159030z);
    }

    public C11832x1f85bd26(android.os.Parcel parcel) {
        this.f159012e = "";
        this.f159013f = "";
        this.f159011d = parcel.readString();
        this.f159012e = parcel.readString();
        this.f159013f = parcel.readString();
        this.f159014g = parcel.readString();
        this.f159015h = parcel.readString();
        this.f159016i = parcel.readString();
        this.f159017m = parcel.readInt();
        this.f159018n = parcel.readInt();
        this.f159019o = parcel.readString();
        this.f159020p = parcel.readInt();
        this.f159021q = parcel.readString();
        this.f159022r = parcel.readString();
        this.f159023s = parcel.readString();
        this.f159024t = parcel.readString();
        this.f159025u = parcel.readString();
        this.f159026v = parcel.readString();
        this.f159027w = parcel.readString();
        this.f159028x = parcel.readString();
        this.f159029y = parcel.readString();
        this.f159030z = parcel.readString();
    }
}
