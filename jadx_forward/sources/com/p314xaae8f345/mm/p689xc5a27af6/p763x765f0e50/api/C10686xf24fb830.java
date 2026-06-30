package com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/FingerprintVerifyParam;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.setting.api.FingerprintVerifyParam */
/* loaded from: classes11.dex */
public final /* data */ class C10686xf24fb830 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830> f28925x681a0c0c = new wd0.f1();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4 f149350d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56 f149351e;

    /* renamed from: f, reason: collision with root package name */
    public final int f149352f;

    /* renamed from: g, reason: collision with root package name */
    public int f149353g;

    public C10686xf24fb830(com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4 askInfo, com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56 authKeyInfo, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(askInfo, "askInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authKeyInfo, "authKeyInfo");
        this.f149350d = askInfo;
        this.f149351e = authKeyInfo;
        this.f149352f = i17;
        this.f149353g = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45291xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830 c10686xf24fb830 = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149350d, c10686xf24fb830.f149350d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149351e, c10686xf24fb830.f149351e) && this.f149352f == c10686xf24fb830.f149352f && this.f149353g == c10686xf24fb830.f149353g;
    }

    /* renamed from: hashCode */
    public int m45292x8cdac1b() {
        return (((((this.f149350d.m45280x8cdac1b() * 31) + this.f149351e.m45284x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f149352f)) * 31) + java.lang.Integer.hashCode(this.f149353g);
    }

    /* renamed from: toString */
    public java.lang.String m45293x9616526c() {
        return "FingerprintVerifyParam(askInfo=" + this.f149350d + ", authKeyInfo=" + this.f149351e + ", scene=" + this.f149352f + ", errCode=" + this.f149353g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        this.f149350d.writeToParcel(out, i17);
        this.f149351e.writeToParcel(out, i17);
        out.writeInt(this.f149352f);
        out.writeInt(this.f149353g);
    }
}
