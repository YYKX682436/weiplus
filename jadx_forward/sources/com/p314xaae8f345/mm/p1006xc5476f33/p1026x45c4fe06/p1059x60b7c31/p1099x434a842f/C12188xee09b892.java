package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1099x434a842f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/native_navigator/NativeDataChannel$WxaToNative$CallbackDataToNativeMessage", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage */
/* loaded from: classes7.dex */
public final /* data */ class C12188xee09b892 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1099x434a842f.C12188xee09b892> f34548x681a0c0c = new xc1.p();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163918d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f163919e;

    public C12188xee09b892(java.lang.String appId, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f163918d = appId;
        this.f163919e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51144xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1099x434a842f.C12188xee09b892)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1099x434a842f.C12188xee09b892 c12188xee09b892 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1099x434a842f.C12188xee09b892) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f163918d, c12188xee09b892.f163918d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f163919e, c12188xee09b892.f163919e);
    }

    /* renamed from: hashCode */
    public int m51145x8cdac1b() {
        return (this.f163918d.hashCode() * 31) + this.f163919e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51146x9616526c() {
        return "CallbackDataToNativeMessage(appId=" + this.f163918d + ", data=" + this.f163919e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f163918d);
        out.writeString(this.f163919e);
    }
}
