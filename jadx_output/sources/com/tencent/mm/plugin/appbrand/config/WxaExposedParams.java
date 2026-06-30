package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class WxaExposedParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaExposedParams> CREATOR = new k91.y5();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f77478d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f77479e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f77480f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f77481g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f77482h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f77483i;

    /* renamed from: m, reason: collision with root package name */
    public final int f77484m;

    /* renamed from: n, reason: collision with root package name */
    public final int f77485n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f77486o;

    /* renamed from: p, reason: collision with root package name */
    public final int f77487p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f77488q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f77489r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f77490s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f77491t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f77492u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f77493v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f77494w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f77495x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f77496y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f77497z;

    public WxaExposedParams(k91.z5 z5Var, k91.y5 y5Var) {
        this.f77479e = "";
        this.f77480f = "";
        this.f77478d = z5Var.f305863a;
        this.f77479e = z5Var.f305864b;
        this.f77480f = z5Var.f305865c;
        this.f77481g = z5Var.f305866d;
        this.f77482h = z5Var.f305867e;
        this.f77483i = z5Var.f305868f;
        this.f77484m = z5Var.f305870h;
        this.f77485n = z5Var.f305869g;
        this.f77486o = z5Var.f305871i;
        this.f77487p = z5Var.f305872j;
        this.f77488q = z5Var.f305873k;
        this.f77489r = z5Var.f305874l;
        this.f77490s = z5Var.f305875m;
        this.f77491t = z5Var.f305876n;
        this.f77492u = z5Var.f305877o;
        this.f77493v = z5Var.f305878p;
        java.lang.String str = z5Var.f305879q;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f77494w = str == null ? "" : str;
        java.lang.String str2 = z5Var.f305880r;
        this.f77495x = str2 != null ? str2 : "";
        this.f77496y = z5Var.f305881s;
        this.f77497z = z5Var.f305882t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "WxaExposedParams{appId='" + this.f77478d + "', username='" + this.f77481g + "', nickname='" + this.f77482h + "', iconUrl='" + this.f77483i + "', pkgDebugType=" + this.f77484m + ", pkgVersion=" + this.f77485n + ", pkgMD5='" + this.f77486o + "', from=" + this.f77487p + ", pageId='" + this.f77488q + "', errorUrl='" + this.f77489r + "', screenshotLocalId='" + this.f77490s + "', sessionId='" + this.f77491t + "', businessAppId='" + this.f77492u + "', msgId='" + this.f77493v + "', voipRoomId='" + this.f77497z + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77478d);
        parcel.writeString(this.f77479e);
        parcel.writeString(this.f77480f);
        parcel.writeString(this.f77481g);
        parcel.writeString(this.f77482h);
        parcel.writeString(this.f77483i);
        parcel.writeInt(this.f77484m);
        parcel.writeInt(this.f77485n);
        parcel.writeString(this.f77486o);
        parcel.writeInt(this.f77487p);
        parcel.writeString(this.f77488q);
        parcel.writeString(this.f77489r);
        parcel.writeString(this.f77490s);
        parcel.writeString(this.f77491t);
        parcel.writeString(this.f77492u);
        parcel.writeString(this.f77493v);
        parcel.writeString(this.f77494w);
        parcel.writeString(this.f77495x);
        parcel.writeString(this.f77496y);
        parcel.writeString(this.f77497z);
    }

    public WxaExposedParams(android.os.Parcel parcel) {
        this.f77479e = "";
        this.f77480f = "";
        this.f77478d = parcel.readString();
        this.f77479e = parcel.readString();
        this.f77480f = parcel.readString();
        this.f77481g = parcel.readString();
        this.f77482h = parcel.readString();
        this.f77483i = parcel.readString();
        this.f77484m = parcel.readInt();
        this.f77485n = parcel.readInt();
        this.f77486o = parcel.readString();
        this.f77487p = parcel.readInt();
        this.f77488q = parcel.readString();
        this.f77489r = parcel.readString();
        this.f77490s = parcel.readString();
        this.f77491t = parcel.readString();
        this.f77492u = parcel.readString();
        this.f77493v = parcel.readString();
        this.f77494w = parcel.readString();
        this.f77495x = parcel.readString();
        this.f77496y = parcel.readString();
        this.f77497z = parcel.readString();
    }
}
