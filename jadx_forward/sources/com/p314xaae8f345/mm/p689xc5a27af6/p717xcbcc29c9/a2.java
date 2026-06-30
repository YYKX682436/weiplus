package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes11.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c2 f146873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f146874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f146875c;

    public a2(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c2 definition, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(definition, "definition");
        this.f146873a = definition;
        this.f146874b = i17;
        this.f146875c = i18;
    }

    /* renamed from: equals */
    public boolean m44125xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a2)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a2 a2Var = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146873a, a2Var.f146873a) && this.f146874b == a2Var.f146874b && this.f146875c == a2Var.f146875c;
    }

    /* renamed from: hashCode */
    public int m44126x8cdac1b() {
        return (((this.f146873a.m44145x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f146874b)) * 31) + java.lang.Integer.hashCode(this.f146875c);
    }

    /* renamed from: toString */
    public java.lang.String m44127x9616526c() {
        return "InternalTask(definition=" + this.f146873a + ", progressStart=" + this.f146874b + ", progressEnd=" + this.f146875c + ')';
    }
}
