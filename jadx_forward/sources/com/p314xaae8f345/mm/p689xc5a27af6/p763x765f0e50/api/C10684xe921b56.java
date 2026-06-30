package com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/AuthKeyParam;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.setting.api.AuthKeyParam */
/* loaded from: classes11.dex */
public final /* data */ class C10684xe921b56 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56> f28923x681a0c0c = new wd0.d();

    /* renamed from: d, reason: collision with root package name */
    public int f149343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f149344e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149345f;

    public C10684xe921b56(int i17, java.lang.String authKey, java.lang.String authKey_signature) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authKey, "authKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authKey_signature, "authKey_signature");
        this.f149343d = i17;
        this.f149344e = authKey;
        this.f149345f = authKey_signature;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45283xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56 c10684xe921b56 = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56) obj;
        return this.f149343d == c10684xe921b56.f149343d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149344e, c10684xe921b56.f149344e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149345f, c10684xe921b56.f149345f);
    }

    /* renamed from: hashCode */
    public int m45284x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f149343d) * 31) + this.f149344e.hashCode()) * 31) + this.f149345f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m45285x9616526c() {
        return "AuthKeyParam(errCode=" + this.f149343d + ", authKey=" + this.f149344e + ", authKey_signature=" + this.f149345f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f149343d);
        out.writeString(this.f149344e);
        out.writeString(this.f149345f);
    }

    public /* synthetic */ C10684xe921b56(int i17, java.lang.String str, java.lang.String str2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? "" : str2);
    }
}
