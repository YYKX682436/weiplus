package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f290764a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f290765b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f290766c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f290767d;

    public t(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3) {
        this.f290764a = str;
        this.f290765b = num;
        this.f290766c = str2;
        this.f290767d = str3;
    }

    /* renamed from: equals */
    public boolean m80802xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t tVar = (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f290764a, tVar.f290764a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f290765b, tVar.f290765b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f290766c, tVar.f290766c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f290767d, tVar.f290767d);
    }

    /* renamed from: hashCode */
    public int m80803x8cdac1b() {
        java.lang.String str = this.f290764a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Integer num = this.f290765b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.f290766c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f290767d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m80804x9616526c() {
        return "GatewayLoginParam(mobile=" + this.f290764a + ", carrierType=" + this.f290765b + ", protocalTitle=" + this.f290766c + ", protocalUrl=" + this.f290767d + ')';
    }
}
