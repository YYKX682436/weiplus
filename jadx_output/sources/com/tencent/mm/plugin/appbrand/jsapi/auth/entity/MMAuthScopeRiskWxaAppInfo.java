package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMAuthScopeRiskWxaAppInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/entity/s", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class MMAuthScopeRiskWxaAppInfo implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.s CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.s(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f79459d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79460e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79461f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79462g;

    /* renamed from: h, reason: collision with root package name */
    public final int f79463h;

    public MMAuthScopeRiskWxaAppInfo(java.lang.String username, java.lang.String path, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(path, "path");
        this.f79459d = username;
        this.f79460e = path;
        this.f79461f = i17;
        this.f79462g = i18;
        this.f79463h = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f79459d);
        parcel.writeString(this.f79460e);
        parcel.writeInt(this.f79461f);
        parcel.writeInt(this.f79462g);
        parcel.writeInt(this.f79463h);
    }
}
