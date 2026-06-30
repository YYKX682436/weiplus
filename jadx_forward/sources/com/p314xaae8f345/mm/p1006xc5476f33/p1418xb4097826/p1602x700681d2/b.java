package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f203791a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f203792b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f203793c;

    public b(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, boolean z18) {
        this.f203791a = gVar;
        this.f203792b = z17;
        this.f203793c = z18;
    }

    /* renamed from: equals */
    public boolean m58559xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f203791a, bVar.f203791a) && this.f203792b == bVar.f203792b && this.f203793c == bVar.f203793c;
    }

    /* renamed from: hashCode */
    public int m58560x8cdac1b() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f203791a;
        return ((((gVar == null ? 0 : gVar.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f203792b)) * 31) + java.lang.Boolean.hashCode(this.f203793c);
    }

    /* renamed from: toString */
    public java.lang.String m58561x9616526c() {
        return "Extra(lastBuffer=" + this.f203791a + ", upContinue=" + this.f203792b + ", downContinue=" + this.f203793c + ')';
    }
}
