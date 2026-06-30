package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams */
/* loaded from: classes7.dex */
public final class C11953xb3fd7a47 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11953xb3fd7a47> f33682x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yf();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160203d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160204e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f160205f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f160206g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f160207h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f160208i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f160209m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f160210n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f160211o;

    /* renamed from: p, reason: collision with root package name */
    public final int f160212p;

    /* renamed from: q, reason: collision with root package name */
    public final int f160213q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f160214r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f160215s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f160216t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f160217u;

    public C11953xb3fd7a47(java.lang.String iconResId, java.lang.String thumbUrl, java.lang.String desc, java.lang.String enterPath, java.lang.String verifyInfo, java.lang.String activityId, boolean z17, java.lang.String appId, java.lang.String appUsername, int i17, int i18, java.lang.String appName, java.lang.String appIconUrl, boolean z18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconResId, "iconResId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyInfo, "verifyInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityId, "activityId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appUsername, "appUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appName, "appName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appIconUrl, "appIconUrl");
        this.f160203d = iconResId;
        this.f160204e = thumbUrl;
        this.f160205f = desc;
        this.f160206g = enterPath;
        this.f160207h = verifyInfo;
        this.f160208i = activityId;
        this.f160209m = z17;
        this.f160210n = appId;
        this.f160211o = appUsername;
        this.f160212p = i17;
        this.f160213q = i18;
        this.f160214r = appName;
        this.f160215s = appIconUrl;
        this.f160216t = z18;
        this.f160217u = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50497x9616526c() {
        return "SetTextStatusParams(iconResId='" + this.f160203d + "', thumbUrl='" + this.f160204e + "', desc='" + this.f160205f + "', enterPath='" + this.f160206g + "', verifyInfo='" + this.f160207h + "', activityId='" + this.f160208i + "', isQuickPost='" + this.f160209m + "', appId='" + this.f160210n + "', appUsername='" + this.f160211o + "', versionType=" + this.f160212p + ", version=" + this.f160213q + ", isMiniGame=" + this.f160216t + ", extraData=" + this.f160217u + ", appName='" + this.f160214r + "', appIconUrl='" + this.f160215s + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f160203d);
        out.writeString(this.f160204e);
        out.writeString(this.f160205f);
        out.writeString(this.f160206g);
        out.writeString(this.f160207h);
        out.writeString(this.f160208i);
        out.writeInt(this.f160209m ? 1 : 0);
        out.writeString(this.f160210n);
        out.writeString(this.f160211o);
        out.writeInt(this.f160212p);
        out.writeInt(this.f160213q);
        out.writeString(this.f160214r);
        out.writeString(this.f160215s);
        out.writeInt(this.f160216t ? 1 : 0);
        out.writeString(this.f160217u);
    }

    public /* synthetic */ C11953xb3fd7a47(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.lang.String str7, java.lang.String str8, int i17, int i18, java.lang.String str9, java.lang.String str10, boolean z18, java.lang.String str11, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? "" : str, (i19 & 2) != 0 ? "" : str2, (i19 & 4) != 0 ? "" : str3, (i19 & 8) != 0 ? "" : str4, (i19 & 16) != 0 ? "" : str5, (i19 & 32) != 0 ? "" : str6, (i19 & 64) != 0 ? false : z17, (i19 & 128) != 0 ? "" : str7, (i19 & 256) != 0 ? "" : str8, (i19 & 512) != 0 ? 0 : i17, (i19 & 1024) != 0 ? 0 : i18, (i19 & 2048) != 0 ? "" : str9, (i19 & 4096) != 0 ? "" : str10, (i19 & 8192) != 0 ? false : z18, (i19 & 16384) == 0 ? str11 : "");
    }
}
