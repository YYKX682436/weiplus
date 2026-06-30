package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiAddVideoToFavorites$DoFavoriteParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams */
/* loaded from: classes4.dex */
final /* data */ class C11916x53edea60 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11916x53edea60> f33651x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160045d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160046e;

    public C11916x53edea60(java.lang.String videoPath, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        this.f160045d = videoPath;
        this.f160046e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50452xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11916x53edea60)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11916x53edea60 c11916x53edea60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11916x53edea60) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160045d, c11916x53edea60.f160045d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160046e, c11916x53edea60.f160046e);
    }

    /* renamed from: hashCode */
    public int m50453x8cdac1b() {
        int hashCode = this.f160045d.hashCode() * 31;
        java.lang.String str = this.f160046e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m50454x9616526c() {
        return "DoFavoriteParams(videoPath=" + this.f160045d + ", thumbPath=" + this.f160046e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f160045d);
        out.writeString(this.f160046e);
    }
}
