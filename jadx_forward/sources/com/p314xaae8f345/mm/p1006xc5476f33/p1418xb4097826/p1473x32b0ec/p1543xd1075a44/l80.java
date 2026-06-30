package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes16.dex */
public final class l80 {

    /* renamed from: a, reason: collision with root package name */
    public final int f200451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f200452b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f200453c;

    public l80(int i17, int i18, yz5.a onClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f200451a = i17;
        this.f200452b = i18;
        this.f200453c = onClick;
    }

    /* renamed from: equals */
    public boolean m58087xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l80)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l80 l80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l80) obj;
        return this.f200451a == l80Var.f200451a && this.f200452b == l80Var.f200452b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f200453c, l80Var.f200453c);
    }

    /* renamed from: hashCode */
    public int m58088x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f200451a) * 31) + java.lang.Integer.hashCode(this.f200452b)) * 31) + this.f200453c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58089x9616526c() {
        return "AssistantMoreItem(titleResId=" + this.f200451a + ", iconResId=" + this.f200452b + ", onClick=" + this.f200453c + ')';
    }
}
