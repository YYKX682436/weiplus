package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class SetTextStatusParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.yf();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78670d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78671e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f78672f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f78673g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f78674h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f78675i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f78676m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f78677n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f78678o;

    /* renamed from: p, reason: collision with root package name */
    public final int f78679p;

    /* renamed from: q, reason: collision with root package name */
    public final int f78680q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f78681r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f78682s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f78683t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f78684u;

    public SetTextStatusParams(java.lang.String iconResId, java.lang.String thumbUrl, java.lang.String desc, java.lang.String enterPath, java.lang.String verifyInfo, java.lang.String activityId, boolean z17, java.lang.String appId, java.lang.String appUsername, int i17, int i18, java.lang.String appName, java.lang.String appIconUrl, boolean z18, java.lang.String str) {
        kotlin.jvm.internal.o.g(iconResId, "iconResId");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        kotlin.jvm.internal.o.g(verifyInfo, "verifyInfo");
        kotlin.jvm.internal.o.g(activityId, "activityId");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(appUsername, "appUsername");
        kotlin.jvm.internal.o.g(appName, "appName");
        kotlin.jvm.internal.o.g(appIconUrl, "appIconUrl");
        this.f78670d = iconResId;
        this.f78671e = thumbUrl;
        this.f78672f = desc;
        this.f78673g = enterPath;
        this.f78674h = verifyInfo;
        this.f78675i = activityId;
        this.f78676m = z17;
        this.f78677n = appId;
        this.f78678o = appUsername;
        this.f78679p = i17;
        this.f78680q = i18;
        this.f78681r = appName;
        this.f78682s = appIconUrl;
        this.f78683t = z18;
        this.f78684u = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "SetTextStatusParams(iconResId='" + this.f78670d + "', thumbUrl='" + this.f78671e + "', desc='" + this.f78672f + "', enterPath='" + this.f78673g + "', verifyInfo='" + this.f78674h + "', activityId='" + this.f78675i + "', isQuickPost='" + this.f78676m + "', appId='" + this.f78677n + "', appUsername='" + this.f78678o + "', versionType=" + this.f78679p + ", version=" + this.f78680q + ", isMiniGame=" + this.f78683t + ", extraData=" + this.f78684u + ", appName='" + this.f78681r + "', appIconUrl='" + this.f78682s + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f78670d);
        out.writeString(this.f78671e);
        out.writeString(this.f78672f);
        out.writeString(this.f78673g);
        out.writeString(this.f78674h);
        out.writeString(this.f78675i);
        out.writeInt(this.f78676m ? 1 : 0);
        out.writeString(this.f78677n);
        out.writeString(this.f78678o);
        out.writeInt(this.f78679p);
        out.writeInt(this.f78680q);
        out.writeString(this.f78681r);
        out.writeString(this.f78682s);
        out.writeInt(this.f78683t ? 1 : 0);
        out.writeString(this.f78684u);
    }

    public /* synthetic */ SetTextStatusParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.lang.String str7, java.lang.String str8, int i17, int i18, java.lang.String str9, java.lang.String str10, boolean z18, java.lang.String str11, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? "" : str, (i19 & 2) != 0 ? "" : str2, (i19 & 4) != 0 ? "" : str3, (i19 & 8) != 0 ? "" : str4, (i19 & 16) != 0 ? "" : str5, (i19 & 32) != 0 ? "" : str6, (i19 & 64) != 0 ? false : z17, (i19 & 128) != 0 ? "" : str7, (i19 & 256) != 0 ? "" : str8, (i19 & 512) != 0 ? 0 : i17, (i19 & 1024) != 0 ? 0 : i18, (i19 & 2048) != 0 ? "" : str9, (i19 & 4096) != 0 ? "" : str10, (i19 & 8192) != 0 ? false : z18, (i19 & 16384) == 0 ? str11 : "");
    }
}
