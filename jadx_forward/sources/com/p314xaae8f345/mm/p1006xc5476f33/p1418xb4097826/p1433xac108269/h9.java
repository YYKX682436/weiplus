package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class h9 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f183766a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f183767b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f183768c;

    public h9(boolean z17, boolean z18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f183766a = z17;
        this.f183767b = z18;
        this.f183768c = gVar;
    }

    /* renamed from: equals */
    public boolean m55488xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 h9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9) obj;
        return this.f183766a == h9Var.f183766a && this.f183767b == h9Var.f183767b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183768c, h9Var.f183768c);
    }

    /* renamed from: hashCode */
    public int m55489x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f183766a) * 31) + java.lang.Boolean.hashCode(this.f183767b)) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f183768c;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m55490x9616526c() {
        return "PreCheckResult(confirm=" + this.f183766a + ", fromDialog=" + this.f183767b + ", finderSecretData=" + this.f183768c + ')';
    }

    public /* synthetic */ h9(boolean z17, boolean z18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? false : z18, (i17 & 4) != 0 ? null : gVar);
    }
}
