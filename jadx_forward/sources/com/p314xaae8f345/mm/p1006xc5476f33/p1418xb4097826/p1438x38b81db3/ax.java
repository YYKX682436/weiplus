package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx f184440a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f184441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f184442c;

    /* renamed from: d, reason: collision with root package name */
    public final int f184443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f184444e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.n6 f184445f;

    public ax(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bx type, java.lang.String content, int i17, int i18, int i19, so2.n6 n6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f184440a = type;
        this.f184441b = content;
        this.f184442c = i17;
        this.f184443d = i18;
        this.f184444e = i19;
        this.f184445f = n6Var;
    }

    /* renamed from: equals */
    public boolean m55632xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax axVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ax) obj;
        return this.f184440a == axVar.f184440a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f184441b, axVar.f184441b) && this.f184442c == axVar.f184442c && this.f184443d == axVar.f184443d && this.f184444e == axVar.f184444e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f184445f, axVar.f184445f);
    }

    /* renamed from: hashCode */
    public int m55633x8cdac1b() {
        int hashCode = ((((((((this.f184440a.hashCode() * 31) + this.f184441b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f184442c)) * 31) + java.lang.Integer.hashCode(this.f184443d)) * 31) + java.lang.Integer.hashCode(this.f184444e)) * 31;
        so2.n6 n6Var = this.f184445f;
        return hashCode + (n6Var == null ? 0 : n6Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m55634x9616526c() {
        return "ElementData(type=" + this.f184440a + ", content=" + this.f184441b + ", color=" + this.f184442c + ", width=" + this.f184443d + ", availableWidth=" + this.f184444e + ", modModel=" + this.f184445f + ')';
    }
}
