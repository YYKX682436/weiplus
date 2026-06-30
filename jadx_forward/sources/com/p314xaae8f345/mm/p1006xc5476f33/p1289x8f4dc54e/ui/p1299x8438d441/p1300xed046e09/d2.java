package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175744a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f175745b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f175746c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f175747d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f175748e;

    /* renamed from: f, reason: collision with root package name */
    public final int f175749f;

    public d2(java.lang.String host, java.lang.String rawUrl, java.lang.String prefetchUrl, boolean z17, java.util.Map map, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        map = (i18 & 16) != 0 ? null : map;
        i17 = (i18 & 32) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawUrl, "rawUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefetchUrl, "prefetchUrl");
        this.f175744a = host;
        this.f175745b = rawUrl;
        this.f175746c = prefetchUrl;
        this.f175747d = z17;
        this.f175748e = map;
        this.f175749f = i17;
    }

    /* renamed from: equals */
    public boolean m54351xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175744a, d2Var.f175744a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175745b, d2Var.f175745b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175746c, d2Var.f175746c) && this.f175747d == d2Var.f175747d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f175748e, d2Var.f175748e) && this.f175749f == d2Var.f175749f;
    }

    /* renamed from: hashCode */
    public int m54352x8cdac1b() {
        int hashCode = ((((((this.f175744a.hashCode() * 31) + this.f175745b.hashCode()) * 31) + this.f175746c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f175747d)) * 31;
        java.util.Map map = this.f175748e;
        return ((hashCode + (map == null ? 0 : map.hashCode())) * 31) + java.lang.Integer.hashCode(this.f175749f);
    }

    /* renamed from: toString */
    public java.lang.String m54353x9616526c() {
        return "PrefetchAction(host=" + this.f175744a + ", rawUrl=" + this.f175745b + ", prefetchUrl=" + this.f175746c + ", checkCacheOnly=" + this.f175747d + ", prefetchHeader=" + this.f175748e + ", bizScene=" + this.f175749f + ')';
    }
}
