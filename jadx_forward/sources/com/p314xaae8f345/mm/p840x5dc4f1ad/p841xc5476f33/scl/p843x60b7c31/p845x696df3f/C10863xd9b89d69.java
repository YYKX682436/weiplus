package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCCallback", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback */
/* loaded from: classes.dex */
final /* data */ class C10863xd9b89d69 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10863xd9b89d69> f29650x681a0c0c = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.a();

    /* renamed from: d, reason: collision with root package name */
    public final long f150200d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150201e;

    public C10863xd9b89d69(long j17, java.lang.String str) {
        this.f150200d = j17;
        this.f150201e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46594xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10863xd9b89d69)) {
            return false;
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10863xd9b89d69 c10863xd9b89d69 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10863xd9b89d69) obj;
        return this.f150200d == c10863xd9b89d69.f150200d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150201e, c10863xd9b89d69.f150201e);
    }

    /* renamed from: hashCode */
    public int m46595x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f150200d) * 31;
        java.lang.String str = this.f150201e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m46596x9616526c() {
        return "IPCCallback(errCode=" + this.f150200d + ", errMsg=" + this.f150201e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f150200d);
        out.writeString(this.f150201e);
    }
}
