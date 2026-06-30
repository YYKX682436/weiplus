package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f183908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f183909b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f183910c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f183911d;

    public m0(int i17, int i18, java.lang.String atNickname, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa finderContact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atNickname, "atNickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContact, "finderContact");
        this.f183908a = i17;
        this.f183909b = i18;
        this.f183910c = atNickname;
        this.f183911d = finderContact;
    }

    /* renamed from: equals */
    public boolean m55514xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0) obj;
        return this.f183908a == m0Var.f183908a && this.f183909b == m0Var.f183909b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183910c, m0Var.f183910c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183911d, m0Var.f183911d);
    }

    /* renamed from: hashCode */
    public int m55515x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f183908a) * 31) + java.lang.Integer.hashCode(this.f183909b)) * 31) + this.f183910c.hashCode()) * 31) + this.f183911d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m55516x9616526c() {
        return "AtStringInfo(start=" + this.f183908a + ", end=" + this.f183909b + ", atNickname=" + this.f183910c + ", finderContact=" + this.f183911d + ')';
    }

    public /* synthetic */ m0(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, str, (i19 & 8) != 0 ? new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa() : c19782x23db1cfa);
    }
}
