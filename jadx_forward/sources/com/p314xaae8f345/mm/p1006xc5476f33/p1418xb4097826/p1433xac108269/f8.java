package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public r45.nw6 f183704a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f183705b;

    public f8(r45.nw6 nw6Var, java.lang.Integer num) {
        this.f183704a = nw6Var;
        this.f183705b = num;
    }

    /* renamed from: equals */
    public boolean m55474xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8 f8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f8) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183704a, f8Var.f183704a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183705b, f8Var.f183705b);
    }

    /* renamed from: hashCode */
    public int m55475x8cdac1b() {
        r45.nw6 nw6Var = this.f183704a;
        int hashCode = (nw6Var == null ? 0 : nw6Var.hashCode()) * 31;
        java.lang.Integer num = this.f183705b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m55476x9616526c() {
        return "UserPreviewInfoWrapper(userPreviewInfo=" + this.f183704a + ", requestTime=" + this.f183705b + ')';
    }
}
