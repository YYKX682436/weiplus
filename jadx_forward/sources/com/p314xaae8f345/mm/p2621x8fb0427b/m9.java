package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes3.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f276660a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f276661b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f276662c;

    public m9(int i17, java.lang.String typeName, yz5.a getUnreadCount) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeName, "typeName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getUnreadCount, "getUnreadCount");
        this.f276660a = i17;
        this.f276661b = typeName;
        this.f276662c = getUnreadCount;
    }

    /* renamed from: equals */
    public boolean m78072xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.m9)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m9 m9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m9) obj;
        return this.f276660a == m9Var.f276660a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f276661b, m9Var.f276661b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f276662c, m9Var.f276662c);
    }

    /* renamed from: hashCode */
    public int m78073x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f276660a) * 31) + this.f276661b.hashCode()) * 31) + this.f276662c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m78074x9616526c() {
        return "TabConfig(type=" + this.f276660a + ", typeName=" + this.f276661b + ", getUnreadCount=" + this.f276662c + ')';
    }
}
