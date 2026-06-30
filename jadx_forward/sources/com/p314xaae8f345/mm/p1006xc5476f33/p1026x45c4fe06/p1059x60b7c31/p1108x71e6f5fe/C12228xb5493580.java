package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$CheckWXAppInfoData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData */
/* loaded from: classes4.dex */
public final /* data */ class C12228xb5493580 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580> f34745x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164465d;

    /* renamed from: e, reason: collision with root package name */
    public final int f164466e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164467f;

    public C12228xb5493580(java.lang.String result, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f164465d = result;
        this.f164466e = i17;
        this.f164467f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51253xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580 c12228xb5493580 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164465d, c12228xb5493580.f164465d) && this.f164466e == c12228xb5493580.f164466e && this.f164467f == c12228xb5493580.f164467f;
    }

    /* renamed from: hashCode */
    public int m51254x8cdac1b() {
        return (((this.f164465d.hashCode() * 31) + java.lang.Integer.hashCode(this.f164466e)) * 31) + java.lang.Integer.hashCode(this.f164467f);
    }

    /* renamed from: toString */
    public java.lang.String m51255x9616526c() {
        return "CheckWXAppInfoData(result=" + this.f164465d + ", codeType=" + this.f164466e + ", codeVersion=" + this.f164467f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f164465d);
        out.writeInt(this.f164466e);
        out.writeInt(this.f164467f);
    }
}
