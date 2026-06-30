package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f213282a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f213283b;

    public c5(int i17, java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f213282a = i17;
        this.f213283b = data;
    }

    /* renamed from: equals */
    public boolean m62545xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c5 c5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c5) obj;
        return this.f213282a == c5Var.f213282a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213283b, c5Var.f213283b);
    }

    /* renamed from: hashCode */
    public int m62546x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f213282a) * 31) + this.f213283b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m62547x9616526c() {
        return "DrawerResultData(commentCount=" + this.f213282a + ", data=" + this.f213283b + ')';
    }
}
