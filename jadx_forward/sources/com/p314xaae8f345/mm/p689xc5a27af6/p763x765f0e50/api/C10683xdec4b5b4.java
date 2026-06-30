package com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/AskParam;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.setting.api.AskParam */
/* loaded from: classes11.dex */
public final /* data */ class C10683xdec4b5b4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4> f28922x681a0c0c = new wd0.c();

    /* renamed from: d, reason: collision with root package name */
    public int f149339d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f149340e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149341f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f149342g;

    public C10683xdec4b5b4(int i17, java.lang.String ask, java.lang.String ask_signature, java.lang.String cert) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ask, "ask");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ask_signature, "ask_signature");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cert, "cert");
        this.f149339d = i17;
        this.f149340e = ask;
        this.f149341f = ask_signature;
        this.f149342g = cert;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45279xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4 c10683xdec4b5b4 = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4) obj;
        return this.f149339d == c10683xdec4b5b4.f149339d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149340e, c10683xdec4b5b4.f149340e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149341f, c10683xdec4b5b4.f149341f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149342g, c10683xdec4b5b4.f149342g);
    }

    /* renamed from: hashCode */
    public int m45280x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f149339d) * 31) + this.f149340e.hashCode()) * 31) + this.f149341f.hashCode()) * 31) + this.f149342g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m45281x9616526c() {
        return "AskParam(errCode=" + this.f149339d + ", ask=" + this.f149340e + ", ask_signature=" + this.f149341f + ", cert=" + this.f149342g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f149339d);
        out.writeString(this.f149340e);
        out.writeString(this.f149341f);
        out.writeString(this.f149342g);
    }

    public /* synthetic */ C10683xdec4b5b4(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? "" : str2, (i18 & 8) != 0 ? "" : str3);
    }
}
