package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175863b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f175864c;

    /* renamed from: d, reason: collision with root package name */
    public final nu4.a f175865d;

    public k(java.lang.String url, int i17, java.lang.String str, nu4.a manifest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manifest, "manifest");
        this.f175862a = url;
        this.f175863b = i17;
        this.f175864c = str;
        this.f175865d = manifest;
    }

    /* renamed from: equals */
    public boolean m54368xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175862a, kVar.f175862a) && this.f175863b == kVar.f175863b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175864c, kVar.f175864c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175865d, kVar.f175865d);
    }

    /* renamed from: hashCode */
    public int m54369x8cdac1b() {
        int hashCode = ((this.f175862a.hashCode() * 31) + java.lang.Integer.hashCode(this.f175863b)) * 31;
        java.lang.String str = this.f175864c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f175865d.m150008x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m54370x9616526c() {
        return "FetchData(url=" + this.f175862a + ", itemShowType=" + this.f175863b + ", extInfo=" + this.f175864c + ", manifest=" + this.f175865d + ')';
    }
}
