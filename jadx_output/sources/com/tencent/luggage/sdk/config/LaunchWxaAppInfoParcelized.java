package com.tencent.luggage.sdk.config;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/config/LaunchWxaAppInfoParcelized;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LaunchWxaAppInfoParcelized implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized> CREATOR = new ne.k();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle f47301d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Parcelable f47302e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f47303f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47304g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47305h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized f47306i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f47307m;

    /* renamed from: n, reason: collision with root package name */
    public int f47308n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f47309o;

    public LaunchWxaAppInfoParcelized(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle, android.os.Parcelable parcelable, java.lang.String str, boolean z17, boolean z18, com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized launchWxaAppMigrateInfoParcelized, boolean z19, int i17, java.lang.String str2) {
        this.f47301d = appRuntimeApiPermissionBundle;
        this.f47302e = parcelable;
        this.f47303f = str;
        this.f47304g = z17;
        this.f47305h = z18;
        this.f47306i = launchWxaAppMigrateInfoParcelized;
        this.f47307m = z19;
        this.f47308n = i17;
        this.f47309o = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f47301d, i17);
        out.writeParcelable(this.f47302e, i17);
        out.writeString(this.f47303f);
        out.writeInt(this.f47304g ? 1 : 0);
        out.writeInt(this.f47305h ? 1 : 0);
        com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized launchWxaAppMigrateInfoParcelized = this.f47306i;
        if (launchWxaAppMigrateInfoParcelized == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            launchWxaAppMigrateInfoParcelized.writeToParcel(out, i17);
        }
        out.writeInt(this.f47307m ? 1 : 0);
        out.writeInt(this.f47308n);
        out.writeString(this.f47309o);
    }

    public /* synthetic */ LaunchWxaAppInfoParcelized(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle, android.os.Parcelable parcelable, java.lang.String str, boolean z17, boolean z18, com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized launchWxaAppMigrateInfoParcelized, boolean z19, int i17, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        this(appRuntimeApiPermissionBundle, parcelable, str, z17, (i18 & 16) != 0 ? false : z18, (i18 & 32) != 0 ? null : launchWxaAppMigrateInfoParcelized, (i18 & 64) != 0 ? false : z19, (i18 & 128) != 0 ? 0 : i17, str2);
    }
}
