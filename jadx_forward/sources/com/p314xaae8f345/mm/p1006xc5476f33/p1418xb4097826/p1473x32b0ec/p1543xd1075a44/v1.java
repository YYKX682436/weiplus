package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u1 f201552f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f201553a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f201554b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f201555c;

    /* renamed from: d, reason: collision with root package name */
    public final int f201556d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f201557e;

    public v1(java.lang.String finderUsername, java.lang.String nickname, java.lang.String str, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        this.f201553a = finderUsername;
        this.f201554b = nickname;
        this.f201555c = str;
        this.f201556d = i17;
        this.f201557e = z17;
    }

    /* renamed from: equals */
    public boolean m58169xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201553a, v1Var.f201553a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201554b, v1Var.f201554b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201555c, v1Var.f201555c) && this.f201556d == v1Var.f201556d && this.f201557e == v1Var.f201557e;
    }

    /* renamed from: hashCode */
    public int m58170x8cdac1b() {
        int hashCode = ((this.f201553a.hashCode() * 31) + this.f201554b.hashCode()) * 31;
        java.lang.String str = this.f201555c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f201556d)) * 31) + java.lang.Boolean.hashCode(this.f201557e);
    }

    /* renamed from: toString */
    public java.lang.String m58171x9616526c() {
        return "CoLiveHostInfo(finderUsername=" + this.f201553a + ", nickname=" + this.f201554b + ", avatarUrl=" + this.f201555c + ", role=" + this.f201556d + ", isRemovable=" + this.f201557e + ')';
    }
}
