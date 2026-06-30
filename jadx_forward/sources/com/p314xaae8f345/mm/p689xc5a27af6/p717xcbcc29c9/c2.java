package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes11.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f146910a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f146911b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f146912c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f146913d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f146914e;

    public c2(yz5.l run, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, yz5.l lVar4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(run, "run");
        this.f146910a = run;
        this.f146911b = lVar;
        this.f146912c = lVar2;
        this.f146913d = lVar3;
        this.f146914e = lVar4;
    }

    /* renamed from: equals */
    public boolean m44144xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c2)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c2 c2Var = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146910a, c2Var.f146910a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146911b, c2Var.f146911b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146912c, c2Var.f146912c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146913d, c2Var.f146913d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146914e, c2Var.f146914e);
    }

    /* renamed from: hashCode */
    public int m44145x8cdac1b() {
        int hashCode = this.f146910a.hashCode() * 31;
        yz5.l lVar = this.f146911b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.l lVar2 = this.f146912c;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        yz5.l lVar3 = this.f146913d;
        int hashCode4 = (hashCode3 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        yz5.l lVar4 = this.f146914e;
        return hashCode4 + (lVar4 != null ? lVar4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m44146x9616526c() {
        return "Task(run=" + this.f146910a + ", pause=" + this.f146911b + ", resume=" + this.f146912c + ", interrupt=" + this.f146913d + ", runWithPause=" + this.f146914e + ')';
    }
}
