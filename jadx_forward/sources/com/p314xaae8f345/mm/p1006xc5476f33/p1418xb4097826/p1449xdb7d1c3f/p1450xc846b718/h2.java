package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f187080a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i2 f187081b;

    public h2(java.lang.String url, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i2 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f187080a = url;
        this.f187081b = type;
    }

    /* renamed from: equals */
    public boolean m55824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h2 h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187080a, h2Var.f187080a) && this.f187081b == h2Var.f187081b;
    }

    /* renamed from: hashCode */
    public int m55825x8cdac1b() {
        return (this.f187080a.hashCode() * 31) + this.f187081b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m55826x9616526c() {
        return "Avatar(url=" + this.f187080a + ", type=" + this.f187081b + ')';
    }
}
