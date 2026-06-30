package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f216777a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f216778b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f216779c;

    /* renamed from: d, reason: collision with root package name */
    public final long f216780d;

    public n1(long j17, java.lang.String step, org.json.JSONObject extraData, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(step, "step");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        this.f216777a = j17;
        this.f216778b = step;
        this.f216779c = extraData;
        this.f216780d = j18;
    }

    /* renamed from: equals */
    public boolean m63189xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n1) obj;
        return this.f216777a == n1Var.f216777a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216778b, n1Var.f216778b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216779c, n1Var.f216779c) && this.f216780d == n1Var.f216780d;
    }

    /* renamed from: hashCode */
    public int m63190x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f216777a) * 31) + this.f216778b.hashCode()) * 31) + this.f216779c.hashCode()) * 31) + java.lang.Long.hashCode(this.f216780d);
    }

    /* renamed from: toString */
    public java.lang.String m63191x9616526c() {
        return "Trace(feedId=" + this.f216777a + ", step=" + this.f216778b + ", extraData=" + this.f216779c + ", aid=" + this.f216780d + ')';
    }
}
