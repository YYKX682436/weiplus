package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Parameter", "Landroid/os/Parcelable;", "CREATOR", "td1/m", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter */
/* loaded from: classes14.dex */
public final /* data */ class C12224xfdf1bf9e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final td1.m f34729x681a0c0c = new td1.m(null);

    /* renamed from: d, reason: collision with root package name */
    public final td1.k f164447d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164448e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164449f;

    /* renamed from: g, reason: collision with root package name */
    public final int f164450g;

    public C12224xfdf1bf9e(td1.k actionType, java.lang.String username, java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f164447d = actionType;
        this.f164448e = username;
        this.f164449f = appId;
        this.f164450g = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51236xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12224xfdf1bf9e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12224xfdf1bf9e c12224xfdf1bf9e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12224xfdf1bf9e) obj;
        return this.f164447d == c12224xfdf1bf9e.f164447d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164448e, c12224xfdf1bf9e.f164448e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164449f, c12224xfdf1bf9e.f164449f) && this.f164450g == c12224xfdf1bf9e.f164450g;
    }

    /* renamed from: hashCode */
    public int m51237x8cdac1b() {
        return (((((this.f164447d.hashCode() * 31) + this.f164448e.hashCode()) * 31) + this.f164449f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f164450g);
    }

    /* renamed from: toString */
    public java.lang.String m51238x9616526c() {
        return "Parameter(actionType=" + this.f164447d + ", username=" + this.f164448e + ", appId=" + this.f164449f + ", versionType=" + this.f164450g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f164447d.name());
        parcel.writeString(this.f164448e);
        parcel.writeString(this.f164449f);
        parcel.writeInt(this.f164450g);
    }
}
