package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCMessage;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage */
/* loaded from: classes7.dex */
public final /* data */ class C3937x1adcb01a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a> f15704x681a0c0c = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.l();

    /* renamed from: d, reason: collision with root package name */
    public final int f129133d;

    /* renamed from: e, reason: collision with root package name */
    public final int f129134e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Parcelable f129135f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f129136g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f129137h;

    public C3937x1adcb01a(int i17, int i18, android.os.Parcelable parcelable, java.lang.String str, java.lang.String str2) {
        this.f129133d = i17;
        this.f129134e = i18;
        this.f129135f = parcelable;
        this.f129136g = str;
        this.f129137h = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m32209xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a c3937x1adcb01a = (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a) obj;
        return this.f129133d == c3937x1adcb01a.f129133d && this.f129134e == c3937x1adcb01a.f129134e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129135f, c3937x1adcb01a.f129135f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129136g, c3937x1adcb01a.f129136g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129137h, c3937x1adcb01a.f129137h);
    }

    /* renamed from: hashCode */
    public int m32210x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f129133d) * 31) + java.lang.Integer.hashCode(this.f129134e)) * 31;
        android.os.Parcelable parcelable = this.f129135f;
        int hashCode2 = (hashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        java.lang.String str = this.f129136g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f129137h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m32211x9616526c() {
        return "OnWXAppResultXPCMessage(instance=" + this.f129133d + ", action=" + this.f129134e + ", data=" + this.f129135f + ", stacktrace=" + this.f129136g + ", callProcess=" + this.f129137h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f129133d);
        out.writeInt(this.f129134e);
        out.writeParcelable(this.f129135f, i17);
        out.writeString(this.f129136g);
        out.writeString(this.f129137h);
    }

    public C3937x1adcb01a(int i17, int i18, android.os.Parcelable parcelable, java.lang.String str, java.lang.String str2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, parcelable, (i19 & 8) != 0 ? android.util.Log.getStackTraceString(new java.lang.Throwable()) : str, (i19 & 16) != 0 ? bm5.f1.a() : str2);
    }
}
