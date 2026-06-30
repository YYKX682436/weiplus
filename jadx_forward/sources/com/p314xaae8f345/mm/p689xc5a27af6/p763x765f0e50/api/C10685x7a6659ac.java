package com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/BindFingerprintCallback;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.setting.api.BindFingerprintCallback */
/* loaded from: classes11.dex */
public final /* data */ class C10685x7a6659ac implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac> f28924x681a0c0c = new wd0.e();

    /* renamed from: d, reason: collision with root package name */
    public int f149346d;

    /* renamed from: e, reason: collision with root package name */
    public int f149347e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149348f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f149349g;

    public C10685x7a6659ac(int i17, int i18, java.lang.String errMsg, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f149346d = i17;
        this.f149347e = i18;
        this.f149348f = errMsg;
        this.f149349g = result;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45287xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac) obj;
        return this.f149346d == c10685x7a6659ac.f149346d && this.f149347e == c10685x7a6659ac.f149347e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149348f, c10685x7a6659ac.f149348f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149349g, c10685x7a6659ac.f149349g);
    }

    /* renamed from: hashCode */
    public int m45288x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f149346d) * 31) + java.lang.Integer.hashCode(this.f149347e)) * 31) + this.f149348f.hashCode()) * 31) + this.f149349g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m45289x9616526c() {
        return "BindFingerprintCallback(errType=" + this.f149346d + ", errCode=" + this.f149347e + ", errMsg=" + this.f149348f + ", result=" + this.f149349g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f149346d);
        out.writeInt(this.f149347e);
        out.writeString(this.f149348f);
        out.writeString(this.f149349g);
    }
}
