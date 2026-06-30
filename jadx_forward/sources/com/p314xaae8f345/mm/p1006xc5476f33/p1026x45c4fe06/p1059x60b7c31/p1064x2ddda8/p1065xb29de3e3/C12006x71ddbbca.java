package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMAuthScopeRiskWxaAppInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/entity/s", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo */
/* loaded from: classes5.dex */
public class C12006x71ddbbca implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.s f33849x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.s(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160992d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160993e;

    /* renamed from: f, reason: collision with root package name */
    public final int f160994f;

    /* renamed from: g, reason: collision with root package name */
    public final int f160995g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160996h;

    public C12006x71ddbbca(java.lang.String username, java.lang.String path, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f160992d = username;
        this.f160993e = path;
        this.f160994f = i17;
        this.f160995g = i18;
        this.f160996h = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f160992d);
        parcel.writeString(this.f160993e);
        parcel.writeInt(this.f160994f);
        parcel.writeInt(this.f160995g);
        parcel.writeInt(this.f160996h);
    }
}
